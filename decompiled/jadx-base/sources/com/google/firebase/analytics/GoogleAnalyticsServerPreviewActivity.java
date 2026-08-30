package com.google.firebase.analytics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public class GoogleAnalyticsServerPreviewActivity extends android.app.Activity {
    @Override // android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.google.android.gms.internal.measurement.zzff.zzg(this, null, null, null, null).zzN(getIntent());
        finish();
    }
}
