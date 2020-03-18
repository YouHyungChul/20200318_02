package kr.co.tjoeun.a20200318_02;

//  엑티비티가 아니라, JAVA 클래스로 만든 파일.
// 모든 액티비티가 공통으로 사용하는 기능들을 묶어두는 클래스.
// 1) 이벤트 세팅, 2) 초기 값 세팅

import android.content.Context;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {
//    어차피 다른데서 다 오버라이딩 해서 쓸거니까 추상화 abstract 시키자.
//    메쏘드에 추상이 하나라도 있으면 class 도 추상화 시켜야함
    public Context mContext = this;
    public abstract void setupEvents();
    public abstract void setupValues();

}
