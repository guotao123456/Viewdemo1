package com.example.xianmu2016113;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.xianmu2016113.Bean.GvBean;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/3.
 */
public class GvAdapter extends BaseAdapter {
    private  ArrayList<GvBean> gvlist;
    private  Context context;

    public GvAdapter(ArrayList<GvBean> gvlist, Context context) {
        this.gvlist=gvlist;
        this.context=context;
    }
    @Override
    public int getCount() {
        return gvlist.size();
    }
    @Override
    public Object getItem(int i) {
        return gvlist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
           View v=View.inflate(context,R.layout.gv_item,null);
           ImageView iv= (ImageView) v.findViewById(R.id.iv);
           TextView tv= (TextView) v.findViewById(R.id.tv);
           iv.setImageResource(gvlist.get(i).res);
           tv.setText(gvlist.get(i).text);
        return v;
    }
}
