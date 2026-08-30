package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
@java.lang.Deprecated
final class zzai extends com.google.android.gms.internal.nearby.zzds {
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener> zza;

    zzai(com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.nearby.connection.Connections.ConnectionRequestListener> listenerHolder) {
        this.zza = (com.google.android.gms.common.api.internal.ListenerHolder) com.google.android.gms.common.internal.Preconditions.checkNotNull(listenerHolder);
    }

    @Override // com.google.android.gms.internal.nearby.zzdt
    public final void zzb(com.google.android.gms.internal.nearby.zzey zzeyVar) {
        this.zza.notifyListener(new com.google.android.gms.internal.nearby.zzah(this, zzeyVar));
    }
}
