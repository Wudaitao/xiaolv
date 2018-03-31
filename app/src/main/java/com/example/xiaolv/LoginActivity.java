package com.example.xiaolv;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import static com.example.xiaolv.R.id.btn_login;
import static com.example.xiaolv.R.id.et_password;
import static com.example.xiaolv.R.id.et_usertel;

public class LoginActivity extends BaseActivity{

    private EditText et_usertelEdit;
    private EditText et_passwordEdit;
    private Button btn_login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        et_usertelEdit=(EditText) findViewById(R.id.et_usertel);
        et_passwordEdit=(EditText) findViewById(R.id.et_password);
        btn_login=(Button) findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String et_usertel=et_usertelEdit.getText().toString();
                String et_password=et_passwordEdit.getText().toString();
                if(et_usertel.equals("15923818625") && et_password.equals("568161234wu")){
                    Intent intent=new Intent(LoginActivity.this,MainActivity.class);
                    startActivity(intent);
                    finish();
                }else{
                    Toast.makeText(LoginActivity.this,"usertel or password is invalid",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
