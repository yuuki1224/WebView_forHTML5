package com.example.testwebview;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

//for WebView
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends Activity {
	HTML5WebView mWebView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
        
        /*
        //レイアウトで指定したWebViewのIDを指定
        WebView myWebView = (HTML5WebView)findViewById(R.id.webView1);
        //リンクをタップした時に標準のブラウザを起動させる
        myWebView.setWebViewClient(new WebViewClient());
        //最初にYahoo!のページを表示させる
        myWebView.loadUrl("http://219.94.251.92?event=test1");
        */
        
        /*
        HTML5WebView webview = new HTML5WebView(this);
        setContentView(webview); 
        webview.loadUrl("http://219.94.251.92?event=test1");
        */
        mWebView = new HTML5WebView(this);

        if (savedInstanceState != null) {
                mWebView.restoreState(savedInstanceState);
        } else {
                mWebView.loadUrl("http://219.94.251.92?event=test1");
                //mWebView.loadUrl("file:///data/bbench/index.html");
        }

        setContentView(mWebView.getLayout());

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
