package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzamo implements com.google.android.gms.internal.ads.zzamj {
    private static final float[] zza = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    private final com.google.android.gms.internal.ads.zzaoa zzb;
    private final com.google.android.gms.internal.ads.zzdy zzc;
    private final boolean[] zzd;
    private final com.google.android.gms.internal.ads.zzamm zze;
    private final com.google.android.gms.internal.ads.zzanb zzf;
    private com.google.android.gms.internal.ads.zzamn zzg;
    private long zzh;
    private java.lang.String zzi;
    private com.google.android.gms.internal.ads.zzadt zzj;
    private boolean zzk;
    private long zzl;

    public zzamo() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0113  */
    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        int i;
        int i2;
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzg);
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzj);
        int iZzd = zzdyVar.zzd();
        int iZze = zzdyVar.zze();
        byte[] bArrZzN = zzdyVar.zzN();
        this.zzh += (long) zzdyVar.zzb();
        this.zzj.zzr(zzdyVar, zzdyVar.zzb());
        while (true) {
            int iZza = com.google.android.gms.internal.ads.zzfk.zza(bArrZzN, iZzd, iZze, this.zzd);
            if (iZza == iZze) {
                break;
            }
            int i3 = iZza + 3;
            int i4 = zzdyVar.zzN()[i3] & 255;
            int i5 = iZza - iZzd;
            if (!this.zzk) {
                if (i5 > 0) {
                    this.zze.zza(bArrZzN, iZzd, iZza);
                }
                if (this.zze.zzc(i4, i5 < 0 ? -i5 : 0)) {
                    com.google.android.gms.internal.ads.zzadt zzadtVar = this.zzj;
                    com.google.android.gms.internal.ads.zzamm zzammVar = this.zze;
                    int i6 = zzammVar.zzb;
                    java.lang.String str = this.zzi;
                    str.getClass();
                    byte[] bArrCopyOf = java.util.Arrays.copyOf(zzammVar.zzc, zzammVar.zza);
                    com.google.android.gms.internal.ads.zzdx zzdxVar = new com.google.android.gms.internal.ads.zzdx(bArrCopyOf, bArrCopyOf.length);
                    zzdxVar.zzo(i6);
                    zzdxVar.zzo(4);
                    zzdxVar.zzm();
                    zzdxVar.zzn(8);
                    if (zzdxVar.zzp()) {
                        zzdxVar.zzn(4);
                        zzdxVar.zzn(3);
                    }
                    int iZzd2 = zzdxVar.zzd(4);
                    float f = 1.0f;
                    if (iZzd2 == 15) {
                        int iZzd3 = zzdxVar.zzd(8);
                        int iZzd4 = zzdxVar.zzd(8);
                        if (iZzd4 == 0) {
                            com.google.android.gms.internal.ads.zzdo.zzf("H263Reader", "Invalid aspect ratio");
                        } else {
                            f = iZzd3 / iZzd4;
                        }
                    } else if (iZzd2 < 7) {
                        f = zza[iZzd2];
                    } else {
                        com.google.android.gms.internal.ads.zzdo.zzf("H263Reader", "Invalid aspect ratio");
                    }
                    float f2 = f;
                    if (zzdxVar.zzp()) {
                        zzdxVar.zzn(2);
                        zzdxVar.zzn(1);
                        if (zzdxVar.zzp()) {
                            zzdxVar.zzn(15);
                            zzdxVar.zzm();
                            zzdxVar.zzn(15);
                            zzdxVar.zzm();
                            zzdxVar.zzn(15);
                            zzdxVar.zzm();
                            zzdxVar.zzn(3);
                            zzdxVar.zzn(11);
                            zzdxVar.zzm();
                            zzdxVar.zzn(15);
                            zzdxVar.zzm();
                            i2 = 2;
                        } else {
                            i2 = 2;
                        }
                    } else {
                        i2 = 2;
                    }
                    if (zzdxVar.zzd(i2) != 0) {
                        com.google.android.gms.internal.ads.zzdo.zzf("H263Reader", "Unhandled video object layer shape");
                    }
                    zzdxVar.zzm();
                    int iZzd5 = zzdxVar.zzd(16);
                    zzdxVar.zzm();
                    if (zzdxVar.zzp()) {
                        if (iZzd5 == 0) {
                            com.google.android.gms.internal.ads.zzdo.zzf("H263Reader", "Invalid vop_increment_time_resolution");
                        } else {
                            int i7 = iZzd5 - 1;
                            int i8 = 0;
                            while (i7 > 0) {
                                i7 >>= 1;
                                i8++;
                            }
                            zzdxVar.zzn(i8);
                        }
                    }
                    zzdxVar.zzm();
                    int iZzd6 = zzdxVar.zzd(13);
                    zzdxVar.zzm();
                    int iZzd7 = zzdxVar.zzd(13);
                    zzdxVar.zzm();
                    zzdxVar.zzm();
                    com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
                    zzzVar.zzM(str);
                    zzzVar.zzaa(androidx.media3.common.MimeTypes.VIDEO_MP4V);
                    zzzVar.zzaf(iZzd6);
                    zzzVar.zzK(iZzd7);
                    zzzVar.zzW(f2);
                    zzzVar.zzN(java.util.Collections.singletonList(bArrCopyOf));
                    zzadtVar.zzm(zzzVar.zzag());
                    this.zzk = true;
                }
            }
            this.zzg.zza(bArrZzN, iZzd, iZza);
            com.google.android.gms.internal.ads.zzanb zzanbVar = this.zzf;
            if (zzanbVar != null) {
                if (i5 > 0) {
                    zzanbVar.zza(bArrZzN, iZzd, iZza);
                    i = 0;
                } else {
                    i = -i5;
                }
                if (this.zzf.zzd(i)) {
                    com.google.android.gms.internal.ads.zzanb zzanbVar2 = this.zzf;
                    int iZzb = com.google.android.gms.internal.ads.zzfk.zzb(zzanbVar2.zza, zzanbVar2.zzb);
                    com.google.android.gms.internal.ads.zzdy zzdyVar2 = this.zzc;
                    int i9 = com.google.android.gms.internal.ads.zzei.zza;
                    zzdyVar2.zzJ(this.zzf.zza, iZzb);
                    this.zzb.zza(this.zzl, this.zzc);
                }
                if (i4 == 178) {
                    if (zzdyVar.zzN()[iZza + 2] == 1) {
                        this.zzf.zzc(org.objectweb.asm.Opcodes.GETSTATIC);
                    }
                    i4 = 178;
                }
            }
            int i10 = iZze - iZza;
            this.zzg.zzb(this.zzh - ((long) i10), i10, this.zzk);
            this.zzg.zzc(i4, this.zzl);
            iZzd = i3;
        }
        if (!this.zzk) {
            this.zze.zza(bArrZzN, iZzd, iZze);
        }
        this.zzg.zza(bArrZzN, iZzd, iZze);
        com.google.android.gms.internal.ads.zzanb zzanbVar3 = this.zzf;
        if (zzanbVar3 != null) {
            zzanbVar3.zza(bArrZzN, iZzd, iZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(com.google.android.gms.internal.ads.zzacq zzacqVar, com.google.android.gms.internal.ads.zzanx zzanxVar) {
        zzanxVar.zzc();
        this.zzi = zzanxVar.zzb();
        this.zzj = zzacqVar.zzw(zzanxVar.zza(), 2);
        this.zzg = new com.google.android.gms.internal.ads.zzamn(this.zzj);
        com.google.android.gms.internal.ads.zzaoa zzaoaVar = this.zzb;
        if (zzaoaVar != null) {
            zzaoaVar.zzb(zzacqVar, zzanxVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzg);
        if (z) {
            this.zzg.zzb(this.zzh, 0, this.zzk);
            this.zzg.zzd();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long j, int i) {
        this.zzl = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        com.google.android.gms.internal.ads.zzfk.zzh(this.zzd);
        this.zze.zzb();
        com.google.android.gms.internal.ads.zzamn zzamnVar = this.zzg;
        if (zzamnVar != null) {
            zzamnVar.zzd();
        }
        com.google.android.gms.internal.ads.zzanb zzanbVar = this.zzf;
        if (zzanbVar != null) {
            zzanbVar.zzb();
        }
        this.zzh = 0L;
        this.zzl = androidx.media3.common.C.TIME_UNSET;
    }

    zzamo(com.google.android.gms.internal.ads.zzaoa zzaoaVar) {
        com.google.android.gms.internal.ads.zzdy zzdyVar;
        this.zzb = zzaoaVar;
        this.zzd = new boolean[4];
        this.zze = new com.google.android.gms.internal.ads.zzamm(128);
        this.zzl = androidx.media3.common.C.TIME_UNSET;
        if (zzaoaVar != null) {
            this.zzf = new com.google.android.gms.internal.ads.zzanb(org.objectweb.asm.Opcodes.GETSTATIC, 128);
            zzdyVar = new com.google.android.gms.internal.ads.zzdy();
        } else {
            zzdyVar = null;
            this.zzf = null;
        }
        this.zzc = zzdyVar;
    }
}
