package com.example.muhammadhanafi.tutorialsharedpreferencescrud;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public SharedPreferences prefdata;
    TextView tvTampil;
    EditText etNama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prefdata = getSharedPreferences("datamahasiswa", MODE_PRIVATE);

    }


    public void tampildata(View v) {

        tvTampil = (TextView) findViewById(R.id.textView);
        String tampilnama = prefdata.getString("namamhs", "data tidak diturunkan");
        tvTampil.setText(tampilnama);

    }
    public void simpan(View v) {

        etNama = (EditText) findViewById(R.id.etNama);
        String kirimData = etNama.getText().toString();
        SharedPreferences.Editor editordata = prefdata.edit();
        editordata.putString("namamhs", kirimData);
        editordata.commit();

        //--menampilkan pesan file sudah di-save--
        Toast.makeText(getBaseContext(),"File sudah berhasil di-simpan",Toast.LENGTH_SHORT).show();

    }

    public void hapus (View v){
        prefdata.edit().remove("namamhs").commit();
        //--menampilkan pesan file sudah di-save--
        Toast.makeText(getBaseContext(),"Data Berhasil Dihapus",Toast.LENGTH_SHORT).show();
    }

}