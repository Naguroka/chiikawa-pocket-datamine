package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfnm extends com.google.android.gms.internal.ads.zzfnj {
    private java.lang.String zza;
    private boolean zzb;
    private boolean zzc;
    private long zzd;
    private long zze;
    private byte zzf;

    zzfnm() {
    }

    @Override // com.google.android.gms.internal.ads.zzfnj
    public final com.google.android.gms.internal.ads.zzfnj zza(java.lang.String str) {
        if (str == null) {
            throw new java.lang.NullPointerException("Null clientVersion");
        }
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnj
    public final com.google.android.gms.internal.ads.zzfnj zzb(boolean z) {
        this.zzf = (byte) (this.zzf | 16);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnj
    public final com.google.android.gms.internal.ads.zzfnj zzc(boolean z) {
        this.zzf = (byte) (this.zzf | 4);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnj
    public final com.google.android.gms.internal.ads.zzfnj zzd(boolean z) {
        this.zzc = true;
        this.zzf = (byte) (this.zzf | 2);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnj
    public final com.google.android.gms.internal.ads.zzfnj zze(long j) {
        this.zze = 300L;
        this.zzf = (byte) (this.zzf | 32);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnj
    public final com.google.android.gms.internal.ads.zzfnj zzf(long j) {
        this.zzd = 100L;
        this.zzf = (byte) (this.zzf | 8);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnj
    public final com.google.android.gms.internal.ads.zzfnj zzg(boolean z) {
        this.zzb = z;
        this.zzf = (byte) (this.zzf | 1);
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfnj
    public final com.google.android.gms.internal.ads.zzfnk zzh() {
        java.lang.String str;
        if (this.zzf == 63 && (str = this.zza) != null) {
            return new com.google.android.gms.internal.ads.zzfno(str, this.zzb, this.zzc, false, this.zzd, false, this.zze, null);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (this.zza == null) {
            sb.append(" clientVersion");
        }
        if ((this.zzf & 1) == 0) {
            sb.append(" shouldGetAdvertisingId");
        }
        if ((this.zzf & 2) == 0) {
            sb.append(" isGooglePlayServicesAvailable");
        }
        if ((this.zzf & 4) == 0) {
            sb.append(" enableQuerySignalsTimeout");
        }
        if ((this.zzf & 8) == 0) {
            sb.append(" querySignalsTimeoutMs");
        }
        if ((this.zzf & 16) == 0) {
            sb.append(" enableQuerySignalsCache");
        }
        if ((this.zzf & 32) == 0) {
            sb.append(" querySignalsCacheTtlSeconds");
        }
        throw new java.lang.IllegalStateException("Missing required properties:".concat(sb.toString()));
    }
}
