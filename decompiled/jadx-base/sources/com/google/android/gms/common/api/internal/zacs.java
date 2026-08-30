package com.google.android.gms.common.api.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zacs extends com.google.android.gms.common.api.internal.TaskApiCall {
    final /* synthetic */ com.google.android.gms.common.api.internal.TaskApiCall.Builder zaa;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zacs(com.google.android.gms.common.api.internal.TaskApiCall.Builder builder, com.google.android.gms.common.Feature[] featureArr, boolean z, int i) {
        super(featureArr, z, i);
        this.zaa = builder;
    }

    @Override // com.google.android.gms.common.api.internal.TaskApiCall
    protected final void doExecute(com.google.android.gms.common.api.Api.AnyClient anyClient, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) throws android.os.RemoteException {
        this.zaa.zaa.accept(anyClient, taskCompletionSource);
    }
}
