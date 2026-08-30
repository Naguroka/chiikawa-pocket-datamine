package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzafb implements com.google.android.gms.internal.ads.zzacn {
    private com.google.android.gms.internal.ads.zzacq zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private com.google.android.gms.internal.ads.zzagv zzg;
    private com.google.android.gms.internal.ads.zzaco zzh;
    private com.google.android.gms.internal.ads.zzafe zzi;
    private com.google.android.gms.internal.ads.zzaiv zzj;
    private final com.google.android.gms.internal.ads.zzdy zza = new com.google.android.gms.internal.ads.zzdy(6);
    private long zzf = -1;

    private final int zza(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        this.zza.zzI(2);
        ((com.google.android.gms.internal.ads.zzacc) zzacoVar).zzm(this.zza.zzN(), 0, 2, false);
        return this.zza.zzq();
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0117  */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        int i;
        java.lang.String strZzy;
        com.google.android.gms.internal.ads.zzafd zzafdVarZza;
        com.google.android.gms.internal.ads.zzagv zzagvVar;
        long j;
        int i2 = this.zzc;
        if (i2 == 0) {
            this.zza.zzI(2);
            zzacoVar.zzi(this.zza.zzN(), 0, 2);
            int iZzq = this.zza.zzq();
            this.zzd = iZzq;
            if (iZzq == 65498) {
                if (this.zzf != -1) {
                    this.zzc = 4;
                    return 0;
                }
                zzg();
                return 0;
            }
            if ((iZzq >= 65488 && iZzq <= 65497) || iZzq == 65281) {
                return 0;
            }
            this.zzc = 1;
            return 0;
        }
        if (i2 == 1) {
            this.zza.zzI(2);
            zzacoVar.zzi(this.zza.zzN(), 0, 2);
            this.zze = this.zza.zzq() - 2;
            this.zzc = 2;
            return 0;
        }
        if (i2 != 2) {
            if (i2 != 4) {
                if (i2 != 5) {
                    if (i2 == 6) {
                        return -1;
                    }
                    throw new java.lang.IllegalStateException();
                }
                if (this.zzi == null || zzacoVar != this.zzh) {
                    this.zzh = zzacoVar;
                    this.zzi = new com.google.android.gms.internal.ads.zzafe(zzacoVar, this.zzf);
                }
                com.google.android.gms.internal.ads.zzaiv zzaivVar = this.zzj;
                zzaivVar.getClass();
                int iZzb = zzaivVar.zzb(this.zzi, zzadjVar);
                if (iZzb == 1) {
                    zzadjVar.zza += this.zzf;
                }
                return iZzb;
            }
            long jZzf = zzacoVar.zzf();
            long j2 = this.zzf;
            if (jZzf != j2) {
                zzadjVar.zza = j2;
                return 1;
            }
            if (zzacoVar.zzm(this.zza.zzN(), 0, 1, true)) {
                zzacoVar.zzj();
                if (this.zzj == null) {
                    this.zzj = new com.google.android.gms.internal.ads.zzaiv(com.google.android.gms.internal.ads.zzakd.zza, 8);
                }
                com.google.android.gms.internal.ads.zzafe zzafeVar = new com.google.android.gms.internal.ads.zzafe(zzacoVar, this.zzf);
                this.zzi = zzafeVar;
                if (this.zzj.zzi(zzafeVar)) {
                    com.google.android.gms.internal.ads.zzaiv zzaivVar2 = this.zzj;
                    long j3 = this.zzf;
                    com.google.android.gms.internal.ads.zzacq zzacqVar = this.zzb;
                    zzacqVar.getClass();
                    zzaivVar2.zze(new com.google.android.gms.internal.ads.zzafg(j3, zzacqVar));
                    com.google.android.gms.internal.ads.zzagv zzagvVar2 = this.zzg;
                    zzagvVar2.getClass();
                    com.google.android.gms.internal.ads.zzacq zzacqVar2 = this.zzb;
                    zzacqVar2.getClass();
                    com.google.android.gms.internal.ads.zzadt zzadtVarZzw = zzacqVar2.zzw(1024, 4);
                    com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
                    zzzVar.zzC(androidx.media3.common.MimeTypes.IMAGE_JPEG);
                    zzzVar.zzT(new com.google.android.gms.internal.ads.zzay(androidx.media3.common.C.TIME_UNSET, zzagvVar2));
                    zzadtVarZzw.zzm(zzzVar.zzag());
                    this.zzc = 5;
                } else {
                    zzg();
                }
            } else {
                zzg();
            }
            return 0;
        }
        if (this.zzd == 65505) {
            com.google.android.gms.internal.ads.zzdy zzdyVar = new com.google.android.gms.internal.ads.zzdy(this.zze);
            zzacoVar.zzi(zzdyVar.zzN(), 0, this.zze);
            if (this.zzg == null && "http://ns.adobe.com/xap/1.0/".equals(zzdyVar.zzy((char) 0)) && (strZzy = zzdyVar.zzy((char) 0)) != null) {
                long jZzd = zzacoVar.zzd();
                if (jZzd == -1 || (zzafdVarZza = com.google.android.gms.internal.ads.zzafh.zza(strZzy)) == null || zzafdVarZza.zzb.size() < 2) {
                    zzagvVar = null;
                } else {
                    long j4 = -1;
                    long j5 = -1;
                    long j6 = -1;
                    long j7 = -1;
                    boolean zEquals = false;
                    for (int size = zzafdVarZza.zzb.size() - 1; size >= 0; size--) {
                        com.google.android.gms.internal.ads.zzafc zzafcVar = (com.google.android.gms.internal.ads.zzafc) zzafdVarZza.zzb.get(size);
                        zEquals |= androidx.media3.common.MimeTypes.VIDEO_MP4.equals(zzafcVar.zza);
                        if (size == 0) {
                            jZzd -= zzafcVar.zzc;
                            j = 0;
                        } else {
                            j = jZzd - zzafcVar.zzb;
                        }
                        long j8 = jZzd;
                        jZzd = j;
                        if (zEquals && jZzd != j8) {
                            j7 = j8 - jZzd;
                            j6 = jZzd;
                            zEquals = false;
                        }
                        if (size == 0) {
                            j5 = j8;
                        }
                        if (size == 0) {
                            j4 = jZzd;
                        }
                    }
                    if (j6 == -1 || j7 == -1 || j4 == -1 || j5 == -1) {
                        zzagvVar = null;
                    } else {
                        zzagvVar = new com.google.android.gms.internal.ads.zzagv(j4, j5, zzafdVarZza.zza, j6, j7);
                    }
                }
                this.zzg = zzagvVar;
                if (zzagvVar != null) {
                    this.zzf = zzagvVar.zzd;
                }
            } else {
                i = 0;
            }
            this.zzc = i;
            return i;
        }
        zzacoVar.zzk(this.zze);
        i = 0;
        this.zzc = i;
        return i;
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
        this.zzb = zzacqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        if (zza(zzacoVar) != 65496) {
            return false;
        }
        int iZza = zza(zzacoVar);
        this.zzd = iZza;
        if (iZza == 65504) {
            this.zza.zzI(2);
            com.google.android.gms.internal.ads.zzacc zzaccVar = (com.google.android.gms.internal.ads.zzacc) zzacoVar;
            zzaccVar.zzm(this.zza.zzN(), 0, 2, false);
            zzaccVar.zzl(this.zza.zzq() - 2, false);
            iZza = zza(zzacoVar);
            this.zzd = iZza;
        }
        if (iZza == 65505) {
            com.google.android.gms.internal.ads.zzacc zzaccVar2 = (com.google.android.gms.internal.ads.zzacc) zzacoVar;
            zzaccVar2.zzl(2, false);
            this.zza.zzI(6);
            zzaccVar2.zzm(this.zza.zzN(), 0, 6, false);
            if (this.zza.zzu() == 1165519206 && this.zza.zzq() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc == 5) {
            com.google.android.gms.internal.ads.zzaiv zzaivVar = this.zzj;
            zzaivVar.getClass();
            zzaivVar.zzf(j, j2);
        }
    }

    private final void zzg() {
        com.google.android.gms.internal.ads.zzacq zzacqVar = this.zzb;
        zzacqVar.getClass();
        zzacqVar.zzD();
        this.zzb.zzO(new com.google.android.gms.internal.ads.zzadl(androidx.media3.common.C.TIME_UNSET, 0L));
        this.zzc = 6;
    }
}
