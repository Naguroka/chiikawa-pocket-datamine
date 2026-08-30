package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzesi implements com.google.android.gms.internal.ads.zzetq {
    private final android.os.Bundle zza;

    public zzesi(android.os.Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        android.os.Bundle bundle = this.zza;
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) obj;
        if (bundle != null) {
            zzcuvVar.zzb.putAll(bundle);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        android.os.Bundle bundle = this.zza;
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) obj;
        if (bundle != null) {
            zzcuvVar.zza.putAll(bundle);
        }
    }
}
