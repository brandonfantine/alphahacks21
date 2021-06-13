package com.example.alphahacks21;

import androidx.appcompat.app.AppCompatActivity;
import android.app.SearchManager;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class Locator extends AppCompatActivity {

    Button b_continue;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_locator);

        //allows for the input of a location
        editText = findViewById(R.id.editTextTextPostalAddress);
        b_continue = findViewById(R.id.button2);

        //sends the string "location" to the findRest method if the button "continue" is clicked
        b_continue.setOnClickListener(v -> {
            String location = editText.getText().toString();
            if(!location.equals("")) {
                findRest(location);
            }
        });

    }

    //calls the string created in FlavorPicker and searches the web for restaurants in that category near the given location
    public void findRest(String words){
        Intent intent = new Intent(Intent.ACTION_WEB_SEARCH);
            String flavor = getIntent().getStringExtra("pickedFlavor");
        intent.putExtra(SearchManager.QUERY, ( "Restaurants near " + words + " :" + flavor ));
        startActivity(intent);
    }
}
