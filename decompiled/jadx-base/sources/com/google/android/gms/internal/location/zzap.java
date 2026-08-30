package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzap implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<com.google.android.gms.location.LocationCallback> {
    final /* synthetic */ com.google.android.gms.location.LocationResult zza;

    zzap(com.google.android.gms.internal.location.zzar zzarVar, com.google.android.gms.location.LocationResult locationResult) {
        this.zza = locationResult;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(com.google.android.gms.location.LocationCallback locationCallback) {
        locationCallback.onLocationResult(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
