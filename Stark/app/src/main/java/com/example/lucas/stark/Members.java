package com.example.lucas.stark;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

/**
 * Created by lucas on 02/05/2016.
 */
public class Members extends BaseAdapter {

    private Activity MyActivity;

    public int[] comprobacion = {
            0,0,0,0,0,0,0,0,0,0,0
    };

    String[] members = {
            "Sansa Stark", "Arya Stark", "Benjen Stark", "Rickard Stark", "Brandon Stark",
             "Lyanna Stark", "Eddard Stark", "King Robb Stark", "Talisa Stark", "Catelyn Stark", "Jon Snow"
    };

    public Members(Activity c){
        MyActivity = c;
    }

    @Override
    public int getCount() {
        return members.length;
    }

    @Override
    public Object getItem(int position) {
        return members[position];
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //inflater.inflate(R.layout.list_design, null);

        LayoutInflater inflater = MyActivity.getLayoutInflater();

        View layout = inflater.inflate(R.layout.list_design, null);
        TextView name = (TextView) layout.findViewById(R.id.name);
        name.setText(members[position]);

        return layout;
    }

}
