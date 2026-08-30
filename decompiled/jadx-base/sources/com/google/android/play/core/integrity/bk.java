package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bk extends com.google.android.play.core.integrity.bi {
    final /* synthetic */ com.google.android.play.core.integrity.bn c;
    private final com.google.android.play.integrity.internal.s d;
    private final long e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bk(com.google.android.play.core.integrity.bn bnVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, long j) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.d = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");
        this.e = j;
    }

    @Override // com.google.android.play.core.integrity.bi, com.google.android.play.integrity.internal.k
    public final void c(android.os.Bundle bundle) throws android.os.RemoteException {
        super.c(bundle);
        this.d.d("onRequestExpressIntegrityToken", new java.lang.Object[0]);
        com.google.android.gms.common.api.ApiException apiExceptionA = this.c.f.a(bundle);
        if (apiExceptionA != null) {
            this.f2305a.trySetException(apiExceptionA);
            return;
        }
        com.google.android.play.core.integrity.bj bjVar = new com.google.android.play.core.integrity.bj(this, this.c.c, bundle.getLong("request.token.sid"));
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.f2305a;
        com.google.android.play.core.integrity.b bVar = new com.google.android.play.core.integrity.b();
        bVar.b(bundle.getString("token"));
        bVar.a(bjVar);
        taskCompletionSource.trySetResult(bVar.c());
    }
}
