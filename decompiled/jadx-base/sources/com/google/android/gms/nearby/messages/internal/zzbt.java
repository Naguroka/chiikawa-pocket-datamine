package com.google.android.gms.nearby.messages.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes5.dex */
abstract class zzbt extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<com.google.android.gms.common.api.Status, com.google.android.gms.nearby.messages.internal.zzai> {
    private final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>> zza;

    public zzbt(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(com.google.android.gms.nearby.Nearby.MESSAGES_API, googleApiClient);
        this.zza = googleApiClient.registerListener(this);
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(com.google.android.gms.common.api.Status status) {
        return status;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(java.lang.Object obj) {
        super.setResult((com.google.android.gms.common.api.Result) obj);
    }

    final com.google.android.gms.common.api.internal.ListenerHolder<com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder<com.google.android.gms.common.api.Status>> zza() {
        return this.zza;
    }
}
