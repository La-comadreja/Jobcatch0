package org.jobcatch.jobcatch;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		WebView webview = new WebView(this);
		String jobPosting = "<html><head>" +
				"<span id=indeed_at><a href=\"http://www.indeed.com/\">jobs</a> by " +
				"<a href=\"http://www.indeed.com/\" title=\"Job Search\">" +
				"<img src=\"http://www.indeed.com/p/jobsearch.gif\"" + 
				"<style=\"border: 0; vertical-align: middle;\" alt=\"Indeed job search\"></a>" +
				"</span></head></html>";
		webview.loadData(jobPosting, "text/html", null);
		setContentView(R.layout.activity_main);
	}

	public void dislike(View view) {
		//Intent intent = new Intent(this, DisplayMessageActivity.class);
	}

	public void like(View view) {
		//Intent intent = new Intent(this, DisplayMessageActivity.class);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
}
