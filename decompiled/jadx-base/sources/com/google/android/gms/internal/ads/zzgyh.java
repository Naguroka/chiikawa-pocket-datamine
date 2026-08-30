package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgyh extends java.io.InputStream {
    private java.util.Iterator zza;
    private java.nio.ByteBuffer zzb;
    private int zzc = 0;
    private int zzd;
    private int zze;
    private boolean zzf;
    private byte[] zzg;
    private int zzh;
    private long zzi;

    zzgyh(java.lang.Iterable iterable) {
        this.zza = iterable.iterator();
        java.util.Iterator it = iterable.iterator();
        while (it.hasNext()) {
            this.zzc++;
        }
        this.zzd = -1;
        if (zzb()) {
            return;
        }
        this.zzb = com.google.android.gms.internal.ads.zzgye.zzc;
        this.zzd = 0;
        this.zze = 0;
        this.zzi = 0L;
    }

    private final void zza(int i) {
        int i2 = this.zze + i;
        this.zze = i2;
        if (i2 == this.zzb.limit()) {
            zzb();
        }
    }

    private final boolean zzb() {
        this.zzd++;
        if (!this.zza.hasNext()) {
            return false;
        }
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) this.zza.next();
        this.zzb = byteBuffer;
        this.zze = byteBuffer.position();
        if (this.zzb.hasArray()) {
            this.zzf = true;
            this.zzg = this.zzb.array();
            this.zzh = this.zzb.arrayOffset();
        } else {
            this.zzf = false;
            this.zzi = com.google.android.gms.internal.ads.zzhao.zze(this.zzb);
            this.zzg = null;
        }
        return true;
    }

    @Override // java.io.InputStream
    public final int read() throws java.io.IOException {
        if (this.zzd == this.zzc) {
            return -1;
        }
        if (this.zzf) {
            int i = this.zzg[this.zze + this.zzh] & 255;
            zza(1);
            return i;
        }
        int iZza = com.google.android.gms.internal.ads.zzhao.zza(((long) this.zze) + this.zzi) & 255;
        zza(1);
        return iZza;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        if (this.zzd == this.zzc) {
            return -1;
        }
        int iLimit = this.zzb.limit();
        int i3 = this.zze;
        int i4 = iLimit - i3;
        if (i2 > i4) {
            i2 = i4;
        }
        if (this.zzf) {
            java.lang.System.arraycopy(this.zzg, i3 + this.zzh, bArr, i, i2);
            zza(i2);
        } else {
            int iPosition = this.zzb.position();
            this.zzb.position(this.zze);
            this.zzb.get(bArr, i, i2);
            this.zzb.position(iPosition);
            zza(i2);
        }
        return i2;
    }
}
