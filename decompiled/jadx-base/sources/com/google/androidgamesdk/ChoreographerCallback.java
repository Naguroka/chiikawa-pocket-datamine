package com.google.androidgamesdk;

/* JADX INFO: loaded from: classes5.dex */
public class ChoreographerCallback implements android.view.Choreographer.FrameCallback {
    private static final java.lang.String LOG_TAG = "ChoreographerCallback";
    private long mCookie;
    private com.google.androidgamesdk.b mLooper;

    public ChoreographerCallback(long j) {
        this.mCookie = j;
        com.google.androidgamesdk.b bVar = new com.google.androidgamesdk.b();
        this.mLooper = bVar;
        bVar.start();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        nOnChoreographer(this.mCookie, j);
    }

    public native void nOnChoreographer(long j, long j2);

    public void postFrameCallback() {
        this.mLooper.f2345a.post(new com.google.androidgamesdk.a(this));
    }

    public void postFrameCallbackDelayed(long j) {
        android.view.Choreographer.getInstance().postFrameCallbackDelayed(this, j);
    }

    public void terminate() {
        this.mLooper.f2345a.getLooper().quit();
    }
}
