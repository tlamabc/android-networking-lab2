package com.example.ss2lab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class lab2b1 extends AppCompatActivity {
    TextView tvResult;
    EditText edName, edScore;
    String link;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //http://192.168.101.158:8011/my-web/student_GET.php?name=Tlam&score=2
        setContentView(R.layout.activity_lab2b1);
//        String
            link = "http://192.168.101.158:8011/my-web/student_GET.php";
        tvResult = (TextView) findViewById(R.id.tvResult);
        edName = (EditText) findViewById(R.id.edName);
        edScore = (EditText) findViewById(R.id.edScore);
    }
    public void LoadData(View view){
        StudentAsyncTask asyncTask = new StudentAsyncTask(this, link,edName.getText().toString(), edScore.getText().toString(),tvResult);
        asyncTask.execute();

    }
}