package tk.lucassalinas.tanglebrain;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by lucas on 18/05/2016.
 */
public class ImageAdapter extends BaseAdapter {

    private Context myContext;

    // DDBB
    private MySQLiteHelper db;

    //Keep all images in array
    public Integer[] arrayID = {
            R.drawable.level1, R.drawable.level2, R.drawable.level3,
            R.drawable.level4, R.drawable.level5, R.drawable.level6,
    };

    public ImageAdapter (Context c){
        myContext = c;
        db = new MySQLiteHelper(c);
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

    @Override
    public boolean areAllItemsEnabled(){
        return true;
    }

    @Override
    public boolean isEnabled(int position) {

        if(position == 0){
            return true;
        } else if (position == 1 && db.getScore(1).getScore() >= 1000){
            return true;
        } else if (position == 2 && db.getScore(2).getScore() >= 11000){
            return true;
        } else if (position == 3 && db.getScore(3).getScore() >= 120000){
            return true;
        } else if (position == 4 && db.getScore(4).getScore() >= 260000){
            return true;
        } else if (position == 5 && db.getScore(5).getScore() >= 840000){
            return true;
        } else {
            return false;
        }
    }
}
