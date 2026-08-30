package com.bytedance.sdk.component.adexpress.zx;

/* JADX INFO: loaded from: classes3.dex */
public class eqN {
    private java.lang.ref.WeakReference<com.bytedance.sdk.component.bg.Ja> bg;

    public eqN(com.bytedance.sdk.component.bg.Ja ja) {
        this.bg = new java.lang.ref.WeakReference<>(ja);
    }

    public void bg(com.bytedance.sdk.component.bg.Ja ja) {
        this.bg = new java.lang.ref.WeakReference<>(ja);
    }

    @android.webkit.JavascriptInterface
    public void invokeMethod(java.lang.String str) {
        java.lang.ref.WeakReference<com.bytedance.sdk.component.bg.Ja> weakReference = this.bg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.bg.get().invokeMethod(str);
    }
}
