package com.tools.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class DemoFragment extends Fragment {

    private Button button;
    private TextView textView;
       
    public DemoFragment() {
    	
    }
    
    /**
     * Inflate the view from a layout file and return it
     */
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment, container, false);
        button = (Button)view.findViewById(R.id.button1);
        textView = (TextView)view.findViewById(R.id.title1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent home = new Intent(view.getContext(), ToolsDemoActivity.class);
                startActivity(home);
            }
        });

        return view;
    }

    /**
     * The activity has been fully created
     */
    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
/**
     * Set the text for the DemoFragments Button
     * 
     * @param titleIn
     */
    public void setButtonText(String titleIn) {
        button.setText(titleIn);
    }

    /**
     * Set the text for the DemoFragments Button
     * 
     * @param titleIn
     */
    public void setTitleText(String titleIn) {
        textView.setText(titleIn);
    }

   
}
