package ds6.dpc.fisc.utp.arus;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import ds6.dpc.fisc.utp.arus.Menu.MainActivity;

public class InicioScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent (InicioScreen.this, MainActivity.class);
                startActivity(intent);
                finish();
            }        }, 4000);
    }
}
