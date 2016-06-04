package om.hanbit.user.mytest.kaup;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import om.hanbit.user.mytest.R;

public class KaupActivity extends Activity implements  View.OnClickListener{
    EditText etName,etWeight,etHeight;
    TextView resultCalc;
    String name,result;
    double weight,height;
    Button btnCal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = (EditText) findViewById(R.id.etName);
        etWeight = (EditText) findViewById(R.id.etWeight);
        etHeight = (EditText) findViewById(R.id.etHeight);
        btnCal = (Button) findViewById(R.id.btnCal);
    }
    @Override
    public void onClick(View v) {

        name = etName.getText().toString();
        weight = Double.parseDouble(etWeight.getText().toString());
        height = Double.parseDouble(etHeight.getText().toString());
        resultCalc = (TextView) findViewById(R.id.resultCalc);
        //  test = Integer.parseInt(etHeight.getText().toString());
        KaupService service = new KaupServiceImpl();
        result = service.getKaup(weight, height);

        resultCalc.setText(name + "님의 계산결과: " + result);

    }

}
