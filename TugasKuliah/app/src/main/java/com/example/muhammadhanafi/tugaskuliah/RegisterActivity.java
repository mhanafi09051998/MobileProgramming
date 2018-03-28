package com.example.muhammadhanafi.tugaskuliah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    //pendeklarasian
    private Button btnDaftar;
    String var_nama, var_alamat, var_notlp, var_email, var_password;
    EditText nama, alamat, notlp, email, password;
    Button button;
    RadioGroup genderRadioGroup;
    CheckBox cbjava, cbnet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);


        //get id EditText

        btnDaftar = (Button) findViewById(R.id.btnDaftar);
        nama = (EditText) findViewById(R.id.editTextNama);
        alamat = (EditText) findViewById(R.id.editTextAlamat);
        notlp = (EditText) findViewById(R.id.editTextNoTlp);
        email = (EditText) findViewById(R.id.editTextEmail);
        password = (EditText) findViewById(R.id.editTextPassword);
        genderRadioGroup = (RadioGroup) findViewById(R.id.radioGroupNb);
        cbjava = (CheckBox) findViewById(R.id.cekboxjava) ;
        cbnet = (CheckBox) findViewById(R.id.cekboxnet) ;


        Button submit = (Button) findViewById(R.id.btnDaftar);
        submit.setOnClickListener(new OnClickListener()


        {
            @Override
            public void onClick(View v) {

                var_nama = nama.getText().toString();
                var_alamat = alamat.getText().toString();
                var_notlp = notlp.getText().toString();
                var_email = email.getText().toString();
                var_password = password.getText().toString();

                Intent i = null;
                i = new Intent(RegisterActivity.this, DetailPendaftaranActivity.class);
                Bundle b = new Bundle();

                int id = genderRadioGroup.getCheckedRadioButtonId();
                RadioButton radioButton = (RadioButton) findViewById(id);
                b.putString("jeniskelamin", radioButton.getText().toString());



                String hobinya = "";
                if(cbjava.isChecked()) {
                    hobinya+="," + cbjava.getText().toString();
                }
                if(cbnet.isChecked()) {
                    hobinya+="," + cbnet.getText().toString();
                }
                String hobi = hobinya.replaceFirst(",","");


                b.putString("parse_nama", var_nama);
                b.putString("parse_alamat", var_alamat);
                b.putString("parse_notlp", var_notlp);
                b.putString("parse_email", var_email);
                b.putString("parse_password", var_password);
                b.putString("hobi", hobinya);


                i.putExtras(b);
                startActivity(i);


            }
        });

    }
}
