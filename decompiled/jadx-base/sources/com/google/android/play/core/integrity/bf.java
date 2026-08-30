package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class bf extends com.google.android.play.core.integrity.bm {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ long f2302a;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource b;
    final /* synthetic */ com.google.android.play.core.integrity.bn c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    bf(com.google.android.play.core.integrity.bn bnVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, int i, long j, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2) {
        super(bnVar, taskCompletionSource);
        this.c = bnVar;
        this.f2302a = j;
        this.b = taskCompletionSource2;
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        if (com.google.android.play.core.integrity.bn.k(this.c)) {
            super.a(new com.google.android.play.core.integrity.StandardIntegrityException(-2, null));
            return;
        }
        try {
            com.google.android.play.core.integrity.bn bnVar = this.c;
            ((com.google.android.play.integrity.internal.i) bnVar.f2307a.e()).e(com.google.android.play.core.integrity.bn.b(bnVar, this.f2302a, 0), new com.google.android.play.core.integrity.bl(this.c, this.b));
        } catch (android.os.RemoteException e) {
            this.c.b.c(e, "warmUpIntegrityToken(%s)", java.lang.Long.valueOf(this.f2302a));
            this.b.trySetException(new com.google.android.play.core.integrity.StandardIntegrityException(-100, e));
        }
    }
}
