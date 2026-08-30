package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzar extends com.google.android.gms.internal.nearby.zzaw<com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener> {
    final /* synthetic */ com.google.android.gms.internal.nearby.zzfk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzar(com.google.android.gms.internal.nearby.zzas zzasVar, com.google.android.gms.internal.nearby.zzfk zzfkVar) {
        super(null);
        this.zza = zzfkVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.nearby.connection.Connections.EndpointDiscoveryListener) obj).onEndpointLost(this.zza.zza());
    }
}
