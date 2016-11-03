package com.example.xianmu2016113;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.GridView;
import android.widget.ListView;

import com.example.xianmu2016113.Bean.GvBean;
import com.example.xianmu2016113.Bean.lvBean;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private GridView gridView;
    private ArrayList<GvBean> gvlist;
    private ArrayList<lvBean> lvlist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initGV();
        initDate();

    }
     //初始化数据
    private void initGV() {
        gvlist =  new ArrayList<GvBean>();
        gvlist.add(new GvBean(R.mipmap.gv1,"作家协会"));
        gvlist.add(new GvBean(R.mipmap.gv2,"美术家协会"));
        gvlist.add(new GvBean(R.mipmap.gv3,"杂技家协会"));
        gvlist.add(new GvBean(R.mipmap.gv4,"戏剧家协会"));
        gvlist.add(new GvBean(R.mipmap.gv5,"舞蹈家协会"));
        gvlist.add(new GvBean(R.mipmap.gv6,"音乐家协会"));
        gvlist.add(new GvBean(R.mipmap.gv7,"曲艺家协会"));
        gvlist.add(new GvBean(R.mipmap.gv8,"民间文艺家协会"));
        gvlist.add(new GvBean(R.mipmap.gv9,"书法家协会"));
        gvlist.add(new GvBean(R.mipmap.gv10,"电影家协会"));
        gvlist.add(new GvBean(R.mipmap.gv11,"摄影家协会"));
        gvlist.add(new GvBean(R.mipmap.gv12,"电视艺术家协会"));
        gvlist.add(new GvBean(R.mipmap.gv13,"评论家协会"));
        gvlist.add(new GvBean(R.mipmap.gv14,"飞天家协会"));
        gvlist.add(new GvBean(R.mipmap.gv1,"文学院"));
        gvlist.add(new GvBean(R.mipmap.gv2,"理论研究室"));

        //listView数据
        lvlist =  new ArrayList<lvBean>();
        lvlist.add(new lvBean(R.mipmap.a ,"第四届“甘肃黄河文学奖“拟获奖名单公示","2016-10-17"));
        lvlist.add(new lvBean(R.mipmap.a,"叶舟获得第六届鲁迅文学奖","2016-10-17"));
        lvlist.add(new lvBean(R.mipmap.a ,"第五届甘肃黄河文学奖获奖名单","2016-10-17"));
        lvlist.add(new lvBean(R.mipmap.a ,"第三届中国西北音乐节圆满闭幕","2016-10-17"));
        lvlist.add(new lvBean(R.mipmap.a ,"第四届“甘肃黄河文学奖“拟获奖名单公示","2016-10-17"));
        lvlist.add(new lvBean(R.mipmap.a ,"第四届“甘肃黄河文学奖“拟获奖名单公示","2016-10-17"));
        lvlist.add(new lvBean(R.mipmap.a ,"第四届“甘肃黄河文学奖“拟获奖名单公示","2016-10-17"));
    }
    //初始化控件
    private void initDate() {
        listView = (ListView) findViewById(R.id.listView);
        gridView = (GridView) findViewById(R.id.gridView);
       // ((ScrollView) findViewById(R.id.scrollView)).smoothScrollTo(0,0);
        //为GridView设置适配器
        gridView.setAdapter(new GvAdapter(gvlist,MainActivity.this));
        listView.setAdapter(new lvAdapter(lvlist,MainActivity.this));



    }
}
