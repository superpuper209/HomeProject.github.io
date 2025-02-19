package com.example.no_name_hochu_babok.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.no_name_hochu_babok.BookingPassActivity;
import com.example.no_name_hochu_babok.CalendarActivity;
import com.example.no_name_hochu_babok.MessagesPassActivity;
import com.example.no_name_hochu_babok.CeationObject.NewAnnouncementActivity;
import com.example.no_name_hochu_babok.R;

public class PassFlatActivity extends AppCompatActivity {
    public void OnMessagesPass (View view) {
        Intent intent = new Intent(this, MessagesPassActivity.class);
        startActivity(intent);
    }

    public void OnProfile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
    public void OnCalendar (View view) {
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }

    public void OnInstruction(View view) {
        findViewById(R.id.my_object_relative).setVisibility(View.INVISIBLE);
        findViewById(R.id.info_my_object).setVisibility(View.VISIBLE);
    }

    public void OnLeaveInstruction(View view) {
        findViewById(R.id.my_object_relative).setVisibility(View.VISIBLE);
        findViewById(R.id.info_my_object).setVisibility(View.INVISIBLE);
    }
    public void OnBookingPass (View view) {
        Intent intent = new Intent(this, BookingPassActivity.class);
        startActivity(intent);
    }

    public void OnAnnouncement (View view) {
        Intent intent = new Intent(this, NewAnnouncementActivity.class);
        startActivity(intent);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_pass_flat);

    }
}

