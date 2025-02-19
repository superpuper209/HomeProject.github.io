package com.example.no_name_hochu_babok.CeationObject;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import com.example.no_name_hochu_babok.BookingPassActivity;
import com.example.no_name_hochu_babok.CalendarActivity;
import com.example.no_name_hochu_babok.MessagesPassActivity;
import com.example.no_name_hochu_babok.R;
import com.example.no_name_hochu_babok.User.ProfileActivity;

import org.checkerframework.checker.units.qual.C;

public class NewAnnouncementActivity extends AppCompatActivity {


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
        setContentView(R.layout.activity_new_announcement);

        LinearLayout rooms_places_linear = findViewById(R.id.rooms_places_linear);
        LinearLayout apartments_linear = findViewById(R.id.apartments_linear);
        LinearLayout house_linear = findViewById(R.id.house_linear);
        LinearLayout separate_rooms_linear = findViewById(R.id.separate_rooms_linear);


        RelativeLayout ad_title_relative = findViewById(R.id.ad_title_relative); // дочерний релатив скролла

        ScrollView scroll = findViewById(R.id.scroll); //общий скролл

        Button btn_resume = findViewById(R.id.btn_resume); // кнопка продолжить на первом релативе
        Button btn_resume1 = findViewById(R.id.btn_resume1); // кнопка продолжить на втором релативе
        Button btn_resume2 = findViewById(R.id.btn_resume2); // кнопка продолжить на третьем релативе
        Button btn_resume3 = findViewById(R.id.btn_resume3); // кнопка продолжить на четвертом релативе

        EditText btn_enter_town = findViewById(R.id.btn_enter_town);
        EditText btn_enter_town1 = findViewById(R.id.btn_enter_town1);
        EditText btn_enter_town2 = findViewById(R.id.btn_enter_town2);
        EditText btn_enter_town3 = findViewById(R.id.btn_enter_town3);


        //кнопки радиогруппы первого релатива
        RadioGroup radioGroup_ad_title = findViewById(R.id.radioGroup_ad_title);

