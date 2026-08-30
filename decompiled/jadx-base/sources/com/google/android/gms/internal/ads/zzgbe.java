package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzgbe extends com.google.android.gms.internal.ads.zzgbx implements java.lang.Runnable {
    public static final /* synthetic */ int zzc = 0;

    @javax.annotation.CheckForNull
    com.google.common.util.concurrent.ListenableFuture zza;

    @javax.annotation.CheckForNull
    java.lang.Object zzb;

    @Override // java.lang.Runnable
    public final void run() {
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zza;
        java.lang.Object obj = this.zzb;
        if ((isCancelled() | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.zza = null;
        if (listenableFuture.isCancelled()) {
            zzs(listenableFuture);
            return;
        }
        try {
            try {
                java.lang.Object objZze = zze(obj, com.google.android.gms.internal.ads.zzgch.zzp(listenableFuture));
                this.zzb = null;
                zzf(objZze);
            } catch (java.lang.Throwable th) {
                try {
                    com.google.android.gms.internal.ads.zzgda.zza(th);
                    zzd(th);
                } finally {
                    this.zzb = null;
                }
            }
        } catch (java.lang.Error e) {
            zzd(e);
        } catch (java.util.concurrent.CancellationException unused) {
            cancel(false);
        } catch (java.util.concurrent.ExecutionException e2) {
            zzd(e2.getCause());
        } catch (java.lang.Exception e3) {
            zzd(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    @javax.annotation.CheckForNull
    protected final java.lang.String zza() {
        java.lang.String str;
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zza;
        java.lang.Object obj = this.zzb;
        java.lang.String strZza = super.zza();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture.toString() + "], ";
        } else {
            str = "";
        }
        if (obj == null) {
            if (strZza != null) {
                return str.concat(strZza);
            }
            return null;
        }
        return str + "function=[" + obj.toString() + com.ironsource.y8.i.e;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    protected final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
    }

    abstract java.lang.Object zze(java.lang.Object obj, java.lang.Object obj2) throws java.lang.Exception;

    abstract void zzf(java.lang.Object obj);

    zzgbe(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = obj;
    }
}
