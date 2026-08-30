package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ai extends com.google.android.play.integrity.internal.o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.core.integrity.aj f2283a;
    private final com.google.android.play.integrity.internal.s b = new com.google.android.play.integrity.internal.s("OnRequestIntegrityTokenCallback");
    private final com.google.android.gms.tasks.TaskCompletionSource c;

    ai(com.google.android.play.core.integrity.aj ajVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.f2283a = ajVar;
        this.c = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.p
    public final void b(android.os.Bundle bundle) {
        this.f2283a.f2284a.v(this.c);
        this.b.d("onRequestIntegrityToken", new java.lang.Object[0]);
        com.google.android.gms.common.api.ApiException apiExceptionA = this.f2283a.e.a(bundle);
        if (apiExceptionA != null) {
            this.c.trySetException(apiExceptionA);
            return;
        }
        java.lang.String string = bundle.getString("token");
        if (string == null) {
            this.c.trySetException(new com.google.android.play.core.integrity.IntegrityServiceException(-100, null));
            return;
        }
        com.google.android.play.core.integrity.ah ahVar = new com.google.android.play.core.integrity.ah(this, this.f2283a.c, bundle.getLong("request.token.sid"));
        com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource = this.c;
        com.google.android.play.core.integrity.a aVar = new com.google.android.play.core.integrity.a();
        aVar.b(string);
        aVar.a(ahVar);
        taskCompletionSource.trySetResult(aVar.c());
    }
}
