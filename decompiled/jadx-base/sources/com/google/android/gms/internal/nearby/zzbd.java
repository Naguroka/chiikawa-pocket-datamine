package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzbd implements com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult {
    private final com.google.android.gms.common.api.Status zza;
    private final java.lang.String zzb;

    zzbd(com.google.android.gms.common.api.Status status, java.lang.String str) {
        this.zza = status;
        this.zzb = str;
    }

    @Override // com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult
    public final java.lang.String getLocalEndpointName() {
        return this.zzb;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }
}
