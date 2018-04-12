package com.example.muhammadhanafi.contohspinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Spinner spNamen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spNamen = (Spinner) findViewById(R.id.sp_name);

        Button btSpinner = (Button) findViewById(R.id.bt_check);
        btSpinner.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "Selected "+ spNamen.getSelectedItem().toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}
