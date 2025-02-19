package com.example.no_name_hochu_babok;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.no_name_hochu_babok.User.PassFlatActivity;
import com.example.no_name_hochu_babok.User.ProfileActivity;
import com.example.no_name_hochu_babok.User.SelectObjectActivity;

public class MessagesPassActivity extends AppCompatActivity {


    public void OnProfile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }

    public void OnCalendar(View view) {
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }

    public void OnObject(View view) {
        Intent intent = new Intent(this, PassFlatActivity.class);
        startActivity(intent);
    }

    public void OnMessagesPass(View view) {
        Intent intent = new Intent(this, MessagesPassActivity.class);
        startActivity(intent);
    }
    public void OnBookingPass (View view) {
        Intent intent = new Intent(this, BookingPassActivity.class);
        startActivity(intent);
    }
    public void OnSelectObject (View view) {
        Intent intent = new Intent(this, SelectObjectActivity.class);
        startActivity(intent);
    }

    public void OnSettingMessages(View view) {
        findViewById(R.id.setting_messages_pass).setVisibility(View.VISIBLE);
        findViewById(R.id.my_messages_filter_relative).setVisibility(View.INVISIBLE);
        findViewById(R.id.LineBtn1).setVisibility(View.VISIBLE);
        findViewById(R.id.LineBtn).setVisibility(View.INVISIBLE);
    }

    public void OnBackMessages(View view) {
        findViewById(R.id.my_messages_filter_relative).setVisibility(View.VISIBLE);
        findViewById(R.id.setting_messages_pass).setVisibility(View.INVISIBLE);
        findViewById(R.id.LineBtn1).setVisibility(View.INVISIBLE);
        findViewById(R.id.LineBtn).setVisibility(View.VISIBLE);


    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_messages_pass);


        Button mainButton = findViewById(R.id.all_messages);
        final LinearLayout buttonContainer = findViewById(R.id.btn_info_messages_linear);

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Button button1 = findViewById(R.id.active_bookings);
                Button button2 = findViewById(R.id.archived_bookings);



                //анимация "вылета" кнопок
                if (button1.getVisibility() == View.VISIBLE) {
                    button1.setVisibility(View.GONE);
                    button2.setVisibility(View.GONE);

                } else {

                    button1.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);


                    Animation animation = AnimationUtils.loadAnimation(MessagesPassActivity.this, R.anim.anim);
                    button1.startAnimation(animation);
                    button2.startAnimation(animation);

                }

            }
        });
        FrameLayout frame_cancelled = findViewById(R.id.frame_cancelled);
        frame_cancelled.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox checkBox = findViewById(R.id.checkbox_cancelled);
                checkBox.setChecked(!checkBox.isChecked());
            }
        });

        FrameLayout frame_completed = findViewById(R.id.frame_completed);
        frame_completed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox checkBox = findViewById(R.id.checkbox_completed);
                checkBox.setChecked(!checkBox.isChecked());
            }
        });

        FrameLayout frame_feedback = findViewById(R.id.frame_feedback);
        frame_feedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox checkBox = findViewById(R.id.checkbox_feedback);
                checkBox.setChecked(!checkBox.isChecked());
            }
        });

        FrameLayout frame_upcomin_departures = findViewById(R.id.frame_upcomin_departures);
        frame_upcomin_departures.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox checkBox = findViewById(R.id.checkbox_upcomin_departures);
                checkBox.setChecked(!checkBox.isChecked());
            }
        });

        FrameLayout frame_upcoming_arrivals = findViewById(R.id.frame_upcoming_arrivals);
        frame_upcoming_arrivals.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox checkBox = findViewById(R.id.checkbox_upcoming_arrivals);
                checkBox.setChecked(!checkBox.isChecked());
            }
        });

        FrameLayout frame_prepayment = findViewById(R.id.frame_prepayment);
        frame_prepayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox checkBox = findViewById(R.id.checkbox_prepayment);
                checkBox.setChecked(!checkBox.isChecked());
            }
        });

        FrameLayout frame_unread = findViewById(R.id.frame_unread);
        frame_unread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox checkBox = findViewById(R.id.checkbox_unread);
                checkBox.setChecked(!checkBox.isChecked());
            }
        });

        FrameLayout frame_require_action = findViewById(R.id.frame_require_action);
        frame_require_action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                CheckBox checkBox = findViewById(R.id.checkbox_require_action);
                checkBox.setChecked(!checkBox.isChecked());
            }
        });
    }

}
