package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzjo {
    private int zznz;
    private int zzoa;
    private boolean zzob;

    static com.google.android.gms.internal.drive.zzjo zza(byte[] bArr, int i, int i2, boolean z) {
        com.google.android.gms.internal.drive.zzjq zzjqVar = new com.google.android.gms.internal.drive.zzjq(bArr, 0, i2, false);
        try {
            zzjqVar.zzv(i2);
            return zzjqVar;
        } catch (com.google.android.gms.internal.drive.zzkq e) {
            throw new java.lang.IllegalArgumentException(e);
        }
    }

    public static long zzk(long j) {
        return (-(j & 1)) ^ (j >>> 1);
    }

    public static int zzw(int i) {
        return (-(i & 1)) ^ (i >>> 1);
    }

    public abstract int zzbz();

    public abstract int zzv(int i) throws com.google.android.gms.internal.drive.zzkq;

    private zzjo() {
        this.zznz = 100;
        this.zzoa = Integer.MAX_VALUE;
        this.zzob = false;
    }
}
