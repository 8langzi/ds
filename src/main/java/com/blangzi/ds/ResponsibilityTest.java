package com.blangzi.ds.dynamic;

public class ResponsibilityTest {

    public static void main(String[] args) throws Exception {



        HandlerExecutor handlerExecutor = new HandlerExecutor();
        handlerExecutor.generateHandlers();
        handlerExecutor.generateHandlerMap();
        RequestBody requestBody = new RequestBody();
        requestBody.setData("ABCDEFGH");
        handlerExecutor.executeHandle("1",requestBody);
        handlerExecutor.executeHandle("4",requestBody);
        System.out.println("1");
    }


}
