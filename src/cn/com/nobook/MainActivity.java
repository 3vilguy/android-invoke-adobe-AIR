package cn.com.nobook;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		try
		{
			Intent srv = new Intent(this, TestService.class);
			startService(srv);
		}
		catch (Exception e)
		{
			// service could not be started
			Log.v("[SwfActivity]", "service could not be started");
		}

		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		Button btn = (Button) findViewById(R.id.btn);
		btn.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View v) {
				String url = "cn.com.nobook.Test://param1&param2&param3";
				Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
				startActivity(intent);
			}
		});

	}
}
