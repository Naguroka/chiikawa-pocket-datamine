package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzacw implements com.google.android.gms.internal.ads.zzadm {
    private final com.google.android.gms.internal.ads.zzacy zza;
    private final long zzb;

    public zzacw(com.google.android.gms.internal.ads.zzacy zzacyVar, long j) {
        this.zza = zzacyVar;
        this.zzb = j;
    }

    private final com.google.android.gms.internal.ads.zzadn zzb(long j, long j2) {
        return new com.google.android.gms.internal.ads.zzadn((j * 1000000) / ((long) this.zza.zze), this.zzb + j2);
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final long zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final com.google.android.gms.internal.ads.zzadk zzg(long j) {
        com.google.android.gms.internal.ads.zzcw.zzb(this.zza.zzk);
        com.google.android.gms.internal.ads.zzacy zzacyVar = this.zza;
        com.google.android.gms.internal.ads.zzacx zzacxVar = zzacyVar.zzk;
        long[] jArr = zzacxVar.zza;
        long[] jArr2 = zzacxVar.zzb;
        int iZzd = com.google.android.gms.internal.ads.zzei.zzd(jArr, zzacyVar.zzb(j), true, false);
        com.google.android.gms.internal.ads.zzadn zzadnVarZzb = zzb(iZzd == -1 ? 0L : jArr[iZzd], iZzd != -1 ? jArr2[iZzd] : 0L);
        if (zzadnVarZzb.zzb == j || iZzd == jArr.length - 1) {
            return new com.google.android.gms.internal.ads.zzadk(zzadnVarZzb, zzadnVarZzb);
        }
        int i = iZzd + 1;
        return new com.google.android.gms.internal.ads.zzadk(zzadnVarZzb, zzb(jArr[i], jArr2[i]));
    }

    @Override // com.google.android.gms.internal.ads.zzadm
    public final boolean zzh() {
        return true;
    }
}
