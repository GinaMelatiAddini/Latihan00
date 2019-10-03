package id.ac.poliban.mi.latihan00;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //activity_main.xml dijadikan  antarmuka oleh project android kita
        setContentView(R.layout.activity_main);

        //mengenalkan/mengkaitkan komponen (view) yang ada di dalam layout
        //sehingga dikenali sebagai variabel/object dalam source code java kita
        Button btFirst = findViewById(R.id.btFirst);
        Button btSecond = findViewById(R.id.btSecond);
        Button btThird = findViewById(R.id.btThird);
        Button btFourth = findViewById(R.id.btFourth);

        //memasang pendeteksi(event listener) pada komponen
        //dan menangani kejadian (event handler) jika terjadi kejadian pada komponen tersebut

        btFirst.setOnClickListener(this);
        btSecond.setOnClickListener(this);
        btThird.setOnClickListener(this);
        btFourth.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btFirst :
                Toast.makeText(this, "Anda menekan button First", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btSecond :
                Toast.makeText(this, "Anda menekan button Second", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btThird :
                Toast.makeText(this, "Anda menekan button Third", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btFourth :
                Toast.makeText(this, "Anda menekan button Fourth", Toast.LENGTH_SHORT).show();
                break;
        }

    }
}
