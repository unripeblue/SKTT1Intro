package com.seokyeong.the.sktt1intro;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONException;
import org.json.JSONObject;

import java.util.Calendar;
import java.util.GregorianCalendar;

import kr.co.tjeit.restaurant.util.ContextUtil;
import kr.co.tjeit.restaurant.util.ServerUtil;

/**
 * Created by the on 2017-09-18.
 */

public class SignupActivity extends BaseActivity {

    int year, month, day;


    boolean idCheck = false;
    private EditText userIdEdt;
    private Button idDuplChkBtn;
    private EditText userNameEdt;
    private EditText pwEdt;
    private EditText pwChkEdt;
    private RadioButton img1Btn;
    private android.widget.ImageView img1;
    private RadioButton img2Btn;
    private android.widget.ImageView img2;
    private RadioButton img3Btn;
    private android.widget.ImageView img3;
    private RadioButton img4Btn;
    private android.widget.ImageView img4;
    private RadioButton img5Btn;
    private android.widget.ImageView img5;
    private RadioButton img6Btn;
    private android.widget.ImageView img6;
    private Button selectBirthDayBtn;
    private TextView bitrhDayTxt;
    private Button signUpBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);
        bindViews();
        setValues();
        setupEvents();

    }


    @Override
    public void setupEvents() {
        final DatePickerDialog.OnDateSetListener dateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                String msg = String.format("%d년 %d월 %d일", year, monthOfYear + 1, dayOfMonth);
                bitrhDayTxt.setText(msg);
            }
        };

        selectBirthDayBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new DatePickerDialog(mContext, dateSetListener, year, month, day).show();
            }
        });

        idDuplChkBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ServerUtil.check_dupl_id(mContext, userIdEdt.getText().toString(), new ServerUtil.JsonResponseHandler() {
                    @Override
                    public void onResponse(JSONObject json) {
                        try {
                            idCheck = json.getBoolean("result");
                            if (!idCheck) {
                                AlertDialog.Builder alert = new AlertDialog.Builder(mContext);
                                alert.setTitle("중복 확인");
                                alert.setMessage("이미 사용중인 아이디입니다.");
                                alert.setPositiveButton("확인", null);
                                alert.show();
                            } else {
                                Toast.makeText(mContext, "사용 가능합니다.", Toast.LENGTH_SHORT).show();
                            }
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                });
            }
        });

        signUpBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alert = new AlertDialog.Builder(mContext);
                alert.setTitle("가입 실패");
                alert.setPositiveButton("확인", null);

                if (userIdEdt.getText().toString().equals("")) {
                    alert.setMessage("아이디가 입력되지 않았습니다.");
                    alert.show();
                    return;
                } else if (userNameEdt.getText().toString().equals("")) {
                    alert.setMessage("이름이 입력되지 않았습니다.");
                    alert.show();
                    return;
                } else if (pwEdt.getText().toString().equals("")) {
                    alert.setMessage("비밀번호가 입력되지 않았습니다.");
                    alert.show();
                    return;
                } else if (pwEdt.getText().toString().length() < 8) {
                    alert.setMessage("비밀번호가 너무 짧습니다.");
                    alert.show();
                    return;
                } else if (!pwEdt.getText().toString().equals(pwChkEdt.getText().toString())) {
                    alert.setMessage("입력하신 비밀번호와 확인 비밀번호가 다릅니다.");
                    alert.show();
                    return;
                } else if (bitrhDayTxt.getText().toString().equals("")) {
                    alert.setMessage("생일이 선택되지 않았습니다.");
                    alert.show();
                    return;
                }


                ServerUtil.sign_up(mContext,
                        userIdEdt.getText().toString(),
                        pwEdt.getText().toString(),
                        userNameEdt.getText().toString(),
                        "tempURL",
                        bitrhDayTxt.getText().toString(),
                        ContextUtil.getToken(mContext),
                        new ServerUtil.JsonResponseHandler() {
                            @Override
                            public void onResponse(JSONObject json) {
                                try {
                                    if (json.getBoolean("result")) {
                                        Toast.makeText(mContext, "회원가입이 완료되었습니다.", Toast.LENGTH_SHORT).show();
                                        Intent myIntent = new Intent(SignupActivity.this, MainActivity.class);
                                        startActivity(myIntent);
                                        finish();
                                    } else {
                                        Toast.makeText(mContext, "회원가입에 실패했습니다. 아이디 변경후에 다시 시도해주세요.", Toast.LENGTH_SHORT).show();
                                    }
                                } catch (JSONException e) {
                                    e.printStackTrace();
                                }
                            }
                        });
            }
        });
    }

    @Override
    public void setValues() {
        GregorianCalendar calendar = new GregorianCalendar();
        year = calendar.get(Calendar.YEAR);
        month = calendar.get(Calendar.MONTH);
        day = calendar.get(Calendar.DAY_OF_MONTH);
    }


    @Override
    public void bindViews() {
        this.signUpBtn = (Button) findViewById(R.id.signUpBtn);
        this.bitrhDayTxt = (TextView) findViewById(R.id.bitrhDayTxt);
        this.selectBirthDayBtn = (Button) findViewById(R.id.selectBirthDayBtn);
        this.img6 = (ImageView) findViewById(R.id.img6);
        this.img6Btn = (RadioButton) findViewById(R.id.img6Btn);
        this.img5 = (ImageView) findViewById(R.id.img5);
        this.img5Btn = (RadioButton) findViewById(R.id.img5Btn);
        this.img4 = (ImageView) findViewById(R.id.img4);
        this.img4Btn = (RadioButton) findViewById(R.id.img4Btn);
        this.img3 = (ImageView) findViewById(R.id.img3);
        this.img3Btn = (RadioButton) findViewById(R.id.img3Btn);
        this.img2 = (ImageView) findViewById(R.id.img2);
        this.img2Btn = (RadioButton) findViewById(R.id.img2Btn);
        this.img1 = (ImageView) findViewById(R.id.img1);
        this.img1Btn = (RadioButton) findViewById(R.id.img1Btn);
        this.pwChkEdt = (EditText) findViewById(R.id.pwChkEdt);
        this.pwEdt = (EditText) findViewById(R.id.pwEdt);
        this.userNameEdt = (EditText) findViewById(R.id.userNameEdt);
        this.idDuplChkBtn = (Button) findViewById(R.id.idDuplChkBtn);
        this.userIdEdt = (EditText) findViewById(R.id.userIdEdt);
    }
}
