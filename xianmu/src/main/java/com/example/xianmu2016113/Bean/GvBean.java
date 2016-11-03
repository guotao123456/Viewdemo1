package com.example.xianmu2016113.Bean;

/**
 * Created by Administrator on 2016/11/3.
 */
public class GvBean {
    public   int res;
    public   String text;

    public GvBean(int res, String text) {
        this.res = res;
        this.text = text;
    }

    @Override
    public String toString() {
        return "GvBean{" +
                "res=" + res +
                ", text='" + text + '\'' +
                '}';
    }
}
