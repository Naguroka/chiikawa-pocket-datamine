package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzcru implements com.google.android.gms.ads.internal.overlay.zzr {
    private final com.google.android.gms.internal.ads.zzcxa zza;
    private final java.util.concurrent.atomic.AtomicBoolean zzb = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final java.util.concurrent.atomic.AtomicBoolean zzc = new java.util.concurrent.atomic.AtomicBoolean(false);

    public zzcru(com.google.android.gms.internal.ads.zzcxa zzcxaVar) {
        this.zza = zzcxaVar;
    }

    private final void zzh() {
        if (this.zzc.get()) {
            return;
        }
        this.zzc.set(true);
        this.zza.zza();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdE() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdi() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdo() {
        zzh();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdp() {
        this.zza.zzc();
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzdr() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzr
    public final void zzds(int i) {
        this.zzb.set(true);
        zzh();
    }

    public final boolean zzg() {
        return this.zzb.get();
    }
}
