package om.hanbit.user.mytest.calc;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import om.hanbit.user.mytest.R;
import om.hanbit.user.mytest.main.MainActivity;

public class CalcActivity extends Activity implements View.OnClickListener{

    EditText input01,input02;
    Button btnPlus,btnMinus,btnMulti,btnDivi,btnRest;
    TextView textResult;
    int num1,num2,result;
     CalcService service;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc);
        service = new CalcServiceImpl();

        textResult = (TextView) findViewById(R.id.textResult);

        ((Button) findViewById(R.id.btnPlus)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnMinus)).setOnClickListener(this);
        ( (Button) findViewById(R.id.btnMulti)).setOnClickListener(this);
        ( (Button) findViewById(R.id.btnDivi)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnRest)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnMain2)).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.btnMain2) {
             startActivity(new Intent(this, MainActivity.class));

        }
        else
        {
        input01 = (EditText) findViewById(R.id.input01);
        num1 = Integer.parseInt(input01.toString());
        input02 = (EditText) findViewById(R.id.input02);
        num2 = Integer.parseInt(input02.toString());
            int result=0;
        switch (v.getId())

    {
        case R.id.btnPlus:
            result=service.plus(num1, num2);
            break;
        case R.id.btnMinus:
            result= service.minus(num1, num2);
            break;
        case R.id.btnMulti:
            result=service.multi(num1, num2);
            break;
        case R.id.btnDivi:
            result=service.divide(num1, num2);
            break;
        case R.id.btnRest:
            result=service.nmg(num1, num2);
            break;
    }
            textResult.setText("계산결과 + " + result);
        }
    }
}