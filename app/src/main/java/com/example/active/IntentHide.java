package com.example.active;

import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class IntentHide extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_hide);

        //创建按钮2
        Button button_three = findViewById(R.id.button_three);
        button_three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //显示
                Intent intent=new Intent(Intent.ACTION_VIEW);
                //隐试
                //Intent intent=new Intent("com.example.active.ACTION_START");
                intent.setData(Uri.parse("https://blog.csdn.net/Z_Vivian/article/details/91840800"));
                startActivity(intent);
            }
        });
    }
}
