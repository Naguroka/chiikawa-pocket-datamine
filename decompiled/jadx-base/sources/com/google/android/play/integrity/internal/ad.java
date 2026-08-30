package com.google.android.play.integrity.internal;

/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes5.dex */
final class ad implements android.content.ServiceConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.android.play.integrity.internal.ae f2331a;

    /* synthetic */ ad(com.google.android.play.integrity.internal.ae aeVar, com.google.android.play.integrity.internal.ac acVar) {
        this.f2331a = aeVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        this.f2331a.c.d("ServiceConnectionImpl.onServiceConnected(%s)", componentName);
        this.f2331a.c().post(new com.google.android.play.integrity.internal.aa(this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(android.content.ComponentName componentName) {
        this.f2331a.c.d("ServiceConnectionImpl.onServiceDisconnected(%s)", componentName);
        this.f2331a.c().post(new com.google.android.play.integrity.internal.ab(this));
    }
}
