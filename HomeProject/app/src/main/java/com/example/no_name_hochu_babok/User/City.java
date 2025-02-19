package com.example.no_name_hochu_babok.User;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.no_name_hochu_babok.R;


public class City extends AppCompatActivity {

    private String[] CityArr = new String[]{"Санкт-Питербург","Москва","Казань","Калининград","Сочи","Геленджик","Адлер","Минск","Владивосток","Махачкала","Екатерембург"};
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_city);
        listView = findViewById(R.id.list_view);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, CityArr);
        listView.setAdapter(adapter);

    }

    public void OnBack(View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }



}