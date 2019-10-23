package com.example.testapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public WebView webView;
    public EditText link;
    public Button load;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        setTheme(R.style.Theme_AppCompat_NoActionBar);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webView);
        link = findViewById(R.id.link);
        load = findViewById(R.id.load);

        test variable = new test();

        load.setText(variable.testImport());

        webView.setWebViewClient(new WebViewClient());

        webView.getSettings().setJavaScriptEnabled(true);

        load.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                webView.loadUrl(link.getText().toString());
            }
        });

    }
}
