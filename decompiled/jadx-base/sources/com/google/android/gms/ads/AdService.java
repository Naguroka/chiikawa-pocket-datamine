package com.google.android.gms.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class AdService extends android.app.IntentService {
    public static final java.lang.String CLASS_NAME = "com.google.android.gms.ads.AdService";

    public AdService() {
        super("AdService");
    }

    @Override // android.app.IntentService
    protected final void onHandleIntent(android.content.Intent intent) {
        try {
            com.google.android.gms.ads.internal.client.zzbc.zza().zzo(this, new com.google.android.gms.internal.ads.zzbpa()).zze(intent);
        } catch (android.os.RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("RemoteException calling handleNotificationIntent: ".concat(e.toString()));
        }
    }
}
