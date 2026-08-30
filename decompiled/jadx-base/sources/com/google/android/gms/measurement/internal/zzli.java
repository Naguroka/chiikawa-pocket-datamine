package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzli implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ boolean zzd;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zze;

    zzli(com.google.android.gms.measurement.internal.zzlw zzlwVar, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z) {
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = z;
        this.zze = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zze.zzu.zzu().zzL(this.zza, null, this.zzb, this.zzc, this.zzd);
    }
}
