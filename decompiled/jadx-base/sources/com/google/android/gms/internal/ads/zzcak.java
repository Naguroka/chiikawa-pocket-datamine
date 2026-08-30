package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcak extends com.google.android.gms.internal.ads.zzcam implements android.view.ViewTreeObserver.OnGlobalLayoutListener {
    private final java.lang.ref.WeakReference zza;

    public zzcak(android.view.View view, android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
        super(view);
        this.zza = new java.lang.ref.WeakReference(onGlobalLayoutListener);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        android.view.ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener = (android.view.ViewTreeObserver.OnGlobalLayoutListener) this.zza.get();
        if (onGlobalLayoutListener != null) {
            onGlobalLayoutListener.onGlobalLayout();
        } else {
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    protected final void zza(android.view.ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnGlobalLayoutListener(this);
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    protected final void zzb(android.view.ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
