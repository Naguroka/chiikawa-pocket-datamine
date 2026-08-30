package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfpr extends com.google.android.gms.internal.ads.zzfpz {
    private java.lang.String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    zzfpr() {
    }

    public final com.google.android.gms.internal.ads.zzfpz zza(java.lang.String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpz
    public final com.google.android.gms.internal.ads.zzfpz zzb(boolean z) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpz
    public final com.google.android.gms.internal.ads.zzfqa zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new com.google.android.gms.internal.ads.zzfpt(this.zza, false, this.zzc, null, null, this.zzd, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" fileOwner");
        }
        if (this.zzb == 0) {
            sb.append(" hasDifferentDmaOwner");
        }
        if (this.zzc == 0) {
            sb.append(" fileChecks");
        }
        if (this.zzd == 0) {
            sb.append(" filePurpose");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // com.google.android.gms.internal.ads.zzfpz
    final com.google.android.gms.internal.ads.zzfpz zzd(int i) {
        this.zzc = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfpz
    public final com.google.android.gms.internal.ads.zzfpz zze(int i) {
        this.zzd = 1;
        return this;
    }
}
