package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bl extends com.google.android.play.core.integrity.bi {
    final /* synthetic */ com.google.android.play.core.integrity.bn c;
    private final com.google.android.play.integrity.internal.s d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bl(com.google.android.play.core.integrity.bn bnVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new com.google.android.play.integrity.internal.s("OnWarmUpIntegrityTokenCallback");
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.k
    public final void e(android.os.Bundle bundle) throws android.os.RemoteException {
        super.e(bundle);
        this.d.d("onWarmUpExpressIntegrityToken", new java.lang.Object[0]);
        com.google.android.gms.common.api.ApiException apiExceptionA = this.c.f.a(bundle);
        if (apiExceptionA != null) {
            this.f2305a.trySetException(apiExceptionA);
        } else {
            this.f2305a.trySetResult(java.lang.Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
