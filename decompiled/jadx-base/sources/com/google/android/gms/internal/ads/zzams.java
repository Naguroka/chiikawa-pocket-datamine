package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzams implements com.google.android.gms.internal.ads.zzamj {
    private final com.google.android.gms.internal.ads.zzann zza;
    private java.lang.String zzb;
    private com.google.android.gms.internal.ads.zzadt zzc;
    private com.google.android.gms.internal.ads.zzamr zzd;
    private boolean zze;
    private long zzl;
    private final boolean[] zzf = new boolean[3];
    private final com.google.android.gms.internal.ads.zzanb zzg = new com.google.android.gms.internal.ads.zzanb(32, 128);
    private final com.google.android.gms.internal.ads.zzanb zzh = new com.google.android.gms.internal.ads.zzanb(33, 128);
    private final com.google.android.gms.internal.ads.zzanb zzi = new com.google.android.gms.internal.ads.zzanb(34, 128);
    private final com.google.android.gms.internal.ads.zzanb zzj = new com.google.android.gms.internal.ads.zzanb(39, 128);
    private final com.google.android.gms.internal.ads.zzanb zzk = new com.google.android.gms.internal.ads.zzanb(40, 128);
    private long zzm = androidx.media3.common.C.TIME_UNSET;
    private final com.google.android.gms.internal.ads.zzdy zzn = new com.google.android.gms.internal.ads.zzdy();

    public zzams(com.google.android.gms.internal.ads.zzann zzannVar) {
        this.zza = zzannVar;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        this.zzd.zzc(bArr, i, i2);
        if (!this.zze) {
            this.zzg.zza(bArr, i, i2);
            this.zzh.zza(bArr, i, i2);
            this.zzi.zza(bArr, i, i2);
        }
        this.zzj.zza(bArr, i, i2);
        this.zzk.zza(bArr, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0155  */
    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzc);
        int i = com.google.android.gms.internal.ads.zzei.zza;
        while (zzdyVar.zzb() > 0) {
            int iZzd = zzdyVar.zzd();
            int iZze = zzdyVar.zze();
            byte[] bArrZzN = zzdyVar.zzN();
            this.zzl += (long) zzdyVar.zzb();
            this.zzc.zzr(zzdyVar, zzdyVar.zzb());
            while (iZzd < iZze) {
                int iZza = com.google.android.gms.internal.ads.zzfk.zza(bArrZzN, iZzd, iZze, this.zzf);
                if (iZza == iZze) {
                    zzf(bArrZzN, iZzd, iZze);
                    return;
                }
                int i2 = iZza + 3;
                int i3 = bArrZzN[i2] & 126;
                int i4 = iZza - iZzd;
                if (i4 > 0) {
                    zzf(bArrZzN, iZzd, iZza);
                }
                int i5 = iZze - iZza;
                long j = this.zzl - ((long) i5);
                int i6 = i4 < 0 ? -i4 : 0;
                long j2 = this.zzm;
                this.zzd.zzb(j, i5, this.zze);
                if (!this.zze) {
                    this.zzg.zzd(i6);
                    this.zzh.zzd(i6);
                    this.zzi.zzd(i6);
                    com.google.android.gms.internal.ads.zzanb zzanbVar = this.zzg;
                    if (zzanbVar.zze()) {
                        com.google.android.gms.internal.ads.zzanb zzanbVar2 = this.zzh;
                        if (zzanbVar2.zze()) {
                            com.google.android.gms.internal.ads.zzanb zzanbVar3 = this.zzi;
                            if (zzanbVar3.zze()) {
                                java.lang.String str = this.zzb;
                                int i7 = zzanbVar.zzb;
                                byte[] bArr = new byte[zzanbVar2.zzb + i7 + zzanbVar3.zzb];
                                java.lang.System.arraycopy(zzanbVar.zza, 0, bArr, 0, i7);
                                java.lang.System.arraycopy(zzanbVar2.zza, 0, bArr, zzanbVar.zzb, zzanbVar2.zzb);
                                java.lang.System.arraycopy(zzanbVar3.zza, 0, bArr, zzanbVar.zzb + zzanbVar2.zzb, zzanbVar3.zzb);
                                java.lang.String strZzd = null;
                                com.google.android.gms.internal.ads.zzfe zzfeVarZzc = com.google.android.gms.internal.ads.zzfk.zzc(zzanbVar2.zza, 3, zzanbVar2.zzb, null);
                                com.google.android.gms.internal.ads.zzez zzezVar = zzfeVarZzc.zza;
                                if (zzezVar != null) {
                                    int i8 = zzezVar.zzf;
                                    int[] iArr = zzezVar.zze;
                                    strZzd = com.google.android.gms.internal.ads.zzcy.zzd(zzezVar.zza, zzezVar.zzb, zzezVar.zzc, zzezVar.zzd, iArr, i8);
                                }
                                com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
                                zzzVar.zzM(str);
                                zzzVar.zzaa("video/hevc");
                                zzzVar.zzA(strZzd);
                                zzzVar.zzaf(zzfeVarZzc.zzd);
                                zzzVar.zzK(zzfeVarZzc.zze);
                                com.google.android.gms.internal.ads.zzi zziVar = new com.google.android.gms.internal.ads.zzi();
                                zziVar.zzc(zzfeVarZzc.zzh);
                                zziVar.zzb(zzfeVarZzc.zzi);
                                zziVar.zzd(zzfeVarZzc.zzj);
                                zziVar.zzf(zzfeVarZzc.zzb + 8);
                                zziVar.zza(zzfeVarZzc.zzc + 8);
                                zzzVar.zzB(zziVar.zzg());
                                zzzVar.zzW(zzfeVarZzc.zzf);
                                zzzVar.zzS(zzfeVarZzc.zzg);
                                zzzVar.zzN(java.util.Collections.singletonList(bArr));
                                com.google.android.gms.internal.ads.zzab zzabVarZzag = zzzVar.zzag();
                                this.zzc.zzm(zzabVarZzag);
                                com.google.android.gms.internal.ads.zzfun.zzl(zzabVarZzag.zzq != -1);
                                this.zza.zze(zzabVarZzag.zzq);
                                this.zze = true;
                            }
                        }
                    }
                }
                if (this.zzj.zzd(i6)) {
                    com.google.android.gms.internal.ads.zzanb zzanbVar4 = this.zzj;
                    this.zzn.zzJ(this.zzj.zza, com.google.android.gms.internal.ads.zzfk.zzb(zzanbVar4.zza, zzanbVar4.zzb));
                    this.zzn.zzM(5);
                    this.zza.zza(j2, this.zzn);
                }
                if (this.zzk.zzd(i6)) {
                    com.google.android.gms.internal.ads.zzanb zzanbVar5 = this.zzk;
                    this.zzn.zzJ(this.zzk.zza, com.google.android.gms.internal.ads.zzfk.zzb(zzanbVar5.zza, zzanbVar5.zzb));
                    this.zzn.zzM(5);
                    this.zza.zza(j2, this.zzn);
                }
                int i9 = i3 >> 1;
                this.zzd.zze(j, i5, i9, this.zzm, this.zze);
                if (!this.zze) {
                    this.zzg.zzc(i9);
                    this.zzh.zzc(i9);
                    this.zzi.zzc(i9);
                }
                this.zzj.zzc(i9);
                this.zzk.zzc(i9);
                iZzd = i2;
                iZze = iZze;
                bArrZzN = bArrZzN;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(com.google.android.gms.internal.ads.zzacq zzacqVar, com.google.android.gms.internal.ads.zzanx zzanxVar) {
        zzanxVar.zzc();
        this.zzb = zzanxVar.zzb();
        this.zzc = zzacqVar.zzw(zzanxVar.zza(), 2);
        this.zzd = new com.google.android.gms.internal.ads.zzamr(this.zzc);
        this.zza.zzb(zzacqVar, zzanxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzc);
        int i = com.google.android.gms.internal.ads.zzei.zza;
        if (z) {
            this.zza.zzc();
            this.zzd.zza(this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zzl = 0L;
        this.zzm = androidx.media3.common.C.TIME_UNSET;
        com.google.android.gms.internal.ads.zzfk.zzh(this.zzf);
        this.zzg.zzb();
        this.zzh.zzb();
        this.zzi.zzb();
        this.zzj.zzb();
        this.zzk.zzb();
        this.zza.zzc();
        com.google.android.gms.internal.ads.zzamr zzamrVar = this.zzd;
        if (zzamrVar != null) {
            zzamrVar.zzd();
        }
    }
}
