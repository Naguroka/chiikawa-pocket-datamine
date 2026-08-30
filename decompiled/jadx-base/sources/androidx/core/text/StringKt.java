package androidx.core.text;

/* JADX INFO: compiled from: String.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\r\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\u0086\b¨\u0006\u0002"}, d2 = {"htmlEncode", "", "core-ktx_release"}, k = 2, mv = {1, 7, 1}, xi = 48)
public final class StringKt {
    public static final java.lang.String htmlEncode(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.lang.String strHtmlEncode = android.text.TextUtils.htmlEncode(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strHtmlEncode, "htmlEncode(this)");
        return strHtmlEncode;
    }
}
