
package com.example.demopatterns.adapter;

import com.example.demopatterns.adapter.controller.impl.AnnotationController;
import com.example.demopatterns.adapter.handler.HandlerAdapter;
import com.example.demopatterns.adapter.handler.impl.AnnotationRequestHandlerAdapter;
import com.example.demopatterns.adapter.handler.impl.HttpRequestHandlerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * clicent 客户端
 */
public class DispatchServlet {

    private List<HandlerAdapter> handlerAdapters;

    public DispatchServlet(){
        handlerAdapters=new ArrayList<>();
        handlerAdapters.add(new AnnotationRequestHandlerAdapter());
        handlerAdapters.add(new HttpRequestHandlerAdapter());
    }

    public void dispatcher(){
        AnnotationController annotationController=new AnnotationController();


        HandlerAdapter handlerAdapter=getHandlerAdapter(annotationController);
        handlerAdapter.handler(annotationController);
    }

    private HandlerAdapter getHandlerAdapter(AnnotationController annotationController) {
        if(!handlerAdapters.isEmpty()){
            for (HandlerAdapter x: handlerAdapters) {
                if(x.supports(annotationController)){
                    return x;
                }
            }
        }
        return null;
    }

    public static void main(String[] args) {
        new DispatchServlet().dispatcher();
    }
}
