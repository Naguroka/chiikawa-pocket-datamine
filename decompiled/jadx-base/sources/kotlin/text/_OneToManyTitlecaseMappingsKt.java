package kotlin.text;

/* JADX INFO: compiled from: _OneToManyTitlecaseMappings.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\f\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, d2 = {"titlecaseImpl", "", "", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class _OneToManyTitlecaseMappingsKt {
    public static final java.lang.String titlecaseImpl(char c) {
        java.lang.String strValueOf = java.lang.String.valueOf(c);
        kotlin.jvm.internal.Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        java.lang.String upperCase = strValueOf.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        if (upperCase.length() <= 1) {
            return java.lang.String.valueOf(java.lang.Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(upperCase, "null cannot be cast to non-null type java.lang.String");
        java.lang.String strSubstring = upperCase.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        java.lang.String lowerCase = strSubstring.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }
}
