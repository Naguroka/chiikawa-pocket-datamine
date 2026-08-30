package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzamq implements com.google.android.gms.internal.ads.zzamj {
    private final com.google.android.gms.internal.ads.zzann zza;
    private long zze;
    private java.lang.String zzg;
    private com.google.android.gms.internal.ads.zzadt zzh;
    private com.google.android.gms.internal.ads.zzamp zzi;
    private boolean zzj;
    private boolean zzl;
    private final boolean[] zzf = new boolean[3];
    private final com.google.android.gms.internal.ads.zzanb zzb = new com.google.android.gms.internal.ads.zzanb(7, 128);
    private final com.google.android.gms.internal.ads.zzanb zzc = new com.google.android.gms.internal.ads.zzanb(8, 128);
    private final com.google.android.gms.internal.ads.zzanb zzd = new com.google.android.gms.internal.ads.zzanb(6, 128);
    private long zzk = androidx.media3.common.C.TIME_UNSET;
    private final com.google.android.gms.internal.ads.zzdy zzm = new com.google.android.gms.internal.ads.zzdy();

    public zzamq(com.google.android.gms.internal.ads.zzann zzannVar, boolean z, boolean z2) {
        this.zza = zzannVar;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"sampleReader"})
    private final void zzf(byte[] bArr, int i, int i2) {
        if (!this.zzj) {
            this.zzb.zza(bArr, i, i2);
            this.zzc.zza(bArr, i, i2);
        }
        this.zzd.zza(bArr, i, i2);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0052  */
    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        int i;
        int i2;
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzh);
        int i3 = com.google.android.gms.internal.ads.zzei.zza;
        int iZzd = zzdyVar.zzd();
        int iZze = zzdyVar.zze();
        byte[] bArrZzN = zzdyVar.zzN();
        this.zze += (long) zzdyVar.zzb();
        this.zzh.zzr(zzdyVar, zzdyVar.zzb());
        while (true) {
            int iZza = com.google.android.gms.internal.ads.zzfk.zza(bArrZzN, iZzd, iZze, this.zzf);
            if (iZza == iZze) {
                zzf(bArrZzN, iZzd, iZze);
                return;
            }
            int i4 = iZza + 3;
            int i5 = bArrZzN[i4] & 31;
            int i6 = iZza - iZzd;
            if (i6 > 0) {
                zzf(bArrZzN, iZzd, iZza);
            }
            int i7 = iZze - iZza;
            long j = this.zze - ((long) i7);
            int i8 = i6 < 0 ? -i6 : 0;
            long j2 = this.zzk;
            if (this.zzj) {
                i = iZze;
                i2 = i4;
            } else {
                this.zzb.zzd(i8);
                this.zzc.zzd(i8);
                if (this.zzj) {
                    i = iZze;
                    i2 = i4;
                    com.google.android.gms.internal.ads.zzanb zzanbVar = this.zzb;
                    if (zzanbVar.zze()) {
                        com.google.android.gms.internal.ads.zzfj zzfjVarZzf = com.google.android.gms.internal.ads.zzfk.zzf(zzanbVar.zza, 4, zzanbVar.zzb);
                        this.zza.zze(zzfjVarZzf.zzm);
                        this.zzi.zzc(zzfjVarZzf);
                        this.zzb.zzb();
                    } else {
                        com.google.android.gms.internal.ads.zzanb zzanbVar2 = this.zzc;
                        if (zzanbVar2.zze()) {
                            this.zzi.zzb(com.google.android.gms.internal.ads.zzfk.zze(zzanbVar2.zza, 4, zzanbVar2.zzb));
                            this.zzc.zzb();
                        }
                    }
                } else if (this.zzb.zze() && this.zzc.zze()) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    com.google.android.gms.internal.ads.zzanb zzanbVar3 = this.zzb;
                    arrayList.add(java.util.Arrays.copyOf(zzanbVar3.zza, zzanbVar3.zzb));
                    com.google.android.gms.internal.ads.zzanb zzanbVar4 = this.zzc;
                    arrayList.add(java.util.Arrays.copyOf(zzanbVar4.zza, zzanbVar4.zzb));
                    com.google.android.gms.internal.ads.zzanb zzanbVar5 = this.zzb;
                    com.google.android.gms.internal.ads.zzfj zzfjVarZzf2 = com.google.android.gms.internal.ads.zzfk.zzf(zzanbVar5.zza, 4, zzanbVar5.zzb);
                    com.google.android.gms.internal.ads.zzanb zzanbVar6 = this.zzc;
                    com.google.android.gms.internal.ads.zzfi zzfiVarZze = com.google.android.gms.internal.ads.zzfk.zze(zzanbVar6.zza, 4, zzanbVar6.zzb);
                    i2 = i4;
                    java.lang.String strZzc = com.google.android.gms.internal.ads.zzcy.zzc(zzfjVarZzf2.zza, zzfjVarZzf2.zzb, zzfjVarZzf2.zzc);
                    com.google.android.gms.internal.ads.zzadt zzadtVar = this.zzh;
                    com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
                    i = iZze;
                    zzzVar.zzM(this.zzg);
                    zzzVar.zzaa("video/avc");
                    zzzVar.zzA(strZzc);
                    zzzVar.zzaf(zzfjVarZzf2.zze);
                    zzzVar.zzK(zzfjVarZzf2.zzf);
                    com.google.android.gms.internal.ads.zzi zziVar = new com.google.android.gms.internal.ads.zzi();
                    zziVar.zzc(zzfjVarZzf2.zzj);
                    zziVar.zzb(zzfjVarZzf2.zzk);
                    zziVar.zzd(zzfjVarZzf2.zzl);
                    zziVar.zzf(zzfjVarZzf2.zzh + 8);
                    zziVar.zza(zzfjVarZzf2.zzi + 8);
                    zzzVar.zzB(zziVar.zzg());
                    zzzVar.zzW(zzfjVarZzf2.zzg);
                    zzzVar.zzN(arrayList);
                    zzzVar.zzS(zzfjVarZzf2.zzm);
                    zzadtVar.zzm(zzzVar.zzag());
                    this.zzj = true;
                    this.zzi.zzc(zzfjVarZzf2);
                    this.zzi.zzb(zzfiVarZze);
                    this.zzb.zzb();
                    this.zzc.zzb();
                } else {
                    i = iZze;
                    i2 = i4;
                }
            }
            if (this.zzd.zzd(i8)) {
                com.google.android.gms.internal.ads.zzanb zzanbVar7 = this.zzd;
                this.zzm.zzJ(this.zzd.zza, com.google.android.gms.internal.ads.zzfk.zzb(zzanbVar7.zza, zzanbVar7.zzb));
                this.zzm.zzL(4);
                this.zza.zza(j2, this.zzm);
            }
            if (this.zzi.zzf(j, i7, this.zzj)) {
                this.zzl = false;
            }
            long j3 = this.zzk;
            if (!this.zzj) {
                this.zzb.zzc(i5);
                this.zzc.zzc(i5);
            }
            this.zzd.zzc(i5);
            this.zzi.zze(j, i5, j3, this.zzl);
            iZzd = i2;
            iZze = i;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(com.google.android.gms.internal.ads.zzacq zzacqVar, com.google.android.gms.internal.ads.zzanx zzanxVar) {
        zzanxVar.zzc();
        this.zzg = zzanxVar.zzb();
        this.zzh = zzacqVar.zzw(zzanxVar.zza(), 2);
        this.zzi = new com.google.android.gms.internal.ads.zzamp(this.zzh, false, false);
        this.zza.zzb(zzacqVar, zzanxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzh);
        int i = com.google.android.gms.internal.ads.zzei.zza;
        if (z) {
            this.zza.zzc();
            this.zzi.zza(this.zze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long j, int i) {
        this.zzk = j;
        int i2 = i & 2;
        this.zzl = (i2 != 0) | this.zzl;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        this.zze = 0L;
        this.zzl = false;
        this.zzk = androidx.media3.common.C.TIME_UNSET;
        com.google.android.gms.internal.ads.zzfk.zzh(this.zzf);
        this.zzb.zzb();
        this.zzc.zzb();
        this.zzd.zzb();
        this.zza.zzc();
        com.google.android.gms.internal.ads.zzamp zzampVar = this.zzi;
        if (zzampVar != null) {
            zzampVar.zzd();
        }
    }
}
