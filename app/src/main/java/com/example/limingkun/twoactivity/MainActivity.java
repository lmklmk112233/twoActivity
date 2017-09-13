package com.example.limingkun.twoactivity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
private Button button_Denglu;
    private Button button_Zhuce;
    private EditText username_Et,pw_Et;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_Denglu= (Button) findViewById(R.id.butten_denglu);
        username_Et= (EditText) findViewById(R.id.username_et);
        pw_Et= (EditText) findViewById(R.id.pw_et);
        //username_Et1= (EditText) findViewById(R.id.username_et);
        //pw_Et1= (EditText) findViewById(R.id.pw_et);
        button_Zhuce= (Button) findViewById(R.id.button_zhuce);

        button_Denglu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               //跳转到第二个界面
                Intent intent =new Intent();
                intent.setClass(MainActivity.this,Main2Activity.class);
                String a= username_Et.getText().toString();
                intent.putExtra("name",a);




                String b=pw_Et.getText().toString();
                intent.putExtra("pw",b);

                startActivityForResult(intent,1);
            }
        });
        button_Zhuce.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //跳转到第三个界面
                Intent intent =new Intent();
                intent.setClass(MainActivity.this,Main3Activity.class);
                String a1= username_Et.getText().toString();
                intent.putExtra("name1",a1);




                String b1=pw_Et.getText().toString();
                intent.putExtra("pw1",b1);

                startActivityForResult(intent,0);
            }
        });
    }
//生命周期复写
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        String use=data.getStringExtra("u");
        String ps=data.getStringExtra("p");
        username_Et.setText(use);
        pw_Et.setText(ps);


        String use1=data.getStringExtra("u1");
        String ps1=data.getStringExtra("p1");
        username_Et.setText(use1);
        pw_Et.setText(ps1);
    }

}
