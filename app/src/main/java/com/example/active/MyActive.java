package com.example.active;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MyActive extends AppCompatActivity {

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        switch (requestCode) {
            case 123:
                if (resultCode == RESULT_OK) {
                    String redata = data.getStringExtra("data_return");
                    Log.d("====返回值成功了====",redata);
                }
                break;
            default:
        }
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.my_layout);
        //创建按钮1
        Button button_one = findViewById(R.id.button_one);
        button_one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //弹框
                //Toast.makeText(MyActive.this, "欢迎进入！", Toast.LENGTH_SHORT).show();
                //销毁活动
                //fileList();
                //显示
                Intent intent = new Intent(MyActive.this, IntentShow.class);
                intent.putExtra("key", "values");
                //隐试
                //Intent intent=new Intent("com.example.active.ACTION_START");
                //startActivity(intent);
                //得到返回值
                startActivityForResult(intent, 123);
            }
        });


        //创建按钮2
        Button button_ones = findViewById(R.id.button_one_1);
        button_ones.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //网址
//                Intent intent=new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("https://blog.csdn.net/Z_Vivian/article/details/91840800"));
//                startActivity(intent);

                Intent intent = new Intent(MyActive.this, IntentHide.class);
                startActivity(intent);
            }
        });


        Button button_oness = findViewById(R.id.button_one_2);
        button_oness.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //显示
                Intent intent = new Intent(Intent.ACTION_VIEW);
                //隐试
                //Intent intent=new Intent("com.example.active.ACTION_START");
                intent.setData(Uri.parse("tel:10086"));
                startActivity(intent);
            }
        });

    }


    /**
     * 创建菜单
     *
     * @param menu
     * @return
     */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;

    }

    /**
     * 菜单绑定事件
     *
     * @param item
     * @return
     */
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
                Toast.makeText(this, "用户登录", Toast.LENGTH_SHORT).show();
                break;
            case R.id.remove_item:
                Toast.makeText(this, "用户退出", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
    }
}
