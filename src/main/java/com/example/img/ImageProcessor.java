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

    public ImageProcessor(String url,String world) {
        this.url = url;
        this.word = world;
        this.pipeline = new SougouImgPipeline();
        this.dataList = new ArrayList<>();
        this.urlList = new ArrayList<>();
    }

    public void process(int idx, int size) {
        RestTemplate restTemplate=new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        headers.add("Accept-Language","zh-CN,zh;q=0.8,zh-TW;q=0.7,zh-HK;q=0.5,en-US;q=0.3,en;q=0.2");
        headers.add("Connection","keep-alive");
        headers.add("User-Agent","Mozilla/5.0 (X11; Linux x86_64; rv:60.0) Gecko/20100101 Firefox/60.0");
        headers.add("Upgrade-Insecure-Requests","1");
        HttpEntity<String> requestEntity = new HttpEntity<>(null, headers);
        ResponseEntity<String> responseEntity = restTemplate.exchange(url.toString(), HttpMethod.GET,requestEntity,String.class);
        if(responseEntity.getStatusCodeValue()== HttpStatus.SC_OK){
            JSONObject jsonObject=JSONObject.parseObject(responseEntity.getBody());
            JSONArray items = ((JSONArray)jsonObject.get("data"));
            for(Object item : items){
                JSONObject jsonObject1= (JSONObject) item;
                this.urlList.add(jsonObject1.getString("middleURL"));
            }
            this.dataList.add(items);
        }else{
            System.out.println("请求失败");
        }

    }

    // 下载
    public void pipelineData(){
        // 多线程
        pipeline.processSync(this.urlList, this.word);
    }


    public static void main(String[] args) {


        String world="彭于晏";
        StringBuilder url = new StringBuilder("https://image.baidu.com/search/acjson?");
        url.append("charset=UTF-8");
        url.append("&tn=resultjson_com");
        url.append("&ipn=rj");
        url.append("&ct=201326592");
        url.append("&fp=result");
        url.append("&cl=2");
        url.append("&lm=-1");//动图
        url.append("&ie=utf-8");
        url.append("&oe=utf-8");
        url.append("&st=-1");
        url.append("&ic=0");
        url.append("&istype=2");
        url.append("&qc=");
        url.append("&nc=1");
        url.append("&pn=0");
        url.append("&rn=10");//每页数量
        url.append("&word=");
        url.append(world);






        ImageProcessor processor = new ImageProcessor(url.toString(),world);

        int start = 0, size = 10, limit = 1; // 定义爬取开始索引、每次爬取数量、总共爬取数量

        for(int i=start;i<start+limit;i+=size)
            processor.process(i, size);

        processor.pipelineData();

    }
}
