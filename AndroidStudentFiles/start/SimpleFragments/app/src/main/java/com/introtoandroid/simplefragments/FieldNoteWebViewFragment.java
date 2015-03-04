package com.introtoandroid.simplefragments;


import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewFragment;

public class FieldNoteWebViewFragment extends WebViewFragment {

	private static final String DEBUG_TAG = "FieldNoteWebViewFragment";

	public static FieldNoteWebViewFragment newInstance(int index) {
		Log.v(DEBUG_TAG, "Creating new instance: " + index);
		// create and return and instance of FieldNoteWebViewFragment with Bundle of arguments

	}
    // get the index

    // Fragment Life Cycle event handlers
	@Override
	public void onResume() {
		super.onResume();
		Log.d(DEBUG_TAG, "FRAGMENT LIFECYCLE EVENT: onResume():" +  getShownIndex());		
	}

	@Override
	public void onStart() {
		Log.d(DEBUG_TAG, "FRAGMENT LIFECYCLE EVENT: onStart(): " + getShownIndex());
		super.onStart();
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		Log.d(DEBUG_TAG, "FRAGMENT LIFECYCLE EVENT: onActivityCreated(): " + getShownIndex());
		super.onActivityCreated(savedInstanceState);
		
		// Load the URL after the Webview has been created in onCreateView()

        // ... default url -
        // http://www.perlgurl.org/archives/photography/special_assignments/african_field_notes/

	}

	@Override
	public void onAttach(Activity activity) {
		Log.d(DEBUG_TAG, "FRAGMENT LIFECYCLE EVENT: onAttach()");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d(DEBUG_TAG, "FRAGMENT LIFECYCLE EVENT: onCreate()");
		super.onCreate(savedInstanceState);
		
		Log.d(DEBUG_TAG, "OnCreate(): " + getShownIndex());
		
	}

	@Override
	public void onDestroy() {
		Log.d(DEBUG_TAG, "FRAGMENT LIFECYCLE EVENT: onDestroy()");
		super.onDestroy();
	}

	@Override
	public void onDetach() {
		Log.d(DEBUG_TAG, "FRAGMENT LIFECYCLE EVENT: onDetach()");
		super.onDetach();
	}

	@Override
	public void onPause() {
		Log.d(DEBUG_TAG, "FRAGMENT LIFECYCLE EVENT: onPause(): " + getShownIndex());
		super.onPause();
	}

	@Override
	public void onStop() {
		Log.d(DEBUG_TAG, "FRAGMENT LIFECYCLE EVENT: onStop(): " + getShownIndex());
		super.onStop();
	}
}