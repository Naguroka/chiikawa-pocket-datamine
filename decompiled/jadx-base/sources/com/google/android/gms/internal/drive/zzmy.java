package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public final class zzmy {
    private static final com.google.android.gms.internal.drive.zzmy zzvr = new com.google.android.gms.internal.drive.zzmy(0, new int[0], new java.lang.Object[0], false);
    private int count;
    private boolean zznh;
    private int zzrr;
    private java.lang.Object[] zzue;
    private int[] zzvs;

    public static com.google.android.gms.internal.drive.zzmy zzfa() {
        return zzvr;
    }

    static com.google.android.gms.internal.drive.zzmy zzfb() {
        return new com.google.android.gms.internal.drive.zzmy();
    }

    static com.google.android.gms.internal.drive.zzmy zza(com.google.android.gms.internal.drive.zzmy zzmyVar, com.google.android.gms.internal.drive.zzmy zzmyVar2) {
        int i = zzmyVar.count + zzmyVar2.count;
        int[] iArrCopyOf = java.util.Arrays.copyOf(zzmyVar.zzvs, i);
        java.lang.System.arraycopy(zzmyVar2.zzvs, 0, iArrCopyOf, zzmyVar.count, zzmyVar2.count);
        java.lang.Object[] objArrCopyOf = java.util.Arrays.copyOf(zzmyVar.zzue, i);
        java.lang.System.arraycopy(zzmyVar2.zzue, 0, objArrCopyOf, zzmyVar.count, zzmyVar2.count);
        return new com.google.android.gms.internal.drive.zzmy(i, iArrCopyOf, objArrCopyOf, true);
    }

    private zzmy() {
        this(0, new int[8], new java.lang.Object[8], true);
    }

    private zzmy(int i, int[] iArr, java.lang.Object[] objArr, boolean z) {
        this.zzrr = -1;
        this.count = i;
        this.zzvs = iArr;
        this.zzue = objArr;
        this.zznh = z;
    }

    public final void zzbp() {
        this.zznh = false;
    }

    final void zza(com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        if (zznsVar.zzcd() == com.google.android.gms.internal.drive.zzkk.zze.zzsj) {
            for (int i = this.count - 1; i >= 0; i--) {
                zznsVar.zza(this.zzvs[i] >>> 3, this.zzue[i]);
            }
            return;
        }
        for (int i2 = 0; i2 < this.count; i2++) {
            zznsVar.zza(this.zzvs[i2] >>> 3, this.zzue[i2]);
        }
    }

    public final void zzb(com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        if (this.count == 0) {
            return;
        }
        if (zznsVar.zzcd() == com.google.android.gms.internal.drive.zzkk.zze.zzsi) {
            for (int i = 0; i < this.count; i++) {
                zzb(this.zzvs[i], this.zzue[i], zznsVar);
            }
            return;
        }
        for (int i2 = this.count - 1; i2 >= 0; i2--) {
            zzb(this.zzvs[i2], this.zzue[i2], zznsVar);
        }
    }

    private static void zzb(int i, java.lang.Object obj, com.google.android.gms.internal.drive.zzns zznsVar) throws java.io.IOException {
        int i2 = i >>> 3;
        int i3 = i & 7;
        if (i3 == 0) {
            zznsVar.zzi(i2, ((java.lang.Long) obj).longValue());
            return;
        }
        if (i3 == 1) {
            zznsVar.zzc(i2, ((java.lang.Long) obj).longValue());
            return;
        }
        if (i3 == 2) {
            zznsVar.zza(i2, (com.google.android.gms.internal.drive.zzjc) obj);
            return;
        }
        if (i3 != 3) {
            if (i3 == 5) {
                zznsVar.zzf(i2, ((java.lang.Integer) obj).intValue());
                return;
            }
            throw new java.lang.RuntimeException(com.google.android.gms.internal.drive.zzkq.zzdl());
        }
        if (zznsVar.zzcd() == com.google.android.gms.internal.drive.zzkk.zze.zzsi) {
            zznsVar.zzak(i2);
            ((com.google.android.gms.internal.drive.zzmy) obj).zzb(zznsVar);
            zznsVar.zzal(i2);
        } else {
            zznsVar.zzal(i2);
            ((com.google.android.gms.internal.drive.zzmy) obj).zzb(zznsVar);
            zznsVar.zzak(i2);
        }
    }

    public final int zzfc() {
        int i = this.zzrr;
        if (i != -1) {
            return i;
        }
        int iZzd = 0;
        for (int i2 = 0; i2 < this.count; i2++) {
            iZzd += com.google.android.gms.internal.drive.zzjr.zzd(this.zzvs[i2] >>> 3, (com.google.android.gms.internal.drive.zzjc) this.zzue[i2]);
        }
        this.zzrr = iZzd;
        return iZzd;
    }

    public final int zzcx() {
        int iZze;
        int i = this.zzrr;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.count; i3++) {
            int i4 = this.zzvs[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 == 0) {
                iZze = com.google.android.gms.internal.drive.zzjr.zze(i5, ((java.lang.Long) this.zzue[i3]).longValue());
            } else if (i6 == 1) {
                iZze = com.google.android.gms.internal.drive.zzjr.zzg(i5, ((java.lang.Long) this.zzue[i3]).longValue());
            } else if (i6 == 2) {
                iZze = com.google.android.gms.internal.drive.zzjr.zzc(i5, (com.google.android.gms.internal.drive.zzjc) this.zzue[i3]);
            } else if (i6 == 3) {
                iZze = (com.google.android.gms.internal.drive.zzjr.zzab(i5) << 1) + ((com.google.android.gms.internal.drive.zzmy) this.zzue[i3]).zzcx();
            } else if (i6 == 5) {
                iZze = com.google.android.gms.internal.drive.zzjr.zzj(i5, ((java.lang.Integer) this.zzue[i3]).intValue());
            } else {
                throw new java.lang.IllegalStateException(com.google.android.gms.internal.drive.zzkq.zzdl());
            }
            i2 += iZze;
        }
        this.zzrr = i2;
        return i2;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0046 A[RETURN] */
    public final boolean equals(java.lang.Object obj) {
        boolean z;
        boolean z2;
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof com.google.android.gms.internal.drive.zzmy)) {
            return false;
        }
        com.google.android.gms.internal.drive.zzmy zzmyVar = (com.google.android.gms.internal.drive.zzmy) obj;
        int i = this.count;
        if (i == zzmyVar.count) {
            int[] iArr = this.zzvs;
            int[] iArr2 = zzmyVar.zzvs;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    z = true;
                    break;
                }
                if (iArr[i2] != iArr2[i2]) {
                    z = false;
                    break;
                }
                i2++;
            }
            if (z) {
                java.lang.Object[] objArr = this.zzue;
                java.lang.Object[] objArr2 = zzmyVar.zzue;
                int i3 = this.count;
                for (int i4 = 0; i4 < i3; i4++) {
                    if (!objArr[i4].equals(objArr2[i4])) {
                        z2 = false;
                        if (!z2) {
                            return true;
                        }
                    }
                }
                z2 = true;
                if (!z2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.count;
        int i2 = (i + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.zzvs;
        int iHashCode = 17;
        int i3 = 17;
        for (int i4 = 0; i4 < i; i4++) {
            i3 = (i3 * 31) + iArr[i4];
        }
        int i5 = (i2 + i3) * 31;
        java.lang.Object[] objArr = this.zzue;
        int i6 = this.count;
        for (int i7 = 0; i7 < i6; i7++) {
            iHashCode = (iHashCode * 31) + objArr[i7].hashCode();
        }
        return i5 + iHashCode;
    }

    final void zza(java.lang.StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.count; i2++) {
            com.google.android.gms.internal.drive.zzlt.zza(sb, i, java.lang.String.valueOf(this.zzvs[i2] >>> 3), this.zzue[i2]);
        }
    }

    final void zzb(int i, java.lang.Object obj) {
        if (!this.zznh) {
            throw new java.lang.UnsupportedOperationException();
        }
        int i2 = this.count;
        int[] iArr = this.zzvs;
        if (i2 == iArr.length) {
            int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
            this.zzvs = java.util.Arrays.copyOf(iArr, i3);
            this.zzue = java.util.Arrays.copyOf(this.zzue, i3);
        }
        int[] iArr2 = this.zzvs;
        int i4 = this.count;
        iArr2[i4] = i;
        this.zzue[i4] = obj;
        this.count = i4 + 1;
    }
}
