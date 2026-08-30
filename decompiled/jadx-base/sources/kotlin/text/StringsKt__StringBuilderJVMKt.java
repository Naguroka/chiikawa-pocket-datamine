package kotlin.text;

/* JADX INFO: compiled from: StringBuilderJVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\\\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0006\n\u0002\u0010\u0007\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a\u001f\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0087\b\u001a\u001d\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\nH\u0087\b\u001a%\u0010\u0000\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u000e\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0087\b\u001a-\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0087\b\u001a-\u0010\u000b\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0087\b\u001a\u0014\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012*\u00060\u0011j\u0002`\u0012H\u0007\u001a\u001d\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012*\u00060\u0011j\u0002`\u00122\u0006\u0010\u0003\u001a\u00020\u0013H\u0087\b\u001a\u001f\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012*\u00060\u0011j\u0002`\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0087\b\u001a\u0014\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u0002H\u0007\u001a\u001f\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0087\b\u001a\u001f\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0014H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0015H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0005H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0013H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\fH\u0087\b\u001a\u001f\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u000fH\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0006H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\u0007H\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\bH\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\tH\u0087\b\u001a\u001d\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0003\u001a\u00020\nH\u0087\b\u001a\u001f\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0016H\u0087\b\u001a%\u0010\u0010\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u000e\u0010\u0003\u001a\n\u0018\u00010\u0001j\u0004\u0018\u0001`\u0002H\u0087\b\u001a\u0014\u0010\u0017\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u0002H\u0007\u001a\u001d\u0010\u0018\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0019\u001a\u00020\bH\u0087\b\u001a%\u0010\u001a\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0087\b\u001a5\u0010\u001b\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0087\b\u001a5\u0010\u001b\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0087\b\u001a!\u0010\u001c\u001a\u00020\u001d*\u00060\u0001j\u0002`\u00022\u0006\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0013H\u0087\n\u001a-\u0010\u001e\u001a\u00060\u0001j\u0002`\u0002*\u00060\u0001j\u0002`\u00022\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0016H\u0087\b\u001a7\u0010\u001f\u001a\u00020\u001d*\u00060\u0001j\u0002`\u00022\u0006\u0010 \u001a\u00020\f2\b\b\u0002\u0010!\u001a\u00020\b2\b\b\u0002\u0010\r\u001a\u00020\b2\b\b\u0002\u0010\u000e\u001a\u00020\bH\u0087\b¨\u0006\""}, d2 = {"appendLine", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "value", "Ljava/lang/StringBuffer;", "", "", "", "", "", "", "appendRange", "", "startIndex", "endIndex", "", "appendln", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "", "", "", "", "clear", "deleteAt", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "deleteRange", "insertRange", "set", "", "setRange", "toCharArray", com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "destinationOffset", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt__StringBuilderJVMKt extends kotlin.text.StringsKt__RegexExtensionsKt {
    public static final java.lang.StringBuilder clear(java.lang.StringBuilder sb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.setLength(0);
        return sb;
    }

    private static final void set(java.lang.StringBuilder sb, int i, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        sb.setCharAt(i, c);
    }

    private static final java.lang.StringBuilder setRange(java.lang.StringBuilder sb, int i, int i2, java.lang.String value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.lang.StringBuilder sbReplace = sb.replace(i, i2, value);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbReplace, "replace(...)");
        return sbReplace;
    }

    private static final java.lang.StringBuilder deleteAt(java.lang.StringBuilder sb, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbDeleteCharAt = sb.deleteCharAt(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbDeleteCharAt, "deleteCharAt(...)");
        return sbDeleteCharAt;
    }

    private static final java.lang.StringBuilder deleteRange(java.lang.StringBuilder sb, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbDelete = sb.delete(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbDelete, "delete(...)");
        return sbDelete;
    }

    static /* synthetic */ void toCharArray$default(java.lang.StringBuilder sb, char[] destination, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = sb.length();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        sb.getChars(i2, i3, destination, i);
    }

    private static final void toCharArray(java.lang.StringBuilder sb, char[] destination, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        sb.getChars(i2, i3, destination, i);
    }

    private static final java.lang.StringBuilder appendRange(java.lang.StringBuilder sb, char[] value, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.lang.StringBuilder sbAppend = sb.append(value, i, i2 - i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return sbAppend;
    }

    private static final java.lang.StringBuilder appendRange(java.lang.StringBuilder sb, java.lang.CharSequence value, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.lang.StringBuilder sbAppend = sb.append(value, i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return sbAppend;
    }

    private static final java.lang.StringBuilder insertRange(java.lang.StringBuilder sb, int i, char[] value, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.lang.StringBuilder sbInsert = sb.insert(i, value, i2, i3 - i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbInsert, "insert(...)");
        return sbInsert;
    }

    private static final java.lang.StringBuilder insertRange(java.lang.StringBuilder sb, int i, java.lang.CharSequence value, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.lang.StringBuilder sbInsert = sb.insert(i, value, i2, i3);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbInsert, "insert(...)");
        return sbInsert;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, java.lang.StringBuffer stringBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append(stringBuffer);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        java.lang.StringBuilder sbAppend2 = sbAppend.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, java.lang.StringBuilder sb2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append((java.lang.CharSequence) sb2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        java.lang.StringBuilder sbAppend2 = sbAppend.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        java.lang.StringBuilder sbAppend2 = sbAppend.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append((int) s);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        java.lang.StringBuilder sbAppend2 = sbAppend.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append((int) b);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        java.lang.StringBuilder sbAppend2 = sbAppend.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append(j);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        java.lang.StringBuilder sbAppend2 = sbAppend.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append(f);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        java.lang.StringBuilder sbAppend2 = sbAppend.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    private static final java.lang.StringBuilder appendLine(java.lang.StringBuilder sb, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append(d);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        java.lang.StringBuilder sbAppend2 = sbAppend.append('\n');
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend2, "append(...)");
        return sbAppend2;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine()", imports = {}))
    public static final java.lang.Appendable appendln(java.lang.Appendable appendable) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "<this>");
        java.lang.Appendable appendableAppend = appendable.append(kotlin.text.SystemProperties.LINE_SEPARATOR);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return appendableAppend;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.Appendable appendln(java.lang.Appendable appendable, java.lang.CharSequence charSequence) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "<this>");
        java.lang.Appendable appendableAppend = appendable.append(charSequence);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return kotlin.text.StringsKt.appendln(appendableAppend);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.Appendable appendln(java.lang.Appendable appendable, char c) throws java.io.IOException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(appendable, "<this>");
        java.lang.Appendable appendableAppend = appendable.append(c);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(appendableAppend, "append(...)");
        return kotlin.text.StringsKt.appendln(appendableAppend);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine()", imports = {}))
    public static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append(kotlin.text.SystemProperties.LINE_SEPARATOR);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return sbAppend;
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, java.lang.StringBuffer stringBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append(stringBuffer);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return kotlin.text.StringsKt.appendln(sbAppend);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append(charSequence);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return kotlin.text.StringsKt.appendln(sbAppend);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append(str);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return kotlin.text.StringsKt.appendln(sbAppend);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, java.lang.Object obj) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append(obj);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return kotlin.text.StringsKt.appendln(sbAppend);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, java.lang.StringBuilder sb2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append((java.lang.CharSequence) sb2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return kotlin.text.StringsKt.appendln(sbAppend);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, char[] value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        java.lang.StringBuilder sbAppend = sb.append(value);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return kotlin.text.StringsKt.appendln(sbAppend);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, char c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append(c);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return kotlin.text.StringsKt.appendln(sbAppend);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append(z);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return kotlin.text.StringsKt.appendln(sbAppend);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return kotlin.text.StringsKt.appendln(sbAppend);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, short s) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append((int) s);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return kotlin.text.StringsKt.appendln(sbAppend);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, byte b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append((int) b);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return kotlin.text.StringsKt.appendln(sbAppend);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append(j);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return kotlin.text.StringsKt.appendln(sbAppend);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, float f) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append(f);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return kotlin.text.StringsKt.appendln(sbAppend);
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.WARNING, message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @kotlin.ReplaceWith(expression = "appendLine(value)", imports = {}))
    private static final java.lang.StringBuilder appendln(java.lang.StringBuilder sb, double d) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sb, "<this>");
        java.lang.StringBuilder sbAppend = sb.append(d);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(sbAppend, "append(...)");
        return kotlin.text.StringsKt.appendln(sbAppend);
    }
}
