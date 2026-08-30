package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzpg extends com.google.android.gms.measurement.internal.zzoz {
    private boolean zza;

    zzpg(com.google.android.gms.measurement.internal.zzpv zzpvVar) {
        super(zzpvVar);
        this.zzg.zzad();
    }

    protected final void zzav() {
        if (!zzax()) {
            throw new java.lang.IllegalStateException("Not initialized");
        }
    }

    public final void zzaw() {
        if (this.zza) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        zzb();
        this.zzg.zzV();
        this.zza = true;
    }

    final boolean zzax() {
        return this.zza;
    }

    protected abstract boolean zzb();
}
