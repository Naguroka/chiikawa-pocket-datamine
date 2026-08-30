package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzhi {
    private static final com.google.android.gms.internal.play_billing.zzhi zza = new com.google.android.gms.internal.play_billing.zzhi(0, new int[0], new java.lang.Object[0], false);
    private int zzb;
    private int[] zzc;
    private java.lang.Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhi() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private zzhi(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static com.google.android.gms.internal.play_billing.zzhi zzc() {
        return zza;
    }

    static com.google.android.gms.internal.play_billing.zzhi zze(com.google.android.gms.internal.play_billing.zzhi zzhiVar, com.google.android.gms.internal.play_billing.zzhi zzhiVar2) {
        int i = zzhiVar.zzb + zzhiVar2.zzb;
        int[] iArrCopyOf = java.util.Arrays.copyOf(zzhiVar.zzc, i);
        java.lang.System.arraycopy(zzhiVar2.zzc, 0, iArrCopyOf, zzhiVar.zzb, zzhiVar2.zzb);
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(zzhiVar.zzd, i);
        java.lang.System.arraycopy(zzhiVar2.zzd, 0, objArrCopyOf, zzhiVar.zzb, zzhiVar2.zzb);
        return new com.google.android.gms.internal.play_billing.zzhi(i, iArrCopyOf, objArrCopyOf, true);
    }

    static com.google.android.gms.internal.play_billing.zzhi zzf() {
        return new com.google.android.gms.internal.play_billing.zzhi(0, new int[8], new java.lang.Object[8], true);
    }

    private final void zzm(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = java.util.Arrays.copyOf(iArr, i);
            this.zzd = java.util.Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.android.gms.internal.play_billing.zzhi)) {
            return false;
        }
        com.google.android.gms.internal.play_billing.zzhi zzhiVar = (com.google.android.gms.internal.play_billing.zzhi) obj;
        int i = this.zzb;
        if (i == zzhiVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhiVar.zzc;
            for (int i2 = 0; i2 < i; i2++) {
                if (iArr[i2] == iArr2[i2]) {
                }
            }
            java.lang.Object[] objArr = this.zzd;
            java.lang.Object[] objArr2 = zzhiVar.zzd;
            int i3 = this.zzb;
            for (int i4 = 0; i4 < i3; i4++) {
                if (objArr[i4].equals(objArr2[i4])) {
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = i + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        int[] iArr = this.zzc;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = ((i2 * 31) + i3) * 31;
        java.lang.Object[] objArr = this.zzd;
        int i6 = this.zzb;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    public final int zza() {
        int iZzC;
        int iZzD;
        int iZzC2;
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((java.lang.Long) this.zzd[i3]).longValue();
                    iZzC2 = com.google.android.gms.internal.play_billing.zzep.zzC(i5 << 3) + 8;
                } else if (i6 == 2) {
                    int i7 = i5 << 3;
                    com.google.android.gms.internal.play_billing.zzei zzeiVar = (com.google.android.gms.internal.play_billing.zzei) this.zzd[i3];
                    int iZzC3 = com.google.android.gms.internal.play_billing.zzep.zzC(i7);
                    int iZzd = zzeiVar.zzd();
                    iZzC2 = iZzC3 + com.google.android.gms.internal.play_billing.zzep.zzC(iZzd) + iZzd;
                } else if (i6 == 3) {
                    int iZzC4 = com.google.android.gms.internal.play_billing.zzep.zzC(i5 << 3);
                    iZzC = iZzC4 + iZzC4;
                    iZzD = ((com.google.android.gms.internal.play_billing.zzhi) this.zzd[i3]).zza();
                } else {
                    if (i6 != 5) {
                        throw new java.lang.IllegalStateException(new com.google.android.gms.internal.play_billing.zzfp("Protocol message tag had invalid wire type."));
                    }
                    ((java.lang.Integer) this.zzd[i3]).intValue();
                    iZzC2 = com.google.android.gms.internal.play_billing.zzep.zzC(i5 << 3) + 4;
                }
                i2 += iZzC2;
            } else {
                int i8 = i5 << 3;
                long jLongValue = ((java.lang.Long) this.zzd[i3]).longValue();
                iZzC = com.google.android.gms.internal.play_billing.zzep.zzC(i8);
                iZzD = com.google.android.gms.internal.play_billing.zzep.zzD(jLongValue);
            }
            iZzC2 = iZzC + iZzD;
            i2 += iZzC2;
        }
        this.zze = i2;
        return i2;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int iZzC = 0;
        for (int i2 = 0; i2 < this.zzb; i2++) {
            int i3 = this.zzc[i2] >>> 3;
            com.google.android.gms.internal.play_billing.zzei zzeiVar = (com.google.android.gms.internal.play_billing.zzei) this.zzd[i2];
            int iZzC2 = com.google.android.gms.internal.play_billing.zzep.zzC(8);
            int iZzC3 = com.google.android.gms.internal.play_billing.zzep.zzC(16) + com.google.android.gms.internal.play_billing.zzep.zzC(i3);
            int iZzC4 = com.google.android.gms.internal.play_billing.zzep.zzC(24);
            int iZzd = zzeiVar.zzd();
            iZzC += iZzC2 + iZzC2 + iZzC3 + iZzC4 + com.google.android.gms.internal.play_billing.zzep.zzC(iZzd) + iZzd;
        }
        this.zze = iZzC;
        return iZzC;
    }

    final com.google.android.gms.internal.play_billing.zzhi zzd(com.google.android.gms.internal.play_billing.zzhi zzhiVar) {
        if (zzhiVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzhiVar.zzb;
        zzm(i);
        java.lang.System.arraycopy(zzhiVar.zzc, 0, this.zzc, this.zzb, zzhiVar.zzb);
        java.lang.System.arraycopy(zzhiVar.zzd, 0, this.zzd, this.zzb, zzhiVar.zzb);
        this.zzb = i;
        return this;
    }

    final void zzg() {
        if (!this.zzf) {
            throw new java.lang.UnsupportedOperationException();
        }
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    final void zzi(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            com.google.android.gms.internal.play_billing.zzgn.zzb(sb, i, java.lang.String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    final void zzj(int i, java.lang.Object obj) {
        zzg();
        zzm(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    final void zzk(com.google.android.gms.internal.play_billing.zzhu zzhuVar) throws java.io.IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzhuVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(com.google.android.gms.internal.play_billing.zzhu zzhuVar) throws java.io.IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                java.lang.Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzhuVar.zzt(i4, ((java.lang.Long) obj).longValue());
                } else if (i3 == 1) {
                    zzhuVar.zzm(i4, ((java.lang.Long) obj).longValue());
                } else if (i3 == 2) {
                    zzhuVar.zzd(i4, (com.google.android.gms.internal.play_billing.zzei) obj);
                } else if (i3 == 3) {
                    zzhuVar.zzF(i4);
                    ((com.google.android.gms.internal.play_billing.zzhi) obj).zzl(zzhuVar);
                    zzhuVar.zzh(i4);
                } else {
                    if (i3 != 5) {
                        throw new java.lang.RuntimeException(new com.google.android.gms.internal.play_billing.zzfp("Protocol message tag had invalid wire type."));
                    }
                    zzhuVar.zzk(i4, ((java.lang.Integer) obj).intValue());
                }
            }
        }
    }
}
