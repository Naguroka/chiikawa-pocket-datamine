package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzera implements com.google.android.gms.internal.ads.zzetq {
    private final boolean zza;

    public zzera(boolean z) {
        this.zza = z;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        ((com.google.android.gms.internal.ads.zzcuv) obj).zzb.putBoolean("is_gbid", this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        ((com.google.android.gms.internal.ads.zzcuv) obj).zza.putBoolean("is_gbid", this.zza);
    }
}
