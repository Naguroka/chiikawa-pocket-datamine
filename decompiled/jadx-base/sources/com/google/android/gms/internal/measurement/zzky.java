package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzky extends com.google.android.gms.internal.measurement.zzlb {
    private final int zzc;

    zzky(byte[] bArr, int i, int i2) {
        super(bArr);
        zzh(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb, com.google.android.gms.internal.measurement.zzld
    final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.measurement.zzlb
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb, com.google.android.gms.internal.measurement.zzld
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.measurement.zzlb, com.google.android.gms.internal.measurement.zzld
    public final byte zza(int i) {
        int i2 = this.zzc;
        if (((i2 - (i + 1)) | i) >= 0) {
            return this.zza[i];
        }
        if (i < 0) {
            throw new java.lang.ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new java.lang.ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }
}
