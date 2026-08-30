package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzant implements com.google.android.gms.internal.ads.zzacn {
    private final int zza;
    private final java.util.List zzb;
    private final com.google.android.gms.internal.ads.zzdy zzc;
    private final android.util.SparseIntArray zzd;
    private final com.google.android.gms.internal.ads.zzanw zze;
    private final com.google.android.gms.internal.ads.zzakd zzf;
    private final android.util.SparseArray zzg;
    private final android.util.SparseBooleanArray zzh;
    private final android.util.SparseBooleanArray zzi;
    private final com.google.android.gms.internal.ads.zzanq zzj;
    private com.google.android.gms.internal.ads.zzanp zzk;
    private com.google.android.gms.internal.ads.zzacq zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @java.lang.Deprecated
    public zzant() {
        this(1, 1, com.google.android.gms.internal.ads.zzakd.zza, new com.google.android.gms.internal.ads.zzef(0L), new com.google.android.gms.internal.ads.zzamg(0), androidx.media3.extractor.ts.TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
    }

    /* JADX WARN: Code duplicated, block: B:97:0x01bd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [int] */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v23, types: [android.util.SparseArray] */
    /* JADX WARN: Type inference failed for: r1v26, types: [com.google.android.gms.internal.ads.zzand] */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [com.google.android.gms.internal.ads.zzany] */
    /* JADX WARN: Type inference failed for: r8v6 */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final int zzb(com.google.android.gms.internal.ads.zzaco zzacoVar, com.google.android.gms.internal.ads.zzadj zzadjVar) throws java.io.IOException {
        ?? r3;
        ?? r8;
        com.google.android.gms.internal.ads.zzany zzanyVar;
        long j;
        boolean z;
        long jZzd = zzacoVar.zzd();
        if (this.zzn) {
            if (jZzd != -1) {
                com.google.android.gms.internal.ads.zzanq zzanqVar = this.zzj;
                if (!zzanqVar.zzd()) {
                    return zzanqVar.zza(zzacoVar, zzadjVar, this.zzr);
                }
            }
            if (this.zzo) {
                j = 0;
            } else {
                this.zzo = true;
                com.google.android.gms.internal.ads.zzanq zzanqVar2 = this.zzj;
                if (zzanqVar2.zzb() != androidx.media3.common.C.TIME_UNSET) {
                    j = 0;
                    com.google.android.gms.internal.ads.zzanp zzanpVar = new com.google.android.gms.internal.ads.zzanp(zzanqVar2.zzc(), zzanqVar2.zzb(), jZzd, this.zzr, androidx.media3.extractor.ts.TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
                    this.zzk = zzanpVar;
                    this.zzl.zzO(zzanpVar.zzb());
                } else {
                    j = 0;
                    this.zzl.zzO(new com.google.android.gms.internal.ads.zzadl(zzanqVar2.zzb(), 0L));
                }
            }
            if (this.zzp) {
                z = false;
                this.zzp = false;
                zzf(j, j);
                if (zzacoVar.zzf() != j) {
                    zzadjVar.zza = j;
                    return 1;
                }
            } else {
                z = false;
            }
            com.google.android.gms.internal.ads.zzanp zzanpVar2 = this.zzk;
            r3 = z;
            if (zzanpVar2 != null && zzanpVar2.zze()) {
                r3 = z;
                return zzanpVar2.zza(zzacoVar, zzadjVar);
            }
        } else {
            r3 = 0;
        }
        r3 = z;
        com.google.android.gms.internal.ads.zzdy zzdyVar = this.zzc;
        byte[] bArrZzN = zzdyVar.zzN();
        if (9400 - zzdyVar.zzd() < 188) {
            int iZzb = zzdyVar.zzb();
            if (iZzb > 0) {
                java.lang.System.arraycopy(bArrZzN, zzdyVar.zzd(), bArrZzN, r3, iZzb);
            }
            this.zzc.zzJ(bArrZzN, iZzb);
        }
        while (true) {
            com.google.android.gms.internal.ads.zzdy zzdyVar2 = this.zzc;
            if (zzdyVar2.zzb() >= 188) {
                int iZzd = zzdyVar2.zzd();
                int iZze = zzdyVar2.zze();
                int iZza = com.google.android.gms.internal.ads.zzanz.zza(zzdyVar2.zzN(), iZzd, iZze);
                this.zzc.zzL(iZza);
                int i = iZza + 188;
                if (i > iZze) {
                    this.zzq += iZza - iZzd;
                } else {
                    this.zzq = r3;
                }
                com.google.android.gms.internal.ads.zzdy zzdyVar3 = this.zzc;
                int iZze2 = zzdyVar3.zze();
                if (i > iZze2) {
                    return r3;
                }
                int iZzg = zzdyVar3.zzg();
                if ((8388608 & iZzg) != 0) {
                    this.zzc.zzL(i);
                    return r3;
                }
                ?? r10 = (4194304 & iZzg) != 0 ? 1 : r3;
                int i2 = iZzg & 32;
                int i3 = (iZzg >> 8) & 8191;
                if ((iZzg & 16) != 0) {
                    zzanyVar = (com.google.android.gms.internal.ads.zzany) this.zzg.get(i3);
                } else {
                    r8 = 0;
                }
                if (r8 == 0) {
                    r8 = zzanyVar;
                    this.zzc.zzL(i);
                    return r3;
                }
                int i4 = iZzg & 15;
                int i5 = this.zzd.get(i3, i4 - 1);
                this.zzd.put(i3, i4);
                if (i5 == i4) {
                    r8 = zzanyVar;
                    this.zzc.zzL(i);
                    return r3;
                }
                if (i4 != ((i5 + 1) & 15)) {
                    r8 = zzanyVar;
                    r8.zzc();
                }
                if (i2 != 0) {
                    com.google.android.gms.internal.ads.zzdy zzdyVar4 = this.zzc;
                    int iZzm = zzdyVar4.zzm();
                    r10 = (r10 == true ? 1 : 0) | ((zzdyVar4.zzm() & 64) != 0 ? 2 : r3);
                    this.zzc.zzM(iZzm - 1);
                }
                boolean z2 = this.zzn;
                if (z2 || !this.zzi.get(i3, r3)) {
                    this.zzc.zzK(i);
                    r8.zza(this.zzc, r10);
                    this.zzc.zzK(iZze2);
                    if (!z2) {
                        if (this.zzn && jZzd != -1) {
                            this.zzp = true;
                        }
                    }
                } else if (this.zzn) {
                    this.zzp = true;
                }
                this.zzc.zzL(i);
                return r3;
            }
            int iZze3 = zzdyVar2.zze();
            int iZza2 = zzacoVar.zza(bArrZzN, iZze3, 9400 - iZze3);
            if (iZza2 == -1) {
                for (?? r11 = r3; r11 < this.zzg.size(); r11++) {
                    com.google.android.gms.internal.ads.zzany zzanyVar2 = (com.google.android.gms.internal.ads.zzany) this.zzg.valueAt(r11);
                    if (zzanyVar2 instanceof com.google.android.gms.internal.ads.zzand) {
                        ?? r1 = (com.google.android.gms.internal.ads.zzand) zzanyVar2;
                        if (r1.zzd(r3)) {
                            r1.zza(new com.google.android.gms.internal.ads.zzdy(), 1);
                        }
                    }
                }
                return -1;
            }
            this.zzc.zzK(iZze3 + iZza2);
        }
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
        if (this.zza == 0) {
            zzacqVar = new com.google.android.gms.internal.ads.zzakg(zzacqVar, this.zzf);
        }
        this.zzl = zzacqVar;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzacn
    public final void zzf(long j, long j2) {
        com.google.android.gms.internal.ads.zzanp zzanpVar;
        int size = this.zzb.size();
        for (int i = 0; i < size; i++) {
            com.google.android.gms.internal.ads.zzef zzefVar = (com.google.android.gms.internal.ads.zzef) this.zzb.get(i);
            if (zzefVar.zzf() != androidx.media3.common.C.TIME_UNSET) {
                long jZzd = zzefVar.zzd();
                if (jZzd != androidx.media3.common.C.TIME_UNSET && jZzd != 0 && jZzd != j2) {
                    zzefVar.zzi(j2);
                }
            } else {
                zzefVar.zzi(j2);
            }
        }
        if (j2 != 0 && (zzanpVar = this.zzk) != null) {
            zzanpVar.zzd(j2);
        }
        this.zzc.zzI(0);
        this.zzd.clear();
        for (int i2 = 0; i2 < this.zzg.size(); i2++) {
            ((com.google.android.gms.internal.ads.zzany) this.zzg.valueAt(i2)).zzc();
        }
        this.zzq = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzacn
    public final boolean zzi(com.google.android.gms.internal.ads.zzaco zzacoVar) throws java.io.IOException {
        byte[] bArrZzN = this.zzc.zzN();
        com.google.android.gms.internal.ads.zzacc zzaccVar = (com.google.android.gms.internal.ads.zzacc) zzacoVar;
        zzaccVar.zzm(bArrZzN, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    zzaccVar.zzo(i, false);
                    return true;
                }
                if (bArrZzN[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    public zzant(int i, int i2, com.google.android.gms.internal.ads.zzakd zzakdVar, com.google.android.gms.internal.ads.zzef zzefVar, com.google.android.gms.internal.ads.zzanw zzanwVar, int i3) {
        this.zze = zzanwVar;
        this.zza = i2;
        this.zzf = zzakdVar;
        this.zzb = java.util.Collections.singletonList(zzefVar);
        this.zzc = new com.google.android.gms.internal.ads.zzdy(new byte[9400], 0);
        android.util.SparseBooleanArray sparseBooleanArray = new android.util.SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new android.util.SparseBooleanArray();
        android.util.SparseArray sparseArray = new android.util.SparseArray();
        this.zzg = sparseArray;
        this.zzd = new android.util.SparseIntArray();
        this.zzj = new com.google.android.gms.internal.ads.zzanq(androidx.media3.extractor.ts.TsExtractor.DEFAULT_TIMESTAMP_SEARCH_BYTES);
        this.zzl = com.google.android.gms.internal.ads.zzacq.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        android.util.SparseArray sparseArrayZza = zzanwVar.zza();
        int size = sparseArrayZza.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzg.put(sparseArrayZza.keyAt(i4), (com.google.android.gms.internal.ads.zzany) sparseArrayZza.valueAt(i4));
        }
        this.zzg.put(0, new com.google.android.gms.internal.ads.zzanl(new com.google.android.gms.internal.ads.zzanr(this)));
    }
}
