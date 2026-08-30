package com.google.android.gms.internal.measurement;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbu extends com.google.android.gms.internal.measurement.zzcb {
    private java.lang.String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    zzbu() {
    }

    public final com.google.android.gms.internal.measurement.zzcb zza(java.lang.String str) {
        this.zza = "";
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final com.google.android.gms.internal.measurement.zzcb zzb(boolean z) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final com.google.android.gms.internal.measurement.zzcc zzc() {
        if (this.zzb == 1 && this.zza != null && this.zzc != 0 && this.zzd != 0) {
            return new com.google.android.gms.internal.measurement.zzbw(this.zza, false, this.zzc, null, null, this.zzd, null);
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

    @Override // com.google.android.gms.internal.measurement.zzcb
    final com.google.android.gms.internal.measurement.zzcb zzd(int i) {
        this.zzc = i;
        return this;
    }

    @Override // com.google.android.gms.internal.measurement.zzcb
    public final com.google.android.gms.internal.measurement.zzcb zze(int i) {
        this.zzd = 1;
        return this;
    }
}
