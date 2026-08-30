package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
class al extends com.google.android.play.core.assetpacks.internal.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.google.android.gms.tasks.TaskCompletionSource f2141a;
    final /* synthetic */ com.google.android.play.core.assetpacks.aw b;

    al(com.google.android.play.core.assetpacks.aw awVar, com.google.android.gms.tasks.TaskCompletionSource taskCompletionSource) {
        this.b = awVar;
        this.f2141a = taskCompletionSource;
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public final void b(int i, android.os.Bundle bundle) {
        this.b.f.u(this.f2141a);
        com.google.android.play.core.assetpacks.aw.f2142a.d("onCancelDownload(%d)", java.lang.Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public final void c(android.os.Bundle bundle) {
        this.b.f.u(this.f2141a);
        com.google.android.play.core.assetpacks.aw.f2142a.d("onCancelDownloads()", new java.lang.Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public void d(android.os.Bundle bundle) {
        this.b.f.u(this.f2141a);
        int i = bundle.getInt("error_code");
        com.google.android.play.core.assetpacks.aw.f2142a.b("onError(%d)", java.lang.Integer.valueOf(i));
        this.f2141a.trySetException(new com.google.android.play.core.assetpacks.AssetPackException(i));
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public void e(android.os.Bundle bundle, android.os.Bundle bundle2) throws android.os.RemoteException {
        this.b.f.u(this.f2141a);
        com.google.android.play.core.assetpacks.aw.f2142a.d("onGetChunkFileDescriptor", new java.lang.Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public final void f(int i, android.os.Bundle bundle) {
        this.b.f.u(this.f2141a);
        com.google.android.play.core.assetpacks.aw.f2142a.d("onGetSession(%d)", java.lang.Integer.valueOf(i));
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public void g(java.util.List list) {
        this.b.f.u(this.f2141a);
        com.google.android.play.core.assetpacks.aw.f2142a.d("onGetSessionStates", new java.lang.Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public void h(android.os.Bundle bundle, android.os.Bundle bundle2) {
        this.b.g.u(this.f2141a);
        com.google.android.play.core.assetpacks.aw.f2142a.d("onKeepAlive(%b)", java.lang.Boolean.valueOf(bundle.getBoolean("keep_alive")));
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public final void i(android.os.Bundle bundle, android.os.Bundle bundle2) {
        this.b.f.u(this.f2141a);
        com.google.android.play.core.assetpacks.aw.f2142a.d("onNotifyChunkTransferred(%s, %s, %d, session=%d)", bundle.getString("module_name"), bundle.getString("slice_id"), java.lang.Integer.valueOf(bundle.getInt("chunk_number")), java.lang.Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public final void j(android.os.Bundle bundle, android.os.Bundle bundle2) {
        this.b.f.u(this.f2141a);
        com.google.android.play.core.assetpacks.aw.f2142a.d("onNotifyModuleCompleted(%s, sessionId=%d)", bundle.getString("module_name"), java.lang.Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public final void k(android.os.Bundle bundle, android.os.Bundle bundle2) {
        this.b.f.u(this.f2141a);
        com.google.android.play.core.assetpacks.aw.f2142a.d("onNotifySessionFailed(%d)", java.lang.Integer.valueOf(bundle.getInt("session_id")));
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public final void l(android.os.Bundle bundle, android.os.Bundle bundle2) {
        this.b.f.u(this.f2141a);
        com.google.android.play.core.assetpacks.aw.f2142a.d("onRemoveModule()", new java.lang.Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public void m(android.os.Bundle bundle, android.os.Bundle bundle2) {
        this.b.f.u(this.f2141a);
        com.google.android.play.core.assetpacks.aw.f2142a.d("onRequestDownloadInfo()", new java.lang.Object[0]);
    }

    @Override // com.google.android.play.core.assetpacks.internal.h
    public void n(int i, android.os.Bundle bundle) {
        this.b.f.u(this.f2141a);
        com.google.android.play.core.assetpacks.aw.f2142a.d("onStartDownload(%d)", java.lang.Integer.valueOf(i));
    }
}
