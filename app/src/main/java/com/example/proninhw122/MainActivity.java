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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imglink = findViewById(R.id.imglink);
        Button Buttonb = findViewById(R.id.bbatton);
        Buttonb.setOnClickListener(new ButtonB());
        Button Buttonf = findViewById(R.id.fbutton);
        Buttonf.setOnClickListener(new ButtonF());
    }

    class ButtonB implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            finish();
        }
    }

    class ButtonF implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            int rand = 1+(int)((100-1+1)*Math.random());
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
            imglink.setText("Адрес картинки: http://myfile.org/"+rand);
        }
    }
}

