package com.seanrobinson.customlistactivity;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by seanrobinson on 04/03/2015.
 */
public class CustomUsersAdapter extends ArrayAdapter<User> {
    public CustomUsersAdapter(Context context, ArrayList<User> users) {
        super(context, 0, users);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get item for position
        User user = getItem(position);

        //Check if existing view is being reused, else inflate
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_user, parent, false);
        }

        TextView tvName = (TextView)convertView.findViewById(R.id.tvName);
        TextView tvHometown = (TextView)convertView.findViewById(R.id. tvHometown);

        tvName.setText(user.getName());
        tvHometown.setText(user.getHometown());

        return convertView;
    }
}

