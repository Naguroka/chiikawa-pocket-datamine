package com.google.android.gms.ads.internal.overlay;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zzs extends android.animation.AnimatorListenerAdapter {
    final /* synthetic */ com.google.android.gms.ads.internal.overlay.zzu zza;

    zzs(com.google.android.gms.ads.internal.overlay.zzu zzuVar) {
        this.zza = zzuVar;
    }

    private final void zza(boolean z) {
        this.zza.setEnabled(z);
        this.zza.zza.setEnabled(z);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(android.animation.Animator animator) {
        zza(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(android.animation.Animator animator) {
        zza(true);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(android.animation.Animator animator) {
        zza(false);
    }
}
