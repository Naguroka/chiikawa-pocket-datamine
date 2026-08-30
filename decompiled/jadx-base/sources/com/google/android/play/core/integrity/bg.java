package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bg extends com.google.android.play.core.integrity.bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ java.lang.String f2303a;
    final /* synthetic */ long b;
    final /* synthetic */ long c;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource d;
    final /* synthetic */ com.google.android.play.core.integrity.bn e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bg(com.google.android.play.core.integrity.bn bnVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, int i, java.lang.String str, long j, long j2, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.e = bnVar;
        this.f2303a = str;
        this.b = j;
        this.c = j2;
        this.d = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        if (com.google.android.play.core.integrity.bn.k(this.e)) {
            super.a(new com.google.android.play.core.integrity.StandardIntegrityException(-2, null));
            return;
        }
        try {
            com.google.android.play.core.integrity.bn bnVar = this.e;
            ((com.google.android.play.integrity.internal.i) bnVar.f2307a.e()).d(com.google.android.play.core.integrity.bn.a(bnVar, this.f2303a, this.b, this.c, 0), new com.google.android.play.core.integrity.bk(this.e, this.d, this.b));
        } catch (android.os.RemoteException e) {
            this.e.b.c(e, "requestExpressIntegrityToken(%s, %s)", this.f2303a, java.lang.Long.valueOf(this.b));
            this.d.trySetException(new com.google.android.play.core.integrity.StandardIntegrityException(-100, e));
        }
    }
}
