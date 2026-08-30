package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class x extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.integrity.internal.ae f2343a;

    x(com.google.android.play.integrity.internal.ae aeVar) {
        this.f2343a = aeVar;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        synchronized (this.f2343a.g) {
            if (this.f2343a.m.get() > 0 && this.f2343a.m.decrementAndGet() > 0) {
                this.f2343a.c.d("Leaving the connection open for other ongoing calls.", new java.lang.Object[0]);
                return;
            }
            com.google.android.play.integrity.internal.ae aeVar = this.f2343a;
            if (aeVar.o != null) {
                aeVar.c.d("Unbind from service.", new java.lang.Object[0]);
                com.google.android.play.integrity.internal.ae aeVar2 = this.f2343a;
                aeVar2.b.unbindService(aeVar2.n);
                this.f2343a.h = false;
                this.f2343a.o = null;
                this.f2343a.n = null;
            }
            this.f2343a.x();
        }
    }
}
