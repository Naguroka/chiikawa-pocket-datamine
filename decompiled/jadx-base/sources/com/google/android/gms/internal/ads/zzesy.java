package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzesy implements com.google.android.gms.internal.ads.zzetq {
    private final java.lang.String zza;
    private final android.os.Bundle zzb;

    public zzesy(java.lang.String str, android.os.Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* synthetic */ void zza(java.lang.Object obj) {
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) obj;
        zzcuvVar.zza.putString("rtb", this.zza);
        if (this.zzb.isEmpty()) {
            return;
        }
        zzcuvVar.zza.putBundle("adapter_initialization_status", this.zzb);
    }
}
