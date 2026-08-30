package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgvo {
    private final byte[] zza;

    private zzgvo(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.zza = bArr2;
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    public static com.google.android.gms.internal.ads.zzgvo zzb(byte[] bArr) {
        if (bArr != null) {
            return new com.google.android.gms.internal.ads.zzgvo(bArr, 0, bArr.length);
        }
        throw new java.lang.NullPointerException("data must be non-null");
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj instanceof com.google.android.gms.internal.ads.zzgvo) {
            return java.util.Arrays.equals(((com.google.android.gms.internal.ads.zzgvo) obj).zza, this.zza);
        }
        return false;
    }

    public final int hashCode() {
        return java.util.Arrays.hashCode(this.zza);
    }

    public final java.lang.String toString() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + length);
        for (byte b : bArr) {
            int i = b & 255;
            sb.append("0123456789abcdef".charAt(i >> 4));
            sb.append("0123456789abcdef".charAt(i & 15));
        }
        return "Bytes(" + sb.toString() + ")";
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzc() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
