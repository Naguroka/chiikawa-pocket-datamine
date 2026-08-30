package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzbpw implements com.google.android.gms.ads.mediation.MediationAdRequest {
    private final java.util.Date zza;
    private final int zzb;
    private final java.util.Set zzc;
    private final boolean zzd;
    private final android.location.Location zze;
    private final int zzf;
    private final boolean zzg;

    public zzbpw(java.util.Date date, int i, java.util.Set set, android.location.Location location, boolean z, int i2, boolean z2, int i3, java.lang.String str) {
        this.zza = date;
        this.zzb = i;
        this.zzc = set;
        this.zze = location;
        this.zzd = z;
        this.zzf = i2;
        this.zzg = z2;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @java.lang.Deprecated
    public final java.util.Date getBirthday() {
        return this.zza;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @java.lang.Deprecated
    public final int getGender() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final java.util.Set<java.lang.String> getKeywords() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final android.location.Location getLocation() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    @java.lang.Deprecated
    public final boolean isDesignedForFamilies() {
        return this.zzg;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final boolean isTesting() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdRequest
    public final int taggedForChildDirectedTreatment() {
        return this.zzf;
    }
}
