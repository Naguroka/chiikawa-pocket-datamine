package com.google.android.gms.internal.nearby;

/* JADX INFO: compiled from: com.google.android.gms:play-services-nearby@@18.0.0 */
/* JADX INFO: loaded from: classes3.dex */
abstract class zzdi<R extends com.google.android.gms.common.api.Result> extends com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl<R, com.google.android.gms.internal.nearby.zzbf> {
    public zzdi(com.google.android.gms.common.api.GoogleApiClient googleApiClient) {
        super(com.google.android.gms.nearby.Nearby.CONNECTIONS_API, googleApiClient);
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ApiMethodImpl, com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    public final /* bridge */ /* synthetic */ void setResult(java.lang.Object obj) {
        super.setResult((com.google.android.gms.common.api.Result) obj);
    }
}
