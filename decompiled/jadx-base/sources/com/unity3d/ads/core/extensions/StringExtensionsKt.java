package com.unity3d.ads.core.extensions;

/* JADX INFO: compiled from: StringExtensions.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0001¨\u0006\u0002"}, d2 = {"getSHA256Hash", "", "unity-ads_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class StringExtensionsKt {
    public static final java.lang.String getSHA256Hash(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        java.lang.String strHex = okio.ByteString.of(java.util.Arrays.copyOf(bytes, bytes.length)).sha256().hex();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strHex, "bytes.sha256().hex()");
        return strHex;
    }
}
