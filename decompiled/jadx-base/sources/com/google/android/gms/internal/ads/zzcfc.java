package com.google.android.gms.internal.ads;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzcfc implements android.view.View.OnAttachStateChangeListener {
    final /* synthetic */ com.google.android.gms.internal.ads.zzbxu zza;
    final /* synthetic */ com.google.android.gms.internal.ads.zzcff zzb;

    zzcfc(com.google.android.gms.internal.ads.zzcff zzcffVar, com.google.android.gms.internal.ads.zzbxu zzbxuVar) {
        this.zza = zzbxuVar;
        this.zzb = zzcffVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View view) {
        this.zzb.zzaa(view, this.zza, 10);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View view) {
    }
}
