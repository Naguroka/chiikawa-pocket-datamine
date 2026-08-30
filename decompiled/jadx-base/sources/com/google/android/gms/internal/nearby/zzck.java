package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzck extends com.google.android.gms.nearby.connection.ConnectionLifecycleCallback {
    final /* synthetic */ com.google.android.gms.internal.nearby.zzcn zza;
    private final com.google.android.gms.nearby.connection.ConnectionLifecycleCallback zzb;

    zzck(com.google.android.gms.internal.nearby.zzcn zzcnVar, com.google.android.gms.nearby.connection.ConnectionLifecycleCallback connectionLifecycleCallback) {
        this.zza = zzcnVar;
        this.zzb = connectionLifecycleCallback;
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionLifecycleCallback
    public final void onConnectionInitiated(java.lang.String str, com.google.android.gms.nearby.connection.ConnectionInfo connectionInfo) {
        if (connectionInfo.isIncomingConnection()) {
            this.zza.zzf(str);
        }
        this.zzb.onConnectionInitiated(str, connectionInfo);
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionLifecycleCallback
    public final void onConnectionResult(java.lang.String str, com.google.android.gms.nearby.connection.ConnectionResolution connectionResolution) {
        if (!connectionResolution.getStatus().isSuccess()) {
            this.zza.zzg(str);
        }
        this.zzb.onConnectionResult(str, connectionResolution);
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionLifecycleCallback
    public final void onDisconnected(java.lang.String str) {
        this.zza.zzg(str);
        this.zzb.onDisconnected(str);
    }

    @Override // com.google.android.gms.nearby.connection.ConnectionLifecycleCallback
    public final void zza(java.lang.String str, com.google.android.gms.nearby.connection.zzg zzgVar) {
        this.zzb.zza(str, zzgVar);
    }
}
