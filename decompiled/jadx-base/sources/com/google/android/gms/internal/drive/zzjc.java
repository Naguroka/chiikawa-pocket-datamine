package com.google.android.gms.internal.drive;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zzjc implements java.io.Serializable, java.lang.Iterable<java.lang.Byte> {
    public static final com.google.android.gms.internal.drive.zzjc zznq = new com.google.android.gms.internal.drive.zzjm(com.google.android.gms.internal.drive.zzkm.zzsn);
    private static final com.google.android.gms.internal.drive.zzji zznr;
    private static final java.util.Comparator<com.google.android.gms.internal.drive.zzjc> zznt;
    private int zzns = 0;

    zzjc() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int zza(byte b) {
        return b & 255;
    }

    public abstract boolean equals(java.lang.Object obj);

    public abstract int size();

    protected abstract int zza(int i, int i2, int i3);

    public abstract com.google.android.gms.internal.drive.zzjc zza(int i, int i2);

    protected abstract java.lang.String zza(java.nio.charset.Charset charset);

    abstract void zza(com.google.android.gms.internal.drive.zzjb zzjbVar) throws java.io.IOException;

    public abstract boolean zzbu();

    public abstract byte zzs(int i);

    abstract byte zzt(int i);

    public static com.google.android.gms.internal.drive.zzjc zzb(byte[] bArr, int i, int i2) {
        zzb(i, i + i2, bArr.length);
        return new com.google.android.gms.internal.drive.zzjm(zznr.zzc(bArr, i, i2));
    }

    public static com.google.android.gms.internal.drive.zzjc zzk(java.lang.String str) {
        return new com.google.android.gms.internal.drive.zzjm(str.getBytes(com.google.android.gms.internal.drive.zzkm.UTF_8));
    }

    public final java.lang.String zzbt() {
        return size() == 0 ? "" : zza(com.google.android.gms.internal.drive.zzkm.UTF_8);
    }

    public final int hashCode() {
        int iZza = this.zzns;
        if (iZza == 0) {
            int size = size();
            iZza = zza(size, 0, size);
            if (iZza == 0) {
                iZza = 1;
            }
            this.zzns = iZza;
        }
        return iZza;
    }

    static com.google.android.gms.internal.drive.zzjk zzu(int i) {
        return new com.google.android.gms.internal.drive.zzjk(i, null);
    }

    protected final int zzbv() {
        return this.zzns;
    }

    static int zzb(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new java.lang.IndexOutOfBoundsException(new java.lang.StringBuilder(32).append("Beginning index: ").append(i).append(" < 0").toString());
        }
        if (i2 < i) {
            throw new java.lang.IndexOutOfBoundsException(new java.lang.StringBuilder(66).append("Beginning index larger than ending index: ").append(i).append(", ").append(i2).toString());
        }
        throw new java.lang.IndexOutOfBoundsException(new java.lang.StringBuilder(37).append("End index: ").append(i2).append(" >= ").append(i3).toString());
    }

    public final java.lang.String toString() {
        return java.lang.String.format("<ByteString@%s size=%d>", java.lang.Integer.toHexString(java.lang.System.identityHashCode(this)), java.lang.Integer.valueOf(size()));
    }

    @Override // java.lang.Iterable
    public /* synthetic */ java.util.Iterator<java.lang.Byte> iterator() {
        return new com.google.android.gms.internal.drive.zzjd(this);
    }

    static {
        com.google.android.gms.internal.drive.zzjd zzjdVar = null;
        zznr = com.google.android.gms.internal.drive.zzix.zzbr() ? new com.google.android.gms.internal.drive.zzjn(zzjdVar) : new com.google.android.gms.internal.drive.zzjg(zzjdVar);
        zznt = new com.google.android.gms.internal.drive.zzje();
    }
}
