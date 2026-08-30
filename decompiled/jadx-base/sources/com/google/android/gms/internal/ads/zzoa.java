package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzoa implements com.google.android.gms.internal.ads.zzoe {
    public static final com.google.android.gms.internal.ads.zzfvf zza = new com.google.android.gms.internal.ads.zzfvf() { // from class: com.google.android.gms.internal.ads.zzny
        @Override // com.google.android.gms.internal.ads.zzfvf
        public final java.lang.Object zza() {
            return com.google.android.gms.internal.ads.zzoa.zzn();
        }
    };
    private static final java.util.Random zzb = new java.util.Random();
    private final com.google.android.gms.internal.ads.zzbp zzc;
    private final com.google.android.gms.internal.ads.zzbo zzd;
    private final java.util.HashMap zze;
    private com.google.android.gms.internal.ads.zzod zzf;
    private com.google.android.gms.internal.ads.zzbq zzg;
    private java.lang.String zzh;
    private long zzi;

    public zzoa() {
        throw null;
    }

    public zzoa(com.google.android.gms.internal.ads.zzfvf zzfvfVar) {
        this.zzc = new com.google.android.gms.internal.ads.zzbp();
        this.zzd = new com.google.android.gms.internal.ads.zzbo();
        this.zze = new java.util.HashMap();
        this.zzg = com.google.android.gms.internal.ads.zzbq.zza;
        this.zzi = -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long zzl() {
        com.google.android.gms.internal.ads.zznz zznzVar = (com.google.android.gms.internal.ads.zznz) this.zze.get(this.zzh);
        return (zznzVar == null || zznzVar.zzd == -1) ? this.zzi + 1 : zznzVar.zzd;
    }

    private final com.google.android.gms.internal.ads.zznz zzm(int i, com.google.android.gms.internal.ads.zzug zzugVar) {
        long j = Long.MAX_VALUE;
        com.google.android.gms.internal.ads.zznz zznzVar = null;
        for (com.google.android.gms.internal.ads.zznz zznzVar2 : this.zze.values()) {
            zznzVar2.zzg(i, zzugVar);
            if (zznzVar2.zzj(i, zzugVar)) {
                long j2 = zznzVar2.zzd;
                if (j2 == -1 || j2 < j) {
                    zznzVar = zznzVar2;
                    j = j2;
                } else if (j2 == j) {
                    int i2 = com.google.android.gms.internal.ads.zzei.zza;
                    if (zznzVar.zze != null && zznzVar2.zze != null) {
                        zznzVar = zznzVar2;
                    }
                }
            }
        }
        if (zznzVar != null) {
            return zznzVar;
        }
        java.lang.String strZzn = zzn();
        com.google.android.gms.internal.ads.zznz zznzVar3 = new com.google.android.gms.internal.ads.zznz(this, strZzn, i, zzugVar);
        this.zze.put(strZzn, zznzVar3);
        return zznzVar3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static java.lang.String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return android.util.Base64.encodeToString(bArr, 10);
    }

    private final void zzo(com.google.android.gms.internal.ads.zznz zznzVar) {
        if (zznzVar.zzd != -1) {
            this.zzi = zznzVar.zzd;
        }
        this.zzh = null;
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzp(com.google.android.gms.internal.ads.zzlu zzluVar) {
        if (zzluVar.zzb.zzo()) {
            java.lang.String str = this.zzh;
            if (str != null) {
                com.google.android.gms.internal.ads.zznz zznzVar = (com.google.android.gms.internal.ads.zznz) this.zze.get(str);
                zznzVar.getClass();
                zzo(zznzVar);
                return;
            }
            return;
        }
        com.google.android.gms.internal.ads.zznz zznzVar2 = (com.google.android.gms.internal.ads.zznz) this.zze.get(this.zzh);
        com.google.android.gms.internal.ads.zznz zznzVarZzm = zzm(zzluVar.zzc, zzluVar.zzd);
        this.zzh = zznzVarZzm.zzb;
        zzi(zzluVar);
        com.google.android.gms.internal.ads.zzug zzugVar = zzluVar.zzd;
        if (zzugVar == null || !zzugVar.zzb()) {
            return;
        }
        if (zznzVar2 != null) {
            if (zznzVar2.zzd == zzugVar.zzd && zznzVar2.zze != null && zznzVar2.zze.zzb == zzluVar.zzd.zzb && zznzVar2.zze.zzc == zzluVar.zzd.zzc) {
                return;
            }
        }
        com.google.android.gms.internal.ads.zzug zzugVar2 = zzluVar.zzd;
        java.lang.String unused = zzm(zzluVar.zzc, new com.google.android.gms.internal.ads.zzug(zzugVar2.zza, zzugVar2.zzd)).zzb;
        java.lang.String unused2 = zznzVarZzm.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final synchronized java.lang.String zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final synchronized java.lang.String zzf(com.google.android.gms.internal.ads.zzbq zzbqVar, com.google.android.gms.internal.ads.zzug zzugVar) {
        return zzm(zzbqVar.zzn(zzugVar.zza, this.zzd).zzc, zzugVar).zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final synchronized void zzg(com.google.android.gms.internal.ads.zzlu zzluVar) {
        com.google.android.gms.internal.ads.zzod zzodVar;
        java.lang.String str = this.zzh;
        if (str != null) {
            com.google.android.gms.internal.ads.zznz zznzVar = (com.google.android.gms.internal.ads.zznz) this.zze.get(str);
            zznzVar.getClass();
            zzo(zznzVar);
        }
        java.util.Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zznz zznzVar2 = (com.google.android.gms.internal.ads.zznz) it.next();
            it.remove();
            if (zznzVar2.zzf && (zzodVar = this.zzf) != null) {
                zzodVar.zzd(zzluVar, zznzVar2.zzb, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final void zzh(com.google.android.gms.internal.ads.zzod zzodVar) {
        this.zzf = zzodVar;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003c A[Catch: all -> 0x00c6, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x001e, B:14:0x002a, B:16:0x0034, B:18:0x003c, B:20:0x0048, B:21:0x004e, B:23:0x0053, B:25:0x0059, B:27:0x0070, B:28:0x0098, B:30:0x009e, B:31:0x00a4, B:33:0x00b0, B:35:0x00b6), top: B:43:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:20:0x0048 A[Catch: all -> 0x00c6, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x001e, B:14:0x002a, B:16:0x0034, B:18:0x003c, B:20:0x0048, B:21:0x004e, B:23:0x0053, B:25:0x0059, B:27:0x0070, B:28:0x0098, B:30:0x009e, B:31:0x00a4, B:33:0x00b0, B:35:0x00b6), top: B:43:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:27:0x0070 A[Catch: all -> 0x00c6, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x001e, B:14:0x002a, B:16:0x0034, B:18:0x003c, B:20:0x0048, B:21:0x004e, B:23:0x0053, B:25:0x0059, B:27:0x0070, B:28:0x0098, B:30:0x009e, B:31:0x00a4, B:33:0x00b0, B:35:0x00b6), top: B:43:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x009e A[Catch: all -> 0x00c6, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x0006, B:8:0x0010, B:10:0x0014, B:12:0x001e, B:14:0x002a, B:16:0x0034, B:18:0x003c, B:20:0x0048, B:21:0x004e, B:23:0x0053, B:25:0x0059, B:27:0x0070, B:28:0x0098, B:30:0x009e, B:31:0x00a4, B:33:0x00b0, B:35:0x00b6), top: B:43:0x0001 }] */
    @Override // com.google.android.gms.internal.ads.zzoe
    public final synchronized void zzi(com.google.android.gms.internal.ads.zzlu zzluVar) {
        com.google.android.gms.internal.ads.zznz zznzVarZzm;
        com.google.android.gms.internal.ads.zzug zzugVar;
        com.google.android.gms.internal.ads.zznz zznzVarZzm2;
        com.google.android.gms.internal.ads.zznz zznzVar;
        this.zzf.getClass();
        if (!zzluVar.zzb.zzo()) {
            com.google.android.gms.internal.ads.zzug zzugVar2 = zzluVar.zzd;
            if (zzugVar2 == null) {
                zznzVarZzm = zzm(zzluVar.zzc, zzluVar.zzd);
                if (this.zzh == null) {
                    this.zzh = zznzVarZzm.zzb;
                }
                zzugVar = zzluVar.zzd;
                if (zzugVar != null) {
                    zznzVarZzm2 = zzm(zzluVar.zzc, new com.google.android.gms.internal.ads.zzug(zzugVar.zza, zzugVar.zzd, zzugVar.zzb));
                    if (!zznzVarZzm2.zzf) {
                        zznzVarZzm2.zzf = true;
                        zzluVar.zzb.zzn(zzluVar.zzd.zza, this.zzd);
                        this.zzd.zzg(zzluVar.zzd.zzb);
                        java.lang.Math.max(0L, com.google.android.gms.internal.ads.zzei.zzv(0L) + com.google.android.gms.internal.ads.zzei.zzv(0L));
                        java.lang.String unused = zznzVarZzm2.zzb;
                    }
                }
                if (!zznzVarZzm.zzf) {
                    zznzVarZzm.zzf = true;
                    java.lang.String unused2 = zznzVarZzm.zzb;
                }
                if (zznzVarZzm.zzb.equals(this.zzh)) {
                    zznzVarZzm.zzg = true;
                    this.zzf.zzc(zzluVar, zznzVarZzm.zzb);
                }
            } else if (zzugVar2.zzd >= zzl() && ((zznzVar = (com.google.android.gms.internal.ads.zznz) this.zze.get(this.zzh)) == null || zznzVar.zzd != -1 || zznzVar.zzc == zzluVar.zzc)) {
                zznzVarZzm = zzm(zzluVar.zzc, zzluVar.zzd);
                if (this.zzh == null) {
                    this.zzh = zznzVarZzm.zzb;
                }
                zzugVar = zzluVar.zzd;
                if (zzugVar != null && zzugVar.zzb()) {
                    zznzVarZzm2 = zzm(zzluVar.zzc, new com.google.android.gms.internal.ads.zzug(zzugVar.zza, zzugVar.zzd, zzugVar.zzb));
                    if (!zznzVarZzm2.zzf) {
                        zznzVarZzm2.zzf = true;
                        zzluVar.zzb.zzn(zzluVar.zzd.zza, this.zzd);
                        this.zzd.zzg(zzluVar.zzd.zzb);
                        java.lang.Math.max(0L, com.google.android.gms.internal.ads.zzei.zzv(0L) + com.google.android.gms.internal.ads.zzei.zzv(0L));
                        java.lang.String unused3 = zznzVarZzm2.zzb;
                    }
                }
                if (!zznzVarZzm.zzf) {
                    zznzVarZzm.zzf = true;
                    java.lang.String unused4 = zznzVarZzm.zzb;
                }
                if (zznzVarZzm.zzb.equals(this.zzh) && !zznzVarZzm.zzg) {
                    zznzVarZzm.zzg = true;
                    this.zzf.zzc(zzluVar, zznzVarZzm.zzb);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final synchronized void zzj(com.google.android.gms.internal.ads.zzlu zzluVar, int i) {
        this.zzf.getClass();
        java.util.Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zznz zznzVar = (com.google.android.gms.internal.ads.zznz) it.next();
            if (zznzVar.zzk(zzluVar)) {
                it.remove();
                if (zznzVar.zzf) {
                    boolean zEquals = zznzVar.zzb.equals(this.zzh);
                    boolean z = false;
                    if (i == 0 && zEquals && zznzVar.zzg) {
                        z = true;
                    }
                    if (zEquals) {
                        zzo(zznzVar);
                    }
                    this.zzf.zzd(zzluVar, zznzVar.zzb, z);
                }
            }
        }
        zzp(zzluVar);
    }

    @Override // com.google.android.gms.internal.ads.zzoe
    public final synchronized void zzk(com.google.android.gms.internal.ads.zzlu zzluVar) {
        this.zzf.getClass();
        com.google.android.gms.internal.ads.zzbq zzbqVar = this.zzg;
        this.zzg = zzluVar.zzb;
        java.util.Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            com.google.android.gms.internal.ads.zznz zznzVar = (com.google.android.gms.internal.ads.zznz) it.next();
            if (!zznzVar.zzl(zzbqVar, this.zzg) || zznzVar.zzk(zzluVar)) {
                it.remove();
                if (zznzVar.zzf) {
                    if (zznzVar.zzb.equals(this.zzh)) {
                        zzo(zznzVar);
                    }
                    this.zzf.zzd(zzluVar, zznzVar.zzb, false);
                }
            }
        }
        zzp(zzluVar);
    }
}
