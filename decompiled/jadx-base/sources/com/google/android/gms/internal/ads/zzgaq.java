package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgaq extends com.google.android.gms.internal.ads.zzgar {
    static /* bridge */ /* synthetic */ int zza(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int zzb(long j) {
        int i = (int) j;
        com.google.android.gms.internal.ads.zzfun.zzh(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int zzc(int i, int i2, int i3) {
        com.google.android.gms.internal.ads.zzfun.zzj(true, "min (%s) must be less than or equal to max (%s)", i2, kotlinx.coroutines.internal.LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        int[] iArr = new int[2];
        int[] iArr2 = {i, i2};
        for (char c = 1; c < 2; c = 2) {
            int i4 = iArr2[1];
            if (i4 > i) {
                i = i4;
            }
        }
        iArr[0] = i;
        iArr[1] = 1073741823;
        for (char c2 = 1; c2 < 2; c2 = 2) {
            int i5 = iArr[1];
            if (i5 < i) {
                i = i5;
            }
        }
        return i;
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        com.google.android.gms.internal.ads.zzfun.zzj(length >= 4, "array too small: %s < %s", length, 4);
        return (bArr[3] & 255) | (bArr[0] << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8);
    }

    public static int zze(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j;
    }

    public static java.util.List zzg(int... iArr) {
        int length = iArr.length;
        return length == 0 ? java.util.Collections.emptyList() : new com.google.android.gms.internal.ads.zzgap(iArr, 0, length);
    }

    public static int[] zzh(java.util.Collection collection) {
        java.lang.Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            java.lang.Object obj = array[i];
            obj.getClass();
            iArr[i] = ((java.lang.Number) obj).intValue();
        }
        return iArr;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x000d  */
    @javax.annotation.CheckForNull
    public static java.lang.Integer zzf(java.lang.String str, int i) {
        java.lang.Long lValueOf;
        str.getClass();
        if (!str.isEmpty()) {
            char cCharAt = str.charAt(0);
            int i2 = cCharAt == '-' ? 1 : 0;
            if (i2 != str.length()) {
                int i3 = i2 + 1;
                int iZza = com.google.android.gms.internal.ads.zzgas.zza(str.charAt(i2));
                if (iZza >= 0 && iZza < 10) {
                    long j = -iZza;
                    while (true) {
                        if (i3 >= str.length()) {
                            if (cCharAt != '-') {
                                if (j != Long.MIN_VALUE) {
                                    lValueOf = java.lang.Long.valueOf(-j);
                                    break;
                                }
                                break;
                            }
                            lValueOf = java.lang.Long.valueOf(j);
                            break;
                        }
                        int i4 = i3 + 1;
                        int iZza2 = com.google.android.gms.internal.ads.zzgas.zza(str.charAt(i3));
                        if (iZza2 >= 0 && iZza2 < 10 && j >= okio.internal.Buffer.OVERFLOW_ZONE) {
                            long j2 = j * 10;
                            long j3 = iZza2;
                            if (j2 >= Long.MIN_VALUE + j3) {
                                j = j2 - j3;
                                i3 = i4;
                            }
                        }
                        lValueOf = null;
                        break;
                    }
                }
                lValueOf = null;
                break;
            }
            lValueOf = null;
            break;
        }
        lValueOf = null;
        break;
        if (lValueOf == null || lValueOf.longValue() != lValueOf.intValue()) {
            return null;
        }
        return java.lang.Integer.valueOf(lValueOf.intValue());
    }
}
