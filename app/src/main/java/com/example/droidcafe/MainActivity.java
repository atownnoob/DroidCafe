package com.example.droidcafe;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    // declare member of Fab
    public FloatingActionButton mFab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create member element of the fab button
        mFab = findViewById(R.id.fab);
        // set onClick listener, need to pass in a view
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, OrderActivity.class);
                startActivity(intent);
            }
        });

        // alternative approach that worked, define a private method and call with this
//        mFab.setOnClickListener(this::onClickNew)z

    }

    private void onClickNew(View view) {
        Intent intent = new Intent(MainActivity.this, OrderActivity.class);
        startActivity(intent);
    }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    // Shows a message that the donut image was clicked
    public void showDonutOrder(View view) {
        displayToast(getString(R.string.donut_order_message));
    }

    // Shows a message that the ice cream image was clicked
    public void showIceCreamOrder(View view) {
        displayToast(getString(R.string.ice_cream_order_message));
    }

    // Shows a message that the donut image was clicked
    public void showFroyoOrder(View view) {
        displayToast(getString(R.string.froyo_order_message));
    }

}