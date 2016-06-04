package om.hanbit.user.mytest.kaup;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import om.hanbit.user.mytest.R;
import om.hanbit.user.mytest.main.MainActivity;

public class KaupActivity extends Activity implements  View.OnClickListener{
    EditText etName,etWeight,etHeight;
    TextView resultCalc;
    String name,result;
    double weight,height;
    Button btnCal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kaup);
        etName = (EditText) findViewById(R.id.etName);
        etWeight = (EditText) findViewById(R.id.etWeight);
        etHeight = (EditText) findViewById(R.id.etHeight);
         ((Button) findViewById(R.id.btnCal)).setOnClickListener(this);
        ((Button) findViewById(R.id.btnMain1)).setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        Toast tMsg =Toast.makeText(KaupActivity.this,"토스트 연스",Toast.LENGTH_LONG);

        switch (v.getId()) {
            case  R.id.btnCal :
            name = etName.getText().toString();
            weight = Double.parseDouble(etWeight.getText().toString());
            height = Double.parseDouble(etHeight.getText().toString());
            resultCalc = (TextView) findViewById(R.id.resultCalc);
            //  test = Integer.parseInt(etHeight.getText().toString());
            Log.d(result, "카우프지수");
            break;
            case  R.id.btnMain1:
                startActivity(new Intent(this, MainActivity.class));
                break;
        }
    }
}