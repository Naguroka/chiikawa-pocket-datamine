package com.google.android.gms.internal.play_billing;

/* JADX INFO: compiled from: com.android.billingclient:billing@@8.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzj extends com.google.android.gms.internal.play_billing.zzd {
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zza;
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zzb;
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zzc;
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zzd;
    final java.util.concurrent.atomic.AtomicReferenceFieldUpdater zze;

    zzj(java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.zza = atomicReferenceFieldUpdater;
        this.zzb = atomicReferenceFieldUpdater2;
        this.zzc = atomicReferenceFieldUpdater3;
        this.zzd = atomicReferenceFieldUpdater4;
        this.zze = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    final void zza(com.google.android.gms.internal.play_billing.zzm zzmVar, com.google.android.gms.internal.play_billing.zzm zzmVar2) {
        this.zzb.lazySet(zzmVar, zzmVar2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    final void zzb(com.google.android.gms.internal.play_billing.zzm zzmVar, java.lang.Thread thread) {
        this.zza.lazySet(zzmVar, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    final boolean zzc(com.google.android.gms.internal.play_billing.zzo zzoVar, com.google.android.gms.internal.play_billing.zzh zzhVar, com.google.android.gms.internal.play_billing.zzh zzhVar2) {
        return com.google.android.gms.internal.play_billing.zzi.zza(this.zzd, zzoVar, zzhVar, zzhVar2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    final boolean zzd(com.google.android.gms.internal.play_billing.zzo zzoVar, java.lang.Object obj, java.lang.Object obj2) {
        return com.google.android.gms.internal.play_billing.zzi.zza(this.zze, zzoVar, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.zzd
    final boolean zze(com.google.android.gms.internal.play_billing.zzo zzoVar, com.google.android.gms.internal.play_billing.zzm zzmVar, com.google.android.gms.internal.play_billing.zzm zzmVar2) {
        return com.google.android.gms.internal.play_billing.zzi.zza(this.zzc, zzoVar, zzmVar, zzmVar2);
    }
}
