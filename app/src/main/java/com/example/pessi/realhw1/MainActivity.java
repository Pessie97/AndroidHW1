package com.example.pessi.realhw1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText mNumber;
    private Button mButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mNumber = findViewById(R.id.TextInput);
        mButton = findViewById(R.id.button_input);
        mButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView inputData;
                inputData = findViewById(R.id.views);

                String input= mNumber.getText().toString();
                inputData.setText(input);

            }
        });
    }
}