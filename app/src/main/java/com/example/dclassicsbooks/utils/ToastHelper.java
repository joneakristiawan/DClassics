package com.example.dclassicsbooks.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.dclassicsbooks.R;

public class ToastHelper {

    public static void show(Context context,
                            String message,
                            int iconRes) {

        LayoutInflater inflater = LayoutInflater.from(context);

        View layout = inflater.inflate(
                R.layout.custom_toast,
                null
        );

        ImageView image =
                layout.findViewById(R.id.imgToast);

        TextView text =
                layout.findViewById(R.id.txtToast);

        image.setImageResource(iconRes);
        text.setText(message);

        Toast toast = new Toast(context);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}