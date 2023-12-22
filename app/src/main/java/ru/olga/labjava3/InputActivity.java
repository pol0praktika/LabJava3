package ru.olga.labjava3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class InputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText editTextNumber = findViewById(R.id.editTextNumber);
        Button buttonNext = findViewById(R.id.buttonNext);

        buttonNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String inputText = editTextNumber.getText().toString();

                if (!inputText.isEmpty()) {
                    int count = Integer.parseInt(inputText);
                    startDisplayActivity(count);
                }
            }
        });
    }

    private void startDisplayActivity(int count) {
        Intent intent = new Intent(this, DisplayActivity.class);
        intent.putExtra("count", count);
        startActivity(intent);
    }
}