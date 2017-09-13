package com.example.limingkun.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
private TextView username_Tv;
    private  TextView pw_Tv;
    private Button button_Fan;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        username_Tv= (TextView) findViewById(R.id.username_tv);
        pw_Tv= (TextView) findViewById(R.id.pw_tv);
        button_Fan= (Button) findViewById(R.id.button_fan);


        final Intent intent=getIntent();
        String name=intent.getStringExtra("name");
        username_Tv.setText(name);
        String pw=intent.getStringExtra("pw");
        pw_Tv.setText(pw);

         button_Fan.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 String user=username_Tv.getText().toString();
                 String psw=pw_Tv.getText().toString();
                 Intent result=new Intent();
                 result.putExtra("u",user);
                 result.putExtra("p",psw);
                 setResult(1,result);
                 finish();

              }
         });


    }
}
