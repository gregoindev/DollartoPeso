package com.gregorilla.dollartopeso;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText convertEditText;
    private Button convertButton;
    private TextView resultTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String dollarString = convertEditText.getText().toString();

                String results = String.valueOf(convertDollar(dollarString));
                resultTextView.setText("$" + dollarString + " = " + results + "PHP");
            }
        });

    }

    private void findViews(){
        convertEditText = findViewById(R.id.convert_edit_text);
        convertButton = findViewById(R.id.convert_button);
        resultTextView = findViewById(R.id.result_text_view);
    }

    private double convertDollar(String dollarString){
        int dollarInt = Integer.parseInt(dollarString);
        double result = dollarInt * 54.79;
        return result;


    }
}