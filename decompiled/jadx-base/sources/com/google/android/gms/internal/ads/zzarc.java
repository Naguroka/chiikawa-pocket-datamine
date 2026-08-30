package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzarc extends com.google.android.gms.internal.ads.zzhea {
    private java.util.Date zzg;
    private java.util.Date zzh;
    private long zzi;
    private long zzj;
    private double zzk;
    private float zzl;
    private com.google.android.gms.internal.ads.zzhek zzm;
    private long zzn;

    public zzarc() {
        super("mvhd");
        this.zzk = 1.0d;
        this.zzl = 1.0f;
        this.zzm = com.google.android.gms.internal.ads.zzhek.zza;
    }

    public final java.lang.String toString() {
        return "MovieHeaderBox[creationTime=" + this.zzg + ";modificationTime=" + this.zzh + ";timescale=" + this.zzi + ";duration=" + this.zzj + ";rate=" + this.zzk + ";volume=" + this.zzl + ";matrix=" + this.zzm + ";nextTrackId=" + this.zzn + com.ironsource.y8.i.e;
    }

    public final long zzc() {
        return this.zzj;
    }

    public final long zzd() {
        return this.zzi;
    }

    @Override // com.google.android.gms.internal.ads.zzhdy
    public final void zze(java.nio.ByteBuffer byteBuffer) {
        zzh(byteBuffer);
        if (zzg() == 1) {
            this.zzg = com.google.android.gms.internal.ads.zzhef.zza(com.google.android.gms.internal.ads.zzaqy.zzf(byteBuffer));
            this.zzh = com.google.android.gms.internal.ads.zzhef.zza(com.google.android.gms.internal.ads.zzaqy.zzf(byteBuffer));
            this.zzi = com.google.android.gms.internal.ads.zzaqy.zze(byteBuffer);
            this.zzj = com.google.android.gms.internal.ads.zzaqy.zzf(byteBuffer);
        } else {
            this.zzg = com.google.android.gms.internal.ads.zzhef.zza(com.google.android.gms.internal.ads.zzaqy.zze(byteBuffer));
            this.zzh = com.google.android.gms.internal.ads.zzhef.zza(com.google.android.gms.internal.ads.zzaqy.zze(byteBuffer));
            this.zzi = com.google.android.gms.internal.ads.zzaqy.zze(byteBuffer);
            this.zzj = com.google.android.gms.internal.ads.zzaqy.zze(byteBuffer);
        }
        this.zzk = com.google.android.gms.internal.ads.zzaqy.zzb(byteBuffer);
        byte[] bArr = new byte[2];
        byteBuffer.get(bArr);
        this.zzl = ((short) ((bArr[1] & 255) | ((short) (65280 & (bArr[0] << 8))))) / 256.0f;
        com.google.android.gms.internal.ads.zzaqy.zzd(byteBuffer);
        com.google.android.gms.internal.ads.zzaqy.zze(byteBuffer);
        com.google.android.gms.internal.ads.zzaqy.zze(byteBuffer);
        this.zzm = new com.google.android.gms.internal.ads.zzhek(com.google.android.gms.internal.ads.zzaqy.zzb(byteBuffer), com.google.android.gms.internal.ads.zzaqy.zzb(byteBuffer), com.google.android.gms.internal.ads.zzaqy.zzb(byteBuffer), com.google.android.gms.internal.ads.zzaqy.zzb(byteBuffer), com.google.android.gms.internal.ads.zzaqy.zza(byteBuffer), com.google.android.gms.internal.ads.zzaqy.zza(byteBuffer), com.google.android.gms.internal.ads.zzaqy.zza(byteBuffer), com.google.android.gms.internal.ads.zzaqy.zzb(byteBuffer), com.google.android.gms.internal.ads.zzaqy.zzb(byteBuffer));
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        byteBuffer.getInt();
        this.zzn = com.google.android.gms.internal.ads.zzaqy.zze(byteBuffer);
    }
}
