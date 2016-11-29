package com.example.db.interactiveapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private InteractiveAppTest appTest = new InteractiveAppTest();
    //Call when the user clicks the button
    public void getItemFromSpinner(View view)
    {
        TextView textView = (TextView) findViewById(R.id.textView);
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        String data = String.valueOf(spinner.getSelectedItem());
        List<String> brandsList = appTest.getBrands(data);
        StringBuilder brandsFormatted = new StringBuilder();
        for (String brand : brandsList) {
            brandsFormatted.append(brand).append('\n');
        }
        textView.setText(brandsFormatted);
    }
}
