package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzug {
    public final java.lang.Object zza;
    public final int zzb;
    public final int zzc;
    public final long zzd;
    public final int zze;

    public zzug(java.lang.Object obj, int i, int i2, long j) {
        this(obj, i, i2, j, -1);
    }

    private zzug(java.lang.Object obj, int i, int i2, long j, int i3) {
        this.zza = obj;
        this.zzb = i;
        this.zzc = i2;
        this.zzd = j;
        this.zze = i3;
    }

    public zzug(java.lang.Object obj, long j) {
        this(obj, -1, -1, j, -1);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzug)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzug zzugVar = (com.google.android.gms.internal.ads.zzug) obj;
        return this.zza.equals(zzugVar.zza) && this.zzb == zzugVar.zzb && this.zzc == zzugVar.zzc && this.zzd == zzugVar.zzd && this.zze == zzugVar.zze;
    }

    public final int hashCode() {
        return ((((((((this.zza.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zzb) * 31) + this.zzc) * 31) + ((int) this.zzd)) * 31) + this.zze;
    }

    public final com.google.android.gms.internal.ads.zzug zza(java.lang.Object obj) {
        return this.zza.equals(obj) ? this : new com.google.android.gms.internal.ads.zzug(obj, this.zzb, this.zzc, this.zzd, this.zze);
    }

    public final boolean zzb() {
        return this.zzb != -1;
    }

    public zzug(java.lang.Object obj, long j, int i) {
        this(obj, -1, -1, j, i);
    }
}
