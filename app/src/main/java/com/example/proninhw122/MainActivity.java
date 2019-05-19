package com.example.proninhw122;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView imglink;
    int rand = 1+(int)((100-1+1)*Math.random());

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imglink = findViewById(R.id.imglink);
        Button bbutton = findViewById(R.id.bbatton);
        Button fbutton = findViewById(R.id.fbutton);
        bbutton.setOnClickListener(mClickListener);
        fbutton.setOnClickListener(mClickListener);
        imglink.setText(getString(R.string.textLinkDefault)+rand);
    }

    private View.OnClickListener mClickListener = new View.OnClickListener() {
        public void onClick(View v) {

            switch (v.getId()) {
                case R.id.bbatton:
                    finish();
                    break;
                case R.id.fbutton:
                    Intent intent = new Intent(MainActivity.this, MainActivity.class);
                    startActivity(intent);
                default:
            }
        }
    };
}

