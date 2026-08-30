package com.google.android.gms.internal.location;

/* JADX INFO: compiled from: com.google.android.gms:play-services-location@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzau extends com.google.android.gms.location.zzbc {
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationListener> zza;

    zzau(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.location.LocationListener> listenerHolder) {
        this.zza = listenerHolder;
    }

    public final synchronized void zzc() {
        this.zza.clear();
    }

    @Override // com.google.android.gms.location.zzbd
    public final synchronized void zzd(android.location.Location location) {
        this.zza.notifyListener(new com.google.android.gms.internal.location.zzat(this, location));
    }
}
