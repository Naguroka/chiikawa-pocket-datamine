package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzetn implements com.google.android.gms.internal.ads.zzetq {
    private final android.os.Bundle zza;

    public zzetn(android.os.Bundle bundle) {
        this.zza = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) obj;
        if (this.zza.isEmpty()) {
            return;
        }
        zzcuvVar.zzb.putBundle("shared_pref", this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) obj;
        if (this.zza.isEmpty()) {
            return;
        }
        zzcuvVar.zza.putBundle("shared_pref", this.zza);
    }
}
