package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
final class zzjh extends com.google.android.gms.internal.drive.zzjm {
    private final int zznv;
    private final int zznw;

    zzjh(byte[] bArr, int i, int i2) {
        super(bArr);
        zzb(i, i + i2, bArr.length);
        this.zznv = i;
        this.zznw = i2;
    }

    @Override // com.google.android.gms.internal.drive.zzjm, com.google.android.gms.internal.drive.zzjc
    public final byte zzs(int i) {
        int size = size();
        if (((size - (i + 1)) | i) >= 0) {
            return this.zzny[this.zznv + i];
        }
        if (i < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException(new java.lang.StringBuilder(22).append("Index < 0: ").append(i).toString());
        }
        throw new java.lang.ArrayIndexOutOfBoundsException(new java.lang.StringBuilder(40).append("Index > length: ").append(i).append(", ").append(size).toString());
    }

    @Override // com.google.android.gms.internal.drive.zzjm, com.google.android.gms.internal.drive.zzjc
    final byte zzt(int i) {
        return this.zzny[this.zznv + i];
    }

    @Override // com.google.android.gms.internal.drive.zzjm, com.google.android.gms.internal.drive.zzjc
    public final int size() {
        return this.zznw;
    }

    @Override // com.google.android.gms.internal.drive.zzjm
    protected final int zzbw() {
        return this.zznv;
    }
}
