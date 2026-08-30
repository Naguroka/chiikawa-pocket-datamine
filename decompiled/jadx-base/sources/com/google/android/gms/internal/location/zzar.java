package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzar extends com.google.android.gms.location.zzaz {
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationCallback> zza;

    zzar(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationCallback> listenerHolder) {
        this.zza = listenerHolder;
    }

    public final synchronized void zzc() {
        this.zza.clear();
    }

    @Override // com.google.android.gms.location.zzba
    public final void zzd(com.google.android.gms.location.LocationResult locationResult) {
        this.zza.notifyListener(new com.google.android.gms.internal.location.zzap(this, locationResult));
    }

    @Override // com.google.android.gms.location.zzba
    public final void zze(com.google.android.gms.location.LocationAvailability locationAvailability) {
        this.zza.notifyListener(new com.google.android.gms.internal.location.zzaq(this, locationAvailability));
    }
}
