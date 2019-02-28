package org.pursuit.unit_04_assessment.views;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import org.pursuit.unit_04_assessment.R;
import org.pursuit.unit_04_assessment.SecondActivity;
import org.pursuit.unit_04_assessment.models.MessageItem;

public class EchinodermsViewHolder extends RecyclerView.ViewHolder {
    private static final String TAG = "image_call";
    private SharedPreferences sharedPreferences;
    private TextView echinodermsTextView;
    private Context context;
    private ImageView imageView;


    public EchinodermsViewHolder(@NonNull View itemView) {
        super(itemView);
        sharedPreferences = itemView.getContext().getApplicationContext().getSharedPreferences(TAG, Context.MODE_PRIVATE);
        echinodermsTextView = itemView.findViewById(R.id.echinoderms_text_view);
        imageView = itemView.findViewById(R.id.echinoderms_image_view);
        context = itemView.getContext();
    }

    public void onBind (final String echinoderm){
        MessageItem messageItem = new MessageItem();
        echinodermsTextView.setText(echinoderm);
        Picasso.get().load(messageItem.getImage()).into(imageView);
        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              Intent intent = new Intent(context, SecondActivity.class);
              context.startActivity(intent);
              intent.putExtra("echinoderm",echinoderm);

            }
        });
    }
}
