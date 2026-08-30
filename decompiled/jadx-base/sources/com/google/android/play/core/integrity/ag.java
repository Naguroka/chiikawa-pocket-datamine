package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ag extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.os.Bundle f2281a;
    final /* synthetic */ android.app.Activity b;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ com.google.android.play.core.integrity.aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ag(com.google.android.play.core.integrity.aj ajVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, android.os.Bundle bundle, android.app.Activity activity, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2, int i) {
        super(taskCompletionSource);
        this.e = ajVar;
        this.f2281a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        try {
            com.google.android.play.integrity.internal.n nVar = (com.google.android.play.integrity.internal.n) this.e.f2284a.e();
            android.os.Bundle bundle = this.f2281a;
            com.google.android.play.core.integrity.aj ajVar = this.e;
            nVar.c(bundle, ajVar.d.a(this.b, this.c, ajVar.f2284a));
        } catch (android.os.RemoteException e) {
            this.e.b.c(e, "requestAndShowDialog(%s)", java.lang.Integer.valueOf(this.d));
            this.c.trySetException(new com.google.android.play.core.integrity.IntegrityServiceException(-100, e));
        }
    }
}
