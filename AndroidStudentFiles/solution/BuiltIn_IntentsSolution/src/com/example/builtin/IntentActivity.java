package com.example.builtin;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;

public class IntentActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);
	}

	public void onClickWebBrowser(View view) {
		// create a new intent
		Intent i = new Intent(android.content.Intent.ACTION_VIEW);
		i.setData(Uri.parse("http://www.bbc.co.uk"));
		// start it
		startActivity(i);
	}// end of onclickWebBrowser call-back
	
	public void onClickMakeCalls(View view) {
		// create a new intent
		Intent i = new Intent(android.content.Intent.ACTION_CALL, Uri.parse("tel:*#0*#"));
		// start it
		startActivity(i);
	}// end of onclickMakeCalls call-back

	public void onClickShowMap(View view) {

		//create a new intent
		Intent i = new Intent(android.content.Intent.ACTION_VIEW, Uri.parse("geo:53.466423,-2.632831"));
		// start it
		startActivity(i);
	}// end of onclickShowMap call-back	



	public void onClickLaunchMyBrowser(View view) {
		// create a new intent
		Intent i = new Intent("com.example.builtin.MyBrowserActivity");
		i.setData(Uri.parse("http://www.bbc.co.uk"));
		// start it
		startActivity(i);
	}// end of onclickShowMap call-back

    public void onClickCreateSMS(View view) {
        Intent i = new
                Intent(android.content.Intent.ACTION_VIEW);
        i.putExtra("address", "5556; 5558; 5560");
        i.putExtra("sms_body", "Hello my friends!");
        i.setType("vnd.android-dir/mms-sms");
        startActivity(i);
    }// end of onClickCreateSMS call-back
	
}













