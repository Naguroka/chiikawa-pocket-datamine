package kotlin.text;

/* JADX INFO: compiled from: StringNumberConversionsJVM.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000X\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\n\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\u0004\u0018\u0001H\u0001\"\u0004\b\u0000\u0010\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u0002H\u00010\u0005H\u0082\b¢\u0006\u0004\b\u0006\u0010\u0007\u001a\r\u0010\b\u001a\u00020\t*\u00020\u0003H\u0087\b\u001a\u0015\u0010\b\u001a\u00020\t*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0087\b\u001a\u000e\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u0003H\u0007\u001a\u0016\u0010\f\u001a\u0004\u0018\u00010\t*\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0007\u001a\r\u0010\r\u001a\u00020\u000e*\u00020\u0003H\u0087\b\u001a\u0015\u0010\r\u001a\u00020\u000e*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u0003H\u0007\u001a\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u000e*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0007\u001a\u000f\u0010\u0012\u001a\u00020\u0013*\u0004\u0018\u00010\u0003H\u0087\b\u001a\r\u0010\u0014\u001a\u00020\u0015*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u0014\u001a\u00020\u0015*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010\u0016\u001a\u00020\u0017*\u00020\u0003H\u0087\b\u001a\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0017*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u0019\u001a\r\u0010\u001a\u001a\u00020\u001b*\u00020\u0003H\u0087\b\u001a\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u001b*\u00020\u0003H\u0007¢\u0006\u0002\u0010\u001d\u001a\r\u0010\u001e\u001a\u00020\u0010*\u00020\u0003H\u0087\b\u001a\u0015\u0010\u001e\u001a\u00020\u0010*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010\u001f\u001a\u00020 *\u00020\u0003H\u0087\b\u001a\u0015\u0010\u001f\u001a\u00020 *\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\r\u0010!\u001a\u00020\"*\u00020\u0003H\u0087\b\u001a\u0015\u0010!\u001a\u00020\"*\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010#\u001a\u00020\u0003*\u00020\u00152\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010#\u001a\u00020\u0003*\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010#\u001a\u00020\u0003*\u00020 2\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b\u001a\u0015\u0010#\u001a\u00020\u0003*\u00020\"2\u0006\u0010\u000f\u001a\u00020\u0010H\u0087\b¨\u0006$"}, d2 = {"screenFloatValue", "T", "str", "", "parse", "Lkotlin/Function1;", "screenFloatValue$StringsKt__StringNumberConversionsJVMKt", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "toBigDecimal", "Ljava/math/BigDecimal;", "mathContext", "Ljava/math/MathContext;", "toBigDecimalOrNull", "toBigInteger", "Ljava/math/BigInteger;", "radix", "", "toBigIntegerOrNull", "toBoolean", "", "toByte", "", "toDouble", "", "toDoubleOrNull", "(Ljava/lang/String;)Ljava/lang/Double;", "toFloat", "", "toFloatOrNull", "(Ljava/lang/String;)Ljava/lang/Float;", "toInt", "toLong", "", "toShort", "", "toString", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/text/StringsKt")
class StringsKt__StringNumberConversionsJVMKt extends kotlin.text.StringsKt__StringBuilderKt {
    private static final java.lang.String toString(byte b, int i) {
        java.lang.String string = java.lang.Integer.toString(b, kotlin.text.CharsKt.checkRadix(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final java.lang.String toString(short s, int i) {
        java.lang.String string = java.lang.Integer.toString(s, kotlin.text.CharsKt.checkRadix(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final java.lang.String toString(int i, int i2) {
        java.lang.String string = java.lang.Integer.toString(i, kotlin.text.CharsKt.checkRadix(i2));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final java.lang.String toString(long j, int i) {
        java.lang.String string = java.lang.Long.toString(j, kotlin.text.CharsKt.checkRadix(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    private static final boolean toBoolean(java.lang.String str) {
        return java.lang.Boolean.parseBoolean(str);
    }

    private static final byte toByte(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Byte.parseByte(str);
    }

    private static final byte toByte(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Byte.parseByte(str, kotlin.text.CharsKt.checkRadix(i));
    }

    private static final short toShort(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Short.parseShort(str);
    }

    private static final short toShort(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Short.parseShort(str, kotlin.text.CharsKt.checkRadix(i));
    }

    private static final int toInt(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Integer.parseInt(str);
    }

    private static final int toInt(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Integer.parseInt(str, kotlin.text.CharsKt.checkRadix(i));
    }

    private static final long toLong(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Long.parseLong(str);
    }

    private static final long toLong(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Long.parseLong(str, kotlin.text.CharsKt.checkRadix(i));
    }

    private static final float toFloat(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Float.parseFloat(str);
    }

    private static final double toDouble(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return java.lang.Double.parseDouble(str);
    }

    private static final java.math.BigInteger toBigInteger(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return new java.math.BigInteger(str);
    }

    private static final java.math.BigInteger toBigInteger(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return new java.math.BigInteger(str, kotlin.text.CharsKt.checkRadix(i));
    }

    public static final java.math.BigInteger toBigIntegerOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return kotlin.text.StringsKt.toBigIntegerOrNull(str, 10);
    }

    public static final java.math.BigInteger toBigIntegerOrNull(java.lang.String str, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.text.CharsKt.checkRadix(i);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        if (length == 1) {
            if (kotlin.text.CharsKt.digitOf(str.charAt(0), i) < 0) {
                return null;
            }
        } else {
            for (int i2 = str.charAt(0) == '-' ? 1 : 0; i2 < length; i2++) {
                if (kotlin.text.CharsKt.digitOf(str.charAt(i2), i) < 0) {
                    return null;
                }
            }
        }
        return new java.math.BigInteger(str, kotlin.text.CharsKt.checkRadix(i));
    }

    private static final java.math.BigDecimal toBigDecimal(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        return new java.math.BigDecimal(str);
    }

    private static final java.math.BigDecimal toBigDecimal(java.lang.String str, java.math.MathContext mathContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new java.math.BigDecimal(str, mathContext);
    }

    private static final <T> T screenFloatValue$StringsKt__StringNumberConversionsJVMKt(java.lang.String str, kotlin.jvm.functions.Function1<? super java.lang.String, ? extends T> function1) {
        try {
            if (kotlin.text.ScreenFloatValueRegEx.value.matches(str)) {
                return function1.invoke(str);
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static final java.lang.Float toFloatOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (kotlin.text.ScreenFloatValueRegEx.value.matches(str)) {
                return java.lang.Float.valueOf(java.lang.Float.parseFloat(str));
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static final java.lang.Double toDoubleOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (kotlin.text.ScreenFloatValueRegEx.value.matches(str)) {
                return java.lang.Double.valueOf(java.lang.Double.parseDouble(str));
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static final java.math.BigDecimal toBigDecimalOrNull(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            if (kotlin.text.ScreenFloatValueRegEx.value.matches(str)) {
                return new java.math.BigDecimal(str);
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public static final java.math.BigDecimal toBigDecimalOrNull(java.lang.String str, java.math.MathContext mathContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        try {
            if (kotlin.text.ScreenFloatValueRegEx.value.matches(str)) {
                return new java.math.BigDecimal(str, mathContext);
            }
            return null;
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }
}
