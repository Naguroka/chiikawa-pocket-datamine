package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzan extends com.google.android.gms.internal.nearby.zzaw<com.google.android.gms.nearby.connection.EndpointDiscoveryCallback> {
    final /* synthetic */ com.google.android.gms.internal.nearby.zzfk zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzan(com.google.android.gms.internal.nearby.zzap zzapVar, com.google.android.gms.internal.nearby.zzfk zzfkVar) {
        super(null);
        this.zza = zzfkVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.nearby.connection.EndpointDiscoveryCallback) obj).onEndpointLost(this.zza.zza());
    }
}
