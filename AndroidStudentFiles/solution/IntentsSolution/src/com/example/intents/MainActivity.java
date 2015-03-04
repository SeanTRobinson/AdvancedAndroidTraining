package com.example.intents;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends Activity {

	int request_code = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	// listen out for the click event
	public void onClick(View view){
		//startActivity(new Intent("com.example.intents.SecondActivity"));
		startActivityForResult(new Intent(this, SecondActivity.class), request_code);
	}
	
	public void onActivityResult(int requestCode, int resultCode, Intent data){
		if(requestCode == request_code){
			if(resultCode == RESULT_OK){
				// we know the data has come back, so show it to the user
				Toast.makeText(this, data.getData().toString(), Toast.LENGTH_LONG).show();
			}
		}
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
