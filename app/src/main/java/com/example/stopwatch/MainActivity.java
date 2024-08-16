package com.example.stopwatch;

import android.os.Bundle;
import android.widget.Button;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
int i=1;
Button start, stop;
TextView counter;
Handler myhandler=new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.button);
        stop=findViewById(R.id.button2);
        counter=findViewById(R.id.textView4);
    }
    public void start(View V)
    {
        i = 1;
        myhandler.postDelayed(Threadcount,0);
    }
    public void stop(View v)
    {
        myhandler.removeCallbacks(Threadcount);
    }
    public Runnable Threadcount=new Runnable() {
        @Override
        public void run() {
            counter.setText(""+i);
            i++;
            myhandler.postDelayed(Threadcount,0);
        }
    };
}