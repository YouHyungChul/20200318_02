package kr.co.tjoeun.a20200318_02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import kr.co.tjoeun.a20200318_02.datas.User;

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

//        Intent로 UserInfoActivity 실행.
//        사용자 이름 / 생년 전달.   +  성별 / 잔고 / 아이디 / 닉네임까지 전달해볼까
//        ==> User 클래스를 한번에 전달하면 편하다!
//        데이터 전달을 간으하게 하려면, 해당 클래스 Serializable 역활 수행 명시.
        User u = new User("조경진", 1988);

        Intent intent = new Intent(MainActivity.this, UserInfoActivity.class);
        intent.putExtra("userInfo","이름");


    }

    @Override
    public void setupValues() {

    }
}
