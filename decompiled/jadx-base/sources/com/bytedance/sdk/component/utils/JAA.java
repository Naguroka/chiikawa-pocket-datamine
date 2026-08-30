package com.bytedance.sdk.component.utils;

/* JADX INFO: loaded from: classes3.dex */
public class JAA extends android.os.Handler {
    protected java.lang.ref.WeakReference<com.bytedance.sdk.component.utils.JAA.bg> bg;

    public interface bg {
        void bg(android.os.Message message);
    }

    public JAA(com.bytedance.sdk.component.utils.JAA.bg bgVar) {
        if (bgVar != null) {
            this.bg = new java.lang.ref.WeakReference<>(bgVar);
        }
    }

    public JAA(android.os.Looper looper, com.bytedance.sdk.component.utils.JAA.bg bgVar) {
        super(looper);
        if (bgVar != null) {
            this.bg = new java.lang.ref.WeakReference<>(bgVar);
        }
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        com.bytedance.sdk.component.utils.JAA.bg bgVar;
        java.lang.ref.WeakReference<com.bytedance.sdk.component.utils.JAA.bg> weakReference = this.bg;
        if (weakReference == null || (bgVar = weakReference.get()) == null || message == null) {
            return;
        }
        bgVar.bg(message);
    }
}
