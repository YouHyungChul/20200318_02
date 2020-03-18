package kr.co.tjoeun.a20200318_02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
//부모를 바꾸고 난뒤 빨간색 뜨면 ALT + ENter (에러줄에서)
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        1) 이벤트 설정
//        2) 초기 화면 값 세팅 .setText등
//        + main함수는 가능한한 적은 코드만 남기자.
//         => onCreate메쏘드도 가능한 깔끔하게 정리.

        setupEvents();
        setupValues();




    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setupValues() {

    }
}
