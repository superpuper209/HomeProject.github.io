package com.example.no_name_hochu_babok.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.no_name_hochu_babok.R;

public class RegisteredBookingActivity extends AppCompatActivity {
    public void OnHeart(View view) {
        Intent intent = new Intent(this,  RegisteredHeartActivity.class);
        startActivity(intent);
    }
    public void OnSearch(View view) {
        Intent intent = new Intent(this,  MainActivity.class);
        startActivity(intent);
    }
    public void OnBooking(View view) {
        Intent intent = new Intent(this,  RegisteredBookingActivity.class);
        startActivity(intent);
    }
    public void OnMessages(View view) {
        Intent intent = new Intent(this,  RegisteredMessagesActivity.class);
        startActivity(intent);
    }
    public void OnProfile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
    public void goCity(View view) {
        Intent intent = new Intent(this, City.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_registered_booking);


    }
}