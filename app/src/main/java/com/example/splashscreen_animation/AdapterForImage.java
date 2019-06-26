package com.example.splashscreen_animation;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class AdapterForImage extends BaseAdapter {
    private Context mContext;
    public AdapterForImage(Context c) {
        mContext = c;
    }
    @Override
    public int getCount() {
        return phoneimages.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView=new ImageView(mContext);
        imageView.setLayoutParams(new GridView.LayoutParams(300,300));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(10,10,10,10);
        imageView.setImageResource(phoneimages[0]);
        return imageView;
    }
    public Integer[] phoneimages={
            R.drawable.one,R.drawable.two,
            R.drawable.three,R.drawable.four,
            R.drawable.five,R.drawable.six,
            R.drawable.seven,R.drawable.eight,
            R.drawable.nine,R.drawable.ten,

    };
}
