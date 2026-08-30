package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzbug implements java.lang.Thread.UncaughtExceptionHandler {
    final /* synthetic */ java.lang.Thread.UncaughtExceptionHandler zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzbuh zzb;

    zzbug(com.google.android.gms.internal.ads.zzbuh zzbuhVar, java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.zza = uncaughtExceptionHandler;
        this.zzb = zzbuhVar;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) {
        try {
            try {
                this.zzb.zzg(thread, th);
            } finally {
                java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.zza;
                if (uncaughtExceptionHandler != null) {
                    uncaughtExceptionHandler.uncaughtException(thread, th);
                }
            }
        } catch (java.lang.Throwable unused) {
            com.google.android.gms.ads.internal.util.client.zzo.zzg("AdMob exception reporter failed reporting the exception.");
        }
        if (this.zza != null) {
        }
    }
}
