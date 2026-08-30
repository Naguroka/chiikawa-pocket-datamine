package kotlin;

/* JADX INFO: compiled from: BigIntegers.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\u001a\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\r\u0010\u0003\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0005\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\r\u0010\u0006\u001a\u00020\u0001*\u00020\u0001H\u0087\b\u001a\u0015\u0010\u0007\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f\u001a\u0015\u0010\t\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\n\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\u0015\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0087\f\u001a\u0015\u0010\u000e\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0087\f\u001a\u0015\u0010\u000f\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\n\u001a\r\u0010\u0010\u001a\u00020\u0011*\u00020\u0001H\u0087\b\u001a!\u0010\u0010\u001a\u00020\u0011*\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\r2\b\b\u0002\u0010\u0013\u001a\u00020\u0014H\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\rH\u0087\b\u001a\r\u0010\u0015\u001a\u00020\u0001*\u00020\u0016H\u0087\b\u001a\r\u0010\u0017\u001a\u00020\u0001*\u00020\u0001H\u0087\n\u001a\u0015\u0010\u0018\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0087\f¨\u0006\u0019"}, d2 = {"and", "Ljava/math/BigInteger;", "other", "dec", androidx.media3.extractor.text.ttml.TtmlNode.TAG_DIV, "inc", "inv", "minus", "or", "plus", "rem", "shl", com.json.zb.q, "", "shr", "times", "toBigDecimal", "Ljava/math/BigDecimal;", "scale", "mathContext", "Ljava/math/MathContext;", "toBigInteger", "", "unaryMinus", "xor", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/NumbersKt")
class NumbersKt__BigIntegersKt extends kotlin.NumbersKt__BigDecimalsKt {
    private static final java.math.BigInteger plus(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger bigIntegerAdd = bigInteger.add(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
        return bigIntegerAdd;
    }

    private static final java.math.BigInteger minus(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger bigIntegerSubtract = bigInteger.subtract(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerSubtract, "subtract(...)");
        return bigIntegerSubtract;
    }

    private static final java.math.BigInteger times(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger bigIntegerMultiply = bigInteger.multiply(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerMultiply, "multiply(...)");
        return bigIntegerMultiply;
    }

    private static final java.math.BigInteger div(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger bigIntegerDivide = bigInteger.divide(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerDivide, "divide(...)");
        return bigIntegerDivide;
    }

    private static final java.math.BigInteger rem(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger bigIntegerRemainder = bigInteger.remainder(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerRemainder, "remainder(...)");
        return bigIntegerRemainder;
    }

    private static final java.math.BigInteger unaryMinus(java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger bigIntegerNegate = bigInteger.negate();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerNegate, "negate(...)");
        return bigIntegerNegate;
    }

    private static final java.math.BigInteger inc(java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger bigIntegerAdd = bigInteger.add(java.math.BigInteger.ONE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerAdd, "add(...)");
        return bigIntegerAdd;
    }

    private static final java.math.BigInteger dec(java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger bigIntegerSubtract = bigInteger.subtract(java.math.BigInteger.ONE);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerSubtract, "subtract(...)");
        return bigIntegerSubtract;
    }

    private static final java.math.BigInteger inv(java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger bigIntegerNot = bigInteger.not();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerNot, "not(...)");
        return bigIntegerNot;
    }

    private static final java.math.BigInteger and(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger bigIntegerAnd = bigInteger.and(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerAnd, "and(...)");
        return bigIntegerAnd;
    }

    private static final java.math.BigInteger or(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger bigIntegerOr = bigInteger.or(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerOr, "or(...)");
        return bigIntegerOr;
    }

    private static final java.math.BigInteger xor(java.math.BigInteger bigInteger, java.math.BigInteger other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        java.math.BigInteger bigIntegerXor = bigInteger.xor(other);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerXor, "xor(...)");
        return bigIntegerXor;
    }

    private static final java.math.BigInteger shl(java.math.BigInteger bigInteger, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger bigIntegerShiftLeft = bigInteger.shiftLeft(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerShiftLeft, "shiftLeft(...)");
        return bigIntegerShiftLeft;
    }

    private static final java.math.BigInteger shr(java.math.BigInteger bigInteger, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        java.math.BigInteger bigIntegerShiftRight = bigInteger.shiftRight(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerShiftRight, "shiftRight(...)");
        return bigIntegerShiftRight;
    }

    private static final java.math.BigInteger toBigInteger(int i) {
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(i);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        return bigIntegerValueOf;
    }

    private static final java.math.BigInteger toBigInteger(long j) {
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(j);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        return bigIntegerValueOf;
    }

    private static final java.math.BigDecimal toBigDecimal(java.math.BigInteger bigInteger) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        return new java.math.BigDecimal(bigInteger);
    }

    static /* synthetic */ java.math.BigDecimal toBigDecimal$default(java.math.BigInteger bigInteger, int i, java.math.MathContext mathContext, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            mathContext = java.math.MathContext.UNLIMITED;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(mathContext, "UNLIMITED");
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new java.math.BigDecimal(bigInteger, i, mathContext);
    }

    private static final java.math.BigDecimal toBigDecimal(java.math.BigInteger bigInteger, int i, java.math.MathContext mathContext) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bigInteger, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mathContext, "mathContext");
        return new java.math.BigDecimal(bigInteger, i, mathContext);
    }
}
