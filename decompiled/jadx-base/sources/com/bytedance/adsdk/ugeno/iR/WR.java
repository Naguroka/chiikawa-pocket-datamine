package com.bytedance.adsdk.ugeno.iR;

/* JADX INFO: loaded from: classes3.dex */
public class WR extends android.os.Handler {
    private final java.lang.ref.WeakReference<com.bytedance.adsdk.ugeno.iR.WR.bg> bg;

    public interface bg {
        void bg(android.os.Message message);
    }

    public WR(android.os.Looper looper, com.bytedance.adsdk.ugeno.iR.WR.bg bgVar) {
        super(looper);
        this.bg = new java.lang.ref.WeakReference<>(bgVar);
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        com.bytedance.adsdk.ugeno.iR.WR.bg bgVar = this.bg.get();
        if (bgVar == null || message == null) {
            return;
        }
        bgVar.bg(message);
    }
}
