package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzaq implements com.google.android.gms.common.api.internal.ListenerHolder.Notifier<com.google.android.gms.location.LocationCallback> {
    final /* synthetic */ com.google.android.gms.location.LocationAvailability zza;

    zzaq(com.google.android.gms.internal.location.zzar zzarVar, com.google.android.gms.location.LocationAvailability locationAvailability) {
        this.zza = locationAvailability;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(com.google.android.gms.location.LocationCallback locationCallback) {
        locationCallback.onLocationAvailability(this.zza);
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final void onNotifyListenerFailed() {
    }
}
