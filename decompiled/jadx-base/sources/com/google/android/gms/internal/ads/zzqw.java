package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzqw extends com.google.android.gms.internal.ads.zzci {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh = com.google.android.gms.internal.ads.zzei.zzf;
    private int zzi;
    private long zzj;

    @Override // com.google.android.gms.internal.ads.zzci, com.google.android.gms.internal.ads.zzch
    public final java.nio.ByteBuffer zzb() {
        int i;
        if (super.zzh() && (i = this.zzi) > 0) {
            zzj(i).put(this.zzh, 0, this.zzi).flip();
            this.zzi = 0;
        }
        return super.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zze(java.nio.ByteBuffer byteBuffer) {
        int iPosition = byteBuffer.position();
        int iLimit = byteBuffer.limit();
        int i = iLimit - iPosition;
        if (i == 0) {
            return;
        }
        int iMin = java.lang.Math.min(i, this.zzg);
        this.zzj += (long) (iMin / this.zzb.zze);
        this.zzg -= iMin;
        byteBuffer.position(iPosition + iMin);
        if (this.zzg <= 0) {
            int i2 = i - iMin;
            int length = (this.zzi + i2) - this.zzh.length;
            java.nio.ByteBuffer byteBufferZzj = zzj(length);
            int iMax = java.lang.Math.max(0, java.lang.Math.min(length, this.zzi));
            byteBufferZzj.put(this.zzh, 0, iMax);
            int iMax2 = java.lang.Math.max(0, java.lang.Math.min(length - iMax, i2));
            byteBuffer.limit(byteBuffer.position() + iMax2);
            byteBufferZzj.put(byteBuffer);
            byteBuffer.limit(iLimit);
            int i3 = i2 - iMax2;
            int i4 = this.zzi - iMax;
            this.zzi = i4;
            byte[] bArr = this.zzh;
            java.lang.System.arraycopy(bArr, iMax, bArr, 0, i4);
            byteBuffer.get(this.zzh, this.zzi, i3);
            this.zzi += i3;
            byteBufferZzj.flip();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzci, com.google.android.gms.internal.ads.zzch
    public final boolean zzh() {
        return super.zzh() && this.zzi == 0;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    public final com.google.android.gms.internal.ads.zzcf zzi(com.google.android.gms.internal.ads.zzcf zzcfVar) throws com.google.android.gms.internal.ads.zzcg {
        if (zzcfVar.zzd != 2) {
            throw new com.google.android.gms.internal.ads.zzcg("Unhandled input format:", zzcfVar);
        }
        this.zzf = true;
        return (this.zzd == 0 && this.zze == 0) ? com.google.android.gms.internal.ads.zzcf.zza : zzcfVar;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    protected final void zzk() {
        if (this.zzf) {
            this.zzf = false;
            int i = this.zze;
            int i2 = this.zzb.zze;
            this.zzh = new byte[i * i2];
            this.zzg = this.zzd * i2;
        }
        this.zzi = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzci
    protected final void zzl() {
        if (this.zzf) {
            int i = this.zzi;
            if (i > 0) {
                this.zzj += (long) (i / this.zzb.zze);
            }
            this.zzi = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzci
    protected final void zzm() {
        this.zzh = com.google.android.gms.internal.ads.zzei.zzf;
    }

    public final long zzo() {
        return this.zzj;
    }

    public final void zzp() {
        this.zzj = 0L;
    }

    public final void zzq(int i, int i2) {
        this.zzd = i;
        this.zze = i2;
    }
}
