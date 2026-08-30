package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzky implements com.google.android.gms.internal.ads.zzkp {
    public final com.google.android.gms.internal.ads.zzub zza;
    public int zzd;
    public boolean zze;
    public final java.util.List zzc = new java.util.ArrayList();
    public final java.lang.Object zzb = new java.lang.Object();

    public zzky(com.google.android.gms.internal.ads.zzui zzuiVar, boolean z) {
        this.zza = new com.google.android.gms.internal.ads.zzub(zzuiVar, z);
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final com.google.android.gms.internal.ads.zzbq zza() {
        return this.zza.zzC();
    }

    @Override // com.google.android.gms.internal.ads.zzkp
    public final java.lang.Object zzb() {
        return this.zzb;
    }

    public final void zzc(int i) {
        this.zzd = i;
        this.zze = false;
        this.zzc.clear();
    }
}
