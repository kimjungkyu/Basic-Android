package com.example.samplebutton2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * 레이아웃 만들기
 *
 * - 앱을 실행한 후 원하는 버튼을 하나 선택하면 그 레이아웃을 사용한 화면이 보입니다.
 * - 화면이 어떻게 만들어졌는지는 res/layout 폴더 밑의 해당 XML 레이아웃 파일을 보시면 됩니다.
 *
 * @author Mike
 *
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button2 = (Button) findViewById(R.id.button02);
        button2.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "두 번째 버튼이 클릭되었습니다.", Toast.LENGTH_LONG).show();
                setContentView(R.layout.table_layout);
            }

        });

    }

    public void onButton1Clicked(View v) {
        setContentView(R.layout.linear_layout);

        Button button1 = (Button) findViewById(R.id.button0);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "버튼이 클릭되었습니다.", Toast.LENGTH_LONG).show();
            }

        });

    }

    public void onButton2Clicked(View v) {
        setContentView(R.layout.table_layout);
    }

}
