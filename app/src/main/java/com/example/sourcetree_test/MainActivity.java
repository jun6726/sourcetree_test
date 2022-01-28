package com.example.sourcetree_test;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this.getApplicationContext(), "Toast1 DRFN mac", Toast.LENGTH_SHORT).show();
        //Toast.makeText(this.getApplicationContext(), "Toast2 DRFN mac2", Toast.LENGTH_SHORT).show()

        //SourceTree commit& push > Toast2 주석 처리
        
        Toast.makeText(this.getApplicationContext(), "Toast3 GitHub", Toast.LENGTH_SHORT).show();
        // Github 수정 > 커밋 체인지 하면 푸시도 되는지 확인
    }
}
