package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zabj implements com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener {
    final /* synthetic */ com.google.android.gms.common.api.internal.GoogleApiManager zaa;

    zabj(com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager) {
        this.zaa = googleApiManager;
    }

    @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
    public final void onBackgroundStateChanged(boolean z) {
        com.google.android.gms.common.api.internal.GoogleApiManager googleApiManager = this.zaa;
        googleApiManager.zas.sendMessage(googleApiManager.zas.obtainMessage(1, java.lang.Boolean.valueOf(z)));
    }
}
