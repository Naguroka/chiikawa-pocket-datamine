package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzamw implements com.google.android.gms.internal.ads.zzamj {
    private java.lang.String zze;
    private com.google.android.gms.internal.ads.zzadt zzf;
    private boolean zzi;
    private int zzk;
    private int zzl;
    private int zzn;
    private int zzo;
    private int zzs;
    private boolean zzu;
    private int zzd = 0;
    private final com.google.android.gms.internal.ads.zzdy zza = new com.google.android.gms.internal.ads.zzdy(new byte[15], 2);
    private final com.google.android.gms.internal.ads.zzdx zzb = new com.google.android.gms.internal.ads.zzdx();
    private final com.google.android.gms.internal.ads.zzdy zzc = new com.google.android.gms.internal.ads.zzdy();
    private final com.google.android.gms.internal.ads.zzamx zzp = new com.google.android.gms.internal.ads.zzamx();
    private int zzq = androidx.media3.common.C.RATE_UNSET_INT;
    private int zzr = -1;
    private long zzt = -1;
    private boolean zzj = true;
    private boolean zzm = true;
    private double zzg = -9.223372036854776E18d;
    private double zzh = -9.223372036854776E18d;

    private static final void zzf(com.google.android.gms.internal.ads.zzdy zzdyVar, com.google.android.gms.internal.ads.zzdy zzdyVar2, boolean z) {
        int iZzd = zzdyVar.zzd();
        int iMin = java.lang.Math.min(zzdyVar.zzb(), zzdyVar2.zzb());
        zzdyVar.zzH(zzdyVar2.zzN(), zzdyVar2.zzd(), iMin);
        zzdyVar2.zzM(iMin);
        if (z) {
            zzdyVar.zzL(iZzd);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(com.google.android.gms.internal.ads.zzdy zzdyVar) throws com.google.android.gms.internal.ads.zzbc {
        int i;
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzf);
        while (zzdyVar.zzb() > 0) {
            int i2 = this.zzd;
            int iZzd = 0;
            if (i2 == 0) {
                int i3 = this.zzk;
                if ((i3 & 2) != 0) {
                    if ((i3 & 4) == 0) {
                        while (zzdyVar.zzb() > 0) {
                            int i4 = this.zzl << 8;
                            this.zzl = i4;
                            int iZzm = i4 | zzdyVar.zzm();
                            this.zzl = iZzm;
                            if ((iZzm & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK) == 12583333) {
                                zzdyVar.zzL(zzdyVar.zzd() - 3);
                                this.zzl = 0;
                            }
                        }
                    }
                    this.zzd = 1;
                    break;
                }
                zzdyVar.zzL(zzdyVar.zze());
            } else if (i2 != 1) {
                int i5 = this.zzp.zza;
                if (i5 == 1 || i5 == 17) {
                    zzf(zzdyVar, this.zzc, true);
                }
                int iMin = java.lang.Math.min(zzdyVar.zzb(), this.zzp.zzc - this.zzn);
                this.zzf.zzr(zzdyVar, iMin);
                int i6 = this.zzn + iMin;
                this.zzn = i6;
                com.google.android.gms.internal.ads.zzamx zzamxVar = this.zzp;
                if (i6 == zzamxVar.zzc) {
                    int i7 = zzamxVar.zza;
                    if (i7 == 1) {
                        byte[] bArrZzN = this.zzc.zzN();
                        com.google.android.gms.internal.ads.zzamy zzamyVarZza = com.google.android.gms.internal.ads.zzana.zza(new com.google.android.gms.internal.ads.zzdx(bArrZzN, bArrZzN.length));
                        this.zzq = zzamyVarZza.zzb;
                        this.zzr = zzamyVarZza.zzc;
                        long j = this.zzt;
                        long j2 = this.zzp.zzb;
                        if (j != j2) {
                            this.zzt = j2;
                            int i8 = zzamyVarZza.zza;
                            java.lang.String strConcat = i8 != -1 ? "mhm1".concat(java.lang.String.valueOf(java.lang.String.format(".%02X", java.lang.Integer.valueOf(i8)))) : "mhm1";
                            byte[] bArr = zzamyVarZza.zzd;
                            com.google.android.gms.internal.ads.zzfxn zzfxnVarZzp = null;
                            if (bArr != null && bArr.length > 0) {
                                zzfxnVarZzp = com.google.android.gms.internal.ads.zzfxn.zzp(com.google.android.gms.internal.ads.zzei.zzf, bArr);
                            }
                            com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
                            zzzVar.zzM(this.zze);
                            zzzVar.zzaa(androidx.media3.common.MimeTypes.AUDIO_MPEGH_MHM1);
                            zzzVar.zzab(this.zzq);
                            zzzVar.zzA(strConcat);
                            zzzVar.zzN(zzfxnVarZzp);
                            this.zzf.zzm(zzzVar.zzag());
                        }
                        this.zzu = true;
                    } else if (i7 == 17) {
                        byte[] bArrZzN2 = this.zzc.zzN();
                        com.google.android.gms.internal.ads.zzdx zzdxVar = new com.google.android.gms.internal.ads.zzdx(bArrZzN2, bArrZzN2.length);
                        if (zzdxVar.zzp()) {
                            zzdxVar.zzn(2);
                            iZzd = zzdxVar.zzd(13);
                        }
                        this.zzs = iZzd;
                    } else if (i7 == 2) {
                        if (this.zzu) {
                            this.zzj = false;
                            i = 1;
                        } else {
                            i = 0;
                        }
                        int i9 = this.zzr - this.zzs;
                        double d = this.zzq;
                        long jRound = java.lang.Math.round(this.zzg);
                        if (this.zzi) {
                            this.zzi = false;
                            this.zzg = this.zzh;
                        } else {
                            this.zzg += (((double) i9) * 1000000.0d) / d;
                        }
                        this.zzf.zzt(jRound, i, this.zzo, 0, null);
                        this.zzu = false;
                        this.zzs = 0;
                        this.zzo = 0;
                    }
                    this.zzd = 1;
                }
            } else {
                zzf(zzdyVar, this.zza, false);
                com.google.android.gms.internal.ads.zzdy zzdyVar2 = this.zza;
                if (zzdyVar2.zzb() == 0) {
                    com.google.android.gms.internal.ads.zzdx zzdxVar2 = this.zzb;
                    int iZze = zzdyVar2.zze();
                    zzdxVar2.zzk(zzdyVar2.zzN(), iZze);
                    if (com.google.android.gms.internal.ads.zzana.zzb(this.zzb, this.zzp)) {
                        this.zzn = 0;
                        this.zzo += this.zzp.zzc + iZze;
                        this.zza.zzL(0);
                        com.google.android.gms.internal.ads.zzadt zzadtVar = this.zzf;
                        com.google.android.gms.internal.ads.zzdy zzdyVar3 = this.zza;
                        zzadtVar.zzr(zzdyVar3, zzdyVar3.zze());
                        this.zza.zzI(2);
                        this.zzc.zzI(this.zzp.zzc);
                        this.zzm = true;
                        this.zzd = 2;
                    } else {
                        com.google.android.gms.internal.ads.zzdy zzdyVar4 = this.zza;
                        if (zzdyVar4.zze() < 15) {
                            zzdyVar4.zzK(zzdyVar4.zze() + 1);
                        }
                    }
                }
                this.zzm = false;
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
        this.zzk = i;
        if (!this.zzj && (this.zzo != 0 || !this.zzm)) {
            this.zzi = true;
        }
        if (j != androidx.media3.common.C.TIME_UNSET) {
            double d = j;
            if (this.zzi) {
                this.zzh = d;
            } else {
                this.zzg = d;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzd = 0;
        this.zzl = 0;
        this.zza.zzI(2);
        this.zzn = 0;
        this.zzo = 0;
        this.zzq = androidx.media3.common.C.RATE_UNSET_INT;
        this.zzr = -1;
        this.zzs = 0;
        this.zzt = -1L;
        this.zzu = false;
        this.zzi = false;
        this.zzm = true;
        this.zzj = true;
        this.zzg = -9.223372036854776E18d;
        this.zzh = -9.223372036854776E18d;
    }
}
