package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class NotificationHandlerActivity extends android.app.Activity {
    public static final java.lang.String CLASS_NAME = "com.google.android.gms.ads.NotificationHandlerActivity";

    @Override // android.app.Activity
    protected final void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        try {
            com.google.android.gms.internal.ads.zzbsx zzbsxVarZzo = com.google.android.gms.ads.internal.client.zzbc.zza().zzo(this, new com.google.android.gms.internal.ads.zzbpa());
            if (zzbsxVarZzo == null) {
                com.google.android.gms.ads.internal.util.client.zzo.zzg("OfflineUtils is null");
            } else {
                zzbsxVarZzo.zze(getIntent());
            }
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }

    @Override // android.app.Activity
    protected final void onResume() {
        super.onResume();
        finish();
    }
}
