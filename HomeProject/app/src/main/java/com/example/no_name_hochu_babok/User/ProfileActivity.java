package com.example.no_name_hochu_babok.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.no_name_hochu_babok.R;

public class ProfileActivity extends AppCompatActivity {

    public void OnProfileSetting(View view) {
        Intent intent = new Intent(this, ProfileSettingActivity.class);
        startActivity(intent);
    }

    public void OnPass(View view) {
        Intent intent = new Intent(this, PassFlatActivity.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile);



    }
}

