package com.example.xianmu2016113.Bean;

/**
 * Created by Administrator on 2016/11/3.
 */
public class lvBean {
      public  int  id;
      public String title;
      public String text;

    public lvBean(int id, String title, String text) {
        this.id = id;
        this.title = title;
        this.text = text;
    }

    @Override
    public String toString() {
        return "lvBean{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", text='" + text + '\'' +
                '}';
    }
}
