package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public abstract class ConnectionLifecycleCallback {
    public abstract void onConnectionInitiated(java.lang.String str, com.google.android.gms.nearby.connection.ConnectionInfo connectionInfo);

    public abstract void onConnectionResult(java.lang.String str, com.google.android.gms.nearby.connection.ConnectionResolution connectionResolution);

    public abstract void onDisconnected(java.lang.String str);

    public void zza(java.lang.String str, com.google.android.gms.nearby.connection.zzg zzgVar) {
    }
}
