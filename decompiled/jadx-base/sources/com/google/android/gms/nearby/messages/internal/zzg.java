package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzg extends com.google.android.gms.nearby.messages.internal.zzc {
    public zzg(java.lang.String str, java.lang.String str2) {
        byte[] bArrZzb = zzb(str);
        byte[] bArrZzb2 = zzb(str2);
        byte[][] bArr = new byte[2][];
        int length = bArrZzb.length;
        boolean z = length == 10;
        java.lang.StringBuilder sb = new java.lang.StringBuilder(53);
        sb.append("Namespace length(");
        sb.append(length);
        sb.append(" bytes) must be 10 bytes.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, sb.toString());
        bArr[0] = bArrZzb;
        int length2 = bArrZzb2.length;
        boolean z2 = length2 == 6;
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder(51);
        sb2.append("Instance length(");
        sb2.append(length2);
        sb2.append(" bytes) must be 6 bytes.");
        com.google.android.gms.common.internal.Preconditions.checkArgument(z2, sb2.toString());
        bArr[1] = bArrZzb2;
        byte[] bArrConcatByteArrays = com.google.android.gms.common.util.ArrayUtils.concatByteArrays(bArr);
        zze(bArrConcatByteArrays);
        super(bArrConcatByteArrays);
    }

    private static byte[] zze(byte[] bArr) {
        int length = bArr.length;
        boolean z = true;
        if (length != 10 && length != 16) {
            z = false;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, "Bytes must be a namespace (10 bytes), or a namespace plus instance (16 bytes).");
        return bArr;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzc
    public final java.lang.String toString() {
        java.lang.String strZzd = zzd();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(java.lang.String.valueOf(strZzd).length() + 26);
        sb.append("EddystoneUidPrefix{bytes=");
        sb.append(strZzd);
        sb.append('}');
        return sb.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzg(byte[] bArr) {
        super(bArr);
        zze(bArr);
    }
}
