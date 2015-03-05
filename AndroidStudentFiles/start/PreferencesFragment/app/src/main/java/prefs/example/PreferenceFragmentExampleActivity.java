package prefs.example;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;

public class PreferenceFragmentExampleActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        // preliminary: create a separate Java class (fragment) to load the xml preferences

        
        // step 1: Create an instance of FragmentManager
        FragmentManager fragmentManager = getFragmentManager();

        // step 2: create an instance of FragmentTransaction
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        /* step 3: Create a custom fragment class (in a separate file)
         * a. Generate a new Java class
         * b. Give it a name
         * c. Make sure it extends PreferenceFragment
         * d. Override onCreate
         * e. Call super.onCreate()
         * f. add preferences from resource found at xml/preferences.xml (steps 5-7)
		*/
        // step 8: instantiate your new fragment class
        ViewerPreferences viewerPreferences = new ViewerPreferences();

        // step 9: use the new fragment (.replace, .addToBackStack and commit)
        fragmentTransaction.replace(android.R.id.content, viewerPreferences).addToBackStack(null).commit();
 
    }
}