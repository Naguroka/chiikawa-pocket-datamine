package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhfl extends androidx.browser.customtabs.CustomTabsServiceConnection {
    private final java.lang.ref.WeakReference zza;

    public zzhfl(com.google.android.gms.internal.ads.zzbdm zzbdmVar) {
        this.zza = new java.lang.ref.WeakReference(zzbdmVar);
    }

    @Override // androidx.browser.customtabs.CustomTabsServiceConnection
    public final void onCustomTabsServiceConnected(android.content.ComponentName componentName, androidx.browser.customtabs.CustomTabsClient customTabsClient) {
        com.google.android.gms.internal.ads.zzbdm zzbdmVar = (com.google.android.gms.internal.ads.zzbdm) this.zza.get();
        if (zzbdmVar != null) {
            zzbdmVar.zzc(customTabsClient);
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        com.google.android.gms.internal.ads.zzbdm zzbdmVar = (com.google.android.gms.internal.ads.zzbdm) this.zza.get();
        if (zzbdmVar != null) {
            zzbdmVar.zzd();
        }
    }
}
