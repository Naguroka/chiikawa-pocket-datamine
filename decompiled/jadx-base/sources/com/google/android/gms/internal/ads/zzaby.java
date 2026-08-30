package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public class zzaby {
    protected final com.google.android.gms.internal.ads.zzabs zza;
    protected final com.google.android.gms.internal.ads.zzabx zzb;
    protected com.google.android.gms.internal.ads.zzabu zzc;
    private final int zzd;

    protected zzaby(com.google.android.gms.internal.ads.zzabv zzabvVar, com.google.android.gms.internal.ads.zzabx zzabxVar, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.zzb = zzabxVar;
        this.zzd = i;
        this.zza = new com.google.android.gms.internal.ads.zzabs(zzabvVar, j, 0L, j3, j4, j5, j6);
    }

    protected static final int zzf(com.google.android.gms.internal.ads.zzaco zzacoVar, long j, com.google.android.gms.internal.ads.zzadj zzadjVar) {
        if (j == zzacoVar.zzf()) {
            return 0;
        }
        zzadjVar.zza = j;
        return 1;
    }

    protected static final boolean zzg(com.google.android.gms.internal.ads.zzaco zzacoVar, long j) throws java.io.IOException {
        long jZzf = j - zzacoVar.zzf();
        if (jZzf < 0 || jZzf > 262144) {
            return false;
        }
        zzacoVar.zzk((int) jZzf);
        return true;
    }

    public final int zza(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        while (true) {
            com.google.android.gms.internal.ads.zzabu zzabuVar = this.zzc;
            com.google.android.gms.internal.ads.zzcw.zzb(zzabuVar);
            long j = zzabuVar.zzf;
            long j2 = zzabuVar.zzg;
            long j3 = zzabuVar.zzh;
            if (j2 - j <= this.zzd) {
                zzc(false, j);
                return zzf(zzacoVar, j, zzadjVar);
            }
            if (!zzg(zzacoVar, j3)) {
                return zzf(zzacoVar, j3, zzadjVar);
            }
            zzacoVar.zzj();
            com.google.android.gms.internal.ads.zzabw zzabwVarZza = this.zzb.zza(zzacoVar, zzabuVar.zzb);
            int i = zzabwVarZza.zzb;
            if (i == -3) {
                zzc(false, j3);
                return zzf(zzacoVar, j3, zzadjVar);
            }
            if (i == -2) {
                com.google.android.gms.internal.ads.zzabu.zzh(zzabuVar, zzabwVarZza.zzc, zzabwVarZza.zzd);
            } else {
                if (i != -1) {
                    zzg(zzacoVar, zzabwVarZza.zzd);
                    zzc(true, zzabwVarZza.zzd);
                    return zzf(zzacoVar, zzabwVarZza.zzd, zzadjVar);
                }
                com.google.android.gms.internal.ads.zzabu.zzg(zzabuVar, zzabwVarZza.zzc, zzabwVarZza.zzd);
            }
        }
    }

    public final com.google.android.gms.internal.ads.zzadm zzb() {
        return this.zza;
    }

    protected final void zzc(boolean z, long j) {
        this.zzc = null;
        this.zzb.zzb();
    }

    public final void zzd(long j) {
        com.google.android.gms.internal.ads.zzabu zzabuVar = this.zzc;
        if (zzabuVar == null || zzabuVar.zza != j) {
            com.google.android.gms.internal.ads.zzabs zzabsVar = this.zza;
            this.zzc = new com.google.android.gms.internal.ads.zzabu(j, zzabsVar.zzf(j), 0L, zzabsVar.zzc, zzabsVar.zzd, zzabsVar.zze, zzabsVar.zzf);
        }
    }

    public final boolean zze() {
        return this.zzc != null;
    }
}
