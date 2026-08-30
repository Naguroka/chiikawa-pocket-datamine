package kotlin.text;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: StringsJVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\f\n\u0002\b\u0011\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u000bH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\rH\u0087\b\u001a\u0019\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a)\u0010\u0007\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a\u0011\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011H\u0087\b\u001a\f\u0010\u0017\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010\u0017\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\u0015\u0010\u001a\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0011H\u0087\b\u001a\u0015\u0010\u001c\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u0011H\u0087\b\u001a\u001d\u0010\u001d\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010 \u001a\u00020\u0011*\u00020\u00022\u0006\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a\f\u0010$\u001a\u00020\u0002*\u00020\u0014H\u0007\u001a \u0010$\u001a\u00020\u0002*\u00020\u00142\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007\u001a\u0019\u0010&\u001a\u00020#*\u0004\u0018\u00010'2\b\u0010!\u001a\u0004\u0018\u00010'H\u0087\u0004\u001a \u0010&\u001a\u00020#*\u0004\u0018\u00010'2\b\u0010!\u001a\u0004\u0018\u00010'2\u0006\u0010\"\u001a\u00020#H\u0007\u001a\u0015\u0010&\u001a\u00020#*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0087\b\u001a\u0015\u0010&\u001a\u00020#*\u00020\u00022\u0006\u0010(\u001a\u00020'H\u0087\b\u001a\f\u0010)\u001a\u00020\u0002*\u00020\u0002H\u0007\u001a\u0014\u0010)\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0007\u001a\f\u0010*\u001a\u00020\u0002*\u00020\rH\u0007\u001a*\u0010*\u001a\u00020\u0002*\u00020\r2\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020#H\u0007\u001a\f\u0010,\u001a\u00020\r*\u00020\u0002H\u0007\u001a*\u0010,\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u00112\b\b\u0002\u0010+\u001a\u00020#H\u0007\u001a\u001c\u0010-\u001a\u00020#*\u00020\u00022\u0006\u0010.\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a \u0010/\u001a\u00020#*\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a4\u00100\u001a\u00020\u0002*\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00104\u001a*\u00100\u001a\u00020\u0002*\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00105\u001a<\u00100\u001a\u00020\u0002*\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u00100\u001a\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00106\u001a2\u00100\u001a\u00020\u0002*\u00020\u00042\u0006\u00100\u001a\u00020\u00022\u0016\u00101\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010302\"\u0004\u0018\u000103H\u0087\b¢\u0006\u0002\u00107\u001a\r\u00108\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\n\u00109\u001a\u00020#*\u00020'\u001a\r\u0010:\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010:\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\u001d\u0010;\u001a\u00020\u0011*\u00020\u00022\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010;\u001a\u00020\u0011*\u00020\u00022\u0006\u0010?\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010@\u001a\u00020\u0011*\u00020\u00022\u0006\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010@\u001a\u00020\u0011*\u00020\u00022\u0006\u0010?\u001a\u00020\u00022\u0006\u0010>\u001a\u00020\u0011H\u0081\b\u001a\u001d\u0010A\u001a\u00020\u0011*\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u00112\u0006\u0010B\u001a\u00020\u0011H\u0087\b\u001a4\u0010C\u001a\u00020#*\u00020'2\u0006\u0010D\u001a\u00020\u00112\u0006\u0010!\u001a\u00020'2\u0006\u0010E\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a4\u0010C\u001a\u00020#*\u00020\u00022\u0006\u0010D\u001a\u00020\u00112\u0006\u0010!\u001a\u00020\u00022\u0006\u0010E\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a\u0012\u0010F\u001a\u00020\u0002*\u00020'2\u0006\u0010G\u001a\u00020\u0011\u001a$\u0010H\u001a\u00020\u0002*\u00020\u00022\u0006\u0010I\u001a\u00020=2\u0006\u0010J\u001a\u00020=2\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010H\u001a\u00020\u0002*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010M\u001a\u00020\u0002*\u00020\u00022\u0006\u0010I\u001a\u00020=2\u0006\u0010J\u001a\u00020=2\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010M\u001a\u00020\u0002*\u00020\u00022\u0006\u0010K\u001a\u00020\u00022\u0006\u0010L\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a\"\u0010N\u001a\b\u0012\u0004\u0012\u00020\u00020O*\u00020'2\u0006\u0010P\u001a\u00020Q2\b\b\u0002\u0010R\u001a\u00020\u0011\u001a\u001c\u0010S\u001a\u00020#*\u00020\u00022\u0006\u0010T\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020#\u001a$\u0010S\u001a\u00020#*\u00020\u00022\u0006\u0010T\u001a\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\"\u001a\u00020#\u001a\u0015\u0010U\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u0011H\u0087\b\u001a\u001d\u0010U\u001a\u00020\u0002*\u00020\u00022\u0006\u0010%\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a\u0017\u0010V\u001a\u00020\r*\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0087\b\u001a\r\u0010W\u001a\u00020\u0014*\u00020\u0002H\u0087\b\u001a3\u0010W\u001a\u00020\u0014*\u00020\u00022\u0006\u0010X\u001a\u00020\u00142\b\b\u0002\u0010Y\u001a\u00020\u00112\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0087\b\u001a \u0010W\u001a\u00020\u0014*\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00112\b\b\u0002\u0010\u001f\u001a\u00020\u0011H\u0007\u001a\r\u0010Z\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010Z\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\u0017\u0010[\u001a\u00020Q*\u00020\u00022\b\b\u0002\u0010\\\u001a\u00020\u0011H\u0087\b\u001a\r\u0010]\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010]\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\u001a\r\u0010^\u001a\u00020\u0002*\u00020\u0002H\u0087\b\u001a\u0015\u0010^\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0019H\u0087\b\"%\u0010\u0000\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003*\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006_"}, d2 = {"CASE_INSENSITIVE_ORDER", "Ljava/util/Comparator;", "", "Lkotlin/Comparator;", "Lkotlin/String$Companion;", "getCASE_INSENSITIVE_ORDER", "(Lkotlin/jvm/internal/StringCompanionObject;)Ljava/util/Comparator;", "String", "stringBuffer", "Ljava/lang/StringBuffer;", "stringBuilder", "Ljava/lang/StringBuilder;", "bytes", "", com.json.zb.M, "Ljava/nio/charset/Charset;", androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, "", "length", "chars", "", "codePoints", "", "capitalize", "locale", "Ljava/util/Locale;", "codePointAt", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "codePointBefore", "codePointCount", "beginIndex", "endIndex", "compareTo", "other", "ignoreCase", "", "concatToString", "startIndex", "contentEquals", "", "charSequence", "decapitalize", "decodeToString", "throwOnInvalidSequence", "encodeToByteArray", "endsWith", "suffix", "equals", "format", "args", "", "", "(Ljava/lang/String;Ljava/util/Locale;[Ljava/lang/Object;)Ljava/lang/String;", "(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "(Lkotlin/jvm/internal/StringCompanionObject;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;", "intern", "isBlank", "lowercase", "nativeIndexOf", "ch", "", "fromIndex", "str", "nativeLastIndexOf", "offsetByCodePoints", "codePointOffset", "regionMatches", "thisOffset", "otherOffset", "repeat", com.json.zb.q, "replace", "oldChar", "newChar", "oldValue", "newValue", "replaceFirst", "split", "", "regex", "Ljava/util/regex/Pattern;", "limit", "startsWith", "prefix", "substring", "toByteArray", "toCharArray", com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, "destinationOffset", "toLowerCase", "toPattern", "flags", "toUpperCase", "uppercase", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
public class StringsKt__StringsJVMKt extends kotlin.text.StringsKt__StringNumberConversionsKt {
    private static final int nativeIndexOf(java.lang.String str, char c, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return str.indexOf(c, i);
    }

