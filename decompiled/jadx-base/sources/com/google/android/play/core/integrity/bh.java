package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bh extends com.google.android.play.core.integrity.bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.os.Bundle f2304a;
    final /* synthetic */ android.app.Activity b;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource c;
    final /* synthetic */ int d;
    final /* synthetic */ com.google.android.play.core.integrity.bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bh(com.google.android.play.core.integrity.bn bnVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, android.os.Bundle bundle, android.app.Activity activity, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2, int i) {
        super(bnVar, taskCompletionSource);
        this.e = bnVar;
        this.f2304a = bundle;
        this.b = activity;
        this.c = taskCompletionSource2;
        this.d = i;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        if (com.google.android.play.core.integrity.bn.k(this.e)) {
            super.a(new com.google.android.play.core.integrity.StandardIntegrityException(-2, null));
            return;
        }
        try {
            com.google.android.play.core.integrity.bn bnVar = this.e;
            com.google.android.play.integrity.internal.ae aeVar = bnVar.f2307a;
            ((com.google.android.play.integrity.internal.i) aeVar.e()).c(this.f2304a, bnVar.e.a(this.b, this.c, aeVar));
        } catch (android.os.RemoteException e) {
            this.e.b.c(e, "requestAndShowDialog(%s)", java.lang.Integer.valueOf(this.d));
            this.c.trySetException(new com.google.android.play.core.integrity.StandardIntegrityException(-100, e));
        }
    }
}
