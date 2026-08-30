package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzao extends com.google.android.gms.internal.nearby.zzaw<com.google.android.gms.nearby.connection.EndpointDiscoveryCallback> {
    final /* synthetic */ java.lang.String zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzao(com.google.android.gms.internal.nearby.zzap zzapVar, java.lang.String str) {
        super(null);
        this.zza = str;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.nearby.connection.EndpointDiscoveryCallback) obj).onEndpointLost(this.zza);
    }
}
