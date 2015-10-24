package com.linkensky.bayisehat.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.linkensky.bayisehat.R;
import com.trncic.library.DottedProgressBar;

public class LoadingScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);

        DottedProgressBar progressBar = (DottedProgressBar) findViewById(R.id.loadingProgress);
        progressBar.startProgress();
    }
}
