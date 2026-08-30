package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzmk implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.measurement.internal.zzmo zza;

    zzmk(com.google.android.gms.measurement.internal.zzmo zzmoVar) {
        this.zza = zzmoVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.google.android.gms.measurement.internal.zzmo zzmoVar = this.zza;
        zzmoVar.zza = zzmoVar.zzh;
    }
}
