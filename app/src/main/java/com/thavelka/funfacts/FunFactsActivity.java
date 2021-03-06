package com.thavelka.funfacts;

import android.graphics.Color;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.Random;


public class FunFactsActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare view variables, assign views from layout file
        final RelativeLayout factLayout = (RelativeLayout) findViewById(R.id.factLayout);
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        final Button showFactButton = (Button) findViewById(R.id.showFactButton);
        // Change background color
        int color = ColorWheel.getColor();
        factLayout.setBackgroundColor(color);

        // Change button text color
        showFactButton.setTextColor(color);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // Change background color
            int color = ColorWheel.getColor();
            factLayout.setBackgroundColor(color);

            // Change button text color
            showFactButton.setTextColor(color);

            // Update label to dynamic fact
            factLabel.setText(FactBook.getFact());
            }
        };

        showFactButton.setOnClickListener(listener);

    }

}
