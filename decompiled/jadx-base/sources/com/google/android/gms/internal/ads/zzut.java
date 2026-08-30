package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzut implements com.google.android.gms.internal.ads.zzxv {
    private final com.google.android.gms.internal.ads.zzxv zza;
    private final com.google.android.gms.internal.ads.zzbr zzb;

    public zzut(com.google.android.gms.internal.ads.zzxv zzxvVar, com.google.android.gms.internal.ads.zzbr zzbrVar) {
        this.zza = zzxvVar;
        this.zzb = zzbrVar;
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.internal.ads.zzut)) {
            return false;
        }
        com.google.android.gms.internal.ads.zzut zzutVar = (com.google.android.gms.internal.ads.zzut) obj;
        return this.zza.equals(zzutVar.zza) && this.zzb.equals(zzutVar.zzb);
    }

    public final int hashCode() {
        return ((this.zzb.hashCode() + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zza.hashCode();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final int zza(int i) {
        return this.zza.zza(i);
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final int zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final int zzc(int i) {
        return this.zza.zzc(i);
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final int zzd() {
        return this.zza.zzd();
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final com.google.android.gms.internal.ads.zzab zze(int i) {
        return this.zzb.zzb(this.zza.zza(i));
    }

    @Override // com.google.android.gms.internal.ads.zzxv
    public final com.google.android.gms.internal.ads.zzab zzf() {
        return this.zzb.zzb(this.zza.zzb());
    }

    @Override // com.google.android.gms.internal.ads.zzxz
    public final com.google.android.gms.internal.ads.zzbr zzg() {
        return this.zzb;
    }
}
