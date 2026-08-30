package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
class bi extends com.google.android.play.integrity.internal.j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.gms.tasks.TaskCompletionSource f2305a;
    final /* synthetic */ com.google.android.play.core.integrity.bn b;

    bi(com.google.android.play.core.integrity.bn bnVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.b = bnVar;
        this.f2305a = taskCompletionSource;
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void b(android.os.Bundle bundle) throws android.os.RemoteException {
        this.b.f2307a.v(this.f2305a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void c(android.os.Bundle bundle) throws android.os.RemoteException {
        this.b.f2307a.v(this.f2305a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public final void d(android.os.Bundle bundle) throws android.os.RemoteException {
        this.b.f2307a.v(this.f2305a);
    }

    @Override // com.google.android.play.integrity.internal.k
    public void e(android.os.Bundle bundle) throws android.os.RemoteException {
        this.b.f2307a.v(this.f2305a);
    }
}
