package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzaey extends com.google.android.gms.internal.ads.zzaex {
    private final com.google.android.gms.internal.ads.zzdy zzb;
    private final com.google.android.gms.internal.ads.zzdy zzc;
    private int zzd;
    private boolean zze;
    private boolean zzf;
    private int zzg;

    public zzaey(com.google.android.gms.internal.ads.zzadt zzadtVar) {
        super(zzadtVar);
        this.zzb = new com.google.android.gms.internal.ads.zzdy(com.google.android.gms.internal.ads.zzfk.zza);
        this.zzc = new com.google.android.gms.internal.ads.zzdy(4);
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    protected final boolean zza(com.google.android.gms.internal.ads.zzdy zzdyVar) throws com.google.android.gms.internal.ads.zzaew {
        int iZzm = zzdyVar.zzm();
        int i = iZzm >> 4;
        int i2 = iZzm & 15;
        if (i2 == 7) {
            this.zzg = i;
            return i != 5;
        }
        throw new com.google.android.gms.internal.ads.zzaew("Video format not supported: " + i2);
    }

    @Override // com.google.android.gms.internal.ads.zzaex
    protected final boolean zzb(com.google.android.gms.internal.ads.zzdy zzdyVar, long j) throws com.google.android.gms.internal.ads.zzbc {
        int i;
        int iZzm = zzdyVar.zzm();
        long jZzh = zzdyVar.zzh();
        if (iZzm == 0) {
            if (!this.zze) {
                com.google.android.gms.internal.ads.zzdy zzdyVar2 = new com.google.android.gms.internal.ads.zzdy(new byte[zzdyVar.zzb()]);
                zzdyVar.zzH(zzdyVar2.zzN(), 0, zzdyVar.zzb());
                com.google.android.gms.internal.ads.zzabr zzabrVarZza = com.google.android.gms.internal.ads.zzabr.zza(zzdyVar2);
                this.zzd = zzabrVarZza.zzb;
                com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
                zzzVar.zzaa("video/avc");
                zzzVar.zzA(zzabrVarZza.zzl);
                zzzVar.zzaf(zzabrVarZza.zzc);
                zzzVar.zzK(zzabrVarZza.zzd);
                zzzVar.zzW(zzabrVarZza.zzk);
                zzzVar.zzN(zzabrVarZza.zza);
                this.zza.zzm(zzzVar.zzag());
                this.zze = true;
                return false;
            }
        } else if (iZzm == 1 && this.zze) {
            int i2 = this.zzg == 1 ? 1 : 0;
            if (this.zzf) {
                i = i2;
            } else if (i2 != 0) {
                i = 1;
            }
            byte[] bArrZzN = this.zzc.zzN();
            bArrZzN[0] = 0;
            bArrZzN[1] = 0;
            bArrZzN[2] = 0;
            int i3 = 4 - this.zzd;
            int i4 = 0;
            while (zzdyVar.zzb() > 0) {
                zzdyVar.zzH(this.zzc.zzN(), i3, this.zzd);
                this.zzc.zzL(0);
                com.google.android.gms.internal.ads.zzdy zzdyVar3 = this.zzc;
                com.google.android.gms.internal.ads.zzdy zzdyVar4 = this.zzb;
                int iZzp = zzdyVar3.zzp();
                zzdyVar4.zzL(0);
                this.zza.zzr(this.zzb, 4);
                this.zza.zzr(zzdyVar, iZzp);
                i4 = i4 + 4 + iZzp;
            }
            this.zza.zzt(j + (jZzh * 1000), i, i4, 0, null);
            this.zzf = true;
            return true;
        }
        return false;
    }
}
