package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzama implements com.google.android.gms.internal.ads.zzacn {
    private final com.google.android.gms.internal.ads.zzamb zza = new com.google.android.gms.internal.ads.zzamb(null, 0);
    private final com.google.android.gms.internal.ads.zzdy zzb = new com.google.android.gms.internal.ads.zzdy(2786);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        int iZza = zzacoVar.zza(this.zzb.zzN(), 0, 2786);
        if (iZza == -1) {
            return -1;
        }
        this.zzb.zzL(0);
        this.zzb.zzK(iZza);
        if (!this.zzc) {
            this.zza.zzd(0L, 4);
            this.zzc = true;
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
        this.zza.zzb(zzacqVar, new com.google.android.gms.internal.ads.zzanx(Integer.MIN_VALUE, 0, 1));
        zzacqVar.zzD();
        zzacqVar.zzO(new com.google.android.gms.internal.ads.zzadl(androidx.media3.common.C.TIME_UNSET, 0L));
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        this.zzc = false;
        this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        com.google.android.gms.internal.ads.zzacc zzaccVar;
        com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy(10);
        int i = 0;
        while (true) {
            zzaccVar = (com.google.android.gms.internal.ads.zzacc) zzacoVar;
            zzaccVar.zzm(zzdyVar.zzN(), 0, 10, false);
            zzdyVar.zzL(0);
            if (zzdyVar.zzo() != 4801587) {
                break;
            }
            zzdyVar.zzM(3);
            int iZzl = zzdyVar.zzl();
            i += iZzl + 10;
            zzaccVar.zzl(iZzl, false);
        }
        zzacoVar.zzj();
        zzaccVar.zzl(i, false);
        int i2 = 0;
        int i3 = i;
        while (true) {
            zzaccVar.zzm(zzdyVar.zzN(), 0, 6, false);
            zzdyVar.zzL(0);
            if (zzdyVar.zzq() != 2935) {
                zzacoVar.zzj();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                zzaccVar.zzl(i3, false);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int iZzb = com.google.android.gms.internal.ads.zzabn.zzb(zzdyVar.zzN());
                if (iZzb == -1) {
                    return false;
                }
                zzaccVar.zzl(iZzb - 6, false);
            }
        }
    }
}