        RadioButton hotel_btn = findViewById(R.id.hotel_btn);
        hotel_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton mini_hotel_btn = findViewById(R.id.mini_hotel_btn);
        mini_hotel_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton guest_house_btn = findViewById(R.id.guest_house_btn);
        guest_house_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton apart_hotel_btn = findViewById(R.id.apart_hotel_btn);
        apart_hotel_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton hostel_btn = findViewById(R.id.hostel_btn);
        hostel_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton economy_class_hotel_btn = findViewById(R.id.economy_class_hotel_btn);
        economy_class_hotel_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton capsule_hotel_btn = findViewById(R.id.capsule_hotel_btn);
        capsule_hotel_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton recreation_center_btn = findViewById(R.id.recreation_center_btn);
        recreation_center_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton boarding_house_btn = findViewById(R.id.boarding_house_btn);
        boarding_house_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton sanatorium_btn = findViewById(R.id.sanatorium_btn);
        sanatorium_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton apartment_btn = findViewById(R.id.apartment_btn);
        apartment_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton glamping_btn = findViewById(R.id.glamping_btn);
        glamping_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton hotel_guest_house_btn = findViewById(R.id.hotel_guest_house_btn);
        hotel_guest_house_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton boutique_hotel_btn = findViewById(R.id.boutique_hotel_btn);
        boutique_hotel_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton park_hotel_btn = findViewById(R.id.park_hotel_btn);
        park_hotel_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton eco_hotel_btn = findViewById(R.id.eco_hotel_btn);
        eco_hotel_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));




        //первый релатив
        rooms_places_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rooms_places_linear.isPressed()) {
                    apartments_linear.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg3_2));
                    rooms_places_linear.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg3));
                    house_linear.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg3_2));
                    separate_rooms_linear.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg3_2));


                    findViewById(R.id.apartments_relative).setVisibility(View.INVISIBLE);
                    findViewById(R.id.ad_title_relative).setVisibility(View.VISIBLE);// главная
                    findViewById(R.id.house_relative).setVisibility(View.INVISIBLE);
                    findViewById(R.id.separate_rooms_relative).setVisibility(View.INVISIBLE);

                    apartments_linear.setPressed(false);
                    house_linear.setPressed(false);
                    separate_rooms_linear.setPressed(false);
                }


            }
        });

        radioGroup_ad_title.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
               /* if (eco_hotel_btn.isChecked() || park_hotel_btn.isChecked() || boutique_hotel_btn.isChecked() || hotel_guest_house_btn.isChecked() || glamping_btn.isChecked() ||
                        apartment_btn. isChecked() || sanatorium_btn.isChecked() || boarding_house_btn.isChecked() || recreation_center_btn.isChecked() || capsule_hotel_btn.isChecked()
                        || economy_class_hotel_btn.isChecked() || hostel_btn.isChecked() || guest_house_btn.isChecked() || apart_hotel_btn.isChecked() || hotel_btn.isChecked() || mini_hotel_btn.isChecked()) {
                    btn_resume.setBackgroundColor(getColor(R.color.black));
                    btn_resume.setEnabled(true);

                } else {
                    btn_resume.setBackgroundColor(getColor(R.color.bg12));
                    btn_resume.setEnabled(false);

                }*/



                // EditText первого релатива
                btn_enter_town.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                        // Этот метод вызывается до изменения текста
                        btn_resume.setBackgroundColor(getColor(R.color.bg12));
                        btn_resume.setEnabled(false);
                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        // Этот метод вызывается во время изменения текста
                        btn_resume.setBackgroundColor(getColor(R.color.black));
                        btn_resume.setEnabled(true);
                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        // Этот метод вызывается после изменения текста

                        if (s.toString().isEmpty()) {
                            if (eco_hotel_btn.isChecked() || park_hotel_btn.isChecked() || boutique_hotel_btn.isChecked() || hotel_guest_house_btn.isChecked() || glamping_btn.isChecked() ||
                                    apartment_btn. isChecked() || sanatorium_btn.isChecked() || boarding_house_btn.isChecked() || recreation_center_btn.isChecked() || capsule_hotel_btn.isChecked()
                                    || economy_class_hotel_btn.isChecked() || hostel_btn.isChecked() || guest_house_btn.isChecked() || apart_hotel_btn.isChecked() || hotel_btn.isChecked() || mini_hotel_btn.isChecked()) {
                                btn_resume.setBackgroundColor(getColor(R.color.bg12));
                                btn_resume.setEnabled(false);

                            }
                            btn_resume.setBackgroundColor(getColor(R.color.bg12));
                            btn_resume.setEnabled(false);
                        } else {
                            // EditText содержит текст
                            btn_resume.setBackgroundColor(getColor(R.color.black));
                            btn_resume.setEnabled(true);
                        }
                    }
                });

            }
        });

        // кнопка продолжить на первом релативе
        btn_resume.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // кнопка отель
                if (hotel_btn.isChecked() || btn_resume.isClickable()) {
                    // условие перехода на тругую активити

                }

                //кнопка отель
                if (hotel_btn.isChecked() || btn_resume.isClickable()) {

                }

                //кнопка мими отель
                if (mini_hotel_btn.isChecked() || btn_resume.isClickable()) {

                }

                //кнопка гостевой дом
                if (guest_house_btn.isChecked() || btn_resume.isClickable()) {

                }

                //кнопка Апарт-отель
                if (apart_hotel_btn.isChecked() || btn_resume.isClickable()) {

                }

                //кнопка Хостел
                if (hostel_btn.isChecked() || btn_resume.isClickable()) {

                }

                //кнопка отель эконом класса
                if (economy_class_hotel_btn.isChecked() || btn_resume.isClickable()) {

                }

                //кнопка кампус отель
                if (capsule_hotel_btn.isChecked() || btn_resume.isClickable()) {

                }

                //кнопка база отдыха
                if (recreation_center_btn.isChecked()|| btn_resume.isClickable()) {

                }

                //кнопка пансионат
                if (boarding_house_btn.isChecked() || btn_resume.isClickable()) {

                }

                //кнопка санаторий
                if (sanatorium_btn.isChecked() || btn_resume.isClickable()) {

                }

                //кнопка аппартамент
                if (apartment_btn.isChecked() || btn_resume.isClickable()) {

                }

                //кнопка глэмпинг
                if (glamping_btn.isChecked() || btn_resume.isClickable()) {

                }

                //кнопка гостиница
                if (hotel_guest_house_btn.isChecked() || btn_resume.isClickable()) {

                }

                //кнопка бутик отель
                if (boutique_hotel_btn.isChecked() || btn_resume.isClickable()) {

                }

                //кнопка парк отель
                if (park_hotel_btn.isChecked() || btn_resume.isClickable()) {

                }

                //кнопка эко отель
                if (eco_hotel_btn.isChecked() || btn_resume.isClickable()) {

                }
            }
        });

        //кнопка отель
        hotel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка мими отель
        mini_hotel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка гостевой дом
        guest_house_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка Апарт-отель
        apart_hotel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка Хостел
        hostel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка отель эконом класса
        economy_class_hotel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка кампус отель
        capsule_hotel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка база отдыха
        recreation_center_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка пансионат
        boarding_house_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка санаторий
        sanatorium_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка аппартамент
        apartment_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка глэмпинг
        glamping_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка гостиница
        hotel_guest_house_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка бутик отель
        boutique_hotel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка парк отель
        park_hotel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка эко отель
        eco_hotel_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });




        //кнопки радиогруппы второго релатива
        RadioGroup radioGroup_apartments = findViewById(R.id.radioGroup_apartments);

        RadioButton flat_btn = findViewById(R.id.flat_btn);
        flat_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton apartment_btn1 = findViewById(R.id.apartment_btn1);
        apartment_btn1.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton atelier_btn = findViewById(R.id.atelier_btn);
        atelier_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));



        //второй релатив
        apartments_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(apartments_linear.isPressed()) {
                    apartments_linear.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg3));
                    rooms_places_linear.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg3_2));
                    house_linear.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg3_2));
                    separate_rooms_linear.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg3_2));


                    findViewById(R.id.apartments_relative).setVisibility(View.VISIBLE); // главная
                    findViewById(R.id.ad_title_relative).setVisibility(View.INVISIBLE);
                    findViewById(R.id.house_relative).setVisibility(View.INVISIBLE);
                    findViewById(R.id.separate_rooms_relative).setVisibility(View.INVISIBLE);

                    rooms_places_linear.setPressed(false);
                    house_linear.setPressed(false);
                    separate_rooms_linear.setPressed(false);
                }
            }
        });

        radioGroup_apartments.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
               /* if (flat_btn.isChecked() || apartment_btn1.isChecked() || atelier_btn.isChecked()) {
                    btn_resume1.setBackgroundColor(getColor(R.color.black));
                    btn_resume1.setEnabled(true);

                } else {
                    btn_resume1.setBackgroundColor(getColor(R.color.bg12));
                    btn_resume1.setEnabled(false);

                }*/
                // эдит текст второго релатива
                btn_enter_town1.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                        // Этот метод вызывается до изменения текста
                        btn_resume1.setBackgroundColor(getColor(R.color.bg12));
                        btn_resume1.setEnabled(false);
                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        // Этот метод вызывается во время изменения текста
                        btn_resume1.setBackgroundColor(getColor(R.color.black));
                        btn_resume1.setEnabled(true);
                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        // Этот метод вызывается после изменения текста

                        if (s.toString().isEmpty()) {
                            if (flat_btn.isChecked() || apartment_btn1.isChecked() || atelier_btn.isChecked()) {
                                btn_resume1.setBackgroundColor(getColor(R.color.bg12));
                                btn_resume1.setEnabled(false);

                            }
                            btn_resume1.setBackgroundColor(getColor(R.color.bg12));
                            btn_resume1.setEnabled(false);
                        } else {
                            // EditText содержит текст
                            btn_resume1.setBackgroundColor(getColor(R.color.black));
                            btn_resume1.setEnabled(true);
                        }
                    }
                });

            }
        });
        // кнопка продолжить на втором релативе
        btn_resume1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // кнопка квартира
                if (flat_btn.isChecked() || btn_resume1.isClickable()) {
                    // условие перехода на тругую активити
                }

                //кнопка аппартамент
                if (apartment_btn1.isChecked() || btn_resume1.isClickable()) {

                }

                //кнопка студия
                if (atelier_btn.isChecked() || btn_resume1.isClickable()) {

                }

            }
        });

        //кнопка квартира
        flat_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка аппартамент
        apartment_btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка студия
        atelier_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //кнопки радиогруппы третьего релатива
        RadioGroup radioGroup_house = findViewById(R.id.radioGroup_house);

        RadioButton cottage_btn = findViewById(R.id.cottage_btn);
        cottage_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton home_btn = findViewById(R.id.home_btn);
        home_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton villa_btn = findViewById(R.id.villa_btn);
        villa_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton part_house_btn = findViewById(R.id.part_house_btn);
        part_house_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton boathouse_btn = findViewById(R.id.boathouse_btn);
        boathouse_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton village_house_btn = findViewById(R.id.village_house_btn);
        village_house_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton townhouse_btn = findViewById(R.id.townhouse_btn);
        townhouse_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton floor_house_btn = findViewById(R.id.floor_house_btn);
        floor_house_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton guesthouse_btn = findViewById(R.id.guesthouse_btn);
        guesthouse_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton chalet_btn = findViewById(R.id.chalet_btn);
        chalet_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton bungalow_btn = findViewById(R.id.bungalow_btn);
        bungalow_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton mobile_home_btn = findViewById(R.id.mobile_home_btn);
        mobile_home_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton mansion_btn = findViewById(R.id.mansion_btn);
        mansion_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton yacht_btn = findViewById(R.id.yacht_btn);
        yacht_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton country_house_btn = findViewById(R.id.country_house_btn);
        country_house_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));



        //третий релатив
        house_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(house_linear.isPressed()) {
                    house_linear.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg3));
                    rooms_places_linear.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg3_2));
                    apartments_linear.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg3_2));
                    separate_rooms_linear.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg3_2));

                    findViewById(R.id.house_relative).setVisibility(View.VISIBLE); //главная
                    findViewById(R.id.apartments_relative).setVisibility(View.INVISIBLE);
                    findViewById(R.id.ad_title_relative).setVisibility(View.INVISIBLE);
                    findViewById(R.id.separate_rooms_relative).setVisibility(View.INVISIBLE);

                    rooms_places_linear.setPressed(false);
                    apartments_linear.setPressed(false);
                    separate_rooms_linear.setPressed(false);
                }
            }
        });

        radioGroup_house.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                /*if (cottage_btn.isChecked() || home_btn.isChecked() || villa_btn.isChecked() ||  part_house_btn.isChecked() || boathouse_btn.isChecked() ||
                        village_house_btn.isChecked() || townhouse_btn.isChecked() || floor_house_btn.isChecked() || guesthouse_btn.isChecked() || chalet_btn.isChecked()
                || bungalow_btn.isChecked() || mobile_home_btn.isChecked() || mansion_btn.isChecked() || yacht_btn.isChecked() || country_house_btn.isChecked()) {
                    btn_resume2.setBackgroundColor(getColor(R.color.black));
                    btn_resume2.setEnabled(true);

                } else {
                    btn_resume2.setBackgroundColor(getColor(R.color.bg12));
                    btn_resume2.setEnabled(false);

                }*/


                // эдит текст третьего релатива
                btn_enter_town2.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                        // Этот метод вызывается до изменения текста
                        btn_resume2.setBackgroundColor(getColor(R.color.bg12));
                        btn_resume2.setEnabled(false);
                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        // Этот метод вызывается во время изменения текста
                        btn_resume2.setBackgroundColor(getColor(R.color.black));
                        btn_resume2.setEnabled(true);
                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        // Этот метод вызывается после изменения текста

                        if (s.toString().isEmpty()) {
                            if (cottage_btn.isChecked() || home_btn.isChecked() || villa_btn.isChecked() ||  part_house_btn.isChecked() || boathouse_btn.isChecked() ||
                                    village_house_btn.isChecked() || townhouse_btn.isChecked() || floor_house_btn.isChecked() || guesthouse_btn.isChecked() || chalet_btn.isChecked()
                                    || bungalow_btn.isChecked() || mobile_home_btn.isChecked() || mansion_btn.isChecked() || yacht_btn.isChecked() || country_house_btn.isChecked()) {
                                btn_resume2.setBackgroundColor(getColor(R.color.bg12));
                                btn_resume2.setEnabled(false);

                            }
                            btn_resume2.setBackgroundColor(getColor(R.color.bg12));
                            btn_resume2.setEnabled(false);
                        } else {
                            // EditText содержит текст
                            btn_resume2.setBackgroundColor(getColor(R.color.black));
                            btn_resume2.setEnabled(true);
                        }
                    }
                });
            }
        });
        // кнопка продолжить на третьем релативе
        btn_resume2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //кнопка коттедж
                if (cottage_btn.isChecked() || btn_resume2.isClickable()) {
                    // условие перехода на тругую активити
                }

                //кнопка дом
                if (home_btn.isChecked() || btn_resume2.isClickable()) {

                }

                //кнопка вилла
                if (villa_btn.isChecked() || btn_resume2.isClickable()) {

                }
                //кнопка часть дома с отдельным входом
                if (part_house_btn.isChecked() || btn_resume2.isClickable()) {

                }
                //кнопка эллинг
                if (boathouse_btn.isChecked() || btn_resume2.isClickable()) {

                }
                //кнопка деревенский дом
                if (village_house_btn.isChecked() || btn_resume2.isClickable()) {

                }
                //кнопка таунхаус
                if (townhouse_btn.isChecked() || btn_resume2.isClickable()) {

                }
                //кнопка целый этаж в доме
                if (floor_house_btn.isChecked() || btn_resume2.isClickable()) {

                }
                //кнопка густхаус
                if (guesthouse_btn.isChecked() || btn_resume2.isClickable()) {

                }
                //кнопка шале
                if (chalet_btn.isChecked() || btn_resume2.isClickable()) {

                }
                //кнопка бунгало
                if (bungalow_btn.isChecked() || btn_resume2.isClickable()) {

                }
                //кнопка дом на колесах
                if (mobile_home_btn.isChecked() || btn_resume2.isClickable()) {

                }
                //кнопка особняк
                if (mansion_btn.isChecked() || btn_resume2.isClickable()) {

                }
                //кнопка яхта
                if (yacht_btn.isChecked() || btn_resume2.isClickable()) {

                }

                //кнопка дача
                if (country_house_btn.isChecked() || btn_resume2.isClickable()) {

                }
            }
        });



        //кнопка коттедж
        cottage_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка дом
        home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка вилла
        villa_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка часть дома с отдельным входом
        part_house_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка эллинг
        boathouse_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка деревенский дом
        village_house_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка таунхаус
        townhouse_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка целый этаж в доме
        floor_house_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка густхаус
        guesthouse_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка шале
        chalet_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка бунгало
        bungalow_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка дом на колесах
        mobile_home_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка особняк
        mansion_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка яхта
        yacht_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка дача
        country_house_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        //кнопки радиогруппы четвертого релатива
        RadioGroup radioGroup_separate_rooms = findViewById(R.id.radioGroup_separate_rooms);


        RadioButton room_apartment_btn = findViewById(R.id.room_apartment_btn);
        room_apartment_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton room_private_house_btn = findViewById(R.id.room_private_house_btn);
        room_private_house_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        RadioButton room_cottage_btn = findViewById(R.id.room_cottage_btn);
        room_cottage_btn.setButtonTintList(ContextCompat.getColorStateList(this, R.color.color_state_list));

        //четвертый релатив
        separate_rooms_linear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(separate_rooms_linear.isPressed()) {
                    separate_rooms_linear.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg3));
                    rooms_places_linear.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg3_2));
                    apartments_linear.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg3_2));
                    house_linear.setBackgroundDrawable(getResources().getDrawable(R.drawable.border_bg3_2));

                    findViewById(R.id.separate_rooms_relative).setVisibility(View.VISIBLE); // главная
                    findViewById(R.id.house_relative).setVisibility(View.INVISIBLE);
                    findViewById(R.id.apartments_relative).setVisibility(View.INVISIBLE);
                    findViewById(R.id.ad_title_relative).setVisibility(View.INVISIBLE);

                    rooms_places_linear.setPressed(false);
                    apartments_linear.setPressed(false);
                    house_linear.setPressed(false);
                }
            }
        });

        radioGroup_separate_rooms.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                /*if (room_apartment_btn.isChecked() || room_private_house_btn.isChecked() || room_cottage_btn.isChecked()) {
                    btn_resume3.setBackgroundColor(getColor(R.color.black));
                    btn_resume3.setEnabled(true);

                } else {
                    btn_resume3.setBackgroundColor(getColor(R.color.bg12));
                    btn_resume3.setEnabled(false);

                }*/

                // эдит текст четвертого релатива
                btn_enter_town3.addTextChangedListener(new TextWatcher() {
                    @Override
                    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                        // Этот метод вызывается до изменения текста
                        btn_resume3.setBackgroundColor(getColor(R.color.bg12));
                        btn_resume3.setEnabled(false);
                    }

                    @Override
                    public void onTextChanged(CharSequence s, int start, int before, int count) {
                        // Этот метод вызывается во время изменения текста
                        btn_resume3.setBackgroundColor(getColor(R.color.black));
                        btn_resume3.setEnabled(true);
                    }

                    @Override
                    public void afterTextChanged(Editable s) {
                        // Этот метод вызывается после изменения текста

                        if (s.toString().isEmpty()) {
                            if (room_apartment_btn.isChecked() || room_private_house_btn.isChecked() || room_cottage_btn.isChecked()) {
                                btn_resume3.setBackgroundColor(getColor(R.color.bg12));
                                btn_resume3.setEnabled(false);

                            }
                            btn_resume3.setBackgroundColor(getColor(R.color.bg12));
                            btn_resume3.setEnabled(false);
                        } else {
                            // EditText содержит текст
                            btn_resume3.setBackgroundColor(getColor(R.color.black));
                            btn_resume3.setEnabled(true);
                        }
                    }
                });
            }
        });

        // кнопка продолжить на четвертом релативе
        btn_resume3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //кнопка комната в квартире
                if (room_apartment_btn.isChecked() || btn_resume3.isClickable()) {
                    // условие перехода на тругую активити
                }

                //кнопка комната в частном доме
                if (room_private_house_btn.isChecked() || btn_resume3.isClickable()) {

                }

                //кнопка комната в коттедже
                if (room_cottage_btn.isChecked() || btn_resume3.isClickable()) {

                }

            }
        });

        //кнопка комната в квартире
        room_apartment_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка комната в частном доме
        room_private_house_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        //кнопка комната в коттедже
        room_cottage_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}