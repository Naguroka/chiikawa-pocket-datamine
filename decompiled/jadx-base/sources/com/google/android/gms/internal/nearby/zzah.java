package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzah extends com.google.android.gms.internal.nearby.zzaw<com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener> {
    final /* synthetic */ com.google.android.gms.internal.nearby.zzey zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzah(com.google.android.gms.internal.nearby.zzai zzaiVar, com.google.android.gms.internal.nearby.zzey zzeyVar) {
        super(null);
        this.zza = zzeyVar;
    }

    @Override // com.google.android.gms.common.api.internal.ListenerHolder.Notifier
    public final /* bridge */ /* synthetic */ void notifyListener(java.lang.Object obj) {
        ((com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener) obj).onConnectionRequest(this.zza.zza(), this.zza.zzb(), this.zza.zzc());
    }
}
