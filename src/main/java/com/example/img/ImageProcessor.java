package com.example.img;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.img.dto.SougouImgPipeline;
import org.apache.http.HttpStatus;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

public class ImageProcessor {


    private String url;
    private SougouImgPipeline pipeline;
    private List<JSONArray> dataList;
    private List<String> urlList;
    private String word;

    public ImageProcessor(String url, String world) {
        this.url = url;
        this.word = world;
        this.pipeline = new SougouImgPipeline();
        this.dataList = new ArrayList<>();
        this.urlList = new ArrayList<>();
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void process() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept-Language", "zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
        headers.add("Connection", "keep-alive");
        headers.add("User-Agent", "Mozilla/5.0 (X11; Linux x86_64; rv:60.0) Gecko/20100101 Firefox/60.0");
        headers.add("Upgrade-Insecure-Requests", "1");
        HttpEntity<String> requestEntity = new HttpEntity<>(null, headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url.toString(), HttpMethod.GET, requestEntity, String.class);
        if (responseEntity.getStatusCodeValue() == HttpStatus.SC_OK) {
            JSONObject jsonObject = JSONObject.parseObject(responseEntity.getBody());
            JSONArray items = ((JSONArray) jsonObject.get("data"));
            for (Object item : items) {
                JSONObject jsonObject1 = (JSONObject) item;
                this.urlList.add(jsonObject1.getString("middleURL"));
            }
            this.dataList.add(items);
        } else {
            System.out.println("????????????");
        }

    }

    // ??????
    public void pipelineData() {
        // ?????????
        pipeline.processSync(this.urlList, this.word);
    }


    public static void main(String[] args) {
        String baseUrl = "https://image.baidu.com/search/acjson?";
        String world = "?????????";
        StringBuilder url = new StringBuilder(baseUrl);
        url.append("charset=UTF-8");
        url.append("&tn=resultjson_com");
        url.append("&ipn=rj");
        url.append("&ct=201326592");
        url.append("&fp=result");
        url.append("&cl=2");
        url.append("&lm=-1");
        url.append("&ie=utf-8");
        url.append("&oe=utf-8");
        url.append("&st=-1");
        url.append("&ic=0");
        url.append("&istype=2");
        url.append("&qc=");
        url.append("&nc=1");
        url.append("&word=");
        url.append(world);
        int current;
        int end = 0;
        ImageProcessor processor = new ImageProcessor(url.toString(), world);
        for (int i = 1; i <= 10; i++) {
            current = 60 * i;
            end += 30;
            url.append("&pn=").append(end);// ????????????
            url.append("&rn=").append(current);//??????????????????
            processor.setUrl(url.toString());
            processor.process();
        }
        processor.pipelineData();

    }
}
