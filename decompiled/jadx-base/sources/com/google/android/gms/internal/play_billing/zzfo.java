package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
public final class zzfo {
    static final java.nio.charset.Charset zza;
    public static final byte[] zzb;

    static {
        java.nio.charset.Charset.forName("US-ASCII");
        zza = java.nio.charset.Charset.forName(com.adjust.sdk.Constants.ENCODING);
        java.nio.charset.Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        zzb = bArr;
        java.nio.ByteBuffer.wrap(bArr);
        int i = com.google.android.gms.internal.play_billing.zzel.zza;
        try {
            new com.google.android.gms.internal.play_billing.zzej(bArr, 0, 0, false, null).zza(0);
        } catch (com.google.android.gms.internal.play_billing.zzfq e) {
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

    static boolean zzd(com.google.android.gms.internal.play_billing.zzgl zzglVar) {
        if (!(zzglVar instanceof com.google.android.gms.internal.play_billing.zzdt)) {
            return false;
        }
        throw null;
    }
}
