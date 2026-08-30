package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfzv {
    final int zza;
    final int zzb;
    final int zzc;
    final int zzd;
    private final java.lang.String zze;
    private final char[] zzf;
    private final byte[] zzg;
    private final boolean[] zzh;
    private final boolean zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    zzfzv(java.lang.String str, char[] cArr) {
        byte[] bArr = new byte[128];
        java.util.Arrays.fill(bArr, (byte) -1);
        for (int i = 0; i < cArr.length; i++) {
            char c = cArr[i];
            boolean z = true;
            com.google.android.gms.internal.ads.zzfun.zzg(c < 128, "Non-ASCII character: %s", c);
            if (bArr[c] != -1) {
                z = false;
            }
            com.google.android.gms.internal.ads.zzfun.zzg(z, "Duplicate character: %s", c);
            bArr[c] = (byte) i;
        }
        this(str, cArr, bArr, false);
    }

    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.zzfzv) {
            com.google.android.gms.internal.ads.zzfzv zzfzvVar = (com.google.android.gms.internal.ads.zzfzv) obj;
            if (this.zzi == zzfzvVar.zzi && java.util.Arrays.equals(this.zzf, zzfzvVar.zzf)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.zzf) + (true != this.zzi ? 1237 : 1231);
    }

    public final java.lang.String toString() {
        return this.zze;
    }

    final char zza(int i) {
        return this.zzf[i];
    }

    final int zzb(char c) throws com.google.android.gms.internal.ads.zzfzy {
        if (c > 127) {
            throw new com.google.android.gms.internal.ads.zzfzy("Unrecognized character: 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(c))));
        }
        byte b = this.zzg[c];
        if (b != -1) {
            return b;
        }
        if (c <= ' ' || c == 127) {
            throw new com.google.android.gms.internal.ads.zzfzy("Unrecognized character: 0x".concat(java.lang.String.valueOf(java.lang.Integer.toHexString(c))));
        }
        throw new com.google.android.gms.internal.ads.zzfzy("Unrecognized character: " + c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11 */
    final com.google.android.gms.internal.ads.zzfzv zzc() {
        boolean z;
        int i = 0;
        while (true) {
            char[] cArr = this.zzf;
            if (i >= cArr.length) {
                return this;
            }
            if (com.google.android.gms.internal.ads.zzftt.zze(cArr[i])) {
                int i2 = 0;
                while (true) {
                    if (i2 >= cArr.length) {
                        z = false;
                        break;
                    }
                    if (com.google.android.gms.internal.ads.zzftt.zzd(cArr[i2])) {
                        z = true;
                        break;
                    }
                    i2++;
                }
                com.google.android.gms.internal.ads.zzfun.zzm(!z, "Cannot call lowerCase() on a mixed-case alphabet");
                char[] cArr2 = new char[this.zzf.length];
                int i3 = 0;
                while (true) {
                    char[] cArr3 = this.zzf;
                    if (i3 >= cArr3.length) {
                        break;
                    }
                    char c = cArr3[i3];
                    if (com.google.android.gms.internal.ads.zzftt.zze(c)) {
                        c ^= 32;
                    }
                    cArr2[i3] = (char) c;
                    i3++;
                }
                com.google.android.gms.internal.ads.zzfzv zzfzvVar = new com.google.android.gms.internal.ads.zzfzv(this.zze.concat(".lowerCase()"), cArr2);
                if (!this.zzi || zzfzvVar.zzi) {
                    return zzfzvVar;
                }
                byte[] bArr = zzfzvVar.zzg;
                byte[] bArrCopyOf = java.util.Arrays.copyOf(bArr, bArr.length);
                for (int i4 = 65; i4 <= 90; i4++) {
                    int i5 = i4 | 32;
                    byte[] bArr2 = zzfzvVar.zzg;
                    byte b = bArr2[i4];
                    byte b2 = bArr2[i5];
                    if (b == -1) {
                        bArrCopyOf[i4] = b2;
                    } else {
                        char c2 = (char) i4;
                        char c3 = (char) i5;
                        if (b2 != -1) {
                            throw new java.lang.IllegalStateException(com.google.android.gms.internal.ads.zzfve.zzb("Can't ignoreCase() since '%s' and '%s' encode different values", java.lang.Character.valueOf(c2), java.lang.Character.valueOf(c3)));
                        }
                        bArrCopyOf[i5] = b;
                    }
                }
                return new com.google.android.gms.internal.ads.zzfzv(zzfzvVar.zze.concat(".ignoreCase()"), zzfzvVar.zzf, bArrCopyOf, true);
            }
            i++;
        }
    }

    final boolean zzd(int i) {
        return this.zzh[i % this.zzc];
    }

    public final boolean zze(char c) {
        byte[] bArr = this.zzg;
        return bArr.length > 61 && bArr[61] != -1;
    }

    private zzfzv(java.lang.String str, char[] cArr, byte[] bArr, boolean z) {
        this.zze = str;
        cArr.getClass();
        this.zzf = cArr;
        try {
            int length = cArr.length;
            int iZzc = com.google.android.gms.internal.ads.zzgaj.zzc(length, java.math.RoundingMode.UNNECESSARY);
            this.zzb = iZzc;
            int iNumberOfTrailingZeros = java.lang.Integer.numberOfTrailingZeros(iZzc);
            int i = 1 << (3 - iNumberOfTrailingZeros);
            this.zzc = i;
            this.zzd = iZzc >> iNumberOfTrailingZeros;
            this.zza = length - 1;
            this.zzg = bArr;
            boolean[] zArr = new boolean[i];
            for (int i2 = 0; i2 < this.zzd; i2++) {
                zArr[com.google.android.gms.internal.ads.zzgaj.zzb(i2 * 8, this.zzb, java.math.RoundingMode.CEILING)] = true;
            }
            this.zzh = zArr;
            this.zzi = z;
        } catch (java.lang.ArithmeticException e) {
            throw new java.lang.IllegalArgumentException("Illegal alphabet length " + cArr.length, e);
        }
    }
}
