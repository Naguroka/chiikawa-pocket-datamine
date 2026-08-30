package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
final class y implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.core.assetpacks.internal.z f2256a;

    /* synthetic */ y(com.google.android.play.core.assetpacks.internal.z zVar, com.google.android.play.core.assetpacks.internal.x xVar) {
        this.f2256a = zVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.f2256a.c.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f2256a.c().post(new com.google.android.play.core.assetpacks.internal.v(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f2256a.c.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f2256a.c().post(new com.google.android.play.core.assetpacks.internal.w(this));
    }
}
