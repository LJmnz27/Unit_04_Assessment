package org.pursuit.unit_04_assessment.views;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.pursuit.unit_04_assessment.models.MessageItem;

public class EchinodermsViewHolder extends RecyclerView.ViewHolder {
    private static final String TAG = "image_call";
    private SharedPreferences sharedPreferences;
    private TextView echinodermsTextView;
    private Intent intent;
    private ImageView imageView;


    public EchinodermsViewHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind (String echinoderm){
        MessageItem messageItem = new MessageItem();
        echinodermsTextView.setText(echinoderm);
        Picasso.get().load(messageItem.getImage()).into(imageView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}
