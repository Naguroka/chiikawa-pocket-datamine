package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzqc {
    private final com.google.android.gms.internal.ads.zzch[] zza;
    private final com.google.android.gms.internal.ads.zzqu zzb;
    private final com.google.android.gms.internal.ads.zzck zzc;

    public zzqc(com.google.android.gms.internal.ads.zzch... zzchVarArr) {
        com.google.android.gms.internal.ads.zzqu zzquVar = new com.google.android.gms.internal.ads.zzqu();
        com.google.android.gms.internal.ads.zzck zzckVar = new com.google.android.gms.internal.ads.zzck();
        com.google.android.gms.internal.ads.zzch[] zzchVarArr2 = {zzquVar, zzckVar};
        this.zza = zzchVarArr2;
        java.lang.System.arraycopy(zzchVarArr, 0, zzchVarArr2, 0, 0);
        this.zzb = zzquVar;
        this.zzc = zzckVar;
    }

    public final long zza(long j) {
        return this.zzc.zzg() ? this.zzc.zzi(j) : j;
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final com.google.android.gms.internal.ads.zzbe zzc(com.google.android.gms.internal.ads.zzbe zzbeVar) {
        this.zzc.zzk(zzbeVar.zzb);
        this.zzc.zzj(zzbeVar.zzc);
        return zzbeVar;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final com.google.android.gms.internal.ads.zzch[] zze() {
        return this.zza;
    }
}
