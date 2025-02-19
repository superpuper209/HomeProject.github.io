package com.example.no_name_hochu_babok.CeationObject;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.no_name_hochu_babok.BookingPassActivity;
import com.example.no_name_hochu_babok.CalendarActivity;
import com.example.no_name_hochu_babok.MessagesPassActivity;
import com.example.no_name_hochu_babok.R;
import com.example.no_name_hochu_babok.User.ProfileActivity;

public class HotelActivity extends AppCompatActivity {

    


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


    public void OnBookingPass (View view) {
        Intent intent = new Intent(this, BookingPassActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_hotel);

        Button basic_information_btn = findViewById(R.id.basic_information_btn);
        Button basic_information_btn1 = findViewById(R.id.basic_information_btn1);

        Button photo_btn1 = findViewById(R.id.photo_btn1);
        Button photo_btn = findViewById(R.id.photo_btn);

        RelativeLayout main_relative = findViewById(R.id.main_relative);

        TextView certificate_number_text = findViewById(R.id.certificate_number_text);
        EditText certificate_number_edit = findViewById(R.id.certificate_number_edit);

        TextView type_street_edit = findViewById(R.id.type_street_edit); // TextView типа улицы
        TextView internet_access_edit = findViewById(R.id.internet_access_edit); // TextView интеренета
        TextView stardom_edit = findViewById(R.id.stardom_edit); // TextView котегории
        TextView parking_availability_edit = findViewById(R.id.parking_availability_edit); // TextView парковки
        EditText year_construction_edit = findViewById(R.id.year_construction_edit); // EditText сведения - год постройки
        TextView check_after_edit = findViewById(R.id.check_after_edit); // TextView сведения -  заезд посде
        TextView departure_before_edit = findViewById(R.id.departure_before_edit); // TextView сведения -  отъезд до
        TextView smoking_edit = findViewById(R.id.smoking_edit); // TextView сведения -  курение на территории
        EditText number_rooms_edit = findViewById(R.id.number_rooms_edit); // эдит текст Сведения - число номеров

        Button btn_to_close = findViewById(R.id.btn_to_close); // кнопка закрыть для улицы
        Button btn_to_close1 = findViewById(R.id.btn_to_close1); // кнопка закрыть для котегории
        Button btn_to_close2 = findViewById(R.id.btn_to_close2); // кнопка закрыть для интернета
        Button btn_to_close3 = findViewById(R.id.btn_to_close3); // кнопка закрыть для парковки
      //  Button btn_to_close4 = findViewById(R.id.btn_to_close4); // кнопка закрыть для сведения заезд посде
      //  Button btn_to_close5 = findViewById(R.id.btn_to_close5); // кнопка закрыть для сведения отъезд до
      //  Button btn_to_close6 = findViewById(R.id.btn_to_close6); // кнопка закрыть для сведения курение на территории


        RadioGroup address_radiogroup = findViewById(R.id.address_radiogroup);//RadioGroup Адреса
        RadioGroup numbers_radiogroup = findViewById(R.id.numbers_radiogroup); //RadioGroup котегории
        RadioGroup internet_radiogroup = findViewById(R.id.internet_radiogroup); //RadioGroup интеренета
        RadioGroup parking_radiogroup = findViewById(R.id.parking_radiogroup); //RadioGroup парковки
     //   RadioGroup times_radiogroup = findViewById(R.id.times_radiogroup);//RadioGroup  сведения - заезд после
      //  RadioGroup times_radiogroup1 = findViewById(R.id.times_radiogroup1);//RadioGroup  сведения - отъезд до
      //  RadioGroup smoking_radiogroup = findViewById(R.id.smoking_radiogroup);//RadioGroup  сведения - курение на территории


///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





        stardom_edit.setOnClickListener(new View.OnClickListener() { // TextView котегории
            @Override
            public void onClick(View v) {


                numbers_radiogroup.setVisibility(View.VISIBLE);
                btn_to_close1.setVisibility(View.VISIBLE);

            }
        });
        RadioButton choose_radiobutton1 = findViewById(R.id.choose_radiobutton1); // выбирете (для котегории)
        choose_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton zero_radiobutton = findViewById(R.id.zero_radiobutton); // 0
        zero_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton one_radiobutton = findViewById(R.id.one_radiobutton); // 1
        one_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton two_radiobutton = findViewById(R.id.two_radiobutton); // 2
        two_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton three_radiobutton = findViewById(R.id.three_radiobutton); // 3
        three_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton four_radiobutton = findViewById(R.id.four_radiobutton); // 4
        four_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton five_radiobutton = findViewById(R.id.five_radiobutton); // 5
        five_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));


        numbers_radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            // радиогруппа котегории
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (choose_radiobutton1.isPressed() || zero_radiobutton.isPressed() || one_radiobutton.isPressed()
                        || two_radiobutton.isPressed() || three_radiobutton.isPressed() || five_radiobutton.isPressed()) {

                    certificate_number_text.setVisibility(View.VISIBLE);
                    certificate_number_edit.setVisibility(View.VISIBLE);


                    RadioButton choose_radiobutton1 = group.findViewById(checkedId);
                    String selectedOption = choose_radiobutton1.getText().toString();
                    stardom_edit.setText(selectedOption);
                }
            }
        });

        btn_to_close1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_to_close1.isPressed()) {

                    certificate_number_text.setVisibility(View.GONE);
                    certificate_number_edit.setVisibility(View.GONE);
                    btn_to_close1.setVisibility(View.GONE);
                    numbers_radiogroup.setVisibility(View.GONE);
                }
            }
        });
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        btn_to_close.setOnClickListener(new View.OnClickListener() { // кнопка закрыть для типа улицы
            @Override
            public void onClick(View v) {
                if (btn_to_close.isPressed()) {

                    address_radiogroup.setVisibility(View.GONE);
                    btn_to_close.setVisibility(View.GONE);
                }
            }
        });

        RadioButton choose_radiobutton = findViewById(R.id.choose_radiobutton); // выбирете
        choose_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton boulevard_radiobutton = findViewById(R.id.boulevard_radiobutton); // бульвар
        boulevard_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton road_radiobutton = findViewById(R.id.road_radiobutton); // дорога
        road_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton track_radiobutton = findViewById(R.id.track_radiobutton); // дорожка
        track_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton residential_area_radiobutton = findViewById(R.id.residential_area_radiobutton); //  жилмассив
        residential_area_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton alleyway_radiobutton = findViewById(R.id.alleyway_radiobutton); // переулок
        alleyway_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton square_radiobutton = findViewById(R.id.square_radiobutton); // площадь
        square_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton transit_radiobutton = findViewById(R.id.transit_radiobutton); // проезд
        transit_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton avenue_radiobutton = findViewById(R.id.avenue_radiobutton); // проспект
        avenue_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton route_radiobutton = findViewById(R.id.route_radiobutton); // трасса
        route_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton street_radiobutton = findViewById(R.id.street_radiobutton); // улица
        street_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton alley_radiobutton = findViewById(R.id.alley_radiobutton); // аллея
        alley_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton kilometer_radiobutton = findViewById(R.id.kilometer_radiobutton); // километр
        kilometer_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton line_radiobutton = findViewById(R.id.line_radiobutton); // линия
        line_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton embankment_radiobutton = findViewById(R.id.embankment_radiobutton); // набережная
        embankment_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton clearing_radiobutton = findViewById(R.id.clearing_radiobutton); // просека
        clearing_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton country_lane_radiobutton = findViewById(R.id.country_lane_radiobutton); // проселок
        country_lane_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton alley_alleyway_radiobutton = findViewById(R.id.alley_alleyway_radiobutton); // проулок
        alley_alleyway_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton descent_radiobutton = findViewById(R.id.descent_radiobutton); // спуск
        descent_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton dead_end_radiobutton = findViewById(R.id.dead_end_radiobutton); // тупик
        dead_end_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton highway_radiobutton = findViewById(R.id.highway_radiobutton); // шоссе
        highway_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));


        address_radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // радиогруппа типа улицы
                if (choose_radiobutton.isPressed() || boulevard_radiobutton.isPressed() || road_radiobutton.isPressed() || track_radiobutton.isPressed() || residential_area_radiobutton.isPressed() || alleyway_radiobutton.isPressed() ||
                        square_radiobutton.isPressed() || transit_radiobutton.isPressed() || avenue_radiobutton.isPressed() || route_radiobutton.isPressed() || street_radiobutton.isPressed() || alley_radiobutton.isPressed()
                        || kilometer_radiobutton.isPressed() || line_radiobutton.isPressed() || embankment_radiobutton.isPressed() || clearing_radiobutton.isPressed() || country_lane_radiobutton.isPressed() || alley_alleyway_radiobutton.isPressed() ||
                        descent_radiobutton.isPressed() || dead_end_radiobutton.isPressed() || highway_radiobutton.isPressed()) {

                    RadioButton choose_radiobutton = group.findViewById(checkedId);
                    String selectedOption = choose_radiobutton.getText().toString();
                    type_street_edit.setText(selectedOption);
                }
            }
        });
        type_street_edit.setOnClickListener(new View.OnClickListener() { //TextView типа улицы
            @Override
            public void onClick(View v) {
                if (type_street_edit.isPressed()) {

                    findViewById(R.id.address_radiogroup).setVisibility(View.VISIBLE);
                    findViewById(R.id.btn_to_close).setVisibility(View.VISIBLE);
                }
            }
        });

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
        /*
        * эти три внизу кнопки для переключения релатилов
        * основн инфа
        * фото
        * */

        basic_information_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (basic_information_btn1.isPressed()) {

                    basic_information_btn.setBackgroundColor(getColor(R.color.bg2));
                    photo_btn1.setBackgroundColor(getColor(R.color.bg));
                    findViewById(R.id.main_relative).setVisibility(View.VISIBLE);
                    findViewById(R.id.main_relative_gr).setVisibility(View.INVISIBLE);
                }
            }
        });
        photo_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (photo_btn.isPressed()) {

                    photo_btn1.setBackgroundColor(getColor(R.color.bg2));
                    basic_information_btn.setBackgroundColor(getColor(R.color.bg));
                    findViewById(R.id.main_relative).setVisibility(View.INVISIBLE);
                    findViewById(R.id.main_relative_gr).setVisibility(View.VISIBLE);

                }

            }
        });

        photo_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (photo_btn1.isPressed()) {

                    photo_btn.setBackgroundColor(getColor(R.color.bg));
                    basic_information_btn.setBackgroundColor(getColor(R.color.bg2));
                    basic_information_btn1.setBackgroundColor(getColor(R.color.bg));
                    findViewById(R.id.main_relative).setVisibility(View.INVISIBLE);
                    findViewById(R.id.main_relative_gr).setVisibility(View.VISIBLE);
                }

            }
        });

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RadioButton choose_radiobutton2 = findViewById(R.id.choose_radiobutton2); // выбирете
        choose_radiobutton2.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton yes_fee_radiobutton = findViewById(R.id.yes_fee_radiobutton); // да, платно
        yes_fee_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton yes_not_fee_radiobutton = findViewById(R.id.yes_not_fee_radiobutton); // да, бесплатно
        yes_not_fee_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton no_radiobutton = findViewById(R.id.no_radiobutton); // нет
        no_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));


        // все что надо интернета
        internet_radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            // радиогруппа интернета
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (choose_radiobutton2.isPressed() || yes_fee_radiobutton.isPressed() || yes_not_fee_radiobutton.isPressed()
                        || no_radiobutton.isPressed()) {

                    RadioButton choose_radiobutton2 = group.findViewById(checkedId);
                    String selectedOption = choose_radiobutton2.getText().toString();
                    internet_access_edit.setText(selectedOption);
                }
            }
        });
        // TextView интернета
        internet_access_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (internet_access_edit.isPressed()) {

                    findViewById(R.id.internet_radiogroup).setVisibility(View.VISIBLE);
                    findViewById(R.id.btn_to_close2).setVisibility(View.VISIBLE);
                }

            }
        });

        // кнопка закрыть для интернета
        btn_to_close2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_to_close2.isPressed()) {

                    findViewById(R.id.internet_radiogroup).setVisibility(View.GONE);
                    findViewById(R.id.btn_to_close2).setVisibility(View.GONE);
                }

            }
        });

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        parking_availability_edit.setOnClickListener(new View.OnClickListener() { // TextView парковки
            @Override
            public void onClick(View v) {


                parking_radiogroup.setVisibility(View.VISIBLE);
                btn_to_close3.setVisibility(View.VISIBLE);

            }
        });
        RadioButton choose_radiobutton3 = findViewById(R.id.choose_radiobutton3); // выбирете (для парковки)
        choose_radiobutton3.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton free_parking_radiobutton = findViewById(R.id.free_parking_radiobutton); // есть платная парковка
        free_parking_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton not_free_parking_radiobutton = findViewById(R.id.not_free_parking_radiobutton); // есть бесплатная парковка
        not_free_parking_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton not_parking_radiobutton = findViewById(R.id.not_parking_radiobutton); // нет парковки
        not_parking_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));


        //choose_radiobutton3.setChecked(true); строка эта отвечала за то что бы по умолчанию была активка одна из радио батн

        parking_radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            // радиогруппа парковки
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (choose_radiobutton3.isPressed() || free_parking_radiobutton.isPressed() || not_free_parking_radiobutton.isPressed()
                        || not_parking_radiobutton.isPressed()) {




                    RadioButton choose_radiobutton3 = group.findViewById(checkedId);
                    String selectedOption = choose_radiobutton3.getText().toString();
                    parking_availability_edit.setText(selectedOption);
                }
            }
        });
        // кнопка закрыть парковки
        btn_to_close3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_to_close3.isPressed()) {

                    parking_radiogroup.setVisibility(View.GONE);
                    btn_to_close3.setVisibility(View.GONE);
                }
            }
        });
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

       year_construction_edit.addTextChangedListener(new TextWatcher() { // эдит текст Сведения - год постройки
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0) {
                    int year = Integer.parseInt(s.toString());
                    if (year < 1900 || year > 2025 || s.length() > 4) {
                        s.replace(0, s.length(), "нельзя помещять сюда число с пятью цифрами и буквы");

                    }
                }

            }
        });


        number_rooms_edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) { }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) { }

            @Override
            public void afterTextChanged(Editable s) {
                if (s.length() > 0) {
                    if (s.length() > 4) {
                        s.replace(0, s.length(), "");
                    }
                }

            }
        });

        /* RadioButton zero_zero_radiobutton = findViewById(R.id.zero_zero_radiobutton); // 00
        zero_zero_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton hour_radiobutton = findViewById(R.id.hour_radiobutton); // 01
        hour_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton two_hours_radiobutton = findViewById(R.id.two_hours_radiobutton); // 02
        two_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton three_hours_radiobutton = findViewById(R.id.three_hours_radiobutton); // 03
        three_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton four_hours_radiobutton = findViewById(R.id.four_hours_radiobutton); // 04
        four_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton five_hours_radiobutton = findViewById(R.id.five_hours_radiobutton); // 05
        five_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton six_hours_radiobutton = findViewById(R.id.six_hours_radiobutton); // 06
        six_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton seven_hours_radiobutton = findViewById(R.id.seven_hours_radiobutton); // 07
        seven_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton eight_hours_radiobutton = findViewById(R.id.eight_hours_radiobutton); // 08
        eight_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton nine_hours_radiobutton = findViewById(R.id.nine_hours_radiobutton); // 09
        nine_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton ten_hours_radiobutton = findViewById(R.id.ten_hours_radiobutton); // 10
        ten_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton eleven_hours_radiobutton = findViewById(R.id.eleven_hours_radiobutton); // 11
        eleven_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton twelve_hours_radiobutton = findViewById(R.id.twelve_hours_radiobutton); // 12
        twelve_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton thirteen_hours_radiobutton = findViewById(R.id.thirteen_hours_radiobutton); // 13
        thirteen_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton fourteen_hours_radiobutton = findViewById(R.id.fourteen_hours_radiobutton); // 14
        fourteen_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton fifteen_hours_radiobutton = findViewById(R.id.fifteen_hours_radiobutton); // 15
        fifteen_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton sixteen_hours_radiobutton = findViewById(R.id.sixteen_hours_radiobutton); // 16
        sixteen_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton seventeen_hours_radiobutton = findViewById(R.id.seventeen_hours_radiobutton); // 17
        seventeen_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton eighteen_hours_radiobutton = findViewById(R.id.eighteen_hours_radiobutton); // 18
        eighteen_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton nineteen_hours_radiobutton = findViewById(R.id.nineteen_hours_radiobutton); // 19
        nineteen_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton twenty_hours_radiobutton = findViewById(R.id.twenty_hours_radiobutton); // 20
        twenty_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton twenty_one_hours_radiobutton = findViewById(R.id.twenty_one_hours_radiobutton); // 21
        twenty_one_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton twenty_two_hours_radiobutton = findViewById(R.id.twenty_two_hours_radiobutton); // 22
        twenty_two_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton twenty_three_hours_radiobutton = findViewById(R.id.twenty_three_hours_radiobutton); // 23
        twenty_three_hours_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));



        times_radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // радиогруппа сведения - заезд после
            // радиогруппа котегории
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (zero_zero_radiobutton.isPressed() || hour_radiobutton.isPressed() || two_hours_radiobutton.isPressed() || three_hours_radiobutton.isPressed() || four_hours_radiobutton.isPressed() || five_hours_radiobutton.isPressed()
                        || six_hours_radiobutton.isPressed() || seven_hours_radiobutton.isPressed() || eight_hours_radiobutton.isPressed() || nine_hours_radiobutton.isPressed() || ten_hours_radiobutton.isPressed() || eleven_hours_radiobutton.isPressed()
                        || twelve_hours_radiobutton.isPressed() || thirteen_hours_radiobutton.isPressed() || fourteen_hours_radiobutton.isPressed() || fifteen_hours_radiobutton.isPressed() || sixteen_hours_radiobutton.isPressed() || seventeen_hours_radiobutton.isPressed()
                        || eighteen_hours_radiobutton.isPressed() || nineteen_hours_radiobutton.isPressed() || twenty_hours_radiobutton.isPressed() || twenty_one_hours_radiobutton.isPressed() || twenty_two_hours_radiobutton.isPressed() || twenty_three_hours_radiobutton.isPressed()) {




                    RadioButton zero_zero_radiobutton = group.findViewById(checkedId);
                    String selectedOption = zero_zero_radiobutton.getText().toString();
                    check_after_edit.setText(selectedOption);
                }
            }
        });

        check_after_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (check_after_edit.isPressed()) {

                    times_radiogroup.setVisibility(View.VISIBLE);
                    btn_to_close4.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_to_close4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_to_close4.isPressed()) {

                    times_radiogroup.setVisibility(View.GONE);
                    btn_to_close4.setVisibility(View.GONE);
                }
            }
        });

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

       RadioButton zero_zero_radiobutton1 = findViewById(R.id.zero_zero_radiobutton1); // 00
        zero_zero_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton hour_radiobutton1 = findViewById(R.id.hour_radiobutton); // 01
        hour_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton two_hours_radiobutton1 = findViewById(R.id.two_hours_radiobutton1); // 02
        two_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton three_hours_radiobutton1 = findViewById(R.id.three_hours_radiobutton1); // 03
        three_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton four_hours_radiobutton1 = findViewById(R.id.four_hours_radiobutton1); // 04
        four_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton five_hours_radiobutton1 = findViewById(R.id.five_hours_radiobutton1); // 05
        five_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton six_hours_radiobutton1 = findViewById(R.id.six_hours_radiobutton1); // 06
        six_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton seven_hours_radiobutton1 = findViewById(R.id.seven_hours_radiobutton1); // 07
        seven_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton eight_hours_radiobutton1 = findViewById(R.id.eight_hours_radiobutton1); // 08
        eight_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton nine_hours_radiobutton1 = findViewById(R.id.nine_hours_radiobutton1); // 09
        nine_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton ten_hours_radiobutton1 = findViewById(R.id.ten_hours_radiobutton1); // 10
        ten_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton eleven_hours_radiobutton1 = findViewById(R.id.eleven_hours_radiobutton1); // 11
        eleven_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton twelve_hours_radiobutton1 = findViewById(R.id.twelve_hours_radiobutton1); // 12
        twelve_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton thirteen_hours_radiobutton1 = findViewById(R.id.thirteen_hours_radiobutton1); // 13
        thirteen_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton fourteen_hours_radiobutton1 = findViewById(R.id.fourteen_hours_radiobutton1); // 14
        fourteen_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton fifteen_hours_radiobutton1 = findViewById(R.id.fifteen_hours_radiobutton1); // 15
        fifteen_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton sixteen_hours_radiobutton1 = findViewById(R.id.sixteen_hours_radiobutton1); // 16
        sixteen_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton seventeen_hours_radiobutton1 = findViewById(R.id.seventeen_hours_radiobutton1); // 17
        seventeen_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton eighteen_hours_radiobutton1 = findViewById(R.id.eighteen_hours_radiobutton1); // 18
        eighteen_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton nineteen_hours_radiobutton1 = findViewById(R.id.nineteen_hours_radiobutton1); // 19
        nineteen_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton twenty_hours_radiobutton1 = findViewById(R.id.twenty_hours_radiobutton1); // 20
        twenty_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton twenty_one_hours_radiobutton1 = findViewById(R.id.twenty_one_hours_radiobutton1); // 21
        twenty_one_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton twenty_two_hours_radiobutton1 = findViewById(R.id.twenty_two_hours_radiobutton1); // 22
        twenty_two_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton twenty_three_hours_radiobutton1 = findViewById(R.id.twenty_three_hours_radiobutton1); // 23
        twenty_three_hours_radiobutton1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        times_radiogroup1.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // радиогруппа сведения - отъезд до
            // радиогруппа котегории
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (zero_zero_radiobutton1.isPressed() || hour_radiobutton1.isPressed() || two_hours_radiobutton1.isPressed() || three_hours_radiobutton1.isPressed() || four_hours_radiobutton1.isPressed() || five_hours_radiobutton1.isPressed()
                        || six_hours_radiobutton1.isPressed() || seven_hours_radiobutton1.isPressed() || eight_hours_radiobutton1.isPressed() || nine_hours_radiobutton1.isPressed() || ten_hours_radiobutton1.isPressed() || eleven_hours_radiobutton1.isPressed()
                        || twelve_hours_radiobutton1.isPressed() || thirteen_hours_radiobutton1.isPressed() || fourteen_hours_radiobutton1.isPressed() || fifteen_hours_radiobutton1.isPressed() || sixteen_hours_radiobutton1.isPressed() || seventeen_hours_radiobutton1.isPressed()
                        || eighteen_hours_radiobutton1.isPressed() || nineteen_hours_radiobutton1.isPressed() || twenty_hours_radiobutton1.isPressed() || twenty_one_hours_radiobutton1.isPressed() || twenty_two_hours_radiobutton1.isPressed() || twenty_three_hours_radiobutton1.isPressed()) {

                    RadioButton zero_zero_radiobutton1 = group.findViewById(checkedId);
                    String selectedOption = zero_zero_radiobutton1.getText().toString();
                    departure_before_edit.setText(selectedOption);
                }
            }
        });

        departure_before_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (departure_before_edit.isPressed()) {

                    times_radiogroup1.setVisibility(View.VISIBLE);
                    btn_to_close5.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_to_close5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_to_close5.isPressed()) {

                    times_radiogroup1.setVisibility(View.GONE);
                    btn_to_close5.setVisibility(View.GONE);
                }
            }
        });

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        RadioButton choose_radiobutton4 = findViewById(R.id.choose_radiobutton4);
        choose_radiobutton4.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton forbidden_radiobutton = findViewById(R.id.forbidden_radiobutton); // запрещено
        forbidden_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton allowed_places_radiobutton = findViewById(R.id.allowed_places_radiobutton); // разрешено в специально отведенных местах
        allowed_places_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton allowed_all_radiobutton = findViewById(R.id.allowed_all_radiobutton); // азрешено везде
        allowed_all_radiobutton.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        smoking_radiogroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() { // радиогруппа сведения - курение на территории

            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (choose_radiobutton4.isPressed() || forbidden_radiobutton.isPressed() || allowed_places_radiobutton.isPressed() || allowed_all_radiobutton.isPressed()) {

                    RadioButton choose_radiobutton4 = group.findViewById(checkedId);
                    String selectedOption = choose_radiobutton4.getText().toString();
                    smoking_edit.setText(selectedOption);
                }
            }
        });
        smoking_edit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (smoking_edit.isPressed()) {

                    smoking_radiogroup.setVisibility(View.VISIBLE);
                    btn_to_close6.setVisibility(View.VISIBLE);
                }
            }
        });

        btn_to_close6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (btn_to_close6.isPressed()) {

                    smoking_radiogroup.setVisibility(View.GONE);
                    btn_to_close6.setVisibility(View.GONE);
                }
            }
        });*/
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
         CheckBox checkbox_restaurant = findViewById(R.id.checkbox_restaurant);
        checkbox_restaurant.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_restaurant = findViewById(R.id.frame_restaurant);
        frame_restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_restaurant.setChecked(!checkbox_restaurant.isChecked());

            }
        });

        CheckBox checkbox_room_service = findViewById(R.id.checkbox_room_service);
        checkbox_room_service.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_room_service = findViewById(R.id.frame_room_service);
        frame_room_service.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_room_service.setChecked(!checkbox_room_service.isChecked());

            }
        });



        CheckBox checkbox_bar_counter = findViewById(R.id.checkbox_bar_counter);
        checkbox_bar_counter.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_bar_counter = findViewById(R.id.frame_bar_counter);
        frame_bar_counter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_bar_counter.setChecked(!checkbox_bar_counter.isChecked());

            }
        });

        CheckBox checkbox_front_desk = findViewById(R.id.checkbox_front_desk);
        checkbox_front_desk.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_front_desk = findViewById(R.id.frame_front_desk);
        frame_front_desk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_front_desk.setChecked(!checkbox_front_desk.isChecked());

            }
        });

        CheckBox checkbox_sauna = findViewById(R.id.checkbox_sauna);
        checkbox_sauna.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_sauna = findViewById(R.id.frame_sauna);
        frame_sauna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_sauna.setChecked(!checkbox_sauna.isChecked());

            }
        });

        CheckBox checkbox_fitness_room = findViewById(R.id.checkbox_fitness_room);
        checkbox_fitness_room.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_fitness_room = findViewById(R.id.frame_fitness_room);
        frame_fitness_room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_fitness_room.setChecked(!checkbox_fitness_room.isChecked());

            }
        });
        CheckBox checkbox_garden = findViewById(R.id.checkbox_garden);
        checkbox_garden.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_garden = findViewById(R.id.frame_garden);
        frame_garden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_garden.setChecked(!checkbox_garden.isChecked());

            }
        });

        CheckBox checkbox_terrace = findViewById(R.id.checkbox_terrace);
        checkbox_terrace.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_terrace = findViewById(R.id.frame_terrace);
        frame_terrace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_terrace.setChecked(!checkbox_terrace.isChecked());

            }
        });

        CheckBox checkbox_spa_center = findViewById(R.id.checkbox_spa_center);
        checkbox_spa_center.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_spa_center = findViewById(R.id.frame_spa_center);
        frame_spa_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_spa_center.setChecked(!checkbox_spa_center.isChecked());

            }
        });


        CheckBox checkbox_football_field = findViewById(R.id.checkbox_football_field);
        checkbox_football_field.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_football_field = findViewById(R.id.frame_football_field);
        frame_football_field.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_football_field.setChecked(!checkbox_football_field.isChecked());

            }
        });

        CheckBox checkbox_tennis_court = findViewById(R.id.checkbox_tennis_court);
        checkbox_tennis_court.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_tennis_court = findViewById(R.id.frame_tennis_court);
        frame_tennis_court.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_tennis_court.setChecked(!checkbox_tennis_court.isChecked());

            }
        });

        CheckBox checkbox_golf = findViewById(R.id.checkbox_golf);
        checkbox_golf.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_golf = findViewById(R.id.frame_golf);
        frame_golf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_golf.setChecked(!checkbox_golf.isChecked());

            }
        });

        CheckBox checkbox_aqua_park = findViewById(R.id.checkbox_aqua_park);
        checkbox_aqua_park.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_aqua_park = findViewById(R.id.frame_aqua_park);
        frame_aqua_park.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_aqua_park.setChecked(!checkbox_aqua_park.isChecked());

            }
        });

        CheckBox checkbox_outdoor_swimming_pool = findViewById(R.id.checkbox_outdoor_swimming_pool);
        checkbox_outdoor_swimming_pool.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_outdoor_swimming_pool = findViewById(R.id.frame_outdoor_swimming_pool);
        frame_outdoor_swimming_pool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_outdoor_swimming_pool.setChecked(!checkbox_outdoor_swimming_pool.isChecked());

            }
        });


        CheckBox checkbox_indoor_swimming_pool = findViewById(R.id.checkbox_indoor_swimming_pool);
        checkbox_indoor_swimming_pool.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_indoor_swimming_pool = findViewById(R.id.frame_indoor_swimming_pool);
        frame_indoor_swimming_pool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_indoor_swimming_pool.setChecked(!checkbox_indoor_swimming_pool.isChecked());

            }
        });

        CheckBox checkbox_jacuzzi = findViewById(R.id.checkbox_jacuzzi);
        checkbox_jacuzzi.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_jacuzzi = findViewById(R.id.frame_jacuzzi);
        frame_jacuzzi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_jacuzzi.setChecked(!checkbox_jacuzzi.isChecked());

            }
        });

        CheckBox checkbox_private_beach = findViewById(R.id.checkbox_private_beach);
        checkbox_private_beach.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_private_beach = findViewById(R.id.frame_private_beach);
        frame_private_beach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_private_beach.setChecked(!checkbox_private_beach.isChecked());

            }
        });

        CheckBox checkbox_playground = findViewById(R.id.checkbox_playground);
        checkbox_playground.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_playground = findViewById(R.id.frame_playground);
        frame_playground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_playground.setChecked(!checkbox_playground.isChecked());

            }
        });

        CheckBox checkbox_elevator = findViewById(R.id.checkbox_elevator);
        checkbox_elevator.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_elevator = findViewById(R.id.frame_elevator);
        frame_elevator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_elevator.setChecked(!checkbox_elevator.isChecked());

            }
        });

        CheckBox checkbox_ramp = findViewById(R.id.checkbox_ramp);
        checkbox_ramp.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_ramp = findViewById(R.id.frame_ramp);
        frame_ramp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_ramp.setChecked(!checkbox_ramp.isChecked());

            }
        });

        CheckBox checkbox_children_pool = findViewById(R.id.checkbox_children_pool);
        checkbox_children_pool.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_children_pool = findViewById(R.id.frame_children_pool);
        frame_children_pool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_children_pool.setChecked(!checkbox_children_pool.isChecked());

            }
        });

        CheckBox checkbox_bath_tub = findViewById(R.id.checkbox_bath_tub);
        checkbox_bath_tub.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_bath_tub = findViewById(R.id.frame_bath_tub);
        frame_bath_tub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_bath_tub.setChecked(!checkbox_bath_tub.isChecked());

            }
        });

        CheckBox checkbox_heated_swimming_pool = findViewById(R.id.checkbox_heated_swimming_pool);
        checkbox_heated_swimming_pool.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_heated_swimming_pool = findViewById(R.id.frame_heated_swimming_pool);
        frame_heated_swimming_pool.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_heated_swimming_pool.setChecked(!checkbox_heated_swimming_pool.isChecked());

            }
        });

        CheckBox checkbox_meeting_room = findViewById(R.id.checkbox_meeting_room);
        checkbox_meeting_room.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_meeting_room = findViewById(R.id.frame_meeting_room);
        frame_meeting_room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_meeting_room.setChecked(!checkbox_meeting_room.isChecked());

            }
        });

        CheckBox checkbox_conference_room = findViewById(R.id.checkbox_conference_room);
        checkbox_conference_room.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_conference_room = findViewById(R.id.frame_conference_room);
        frame_conference_room.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_conference_room.setChecked(!checkbox_conference_room.isChecked());

            }
        });
        CheckBox checkbox_luggage_storage = findViewById(R.id.checkbox_luggage_storage);
        checkbox_luggage_storage.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_luggage_storage = findViewById(R.id.frame_luggage_storage);
        frame_luggage_storage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_luggage_storage.setChecked(!checkbox_luggage_storage.isChecked());

            }
        });

        CheckBox checkbox_laundry = findViewById(R.id.checkbox_laundry);
        checkbox_laundry.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_laundry = findViewById(R.id.frame_laundry);
        frame_laundry.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_laundry.setChecked(!checkbox_laundry.isChecked());

            }
        });

        CheckBox checkbox_business_center = findViewById(R.id.checkbox_business_center);
        checkbox_business_center.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_business_center = findViewById(R.id.frame_business_center);
        frame_business_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_business_center.setChecked(!checkbox_business_center.isChecked());

            }
        });

        CheckBox checkbox_provided_transfer = findViewById(R.id.checkbox_provided_transfer);
        checkbox_provided_transfer.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));
        FrameLayout frame_provided_transfer = findViewById(R.id.frame_provided_transfer);
        frame_provided_transfer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkbox_provided_transfer.setChecked(!checkbox_provided_transfer.isChecked());

            }
        });
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////





    }
}

