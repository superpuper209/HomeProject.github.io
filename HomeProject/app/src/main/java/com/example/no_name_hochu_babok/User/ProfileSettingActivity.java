package com.example.no_name_hochu_babok.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

import com.example.no_name_hochu_babok.BookingPassActivity;
import com.example.no_name_hochu_babok.R;

public class ProfileSettingActivity extends AppCompatActivity {
    public void OnNotifications(View view) {
        findViewById(R.id.setting_notifications_layout).setVisibility(View.VISIBLE);
        findViewById(R.id.setting_btn).setVisibility(View.INVISIBLE);
    }
    public void OnBackNotifications(View view) {
        findViewById(R.id.setting_notifications_layout).setVisibility(View.INVISIBLE);
        findViewById(R.id.setting_btn).setVisibility(View.VISIBLE);
        //ктопка выхода из уведомлений
    }

    public void OnContacts(View view) {
        findViewById(R.id.add_contacts).setVisibility(View.VISIBLE);
        findViewById(R.id.setting_btn).setVisibility(View.INVISIBLE);

    }
    public void OnBackContacts(View view) {
        findViewById(R.id.add_contacts).setVisibility(View.INVISIBLE);
        findViewById(R.id.setting_btn).setVisibility(View.VISIBLE);
        //кнопка выхода из контактов
    }

    public void OnTimeZone(View view) {
        findViewById(R.id.time_zone_layout).setVisibility(View.VISIBLE);
        findViewById(R.id.setting_btn).setVisibility(View.INVISIBLE);
    }
    public void OnBackTimeZone(View view) {
        findViewById(R.id.time_zone_layout).setVisibility(View.INVISIBLE);
        findViewById(R.id.setting_btn).setVisibility(View.VISIBLE);
        //кнопка выхода из часового пояса
    }


    public void OnBackSetting(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
        //кнопка выхода из активити настроек
    }
    public void OnEditProfile(View view) {
        Intent intent = new Intent(this, EditingProfileActivity.class);
        startActivity(intent);
        //кнопка выхода из активити настроек
    }
    public void OnPasswordSecurity(View view) {
        Intent intent = new Intent(this, PasswordSecurityActivity.class);
        startActivity(intent);
        //кнопка выхода из активити настроек
    }
    public void OnDataManagement(View view) {
        Intent intent = new Intent(this, DataManagementActivity.class);
        startActivity(intent);
        //кнопка выхода из активити настроек
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_profile_setting);




        Button mainButton = findViewById(R.id.account_management_btn);
        final LinearLayout buttonContainer = findViewById(R.id.linear_account_management);

        mainButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Button button1 = findViewById(R.id.editing_profile_bnt);
                Button button2 = findViewById(R.id.password_security_bnt);
                Button button3 = findViewById(R.id.data_management_btn);
                Button button4 = findViewById(R.id.leave_account_bnt);



                if (button1.getVisibility() == View.VISIBLE) {
                    button1.setVisibility(View.GONE);
                    button2.setVisibility(View.GONE);
                    button3.setVisibility(View.GONE);
                    button4.setVisibility(View.GONE);

                } else {

                    button1.setVisibility(View.VISIBLE);
                    button2.setVisibility(View.VISIBLE);
                    button3.setVisibility(View.VISIBLE);
                    button4.setVisibility(View.VISIBLE);


                    Animation animation = AnimationUtils.loadAnimation(ProfileSettingActivity.this, R.anim.anim);
                    button1.startAnimation(animation);
                    button2.startAnimation(animation);
                    button3.startAnimation(animation);
                    button4.startAnimation(animation);

                }
            }
        });



    }
}