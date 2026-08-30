package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzjr extends com.google.android.gms.measurement.internal.zzjq {
    private boolean zza;

    zzjr(com.google.android.gms.measurement.internal.zzio zzioVar) {
        super(zzioVar);
        this.zzu.zzE();
    }

    protected void zzaZ() {
    }

    protected abstract boolean zzc();

    protected final void zzv() {
        if (!zzy()) {
            throw new java.lang.IllegalStateException("Not initialized");
        }
    }

    public final void zzw() {
        if (this.zza) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        if (zzc()) {
            return;
        }
        this.zzu.zzD();
        this.zza = true;
    }

    public final void zzx() {
        if (this.zza) {
            throw new java.lang.IllegalStateException("Can't initialize twice");
        }
        zzaZ();
        this.zzu.zzD();
        this.zza = true;
    }

    final boolean zzy() {
        return this.zza;
    }
}
