package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class w extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.gms.tasks.TaskCompletionSource f2342a;
    final /* synthetic */ com.google.android.play.integrity.internal.t b;
    final /* synthetic */ com.google.android.play.integrity.internal.ae c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    w(com.google.android.play.integrity.internal.ae aeVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource2, com.google.android.play.integrity.internal.t tVar) {
        super(taskCompletionSource);
        this.c = aeVar;
        this.f2342a = taskCompletionSource2;
        this.b = tVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.c.g) {
            com.google.android.play.integrity.internal.ae.o(this.c, this.f2342a);
            if (this.c.m.getAndIncrement() > 0) {
                this.c.c.d("Already connected to the service.", new java.lang.Object[0]);
            }
            com.google.android.play.integrity.internal.ae.q(this.c, this.b);
        }
    }
}
