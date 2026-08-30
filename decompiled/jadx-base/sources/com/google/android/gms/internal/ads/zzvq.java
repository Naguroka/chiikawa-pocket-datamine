package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzvq implements com.google.android.gms.internal.ads.zzye {
    public long zza;
    public long zzb;
    public com.google.android.gms.internal.ads.zzyd zzc;
    public com.google.android.gms.internal.ads.zzvq zzd;

    public zzvq(long j, int i) {
        zze(j, 65536);
    }

    public final int zza(long j) {
        long j2 = j - this.zza;
        int i = this.zzc.zzb;
        return (int) j2;
    }

    public final com.google.android.gms.internal.ads.zzvq zzb() {
        this.zzc = null;
        com.google.android.gms.internal.ads.zzvq zzvqVar = this.zzd;
        this.zzd = null;
        return zzvqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final com.google.android.gms.internal.ads.zzye zzd() {
        com.google.android.gms.internal.ads.zzvq zzvqVar = this.zzd;
        if (zzvqVar == null || zzvqVar.zzc == null) {
            return null;
        }
        return zzvqVar;
    }

    public final void zze(long j, int i) {
        com.google.android.gms.internal.ads.zzcw.zzf(this.zzc == null);
        this.zza = j;
        this.zzb = j + 65536;
    }

    @Override // com.google.android.gms.internal.ads.zzye
    public final com.google.android.gms.internal.ads.zzyd zzc() {
        com.google.android.gms.internal.ads.zzyd zzydVar = this.zzc;
        zzydVar.getClass();
        return zzydVar;
    }
}
