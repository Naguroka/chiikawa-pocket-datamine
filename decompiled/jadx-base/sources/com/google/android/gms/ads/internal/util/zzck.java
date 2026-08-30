package com.google.android.gms.ads.internal.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zzck {
    private final android.view.View zza;
    private android.app.Activity zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private final android.view.ViewTreeObserver.OnGlobalLayoutListener zzf;

    public zzck(android.app.Activity activity, android.view.View view, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener, android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        this.zzb = activity;
        this.zza = view;
        this.zzf = onGlobalLayoutListener;
    }

    private static android.view.ViewTreeObserver zzf(android.app.Activity activity) {
        android.view.View decorView;
        android.view.Window window = activity.getWindow();
        if (window == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.getViewTreeObserver();
    }

    private final void zzg() {
        if (this.zzc) {
            return;
        }
        android.app.Activity activity = this.zzb;
        if (activity != null) {
            android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzf;
            android.view.ViewTreeObserver viewTreeObserverZzf = zzf(activity);
            if (viewTreeObserverZzf != null) {
                viewTreeObserverZzf.addOnGlobalLayoutListener(onGlobalLayoutListener);
            }
        }
        android.view.View view = this.zza;
        android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.zzf;
        com.google.android.gms.ads.internal.zzv.zzy();
        com.google.android.gms.internal.ads.zzcaj.zza(view, onGlobalLayoutListener2);
        this.zzc = true;
    }

    private final void zzh() {
        android.app.Activity activity = this.zzb;
        if (activity != null && this.zzc) {
            android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = this.zzf;
            android.view.ViewTreeObserver viewTreeObserverZzf = zzf(activity);
            if (viewTreeObserverZzf != null) {
                viewTreeObserverZzf.removeOnGlobalLayoutListener(onGlobalLayoutListener);
            }
            this.zzc = false;
        }
    }

    public final void zza() {
        this.zze = false;
        zzh();
    }

    public final void zzb() {
        this.zze = true;
        if (this.zzd) {
            zzg();
        }
    }

    public final void zzc() {
        this.zzd = true;
        if (this.zze) {
            zzg();
        }
    }

    public final void zzd() {
        this.zzd = false;
        zzh();
    }

    public final void zze(android.app.Activity activity) {
        this.zzb = activity;
    }
}
