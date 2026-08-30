package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzayy extends com.google.android.gms.ads.internal.client.zzcl {
    private final com.google.android.gms.ads.admanager.AppEventListener zza;

    public zzayy(com.google.android.gms.ads.admanager.AppEventListener appEventListener) {
        this.zza = appEventListener;
    }

    public final com.google.android.gms.ads.admanager.AppEventListener zzb() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.internal.client.zzcm
    public final void zzc(java.lang.String str, java.lang.String str2) {
        this.zza.onAppEvent(str, str2);
    }
}
