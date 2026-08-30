package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzgaw extends com.google.android.gms.internal.ads.zzgbx implements java.lang.Runnable {

    @javax.annotation.CheckForNull
    com.google.common.util.concurrent.ListenableFuture zza;

    @javax.annotation.CheckForNull
    java.lang.Class zzb;

    @javax.annotation.CheckForNull
    java.lang.Object zzc;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object objZzp;
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zza;
        java.lang.Class cls = this.zzb;
        java.lang.Object obj = this.zzc;
        if (((obj == null) || ((listenableFuture == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.zza = null;
        try {
            th = listenableFuture instanceof com.google.android.gms.internal.ads.zzgdl ? ((com.google.android.gms.internal.ads.zzgdl) listenableFuture).zzl() : null;
            objZzp = th == null ? com.google.android.gms.internal.ads.zzgch.zzp(listenableFuture) : null;
        } catch (java.util.concurrent.ExecutionException e) {
            java.lang.Throwable cause = e.getCause();
            if (cause == null) {
                cause = new java.lang.NullPointerException("Future type " + java.lang.String.valueOf(listenableFuture.getClass()) + " threw " + java.lang.String.valueOf(e.getClass()) + " without a cause");
            }
            th = cause;
        } catch (java.lang.Throwable th) {
            th = th;
        }
        if (th == null) {
            zzc(objZzp);
            return;
        }
        if (!cls.isInstance(th)) {
            zzs(listenableFuture);
            return;
        }
        try {
            java.lang.Object objZze = zze(obj, th);
            this.zzb = null;
            this.zzc = null;
            zzf(objZze);
        } catch (java.lang.Throwable th2) {
            try {
                com.google.android.gms.internal.ads.zzgda.zza(th2);
                zzd(th2);
            } finally {
                this.zzb = null;
                this.zzc = null;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    @javax.annotation.CheckForNull
    protected final java.lang.String zza() {
        java.lang.String str;
        com.google.common.util.concurrent.ListenableFuture listenableFuture = this.zza;
        java.lang.Class cls = this.zzb;
        java.lang.Object obj = this.zzc;
        java.lang.String strZza = super.zza();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture.toString() + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strZza != null) {
                return str.concat(strZza);
            }
            return null;
        }
        return str + "exceptionType=[" + cls.toString() + "], fallback=[" + obj.toString() + com.ironsource.y8.i.e;
    }

    @Override // com.google.android.gms.internal.ads.zzgax
    protected final void zzb() {
        zzr(this.zza);
        this.zza = null;
        this.zzb = null;
        this.zzc = null;
    }

    abstract java.lang.Object zze(java.lang.Object obj, java.lang.Throwable th) throws java.lang.Exception;

    abstract void zzf(java.lang.Object obj);

    zzgaw(com.google.common.util.concurrent.ListenableFuture listenableFuture, java.lang.Class cls, java.lang.Object obj) {
        listenableFuture.getClass();
        this.zza = listenableFuture;
        this.zzb = cls;
        this.zzc = obj;
    }
}
