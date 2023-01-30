package com.example.gpa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText editStudentName,editMath,editGeo,editTotal,editAve,editGrade;
    Button ok,clearbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editStudentName=findViewById(R.id.stname);
        editMath=findViewById(R.id.mark1);
        editGeo=findViewById(R.id.mark2);
        editTotal=findViewById(R.id.total);
        editAve=findViewById(R.id.avg);
        editGrade=findViewById(R.id.grade);
        ok=findViewById(R.id.btn1);
        clearbtn=findViewById(R.id.btn2);



        clearbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                clear();
            }
        });

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                calculate();

            }
        });




    }

    public void calculate() {
        int userInput1, userInput2, tot;
        double avg;
        String grade;
        int numberOfLessons;

        // input integer and transfer to string
        userInput1 = Integer.parseInt(editMath.getText().toString());
        userInput2 = Integer.parseInt(editGeo.getText().toString());

        tot = userInput1 + userInput2;

        editTotal.setText(String.valueOf(tot));

        avg = tot/2;

        editAve.setText(String.valueOf(avg));

        if (avg > 90) {
            editGrade.setText("A");
        } else if (avg > 75) {
            editGrade.setText("B");
        } else if (avg > 55) {
            editGrade.setText("C");
        } else if (avg > 40) {
            editGrade.setText("D");
        } else
        {
            editGrade.setText("Fail");
        }

    }

    public void clear()
    {
        editStudentName.setText("");
        editMath.setText("");
        editGeo.setText("");
        editTotal.setText("");
        editAve.setText("");
        editGrade.setText("");
        editStudentName.requestFocus();




    }
}