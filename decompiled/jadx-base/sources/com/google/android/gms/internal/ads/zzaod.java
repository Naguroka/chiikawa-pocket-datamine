package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaod implements com.google.android.gms.internal.ads.zzaoc {
    private final com.google.android.gms.internal.ads.zzacq zza;
    private final com.google.android.gms.internal.ads.zzadt zzb;
    private final com.google.android.gms.internal.ads.zzaof zzc;
    private final com.google.android.gms.internal.ads.zzab zzd;
    private final int zze;
    private long zzf;
    private int zzg;
    private long zzh;

    public zzaod(com.google.android.gms.internal.ads.zzacq zzacqVar, com.google.android.gms.internal.ads.zzadt zzadtVar, com.google.android.gms.internal.ads.zzaof zzaofVar, java.lang.String str, int i) throws com.google.android.gms.internal.ads.zzbc {
        this.zza = zzacqVar;
        this.zzb = zzadtVar;
        this.zzc = zzaofVar;
        int i2 = zzaofVar.zzb * zzaofVar.zze;
        int i3 = zzaofVar.zzd;
        int i4 = i2 / 8;
        if (i3 != i4) {
            throw com.google.android.gms.internal.ads.zzbc.zza("Expected block size: " + i4 + "; got: " + i3, null);
        }
        int i5 = zzaofVar.zzc * i4;
        int i6 = i5 * 8;
        int iMax = java.lang.Math.max(i4, i5 / 10);
        this.zze = iMax;
        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
        zzzVar.zzaa(str);
        zzzVar.zzy(i6);
        zzzVar.zzV(i6);
        zzzVar.zzR(iMax);
        zzzVar.zzz(zzaofVar.zzb);
        zzzVar.zzab(zzaofVar.zzc);
        zzzVar.zzU(i);
        this.zzd = zzzVar.zzag();
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zza(int i, long j) {
        this.zza.zzO(new com.google.android.gms.internal.ads.zzaoi(this.zzc, 1, i, j));
        this.zzb.zzm(this.zzd);
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final void zzb(long j) {
        this.zzf = j;
        this.zzg = 0;
        this.zzh = 0L;
    }

    @Override // com.google.android.gms.internal.ads.zzaoc
    public final boolean zzc(com.google.android.gms.internal.ads.zzaco zzacoVar, long j) throws java.io.IOException {
        int i;
        int i2;
        long j2 = j;
        while (j2 > 0 && (i = this.zzg) < (i2 = this.zze)) {
            int iZzf = this.zzb.zzf(zzacoVar, (int) java.lang.Math.min(i2 - i, j2), true);
            if (iZzf == -1) {
                j2 = 0;
            } else {
                this.zzg += iZzf;
                j2 -= (long) iZzf;
            }
        }
        com.google.android.gms.internal.ads.zzaof zzaofVar = this.zzc;
        int i3 = this.zzg;
        int i4 = zzaofVar.zzd;
        int i5 = i3 / i4;
        if (i5 > 0) {
            long jZzu = this.zzf + com.google.android.gms.internal.ads.zzei.zzu(this.zzh, 1000000L, zzaofVar.zzc, java.math.RoundingMode.DOWN);
            int i6 = i5 * i4;
            int i7 = this.zzg - i6;
            this.zzb.zzt(jZzu, 1, i6, i7, null);
            this.zzh += (long) i5;
            this.zzg = i7;
        }
        return j2 <= 0;
    }
}
