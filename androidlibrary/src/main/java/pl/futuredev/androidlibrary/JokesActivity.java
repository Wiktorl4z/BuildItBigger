package pl.futuredev.androidlibrary;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class JokesActivity extends AppCompatActivity {

    public static final String JOKE = "joke";
    private String joke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jokes);

        TextView tv_joke = findViewById(R.id.tv_joke);

        if (getIntent().hasExtra(JOKE)){
            tv_joke.setText(getIntent().getStringExtra("joke"));
        }
    }
}
