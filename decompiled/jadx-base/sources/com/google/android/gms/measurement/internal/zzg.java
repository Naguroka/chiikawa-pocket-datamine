package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzg extends com.google.android.gms.measurement.internal.zzf {
    private boolean zza;

    zzg(com.google.android.gms.measurement.internal.zzio zzioVar) {
        super(zzioVar);
        this.zzu.zzE();
    }

    protected final void zza() {
        if (!zze()) {
            throw new java.lang.IllegalStateException("Not initialized");
        }
    }

    public final void zzb() {
        if (this.zza) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        if (zzf()) {
            return;
        }
        this.zzu.zzD();
        this.zza = true;
    }

    public final void zzc() {
        if (this.zza) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        zzd();
        this.zzu.zzD();
        this.zza = true;
    }

    protected void zzd() {
    }

    final boolean zze() {
        return this.zza;
    }

    protected abstract boolean zzf();
}
