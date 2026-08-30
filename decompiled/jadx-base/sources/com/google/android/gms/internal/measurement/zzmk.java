package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzmk {
    static final java.nio.charset.Charset zza;
    public static final byte[] zzb;

    static {
        java.nio.charset.Charset.forName("US-ASCII");
        zza = java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING);
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        java.nio.ByteBuffer.wrap(bArr);
        int i = com.google.android.gms.internal.measurement.zzlg.zza;
        try {
            new com.google.android.gms.internal.measurement.zzle(bArr, 0, 0, false, null).zza(0);
        } catch (com.google.android.gms.internal.measurement.zzmm e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static int zza(boolean z) {
        return z ? 1231 : 1237;
    }

    static int zzb(int i, byte[] bArr, int i2, int i3) {
        for (int i4 = 0; i4 < i3; i4++) {
            i = (i * 31) + bArr[i4];
        }
        return i;
    }

    static java.lang.Object zzc(java.lang.Object obj, java.lang.String str) {
        if (obj != null) {
            return obj;
        }
        throw new java.lang.NullPointerException("messageType");
    }
}
