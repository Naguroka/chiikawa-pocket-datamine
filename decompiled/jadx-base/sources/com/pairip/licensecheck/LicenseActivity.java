package com.pairip.licensecheck;

/* JADX INFO: loaded from: classes2.dex */
public class LicenseActivity extends android.app.Activity {
    public static final java.lang.String ACTIVITY_TYPE_ARG_NAME = "activitytype";
    public static final java.lang.String PAYWALL_INTENT_ARG_NAME = "paywallintent";
    private static final java.lang.String TAG = "LicenseActivity";

    public enum ActivityType {
        PAYWALL,
        ERROR_DIALOG
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        try {
            int iOrdinal = ((com.pairip.licensecheck.LicenseActivity.ActivityType) getIntent().getSerializableExtra(ACTIVITY_TYPE_ARG_NAME)).ordinal();
            if (iOrdinal == 0) {
                showPaywallAndCloseApp();
            } else {
                if (iOrdinal != 1) {
                    return;
                }
                showErrorDialog();
            }
        } catch (java.lang.Exception e) {
            logAndShowErrorDialog("Couldn't process license activity correctly.", e);
        }
    }

    private void showPaywallAndCloseApp() {
        final android.app.PendingIntent pendingIntent = (android.app.PendingIntent) getIntent().getParcelableExtra(PAYWALL_INTENT_ARG_NAME);
        if (pendingIntent == null) {
            logAndShowErrorDialog("Paywall intent is not provided.");
        } else {
            runOnUiThread(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseActivity$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.lambda$showPaywallAndCloseApp$0(pendingIntent);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showPaywallAndCloseApp$0(android.app.PendingIntent pendingIntent) {
        try {
            if (android.os.Build.VERSION.SDK_INT >= 34) {
                pendingIntent.send(android.app.ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1).toBundle());
            } else {
                pendingIntent.send();
            }
            closeApp();
        } catch (android.app.PendingIntent.CanceledException e) {
            logAndShowErrorDialog("Paywall intent unexpectedly cancelled.", e);
        }
    }

    private void logAndShowErrorDialog(java.lang.String message, java.lang.Exception ex) {
        logAndShowErrorDialog(message + " " + android.util.Log.getStackTraceString(ex));
    }

    private void logAndShowErrorDialog(java.lang.String message) {
        android.util.Log.e(TAG, message);
        showErrorDialog();
    }

    private void showErrorDialog() {
        runOnUiThread(new java.lang.Runnable() { // from class: com.pairip.licensecheck.LicenseActivity$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.lambda$showErrorDialog$0();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showErrorDialog$0() {
        try {
            new android.app.AlertDialog.Builder(this).setTitle("Something went wrong").setMessage("Check that Google Play is enabled on your device and that you're using an up-to-date version before opening the app. If the problem persists try reinstalling the app.").setPositiveButton("Close", new android.content.DialogInterface.OnClickListener() { // from class: com.pairip.licensecheck.LicenseActivity$$ExternalSyntheticLambda2
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(android.content.DialogInterface dialogInterface, int i) {
                    this.f$0.lambda$showErrorDialog$1(dialogInterface, i);
                }
            }).setCancelable(false).show();
        } catch (java.lang.RuntimeException e) {
            android.util.Log.d(TAG, "Couldn't show the error dialog. " + android.util.Log.getStackTraceString(e));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$showErrorDialog$1(android.content.DialogInterface dialogInterface, int i) {
        closeApp();
    }

    private void closeApp() {
        if (com.pairip.licensecheck.LicenseClient.gracefulShutdownEnabled) {
            closeAllTasks();
        } else {
            exitApp();
        }
    }

    protected void exitApp() {
        finishAndRemoveTask();
        java.lang.System.exit(0);
    }

    protected void closeAllTasks() {
        android.app.ActivityManager activityManager = (android.app.ActivityManager) getSystemService("activity");
        if (activityManager != null) {
            for (android.app.ActivityManager.AppTask appTask : activityManager.getAppTasks()) {
                try {
                    appTask.finishAndRemoveTask();
                } catch (java.lang.RuntimeException e) {
                    android.util.Log.e(TAG, "Failed to gracefully clear task=" + appTask.getTaskInfo().id, e);
                }
            }
        }
        exitApp();
    }
}
