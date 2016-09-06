package com.example.lyt.c7;

import android.content.DialogInterface;
import android.net.Uri;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Layout;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.common.api.GoogleApiClient;

public class MainActivity extends AppCompatActivity {

    /**
     * ATTENTION: This was auto-generated to implement the App Indexing API.
     * See https://g.co/AppIndexing/AndroidStudio for more information.
     */
    LinearLayout layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
     //   final EditText username=(EditText)findViewById(R.id.username) ;

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);
                layout=(LinearLayout)getLayoutInflater().inflate(R.layout.alertdialog,null);
                builder .setTitle("登录");
                builder.setView(layout);
                builder.setNegativeButton("取消",new cancel());
                builder.setPositiveButton("确定",new ok());
                builder.create();
                builder.show();
            }
            class cancel implements DialogInterface.OnClickListener{

                @Override
                public void onClick(DialogInterface dialog, int which) {

                }
            }
            class ok implements DialogInterface.OnClickListener{
                @Override
                public void onClick(DialogInterface dialog, int which) {
                    // TODO Auto-gengerated method stub
                    EditText username=(EditText)layout.findViewById(R.id.username);
                    EditText password=(EditText)layout.findViewById(R.id.password);
                    String s=username.getText().toString();
                    String p=password.getText().toString();
                    String b="abc";
                    String c="123";
                //   Log.e("mytext",s);
                 //   Log.v("mytext",b);
                    if(s.equals(b)&& p.equals(c)){
                        Toast.makeText(MainActivity.this,"登录成功",Toast.LENGTH_LONG).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this,"用户名密码不正确",Toast.LENGTH_LONG).show();
                    }
                }
            }
        });
    }
}
