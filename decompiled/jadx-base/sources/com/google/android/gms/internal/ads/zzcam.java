package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
abstract class zzcam {
    private final java.lang.ref.WeakReference zza;

    public zzcam(android.view.View view) {
        this.zza = new java.lang.ref.WeakReference(view);
    }

    protected abstract void zza(android.view.ViewTreeObserver viewTreeObserver);

    protected abstract void zzb(android.view.ViewTreeObserver viewTreeObserver);

    protected final android.view.ViewTreeObserver zzc() {
        android.view.ViewTreeObserver viewTreeObserver;
        android.view.View view = (android.view.View) this.zza.get();
        if (view == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive()) {
            return null;
        }
        return viewTreeObserver;
    }

    public final void zzd() {
        android.view.ViewTreeObserver viewTreeObserverZzc = zzc();
        if (viewTreeObserverZzc != null) {
            zza(viewTreeObserverZzc);
        }
    }

    public final void zze() {
        android.view.ViewTreeObserver viewTreeObserverZzc = zzc();
        if (viewTreeObserverZzc != null) {
            zzb(viewTreeObserverZzc);
        }
    }
}
