package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzck implements com.google.android.gms.internal.ads.zzch {
    private int zzb;
    private float zzc = 1.0f;
    private float zzd = 1.0f;
    private com.google.android.gms.internal.ads.zzcf zze = com.google.android.gms.internal.ads.zzcf.zza;
    private com.google.android.gms.internal.ads.zzcf zzf;
    private com.google.android.gms.internal.ads.zzcf zzg;
    private com.google.android.gms.internal.ads.zzcf zzh;
    private boolean zzi;
    private com.google.android.gms.internal.ads.zzcj zzj;
    private java.nio.ByteBuffer zzk;
    private java.nio.ShortBuffer zzl;
    private java.nio.ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzck() {
        com.google.android.gms.internal.ads.zzcf zzcfVar = com.google.android.gms.internal.ads.zzcf.zza;
        this.zzf = zzcfVar;
        this.zzg = zzcfVar;
        this.zzh = zzcfVar;
        java.nio.ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final com.google.android.gms.internal.ads.zzcf zza(com.google.android.gms.internal.ads.zzcf zzcfVar) throws com.google.android.gms.internal.ads.zzcg {
        if (zzcfVar.zzd != 2) {
            throw new com.google.android.gms.internal.ads.zzcg("Unhandled input format:", zzcfVar);
        }
        int i = this.zzb;
        if (i == -1) {
            i = zzcfVar.zzb;
        }
        this.zze = zzcfVar;
        com.google.android.gms.internal.ads.zzcf zzcfVar2 = new com.google.android.gms.internal.ads.zzcf(i, zzcfVar.zzc, 2);
        this.zzf = zzcfVar2;
        this.zzi = true;
        return zzcfVar2;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final java.nio.ByteBuffer zzb() {
        int iZza;
        com.google.android.gms.internal.ads.zzcj zzcjVar = this.zzj;
        if (zzcjVar != null && (iZza = zzcjVar.zza()) > 0) {
            if (this.zzk.capacity() < iZza) {
                java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.allocateDirect(iZza).order(java.nio.ByteOrder.nativeOrder());
                this.zzk = byteBufferOrder;
                this.zzl = byteBufferOrder.asShortBuffer();
            } else {
                this.zzk.clear();
                this.zzl.clear();
            }
            zzcjVar.zzd(this.zzl);
            this.zzo += (long) iZza;
            this.zzk.limit(iZza);
            this.zzm = this.zzk;
        }
        java.nio.ByteBuffer byteBuffer = this.zzm;
        this.zzm = zza;
        return byteBuffer;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzc() {
        if (zzg()) {
            this.zzg = this.zze;
            this.zzh = this.zzf;
            if (this.zzi) {
                com.google.android.gms.internal.ads.zzcf zzcfVar = this.zzg;
                this.zzj = new com.google.android.gms.internal.ads.zzcj(zzcfVar.zzb, zzcfVar.zzc, this.zzc, this.zzd, this.zzh.zzb);
            } else {
                com.google.android.gms.internal.ads.zzcj zzcjVar = this.zzj;
                if (zzcjVar != null) {
                    zzcjVar.zzc();
                }
            }
        }
        this.zzm = zza;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzd() {
        com.google.android.gms.internal.ads.zzcj zzcjVar = this.zzj;
        if (zzcjVar != null) {
            zzcjVar.zze();
        }
        this.zzp = true;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zze(java.nio.ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            com.google.android.gms.internal.ads.zzcj zzcjVar = this.zzj;
            zzcjVar.getClass();
            java.nio.ShortBuffer shortBufferAsShortBuffer = byteBuffer.asShortBuffer();
            int iRemaining = byteBuffer.remaining();
            this.zzn += (long) iRemaining;
            zzcjVar.zzf(shortBufferAsShortBuffer);
            byteBuffer.position(byteBuffer.position() + iRemaining);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final void zzf() {
        this.zzc = 1.0f;
        this.zzd = 1.0f;
        this.zze = com.google.android.gms.internal.ads.zzcf.zza;
        com.google.android.gms.internal.ads.zzcf zzcfVar = com.google.android.gms.internal.ads.zzcf.zza;
        this.zzf = zzcfVar;
        this.zzg = zzcfVar;
        this.zzh = zzcfVar;
        java.nio.ByteBuffer byteBuffer = zza;
        this.zzk = byteBuffer;
        this.zzl = byteBuffer.asShortBuffer();
        this.zzm = zza;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = 0L;
        this.zzo = 0L;
        this.zzp = false;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final boolean zzg() {
        if (this.zzf.zzb == -1) {
            return false;
        }
        if (java.lang.Math.abs(this.zzc - 1.0f) >= 1.0E-4f || java.lang.Math.abs(this.zzd - 1.0f) >= 1.0E-4f) {
            return true;
        }
        return this.zzf.zzb != this.zze.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzch
    public final boolean zzh() {
        if (!this.zzp) {
            return false;
        }
        com.google.android.gms.internal.ads.zzcj zzcjVar = this.zzj;
        return zzcjVar == null || zzcjVar.zza() == 0;
    }

    public final long zzi(long j) {
        long j2 = this.zzo;
        if (j2 < 1024) {
            return (long) (((double) this.zzc) * j);
        }
        long j3 = this.zzn;
        com.google.android.gms.internal.ads.zzcj zzcjVar = this.zzj;
        zzcjVar.getClass();
        long jZzb = j3 - ((long) zzcjVar.zzb());
        int i = this.zzh.zzb;
        int i2 = this.zzg.zzb;
        return i == i2 ? com.google.android.gms.internal.ads.zzei.zzu(j, jZzb, j2, java.math.RoundingMode.DOWN) : com.google.android.gms.internal.ads.zzei.zzu(j, jZzb * ((long) i), j2 * ((long) i2), java.math.RoundingMode.DOWN);
    }

    public final void zzj(float f) {
        if (this.zzd != f) {
            this.zzd = f;
            this.zzi = true;
        }
    }

    public final void zzk(float f) {
        if (this.zzc != f) {
            this.zzc = f;
            this.zzi = true;
        }
    }
}
