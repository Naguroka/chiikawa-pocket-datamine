package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private com.json.sdk.controller.s f3349a;
    private boolean b = false;

    r(com.json.sdk.controller.s sVar) {
        this.f3349a = sVar;
    }

    @android.webkit.JavascriptInterface
    public java.lang.String getTokenForMessaging() {
        if (this.b) {
            return "";
        }
        this.b = true;
        return this.f3349a.b();
    }
}
