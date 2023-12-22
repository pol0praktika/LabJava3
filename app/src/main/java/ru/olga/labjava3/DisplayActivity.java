package ru.olga.labjava3;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DisplayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);

        TextView textViewDisplay = findViewById(R.id.textViewDisplay);

        // Получаем количество из предыдущей активити
        int count = getIntent().getIntExtra("count", 0);

        // Создаем текст, который будет отображаться столько раз, сколько указано в числе
        StringBuilder displayText = new StringBuilder();
        for (int i = 0; i < count; i++) {
            displayText.append("Текст " + (i + 1) + "\n");
        }

        textViewDisplay.setText(displayText.toString());
    }
}