package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzat implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<com.google.android.gms.location.LocationListener> {
    final /* synthetic */ android.location.Location zza;

    zzat(com.google.android.gms.internal.location.zzau zzauVar, android.location.Location location) {
        this.zza = location;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(com.google.android.gms.location.LocationListener locationListener) {
        locationListener.onLocationChanged(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
