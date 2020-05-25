package com.example.login_demo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.KeyEventDispatcher;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    View relativeLayout;
    Button mRegister;
    View mRemember;
    boolean IsRem;
    Button mLogin;
    ImageView icon_rem;
    TextView mfindPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        IsRem=false;


        relativeLayout=(View)findViewById(R.id.id_bg_Login);
        relativeLayout.getBackground().setAlpha(220);
        mRegister=findViewById(R.id.id_register);
        mRemember=(View)findViewById(R.id.remember_me);
        icon_rem=findViewById(R.id.icon_rem);
        mLogin=(Button)findViewById(R.id.id_login);
        mfindPassword=findViewById(R.id.id_findpassword);
        mRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ComponentName componentName=new ComponentName(MainActivity.this,RegisterActivity.class);
                Intent intent=new Intent();
                intent.setComponent(componentName);
                startActivity(intent);
            }
        });
        mLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "此功能尚未开发，请等待", Toast.LENGTH_SHORT).show();

            }
        });
        mRemember.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 IsRem=!IsRem;
                 if(IsRem==true){
                     icon_rem.setImageResource(R.drawable.remember);
                 }else{
                     icon_rem.setImageResource(R.drawable.unrem);
                 }
            }
        });
        mfindPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent();
                intent.setAction("more");
                intent.addCategory("third");
                startActivity(intent);
            }
        });
    }
}
