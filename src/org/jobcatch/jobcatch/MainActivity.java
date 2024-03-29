package org.jobcatch.jobcatch;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.webkit.WebView;

@SuppressLint("SetJavaScriptEnabled")
public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		WebView webview = (WebView) findViewById(R.id.indeed_job);
		webview.getSettings().setJavaScriptEnabled(true);
		String jobPosting = "<style type='text/css'>#indJobContent{padding-bottom: 5px;}#indJobContent .company_location{font-size: 11px;overflow: hidden;display:block;}#indJobContent.wide .job{display:block;float:left;margin-right: 5px;width: 135px;overflow: hidden}#indeed_widget_wrapper{position: relative;font-family: 'Helvetica Neue',Helvetica,Arial,sans-serif;font-size: 13px;font-weight: normal;line-height: 18px;padding: 10px;height: auto;overflow: hidden;}#indeed_widget_header{font-size:18px; padding-bottom: 5px; }#indeed_search_wrapper{clear: both;font-size: 12px;margin-top: 5px;padding-top: 5px;}#indeed_search_wrapper label{font-size: 12px;line-height: inherit;text-align: left; margin-right: 5px;}#indeed_search_wrapper input[type='text']{width: 100px; font-size: 11px; }#indeed_search_wrapper #qc{float:left;}#indeed_search_wrapper #lc{float:right;}#indeed_search_wrapper.stacked #qc, #indeed_search_wrapper.stacked #lc{float: none; clear: both;}#indeed_search_wrapper.stacked input[type='text']{width: 150px;}#indeed_search_wrapper.stacked label{display: block;padding-bottom: 5px;}#indeed_search_footer{width:295px; padding-top: 5px; clear: both;}#indeed_link{position: absolute;bottom: 1px;right: 5px;clear: both;font-size: 11px; }#indeed_link a{text-decoration: none;}#results .job{padding: 1px 0px;}#pagination { clear: both; }</style><style type='text/css'>" +
				"#indeed_widget_wrapper{ width: 300px; height: 250px; background: #FFFFFF;}" +
				"#indeed_widget_wrapper{ border: 1px solid #DDDDDD; }" +
				"#indeed_widget_wrapper, #indeed_link a{ color: #000000;}" +
				"#indJobContent, #indeed_search_wrapper{ border-top: 1px solid #DDDDDD; }" +
				"#indJobContent a { color: #00c; }" +
				"#indeed_widget_header{ color: #000000; }" +
				"</style>" +
				"<script type='text/javascript'>" +
				"var ind_pub = '7171583023468764';" +
				"var ind_el = 'indJobContent';" +
				"var ind_pf = '';" +
				"var ind_q = '';" +
				"var ind_l = '';" +
				"var ind_chnl = '';" +
				"var ind_n = 4;" +
				"var ind_d = 'http://www.indeed.com';" +
				"var ind_t = 40;" +
				"var ind_c = 30;" +
				"</script>" +
				"<script type='text/javascript' src='http://www.indeed.com/ads/jobroll-widget-v3.js'></script>" +
				"<div id='indeed_widget_wrapper' style=''>" +
				"<div id='indeed_widget_header'>Catch Jobs</div>" +
				"<div id='indJobContent' class=\"\"></div>" +
				"<div id='indeed_search_wrapper'>" +
				"<script type='text/javascript'>" +
				"function clearDefaults(){" +
				"var formInputs=document.getElementById('indeed_jobform').elements;" +
				"for(var i=0;i<formInputs.length;i++){" +
				"if(formInputs[i].value=='title, keywords' || formInputs[i].value=='city, state, or zip'){" +
				"formInputs[i].value='';" +
				"}}}</script>" +
				"<form onsubmit='clearDefaults();' method='get' action='http://www.indeed.com/jobs' id='indeed_jobform' target=\"_new\">" +
				"<div id=\"qc\"><label>What:</label><input type='text' onfocus='this.value=\"\"' value='title, keywords' name='q' id='q'></div>" +
				"<div id=\"lc\"><label>Where:</label><input type='text' onfocus='this.value=\"\"' value='city, state, or zip' name='l' id='l'></div>" +
				"<div id='indeed_search_footer'>" +
				"<div style='float:left'><input type='submit' value='Find Jobs' class='findjobs'></div>" +
				"</div>" +
				"<input type='hidden' name='indpubnum' id='indpubnum' value='7171583023468764'>" +
				"</form></div>" +
				"<div id='indeed_link'>" +
				"<a title=\"Job Search\" href=\"http://www.indeed.com/\" target=\"_new\">jobs by <img alt=Indeed src='http://www.indeed.com/p/jobsearch.gif' style='border: 0;vertical-align: bottom;'></a>" +
				"</div></div>";
		webview.loadData(jobPosting, "text/html", null);
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
