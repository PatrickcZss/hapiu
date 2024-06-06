package com.atguigu.springcloud.entities.service;

import lombok.Data;

@Data
public class Request {

    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public boolean equals(Object obj) {
        if (this.getStr() =="空格 X"){
            this.setStr("space X");
        }
        return (this.getStr()==(String)obj);
    }
}
