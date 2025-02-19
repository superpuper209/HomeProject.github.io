package com.example.no_name_hochu_babok.User;

import android.content.Intent;
import android.os.Bundle;

// import android.support.design.widget.FloatingActionButton;
// import android.support.design.widget.Snackbar;

import android.view.View;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.no_name_hochu_babok.R;
import com.firebase.ui.auth.AuthUI;
 import com.firebase.ui.database.FirebaseListAdapter;
 import com.firebase.ui.database.FirebaseListOptions;

import com.google.firebase.auth.FirebaseAuth;
 import com.google.firebase.database.FirebaseDatabase;
import java.util.Locale;

import android.widget.Toast;

import java.text.SimpleDateFormat;

public class RegisteredMessagesActivity extends AppCompatActivity {

    public void OnProfile(View view) {
        Intent intent = new Intent(this, ProfileActivity.class);
        startActivity(intent);
    }
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
    private static int SING_IN_CODE = 1;
    private RelativeLayout windows_reg_messages;
    private FirebaseListAdapter<Message> adapter;
    private RelativeLayout sendBtn;



    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == SING_IN_CODE){
            if(requestCode == RESULT_OK){
                Toast.makeText(this,"Вы авторизованы", Toast.LENGTH_LONG).show();
                displayAllMessages();
            }else {
                Toast.makeText(this,"Вы не авторизованы", Toast.LENGTH_LONG).show();
                finish();
            }
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);

        setContentView(R.layout.activity_registered_messages);

        windows_reg_messages = findViewById(R.id.windows_reg_messages);

        sendBtn = findViewById(R.id.btnSend);

        sendBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText textField = findViewById(R.id.messageField);
                if(textField.getText().toString() == "")
                    return;

                FirebaseDatabase.getInstance().getReference().push().setValue(
                        new Message(
                                FirebaseAuth.getInstance().getCurrentUser().getEmail(),
                                textField.getText().toString()
                        )
                );
                textField.setText("");
            }
        });

        if(FirebaseAuth.getInstance().getCurrentUser() == null){
            startActivityForResult(AuthUI.getInstance().createSignInIntentBuilder().build(),SING_IN_CODE);
        }else{
            Toast.makeText(this, "Вы авторизованы", Toast.LENGTH_LONG).show();
            displayAllMessages();
        }
    }
    private void displayAllMessages() {
        ListView listViewMessage = findViewById(R.id.list_view_message);

        FirebaseListOptions<Message> options = new FirebaseListOptions.Builder<Message>()
                .setQuery(FirebaseDatabase.getInstance().getReference(), Message.class)
                .setLayout(R.layout.activity_registered_messages)
                .setLifecycleOwner(this)
                .build();

        FirebaseListAdapter<Message> adapter = new FirebaseListAdapter<Message>(options) {
            @Override
            protected void populateView(@NonNull View v, @NonNull Message model, int position) {
                TextView mess_user, mess_time, mess_text;
                mess_user = v.findViewById(R.id.message_user);
                mess_time = v.findViewById(R.id.message_time);
                mess_text = v.findViewById(R.id.message_text);

                mess_user.setText(model.getUserName());
                mess_text.setText(model.getTextMessage());
                SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH:mm", Locale.getDefault());
                mess_time.setText(dateFormat.format(model.getMessageTime()));
            }
        };
        listViewMessage.setAdapter(adapter);
    }
}