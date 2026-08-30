package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzgbj extends com.google.android.gms.internal.ads.zzgbi {
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zza;
    final java.util.concurrent.atomic.AtomicIntegerFieldUpdater zzb;

    zzgbj(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    final int zza(com.google.android.gms.internal.ads.zzgbm zzgbmVar) {
        return this.zzb.decrementAndGet(zzgbmVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgbi
    final void zzb(com.google.android.gms.internal.ads.zzgbm zzgbmVar, @javax.annotation.CheckForNull java.util.Set set, java.util.Set set2) {
        java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.zza;
            if (kotlin.UByte$$ExternalSyntheticBackport0.m(atomicReferenceFieldUpdater, zzgbmVar, (java.lang.Object) null, set2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(zzgbmVar) == null);
    }
}
