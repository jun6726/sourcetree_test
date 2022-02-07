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
        Toast.makeText(this.getApplicationContext(), "Toast3-1 GitHub", Toast.LENGTH_SHORT).show();
        // Github 수정 > 커밋 체인지 하면 푸시도 되는지 확인

        //풀하지 않고 깃허브에서 수정한 코드 그대로 가져오고 토스트 메시지만 3-1로 변경 커밋 시도 >>
        //풀하지 않은 상태에서 안드로이드스튜디오에서 수정했더니 깃에서 커밋한 내용은 자동으로 브랜치 생성되서 분기점 발생
        //커밋까지 완료 푸시되는지 커밋&푸시로 확인

        //풀 안하고 푸시했을때 발생하는 에러
//        Pushing to https://github.com/jun6726/sourcetree_test.git
//        To https://github.com/jun6726/sourcetree_test.git
//        ! [rejected]        master -> master (non-fast-forward)
//        error: failed to push some refs to 'https://github.com/jun6726/sourcetree_test.git'
//        hint: Updates were rejected because the tip of your current branch is behind
//        hint: its remote counterpart. Integrate the remote changes (e.g.
//                hint: 'git pull ...') before pushing again.
//                hint: See the 'Note about fast-forwards' in 'git push --help' for details.// ! [rejected]        master -> master (non-fast-forward)


        //내용 수정 후 풀하고 푸시하기

        //mergeTest 브랜치 생성
        //mergeTest 브랜치 생성2

    }
}