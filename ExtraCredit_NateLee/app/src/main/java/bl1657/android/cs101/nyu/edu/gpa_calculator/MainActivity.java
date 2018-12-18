package bl1657.android.cs101.nyu.edu.gpa_calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.view.View;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

import org.w3c.dom.Text;


public class MainActivity extends AppCompatActivity {

    private EditText Name;
    private EditText Midterm1;
    private EditText Midterm2;
    private EditText Homework;
    private EditText Final;
    private Button CalculateGrade;

    private TextView input;
    private TextView Gradeouput;
    private TextView NameOutput;
    private TextView LetterOutput;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Name =(EditText)findViewById(R.id.Name);
        Midterm1 =(EditText)findViewById(R.id.Midterm1);
        Midterm2 =(EditText)findViewById(R.id.Midterm2);
        Homework=(EditText)findViewById(R.id.Homework);
        Final =(EditText)findViewById(R.id.Final);
        CalculateGrade=(Button)findViewById(R.id.calculateGrade);

        Gradeouput=(TextView)findViewById(R.id.gOutput);
        NameOutput=(TextView)findViewById(R.id.nOutput);
        LetterOutput=(TextView)findViewById(R.id.lGrade);






        CalculateGrade.setOnClickListener(new View.OnClickListener(){
        public void onClick(View v){
            Midterm1.getText().toString();
            Midterm2.getText().toString();
            Final.getText().toString();
            Homework.getText().toString();
            String content=Name.getText().toString();





         double mid1Grade=Double.valueOf(Midterm1.getText().toString());
            double mid2Grade=Double.valueOf(Midterm2.getText().toString());
            double finalGrade=Double.valueOf(Final.getText().toString());
            double hwGrade=Double.valueOf(Homework.getText().toString());
            double result=mid1Grade*0.20+mid2Grade*0.25+hwGrade*0.2+finalGrade*0.35;


            if(result>= 93) LetterOutput.setText("A");
            else if(result>=90) LetterOutput.setText("A-");
            else if(result>=87) LetterOutput.setText("B+");
            else if(result>=83) LetterOutput.setText("B");
            else if(result>=80) LetterOutput.setText("B-");
            else if (result>=70) LetterOutput.setText("C");
            else if(result>=60) LetterOutput.setText("D");
            else LetterOutput.setText("F");

            Gradeouput.setText(String.valueOf(result));
            NameOutput.setText(content);



            }





        });

    }






}
