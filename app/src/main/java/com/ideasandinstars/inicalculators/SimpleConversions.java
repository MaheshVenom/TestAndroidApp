package com.ideasandinstars.inicalculators;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.EditText;
import android.widget.Button;


public class SimpleConversions extends AppCompatActivity {

    // My Variables
    int spinnerPosition;
    Spinner conversionOptions;
    EditText eT;
    Button btn;
    TextView txtVw;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_simple_conversions);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        // My code


        conversionOptions = (Spinner)findViewById(R.id.conversionOptions);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,R.array.optionsList,android.R.layout.simple_dropdown_item_1line);
        conversionOptions.setAdapter(adapter);

        conversionOptions.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
               // Toast.makeText(getBaseContext(), parent.getItemAtPosition(position) + " is Selected", Toast.LENGTH_LONG).show();
                spinnerPosition = position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });

        eT = (EditText) findViewById(R.id.editText);
       // eT.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_SIGNED);
        btn = (Button) findViewById(R.id.button2);
        txtVw = (TextView) findViewById(R.id.resultView);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String spinnerSelection = conversionOptions.getSelectedItem().toString();
                String s;

                s = eT.getText().toString();

                Double input;
                input = Double.parseDouble(s);

                //Toast.makeText(this,"EditText Value is "+input,Toast.LENGTH_LONG).show();

                if(spinnerSelection.equals("Convert Kilometer to Mile"))
                {
                    //Toast.makeText(this,"This is inside IFFF "+input,Toast.LENGTH_LONG).show();
                    double output;
                    output = (input/1.609344);
                    String res = String.valueOf(output);
                    txtVw.setText(res);
                }

                if(spinnerSelection.equals("Convert Celsius to Farenheit"))
                {
                    //Toast.makeText(this,"This is inside IFFF "+input,Toast.LENGTH_LONG).show();
                    double output;
                    output = ((input) * 1.8) + 32;
                    String res = String.valueOf(output);
                    txtVw.setText(res);
                }

                if(spinnerSelection.equals("Convert Kilogram to Pound"))
                {
                    //Toast.makeText(this,"This is inside IFFF "+input,Toast.LENGTH_LONG).show();
                    double output;
                    output = (input) * 2.2046;
                    String res = String.valueOf(output);
                    txtVw.setText(res);
                }

                if(spinnerSelection.equals("Convert Inches to Meters"))
                {
                    //Toast.makeText(this,"This is inside IFFF "+input,Toast.LENGTH_LONG).show();
                    double output;
                    output = (input/39.370);
                    String res = String.valueOf(output);
                    txtVw.setText(res);
                }
            }
        });



        // End of my code

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }



}
