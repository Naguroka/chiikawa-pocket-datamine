package com.bytedance.sdk.component.adexpress.zx;

/* JADX INFO: loaded from: classes3.dex */
public class bX {
    private java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.zx.IL> bg;

    public bX(com.bytedance.sdk.component.adexpress.zx.IL il) {
        this.bg = new java.lang.ref.WeakReference<>(il);
    }

    public void bg(com.bytedance.sdk.component.adexpress.zx.IL il) {
        this.bg = new java.lang.ref.WeakReference<>(il);
    }

    @android.webkit.JavascriptInterface
    public java.lang.String adInfo() {
        java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.zx.IL> weakReference = this.bg;
        return (weakReference == null || weakReference.get() == null) ? "" : this.bg.get().adInfo();
    }

    @android.webkit.JavascriptInterface
    public java.lang.String appInfo() {
        java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.zx.IL> weakReference = this.bg;
        return (weakReference == null || weakReference.get() == null) ? "" : this.bg.get().appInfo();
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getTemplateInfo() {
        java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.zx.IL> weakReference = this.bg;
        return (weakReference == null || weakReference.get() == null) ? "" : this.bg.get().getTemplateInfo();
    }

    @android.webkit.JavascriptInterface
    public void renderDidFinish(java.lang.String str) {
        java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.zx.IL> weakReference = this.bg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.bg.get().renderDidFinish(str);
    }

    @android.webkit.JavascriptInterface
    public void adAnalysisData(java.lang.String str) {
        java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.zx.IL> weakReference = this.bg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.bg.get();
    }

    @android.webkit.JavascriptInterface
    public void muteVideo(java.lang.String str) {
        java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.zx.IL> weakReference = this.bg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.bg.get().muteVideo(str);
    }

    @android.webkit.JavascriptInterface
    public void dynamicTrack(java.lang.String str) {
        java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.zx.IL> weakReference = this.bg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.bg.get().dynamicTrack(str);
    }

    @android.webkit.JavascriptInterface
    public void changeVideoState(java.lang.String str) {
        java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.zx.IL> weakReference = this.bg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.bg.get().changeVideoState(str);
    }

    @android.webkit.JavascriptInterface
    public void clickEvent(java.lang.String str) {
        java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.zx.IL> weakReference = this.bg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.bg.get().clickEvent(str);
    }

    @android.webkit.JavascriptInterface
    public void skipVideo() {
        java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.zx.IL> weakReference = this.bg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.bg.get().skipVideo();
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getCurrentVideoState() {
        java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.zx.IL> weakReference = this.bg;
        return (weakReference == null || weakReference.get() == null) ? "" : this.bg.get().getCurrentVideoState();
    }

    @android.webkit.JavascriptInterface
    public void initRenderFinish() {
        java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.zx.IL> weakReference = this.bg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.bg.get().initRenderFinish();
    }

    @android.webkit.JavascriptInterface
    public void requestPauseVideo(java.lang.String str) {
        java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.zx.IL> weakReference = this.bg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.bg.get().bg(str);
    }

    @android.webkit.JavascriptInterface
    public void chooseAdResult(java.lang.String str) {
        java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.zx.IL> weakReference = this.bg;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.bg.get().chooseAdResult(str);
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getData(java.lang.String str) {
        java.lang.ref.WeakReference<com.bytedance.sdk.component.adexpress.zx.IL> weakReference = this.bg;
        return (weakReference == null || weakReference.get() == null) ? "" : this.bg.get().getData(str);
    }
}
