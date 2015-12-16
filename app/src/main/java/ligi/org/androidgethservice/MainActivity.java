package ligi.org.androidgethservice;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.github.ethereum.go_ethereum.cmd.Geth;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new Thread(new Runnable() {
            @Override
            public void run() {
                Geth.run("--ipcdisable --rpc --fast --datadir=" + getFilesDir().getAbsolutePath());
            }
        }).start();

    }
}
