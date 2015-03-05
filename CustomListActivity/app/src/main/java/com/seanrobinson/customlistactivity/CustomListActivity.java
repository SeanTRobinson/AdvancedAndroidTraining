package com.seanrobinson.customlistactivity;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.widget.ListView;

import java.util.ArrayList;


public class CustomListActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_list);
        populateUsersList();
    }

    private void populateUsersList() {
        ArrayList<User> arrayOfUsers = User.getUsers();
        CustomUsersAdapter customUsersAdapter = new CustomUsersAdapter(this, arrayOfUsers);
        ListView listView = (ListView)findViewById(R.id.lvUsers);
        listView.setAdapter(customUsersAdapter);
    }
}
