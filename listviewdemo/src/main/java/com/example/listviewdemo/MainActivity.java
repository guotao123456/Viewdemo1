package com.example.listviewdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ScrollView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private List<Data> listMain;
    private ListView lv;
    private Button bt01;
    private Button bt02;
    private Button bt03;
    private MyAdapter adapter;
    private boolean isHide = false;
    private Button mAll,mNo,mHide;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         
        initData();
        initView();


    }



    //初始化控件
    private void initView() {
        bt01 = (Button) findViewById(R.id.bt01);
        bt02 = (Button) findViewById(R.id.bt02);
        bt03 = (Button) findViewById(R.id.bt03);
        lv = (ListView) findViewById(R.id.listview);

        ((ScrollView) findViewById(R.id.scrollView)).smoothScrollTo(0,0);


        adapter = new MyAdapter(listMain,this,false);
        lv.setAdapter(adapter);
        bt01.setOnClickListener(this);
        bt02.setOnClickListener( this);
        bt03.setOnClickListener( this);



    }
      //初始化数据
    private void initData() {
      listMain=new ArrayList<>();
        for (int i=0;i<20;i++)
        {
            Data data=new Data();
            data.index=i;
            data.text="篮球是最好的发泄运动";
            listMain.add(data);

        }
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.bt01:
                check(true);
                break;
            case R.id.bt03:
                check(false);
                break;
            case R.id.bt02:
                isHide = isHide==true?false:true;
                hide(isHide);
                break;

        }

    }
    private void hide(boolean isHide) {
        Button btn = (Button)findViewById(R.id.bt02);
        if(isHide)
            btn.setText("取消隐藏");
        else
            btn.setText("隐藏已选");

        adapter.setHide(isHide);
        adapter.check();
    }


    private void check(boolean flag) {
        for (Data data: listMain)
            data.isCheck = flag;
        adapter.check();
    }
}
