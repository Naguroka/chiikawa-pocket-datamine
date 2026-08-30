package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zzl extends com.google.android.gms.nearby.messages.internal.zzc {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzl(java.util.UUID uuid, java.lang.Short sh, java.lang.Short sh2) {
        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate((sh == null ? 0 : 2) + 16 + (sh2 != null ? 2 : 0));
        byteBufferAllocate.putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits());
        if (sh != null) {
            byteBufferAllocate.putShort(sh.shortValue());
        }
        if (sh2 != null) {
            byteBufferAllocate.putShort(sh2.shortValue());
        }
        byte[] bArrArray = byteBufferAllocate.array();
        zzh(bArrArray);
        super(bArrArray);
    }

    private static byte[] zzh(byte[] bArr) {
        int length = bArr.length;
        boolean z = true;
        if (length != 16 && length != 18 && length != 20) {
            z = false;
        }
        com.google.android.gms.common.internal.Preconditions.checkArgument(z, "Prefix must be a UUID, a UUID and a major, or a UUID, a major, and a minor.");
        return bArr;
    }

    @Override // com.google.android.gms.nearby.messages.internal.zzc
    public final java.lang.String toString() {
        java.lang.String strValueOf = java.lang.String.valueOf(zze());
        java.lang.String strValueOf2 = java.lang.String.valueOf(zzf());
        java.lang.String strValueOf3 = java.lang.String.valueOf(zzg());
        int length = java.lang.String.valueOf(strValueOf).length();
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length + 47 + java.lang.String.valueOf(strValueOf2).length() + java.lang.String.valueOf(strValueOf3).length());
        sb.append("IBeaconIdPrefix{proximityUuid=");
        sb.append(strValueOf);
        sb.append(", major=");
        sb.append(strValueOf2);
        sb.append(", minor=");
        sb.append(strValueOf3);
        sb.append('}');
        return sb.toString();
    }

    public final java.util.UUID zze() {
        java.nio.ByteBuffer byteBufferWrap = java.nio.ByteBuffer.wrap(zzc());
        return new java.util.UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }

    public final java.lang.Short zzf() {
        byte[] bArrZzc = zzc();
        if (bArrZzc.length >= 18) {
            return java.lang.Short.valueOf(java.nio.ByteBuffer.wrap(bArrZzc).getShort(16));
        }
        return null;
    }

    public final java.lang.Short zzg() {
        byte[] bArrZzc = zzc();
        if (bArrZzc.length == 20) {
            return java.lang.Short.valueOf(java.nio.ByteBuffer.wrap(bArrZzc).getShort(18));
        }
        return null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzl(byte[] bArr) {
        super(bArr);
        zzh(bArr);
    }
}
