package com.atguigu.springcloud.entities;

import com.atguigu.springcloud.entities.service.Request;

public class demo {
    public static void main(String[] args) {
        Request request = new Request();
        request.setStr("空格 X");
        boolean space_x = request.equals("space X");
        System.out.println(space_x);
//        demo demo = new demo();
//        int i = demo.myAtoi("words and 987");
//        System.out.println(i);

    }

    public boolean equals(Object obj) {
        if (obj =="空格 X"){
            obj ="space X";
        }
        return this==obj;
    }

}
