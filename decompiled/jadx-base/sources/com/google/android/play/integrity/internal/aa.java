package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class aa extends com.google.android.play.integrity.internal.t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.os.IBinder f2329a;
    final /* synthetic */ com.google.android.play.integrity.internal.ad b;

    aa(com.google.android.play.integrity.internal.ad adVar, android.os.IBinder iBinder) {
        this.b = adVar;
        this.f2329a = iBinder;
    }

    @Override // com.google.android.play.integrity.internal.t
    public final void b() {
        this.b.f2331a.o = (android.os.IInterface) this.b.f2331a.j.a(this.f2329a);
        com.google.android.play.integrity.internal.ae.r(this.b.f2331a);
        this.b.f2331a.h = false;
        java.util.Iterator it = this.b.f2331a.e.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        this.b.f2331a.e.clear();
    }
}
