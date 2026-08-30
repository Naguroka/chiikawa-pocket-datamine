package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: CharJVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00004\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0001\u001a\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0000\u001a\r\u0010\u000e\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0010\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0011\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0012\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0013\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0016\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0018\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u0019\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u001a\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\r\u0010\u001b\u001a\u00020\u000f*\u00020\u0002H\u0087\b\u001a\n\u0010\u001c\u001a\u00020\u000f*\u00020\u0002\u001a\r\u0010\u001d\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0014\u0010\u001d\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010!\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0014\u0010\"\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010#\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010$\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010%\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010&\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\r\u0010'\u001a\u00020\u001e*\u00020\u0002H\u0087\b\u001a\u0014\u0010'\u001a\u00020\u001e*\u00020\u00022\u0006\u0010\u001f\u001a\u00020 H\u0007\u001a\r\u0010(\u001a\u00020\u0002*\u00020\u0002H\u0087\b\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0015\u0010\u0005\u001a\u00020\u0006*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006)"}, d2 = {"category", "Lkotlin/text/CharCategory;", "", "getCategory", "(C)Lkotlin/text/CharCategory;", "directionality", "Lkotlin/text/CharDirectionality;", "getDirectionality", "(C)Lkotlin/text/CharDirectionality;", "checkRadix", "", "radix", "digitOf", "char", "isDefined", "", "isDigit", "isHighSurrogate", "isISOControl", "isIdentifierIgnorable", "isJavaIdentifierPart", "isJavaIdentifierStart", "isLetter", "isLetterOrDigit", "isLowSurrogate", "isLowerCase", "isTitleCase", "isUpperCase", "isWhitespace", "lowercase", "", "locale", "Ljava/util/Locale;", "lowercaseChar", "titlecase", "titlecaseChar", "toLowerCase", "toTitleCase", "toUpperCase", "uppercase", "uppercaseChar", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/CharsKt")
public class CharsKt__CharJVMKt {
    public static final kotlin.text.CharCategory getCategory(char c) {
        return kotlin.text.CharCategory.INSTANCE.valueOf(java.lang.Character.getType(c));
    }

    private static final boolean isDefined(char c) {
        return java.lang.Character.isDefined(c);
    }

    private static final boolean isLetter(char c) {
        return java.lang.Character.isLetter(c);
    }

    private static final boolean isLetterOrDigit(char c) {
        return java.lang.Character.isLetterOrDigit(c);
    }

    private static final boolean isDigit(char c) {
        return java.lang.Character.isDigit(c);
    }

    private static final boolean isIdentifierIgnorable(char c) {
        return java.lang.Character.isIdentifierIgnorable(c);
    }

    private static final boolean isISOControl(char c) {
        return java.lang.Character.isISOControl(c);
    }

    private static final boolean isJavaIdentifierPart(char c) {
        return java.lang.Character.isJavaIdentifierPart(c);
    }

    private static final boolean isJavaIdentifierStart(char c) {
        return java.lang.Character.isJavaIdentifierStart(c);
    }

    public static final boolean isWhitespace(char c) {
        return java.lang.Character.isWhitespace(c) || java.lang.Character.isSpaceChar(c);
    }

    private static final boolean isUpperCase(char c) {
        return java.lang.Character.isUpperCase(c);
    }

    private static final boolean isLowerCase(char c) {
        return java.lang.Character.isLowerCase(c);
    }

    @kotlin.Deprecated(message = "Use uppercaseChar() instead.", replaceWith = @kotlin.ReplaceWith(expression = "uppercaseChar()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final char toUpperCase(char c) {
        return java.lang.Character.toUpperCase(c);
    }

    private static final char uppercaseChar(char c) {
        return java.lang.Character.toUpperCase(c);
    }

    private static final java.lang.String uppercase(char c) {
        java.lang.String strValueOf = java.lang.String.valueOf(c);
        kotlin.jvm.internal.Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        java.lang.String upperCase = strValueOf.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    public static final java.lang.String uppercase(char c, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        java.lang.String strValueOf = java.lang.String.valueOf(c);
        kotlin.jvm.internal.Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        java.lang.String upperCase = strValueOf.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @kotlin.Deprecated(message = "Use lowercaseChar() instead.", replaceWith = @kotlin.ReplaceWith(expression = "lowercaseChar()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final char toLowerCase(char c) {
        return java.lang.Character.toLowerCase(c);
    }

    private static final char lowercaseChar(char c) {
        return java.lang.Character.toLowerCase(c);
    }

    private static final java.lang.String lowercase(char c) {
        java.lang.String strValueOf = java.lang.String.valueOf(c);
        kotlin.jvm.internal.Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        java.lang.String lowerCase = strValueOf.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final java.lang.String lowercase(char c, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        java.lang.String strValueOf = java.lang.String.valueOf(c);
        kotlin.jvm.internal.Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
        java.lang.String lowerCase = strValueOf.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private static final boolean isTitleCase(char c) {
        return java.lang.Character.isTitleCase(c);
    }

    @kotlin.Deprecated(message = "Use titlecaseChar() instead.", replaceWith = @kotlin.ReplaceWith(expression = "titlecaseChar()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final char toTitleCase(char c) {
        return java.lang.Character.toTitleCase(c);
    }

    private static final char titlecaseChar(char c) {
        return java.lang.Character.toTitleCase(c);
    }

    public static final java.lang.String titlecase(char c, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        java.lang.String strUppercase = kotlin.text.CharsKt.uppercase(c, locale);
        if (strUppercase.length() <= 1) {
            java.lang.String strValueOf = java.lang.String.valueOf(c);
            kotlin.jvm.internal.Intrinsics.checkNotNull(strValueOf, "null cannot be cast to non-null type java.lang.String");
            java.lang.String upperCase = strValueOf.toUpperCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            return !kotlin.jvm.internal.Intrinsics.areEqual(strUppercase, upperCase) ? strUppercase : java.lang.String.valueOf(java.lang.Character.toTitleCase(c));
        }
        if (c == 329) {
            return strUppercase;
        }
        char cCharAt = strUppercase.charAt(0);
        kotlin.jvm.internal.Intrinsics.checkNotNull(strUppercase, "null cannot be cast to non-null type java.lang.String");
        java.lang.String strSubstring = strUppercase.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        java.lang.String lowerCase = strSubstring.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return cCharAt + lowerCase;
    }

    public static final kotlin.text.CharDirectionality getDirectionality(char c) {
        return kotlin.text.CharDirectionality.INSTANCE.valueOf(java.lang.Character.getDirectionality(c));
    }

    private static final boolean isHighSurrogate(char c) {
        return java.lang.Character.isHighSurrogate(c);
    }

    private static final boolean isLowSurrogate(char c) {
        return java.lang.Character.isLowSurrogate(c);
    }

    public static final int digitOf(char c, int i) {
        return java.lang.Character.digit((int) c, i);
    }

    public static final int checkRadix(int i) {
        if (new kotlin.ranges.IntRange(2, 36).contains(i)) {
            return i;
        }
        throw new java.lang.IllegalArgumentException("radix " + i + " was not in valid range " + new kotlin.ranges.IntRange(2, 36));
    }
}
