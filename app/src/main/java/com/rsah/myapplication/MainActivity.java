package com.rsah.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    private Button btn_tambah , btn_kali , btn_kurang , btn_bagi ;
    private EditText angka_satu , angka_dua ;
    private TextView hasil ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_tambah = findViewById(R.id.btn_tambah);
        btn_kurang = findViewById(R.id.btn_kurang);
        btn_bagi = findViewById(R.id.btn_bagi);
        btn_kali = findViewById(R.id.btn_kali);

        angka_satu = findViewById(R.id.angka_1);
        angka_dua = findViewById(R.id.angka_2);

        hasil = findViewById(R.id.hasil);






        btn_tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String satu = angka_satu.getText().toString() ;
                String dua = angka_dua.getText().toString() ;
                check(satu , dua , "+");

            }
        });


        btn_kurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String satu = angka_satu.getText().toString() ;
                String dua = angka_dua.getText().toString() ;
                check(satu , dua , "-");

            }
        });


        btn_bagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String satu = angka_satu.getText().toString() ;
                String dua = angka_dua.getText().toString() ;
                check(satu , dua , "/");

            }
        });


        btn_kali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String satu = angka_satu.getText().toString() ;
                String dua = angka_dua.getText().toString() ;
                check(satu , dua , "*");

            }
        });





    }





    private void check (String satu , String dua , String simbol){


        if (satu.equals("") || satu.equals("0")){

            angka_satu.setError("Masukan Nominal");

            return;

        } else if (dua.equals("") || dua.equals("0") ){

            angka_dua.setError("Masukan Nominal");
            return;

        }else{

            int i_satu = Integer.parseInt(satu) ;
            int i_dua = Integer.parseInt(dua) ;

            hasil.setText(""+hitung(i_satu , i_dua , simbol));

        }





    }



    private int hitung (int angka1 , int angka2 , String simbol){

        int total = 0 ;

        if (simbol.equals("+")){

            total = angka1 + angka2 ;
        }

        if (simbol.equals("-")){

            total = angka1 - angka2 ;
        }

        if (simbol.equals("/")){

            total = angka1 / angka2 ;
        }


        if (simbol.equals("*")){

            total = angka1 * angka2 ;
        }


        return total ;

    }












}
