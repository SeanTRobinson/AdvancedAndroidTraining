package com.introtoandroid.simplefragments;


import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.app.ListFragment;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class FieldNoteListFragment extends ListFragment implements
		FragmentManager.OnBackStackChangedListener {

	private static final String DEBUG_TAG = "FieldNoteListFragment";
	// set an int for current position
	// set a boolean for single or tow fragments

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);

		// getListView CHOICE_MODE_SINGLE

		// Populate our ListView control within the Fragment


		// Check which state we're in


		// monitor back stack changes to update list view


	}

	@Override
	public void onBackStackChanged() {
		// update position

	}

	@Override
	public void onSaveInstanceState(Bundle outState) {
		super.onSaveInstanceState(outState);
		// persist mCurPosition
	}

	// handle onListItemCLick events


	// Declare a helper method, called whenever an item in the ListView is clicked

    // Fragment Life Cycle event handlers
	@Override
	public void onAttach(Activity activity) {
		Log.d(DEBUG_TAG, "FRAGMENT LIFECYCLE EVENT: onAttach()");
		super.onAttach(activity);
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		Log.d(DEBUG_TAG, "FRAGMENT LIFECYCLE EVENT: onCreate()");
		super.onCreate(savedInstanceState);
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
		Log.d(DEBUG_TAG, "FRAGMENT LIFECYCLE EVENT: onPause()");
		super.onPause();
	}

	@Override
	public void onResume() {
		Log.d(DEBUG_TAG, "FRAGMENT LIFECYCLE EVENT: onResume(): "
				+ mCurPosition);
		super.onResume();
	}

	@Override
	public void onStart() {
		Log.d(DEBUG_TAG, "FRAGMENT LIFECYCLE EVENT: onStart()");
		super.onStart();
	}

	@Override
	public void onStop() {
		Log.d(DEBUG_TAG, "FRAGMENT LIFECYCLE EVENT: onStop()");
		super.onStop();
	}

}