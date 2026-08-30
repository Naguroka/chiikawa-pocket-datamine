package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzmx extends com.google.android.gms.measurement.internal.zzgq {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzny zzb;

    zzmx(com.google.android.gms.measurement.internal.zzny zznyVar, java.util.concurrent.atomic.AtomicReference atomicReference) {
        this.zza = atomicReference;
        this.zzb = zznyVar;
    }

    @Override // com.google.android.gms.measurement.internal.zzgr
    public final void zze(com.google.android.gms.measurement.internal.zzpe zzpeVar) {
        java.util.concurrent.atomic.AtomicReference atomicReference = this.zza;
        synchronized (atomicReference) {
            this.zzb.zzu.zzaW().zzj().zzb("[sgtm] Got upload batches from service. count", java.lang.Integer.valueOf(zzpeVar.zza.size()));
            atomicReference.set(zzpeVar);
            atomicReference.notifyAll();
        }
    }
}
