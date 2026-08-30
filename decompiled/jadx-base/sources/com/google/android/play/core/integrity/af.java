package com.google.android.play.core.integrity;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class af extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ byte[] f2280a;
    final /* synthetic */ java.lang.Long b;
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource c;
    final /* synthetic */ com.google.android.play.core.integrity.IntegrityTokenRequest d;
    final /* synthetic */ com.google.android.play.core.integrity.aj e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    af(com.google.android.play.core.integrity.aj ajVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, byte[] bArr, java.lang.Long l, android.os.Parcelable parcelable, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2, com.google.android.play.core.integrity.IntegrityTokenRequest integrityTokenRequest) {
        super(taskCompletionSource);
        this.e = ajVar;
        this.f2280a = bArr;
        this.b = l;
        this.c = taskCompletionSource2;
        this.d = integrityTokenRequest;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void a(java.lang.Exception exc) {
        if (exc instanceof com.google.android.play.integrity.internal.af) {
            super.a(new com.google.android.play.core.integrity.IntegrityServiceException(-9, exc));
        } else {
            super.a(exc);
        }
    }

    @Override // com.google.android.play.integrity.internal.t
    protected final void b() {
        try {
            ((com.google.android.play.integrity.internal.n) this.e.f2284a.e()).d(com.google.android.play.core.integrity.aj.a(this.e, this.f2280a, this.b, null), new com.google.android.play.core.integrity.ai(this.e, this.c));
        } catch (android.os.RemoteException e) {
            this.e.b.c(e, "requestIntegrityToken(%s)", this.d);
            this.c.trySetException(new com.google.android.play.core.integrity.IntegrityServiceException(-100, e));
        }
    }
}
