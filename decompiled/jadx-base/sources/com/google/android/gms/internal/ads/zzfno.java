package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzfno extends com.google.android.gms.internal.ads.zzfnk {
    private final java.lang.String zza;
    private final boolean zzb;
    private final boolean zzc;
    private final long zzd;
    private final long zze;

    /* synthetic */ zzfno(java.lang.String str, boolean z, boolean z2, boolean z3, long j, boolean z4, long j2, com.google.android.gms.internal.ads.zzfnn zzfnnVar) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
        this.zzd = j;
        this.zze = j2;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof com.google.android.gms.internal.ads.zzfnk) {
            com.google.android.gms.internal.ads.zzfnk zzfnkVar = (com.google.android.gms.internal.ads.zzfnk) obj;
            if (this.zza.equals(zzfnkVar.zzd()) && this.zzb == zzfnkVar.zzh() && this.zzc == zzfnkVar.zzg()) {
                zzfnkVar.zzf();
                if (this.zzd == zzfnkVar.zzb()) {
                    zzfnkVar.zze();
                    if (this.zze == zzfnkVar.zza()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003) ^ (true != this.zzc ? 1237 : 1231)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zzd)) * 1000003) ^ 1237) * 1000003) ^ ((int) this.zze);
    }

    public final java.lang.String toString() {
        return "AdShield2Options{clientVersion=" + this.zza + ", shouldGetAdvertisingId=" + this.zzb + ", isGooglePlayServicesAvailable=" + this.zzc + ", enableQuerySignalsTimeout=false, querySignalsTimeoutMs=" + this.zzd + ", enableQuerySignalsCache=false, querySignalsCacheTtlSeconds=" + this.zze + "}";
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final long zza() {
        return this.zze;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final long zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final java.lang.String zzd() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final boolean zze() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final boolean zzf() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final boolean zzg() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzfnk
    public final boolean zzh() {
        return this.zzb;
    }
}
