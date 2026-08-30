package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class OutOfContextTestingActivity extends android.app.Activity {
    public static final java.lang.String AD_UNIT_KEY = "adUnit";
    public static final java.lang.String CLASS_NAME = "com.google.android.gms.ads.OutOfContextTestingActivity";

    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        com.google.android.gms.ads.internal.client.zzdu zzduVarZzh = com.google.android.gms.ads.internal.client.zzbc.zza().zzh(this, new com.google.android.gms.internal.ads.zzbpa());
        if (zzduVarZzh == null) {
            finish();
            return;
        }
        setContentView(com.google.android.gms.ads.R.layout.admob_empty_layout);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) findViewById(com.google.android.gms.ads.R.id.layout);
        android.content.Intent intent = getIntent();
        if (intent == null) {
            finish();
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("adUnit");
        if (stringExtra == null) {
            finish();
            return;
        }
        try {
            zzduVarZzh.zze(stringExtra, com.google.android.gms.dynamic.ObjectWrapper.wrap(this), com.google.android.gms.dynamic.ObjectWrapper.wrap(linearLayout));
        } catch (android.os.RemoteException unused) {
            finish();
        }
    }
}
