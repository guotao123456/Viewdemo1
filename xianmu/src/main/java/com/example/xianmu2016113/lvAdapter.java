package com.example.xianmu2016113;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.xianmu2016113.Bean.lvBean;
import java.util.ArrayList;

/**
 * Created by Administrator on 2016/11/3.
 */
public class lvAdapter extends BaseAdapter {
     private  ArrayList<lvBean> lvlist;
     private  Context context;
    public lvAdapter(ArrayList<lvBean> lvlist, Context context) {
        this.lvlist=lvlist;
        this.context=context;
    }

    @Override
    public int getCount() {
        return lvlist.size();
    }

    @Override
    public Object getItem(int i) {
        return lvlist.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if(convertView==null)
        {
           convertView=View.inflate(context,R.layout.lv_item,null);
            holder=new ViewHolder();
            holder.image= (ImageView) convertView.findViewById(R.id.image);
            holder.tv01= (TextView) convertView.findViewById(R.id.tv01);
            holder.tv02= (TextView) convertView.findViewById(R.id.tv02);
            convertView.setTag(holder);
        }else {
            holder= (ViewHolder) convertView.getTag();
        }
           holder.image.setImageResource(lvlist.get(position).id);
           holder.tv01.setText(lvlist.get(position).title);
           holder.tv02.setText(lvlist.get(position).text);
        return convertView;
    }
       static  class ViewHolder{
         ImageView image;
           TextView tv01,tv02;
       }

}
