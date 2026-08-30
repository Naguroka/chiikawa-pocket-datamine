package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzdfr implements com.google.android.gms.ads.internal.overlay.zzr {
    private final com.google.android.gms.internal.ads.zzcxz zza;
    private final com.google.android.gms.internal.ads.zzdde zzb;

    public zzdfr(com.google.android.gms.internal.ads.zzcxz zzcxzVar, com.google.android.gms.internal.ads.zzdde zzddeVar) {
        this.zza = zzcxzVar;
        this.zzb = zzddeVar;
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
        this.zza.zzdE();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
        this.zza.zzdi();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        this.zza.zzdo();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        this.zza.zzdp();
        this.zzb.zzb();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
        this.zza.zzdr();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i) {
        this.zza.zzds(i);
        this.zzb.zza();
    }
}
