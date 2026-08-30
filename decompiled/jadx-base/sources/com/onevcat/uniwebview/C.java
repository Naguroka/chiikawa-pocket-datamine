package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public final class C extends com.onevcat.uniwebview.D {
    /* JADX WARN: Illegal instructions before constructor call */
    public C(java.lang.String webViewName, java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(webViewName, "webViewName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        java.lang.String string = new org.json.JSONObject(kotlin.collections.MapsKt.mapOf(kotlin.TuplesKt.to("url", url))).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "obj.toString()");
        super(webViewName, "ShouldUniWebViewHandleRequest", string);
    }
}
