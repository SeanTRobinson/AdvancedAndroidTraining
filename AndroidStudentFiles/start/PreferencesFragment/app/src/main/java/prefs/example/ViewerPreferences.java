package prefs.example;

import android.os.Bundle;
import android.preference.CheckBoxPreference;
import android.preference.EditTextPreference;
import android.preference.PreferenceFragment;
import android.preference.RingtonePreference;

/**
 * Created by seanrobinson on 05/03/2015.
 */
public class ViewerPreferences extends PreferenceFragment {

    CheckBoxPreference checkBoxPreference;
    EditTextPreference editTextPreference;
    RingtonePreference ringtonePreference;
    EditTextPreference secondEditTextPreference;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        addPreferencesFromResource(R.xml.preferences);
    }


}
