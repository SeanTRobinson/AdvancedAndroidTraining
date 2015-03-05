package com.tools.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LogcatDemoActivity extends Activity {

    public static final String TAG = "com.sr.logcatdemo";
    private TextView tv;
    private EditText et;
    private Button btn;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        initialiseViews();
        measureNanoTime();
	}

    private void measureNanoTime() {
        final int ITERATIONS = 100;
        long total = 0;
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;

        for (int i = ITERATIONS; i>0; i--) {
            long startTime = System.nanoTime();
            long time = System.nanoTime() - startTime;

            total += time;

            if (time < min) {
                min = time;
            }
            if (time > max) {
                max = time;
            }
        }

        Log.i(TAG, "Average Time: " + ((float)total / ITERATIONS) + " nanoseconds.");
    }

    private void initialiseViews() {
        setContentView(R.layout.logcatdemo);
        tv = (TextView)findViewById(R.id.logcat_textview);
        et = (EditText)findViewById(R.id.logcat_edittext);
        btn = (Button)findViewById(R.id.logcat_button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String entered = et.getText().toString();
                tv.setText(entered);
            }
        });
    }


}
