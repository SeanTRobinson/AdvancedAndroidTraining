package com.introtoandroid.supportfragdialog;


import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SupportFragDialogActivity extends FragmentActivity {
	/** Called when the activity is first created. */
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		// Handle Alert Dialog Button

		// Handle Alert Dialog 2 Button

	}

	void showDialogFragment(DialogFragment newFragment, String strFragmentNumber) {
		newFragment.show(getSupportFragmentManager(), strFragmentNumber);
	}

    // dopositiveClick handler

}