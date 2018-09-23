package com.salah.gymclubmanagment.activities;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import com.salah.gymclubmanagment.R;


/**
 * Created by s.lachi on 15/05/2018.
 */

public class ListAthletesAdapter extends BaseAdapter{

    private Context context ;

    public ListAthletesAdapter(Context context) {
        this.context = context;
    }

    @Override
    public int getCount() {
        return 20;
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
        LayoutInflater inflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.item_list_athletes, null);

        TextView tv_credit = (TextView) view.findViewById(R.id.tv_credit);
        ImageView iv_check = (ImageView) view.findViewById(R.id.iv_check);
        ImageView iv_profil = (ImageView) view.findViewById(R.id.iv_profil);

        if( position % 4 == 0 ){
            tv_credit.setVisibility(View.GONE);
            iv_check.setVisibility(View.VISIBLE);
        }
        if( position % 3 == 0 ){
            tv_credit.setVisibility(View.GONE);
            iv_check.setVisibility(View.VISIBLE);
        }

        if( position % 6 == 0 ){
            iv_profil.setImageDrawable(context.getDrawable(R.drawable.lazar));
        }
        return view;
    }
}
