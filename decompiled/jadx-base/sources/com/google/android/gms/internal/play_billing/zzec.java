package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzec extends com.google.android.gms.internal.play_billing.zzeg {
    private final int zzc;

    zzec(byte[] bArr, int i, int i2) {
        super(bArr);
        zzh(0, i2, bArr.length);
        this.zzc = i2;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
    final byte zzb(int i) {
        return this.zza[i];
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg
    protected final int zzc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
    public final int zzd() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.play_billing.zzeg, com.google.android.gms.internal.play_billing.zzei
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
