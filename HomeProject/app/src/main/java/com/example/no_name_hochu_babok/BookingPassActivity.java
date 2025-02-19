package com.example.no_name_hochu_babok;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.no_name_hochu_babok.User.MainActivity;
import com.example.no_name_hochu_babok.User.PassFlatActivity;
import com.example.no_name_hochu_babok.User.ProfileActivity;
import com.example.no_name_hochu_babok.User.SelectObjectActivity;

public class BookingPassActivity extends AppCompatActivity {


    public void OnProfile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
    public void OnCalendar (View view) {
        Intent intent = new Intent(this, CalendarActivity.class);
        startActivity(intent);
    }
    public void OnObject (View view) {
        Intent intent = new Intent(this, PassFlatActivity.class);
        startActivity(intent);
    }
    public void OnMessagesPass (View view) {
        Intent intent = new Intent(this, MessagesPassActivity.class);
        startActivity(intent);
    }
    public void OnSelectObject (View view) {
        Intent intent = new Intent(this, SelectObjectActivity.class);
        startActivity(intent);
    }
    public void OnFilter(View view) {
        findViewById(R.id.my_object_relative).setVisibility(View.INVISIBLE);
        findViewById(R.id.filter_relative).setVisibility(View.VISIBLE);
        findViewById(R.id.LineBtn).setVisibility(View.INVISIBLE);
        findViewById(R.id.LineBtn1).setVisibility(View.VISIBLE);

    }
    public void OnBackFilter(View view) {
        findViewById(R.id.my_object_relative).setVisibility(View.VISIBLE);
        findViewById(R.id.filter_relative).setVisibility(View.INVISIBLE);
        findViewById(R.id.LineBtn).setVisibility(View.VISIBLE);
        findViewById(R.id.LineBtn1).setVisibility(View.INVISIBLE);

    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_booking_pass);



        Button CreationBtn = findViewById(R.id.creation_btn_object);
        Button CheckInBtn = findViewById(R.id.check_in_btn_object);
        Button DepartureBtn = findViewById(R.id.departure_btn_object);




        CreationBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CreationBtn.setBackgroundColor(getResources().getColor(R.color.color_state_list_button));

                if (CreationBtn.isPressed()) {

                    CreationBtn.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.active_color1));
                    CheckInBtn.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.inactive_color1));
                    DepartureBtn.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.inactive_color1));

                    CheckInBtn.setPressed(false);
                    DepartureBtn.setPressed(false);

                }

            }
        });

        CheckInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CreationBtn.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.inactive_color1));
                CheckInBtn.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.active_color1));
                DepartureBtn.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.inactive_color1));

               CreationBtn.setPressed(false);
               DepartureBtn.setPressed(false);
            }
        });

        DepartureBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                CreationBtn.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.inactive_color1));
                CheckInBtn.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.inactive_color1));
                DepartureBtn.setBackgroundColor(ContextCompat.getColor(v.getContext(), R.color.active_color1));

                CreationBtn.setPressed(false);
                CheckInBtn.setPressed(false);
            }
        });



        CheckBox checkbox_prepayment = findViewById(R.id.checkbox_prepayment);
        checkbox_prepayment.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        CheckBox checkbox_upcoming_arrivals = findViewById(R.id.checkbox_upcoming_arrivals);
        checkbox_upcoming_arrivals.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        CheckBox checkbox_upcomin_departures = findViewById(R.id.checkbox_upcomin_departures);
        checkbox_upcomin_departures.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        CheckBox checkbox_feedback = findViewById(R.id.checkbox_feedback);
        checkbox_feedback.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        CheckBox checkbox_completed = findViewById(R.id.checkbox_completed);
        checkbox_completed.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        CheckBox checkbox_cancelled = findViewById(R.id.checkbox_cancelled);
        checkbox_cancelled.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));


        Button arrows_btn_booking = findViewById(R.id.arrows_btn_booking);

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


        Button mainButton = findViewById(R.id.arrows_btn_booking);
        final LinearLayout buttonContainer = findViewById(R.id.btn_info_linear);

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button button1 = findViewById(R.id.old_ones);
                Button button2 = findViewById(R.id.check_in_date_ascending);
                Button button3 = findViewById(R.id.check_in_date_descending);
                Button button4 = findViewById(R.id.departure_date_in_ascending);
                Button button5 = findViewById(R.id.departure_date_descending);


                if (button1.getVisibility() == View.VISIBLE) {
                    button1.setVisibility(View.GONE);
                    button2.setVisibility(View.GONE);
                    button3.setVisibility(View.GONE);
                    button4.setVisibility(View.GONE);
                    button5.setVisibility(View.GONE);
                } else {

                    button1.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);
                    button4.setVisibility(View.VISIBLE);
                    button5.setVisibility(View.VISIBLE);


                    Animation animation = AnimationUtils.loadAnimation(BookingPassActivity.this, R.anim.anim);
                    button1.startAnimation(animation);
                    button2.startAnimation(animation);
                    button3.startAnimation(animation);
                    button4.startAnimation(animation);
                    button5.startAnimation(animation);


                }
            }
        });

    }
}