    private static final int nativeIndexOf(java.lang.String str, java.lang.String str2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "str");
        return str.indexOf(str2, i);
    }

    private static final int nativeLastIndexOf(java.lang.String str, char c, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return str.lastIndexOf(c, i);
    }

    private static final int nativeLastIndexOf(java.lang.String str, java.lang.String str2, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "str");
        return str.lastIndexOf(str2, i);
    }

    public static /* synthetic */ boolean equals$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.equals(str, str2, z);
    }

    public static final boolean equals(java.lang.String str, java.lang.String str2, boolean z) {
        if (str == null) {
            return str2 == null;
        }
        if (!z) {
            return str.equals(str2);
        }
        return str.equalsIgnoreCase(str2);
    }

    public static /* synthetic */ java.lang.String replace$default(java.lang.String str, char c, char c2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.replace(str, c, c2, z);
    }

    public static final java.lang.String replace(java.lang.String str, char c, char c2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        if (!z) {
            java.lang.String strReplace = str.replace(c, c2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strReplace, "replace(...)");
            return strReplace;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(str.length());
        java.lang.String str2 = str;
        for (int i = 0; i < str2.length(); i++) {
            char cCharAt = str2.charAt(i);
            if (kotlin.text.CharsKt.equals(cCharAt, c, z)) {
                cCharAt = c2;
            }
            sb.append(cCharAt);
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ java.lang.String replace$default(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.replace(str, str2, str3, z);
    }

    public static final java.lang.String replace(java.lang.String str, java.lang.String oldValue, java.lang.String newValue, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newValue, "newValue");
        java.lang.String str2 = str;
        int i = 0;
        int iIndexOf = kotlin.text.StringsKt.indexOf(str2, oldValue, 0, z);
        if (iIndexOf < 0) {
            return str;
        }
        int length = oldValue.length();
        int iCoerceAtLeast = kotlin.ranges.RangesKt.coerceAtLeast(length, 1);
        int length2 = (str.length() - length) + newValue.length();
        if (length2 < 0) {
            throw new java.lang.OutOfMemoryError();
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(length2);
        do {
            sb.append((java.lang.CharSequence) str2, i, iIndexOf).append(newValue);
            i = iIndexOf + length;
            if (iIndexOf >= str.length()) {
                break;
            }
            iIndexOf = kotlin.text.StringsKt.indexOf(str2, oldValue, iIndexOf + iCoerceAtLeast, z);
        } while (iIndexOf > 0);
        java.lang.String string = sb.append((java.lang.CharSequence) str2, i, str.length()).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static /* synthetic */ java.lang.String replaceFirst$default(java.lang.String str, char c, char c2, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.replaceFirst(str, c, c2, z);
    }

    public static final java.lang.String replaceFirst(java.lang.String str, char c, char c2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.lang.String str2 = str;
        int iIndexOf$default = kotlin.text.StringsKt.indexOf$default(str2, c, 0, z, 2, (java.lang.Object) null);
        return iIndexOf$default < 0 ? str : kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) str2, iIndexOf$default, iIndexOf$default + 1, (java.lang.CharSequence) java.lang.String.valueOf(c2)).toString();
    }

    public static /* synthetic */ java.lang.String replaceFirst$default(java.lang.String str, java.lang.String str2, java.lang.String str3, boolean z, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.replaceFirst(str, str2, str3, z);
    }

    public static final java.lang.String replaceFirst(java.lang.String str, java.lang.String oldValue, java.lang.String newValue, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(oldValue, "oldValue");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(newValue, "newValue");
        java.lang.String str2 = str;
        int iIndexOf$default = kotlin.text.StringsKt.indexOf$default(str2, oldValue, 0, z, 2, (java.lang.Object) null);
        return iIndexOf$default < 0 ? str : kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) str2, iIndexOf$default, oldValue.length() + iIndexOf$default, (java.lang.CharSequence) newValue).toString();
    }

    @kotlin.Deprecated(message = "Use uppercase() instead.", replaceWith = @kotlin.ReplaceWith(expression = "uppercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final java.lang.String toUpperCase(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.lang.String upperCase = str.toUpperCase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    private static final java.lang.String uppercase(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.lang.String upperCase = str.toUpperCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @kotlin.Deprecated(message = "Use lowercase() instead.", replaceWith = @kotlin.ReplaceWith(expression = "lowercase(Locale.getDefault())", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final java.lang.String toLowerCase(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.lang.String lowerCase = str.toLowerCase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private static final java.lang.String lowercase(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.lang.String lowerCase = str.toLowerCase(java.util.Locale.ROOT);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    public static final java.lang.String concatToString(char[] cArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "<this>");
        return new java.lang.String(cArr);
    }

    public static /* synthetic */ java.lang.String concatToString$default(char[] cArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = cArr.length;
        }
        return kotlin.text.StringsKt.concatToString(cArr, i, i2);
    }

    public static final java.lang.String concatToString(char[] cArr, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cArr, "<this>");
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, cArr.length);
        return new java.lang.String(cArr, i, i2 - i);
    }

    public static /* synthetic */ char[] toCharArray$default(java.lang.String str, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        return kotlin.text.StringsKt.toCharArray(str, i, i2);
    }

    public static final char[] toCharArray(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        char[] cArr = new char[i2 - i];
        str.getChars(i, i2, cArr, 0);
        return cArr;
    }

    public static final java.lang.String decodeToString(byte[] bArr) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        return new java.lang.String(bArr, kotlin.text.Charsets.UTF_8);
    }

    public static /* synthetic */ java.lang.String decodeToString$default(byte[] bArr, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = bArr.length;
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.decodeToString(bArr, i, i2, z);
    }

    public static final java.lang.String decodeToString(byte[] bArr, int i, int i2, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bArr, "<this>");
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, bArr.length);
        if (!z) {
            return new java.lang.String(bArr, i, i2 - i, kotlin.text.Charsets.UTF_8);
        }
        java.lang.String string = kotlin.text.Charsets.UTF_8.newDecoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPORT).onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPORT).decode(java.nio.ByteBuffer.wrap(bArr, i, i2 - i)).toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public static final byte[] encodeToByteArray(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(kotlin.text.Charsets.UTF_8);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    public static /* synthetic */ byte[] encodeToByteArray$default(java.lang.String str, int i, int i2, boolean z, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = str.length();
        }
        if ((i3 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.encodeToByteArray(str, i, i2, z);
    }

    public static final byte[] encodeToByteArray(java.lang.String str, int i, int i2, boolean z) throws java.nio.charset.CharacterCodingException {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.collections.AbstractList.INSTANCE.checkBoundsIndexes$kotlin_stdlib(i, i2, str.length());
        if (!z) {
            java.lang.String strSubstring = str.substring(i, i2);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            java.nio.charset.Charset charset = kotlin.text.Charsets.UTF_8;
            kotlin.jvm.internal.Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = strSubstring.getBytes(charset);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
            return bytes;
        }
        java.nio.ByteBuffer byteBufferEncode = kotlin.text.Charsets.UTF_8.newEncoder().onMalformedInput(java.nio.charset.CodingErrorAction.REPORT).onUnmappableCharacter(java.nio.charset.CodingErrorAction.REPORT).encode(java.nio.CharBuffer.wrap(str, i, i2));
        if (byteBufferEncode.hasArray() && byteBufferEncode.arrayOffset() == 0) {
            int iRemaining = byteBufferEncode.remaining();
            byte[] bArrArray = byteBufferEncode.array();
            kotlin.jvm.internal.Intrinsics.checkNotNull(bArrArray);
            if (iRemaining == bArrArray.length) {
                byte[] bArrArray2 = byteBufferEncode.array();
                kotlin.jvm.internal.Intrinsics.checkNotNull(bArrArray2);
                return bArrArray2;
            }
        }
        byte[] bArr = new byte[byteBufferEncode.remaining()];
        byteBufferEncode.get(bArr);
        return bArr;
    }

    private static final char[] toCharArray(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        char[] charArray = str.toCharArray();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(charArray, "toCharArray(...)");
        return charArray;
    }

    static /* synthetic */ char[] toCharArray$default(java.lang.String str, char[] destination, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = str.length();
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        str.getChars(i2, i3, destination, i);
        return destination;
    }

    private static final char[] toCharArray(java.lang.String str, char[] destination, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        str.getChars(i2, i3, destination, i);
        return destination;
    }

    private static final java.lang.String format(java.lang.String str, java.lang.Object... args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        java.lang.String str2 = java.lang.String.format(str, java.util.Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    private static final java.lang.String format(kotlin.jvm.internal.StringCompanionObject stringCompanionObject, java.lang.String format, java.lang.Object... args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        java.lang.String str = java.lang.String.format(format, java.util.Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    private static final java.lang.String format(java.lang.String str, java.util.Locale locale, java.lang.Object... args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        java.lang.String str2 = java.lang.String.format(locale, str, java.util.Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    private static final java.lang.String format(kotlin.jvm.internal.StringCompanionObject stringCompanionObject, java.util.Locale locale, java.lang.String format, java.lang.Object... args) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(format, "format");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(args, "args");
        java.lang.String str = java.lang.String.format(locale, format, java.util.Arrays.copyOf(args, args.length));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }

    public static /* synthetic */ java.util.List split$default(java.lang.CharSequence charSequence, java.util.regex.Pattern pattern, int i, int i2, java.lang.Object obj) {
        if ((i2 & 2) != 0) {
            i = 0;
        }
        return kotlin.text.StringsKt.split(charSequence, pattern, i);
    }

    public static final java.util.List<java.lang.String> split(java.lang.CharSequence charSequence, java.util.regex.Pattern regex, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(regex, "regex");
        kotlin.text.StringsKt.requireNonNegativeLimit(i);
        if (i == 0) {
            i = -1;
        }
        java.lang.String[] strArrSplit = regex.split(charSequence, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strArrSplit, "split(...)");
        return kotlin.collections.ArraysKt.asList(strArrSplit);
    }

    private static final java.lang.String substring(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.lang.String strSubstring = str.substring(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    private static final java.lang.String substring(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.lang.String strSubstring = str.substring(i, i2);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        return strSubstring;
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.startsWith(str, str2, z);
    }

    public static final boolean startsWith(java.lang.String str, java.lang.String prefix, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z) {
            return str.startsWith(prefix);
        }
        return kotlin.text.StringsKt.regionMatches(str, 0, prefix, 0, prefix.length(), z);
    }

    public static /* synthetic */ boolean startsWith$default(java.lang.String str, java.lang.String str2, int i, boolean z, int i2, java.lang.Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.startsWith(str, str2, i, z);
    }

    public static final boolean startsWith(java.lang.String str, java.lang.String prefix, int i, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(prefix, "prefix");
        if (!z) {
            return str.startsWith(prefix, i);
        }
        return kotlin.text.StringsKt.regionMatches(str, i, prefix, 0, prefix.length(), z);
    }

    public static /* synthetic */ boolean endsWith$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.endsWith(str, str2, z);
    }

    public static final boolean endsWith(java.lang.String str, java.lang.String suffix, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(suffix, "suffix");
        if (!z) {
            return str.endsWith(suffix);
        }
        return kotlin.text.StringsKt.regionMatches(str, str.length() - suffix.length(), suffix, 0, suffix.length(), true);
    }

    private static final java.lang.String String(byte[] bytes, int i, int i2, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return new java.lang.String(bytes, i, i2, charset);
    }

    private static final java.lang.String String(byte[] bytes, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        return new java.lang.String(bytes, charset);
    }

    private static final java.lang.String String(byte[] bytes, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new java.lang.String(bytes, i, i2, kotlin.text.Charsets.UTF_8);
    }

    private static final java.lang.String String(byte[] bytes) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bytes, "bytes");
        return new java.lang.String(bytes, kotlin.text.Charsets.UTF_8);
    }

    private static final java.lang.String String(char[] chars) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chars, "chars");
        return new java.lang.String(chars);
    }

    private static final java.lang.String String(char[] chars, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(chars, "chars");
        return new java.lang.String(chars, i, i2);
    }

    private static final java.lang.String String(int[] codePoints, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(codePoints, "codePoints");
        return new java.lang.String(codePoints, i, i2);
    }

    private static final java.lang.String String(java.lang.StringBuffer stringBuffer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringBuffer, "stringBuffer");
        return new java.lang.String(stringBuffer);
    }

    private static final java.lang.String String(java.lang.StringBuilder stringBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        return new java.lang.String(stringBuilder);
    }

    private static final int codePointAt(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointAt(i);
    }

    private static final int codePointBefore(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointBefore(i);
    }

    private static final int codePointCount(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return str.codePointCount(i, i2);
    }

    public static /* synthetic */ int compareTo$default(java.lang.String str, java.lang.String str2, boolean z, int i, java.lang.Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.compareTo(str, str2, z);
    }

    public static final int compareTo(java.lang.String str, java.lang.String other, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if (z) {
            return str.compareToIgnoreCase(other);
        }
        return str.compareTo(other);
    }

    private static final boolean contentEquals(java.lang.String str, java.lang.CharSequence charSequence) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "charSequence");
        return str.contentEquals(charSequence);
    }

    private static final boolean contentEquals(java.lang.String str, java.lang.StringBuffer stringBuilder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringBuilder, "stringBuilder");
        return str.contentEquals(stringBuilder);
    }

    public static final boolean contentEquals(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        if ((charSequence instanceof java.lang.String) && charSequence2 != null) {
            return ((java.lang.String) charSequence).contentEquals(charSequence2);
        }
        return kotlin.text.StringsKt.contentEqualsImpl(charSequence, charSequence2);
    }

    public static final boolean contentEquals(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2, boolean z) {
        if (z) {
            return kotlin.text.StringsKt.contentEqualsIgnoreCaseImpl(charSequence, charSequence2);
        }
        return kotlin.text.StringsKt.contentEquals(charSequence, charSequence2);
    }

    private static final java.lang.String intern(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.lang.String strIntern = str.intern();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strIntern, "intern(...)");
        return strIntern;
    }

    public static final boolean isBlank(java.lang.CharSequence charSequence) {
        boolean z;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (charSequence.length() == 0) {
            return true;
        }
        java.lang.Iterable indices = kotlin.text.StringsKt.getIndices(charSequence);
        if ((indices instanceof java.util.Collection) && ((java.util.Collection) indices).isEmpty()) {
            z = true;
        } else {
            java.util.Iterator it = indices.iterator();
            while (it.hasNext()) {
                if (!kotlin.text.CharsKt.isWhitespace(charSequence.charAt(((kotlin.collections.IntIterator) it).nextInt()))) {
                    z = false;
                }
            }
            z = true;
        }
        return z;
    }

    private static final int offsetByCodePoints(java.lang.String str, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return str.offsetByCodePoints(i, i2);
    }

    public static /* synthetic */ boolean regionMatches$default(java.lang.CharSequence charSequence, int i, java.lang.CharSequence charSequence2, int i2, int i3, boolean z, int i4, java.lang.Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.regionMatches(charSequence, i, charSequence2, i2, i3, z);
    }

    public static final boolean regionMatches(java.lang.CharSequence charSequence, int i, java.lang.CharSequence other, int i2, int i3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if ((charSequence instanceof java.lang.String) && (other instanceof java.lang.String)) {
            return kotlin.text.StringsKt.regionMatches((java.lang.String) charSequence, i, (java.lang.String) other, i2, i3, z);
        }
        return kotlin.text.StringsKt.regionMatchesImpl(charSequence, i, other, i2, i3, z);
    }

    public static /* synthetic */ boolean regionMatches$default(java.lang.String str, int i, java.lang.String str2, int i2, int i3, boolean z, int i4, java.lang.Object obj) {
        if ((i4 & 16) != 0) {
            z = false;
        }
        return kotlin.text.StringsKt.regionMatches(str, i, str2, i2, i3, z);
    }

    public static final boolean regionMatches(java.lang.String str, int i, java.lang.String other, int i2, int i3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        if (!z) {
            return str.regionMatches(i, other, i2, i3);
        }
        return str.regionMatches(z, i, other, i2, i3);
    }

    @kotlin.Deprecated(message = "Use lowercase() instead.", replaceWith = @kotlin.ReplaceWith(expression = "lowercase(locale)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final java.lang.String toLowerCase(java.lang.String str, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private static final java.lang.String lowercase(java.lang.String str, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        java.lang.String lowerCase = str.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    @kotlin.Deprecated(message = "Use uppercase() instead.", replaceWith = @kotlin.ReplaceWith(expression = "uppercase(locale)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    private static final java.lang.String toUpperCase(java.lang.String str, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        java.lang.String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    private static final java.lang.String uppercase(java.lang.String str, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        java.lang.String upperCase = str.toUpperCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    private static final byte[] toByteArray(java.lang.String str, java.nio.charset.Charset charset) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    static /* synthetic */ byte[] toByteArray$default(java.lang.String str, java.nio.charset.Charset charset, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            charset = kotlin.text.Charsets.UTF_8;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charset, "charset");
        byte[] bytes = str.getBytes(charset);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        return bytes;
    }

    static /* synthetic */ java.util.regex.Pattern toPattern$default(java.lang.String str, int i, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(str, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        return patternCompile;
    }

    private static final java.util.regex.Pattern toPattern(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.util.regex.Pattern patternCompile = java.util.regex.Pattern.compile(str, i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(patternCompile, "compile(...)");
        return patternCompile;
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() }", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String capitalize(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        java.util.Locale locale = java.util.Locale.getDefault();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        return kotlin.text.StringsKt.capitalize(str, locale);
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { if (it.isLowerCase()) it.titlecase(locale) else it.toString() }", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String capitalize(java.lang.String str, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        if (!(str.length() > 0)) {
            return str;
        }
        char cCharAt = str.charAt(0);
        if (!java.lang.Character.isLowerCase(cCharAt)) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        char titleCase = java.lang.Character.toTitleCase(cCharAt);
        if (titleCase != java.lang.Character.toUpperCase(cCharAt)) {
            sb.append(titleCase);
        } else {
            java.lang.String strSubstring = str.substring(0, 1);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
            kotlin.jvm.internal.Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
            java.lang.String upperCase = strSubstring.toUpperCase(locale);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
            sb.append(upperCase);
        }
        java.lang.String strSubstring2 = str.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        sb.append(strSubstring2);
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { it.lowercase(Locale.getDefault()) }", imports = {"java.util.Locale"}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String decapitalize(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        if (!(str.length() > 0) || java.lang.Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strSubstring = str.substring(0, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        java.lang.String lowerCase = strSubstring.toLowerCase();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        java.lang.StringBuilder sbAppend = sb.append(lowerCase);
        java.lang.String strSubstring2 = str.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return sbAppend.append(strSubstring2).toString();
    }

    @kotlin.Deprecated(message = "Use replaceFirstChar instead.", replaceWith = @kotlin.ReplaceWith(expression = "replaceFirstChar { it.lowercase(locale) }", imports = {}))
    @kotlin.DeprecatedSinceKotlin(warningSince = "1.5")
    public static final java.lang.String decapitalize(java.lang.String str, java.util.Locale locale) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(locale, "locale");
        if (!(str.length() > 0) || java.lang.Character.isLowerCase(str.charAt(0))) {
            return str;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String strSubstring = str.substring(0, 1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        kotlin.jvm.internal.Intrinsics.checkNotNull(strSubstring, "null cannot be cast to non-null type java.lang.String");
        java.lang.String lowerCase = strSubstring.toLowerCase(locale);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        java.lang.StringBuilder sbAppend = sb.append(lowerCase);
        java.lang.String strSubstring2 = str.substring(1);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring2, "substring(...)");
        return sbAppend.append(strSubstring2).toString();
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [kotlin.collections.IntIterator] */
    public static final java.lang.String repeat(java.lang.CharSequence charSequence, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(charSequence, "<this>");
        if (!(i >= 0)) {
            throw new java.lang.IllegalArgumentException(("Count 'n' must be non-negative, but was " + i + '.').toString());
        }
        if (i == 0) {
            return "";
        }
        if (i == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i];
            for (int i2 = 0; i2 < i; i2++) {
                cArr[i2] = cCharAt;
            }
            return new java.lang.String(cArr);
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder(charSequence.length() * i);
        ?? it = new kotlin.ranges.IntRange(1, i).iterator();
        while (it.hasNext()) {
            it.nextInt();
            sb.append(charSequence);
        }
        java.lang.String string = sb.toString();
        kotlin.jvm.internal.Intrinsics.checkNotNull(string);
        return string;
    }

    public static final java.util.Comparator<java.lang.String> getCASE_INSENSITIVE_ORDER(kotlin.jvm.internal.StringCompanionObject stringCompanionObject) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(stringCompanionObject, "<this>");
        java.util.Comparator<java.lang.String> CASE_INSENSITIVE_ORDER = java.lang.String.CASE_INSENSITIVE_ORDER;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(CASE_INSENSITIVE_ORDER, "CASE_INSENSITIVE_ORDER");
        return CASE_INSENSITIVE_ORDER;
    }
}
