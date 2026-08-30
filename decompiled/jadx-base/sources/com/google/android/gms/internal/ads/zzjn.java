package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzjn implements com.google.android.gms.internal.ads.zzkp {
    private final java.lang.Object zza;
    private com.google.android.gms.internal.ads.zzbq zzb;

    public zzjn(java.lang.Object obj, com.google.android.gms.internal.ads.zzub zzubVar) {
        this.zza = obj;
        this.zzb = zzubVar.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final com.google.android.gms.internal.ads.zzbq zza() {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final java.lang.Object zzb() {
        return this.zza;
    }

    public final void zzc(com.google.android.gms.internal.ads.zzbq zzbqVar) {
        this.zzb = zzbqVar;
    }
}
