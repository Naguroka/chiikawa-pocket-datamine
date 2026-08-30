package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzas extends com.google.android.gms.internal.nearby.zzef {
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener> zza;

    zzas(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener> listenerHolder) {
        this.zza = (com.google.android.gms.common.api.internal.ListenerHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzeg
    public final synchronized void zzb(com.google.android.gms.internal.nearby.zzfg zzfgVar) {
    }

    @Override // com.google.android.gms.internal.nearby.zzeg
    public final void zzc(com.google.android.gms.internal.nearby.zzfi zzfiVar) {
        this.zza.notifyListener(new com.google.android.gms.internal.nearby.zzaq(this, zzfiVar));
    }

    @Override // com.google.android.gms.internal.nearby.zzeg
    public final void zzd(com.google.android.gms.internal.nearby.zzfk zzfkVar) {
        this.zza.notifyListener(new com.google.android.gms.internal.nearby.zzar(this, zzfkVar));
    }
}
