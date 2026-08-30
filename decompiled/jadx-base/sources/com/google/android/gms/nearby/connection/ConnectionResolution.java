package com.google.android.gms.nearby.connection;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class ConnectionResolution {
    private final com.google.android.gms.common.api.Status zza;

    @java.lang.Deprecated
    public ConnectionResolution(com.google.android.gms.common.api.Status status) {
        this.zza = status;
    }

    public com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }
}
