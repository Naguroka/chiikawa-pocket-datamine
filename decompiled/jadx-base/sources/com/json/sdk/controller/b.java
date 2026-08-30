package com.json.sdk.controller;

/* JADX INFO: loaded from: classes5.dex */
class b {
    private static final java.lang.String b = "b";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.ironsource.sdk.controller.v.r f3288a;

    b(com.ironsource.sdk.controller.v.r rVar) {
        this.f3288a = rVar;
    }

    void a(java.lang.String str) {
        com.ironsource.sdk.controller.v.r rVar = this.f3288a;
        if (rVar != null) {
            rVar.c(str);
        }
    }

    synchronized void a(java.lang.String str, java.lang.String str2) throws java.lang.Exception {
        if (this.f3288a == null) {
            com.json.sdk.utils.Logger.e(b, "!!! nativeAPI == null !!!");
            return;
        }
        java.lang.reflect.Method declaredMethod = com.ironsource.sdk.controller.v.r.class.getDeclaredMethod(str, java.lang.String.class);
        if (!declaredMethod.isAnnotationPresent(android.webkit.JavascriptInterface.class)) {
            throw new java.security.AccessControlException("Trying to access a private function: " + str);
        }
        declaredMethod.invoke(this.f3288a, str2);
    }
}
