package com.example.no_name_hochu_babok.User;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.no_name_hochu_babok.R;
import com.google.firebase.annotations.concurrent.Background;
import com.google.firebase.database.collection.LLRBNode;
import com.rey.material.widget.Button;

public class DataManagementActivity extends AppCompatActivity {
    public void OnDeleteAccept(View view) {
        findViewById(R.id.information_relativelayout_data_management).setVisibility(View.INVISIBLE);
        findViewById(R.id.information_relativelayout_delete_account_accept).setVisibility(View.VISIBLE);
    }

    public void OnCancelAccept(View view) {
        findViewById(R.id.information_relativelayout_delete_account_accept).setVisibility(View.INVISIBLE);
        findViewById(R.id.information_relativelayout_data_management).setVisibility(View.VISIBLE);
    }
    public void OnBackSetting1(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
        //кнопка выхода из активити настроек
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_data_management);



        RadioGroup radioGroup_delete_account =findViewById(R.id.radioGroup_delete_account);


        RadioButton discontent_btn = findViewById(R.id.discontent_btn);
        discontent_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton not_clear_btn = findViewById(R.id.not_clear_btn);
        not_clear_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton deleting_duplicate_btn = findViewById(R.id.deleting_duplicate_btn);
        deleting_duplicate_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton rarely_use_btn = findViewById(R.id.rarely_use_btn);
        rarely_use_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton other_btn = findViewById(R.id.other_btn);
        other_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));


        TextView btn_accept = findViewById(R.id.btn_accept);

        EditText btn_describe_reason = findViewById(R.id.btn_describe_reason);

        radioGroup_delete_account.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (other_btn.isPressed()) {
                    btn_describe_reason.setVisibility(View.VISIBLE);
                } else {
                    btn_describe_reason.setVisibility(View.INVISIBLE);
                }

                if (discontent_btn.isChecked() || not_clear_btn.isChecked() || deleting_duplicate_btn.isChecked() || rarely_use_btn.isChecked()) {
                    btn_accept.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_black));
                    btn_accept.setEnabled(true);
                } else {
                    btn_accept.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg12));
                    btn_accept.setEnabled(false);
                }
            }
        });

        btn_describe_reason.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                // Этот метод вызывается до изменения текста
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                // Этот метод вызывается во время изменения текста
            }

            @Override
            public void afterTextChanged(Editable s) {
                // Этот метод вызывается после изменения текста

                if (s.toString().isEmpty()) {
                    // EditText пуст
                    btn_accept.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg12));
                    btn_accept.setEnabled(false);
                } else {
                    // EditText содержит текст
                    btn_accept.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_black));
                    btn_accept.setEnabled(true);
                }
            }
        });


    }
}

