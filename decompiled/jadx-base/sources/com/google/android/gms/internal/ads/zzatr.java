package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzatr {
    public static java.lang.String zza(byte[] bArr, boolean z) {
        return android.util.Base64.encodeToString(bArr, true != z ? 2 : 11);
    }

    public static byte[] zzb(java.lang.String str, boolean z) throws java.lang.IllegalArgumentException {
        byte[] bArrDecode = android.util.Base64.decode(str, 2);
        if (bArrDecode.length != 0 || str.length() <= 0) {
            return bArrDecode;
        }
        throw new java.lang.IllegalArgumentException("Unable to decode ".concat(str));
    }
}
