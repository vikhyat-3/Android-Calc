package com.example.a1rn19cs180_calc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    Button btn1, btn2 ,btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1= findViewById(R.id.button7);
        btn2= findViewById(R.id.button8);
        btn3= findViewById(R.id.button9);
        btn4= findViewById(R.id.button4);
        btn5= findViewById(R.id.button5);
        btn6= findViewById(R.id.button6);
        btn7= findViewById(R.id.button);
        btn8= findViewById(R.id.button2);
        btn9= findViewById(R.id.button3);
        btn0=findViewById(R.id.button10);

        // apply setOnClickListener over buttons
        btn1.setOnClickListener((View.OnClickListener) this);
        btn2.setOnClickListener((View.OnClickListener) this);
        btn3.setOnClickListener((View.OnClickListener) this);
        btn4.setOnClickListener((View.OnClickListener) this);
        btn5.setOnClickListener((View.OnClickListener) this);
        btn6.setOnClickListener((View.OnClickListener) this);
        btn7.setOnClickListener((View.OnClickListener) this);
        btn8.setOnClickListener((View.OnClickListener) this);
        btn9.setOnClickListener((View.OnClickListener) this);
        btn0.setOnClickListener((View.OnClickListener) this);
    }

    public void onClick(View v) {

        switch (v.getId()){

            // cases applied over different buttons
            case R.id.button:

                // Toast message appears when button pressed
                Toast.makeText(this, "button pressed", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button2:

                Toast.makeText(this, "button2 pressed", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button3:

                Toast.makeText(this, "button3 pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button4:

                // Toast message appears when button pressed
                Toast.makeText(this, "button4 pressed", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button5:

                Toast.makeText(this, "button5 pressed", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button6:

                Toast.makeText(this, "button6 pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button7:

                // Toast message appears when button pressed
                Toast.makeText(this, "button7 pressed", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button8:

                Toast.makeText(this, "button8 pressed", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button9:

                Toast.makeText(this, "button9 pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button10:

                Toast.makeText(this, "button10 pressed", Toast.LENGTH_SHORT).show();
                break;
            case R.id.button11:

                Toast.makeText(this, "button11 pressed", Toast.LENGTH_SHORT).show();
                break;

            case R.id.button12:

                Toast.makeText(this, "button12 pressed", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
