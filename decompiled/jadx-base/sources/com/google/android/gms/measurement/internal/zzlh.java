package com.google.android.gms.measurement.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-impl@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
final class zzlh implements java.lang.Runnable {
    final /* synthetic */ java.util.concurrent.atomic.AtomicReference zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ java.lang.String zzc;
    final /* synthetic */ com.google.android.gms.measurement.internal.zzlw zzd;

    zzlh(com.google.android.gms.measurement.internal.zzlw zzlwVar, java.util.concurrent.atomic.AtomicReference atomicReference, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.zza = atomicReference;
        this.zzb = str2;
        this.zzc = str3;
        this.zzd = zzlwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzd.zzu.zzu().zzG(this.zza, null, this.zzb, this.zzc);
    }
}
