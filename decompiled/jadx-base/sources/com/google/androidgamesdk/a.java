package com.google.androidgamesdk;

/* JADX INFO: loaded from: classes5.dex */
final class a implements java.lang.Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.androidgamesdk.ChoreographerCallback f2344a;

    a(com.google.androidgamesdk.ChoreographerCallback choreographerCallback) {
        this.f2344a = choreographerCallback;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.view.Choreographer.getInstance().postFrameCallback(this.f2344a);
    }
}
