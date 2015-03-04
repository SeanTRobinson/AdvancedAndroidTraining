package com.example.myapplication;

import android.content.DialogInterface;
import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (savedInstanceState != null) {
            System.out.println("savedInstanceState = [" + savedInstanceState + "]");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void onAcceptClick(View v) {
        TextView tv_greeting = (TextView) findViewById(R.id.textView_greeting);
        EditText et_name = (EditText) findViewById(R.id.editText_name);

        if(et_name.getText() != null && et_name.getText().length() > 0) {
            Log.i("MainActivity", "Name read: " + et_name.getText());
            tv_greeting.setText("Hello " + et_name.getText());
        } else {
            Log.w("MainActivity", "No name entered, greeting didn't change");
        }
    }
}
