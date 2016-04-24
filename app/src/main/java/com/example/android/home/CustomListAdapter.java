package com.example.android.home;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by aswin on 23/4/16.
 */

public class CustomListAdapter extends BaseAdapter {

    private Activity activity;
    private LayoutInflater inflater;
    private ArrayList<Flats> flats;


    public CustomListAdapter(Activity activity, ArrayList<Flats> flats) {
        this.activity = activity;
        this.flats = flats ;
    }

    @Override
    public int getCount() {
        return flats.size();
    }

    @Override
    public Object getItem(int position) {
        return flats.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {



        if (inflater == null)
            inflater = (LayoutInflater) activity
                    .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (convertView == null)
            convertView = inflater.inflate(R.layout.list_item, null);


        ImageView image = (ImageView) convertView.findViewById(R.id.image);
        TextView flat_name = (TextView)convertView.findViewById(R.id.flat_name);
        TextView aminities = (TextView)convertView.findViewById(R.id.aminities);
        TextView place = (TextView)convertView.findViewById(R.id.price);
        TextView price = (TextView)convertView.findViewById(R.id.price);
        TextView area = (TextView)convertView.findViewById(R.id.area);
        TextView on_built = (TextView)convertView.findViewById(R.id.onbuilt);
        TextView age = (TextView)convertView.findViewById(R.id.age);
        ImageView cancel = (ImageView)convertView.findViewById(R.id.cancel);
        final ImageView extra = (ImageView)convertView.findViewById(R.id.extra);
        final RelativeLayout relativeLayout = (RelativeLayout)convertView.findViewById(R.id.relative);

        image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setVisibility(View.VISIBLE);

            }
        });

        cancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout.setVisibility(View.GONE);
            }
        });


        Flats m = flats.get(position);

        extra.setImageResource(m.getExtra());
        image.setImageResource(m.getImage());
        flat_name.setText(m.getFlat_name());
        aminities.setText(m.getAminities());
        place.setText(m.getPlace());
        price.setText("Rs " + m.getPrice() + " Lacs");
        area.setText(m.getArea()+ " sqft");
        on_built.setText("Rs "+ m.getOnbuilt()+ " k/sqft");
        age.setText(m.getAge()+ " years");


        return convertView;

    }
}
