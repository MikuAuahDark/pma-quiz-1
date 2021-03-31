package id.co.npad93.pm.q1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class IngfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ingfo);
    }

    public void finish(View view) {
        finish();
    }

    public void tryExit(View view) {
        MainActivity.tryExit(this);
    }
}
