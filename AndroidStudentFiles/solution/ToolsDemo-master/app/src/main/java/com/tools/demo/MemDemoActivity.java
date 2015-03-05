package com.tools.demo;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.Vector;

public class MemDemoActivity extends Activity {

	private Button eatMemory;
	private Vector vect;

	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        setContentView(R.layout.memdemo);

        vect = new Vector();
        eatMemory = (Button)findViewById(R.id.eat_mem_btn);

        eatMemory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                byte b[] = new byte[23456];
                vect.add(b);

                Runtime runtime = Runtime.getRuntime();
                Log.i("TAG", "Size of memory: " + runtime.totalMemory());
            }
        });

	}

}
