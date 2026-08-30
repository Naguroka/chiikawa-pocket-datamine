package com.onevcat.uniwebview;

/* JADX INFO: loaded from: classes5.dex */
public abstract class U {
    public static com.onevcat.uniwebview.C1563m a(java.lang.String dataUrl) throws java.io.UnsupportedEncodingException {
        byte[] data;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataUrl, "dataUrl");
        kotlin.text.MatchResult matchResultMatchEntire = new kotlin.text.Regex("^data:([-\\w]+/[-+\\w.]+)?(;?\\w+=[-\\w]+)*(;base64)?,(.*)").matchEntire(dataUrl);
        if (matchResultMatchEntire == null) {
            return null;
        }
        java.lang.String str = matchResultMatchEntire.getGroupValues().get(1);
        boolean zAreEqual = kotlin.jvm.internal.Intrinsics.areEqual(";base64", matchResultMatchEntire.getGroupValues().get(3));
        java.lang.String str2 = matchResultMatchEntire.getGroupValues().get(4);
        if (zAreEqual) {
            data = android.util.Base64.decode(str2, 0);
        } else {
            java.lang.String strDecode = java.net.URLDecoder.decode(str2, java.nio.charset.StandardCharsets.UTF_8.name());
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strDecode, "decode(dataString, StandardCharsets.UTF_8.name())");
            data = strDecode.getBytes(kotlin.text.Charsets.UTF_8);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "this as java.lang.String).getBytes(charset)");
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(data, "data");
        return new com.onevcat.uniwebview.C1563m(str, data);
    }
}
