package com.five_corp.ad;

/* JADX INFO: loaded from: classes4.dex */
public class AdReportDialogActivity extends androidx.appcompat.app.AppCompatActivity {
    public static final java.lang.String EXTRA_IS_FULLSCREEN = "is_fullscreen";

    public static void a(final android.view.Window window) {
        android.view.View decorView = window.getDecorView();
        decorView.setSystemUiVisibility(com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes.BLE_SCANNING_UNSUPPORTED);
        decorView.setOnSystemUiVisibilityChangeListener(new android.view.View.OnSystemUiVisibilityChangeListener() { // from class: com.five_corp.ad.AdReportDialogActivity$$ExternalSyntheticLambda0
            @Override // android.view.View.OnSystemUiVisibilityChangeListener
            public final void onSystemUiVisibilityChange(int i) {
                window.getDecorView().setSystemUiVisibility(com.google.android.gms.nearby.messages.NearbyMessagesStatusCodes.BLE_SCANNING_UNSUPPORTED);
            }
        });
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int i = android.os.Build.VERSION.SDK_INT;
        if (i >= 34) {
            overrideActivityTransition(0, 0, 0);
            overrideActivityTransition(1, 0, 0);
        }
        if (getIntent().getBooleanExtra(EXTRA_IS_FULLSCREEN, true)) {
            android.view.Window window = getWindow();
            if (i >= 30) {
                window.setDecorFitsSystemWindows(false);
                window.getDecorView().getWindowInsetsController().hide(android.view.WindowInsets.Type.statusBars() | android.view.WindowInsets.Type.navigationBars());
                window.getInsetsController().setSystemBarsBehavior(2);
            } else {
                window.addFlags(1536);
                a(window);
            }
        }
        if (com.five_corp.ad.internal.ad_report.d.f1840a == null) {
            com.five_corp.ad.internal.ad_report.d.f1840a = new com.five_corp.ad.internal.ad_report.a();
        }
        com.five_corp.ad.internal.ad_report.a aVar = com.five_corp.ad.internal.ad_report.d.f1840a;
        com.five_corp.ad.internal.ad_report.c cVar = aVar.b;
        aVar.b = null;
        aVar.c = null;
        if (cVar != null) {
            cVar.a(this);
            return;
        }
        finish();
        if (i < 34) {
            overridePendingTransition(0, 0);
        }
    }
}
