package com.example.api_audit;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button b1;
    private TextView t1,t2;
    private SeekBar sk1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        b1=(Button)findViewById(R.id.B1);
        t1=(TextView)findViewById(R.id.Tv1);
        t2=(TextView)findViewById(R.id.Tv2);
        sk1=(SeekBar)findViewById(R.id.Sb1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int randomval= (int)(Math.random()*(sk1.getProgress())) + 1;
                //Toast.makeText(getApplicationContext(),String.valueOf(randomval), Toast.LENGTH_LONG).show();
                t1.setText(""+randomval);
            }
        });
    }


}
