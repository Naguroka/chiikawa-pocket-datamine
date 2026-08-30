package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class t extends com.google.android.play.core.assetpacks.internal.p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.core.assetpacks.internal.z f2253a;

    t(com.google.android.play.core.assetpacks.internal.z zVar) {
        this.f2253a = zVar;
    }

    @Override // com.google.android.play.core.assetpacks.internal.p
    public final void a() {
        synchronized (this.f2253a.g) {
            if (this.f2253a.l.get() > 0 && this.f2253a.l.decrementAndGet() > 0) {
                this.f2253a.c.d("Leaving the connection open for other ongoing calls.", new java.lang.Object[0]);
                return;
            }
            com.google.android.play.core.assetpacks.internal.z zVar = this.f2253a;
            if (zVar.n != null) {
                zVar.c.d("Unbind from service.", new java.lang.Object[0]);
                com.google.android.play.core.assetpacks.internal.z zVar2 = this.f2253a;
                zVar2.b.unbindService(zVar2.m);
                this.f2253a.h = false;
                this.f2253a.n = null;
                this.f2253a.m = null;
            }
            this.f2253a.w();
        }
    }
}
