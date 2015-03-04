package com.example.builtin;

import javax.security.auth.callback.Callback;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MyBrowserActivity extends Activity {
	@Override
	public void onCreate(Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		setContentView(R.layout.browser);
		
		Uri url = getIntent().getData();
		WebView webView = (WebView) findViewById(R.id.WebView01);
		webView.setWebViewClient(new Callback());
		webView.loadUrl(url.toString());
	} // end of onCreate
	private class Callback extends WebViewClient {
		@Override
		public boolean shouldOverrideUrlLoading(WebView view, String url){
			return(false);
		}
	} // end of Callback
} // end of MyBrowserActivity






