package com.example.rv_rt1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Information_Activity extends AppCompatActivity {
    ImageView photo2;
    TextView title2,info2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_information_);
        photo2=(ImageView)findViewById(R.id.img_2);
        title2=(TextView)findViewById(R.id.title_2);
        info2=(TextView)findViewById(R.id.infor_2);

        photo2.setImageResource(getIntent().getIntExtra("Photo",0));
        title2.setText(getIntent().getStringExtra("Title"));
        info2.setText(getIntent().getStringExtra("Information"));

    }
}