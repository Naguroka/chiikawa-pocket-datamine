package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzlp implements java.lang.Runnable {
    final /* synthetic */ java.lang.Boolean zza;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzb;

    zzlp(com.google.android.gms.measurement.internal.zzlw zzlwVar, java.lang.Boolean bool) {
        this.zza = bool;
        this.zzb = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzas(this.zza, true);
    }
}
