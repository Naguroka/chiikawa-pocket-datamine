package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzame implements com.google.android.gms.internal.ads.zzacn {
    private final com.google.android.gms.internal.ads.zzamf zza;
    private final com.google.android.gms.internal.ads.zzdy zzb;
    private final com.google.android.gms.internal.ads.zzdy zzc;
    private final com.google.android.gms.internal.ads.zzdx zzd;
    private com.google.android.gms.internal.ads.zzacq zze;
    private long zzf;
    private long zzg;
    private boolean zzh;
    private boolean zzi;

    public zzame() {
        throw null;
    }

    public zzame(int i) {
        this.zza = new com.google.android.gms.internal.ads.zzamf(true, null, 0);
        this.zzb = new com.google.android.gms.internal.ads.zzdy(2048);
        this.zzg = -1L;
        com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy(10);
        this.zzc = zzdyVar;
        byte[] bArrZzN = zzdyVar.zzN();
        this.zzd = new com.google.android.gms.internal.ads.zzdx(bArrZzN, bArrZzN.length);
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzcw.zzb(this.zze);
        int iZza = zzacoVar.zza(this.zzb.zzN(), 0, 2048);
        if (!this.zzi) {
            this.zze.zzO(new com.google.android.gms.internal.ads.zzadl(androidx.media3.common.C.TIME_UNSET, 0L));
            this.zzi = true;
        }
        if (iZza == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(iZza);
        if (!this.zzh) {
            this.zza.zzd(this.zzf, 4);
            this.zzh = true;
        }
        this.zza.zza(this.zzb);
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ com.google.android.gms.internal.ads.zzacn zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final /* synthetic */ java.util.List zzd() {
        return com.google.android.gms.internal.ads.zzfxn.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zze(com.google.android.gms.internal.ads.zzacq zzacqVar) {
        this.zze = zzacqVar;
        this.zza.zzb(zzacqVar, new com.google.android.gms.internal.ads.zzanx(Integer.MIN_VALUE, 0, 1));
        zzacqVar.zzD();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        this.zzh = false;
        this.zza.zze();
        this.zzf = j2;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzacc zzaccVar;
        int i = 0;
        while (true) {
            zzaccVar = (com.google.android.gms.internal.ads.zzacc) zzacoVar;
            zzaccVar.zzm(this.zzc.zzN(), 0, 10, false);
            this.zzc.zzL(0);
            if (this.zzc.zzo() != 4801587) {
                break;
            }
            this.zzc.zzM(3);
            int iZzl = this.zzc.zzl();
            i += iZzl + 10;
            zzaccVar.zzl(iZzl, false);
        }
        zzacoVar.zzj();
        zzaccVar.zzl(i, false);
        if (this.zzg == -1) {
            this.zzg = i;
        }
        int i2 = 0;
        int i3 = 0;
        int i4 = i;
        do {
            zzaccVar.zzm(this.zzc.zzN(), 0, 2, false);
            this.zzc.zzL(0);
            if (com.google.android.gms.internal.ads.zzamf.zzf(this.zzc.zzq())) {
                i2++;
                if (i2 >= 4 && i3 > 188) {
                    return true;
                }
                zzaccVar.zzm(this.zzc.zzN(), 0, 4, false);
                this.zzd.zzl(14);
                int iZzd = this.zzd.zzd(13);
                if (iZzd <= 6) {
                    i4++;
                    zzacoVar.zzj();
                    zzaccVar.zzl(i4, false);
                } else {
                    zzaccVar.zzl(iZzd - 6, false);
                    i3 += iZzd;
                }
            } else {
                i4++;
                zzacoVar.zzj();
                zzaccVar.zzl(i4, false);
            }
            i2 = 0;
            i3 = 0;
        } while (i4 - i < 8192);
        return false;
    }
}
