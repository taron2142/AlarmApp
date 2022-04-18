package com.example.alarmapp.bindingAdapters;

import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Log;
import android.widget.TextView;

import androidx.databinding.BindingAdapter;

public class EditTextBindingAdapter {
    @BindingAdapter({"app:soundTitle"})
    public static void soundTitle(TextView textView, String soundPath) {
        Uri soundUri = Uri.parse(soundPath);
        String title = soundUri.getQueryParameter("title");
        textView.setText(title != null?title:"Default Sound");

    }
}
