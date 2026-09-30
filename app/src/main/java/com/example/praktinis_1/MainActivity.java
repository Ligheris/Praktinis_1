package com.example.praktinis_1;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void changeText(View view) {
        TextView textView = findViewById(R.id.tvMain);
        textView.setText("Text has changed!");
    }

    public void changeColor(View view) {
        TextView textView = findViewById(R.id.tvMain);
        textView.setTextColor(Color.RED);
    }

    public void changeBackgroundColor(View view) {
        TextView textView = findViewById(R.id.tvMain);
        textView.setBackgroundColor(Color.YELLOW);
    }

    // kai jungiau branch su master is pat pradziu atrodo tsg padariau paprasta commit and push,
    // todel nera pakeistu eiluciu paciam merge.
}