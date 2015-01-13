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
        Button showFactButton = (Button) findViewById(R.id.showFactButton);

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            // Change background color
            factLayout.setBackgroundColor(ColorWheel.getColor());

            // Update label to dynamic fact
            factLabel.setText(FactBook.getFact());
            }
        };

        showFactButton.setOnClickListener(listener);

    }

}
