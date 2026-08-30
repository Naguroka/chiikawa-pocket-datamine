package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzesp implements com.google.android.gms.internal.ads.zzetq {
    private final java.lang.String zza;
    private final int zzb;

    public zzesp(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zza(java.lang.Object obj) {
        ((com.google.android.gms.internal.ads.zzcuv) obj).zzb.putString("request_id", this.zza);
    }

    @Override // com.google.android.gms.internal.ads.zzetq
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object obj) {
        com.google.android.gms.internal.ads.zzcuv zzcuvVar = (com.google.android.gms.internal.ads.zzcuv) obj;
        zzcuvVar.zza.putString("request_id", this.zza);
        if (this.zzb == 2) {
            zzcuvVar.zza.putInt("sod", 1);
        }
    }
}
