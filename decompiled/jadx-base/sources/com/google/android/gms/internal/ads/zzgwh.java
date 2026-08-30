package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzgwh extends java.io.OutputStream {
    private static final byte[] zza = new byte[0];
    private int zzd;
    private int zzf;
    private final int zzb = 128;
    private final java.util.ArrayList zzc = new java.util.ArrayList();
    private byte[] zze = new byte[128];

    zzgwh(int i) {
    }

    private final void zzc(int i) {
        this.zzc.add(new com.google.android.gms.internal.ads.zzgwg(this.zze));
        int length = this.zzd + this.zze.length;
        this.zzd = length;
        this.zze = new byte[java.lang.Math.max(this.zzb, java.lang.Math.max(i, length >>> 1))];
        this.zzf = 0;
    }

    public final java.lang.String toString() {
        return java.lang.String.format("<ByteString.Output@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(zza()));
    }

    @Override // java.io.OutputStream
    public final synchronized void write(int i) {
        if (this.zzf == this.zze.length) {
            zzc(1);
        }
        byte[] bArr = this.zze;
        int i2 = this.zzf;
        this.zzf = i2 + 1;
        bArr[i2] = (byte) i;
    }

    public final synchronized int zza() {
        return this.zzd + this.zzf;
    }

    public final synchronized com.google.android.gms.internal.ads.zzgwj zzb() {
        int i = this.zzf;
        byte[] bArr = this.zze;
        if (i >= bArr.length) {
            this.zzc.add(new com.google.android.gms.internal.ads.zzgwg(this.zze));
            this.zze = zza;
        } else if (i > 0) {
            this.zzc.add(new com.google.android.gms.internal.ads.zzgwg(java.util.Arrays.copyOf(bArr, i)));
        }
        this.zzd += this.zzf;
        this.zzf = 0;
        return com.google.android.gms.internal.ads.zzgwj.zzu(this.zzc);
    }

    @Override // java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        byte[] bArr2 = this.zze;
        int length = bArr2.length;
        int i3 = this.zzf;
        int i4 = length - i3;
        if (i2 <= i4) {
            java.lang.System.arraycopy(bArr, i, bArr2, i3, i2);
            this.zzf += i2;
            return;
        }
        java.lang.System.arraycopy(bArr, i, bArr2, i3, i4);
        int i5 = i2 - i4;
        zzc(i5);
        java.lang.System.arraycopy(bArr, i + i4, this.zze, 0, i5);
        this.zzf = i5;
    }
}
