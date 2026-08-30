package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzere implements com.google.android.gms.internal.ads.zzetq {
    private final java.lang.Boolean zza;

    public zzere(java.lang.Boolean bool) {
        this.zza = bool;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        java.lang.Boolean bool = this.zza;
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) obj;
        if (bool != null) {
            zzcuvVar.zza.putBoolean("hw_accel", bool.booleanValue());
        }
    }
}
