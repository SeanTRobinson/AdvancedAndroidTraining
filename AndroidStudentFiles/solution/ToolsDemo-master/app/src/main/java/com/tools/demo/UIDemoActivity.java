package com.tools.demo;

import android.app.Activity;
import android.os.Bundle;
import android.os.StrictMode;

public class UIDemoActivity extends Activity {
	private boolean DEVELOPER_MODE = true;
	
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
        if (DEVELOPER_MODE) {
            StrictMode.enableDefaults();
            super.onCreate(savedInstanceState);
            initialiseViews();
        }
	}

    private void initialiseViews() {
        setContentView(R.layout.baduidemo);
    }

	/**
	 * Do something off the UI thread
	 * 
	 */

}
