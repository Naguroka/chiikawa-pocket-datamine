package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzau extends com.google.android.gms.internal.nearby.zzaw<com.google.android.gms.nearby.connection.Connections.MessageListener> {
    final /* synthetic */ com.google.android.gms.internal.nearby.zzfe zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzau(com.google.android.gms.internal.nearby.zzav zzavVar, com.google.android.gms.internal.nearby.zzfe zzfeVar) {
        super(null);
        this.zza = zzfeVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.nearby.connection.Connections.MessageListener) obj).onDisconnected(this.zza.zza());
    }
}
