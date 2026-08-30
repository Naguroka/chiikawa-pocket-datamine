package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-base@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zzld implements java.lang.Iterable, java.io.Serializable {
    public static final com.google.android.gms.internal.measurement.zzld zzb = new com.google.android.gms.internal.measurement.zzlb(com.google.android.gms.internal.measurement.zzmk.zzb);
    private int zza = 0;

    static {
        int i = com.google.android.gms.internal.measurement.zzkr.zza;
    }

    zzld() {
    }

    public static com.google.android.gms.internal.measurement.zzld zzj(byte[] bArr, int i, int i2) {
        zzh(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return new com.google.android.gms.internal.measurement.zzlb(bArr2);
    }

    public abstract boolean equals(java.lang.Object obj);

    public final int hashCode() {
        int iZze = this.zza;
        if (iZze == 0) {
            int iZzd = zzd();
            iZze = zze(iZzd, 0, iZzd);
            if (iZze == 0) {
                iZze = 1;
            }
            this.zza = iZze;
        }
        return iZze;
    }

    @Override // java.lang.Iterable
    public final /* synthetic */ java.util.Iterator iterator() {
        return new com.google.android.gms.internal.measurement.zzkw(this);
    }

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        objArr[1] = java.lang.Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? com.google.android.gms.internal.measurement.zzoc.zza(this) : com.google.android.gms.internal.measurement.zzoc.zza(zzf(0, 47)).concat("...");
        return java.lang.String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public abstract byte zza(int i);

    abstract byte zzb(int i);

    public abstract int zzd();

    protected abstract int zze(int i, int i2, int i3);

    public abstract com.google.android.gms.internal.measurement.zzld zzf(int i, int i2);

    abstract void zzg(com.google.android.gms.internal.measurement.zzkv zzkvVar) throws java.io.IOException;

    protected final int zzi() {
        return this.zza;
    }

    static int zzh(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        }
        throw new java.lang.IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
    }
}
