package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzand implements com.google.android.gms.internal.ads.zzany {
    private final com.google.android.gms.internal.ads.zzamj zza;
    private final com.google.android.gms.internal.ads.zzdx zzb = new com.google.android.gms.internal.ads.zzdx(new byte[10], 10);
    private int zzc = 0;
    private int zzd;
    private com.google.android.gms.internal.ads.zzef zze;
    private boolean zzf;
    private boolean zzg;
    private boolean zzh;
    private int zzi;
    private int zzj;
    private boolean zzk;

    public zzand(com.google.android.gms.internal.ads.zzamj zzamjVar) {
        this.zza = zzamjVar;
    }

    private final void zze(int i) {
        this.zzc = i;
        this.zzd = 0;
    }

    private final boolean zzf(com.google.android.gms.internal.ads.zzdy zzdyVar, byte[] bArr, int i) {
        int iMin = java.lang.Math.min(zzdyVar.zzb(), i - this.zzd);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            zzdyVar.zzM(iMin);
        } else {
            zzdyVar.zzH(bArr, this.zzd, iMin);
        }
        int i2 = this.zzd + iMin;
        this.zzd = i2;
        return i2 == i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Type inference failed for: r6v5 */
    /* JADX WARN: Type inference failed for: r8v10, types: [int] */
    /* JADX WARN: Type inference failed for: r8v16, types: [com.google.android.gms.internal.ads.zzdx] */
    /* JADX WARN: Type inference failed for: r8v9, types: [com.google.android.gms.internal.ads.zzamj] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v23 */
    /* JADX WARN: Type inference failed for: r9v9, types: [int] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzany
    public final void zza(com.google.android.gms.internal.ads.zzdy zzdyVar, int i) throws com.google.android.gms.internal.ads.zzbc {
        int i2;
        ?? r5;
        int i3;
        int i4;
        int i5;
        ?? r9;
        long jZzb;
        com.google.android.gms.internal.ads.zzcw.zzb(this.zze);
        int i6 = -1;
        int i7 = 2;
        ?? r6 = 0;
        int i8 = 1;
        if ((i & 1) != 0) {
            int i9 = this.zzc;
            if (i9 != 0 && i9 != 1) {
                if (i9 != 2) {
                    int i10 = this.zzj;
                    if (i10 != -1) {
                        com.google.android.gms.internal.ads.zzdo.zzf("PesReader", "Unexpected start indicator: expected " + i10 + " more bytes");
                    }
                    this.zza.zzc(zzdyVar.zze() == 0);
                } else {
                    com.google.android.gms.internal.ads.zzdo.zzf("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            zze(1);
        }
        int i11 = i;
        while (zzdyVar.zzb() > 0) {
            int i12 = this.zzc;
            if (i12 == 0) {
                i2 = i7;
                r5 = r6;
                i3 = i8;
                zzdyVar.zzM(zzdyVar.zzb());
            } else if (i12 != i8) {
                if (i12 != i7) {
                    int iZzb = zzdyVar.zzb();
                    int i13 = this.zzj;
                    if (i13 == i6) {
                        r9 = r6;
                    } else {
                        i5 = iZzb - i13;
                    }
                    if (r9 > 0) {
                        r9 = i5;
                        iZzb -= r9;
                        zzdyVar.zzK(zzdyVar.zzd() + iZzb);
                    }
                    r9 = i5;
                    this.zza.zza(zzdyVar);
                    int i14 = this.zzj;
                    if (i14 != i6) {
                        int i15 = i14 - iZzb;
                        this.zzj = i15;
                        if (i15 == 0) {
                            this.zza.zzc(r6);
                            zze(i8);
                        }
                    }
                } else {
                    if (zzf(zzdyVar, this.zzb.zza, java.lang.Math.min(10, this.zzi)) && zzf(zzdyVar, null, this.zzi)) {
                        this.zzb.zzl(r6);
                        if (this.zzf) {
                            this.zzb.zzn(4);
                            long jZzd = this.zzb.zzd(3);
                            this.zzb.zzn(i8);
                            int iZzd = this.zzb.zzd(15) << 15;
                            this.zzb.zzn(i8);
                            long jZzd2 = this.zzb.zzd(15);
                            this.zzb.zzn(i8);
                            if (!this.zzh && this.zzg) {
                                this.zzb.zzn(4);
                                long jZzd3 = ((long) this.zzb.zzd(3)) << 30;
                                this.zzb.zzn(i8);
                                int iZzd2 = this.zzb.zzd(15) << 15;
                                this.zzb.zzn(i8);
                                long jZzd4 = this.zzb.zzd(15);
                                this.zzb.zzn(i8);
                                this.zze.zzb(jZzd3 | ((long) iZzd2) | jZzd4);
                                this.zzh = true;
                            }
                            jZzb = this.zze.zzb((jZzd << 30) | ((long) iZzd) | jZzd2);
                        } else {
                            jZzb = androidx.media3.common.C.TIME_UNSET;
                        }
                        i11 |= true != this.zzk ? 0 : 4;
                        this.zza.zzd(jZzb, i11);
                        zze(3);
                        i6 = -1;
                        i7 = 2;
                        r6 = 0;
                        i8 = 1;
                    }
                }
                i2 = i7;
                r5 = r6;
                i3 = i8;
            } else if (zzf(zzdyVar, this.zzb.zza, 9)) {
                r5 = 0;
                this.zzb.zzl(0);
                int iZzd3 = this.zzb.zzd(24);
                i3 = 1;
                if (iZzd3 != 1) {
                    com.google.android.gms.internal.ads.zzdo.zzf("PesReader", "Unexpected start code prefix: " + iZzd3);
                    i6 = -1;
                    this.zzj = -1;
                    i4 = 0;
                    i2 = 2;
                } else {
                    this.zzb.zzn(8);
                    com.google.android.gms.internal.ads.zzdx zzdxVar = this.zzb;
                    int iZzd4 = zzdxVar.zzd(16);
                    zzdxVar.zzn(5);
                    this.zzk = this.zzb.zzp();
                    i2 = 2;
                    this.zzb.zzn(2);
                    this.zzf = this.zzb.zzp();
                    this.zzg = this.zzb.zzp();
                    this.zzb.zzn(6);
                    int iZzd5 = this.zzb.zzd(8);
                    this.zzi = iZzd5;
                    if (iZzd4 == 0) {
                        this.zzj = -1;
                        i6 = -1;
                    } else {
                        int i16 = (iZzd4 - 3) - iZzd5;
                        this.zzj = i16;
                        if (i16 < 0) {
                            com.google.android.gms.internal.ads.zzdo.zzf("PesReader", "Found negative packet payload size: " + i16);
                            i6 = -1;
                            this.zzj = -1;
                        } else {
                            i6 = -1;
                        }
                    }
                    i4 = 2;
                }
                zze(i4);
            } else {
                i6 = -1;
                r5 = 0;
                i3 = 1;
                i2 = 2;
            }
            i8 = i3;
            r6 = r5;
            i7 = i2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzb(com.google.android.gms.internal.ads.zzef zzefVar, com.google.android.gms.internal.ads.zzacq zzacqVar, com.google.android.gms.internal.ads.zzanx zzanxVar) {
        this.zze = zzefVar;
        this.zza.zzb(zzacqVar, zzanxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzany
    public final void zzc() {
        this.zzc = 0;
        this.zzd = 0;
        this.zzh = false;
        this.zza.zze();
    }

    public final boolean zzd(boolean z) {
        return this.zzc == 3 && this.zzj == -1;
    }
}
