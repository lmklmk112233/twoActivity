package com.example.limingkun.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    private TextView username_Tv1;
    private  TextView pw_Tv1;
    private Button button_Fan1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        username_Tv1= (TextView) findViewById(R.id.username_tv1);
        pw_Tv1= (TextView) findViewById(R.id.pw_tv1);
        button_Fan1= (Button) findViewById(R.id.button_fan1);


        final Intent intent=getIntent();
        String name1=intent.getStringExtra("name1");
        username_Tv1.setText(name1);
        String pw1=intent.getStringExtra("pw1");
        pw_Tv1.setText(pw1);

        button_Fan1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user1=username_Tv1.getText().toString();
                String psw1=pw_Tv1.getText().toString();
                Intent result=new Intent();
                result.putExtra("u1",user1);
                result.putExtra("p1",psw1);
                setResult(0,result);
                finish();

            }
        });


    }
}
