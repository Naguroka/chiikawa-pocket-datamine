package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdic {
    private com.google.android.gms.internal.ads.zzbft zza;

    public zzdic(com.google.android.gms.internal.ads.zzdhn zzdhnVar) {
        this.zza = zzdhnVar;
    }

    public final synchronized com.google.android.gms.internal.ads.zzbft zza() {
        return this.zza;
    }

    public final synchronized void zzb(com.google.android.gms.internal.ads.zzbft zzbftVar) {
        this.zza = zzbftVar;
    }
}
