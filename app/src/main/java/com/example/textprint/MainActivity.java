package com.example.textprint;


import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
       EditText editText;
       Button print;
       TextView textView;


       @Override
       protected void onCreate(Bundle savedInstanceState) {
              super.onCreate(savedInstanceState);
              setContentView(R.layout.activity_main);




              editText = findViewById(R.id.editTextText);


              print = findViewById(R.id.printButton);


              textView = findViewById(R.id.textview);


              print.setOnClickListener(new View.OnClickListener() {
                     @Override
                     public void onClick(View view) {
                            printText();
                     }
              });




       }


       public void printText(){
              String text = editText.getText().toString();
              textView.setText(text);
       }


}
