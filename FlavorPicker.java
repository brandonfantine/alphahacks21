package com.example.alphahacks21;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FlavorPicker extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flavor_picker);
    }

    //creates a callable string of what food option was picked and transitions to the Locator activity
    public void nextPage(View view){
        Intent intent = new Intent(this, Locator.class);
            Button b_flavor = (Button) findViewById(view.getId());
            String pickedFlavor = b_flavor.getText().toString();
        intent.putExtra("pickedFlavor", pickedFlavor );
        startActivity(intent);
    }
}