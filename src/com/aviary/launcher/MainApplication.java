package com.aviary.launcher;

import org.acra.ACRA;
import org.acra.ReportingInteractionMode;
import org.acra.annotation.ReportsCrashes;
import android.app.Application;

@ReportsCrashes(formKey="dEt3WndDQTliYUw1VXNyMEZNT0RYVEE6MQ", 
	mode=ReportingInteractionMode.TOAST,
	logcatArguments={ "-t", "300", "-v", "time" },
	resToastText=R.string.crash_toast_text)
public class MainApplication extends Application {

	@Override
	public void onCreate() {
		ACRA.init( this );
		super.onCreate();
	}
}