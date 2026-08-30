package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzb implements java.lang.Runnable {
    final /* synthetic */ com.google.android.gms.common.api.internal.LifecycleCallback zza;
    final /* synthetic */ java.lang.String zzb;
    final /* synthetic */ com.google.android.gms.common.api.internal.zzc zzc;

    zzb(com.google.android.gms.common.api.internal.zzc zzcVar, com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback, java.lang.String str) {
        this.zza = lifecycleCallback;
        this.zzb = str;
        this.zzc = zzcVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.os.Bundle bundle;
        com.google.android.gms.common.api.internal.zzc zzcVar = this.zzc;
        if (zzcVar.zzb > 0) {
            com.google.android.gms.common.api.internal.LifecycleCallback lifecycleCallback = this.zza;
            if (zzcVar.zzc != null) {
                bundle = zzcVar.zzc.getBundle(this.zzb);
            } else {
                bundle = null;
            }
            lifecycleCallback.onCreate(bundle);
        }
        if (this.zzc.zzb >= 2) {
            this.zza.onStart();
        }
        if (this.zzc.zzb >= 3) {
            this.zza.onResume();
        }
        if (this.zzc.zzb >= 4) {
            this.zza.onStop();
        }
        if (this.zzc.zzb >= 5) {
            this.zza.onDestroy();
        }
    }
}
