package com.example.administrator.hello_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void fireOnlick(View view) {
        //相同多个组件共用一个响应方法，判断取得的ID值

        ImageButton imgb=findViewById(R.id.img);

        if (view.getId()==R.id.fire1){// ID 为int 型

            imgb.setImageResource(R.drawable.fire1);//java中获得图片的setImageResouuce代码和xml中src不同

        }else if(view.getId()== R.id.fire2){
            imgb.setImageResource(R.drawable.fire2);
        }else if(view.getId()== R.id.fire3){
            imgb.setImageResource(R.drawable.fire3);
        }else if (view.getId()== R.id.fire4){
            imgb.setImageResource(R.drawable.fire4);
        }
        //ID为int型的应用
//        int btID=0;
//        btID= R.id.fire1;
//        imgb.setImageResource(btID);

        //background 比src在xml中显示完整图片
    }
}
