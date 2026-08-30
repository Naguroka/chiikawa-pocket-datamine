package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class v extends com.google.android.play.core.assetpacks.internal.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ android.os.IBinder f2254a;
    final /* synthetic */ com.google.android.play.core.assetpacks.internal.y b;

    v(com.google.android.play.core.assetpacks.internal.y yVar, android.os.IBinder iBinder) {
        this.b = yVar;
        this.f2254a = iBinder;
    }

    @Override // com.google.android.play.core.assetpacks.internal.p
    public final void a() {
        this.b.f2256a.n = com.google.android.play.core.assetpacks.internal.e.b(this.f2254a);
        com.google.android.play.core.assetpacks.internal.z.q(this.b.f2256a);
        this.b.f2256a.h = false;
        java.util.Iterator it = this.b.f2256a.e.iterator();
        while (it.hasNext()) {
            ((java.lang.Runnable) it.next()).run();
        }
        this.b.f2256a.e.clear();
    }
}
