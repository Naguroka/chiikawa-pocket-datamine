package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzft extends com.google.android.gms.internal.ads.zzfr {
    private android.net.Uri zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;
    private boolean zze;
    private final com.google.android.gms.internal.ads.zzfs zzf;

    public zzft(byte[] bArr) {
        com.google.android.gms.internal.ads.zzfs zzfsVar = new com.google.android.gms.internal.ads.zzfs(bArr);
        super(false);
        this.zzf = zzfsVar;
        com.google.android.gms.internal.ads.zzcw.zzd(bArr.length > 0);
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.zzd;
        if (i3 == 0) {
            return -1;
        }
        int iMin = java.lang.Math.min(i2, i3);
        byte[] bArr2 = this.zzb;
        com.google.android.gms.internal.ads.zzcw.zzb(bArr2);
        java.lang.System.arraycopy(bArr2, this.zzc, bArr, i, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(com.google.android.gms.internal.ads.zzgd zzgdVar) throws java.io.IOException {
        zzi(zzgdVar);
        this.zza = zzgdVar.zza;
        this.zzb = this.zzf.zza;
        long j = zzgdVar.zze;
        int length = this.zzb.length;
        if (j > length) {
            throw new com.google.android.gms.internal.ads.zzfz(2008);
        }
        int i = (int) j;
        this.zzc = i;
        int i2 = length - i;
        this.zzd = i2;
        long j2 = zzgdVar.zzf;
        if (j2 != -1) {
            this.zzd = (int) java.lang.Math.min(i2, j2);
        }
        this.zze = true;
        zzj(zzgdVar);
        long j3 = zzgdVar.zzf;
        return j3 != -1 ? j3 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final android.net.Uri zzc() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() {
        if (this.zze) {
            this.zze = false;
            zzh();
        }
        this.zza = null;
        this.zzb = null;
    }
}
