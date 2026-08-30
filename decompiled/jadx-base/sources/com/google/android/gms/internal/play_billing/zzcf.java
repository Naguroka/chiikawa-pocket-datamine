package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzcf extends com.google.android.gms.internal.play_billing.zzbw {
    static final com.google.android.gms.internal.play_billing.zzbw zza = new com.google.android.gms.internal.play_billing.zzcf(null, new java.lang.Object[0], 0);
    final transient java.lang.Object[] zzb;
    private final transient java.lang.Object zzc;
    private final transient int zzd;

    private zzcf(java.lang.Object obj, java.lang.Object[] objArr, int i) {
        this.zzc = obj;
        this.zzb = objArr;
        this.zzd = i;
    }

    /* JADX WARN: Code duplicated, block: B:75:0x01b4 A[PHI: r5
  0x01b4: PHI (r5v5 ??) = (r5v2 ??), (r5v6 short[]) binds: [B:74:0x01b2, B:57:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r3v27 */
    /* JADX WARN: Type inference failed for: r3v34 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r6v5, types: [java.lang.Object[]] */
    static com.google.android.gms.internal.play_billing.zzcf zzg(int i, java.lang.Object[] objArr, com.google.android.gms.internal.play_billing.zzbv zzbvVar) {
        int iHighestOneBit;
        short[] sArr;
        char c;
        char c2;
        ?? r3;
        ?? r4;
        int i2 = i;
        java.lang.Object[] objArrCopyOf = objArr;
        if (i2 == 0) {
            return (com.google.android.gms.internal.play_billing.zzcf) zza;
        }
        com.google.android.gms.internal.play_billing.zzbu zzbuVar = null;
        ?? r5 = 0;
        com.google.android.gms.internal.play_billing.zzbu zzbuVar2 = null;
        com.google.android.gms.internal.play_billing.zzbu zzbuVar3 = null;
        int i3 = 1;
        if (i2 == 1) {
            com.google.android.gms.internal.play_billing.zzbo.zza(java.util.Objects.requireNonNull(objArrCopyOf[0]), java.util.Objects.requireNonNull(objArrCopyOf[1]));
            return new com.google.android.gms.internal.play_billing.zzcf(null, objArrCopyOf, 1);
        }
        com.google.android.gms.internal.play_billing.zzbg.zzb(i2, objArrCopyOf.length >> 1, com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX);
        int iMax = java.lang.Math.max(i2, 2);
        if (iMax < 751619276) {
            iHighestOneBit = java.lang.Integer.highestOneBit(iMax - 1);
            do {
                iHighestOneBit += iHighestOneBit;
            } while (((double) iHighestOneBit) * 0.7d < iMax);
        } else {
            iHighestOneBit = 1073741824;
            if (iMax >= 1073741824) {
                throw new java.lang.IllegalArgumentException("collection too large");
            }
        }
        if (i2 == 1) {
            com.google.android.gms.internal.play_billing.zzbo.zza(java.util.Objects.requireNonNull(objArrCopyOf[0]), java.util.Objects.requireNonNull(objArrCopyOf[1]));
            i2 = 1;
            c = 1;
            c2 = 2;
        } else {
            int i4 = iHighestOneBit - 1;
            byte b = -1;
            if (iHighestOneBit <= 128) {
                byte[] bArr = new byte[iHighestOneBit];
                java.util.Arrays.fill(bArr, (byte) -1);
                int i5 = 0;
                int i6 = 0;
                while (i5 < i2) {
                    int i7 = i6 + i6;
                    int i8 = i5 + i5;
                    java.lang.Object objRequireNonNull = java.util.Objects.requireNonNull(objArrCopyOf[i8]);
                    java.lang.Object objRequireNonNull2 = java.util.Objects.requireNonNull(objArrCopyOf[i8 ^ i3]);
                    com.google.android.gms.internal.play_billing.zzbo.zza(objRequireNonNull, objRequireNonNull2);
                    int iZza = com.google.android.gms.internal.play_billing.zzbp.zza(objRequireNonNull.hashCode());
                    while (true) {
                        int i9 = iZza & i4;
                        int i10 = bArr[i9] & 255;
                        if (i10 == 255) {
                            bArr[i9] = (byte) i7;
                            if (i6 < i5) {
                                objArrCopyOf[i7] = objRequireNonNull;
                                objArrCopyOf[i7 ^ 1] = objRequireNonNull2;
                            }
                            i6++;
                            break;
                        }
                        if (objRequireNonNull.equals(objArrCopyOf[i10 == true ? 1 : 0])) {
                            int i11 = ~i10;
                            com.google.android.gms.internal.play_billing.zzbu zzbuVar4 = new com.google.android.gms.internal.play_billing.zzbu(objRequireNonNull, objRequireNonNull2, java.util.Objects.requireNonNull(objArrCopyOf[i11 == true ? 1 : 0]));
                            objArrCopyOf[i11 == true ? 1 : 0] = objRequireNonNull2;
                            zzbuVar2 = zzbuVar4;
                            break;
                        }
                        iZza = i9 + 1;
                    }
                    i5++;
                    i3 = 1;
                }
                if (i6 == i2) {
                    r3 = bArr;
                } else {
                    r4 = new java.lang.Object[]{bArr, java.lang.Integer.valueOf(i6), zzbuVar2};
                    c2 = 2;
                }
                c = 1;
                r5 = r4;
            } else if (iHighestOneBit <= 32768) {
                sArr = new short[iHighestOneBit];
                java.util.Arrays.fill(sArr, (short) -1);
                int i12 = 0;
                for (int i13 = 0; i13 < i2; i13++) {
                    int i14 = i12 + i12;
                    int i15 = i13 + i13;
                    java.lang.Object objRequireNonNull3 = java.util.Objects.requireNonNull(objArrCopyOf[i15]);
                    java.lang.Object objRequireNonNull4 = java.util.Objects.requireNonNull(objArrCopyOf[i15 ^ 1]);
                    com.google.android.gms.internal.play_billing.zzbo.zza(objRequireNonNull3, objRequireNonNull4);
                    int iZza2 = com.google.android.gms.internal.play_billing.zzbp.zza(objRequireNonNull3.hashCode());
                    while (true) {
                        int i16 = iZza2 & i4;
                        char c3 = (char) sArr[i16];
                        if (c3 == 65535) {
                            sArr[i16] = (short) i14;
                            if (i12 < i13) {
                                objArrCopyOf[i14] = objRequireNonNull3;
                                objArrCopyOf[i14 ^ 1] = objRequireNonNull4;
                            }
                            i12++;
                            break;
                        }
                        if (objRequireNonNull3.equals(objArrCopyOf[c3])) {
                            int i17 = c3 ^ 1;
                            com.google.android.gms.internal.play_billing.zzbu zzbuVar5 = new com.google.android.gms.internal.play_billing.zzbu(objRequireNonNull3, objRequireNonNull4, java.util.Objects.requireNonNull(objArrCopyOf[i17 == true ? 1 : 0]));
                            objArrCopyOf[i17 == true ? 1 : 0] = objRequireNonNull4;
                            zzbuVar3 = zzbuVar5;
                            break;
                        }
                        iZza2 = i16 + 1;
                    }
                }
                if (i12 == i2) {
                    r3 = sArr;
                } else {
                    c2 = 2;
                    r5 = new java.lang.Object[]{sArr, java.lang.Integer.valueOf(i12), zzbuVar3};
                    c = 1;
                }
            } else {
                int i18 = 1;
                sArr = new int[iHighestOneBit];
                java.util.Arrays.fill((int[]) sArr, -1);
                int i19 = 0;
                int i20 = 0;
                while (i19 < i2) {
                    int i21 = i20 + i20;
                    int i22 = i19 + i19;
                    java.lang.Object objRequireNonNull5 = java.util.Objects.requireNonNull(objArrCopyOf[i22]);
                    java.lang.Object objRequireNonNull6 = java.util.Objects.requireNonNull(objArrCopyOf[i22 ^ i18]);
                    com.google.android.gms.internal.play_billing.zzbo.zza(objRequireNonNull5, objRequireNonNull6);
                    int iZza3 = com.google.android.gms.internal.play_billing.zzbp.zza(objRequireNonNull5.hashCode());
                    while (true) {
                        int i23 = iZza3 & i4;
                        ?? r15 = sArr[i23];
                        if (r15 == b) {
                            sArr[i23] = i21;
                            if (i20 < i19) {
                                objArrCopyOf[i21] = objRequireNonNull5;
                                objArrCopyOf[i21 ^ 1] = objRequireNonNull6;
                            }
                            i20++;
                            break;
                        }
                        if (objRequireNonNull5.equals(objArrCopyOf[r15])) {
                            int i24 = r15 ^ 1;
                            com.google.android.gms.internal.play_billing.zzbu zzbuVar6 = new com.google.android.gms.internal.play_billing.zzbu(objRequireNonNull5, objRequireNonNull6, java.util.Objects.requireNonNull(objArrCopyOf[i24 == true ? 1 : 0]));
                            objArrCopyOf[i24 == true ? 1 : 0] = objRequireNonNull6;
                            zzbuVar = zzbuVar6;
                            break;
                        }
                        iZza3 = i23 + 1;
                        b = -1;
                    }
                    i19++;
                    i18 = 1;
                    b = -1;
                }
                if (i20 == i2) {
                    r3 = sArr;
                } else {
                    c = 1;
                    c2 = 2;
                    r5 = new java.lang.Object[]{sArr, java.lang.Integer.valueOf(i20), zzbuVar};
                }
            }
            c2 = 2;
            r4 = r3;
            c = 1;
            r5 = r4;
        }
        boolean z = r5 instanceof java.lang.Object[];
        ?? r6 = r5;
        if (z) {
            java.lang.Object[] objArr2 = (java.lang.Object[]) r5;
            com.google.android.gms.internal.play_billing.zzbu zzbuVar7 = (com.google.android.gms.internal.play_billing.zzbu) objArr2[c2];
            if (zzbvVar == null) {
                throw zzbuVar7.zza();
            }
            zzbvVar.zzc = zzbuVar7;
            java.lang.Object obj = objArr2[0];
            int iIntValue = ((java.lang.Integer) objArr2[c]).intValue();
            objArrCopyOf = java.util.Arrays.copyOf(objArrCopyOf, iIntValue + iIntValue);
            r6 = obj;
            i2 = iIntValue;
        }
        return new com.google.android.gms.internal.play_billing.zzcf(r6, objArrCopyOf, i2);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0003  */
    @Override // com.google.android.gms.internal.play_billing.zzbw, java.util.Map
    public final java.lang.Object get(java.lang.Object obj) {
        java.lang.Object objRequireNonNull;
        if (obj == null) {
            objRequireNonNull = null;
        } else {
            int i = this.zzd;
            java.lang.Object[] objArr = this.zzb;
            if (i != 1) {
                java.lang.Object obj2 = this.zzc;
                if (obj2 == null) {
                    objRequireNonNull = null;
                } else if (obj2 instanceof byte[]) {
                    byte[] bArr = (byte[]) obj2;
                    int length = bArr.length - 1;
                    int iZza = com.google.android.gms.internal.play_billing.zzbp.zza(obj.hashCode());
                    while (true) {
                        int i2 = iZza & length;
                        int i3 = bArr[i2] & 255;
                        if (i3 == 255) {
                            break;
                        }
                        if (obj.equals(objArr[i3])) {
                            objRequireNonNull = objArr[i3 ^ 1];
                        } else {
                            iZza = i2 + 1;
                        }
                    }
                    objRequireNonNull = null;
                } else if (obj2 instanceof short[]) {
                    short[] sArr = (short[]) obj2;
                    int length2 = sArr.length - 1;
                    int iZza2 = com.google.android.gms.internal.play_billing.zzbp.zza(obj.hashCode());
                    while (true) {
                        int i4 = iZza2 & length2;
                        char c = (char) sArr[i4];
                        if (c == 65535) {
                            break;
                        }
                        if (obj.equals(objArr[c])) {
                            objRequireNonNull = objArr[c ^ 1];
                        } else {
                            iZza2 = i4 + 1;
                        }
                    }
                    objRequireNonNull = null;
                } else {
                    int[] iArr = (int[]) obj2;
                    int length3 = iArr.length - 1;
                    int iZza3 = com.google.android.gms.internal.play_billing.zzbp.zza(obj.hashCode());
                    while (true) {
                        int i5 = iZza3 & length3;
                        int i6 = iArr[i5];
                        if (i6 == -1) {
                            break;
                        }
                        if (obj.equals(objArr[i6])) {
                            objRequireNonNull = objArr[i6 ^ 1];
                        } else {
                            iZza3 = i5 + 1;
                        }
                    }
                    objRequireNonNull = null;
                }
            } else if (java.util.Objects.requireNonNull(objArr[0]).equals(obj)) {
                objRequireNonNull = java.util.Objects.requireNonNull(objArr[1]);
            } else {
                objRequireNonNull = null;
            }
        }
        if (objRequireNonNull == null) {
            return null;
        }
        return objRequireNonNull;
    }

    @Override // java.util.Map
    public final int size() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw
    final com.google.android.gms.internal.play_billing.zzbq zza() {
        return new com.google.android.gms.internal.play_billing.zzce(this.zzb, 1, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw
    final com.google.android.gms.internal.play_billing.zzbx zzd() {
        return new com.google.android.gms.internal.play_billing.zzcc(this, this.zzb, 0, this.zzd);
    }

    @Override // com.google.android.gms.internal.play_billing.zzbw
    final com.google.android.gms.internal.play_billing.zzbx zze() {
        return new com.google.android.gms.internal.play_billing.zzcd(this, new com.google.android.gms.internal.play_billing.zzce(this.zzb, 0, this.zzd));
    }
}
