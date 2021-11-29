package ir.samiantec.SnackUtils;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class SnackUtilsTestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnClickListener(view -> {
            SnackUtil.show(findViewById(R.id.c), "Welcome to this app");
        });

        findViewById(R.id.button3).setOnClickListener(view -> {
            SnackUtil.show(findViewById(R.id.c), "Something weird happened.", SnackUtil.Type.ERROR);
        });

        findViewById(R.id.button4).setOnClickListener(view -> {
            SnackUtil.show(findViewById(R.id.c), "Your action is successfully done.", SnackUtil.Type.SUCCESS);
        });

        findViewById(R.id.button2).setOnClickListener(view -> {
            SnackUtil.show(findViewById(R.id.c), "Your action is successfully done.", SnackUtil.Type.INFO, "OK");
        });
    }
}