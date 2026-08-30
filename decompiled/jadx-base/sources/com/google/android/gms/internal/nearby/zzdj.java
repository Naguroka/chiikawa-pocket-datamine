package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
final class zzdj implements com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult {
    final /* synthetic */ com.google.android.gms.common.api.Status zza;

    zzdj(com.google.android.gms.internal.nearby.zzdk zzdkVar, com.google.android.gms.common.api.Status status) {
        this.zza = status;
    }

    @Override // com.google.android.gms.nearby.connection.Connections.StartAdvertisingResult
    public final java.lang.String getLocalEndpointName() {
        return null;
    }

    @Override // com.google.android.gms.common.api.Result
    public final com.google.android.gms.common.api.Status getStatus() {
        return this.zza;
    }
}
