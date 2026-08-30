package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzhe {
    public byte[] zza;
    public byte[] zzb;
    public int zzc;
    public int[] zzd;
    public int[] zze;
    public int zzf;
    public int zzg;
    public int zzh;
    private final android.media.MediaCodec.CryptoInfo zzi;
    private final com.google.android.gms.internal.ads.zzhc zzj;

    public zzhe() {
        android.media.MediaCodec.CryptoInfo cryptoInfo = new android.media.MediaCodec.CryptoInfo();
        this.zzi = cryptoInfo;
        this.zzj = com.google.android.gms.internal.ads.zzei.zza >= 24 ? new com.google.android.gms.internal.ads.zzhc(cryptoInfo, null) : null;
    }

    public final android.media.MediaCodec.CryptoInfo zza() {
        return this.zzi;
    }

    public final void zzb(int i) {
        if (i == 0) {
            return;
        }
        if (this.zzd == null) {
            int[] iArr = new int[1];
            this.zzd = iArr;
            this.zzi.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.zzd;
        iArr2[0] = iArr2[0] + i;
    }

    public final void zzc(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.zzf = i;
        this.zzd = iArr;
        this.zze = iArr2;
        this.zzb = bArr;
        this.zza = bArr2;
        this.zzc = i2;
        this.zzg = i3;
        this.zzh = i4;
        this.zzi.numSubSamples = i;
        this.zzi.numBytesOfClearData = iArr;
        this.zzi.numBytesOfEncryptedData = iArr2;
        this.zzi.key = bArr;
        this.zzi.iv = bArr2;
        this.zzi.mode = i2;
        if (com.google.android.gms.internal.ads.zzei.zza >= 24) {
            com.google.android.gms.internal.ads.zzhc zzhcVar = this.zzj;
            zzhcVar.getClass();
            com.google.android.gms.internal.ads.zzhc.zza(zzhcVar, i3, i4);
        }
    }
}
