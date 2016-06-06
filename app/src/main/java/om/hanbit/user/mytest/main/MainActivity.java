package om.hanbit.user.mytest.main;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import om.hanbit.user.mytest.Calc.CalcActivity;
import om.hanbit.user.mytest.Login.LoginActivity;
import om.hanbit.user.mytest.R;
import om.hanbit.user.mytest.kaup.KaupActivity;


public class MainActivity extends Activity  implements  View.OnClickListener {

            @Override
         protected void onCreate(Bundle savedInstanceState) {
                   super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

            //    button4 = (Button) findViewById(R.id.button4);
             //   button5 = (Button) findViewById(R.id.button5);

                ((Button) findViewById(R.id.btnKaup)).setOnClickListener(this);
                ((Button) findViewById(R.id.btnLogin)).setOnClickListener(this);
                ((Button) findViewById(R.id.btnCalc)).setOnClickListener(this);
   /*             button4.setOnClickListener(this);
                button5.setOnClickListener(this);*/
                     }


    @Override
    public void onClick(View v) {
        String Rs;
        switch (v.getId()) {
            case R.id.btnKaup:
                startActivity(new Intent(this, KaupActivity.class));
                break;
            case R.id.btnCalc:
                startActivity(new Intent(this, CalcActivity.class));
                break;
            case R.id.btnLogin:;
                startActivity(new Intent(this, LoginActivity.class));
                break;
        }
    }
}
