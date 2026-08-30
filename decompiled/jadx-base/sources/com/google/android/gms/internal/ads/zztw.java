package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zztw implements com.google.android.gms.internal.ads.zzfy {
    private final com.google.android.gms.internal.ads.zzfy zza;
    private final int zzb;
    private final com.google.android.gms.internal.ads.zztv zzc;
    private final byte[] zzd;
    private int zze;

    public zztw(com.google.android.gms.internal.ads.zzfy zzfyVar, int i, com.google.android.gms.internal.ads.zztv zztvVar) {
        com.google.android.gms.internal.ads.zzcw.zzd(i > 0);
        this.zza = zzfyVar;
        this.zzb = i;
        this.zzc = zztvVar;
        this.zzd = new byte[1];
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzl
    public final int zza(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = this.zze;
        if (i3 == 0) {
            int i4 = 0;
            if (this.zza.zza(this.zzd, 0, 1) != -1) {
                int i5 = (this.zzd[0] & 255) << 4;
                if (i5 != 0) {
                    byte[] bArr2 = new byte[i5];
                    int i6 = i5;
                    while (i6 > 0) {
                        int iZza = this.zza.zza(bArr2, i4, i6);
                        if (iZza != -1) {
                            i4 += iZza;
                            i6 -= iZza;
                        }
                    }
                    while (i5 > 0) {
                        int i7 = i5 - 1;
                        if (bArr2[i7] != 0) {
                            break;
                        }
                        i5 = i7;
                    }
                    if (i5 > 0) {
                        this.zzc.zza(new com.google.android.gms.internal.ads.zzdy(bArr2, i5));
                    }
                }
                i3 = this.zzb;
                this.zze = i3;
            }
            return -1;
        }
        int iZza2 = this.zza.zza(bArr, i, java.lang.Math.min(i3, i2));
        if (iZza2 != -1) {
            this.zze -= iZza2;
        }
        return iZza2;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(com.google.android.gms.internal.ads.zzgd zzgdVar) {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final android.net.Uri zzc() {
        return this.zza.zzc();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() {
        throw new java.lang.UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final java.util.Map zze() {
        return this.zza.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzf(com.google.android.gms.internal.ads.zzgy zzgyVar) {
        zzgyVar.getClass();
        this.zza.zzf(zzgyVar);
    }
}
