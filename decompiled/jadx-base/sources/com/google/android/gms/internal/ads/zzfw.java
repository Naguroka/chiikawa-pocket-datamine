package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzfw extends com.google.android.gms.internal.ads.zzfr {
    private com.google.android.gms.internal.ads.zzgd zza;
    private byte[] zzb;
    private int zzc;
    private int zzd;

    public zzfw() {
        super(false);
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
        int i4 = com.google.android.gms.internal.ads.zzei.zza;
        java.lang.System.arraycopy(bArr2, this.zzc, bArr, i, iMin);
        this.zzc += iMin;
        this.zzd -= iMin;
        zzg(iMin);
        return iMin;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final long zzb(com.google.android.gms.internal.ads.zzgd zzgdVar) throws java.io.IOException {
        zzi(zzgdVar);
        this.zza = zzgdVar;
        android.net.Uri uriNormalizeScheme = zzgdVar.zza.normalizeScheme();
        java.lang.String scheme = uriNormalizeScheme.getScheme();
        com.google.android.gms.internal.ads.zzcw.zze("data".equals(scheme), "Unsupported scheme: ".concat(java.lang.String.valueOf(scheme)));
        java.lang.String schemeSpecificPart = uriNormalizeScheme.getSchemeSpecificPart();
        int i = com.google.android.gms.internal.ads.zzei.zza;
        java.lang.String[] strArrSplit = schemeSpecificPart.split(",", -1);
        if (strArrSplit.length != 2) {
            throw com.google.android.gms.internal.ads.zzbc.zzb("Unexpected URI format: ".concat(java.lang.String.valueOf(java.lang.String.valueOf(uriNormalizeScheme))), null);
        }
        java.lang.String str = strArrSplit[1];
        if (strArrSplit[0].contains(";base64")) {
            try {
                this.zzb = android.util.Base64.decode(str, 0);
            } catch (java.lang.IllegalArgumentException e) {
                throw com.google.android.gms.internal.ads.zzbc.zzb("Error while parsing Base64 encoded string: ".concat(java.lang.String.valueOf(str)), e);
            }
        } else {
            this.zzb = java.net.URLDecoder.decode(str, java.nio.charset.StandardCharsets.US_ASCII.name()).getBytes(java.nio.charset.StandardCharsets.UTF_8);
        }
        long j = zzgdVar.zze;
        int length = this.zzb.length;
        if (j > length) {
            this.zzb = null;
            throw new com.google.android.gms.internal.ads.zzfz(2008);
        }
        int i2 = (int) j;
        this.zzc = i2;
        int i3 = length - i2;
        this.zzd = i3;
        long j2 = zzgdVar.zzf;
        if (j2 != -1) {
            this.zzd = (int) java.lang.Math.min(i3, j2);
        }
        zzj(zzgdVar);
        long j3 = zzgdVar.zzf;
        return j3 != -1 ? j3 : this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final android.net.Uri zzc() {
        com.google.android.gms.internal.ads.zzgd zzgdVar = this.zza;
        if (zzgdVar != null) {
            return zzgdVar.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.zzfy
    public final void zzd() {
        if (this.zzb != null) {
            this.zzb = null;
            zzh();
        }
        this.zza = null;
    }
}
