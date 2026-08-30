package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzaml implements com.google.android.gms.internal.ads.zzamj {
    private static final double[] zza = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private java.lang.String zzb;
    private com.google.android.gms.internal.ads.zzadt zzc;
    private final com.google.android.gms.internal.ads.zzaoa zzd;
    private final com.google.android.gms.internal.ads.zzdy zze;
    private final com.google.android.gms.internal.ads.zzanb zzf;
    private final boolean[] zzg;
    private final com.google.android.gms.internal.ads.zzamk zzh;
    private long zzi;
    private boolean zzj;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;
    private boolean zzq;

    public zzaml() {
        throw null;
    }

    zzaml(com.google.android.gms.internal.ads.zzaoa zzaoaVar) {
        com.google.android.gms.internal.ads.zzdy zzdyVar;
        this.zzd = zzaoaVar;
        this.zzg = new boolean[4];
        this.zzh = new com.google.android.gms.internal.ads.zzamk(128);
        if (zzaoaVar != null) {
            this.zzf = new com.google.android.gms.internal.ads.zzanb(org.objectweb.asm.Opcodes.GETSTATIC, 128);
            zzdyVar = new com.google.android.gms.internal.ads.zzdy();
        } else {
            zzdyVar = null;
            this.zzf = null;
        }
        this.zze = zzdyVar;
        this.zzm = androidx.media3.common.C.TIME_UNSET;
        this.zzo = androidx.media3.common.C.TIME_UNSET;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01b3  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zza(com.google.android.gms.internal.ads.zzdy zzdyVar) {
        long j;
        boolean z;
        boolean z2;
        int i;
        int i2;
        int i3;
        float f;
        int i4;
        long j2;
        double d;
        int i5;
        int i6;
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzc);
        int iZzd = zzdyVar.zzd();
        int iZze = zzdyVar.zze();
        byte[] bArrZzN = zzdyVar.zzN();
        this.zzi += (long) zzdyVar.zzb();
        this.zzc.zzr(zzdyVar, zzdyVar.zzb());
        while (true) {
            int iZza = com.google.android.gms.internal.ads.zzfk.zza(bArrZzN, iZzd, iZze, this.zzg);
            if (iZza == iZze) {
                break;
            }
            int i7 = iZza + 3;
            int i8 = zzdyVar.zzN()[i7] & 255;
            int i9 = iZza - iZzd;
            if (!this.zzk) {
                if (i9 > 0) {
                    this.zzh.zza(bArrZzN, iZzd, iZza);
                }
                if (this.zzh.zzc(i8, i9 < 0 ? -i9 : 0)) {
                    com.google.android.gms.internal.ads.zzamk zzamkVar = this.zzh;
                    java.lang.String str = this.zzb;
                    str.getClass();
                    byte[] bArrCopyOf = java.util.Arrays.copyOf(zzamkVar.zzc, zzamkVar.zza);
                    int i10 = bArrCopyOf[4] & 255;
                    int i11 = bArrCopyOf[5] & 255;
                    int i12 = bArrCopyOf[6] & 255;
                    int i13 = i11 & 15;
                    int i14 = (i11 >> 4) | (i10 << 4);
                    int i15 = (bArrCopyOf[7] & 240) >> 4;
                    int i16 = (i13 << 8) | i12;
                    if (i15 == 2) {
                        i2 = i16 * 4;
                        i3 = i14 * 3;
                    } else if (i15 != 3) {
                        if (i15 != 4) {
                            f = 1.0f;
                        } else {
                            i2 = i16 * 121;
                            i3 = i14 * 100;
                        }
                        com.google.android.gms.internal.ads.zzz zzzVar = new com.google.android.gms.internal.ads.zzz();
                        zzzVar.zzM(str);
                        zzzVar.zzaa(androidx.media3.common.MimeTypes.VIDEO_MPEG2);
                        zzzVar.zzaf(i14);
                        zzzVar.zzK(i16);
                        zzzVar.zzW(f);
                        zzzVar.zzN(java.util.Collections.singletonList(bArrCopyOf));
                        com.google.android.gms.internal.ads.zzab zzabVarZzag = zzzVar.zzag();
                        i4 = (bArrCopyOf[7] & 15) - 1;
                        j2 = 0;
                        if (i4 >= 0 && i4 < 8) {
                            d = zza[i4];
                            byte b = bArrCopyOf[zzamkVar.zzb + 9];
                            i5 = (b & 96) >> 5;
                            i6 = b & 31;
                            if (i5 != i6) {
                                d *= (((double) i5) + 1.0d) / ((double) (i6 + 1));
                            }
                            j2 = (long) (1000000.0d / d);
                        }
                        android.util.Pair pairCreate = android.util.Pair.create(zzabVarZzag, java.lang.Long.valueOf(j2));
                        this.zzc.zzm((com.google.android.gms.internal.ads.zzab) pairCreate.first);
                        this.zzl = ((java.lang.Long) pairCreate.second).longValue();
                        this.zzk = true;
                    } else {
                        i2 = i16 * 16;
                        i3 = i14 * 9;
                    }
                    f = i2 / i3;
                    com.google.android.gms.internal.ads.zzz zzzVar2 = new com.google.android.gms.internal.ads.zzz();
                    zzzVar2.zzM(str);
                    zzzVar2.zzaa(androidx.media3.common.MimeTypes.VIDEO_MPEG2);
                    zzzVar2.zzaf(i14);
                    zzzVar2.zzK(i16);
                    zzzVar2.zzW(f);
                    zzzVar2.zzN(java.util.Collections.singletonList(bArrCopyOf));
                    com.google.android.gms.internal.ads.zzab zzabVarZzag2 = zzzVar2.zzag();
                    i4 = (bArrCopyOf[7] & 15) - 1;
                    j2 = 0;
                    if (i4 >= 0) {
                        d = zza[i4];
                        byte b2 = bArrCopyOf[zzamkVar.zzb + 9];
                        i5 = (b2 & 96) >> 5;
                        i6 = b2 & 31;
                        if (i5 != i6) {
                            d *= (((double) i5) + 1.0d) / ((double) (i6 + 1));
                        }
                        j2 = (long) (1000000.0d / d);
                    }
                    android.util.Pair pairCreate2 = android.util.Pair.create(zzabVarZzag2, java.lang.Long.valueOf(j2));
                    this.zzc.zzm((com.google.android.gms.internal.ads.zzab) pairCreate2.first);
                    this.zzl = ((java.lang.Long) pairCreate2.second).longValue();
                    this.zzk = true;
                }
            }
            com.google.android.gms.internal.ads.zzanb zzanbVar = this.zzf;
            if (zzanbVar != null) {
                if (i9 > 0) {
                    zzanbVar.zza(bArrZzN, iZzd, iZza);
                    i = 0;
                } else {
                    i = -i9;
                }
                if (this.zzf.zzd(i)) {
                    com.google.android.gms.internal.ads.zzanb zzanbVar2 = this.zzf;
                    int iZzb = com.google.android.gms.internal.ads.zzfk.zzb(zzanbVar2.zza, zzanbVar2.zzb);
                    com.google.android.gms.internal.ads.zzdy zzdyVar2 = this.zze;
                    int i17 = com.google.android.gms.internal.ads.zzei.zza;
                    zzdyVar2.zzJ(this.zzf.zza, iZzb);
                    this.zzd.zza(this.zzo, this.zze);
                }
                if (i8 == 178) {
                    if (zzdyVar.zzN()[iZza + 2] == 1) {
                        this.zzf.zzc(org.objectweb.asm.Opcodes.GETSTATIC);
                    }
                    i8 = 178;
                }
            }
            if (i8 == 0 || i8 == 179) {
                int i18 = iZze - iZza;
                if (this.zzq && this.zzk) {
                    long j3 = this.zzo;
                    if (j3 != androidx.media3.common.C.TIME_UNSET) {
                        boolean z3 = this.zzp;
                        int i19 = ((int) (this.zzi - this.zzn)) - i18;
                        com.google.android.gms.internal.ads.zzadt zzadtVar = this.zzc;
                        j = androidx.media3.common.C.TIME_UNSET;
                        zzadtVar.zzt(j3, z3 ? 1 : 0, i19, i18, null);
                    } else {
                        j = -9223372036854775807L;
                    }
                } else {
                    j = -9223372036854775807L;
                }
                if (!this.zzj || this.zzq) {
                    this.zzn = this.zzi - ((long) i18);
                    long j4 = this.zzm;
                    if (j4 == j) {
                        long j5 = this.zzo;
                        j4 = j5 != j ? j5 + this.zzl : j;
                    }
                    this.zzo = j4;
                    z = false;
                    this.zzp = false;
                    this.zzm = j;
                    z2 = true;
                    this.zzj = true;
                } else {
                    z = false;
                    z2 = true;
                }
                this.zzq = i8 == 0 ? z2 : z;
            } else {
                if (i8 == 184) {
                    this.zzp = true;
                }
                iZze = iZze;
                bArrZzN = bArrZzN;
            }
            iZze = iZze;
            bArrZzN = bArrZzN;
            iZzd = i7;
        }
        if (!this.zzk) {
            this.zzh.zza(bArrZzN, iZzd, iZze);
        }
        com.google.android.gms.internal.ads.zzanb zzanbVar3 = this.zzf;
        if (zzanbVar3 != null) {
            zzanbVar3.zza(bArrZzN, iZzd, iZze);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzb(com.google.android.gms.internal.ads.zzacq zzacqVar, com.google.android.gms.internal.ads.zzanx zzanxVar) {
        zzanxVar.zzc();
        this.zzb = zzanxVar.zzb();
        this.zzc = zzacqVar.zzw(zzanxVar.zza(), 2);
        com.google.android.gms.internal.ads.zzaoa zzaoaVar = this.zzd;
        if (zzaoaVar != null) {
            zzaoaVar.zzb(zzacqVar, zzanxVar);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzc(boolean z) {
        com.google.android.gms.internal.ads.zzcw.zzb(this.zzc);
        if (z) {
            boolean z2 = this.zzp;
            long j = this.zzi - this.zzn;
            this.zzc.zzt(this.zzo, z2 ? 1 : 0, (int) j, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zzd(long j, int i) {
        this.zzm = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamj
    public final void zze() {
        com.google.android.gms.internal.ads.zzfk.zzh(this.zzg);
        this.zzh.zzb();
        com.google.android.gms.internal.ads.zzanb zzanbVar = this.zzf;
        if (zzanbVar != null) {
            zzanbVar.zzb();
        }
        this.zzi = 0L;
        this.zzj = false;
        this.zzm = androidx.media3.common.C.TIME_UNSET;
        this.zzo = androidx.media3.common.C.TIME_UNSET;
    }
}
