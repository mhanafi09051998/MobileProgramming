package com.example.muhammadhanafi.tugaskuliah;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.w3c.dom.Text;


public class DetailPendaftaranActivity extends AppCompatActivity {

    String get_nama,get_alamat,get_notlp,get_email,get_password;
    TextView nama,alamat, notlp, email,password,jeniskelamin,txthobi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_pendaftaran);

        nama = (TextView) findViewById(R.id.nama_textView);
        alamat = (TextView) findViewById(R.id.alamat_textView);
        notlp = (TextView) findViewById(R.id.notlp_textView);
        email = (TextView) findViewById(R.id.email_textView);
        password = (TextView) findViewById(R.id.password_textView);
        jeniskelamin = (TextView) findViewById(R.id.jeniskelamin_textView);
        txthobi = (TextView) findViewById(R.id.hobi_textView);


        Bundle b = getIntent().getExtras();


        get_nama = b.getString("parse_nama");
        get_alamat = b.getString("parse_alamat");
        get_notlp = b.getString("parse_notlp");
        get_email = b.getString("parse_email");
        get_password = b.getString("parse_password");
        jeniskelamin.setText(b.getCharSequence("jeniskelamin"));

        Intent TerimaData = getIntent();

        String hobinya = TerimaData.getStringExtra("hobi");

        nama.setText("Nama : "+get_nama);
        alamat.setText("Alamat : "+get_alamat);
        notlp.setText("NoTlp : "+get_notlp);
        email.setText("Email : "+get_email);
        password.setText("password : "+get_password);
        txthobi.setText("Hobi: "+hobinya);

    }
}
