package com.example.lucas.gridimage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by lucas on 07/04/2016.
 */
public class ImageAdapter extends BaseAdapter {

    private Context myContext;

    //Keep all images in array
    public Integer[] arrayID = {
            R.drawable.flower, R.drawable.forest,
            R.drawable.tiger, R.drawable.milkyway,
            R.drawable.moon, R.drawable.paris,
            R.drawable.sky, R.drawable.stones,
            R.drawable.water, R.drawable.earth,
            R.drawable.lion, R.drawable.nemo
    };

    public ImageAdapter (Context c){
        myContext = c;
    }

    @Override
    public int getCount() {
        return arrayID.length;
    }

    @Override
    public Object getItem(int position) {
        return arrayID[position];
    }

    @Override
    public long getItemId(int position) { return 0;}

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(myContext);
        imageView.setImageResource(arrayID[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(150,150));
        return imageView;
    }

}
