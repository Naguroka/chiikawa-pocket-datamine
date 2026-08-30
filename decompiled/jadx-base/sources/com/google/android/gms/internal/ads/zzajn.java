package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzajn {
    public int zza;
    public long zzb;
    public int zzc;
    public int zzd;
    public int zze;
    public final int[] zzf = new int[255];
    private final com.google.android.gms.internal.ads.zzdy zzg = new com.google.android.gms.internal.ads.zzdy(255);

    zzajn() {
    }

    public final void zza() {
        this.zza = 0;
        this.zzb = 0L;
        this.zzc = 0;
        this.zzd = 0;
        this.zze = 0;
    }

    public final boolean zzb(com.google.android.gms.internal.ads.zzaco zzacoVar, boolean z) throws java.io.IOException {
        zza();
        this.zzg.zzI(27);
        if (com.google.android.gms.internal.ads.zzacr.zzc(zzacoVar, this.zzg.zzN(), 0, 27, z) && this.zzg.zzu() == 1332176723) {
            if (this.zzg.zzm() != 0) {
                if (z) {
                    return false;
                }
                throw com.google.android.gms.internal.ads.zzbc.zzc("unsupported bit stream revision");
            }
            this.zza = this.zzg.zzm();
            this.zzb = this.zzg.zzr();
            this.zzg.zzs();
            this.zzg.zzs();
            this.zzg.zzs();
            int iZzm = this.zzg.zzm();
            this.zzc = iZzm;
            this.zzd = iZzm + 27;
            this.zzg.zzI(iZzm);
            if (com.google.android.gms.internal.ads.zzacr.zzc(zzacoVar, this.zzg.zzN(), 0, this.zzc, z)) {
                for (int i = 0; i < this.zzc; i++) {
                    this.zzf[i] = this.zzg.zzm();
                    this.zze += this.zzf[i];
                }
                return true;
            }
        }
        return false;
    }

    public final boolean zzc(com.google.android.gms.internal.ads.zzaco zzacoVar, long j) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzcw.zzd(zzacoVar.zzf() == zzacoVar.zze());
        this.zzg.zzI(4);
        while (true) {
            if ((j != -1 && zzacoVar.zzf() + 4 >= j) || !com.google.android.gms.internal.ads.zzacr.zzc(zzacoVar, this.zzg.zzN(), 0, 4, true)) {
                break;
            }
            this.zzg.zzL(0);
            if (this.zzg.zzu() == 1332176723) {
                zzacoVar.zzj();
                return true;
            }
            zzacoVar.zzk(1);
        }
        do {
            if (j != -1 && zzacoVar.zzf() >= j) {
                break;
            }
        } while (zzacoVar.zzc(1) != -1);
        return false;
    }
}
