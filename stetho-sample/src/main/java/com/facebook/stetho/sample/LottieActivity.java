package com.facebook.stetho.sample;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class LottieActivity extends AppCompatActivity {

    public static void show(Context context) {
        context.startActivity(new Intent(context, LottieActivity.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lottie);
    }

}
