package com.emredogan.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/**
 * Created by emredogan on 13/03/2018.
 */

public class ViewHolder extends RecyclerView.ViewHolder {

    public ImageView image;
    public TextView name;
    public TextView desc;
    public LinearLayout linearLayout;


    public ViewHolder(View itemView) {
        super(itemView);

        image = (ImageView) itemView.findViewById(R.id.imageview_id);
        name = (TextView) itemView.findViewById(R.id.name_textview);
        desc = (TextView) itemView.findViewById(R.id.description_textview);
        linearLayout = (LinearLayout) itemView.findViewById(R.id.recycleritem_id);
    }
}
