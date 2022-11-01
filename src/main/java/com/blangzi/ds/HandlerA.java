package com.blangzi.ds.dynamic;



public class HandlerA extends Handler {

    private String[] type = new String[]{"1","2","3","a","b","c","e","f"};
    public String[] getType() {
        return type;
    }

    public void setType(String[] type) {
        this.type = type;
    }

    @Override
    public void handle(RequestBody requestBody) {
        if(requestBody == null){
            return;
        }
        System.out.println("HandlerA 执行开始 ==== " + requestBody.getData() );
        requestBody.setData(requestBody.getData().replace("A",""));
        System.out.println("HandlerA 执行结束 ==== " + requestBody.getData());
    }
}
