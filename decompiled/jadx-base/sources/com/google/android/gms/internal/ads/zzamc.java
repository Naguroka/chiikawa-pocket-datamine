package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzamc implements com.google.android.gms.internal.ads.zzacn {
    private final com.google.android.gms.internal.ads.zzamd zza = new com.google.android.gms.internal.ads.zzamd(null, 0);
    private final com.google.android.gms.internal.ads.zzdy zzb = new com.google.android.gms.internal.ads.zzdy(16384);
    private boolean zzc;

    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        int iZza = zzacoVar.zza(this.zzb.zzN(), 0, 16384);
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
        int i;
        com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy(10);
        int i2 = 0;
        while (true) {
            zzaccVar = (com.google.android.gms.internal.ads.zzacc) zzacoVar;
            zzaccVar.zzm(zzdyVar.zzN(), 0, 10, false);
            zzdyVar.zzL(0);
            if (zzdyVar.zzo() != 4801587) {
                break;
            }
            zzdyVar.zzM(3);
            int iZzl = zzdyVar.zzl();
            i2 += iZzl + 10;
            zzaccVar.zzl(iZzl, false);
        }
        zzacoVar.zzj();
        zzaccVar.zzl(i2, false);
        int i3 = 0;
        int i4 = i2;
        while (true) {
            int i5 = 7;
            zzaccVar.zzm(zzdyVar.zzN(), 0, 7, false);
            zzdyVar.zzL(0);
            int iZzq = zzdyVar.zzq();
            if (iZzq == 44096 || iZzq == 44097) {
                i3++;
                if (i3 >= 4) {
                    return true;
                }
                byte[] bArrZzN = zzdyVar.zzN();
                int i6 = com.google.android.gms.internal.ads.zzabq.zza;
                if (bArrZzN.length < 7) {
                    i = -1;
                } else {
                    int i7 = ((bArrZzN[2] & 255) << 8) | (bArrZzN[3] & 255);
                    if (i7 == 65535) {
                        i7 = ((bArrZzN[4] & 255) << 16) | ((bArrZzN[5] & 255) << 8) | (bArrZzN[6] & 255);
                    } else {
                        i5 = 4;
                    }
                    if (iZzq == 44097) {
                        i5 += 2;
                    }
                    i = i7 + i5;
                }
                if (i == -1) {
                    return false;
                }
                zzaccVar.zzl(i - 7, false);
            } else {
                zzacoVar.zzj();
                i4++;
                if (i4 - i2 >= 8192) {
                    return false;
                }
                zzaccVar.zzl(i4, false);
                i3 = 0;
            }
        }
    }
}
