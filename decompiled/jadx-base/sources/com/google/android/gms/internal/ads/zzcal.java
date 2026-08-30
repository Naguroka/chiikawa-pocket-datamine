package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcal extends com.google.android.gms.internal.ads.zzcam implements android.view.ViewTreeObserver.OnScrollChangedListener {
    private final java.lang.ref.WeakReference zza;

    public zzcal(android.view.View view, android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener) {
        super(view);
        this.zza = new java.lang.ref.WeakReference(onScrollChangedListener);
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        android.view.ViewTreeObserver.OnScrollChangedListener onScrollChangedListener = (android.view.ViewTreeObserver.OnScrollChangedListener) this.zza.get();
        if (onScrollChangedListener != null) {
            onScrollChangedListener.onScrollChanged();
        } else {
            zze();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    protected final void zza(android.view.ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.addOnScrollChangedListener(this);
    }

    @Override // com.google.android.gms.internal.ads.zzcam
    protected final void zzb(android.view.ViewTreeObserver viewTreeObserver) {
        viewTreeObserver.removeOnScrollChangedListener(this);
    }
}
