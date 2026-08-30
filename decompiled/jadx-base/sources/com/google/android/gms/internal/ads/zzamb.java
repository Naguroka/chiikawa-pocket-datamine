package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzamb implements com.google.android.gms.internal.ads.zzamj {
    private final com.google.android.gms.internal.ads.zzdx zza;
    private final com.google.android.gms.internal.ads.zzdy zzb;
    private final java.lang.String zzc;
    private final int zzd;
    private java.lang.String zze;
    private com.google.android.gms.internal.ads.zzadt zzf;
    private int zzg;
    private int zzh;
    private boolean zzi;
    private long zzj;
    private com.google.android.gms.internal.ads.zzab zzk;
    private int zzl;
    private long zzm;

    public zzamb() {
        throw null;
    }

    public zzamb(java.lang.String str, int i) {
        com.google.android.gms.internal.ads.zzdx zzdxVar = new com.google.android.gms.internal.ads.zzdx(new byte[128], 128);
        this.zza = zzdxVar;
        this.zzb = new com.google.android.gms.internal.ads.zzdy(zzdxVar.zza);
        this.zzg = 0;
        this.zzm = androidx.media3.common.C.TIME_UNSET;
        this.zzc = str;
        this.zzd = i;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzf);
        while (zzdyVar.zzb() > 0) {
            int i = this.zzg;
            if (i == 0) {
                while (zzdyVar.zzb() > 0) {
                    if (this.zzi) {
                        int iZzm = zzdyVar.zzm();
                        if (iZzm == 119) {
                            this.zzi = false;
                            this.zzg = 1;
                            com.google.android.gms.internal.ads.zzdy zzdyVar2 = this.zzb;
                            zzdyVar2.zzN()[0] = 11;
                            zzdyVar2.zzN()[1] = 119;
                            this.zzh = 2;
                            break;
                        }
                        this.zzi = iZzm == 11;
                    } else {
                        this.zzi = zzdyVar.zzm() == 11;
                    }
                }
            } else if (i != 1) {
                int iMin = java.lang.Math.min(zzdyVar.zzb(), this.zzl - this.zzh);
                this.zzf.zzr(zzdyVar, iMin);
                int i2 = this.zzh + iMin;
                this.zzh = i2;
                if (i2 == this.zzl) {
                    com.google.android.gms.internal.ads.zzcw.zzf(this.zzm != androidx.media3.common.C.TIME_UNSET);
                    this.zzf.zzt(this.zzm, 1, this.zzl, 0, null);
                    this.zzm += this.zzj;
                    this.zzg = 0;
                }
            } else {
                byte[] bArrZzN = this.zzb.zzN();
                int iMin2 = java.lang.Math.min(zzdyVar.zzb(), 128 - this.zzh);
                zzdyVar.zzH(bArrZzN, this.zzh, iMin2);
                int i3 = this.zzh + iMin2;
                this.zzh = i3;
                if (i3 == 128) {
                    this.zza.zzl(0);
                    com.google.android.gms.internal.ads.zzabl zzablVarZze = com.google.android.gms.internal.ads.zzabn.zze(this.zza);
                    com.google.android.gms.internal.ads.zzab zzabVar = this.zzk;
                    if (zzabVar == null || zzablVarZze.zzc != zzabVar.zzD || zzablVarZze.zzb != zzabVar.zzE || !java.util.Objects.equals(zzablVarZze.zza, zzabVar.zzo)) {
                        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
                        zzzVar.zzM(this.zze);
                        zzzVar.zzaa(zzablVarZze.zza);
                        zzzVar.zzz(zzablVarZze.zzc);
                        zzzVar.zzab(zzablVarZze.zzb);
                        zzzVar.zzQ(this.zzc);
                        zzzVar.zzY(this.zzd);
                        zzzVar.zzV(zzablVarZze.zzf);
                        if (androidx.media3.common.MimeTypes.AUDIO_AC3.equals(zzablVarZze.zza)) {
                            zzzVar.zzy(zzablVarZze.zzf);
                        }
                        com.google.android.gms.internal.ads.zzab zzabVarZzag = zzzVar.zzag();
                        this.zzk = zzabVarZzag;
                        this.zzf.zzm(zzabVarZzag);
                    }
                    this.zzl = zzablVarZze.zzd;
                    this.zzj = (((long) zzablVarZze.zze) * 1000000) / ((long) this.zzk.zzE);
                    this.zzb.zzL(0);
                    this.zzf.zzr(this.zzb, 128);
                    this.zzg = 2;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(com.google.android.gms.internal.ads.zzacq zzacqVar, com.google.android.gms.internal.ads.zzanx zzanxVar) {
        zzanxVar.zzc();
        this.zze = zzanxVar.zzb();
        this.zzf = zzacqVar.zzw(zzanxVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzg = 0;
        this.zzh = 0;
        this.zzi = false;
        this.zzm = androidx.media3.common.C.TIME_UNSET;
    }
}
