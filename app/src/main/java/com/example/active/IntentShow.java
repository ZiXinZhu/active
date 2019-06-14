package com.example.active;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class IntentShow extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_show);
        Intent intentkey=getIntent();
        String data=intentkey.getStringExtra("key");
        Log.d("====终于获取到数了====",data);


        Button button=findViewById(R.id.button_two);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Intent intent=new Intent(IntentShow.this,MyActive.class);
//                startActivity(intent);
                Intent intent=new Intent();
                intent.putExtra("data_return","返回值ok");
                setResult(RESULT_OK,intent);
                finish();
            }
        });
    }
}
