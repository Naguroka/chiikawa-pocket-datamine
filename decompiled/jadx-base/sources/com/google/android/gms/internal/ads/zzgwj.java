package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zzgwj implements java.lang.Iterable<java.lang.Byte>, java.io.Serializable {
    public static final com.google.android.gms.internal.ads.zzgwj zzb = new com.google.android.gms.internal.ads.zzgwg(com.google.android.gms.internal.ads.zzgye.zzb);
    private int zza = 0;

    static {
        int i = com.google.android.gms.internal.ads.zzgvw.zza;
    }

    zzgwj() {
    }

    public static com.google.android.gms.internal.ads.zzgwh zzt() {
        return new com.google.android.gms.internal.ads.zzgwh(128);
    }

    public static com.google.android.gms.internal.ads.zzgwj zzu(java.lang.Iterable iterable) {
        int size;
        if (iterable instanceof java.util.Collection) {
            size = ((java.util.Collection) iterable).size();
        } else {
            java.util.Iterator it = iterable.iterator();
            size = 0;
            while (it.hasNext()) {
                it.next();
                size++;
            }
        }
        return size == 0 ? zzb : zzc(iterable.iterator(), size);
    }

    public static com.google.android.gms.internal.ads.zzgwj zzv(byte[] bArr, int i, int i2) {
        zzq(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        return new com.google.android.gms.internal.ads.zzgwg(bArr2);
    }

    public static com.google.android.gms.internal.ads.zzgwj zzw(java.lang.String str) {
        return new com.google.android.gms.internal.ads.zzgwg(str.getBytes(com.google.android.gms.internal.ads.zzgye.zza));
    }

    static void zzy(int i, int i2) {
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new java.lang.ArrayIndexOutOfBoundsException("Index < 0: " + i);
            }
            throw new java.lang.ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
        }
    }

    public abstract boolean equals(java.lang.Object obj);

    public final int hashCode() {
        int iZzi = this.zza;
        if (iZzi == 0) {
            int iZzd = zzd();
            iZzi = zzi(iZzd, 0, iZzd);
            if (iZzi == 0) {
                iZzi = 1;
            }
            this.zza = iZzi;
        }
        return iZzi;
    }

    public final java.lang.String toString() {
        java.util.Locale locale = java.util.Locale.ROOT;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Integer.toHexString(java.lang.System.identityHashCode(this));
        objArr[1] = java.lang.Integer.valueOf(zzd());
        objArr[2] = zzd() <= 50 ? com.google.android.gms.internal.ads.zzhaf.zza(this) : com.google.android.gms.internal.ads.zzhaf.zza(zzk(0, 47)).concat("...");
        return java.lang.String.format(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public final byte[] zzA() {
        int iZzd = zzd();
        if (iZzd == 0) {
            return com.google.android.gms.internal.ads.zzgye.zzb;
        }
        byte[] bArr = new byte[iZzd];
        zze(bArr, 0, 0, iZzd);
        return bArr;
    }

    public abstract byte zza(int i);

    abstract byte zzb(int i);

    public abstract int zzd();

    protected abstract void zze(byte[] bArr, int i, int i2, int i3);

    protected abstract int zzf();

    protected abstract boolean zzh();

    protected abstract int zzi(int i, int i2, int i3);

    protected abstract int zzj(int i, int i2, int i3);

    public abstract com.google.android.gms.internal.ads.zzgwj zzk(int i, int i2);

    public abstract com.google.android.gms.internal.ads.zzgwp zzl();

    protected abstract java.lang.String zzm(java.nio.charset.Charset charset);

    public abstract java.nio.ByteBuffer zzn();

    abstract void zzo(com.google.android.gms.internal.ads.zzgwa zzgwaVar) throws java.io.IOException;

    public abstract boolean zzp();

    protected final int zzr() {
        return this.zza;
    }

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: zzs, reason: merged with bridge method [inline-methods] */
    public com.google.android.gms.internal.ads.zzgwe iterator() {
        return new com.google.android.gms.internal.ads.zzgwb(this);
    }

    public final java.lang.String zzx() {
        return zzd() == 0 ? "" : zzm(com.google.android.gms.internal.ads.zzgye.zza);
    }

    @java.lang.Deprecated
    public final void zzz(byte[] bArr, int i, int i2, int i3) {
        zzq(0, i3, zzd());
        zzq(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            zze(bArr, 0, i2, i3);
        }
    }

    private static com.google.android.gms.internal.ads.zzgwj zzc(java.util.Iterator it, int i) {
        if (i <= 0) {
            throw new java.lang.IllegalArgumentException(java.lang.String.format("length (%s) must be >= 1", java.lang.Integer.valueOf(i)));
        }
        if (i == 1) {
            return (com.google.android.gms.internal.ads.zzgwj) it.next();
        }
        int i2 = i >>> 1;
        com.google.android.gms.internal.ads.zzgwj zzgwjVarZzc = zzc(it, i2);
        com.google.android.gms.internal.ads.zzgwj zzgwjVarZzc2 = zzc(it, i - i2);
        if (Integer.MAX_VALUE - zzgwjVarZzc.zzd() >= zzgwjVarZzc2.zzd()) {
            return com.google.android.gms.internal.ads.zzgzu.zzC(zzgwjVarZzc, zzgwjVarZzc2);
        }
        throw new java.lang.IllegalArgumentException("ByteString would be too long: " + zzgwjVarZzc.zzd() + "+" + zzgwjVarZzc2.zzd());
    }

    static int zzq(int i, int i2, int i3) {
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
