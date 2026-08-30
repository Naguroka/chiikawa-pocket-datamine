package com.bytedance.sdk.component.Kg.bg;

/* JADX INFO: loaded from: classes3.dex */
public class IL extends com.bytedance.sdk.component.utils.JAA implements com.bytedance.sdk.component.Kg.bg.bX {
    private final android.os.HandlerThread IL;

    IL(android.os.HandlerThread handlerThread, com.bytedance.sdk.component.utils.JAA.bg bgVar) {
        super(handlerThread.getLooper(), bgVar);
        this.IL = handlerThread;
    }

    @Override // com.bytedance.sdk.component.Kg.bg.bX
    public void bg() {
        removeCallbacksAndMessages(null);
        if (this.bg != null) {
            this.bg.clear();
            this.bg = null;
        }
    }

    public void bg(com.bytedance.sdk.component.utils.JAA.bg bgVar) {
        this.bg = new java.lang.ref.WeakReference<>(bgVar);
    }

    public void IL() {
        android.os.HandlerThread handlerThread = this.IL;
        if (handlerThread != null) {
            handlerThread.quit();
        }
    }
}
