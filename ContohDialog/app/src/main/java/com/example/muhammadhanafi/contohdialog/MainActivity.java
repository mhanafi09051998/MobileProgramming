package com.example.muhammadhanafi.contohdialog;

import android.app.Dialog;
import android.content.DialogInterface;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btAlert;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btShow = (Button) findViewById(R.id.bt_showdialog);
        btShow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                /**
                 * Initiate Custom Dialog
                 */
                final Dialog dialog = new Dialog(MainActivity.this);
                dialog.setContentView(R.layout.activity_layout_customdialog);
                dialog.setTitle("TWOH.Co");

                /**
                 * Mengeset komponen dari custom dialog
                 */
                TextView text = (TextView) dialog.findViewById(R.id.tv_desc);
                text.setText("TWOH's Engineering custom dialog sample");
                ImageView image = (ImageView) dialog.findViewById(R.id.iv_icon);
                image.setImageResource(R.mipmap.ic_launcher);

                Button dialogButton = (Button) dialog.findViewById(R.id.bt_ok);
                /**
                 * Jika tombol diklik, tutup dialog
                 */
                dialogButton.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        dialog.dismiss();
                    }
                });

                dialog.show();
            }
        });
    }
}