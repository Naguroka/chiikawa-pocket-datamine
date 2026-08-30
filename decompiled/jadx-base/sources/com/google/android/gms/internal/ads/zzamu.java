package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzamu implements com.google.android.gms.internal.ads.zzamj {
    private final java.lang.String zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zzdy zzc;
    private final com.google.android.gms.internal.ads.zzdx zzd;
    private com.google.android.gms.internal.ads.zzadt zze;
    private java.lang.String zzf;
    private com.google.android.gms.internal.ads.zzab zzg;
    private int zzh;
    private int zzi;
    private int zzj;
    private int zzk;
    private long zzl;
    private boolean zzm;
    private int zzn;
    private int zzo;
    private int zzp;
    private boolean zzq;
    private long zzr;
    private int zzs;
    private long zzt;
    private int zzu;
    private java.lang.String zzv;

    public zzamu(java.lang.String str, int i) {
        this.zza = str;
        this.zzb = i;
        com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy(1024);
        this.zzc = zzdyVar;
        byte[] bArrZzN = zzdyVar.zzN();
        this.zzd = new com.google.android.gms.internal.ads.zzdx(bArrZzN, bArrZzN.length);
        this.zzl = androidx.media3.common.C.TIME_UNSET;
    }

    private final int zzf(com.google.android.gms.internal.ads.zzdx zzdxVar) throws com.google.android.gms.internal.ads.zzbc {
        int iZza = zzdxVar.zza();
        com.google.android.gms.internal.ads.zzabi zzabiVarZzb = com.google.android.gms.internal.ads.zzabk.zzb(zzdxVar, true);
        this.zzv = zzabiVarZzb.zzc;
        this.zzs = zzabiVarZzb.zza;
        this.zzu = zzabiVarZzb.zzb;
        return iZza - zzdxVar.zza();
    }

    private static long zzg(com.google.android.gms.internal.ads.zzdx zzdxVar) {
        return zzdxVar.zzd((zzdxVar.zzd(2) + 1) * 8);
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(com.google.android.gms.internal.ads.zzdy zzdyVar) throws com.google.android.gms.internal.ads.zzbc {
        int i;
        int i2;
        int iZzd;
        boolean zZzp;
        com.google.android.gms.internal.ads.zzcw.zzb(this.zze);
        while (zzdyVar.zzb() > 0) {
            int i3 = this.zzh;
            if (i3 != 0) {
                if (i3 == 1) {
                    int iZzm = zzdyVar.zzm();
                    if ((iZzm & 224) == 224) {
                        this.zzk = iZzm;
                        this.zzh = 2;
                    } else if (iZzm != 86) {
                        this.zzh = 0;
                    }
                } else if (i3 != 2) {
                    int iMin = java.lang.Math.min(zzdyVar.zzb(), this.zzj - this.zzi);
                    zzdyVar.zzH(this.zzd.zza, this.zzi, iMin);
                    int i4 = this.zzi + iMin;
                    this.zzi = i4;
                    if (i4 == this.zzj) {
                        this.zzd.zzl(0);
                        com.google.android.gms.internal.ads.zzdx zzdxVar = this.zzd;
                        if (zzdxVar.zzp()) {
                            if (this.zzm) {
                            }
                            this.zzh = 0;
                        } else {
                            this.zzm = true;
                            int iZzd2 = zzdxVar.zzd(1);
                            if (iZzd2 == 1) {
                                iZzd = zzdxVar.zzd(1);
                                i2 = 1;
                            } else {
                                i2 = iZzd2;
                                iZzd = 0;
                            }
                            this.zzn = iZzd;
                            if (iZzd != 0) {
                                throw com.google.android.gms.internal.ads.zzbc.zza(null, null);
                            }
                            if (i2 == 1) {
                                zzg(zzdxVar);
                                i2 = 1;
                            }
                            if (!zzdxVar.zzp()) {
                                throw com.google.android.gms.internal.ads.zzbc.zza(null, null);
                            }
                            this.zzo = zzdxVar.zzd(6);
                            int iZzd3 = zzdxVar.zzd(4);
                            int iZzd4 = zzdxVar.zzd(3);
                            if (iZzd3 != 0 || iZzd4 != 0) {
                                throw com.google.android.gms.internal.ads.zzbc.zza(null, null);
                            }
                            if (i2 == 0) {
                                int iZzc = zzdxVar.zzc();
                                int iZzf = zzf(zzdxVar);
                                zzdxVar.zzl(iZzc);
                                byte[] bArr = new byte[(iZzf + 7) / 8];
                                zzdxVar.zzh(bArr, 0, iZzf);
                                com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
                                zzzVar.zzM(this.zzf);
                                zzzVar.zzaa(androidx.media3.common.MimeTypes.AUDIO_AAC);
                                zzzVar.zzA(this.zzv);
                                zzzVar.zzz(this.zzu);
                                zzzVar.zzab(this.zzs);
                                zzzVar.zzN(java.util.Collections.singletonList(bArr));
                                zzzVar.zzQ(this.zza);
                                zzzVar.zzY(this.zzb);
                                com.google.android.gms.internal.ads.zzab zzabVarZzag = zzzVar.zzag();
                                if (!zzabVarZzag.equals(this.zzg)) {
                                    this.zzg = zzabVarZzag;
                                    this.zzt = 1024000000 / ((long) zzabVarZzag.zzE);
                                    this.zze.zzm(zzabVarZzag);
                                }
                            } else {
                                zzdxVar.zzn(((int) zzg(zzdxVar)) - zzf(zzdxVar));
                            }
                            int iZzd5 = zzdxVar.zzd(3);
                            this.zzp = iZzd5;
                            if (iZzd5 == 0) {
                                zzdxVar.zzn(8);
                            } else if (iZzd5 == 1) {
                                zzdxVar.zzn(9);
                            } else if (iZzd5 == 3 || iZzd5 == 4 || iZzd5 == 5) {
                                zzdxVar.zzn(6);
                            } else {
                                if (iZzd5 != 6 && iZzd5 != 7) {
                                    throw new java.lang.IllegalStateException();
                                }
                                zzdxVar.zzn(1);
                            }
                            boolean zZzp2 = zzdxVar.zzp();
                            this.zzq = zZzp2;
                            this.zzr = 0L;
                            if (zZzp2) {
                                if (i2 != 1) {
                                    do {
                                        zZzp = zzdxVar.zzp();
                                        this.zzr = (this.zzr << 8) + ((long) zzdxVar.zzd(8));
                                    } while (zZzp);
                                } else {
                                    this.zzr = zzg(zzdxVar);
                                }
                            }
                            if (zzdxVar.zzp()) {
                                zzdxVar.zzn(8);
                            }
                        }
                        if (this.zzn != 0) {
                            throw com.google.android.gms.internal.ads.zzbc.zza(null, null);
                        }
                        if (this.zzo != 0) {
                            throw com.google.android.gms.internal.ads.zzbc.zza(null, null);
                        }
                        if (this.zzp != 0) {
                            throw com.google.android.gms.internal.ads.zzbc.zza(null, null);
                        }
                        int i5 = 0;
                        while (true) {
                            int iZzd6 = zzdxVar.zzd(8);
                            i = i5 + iZzd6;
                            if (iZzd6 != 255) {
                                break;
                            } else {
                                i5 = i;
                            }
                        }
                        int iZzc2 = zzdxVar.zzc();
                        if ((iZzc2 & 7) == 0) {
                            this.zzc.zzL(iZzc2 >> 3);
                        } else {
                            zzdxVar.zzh(this.zzc.zzN(), 0, i * 8);
                            this.zzc.zzL(0);
                        }
                        this.zze.zzr(this.zzc, i);
                        com.google.android.gms.internal.ads.zzcw.zzf(this.zzl != androidx.media3.common.C.TIME_UNSET);
                        this.zze.zzt(this.zzl, 1, i, 0, null);
                        this.zzl += this.zzt;
                        if (this.zzq) {
                            zzdxVar.zzn((int) this.zzr);
                        }
                        this.zzh = 0;
                    } else {
                        continue;
                    }
                } else {
                    int iZzm2 = ((this.zzk & (-225)) << 8) | zzdyVar.zzm();
                    this.zzj = iZzm2;
                    com.google.android.gms.internal.ads.zzdy zzdyVar2 = this.zzc;
                    if (iZzm2 > zzdyVar2.zzN().length) {
                        zzdyVar2.zzI(iZzm2);
                        com.google.android.gms.internal.ads.zzdx zzdxVar2 = this.zzd;
                        byte[] bArrZzN = this.zzc.zzN();
                        zzdxVar2.zzk(bArrZzN, bArrZzN.length);
                    }
                    this.zzi = 0;
                    this.zzh = 3;
                }
            } else if (zzdyVar.zzm() == 86) {
                this.zzh = 1;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(com.google.android.gms.internal.ads.zzacq zzacqVar, com.google.android.gms.internal.ads.zzanx zzanxVar) {
        zzanxVar.zzc();
        this.zze = zzacqVar.zzw(zzanxVar.zza(), 1);
        this.zzf = zzanxVar.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long j, int i) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzh = 0;
        this.zzl = androidx.media3.common.C.TIME_UNSET;
        this.zzm = false;
    }
}
