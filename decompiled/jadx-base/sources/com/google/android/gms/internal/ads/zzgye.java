package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgye {
    static final java.nio.charset.Charset zza;
    public static final byte[] zzb;
    public static final java.nio.ByteBuffer zzc;

    static {
        java.nio.charset.Charset.forName("US-ASCII");
        zza = java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING);
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        zzc = java.nio.ByteBuffer.wrap(bArr);
        int i = com.google.android.gms.internal.ads.zzgwp.zzd;
        com.google.android.gms.internal.ads.zzgwp.zzH(bArr, 0, 0, false);
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    static int zzb(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static java.lang.Object zzc(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException(str);
    }
}
