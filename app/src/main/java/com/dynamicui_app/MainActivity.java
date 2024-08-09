package com.dynamicui_app;

import static android.content.ContentValues.TAG;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private RadioGroup radioGroup;
    RadioButton radioButton1, radioButton2,radioButton3,radioButton4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = findViewById(R.id.groupradio);
        radioButton1 = findViewById(R.id.radio_id1);
        radioButton2 = findViewById(R.id.radio_id2);
        radioButton3 = findViewById(R.id.radio_id3);
        radioButton4 = findViewById(R.id.radio_id4);

        radioGroup.clearCheck();

        radioGroup.setOnCheckedChangeListener(
                new RadioGroup.OnCheckedChangeListener() {
                    @Override
                    public void onCheckedChanged(RadioGroup group, int checkedId) {
                        // Retrieve the selected RadioButton
                        RadioButton radioButton = findViewById(checkedId);
                        if (radioButton != null) {
                            Log.d(TAG, "Selected RadioButton: " + radioButton.getText().toString());

                            // Create an intent to start the MainActivity3
                            Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                            // Pass the text of the selected RadioButton
                            intent.putExtra("selectedOptionText", radioButton.getText().toString());
                            startActivity(intent);
                        }
                    }
                });
    }
}
