package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class sg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.vg f3407a;

    sg(com.json.vg vgVar) {
        this.f3407a = vgVar;
    }

    @android.webkit.JavascriptInterface
    public void receiveMessageFromExternal(java.lang.String str) {
        this.f3407a.handleMessageFromAd(str);
    }
}
