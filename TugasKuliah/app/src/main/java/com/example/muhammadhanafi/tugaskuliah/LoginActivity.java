package com.example.muhammadhanafi.tugaskuliah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    EditText editText1 ,editText2; //Membuat object dari class EdiText
    CheckBox checkbox1; //Membuat object dari class CheckBox
    String text1 ,text2; //Membuat object string


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    /*Membuat Method onclick pada button*/
    public void login(View view) {
        editText1 = (EditText)findViewById(R.id.username); //Memanggil ID EditText
        editText2 = (EditText) findViewById(R.id.password); //Memanggil ID EditText
        text1 = editText1.getText().toString(); //Mengambil value (nilai) pada username
        text2 = editText2.getText().toString(); //Mengambil value (nilai) pada password

        /*Membuat Kondisi Ketika Button Di Tekan*/
        if ((text1.contains("admin"))&&((text2.contains("admin"))))
        //Jika text1(username) Dan text2(password) sama dengan kondisi maka tampilkan toast dan pindah activity
        {
            Toast.makeText(this, "Anda Berhasil Login", Toast.LENGTH_SHORT).show(); //Menampilkan toast
            Intent intent = new Intent(LoginActivity.this, HalamanUtama.class); //Berpindah activity
            startActivity(intent); //Menjalankan Activity
        }

        else if ((text1.matches("")||text2.matches("")))
        //Atau jika input text 1 dan text 2 kosong maka tampilkan toast
        {
            Toast.makeText(this, "Isikan Username dan Password", Toast.LENGTH_SHORT).show(); //menampilkan toast

        }

        else
        //jika kedua kondisi diatas tidak memenuhi maka tampilkan toast
        {
            Toast.makeText(this, "Maaf Username/Password Salah", Toast.LENGTH_SHORT).show(); //menampilkan toast
        }

    }
}
