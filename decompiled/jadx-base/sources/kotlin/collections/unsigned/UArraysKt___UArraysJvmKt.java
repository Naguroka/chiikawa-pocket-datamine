package kotlin.collections.unsigned;

/* JADX INFO: compiled from: _UArraysJvm.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000h\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b \n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00060\u0001*\u00020\u0007H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\n0\u0001*\u00020\u000bH\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0019\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0001*\u00020\u000fH\u0007¢\u0006\u0004\b\u0010\u0010\u0011\u001a/\u0010\u0012\u001a\u00020\u0013*\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001a/\u0010\u0012\u001a\u00020\u0013*\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00062\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\u001a/\u0010\u0012\u001a\u00020\u0013*\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a/\u0010\u0012\u001a\u00020\u0013*\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000e2\b\b\u0002\u0010\u0015\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u001d\u0010\u001e\u001a\u001c\u0010\u001f\u001a\u00020\u0002*\u00020\u00032\u0006\u0010 \u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b!\u0010\"\u001a\u001c\u0010\u001f\u001a\u00020\u0006*\u00020\u00072\u0006\u0010 \u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b#\u0010$\u001a\u001c\u0010\u001f\u001a\u00020\n*\u00020\u000b2\u0006\u0010 \u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b%\u0010&\u001a\u001c\u0010\u001f\u001a\u00020\u000e*\u00020\u000f2\u0006\u0010 \u001a\u00020\u0013H\u0087\b¢\u0006\u0004\b'\u0010(\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u0002*\u00020\u0003H\u0007¢\u0006\u0004\b*\u0010+\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u0006*\u00020\u0007H\u0007¢\u0006\u0004\b,\u0010-\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0007¢\u0006\u0004\b.\u0010/\u001a\u0015\u0010)\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0007¢\u0006\u0004\b0\u00101\u001a=\u00102\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b7\u00108\u001a=\u00102\u001a\u0004\u0018\u00010\u0006\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b9\u0010:\u001a=\u00102\u001a\u0004\u0018\u00010\n\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b;\u0010<\u001a=\u00102\u001a\u0004\u0018\u00010\u000e\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\b=\u0010>\u001a1\u0010?\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0002`BH\u0007¢\u0006\u0004\bC\u0010D\u001a1\u0010?\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00060Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0006`BH\u0007¢\u0006\u0004\bE\u0010F\u001a1\u0010?\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\n0Aj\n\u0012\u0006\b\u0000\u0012\u00020\n`BH\u0007¢\u0006\u0004\bG\u0010H\u001a1\u0010?\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000e0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000e`BH\u0007¢\u0006\u0004\bI\u0010J\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u0002*\u00020\u0003H\u0007¢\u0006\u0004\bL\u0010+\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u0006*\u00020\u0007H\u0007¢\u0006\u0004\bM\u0010-\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\n*\u00020\u000bH\u0007¢\u0006\u0004\bN\u0010/\u001a\u0015\u0010K\u001a\u0004\u0018\u00010\u000e*\u00020\u000fH\u0007¢\u0006\u0004\bO\u00101\u001a=\u0010P\u001a\u0004\u0018\u00010\u0002\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bQ\u00108\u001a=\u0010P\u001a\u0004\u0018\u00010\u0006\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bR\u0010:\u001a=\u0010P\u001a\u0004\u0018\u00010\n\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bS\u0010<\u001a=\u0010P\u001a\u0004\u0018\u00010\u000e\"\u000e\b\u0000\u00103*\b\u0012\u0004\u0012\u0002H304*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u0002H306H\u0087\bø\u0001\u0000¢\u0006\u0004\bT\u0010>\u001a1\u0010U\u001a\u0004\u0018\u00010\u0002*\u00020\u00032\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00020Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0002`BH\u0007¢\u0006\u0004\bV\u0010D\u001a1\u0010U\u001a\u0004\u0018\u00010\u0006*\u00020\u00072\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u00060Aj\n\u0012\u0006\b\u0000\u0012\u00020\u0006`BH\u0007¢\u0006\u0004\bW\u0010F\u001a1\u0010U\u001a\u0004\u0018\u00010\n*\u00020\u000b2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\n0Aj\n\u0012\u0006\b\u0000\u0012\u00020\n`BH\u0007¢\u0006\u0004\bX\u0010H\u001a1\u0010U\u001a\u0004\u0018\u00010\u000e*\u00020\u000f2\u001a\u0010@\u001a\u0016\u0012\u0006\b\u0000\u0012\u00020\u000e0Aj\n\u0012\u0006\b\u0000\u0012\u00020\u000e`BH\u0007¢\u0006\u0004\bY\u0010J\u001a+\u0010Z\u001a\u00020[*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010]\u001a+\u0010Z\u001a\u00020^*\u00020\u00032\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0000¢\u0006\u0004\b_\u0010`\u001a+\u0010Z\u001a\u00020[*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010a\u001a+\u0010Z\u001a\u00020^*\u00020\u00072\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0000¢\u0006\u0004\b_\u0010b\u001a+\u0010Z\u001a\u00020[*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010c\u001a+\u0010Z\u001a\u00020^*\u00020\u000b2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0000¢\u0006\u0004\b_\u0010d\u001a+\u0010Z\u001a\u00020[*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020[06H\u0087\bø\u0001\u0000¢\u0006\u0004\b\\\u0010e\u001a+\u0010Z\u001a\u00020^*\u00020\u000f2\u0012\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020^06H\u0087\bø\u0001\u0000¢\u0006\u0004\b_\u0010f\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006g"}, d2 = {"asList", "", "Lkotlin/UByte;", "Lkotlin/UByteArray;", "asList-GBYM_sE", "([B)Ljava/util/List;", "Lkotlin/UInt;", "Lkotlin/UIntArray;", "asList--ajY-9A", "([I)Ljava/util/List;", "Lkotlin/ULong;", "Lkotlin/ULongArray;", "asList-QwZRm1k", "([J)Ljava/util/List;", "Lkotlin/UShort;", "Lkotlin/UShortArray;", "asList-rL5Bavg", "([S)Ljava/util/List;", "binarySearch", "", "element", "fromIndex", "toIndex", "binarySearch-WpHrYlw", "([BBII)I", "binarySearch-2fe2U9s", "([IIII)I", "binarySearch-K6DWlUc", "([JJII)I", "binarySearch-EtDCXyQ", "([SSII)I", "elementAt", com.google.firebase.analytics.FirebaseAnalytics.Param.INDEX, "elementAt-PpDY95g", "([BI)B", "elementAt-qFRl0hI", "([II)I", "elementAt-r7IrZao", "([JI)J", "elementAt-nggk6HY", "([SI)S", com.applovin.sdk.AppLovinMediationProvider.MAX, "max-GBYM_sE", "([B)Lkotlin/UByte;", "max--ajY-9A", "([I)Lkotlin/UInt;", "max-QwZRm1k", "([J)Lkotlin/ULong;", "max-rL5Bavg", "([S)Lkotlin/UShort;", "maxBy", "R", "", "selector", "Lkotlin/Function1;", "maxBy-JOV_ifY", "([BLkotlin/jvm/functions/Function1;)Lkotlin/UByte;", "maxBy-jgv0xPQ", "([ILkotlin/jvm/functions/Function1;)Lkotlin/UInt;", "maxBy-MShoTSo", "([JLkotlin/jvm/functions/Function1;)Lkotlin/ULong;", "maxBy-xTcfx_M", "([SLkotlin/jvm/functions/Function1;)Lkotlin/UShort;", "maxWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "maxWith-XMRcp5o", "([BLjava/util/Comparator;)Lkotlin/UByte;", "maxWith-YmdZ_VM", "([ILjava/util/Comparator;)Lkotlin/UInt;", "maxWith-zrEWJaI", "([JLjava/util/Comparator;)Lkotlin/ULong;", "maxWith-eOHTfZs", "([SLjava/util/Comparator;)Lkotlin/UShort;", "min", "min-GBYM_sE", "min--ajY-9A", "min-QwZRm1k", "min-rL5Bavg", "minBy", "minBy-JOV_ifY", "minBy-jgv0xPQ", "minBy-MShoTSo", "minBy-xTcfx_M", "minWith", "minWith-XMRcp5o", "minWith-YmdZ_VM", "minWith-zrEWJaI", "minWith-eOHTfZs", "sumOf", "Ljava/math/BigDecimal;", "sumOfBigDecimal", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "Ljava/math/BigInteger;", "sumOfBigInteger", "([BLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([ILkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([JLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigDecimal;", "([SLkotlin/jvm/functions/Function1;)Ljava/math/BigInteger;", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, pn = "kotlin.collections", xi = 49, xs = "kotlin/collections/unsigned/UArraysKt")
class UArraysKt___UArraysJvmKt {
    /* JADX INFO: renamed from: elementAt-qFRl0hI, reason: not valid java name */
    private static final int m1784elementAtqFRl0hI(int[] elementAt, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return kotlin.UIntArray.m1457getpVg5ArA(elementAt, i);
    }

    /* JADX INFO: renamed from: elementAt-r7IrZao, reason: not valid java name */
    private static final long m1785elementAtr7IrZao(long[] elementAt, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return kotlin.ULongArray.m1536getsVKNKU(elementAt, i);
    }

    /* JADX INFO: renamed from: elementAt-PpDY95g, reason: not valid java name */
    private static final byte m1782elementAtPpDY95g(byte[] elementAt, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return kotlin.UByteArray.m1378getw2LRezQ(elementAt, i);
    }

    /* JADX INFO: renamed from: elementAt-nggk6HY, reason: not valid java name */
    private static final short m1783elementAtnggk6HY(short[] elementAt, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(elementAt, "$this$elementAt");
        return kotlin.UShortArray.m1641getMh2AYeg(elementAt, i);
    }

    /* JADX INFO: renamed from: asList--ajY-9A, reason: not valid java name */
    public static final java.util.List<kotlin.UInt> m1770asListajY9A(int[] asList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$1(asList);
    }

    /* JADX INFO: renamed from: asList-QwZRm1k, reason: not valid java name */
    public static final java.util.List<kotlin.ULong> m1772asListQwZRm1k(long[] asList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$2(asList);
    }

    /* JADX INFO: renamed from: asList-GBYM_sE, reason: not valid java name */
    public static final java.util.List<kotlin.UByte> m1771asListGBYM_sE(byte[] asList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$3(asList);
    }

    /* JADX INFO: renamed from: asList-rL5Bavg, reason: not valid java name */
    public static final java.util.List<kotlin.UShort> m1773asListrL5Bavg(short[] asList) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(asList, "$this$asList");
        return new kotlin.collections.unsigned.UArraysKt___UArraysJvmKt$asList$4(asList);
    }

    /* JADX INFO: renamed from: binarySearch-2fe2U9s$default, reason: not valid java name */
    public static /* synthetic */ int m1775binarySearch2fe2U9s$default(int[] iArr, int i, int i2, int i3, int i4, java.lang.Object obj) {
        if ((i4 & 2) != 0) {
            i2 = 0;
        }
        if ((i4 & 4) != 0) {
            i3 = kotlin.UIntArray.m1458getSizeimpl(iArr);
        }
        return kotlin.collections.unsigned.UArraysKt.m1774binarySearch2fe2U9s(iArr, i, i2, i3);
    }

    /* JADX INFO: renamed from: binarySearch-2fe2U9s, reason: not valid java name */
    public static final int m1774binarySearch2fe2U9s(int[] binarySearch, int i, int i2, int i3) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i2, i3, kotlin.UIntArray.m1458getSizeimpl(binarySearch));
        int i4 = i3 - 1;
        while (i2 <= i4) {
            int i5 = (i2 + i4) >>> 1;
            int iUintCompare = kotlin.UnsignedKt.uintCompare(binarySearch[i5], i);
            if (iUintCompare < 0) {
                i2 = i5 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: renamed from: binarySearch-K6DWlUc$default, reason: not valid java name */
    public static /* synthetic */ int m1779binarySearchK6DWlUc$default(long[] jArr, long j, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = kotlin.ULongArray.m1537getSizeimpl(jArr);
        }
        return kotlin.collections.unsigned.UArraysKt.m1778binarySearchK6DWlUc(jArr, j, i, i2);
    }

    /* JADX INFO: renamed from: binarySearch-K6DWlUc, reason: not valid java name */
    public static final int m1778binarySearchK6DWlUc(long[] binarySearch, long j, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, kotlin.ULongArray.m1537getSizeimpl(binarySearch));
        int i3 = i2 - 1;
        while (i <= i3) {
            int i4 = (i + i3) >>> 1;
            int iUlongCompare = kotlin.UnsignedKt.ulongCompare(binarySearch[i4], j);
            if (iUlongCompare < 0) {
                i = i4 + 1;
            } else {
                if (iUlongCompare <= 0) {
                    return i4;
                }
                i3 = i4 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: binarySearch-WpHrYlw$default, reason: not valid java name */
    public static /* synthetic */ int m1781binarySearchWpHrYlw$default(byte[] bArr, byte b, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = kotlin.UByteArray.m1379getSizeimpl(bArr);
        }
        return kotlin.collections.unsigned.UArraysKt.m1780binarySearchWpHrYlw(bArr, b, i, i2);
    }

    /* JADX INFO: renamed from: binarySearch-WpHrYlw, reason: not valid java name */
    public static final int m1780binarySearchWpHrYlw(byte[] binarySearch, byte b, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, kotlin.UByteArray.m1379getSizeimpl(binarySearch));
        int i3 = b & 255;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int iUintCompare = kotlin.UnsignedKt.uintCompare(binarySearch[i5], i3);
            if (iUintCompare < 0) {
                i = i5 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    /* JADX INFO: renamed from: binarySearch-EtDCXyQ$default, reason: not valid java name */
    public static /* synthetic */ int m1777binarySearchEtDCXyQ$default(short[] sArr, short s, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = kotlin.UShortArray.m1642getSizeimpl(sArr);
        }
        return kotlin.collections.unsigned.UArraysKt.m1776binarySearchEtDCXyQ(sArr, s, i, i2);
    }

    /* JADX INFO: renamed from: binarySearch-EtDCXyQ, reason: not valid java name */
    public static final int m1776binarySearchEtDCXyQ(short[] binarySearch, short s, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(binarySearch, "$this$binarySearch");
        kotlin.collections.AbstractList.INSTANCE.checkRangeIndexes$kotlin_stdlib(i, i2, kotlin.UShortArray.m1642getSizeimpl(binarySearch));
        int i3 = s & kotlin.UShort.MAX_VALUE;
        int i4 = i2 - 1;
        while (i <= i4) {
            int i5 = (i + i4) >>> 1;
            int iUintCompare = kotlin.UnsignedKt.uintCompare(binarySearch[i5], i3);
            if (iUintCompare < 0) {
                i = i5 + 1;
            } else {
                if (iUintCompare <= 0) {
                    return i5;
                }
                i4 = i5 - 1;
            }
        }
        return -(i + 1);
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: max--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m1786maxajY9A(int[] max) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(max, "$this$max");
        return kotlin.collections.unsigned.UArraysKt.m2154maxOrNullajY9A(max);
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: max-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULong m1788maxQwZRm1k(long[] max) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(max, "$this$max");
        return kotlin.collections.unsigned.UArraysKt.m2156maxOrNullQwZRm1k(max);
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: max-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m1787maxGBYM_sE(byte[] max) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(max, "$this$max");
        return kotlin.collections.unsigned.UArraysKt.m2155maxOrNullGBYM_sE(max);
    }

    @kotlin.Deprecated(message = "Use maxOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: max-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m1789maxrL5Bavg(short[] max) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(max, "$this$max");
        return kotlin.collections.unsigned.UArraysKt.m2157maxOrNullrL5Bavg(max);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UInt m1792maxByjgv0xPQ(int[] maxBy, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UIntArray.m1460isEmptyimpl(maxBy)) {
            return null;
        }
        int iM1457getpVg5ArA = kotlin.UIntArray.m1457getpVg5ArA(maxBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(kotlin.UInt.m1391boximpl(iM1457getpVg5ArA));
            ?? it = new kotlin.ranges.IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                int iM1457getpVg5ArA2 = kotlin.UIntArray.m1457getpVg5ArA(maxBy, it.nextInt());
                R rInvoke2 = selector.invoke(kotlin.UInt.m1391boximpl(iM1457getpVg5ArA2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    iM1457getpVg5ArA = iM1457getpVg5ArA2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return kotlin.UInt.m1391boximpl(iM1457getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.ULong m1791maxByMShoTSo(long[] maxBy, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.ULongArray.m1539isEmptyimpl(maxBy)) {
            return null;
        }
        long jM1536getsVKNKU = kotlin.ULongArray.m1536getsVKNKU(maxBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(kotlin.ULong.m1470boximpl(jM1536getsVKNKU));
            ?? it = new kotlin.ranges.IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                long jM1536getsVKNKU2 = kotlin.ULongArray.m1536getsVKNKU(maxBy, it.nextInt());
                R rInvoke2 = selector.invoke(kotlin.ULong.m1470boximpl(jM1536getsVKNKU2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    jM1536getsVKNKU = jM1536getsVKNKU2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return kotlin.ULong.m1470boximpl(jM1536getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UByte m1790maxByJOV_ifY(byte[] maxBy, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UByteArray.m1381isEmptyimpl(maxBy)) {
            return null;
        }
        byte bM1378getw2LRezQ = kotlin.UByteArray.m1378getw2LRezQ(maxBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(kotlin.UByte.m1313boximpl(bM1378getw2LRezQ));
            ?? it = new kotlin.ranges.IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                byte bM1378getw2LRezQ2 = kotlin.UByteArray.m1378getw2LRezQ(maxBy, it.nextInt());
                R rInvoke2 = selector.invoke(kotlin.UByte.m1313boximpl(bM1378getw2LRezQ2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    bM1378getw2LRezQ = bM1378getw2LRezQ2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return kotlin.UByte.m1313boximpl(bM1378getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    @kotlin.Deprecated(message = "Use maxByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UShort m1793maxByxTcfx_M(short[] maxBy, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxBy, "$this$maxBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UShortArray.m1644isEmptyimpl(maxBy)) {
            return null;
        }
        short sM1641getMh2AYeg = kotlin.UShortArray.m1641getMh2AYeg(maxBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(maxBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(kotlin.UShort.m1577boximpl(sM1641getMh2AYeg));
            ?? it = new kotlin.ranges.IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                short sM1641getMh2AYeg2 = kotlin.UShortArray.m1641getMh2AYeg(maxBy, it.nextInt());
                R rInvoke2 = selector.invoke(kotlin.UShort.m1577boximpl(sM1641getMh2AYeg2));
                if (rInvoke.compareTo(rInvoke2) < 0) {
                    sM1641getMh2AYeg = sM1641getMh2AYeg2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return kotlin.UShort.m1577boximpl(sM1641getMh2AYeg);
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m1795maxWithYmdZ_VM(int[] maxWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m2163maxWithOrNullYmdZ_VM(maxWith, comparator);
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULong m1797maxWithzrEWJaI(long[] maxWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m2165maxWithOrNullzrEWJaI(maxWith, comparator);
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m1794maxWithXMRcp5o(byte[] maxWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m2162maxWithOrNullXMRcp5o(maxWith, comparator);
    }

    @kotlin.Deprecated(message = "Use maxWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.maxWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: maxWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m1796maxWitheOHTfZs(short[] maxWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(maxWith, "$this$maxWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m2164maxWithOrNulleOHTfZs(maxWith, comparator);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: min--ajY-9A, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m1798minajY9A(int[] min) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(min, "$this$min");
        return kotlin.collections.unsigned.UArraysKt.m2210minOrNullajY9A(min);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: min-QwZRm1k, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULong m1800minQwZRm1k(long[] min) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(min, "$this$min");
        return kotlin.collections.unsigned.UArraysKt.m2212minOrNullQwZRm1k(min);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: min-GBYM_sE, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m1799minGBYM_sE(byte[] min) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(min, "$this$min");
        return kotlin.collections.unsigned.UArraysKt.m2211minOrNullGBYM_sE(min);
    }

    @kotlin.Deprecated(message = "Use minOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minOrNull()", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: min-rL5Bavg, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m1801minrL5Bavg(short[] min) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(min, "$this$min");
        return kotlin.collections.unsigned.UArraysKt.m2213minOrNullrL5Bavg(min);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minBy-jgv0xPQ, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UInt m1804minByjgv0xPQ(int[] minBy, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UIntArray.m1460isEmptyimpl(minBy)) {
            return null;
        }
        int iM1457getpVg5ArA = kotlin.UIntArray.m1457getpVg5ArA(minBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(kotlin.UInt.m1391boximpl(iM1457getpVg5ArA));
            ?? it = new kotlin.ranges.IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                int iM1457getpVg5ArA2 = kotlin.UIntArray.m1457getpVg5ArA(minBy, it.nextInt());
                R rInvoke2 = selector.invoke(kotlin.UInt.m1391boximpl(iM1457getpVg5ArA2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    iM1457getpVg5ArA = iM1457getpVg5ArA2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return kotlin.UInt.m1391boximpl(iM1457getpVg5ArA);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [kotlin.collections.IntIterator] */
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minBy-MShoTSo, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.ULong m1803minByMShoTSo(long[] minBy, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.ULongArray.m1539isEmptyimpl(minBy)) {
            return null;
        }
        long jM1536getsVKNKU = kotlin.ULongArray.m1536getsVKNKU(minBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(kotlin.ULong.m1470boximpl(jM1536getsVKNKU));
            ?? it = new kotlin.ranges.IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                long jM1536getsVKNKU2 = kotlin.ULongArray.m1536getsVKNKU(minBy, it.nextInt());
                R rInvoke2 = selector.invoke(kotlin.ULong.m1470boximpl(jM1536getsVKNKU2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    jM1536getsVKNKU = jM1536getsVKNKU2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return kotlin.ULong.m1470boximpl(jM1536getsVKNKU);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minBy-JOV_ifY, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UByte m1802minByJOV_ifY(byte[] minBy, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UByteArray.m1381isEmptyimpl(minBy)) {
            return null;
        }
        byte bM1378getw2LRezQ = kotlin.UByteArray.m1378getw2LRezQ(minBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(kotlin.UByte.m1313boximpl(bM1378getw2LRezQ));
            ?? it = new kotlin.ranges.IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                byte bM1378getw2LRezQ2 = kotlin.UByteArray.m1378getw2LRezQ(minBy, it.nextInt());
                R rInvoke2 = selector.invoke(kotlin.UByte.m1313boximpl(bM1378getw2LRezQ2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    bM1378getw2LRezQ = bM1378getw2LRezQ2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return kotlin.UByte.m1313boximpl(bM1378getw2LRezQ);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [kotlin.collections.IntIterator] */
    @kotlin.Deprecated(message = "Use minByOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minByOrNull(selector)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minBy-xTcfx_M, reason: not valid java name */
    private static final /* synthetic */ <R extends java.lang.Comparable<? super R>> kotlin.UShort m1805minByxTcfx_M(short[] minBy, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends R> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minBy, "$this$minBy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        if (kotlin.UShortArray.m1644isEmptyimpl(minBy)) {
            return null;
        }
        short sM1641getMh2AYeg = kotlin.UShortArray.m1641getMh2AYeg(minBy, 0);
        int lastIndex = kotlin.collections.ArraysKt.getLastIndex(minBy);
        if (lastIndex != 0) {
            R rInvoke = selector.invoke(kotlin.UShort.m1577boximpl(sM1641getMh2AYeg));
            ?? it = new kotlin.ranges.IntRange(1, lastIndex).iterator();
            while (it.hasNext()) {
                short sM1641getMh2AYeg2 = kotlin.UShortArray.m1641getMh2AYeg(minBy, it.nextInt());
                R rInvoke2 = selector.invoke(kotlin.UShort.m1577boximpl(sM1641getMh2AYeg2));
                if (rInvoke.compareTo(rInvoke2) > 0) {
                    sM1641getMh2AYeg = sM1641getMh2AYeg2;
                    rInvoke = rInvoke2;
                }
            }
        }
        return kotlin.UShort.m1577boximpl(sM1641getMh2AYeg);
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minWith-YmdZ_VM, reason: not valid java name */
    public static final /* synthetic */ kotlin.UInt m1807minWithYmdZ_VM(int[] minWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m2219minWithOrNullYmdZ_VM(minWith, comparator);
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minWith-zrEWJaI, reason: not valid java name */
    public static final /* synthetic */ kotlin.ULong m1809minWithzrEWJaI(long[] minWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m2221minWithOrNullzrEWJaI(minWith, comparator);
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minWith-XMRcp5o, reason: not valid java name */
    public static final /* synthetic */ kotlin.UByte m1806minWithXMRcp5o(byte[] minWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m2218minWithOrNullXMRcp5o(minWith, comparator);
    }

    @kotlin.Deprecated(message = "Use minWithOrNull instead.", replaceWith = @kotlin.ReplaceWith(expression = "this.minWithOrNull(comparator)", imports = {}))
    @kotlin.DeprecatedSinceKotlin(errorSince = "1.5", hiddenSince = "1.6", warningSince = "1.4")
    /* JADX INFO: renamed from: minWith-eOHTfZs, reason: not valid java name */
    public static final /* synthetic */ kotlin.UShort m1808minWitheOHTfZs(short[] minWith, java.util.Comparator comparator) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(minWith, "$this$minWith");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(comparator, "comparator");
        return kotlin.collections.unsigned.UArraysKt.m2220minWithOrNulleOHTfZs(minWith, comparator);
    }

    private static final java.math.BigDecimal sumOfBigDecimal(int[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends java.math.BigDecimal> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iM1458getSizeimpl = kotlin.UIntArray.m1458getSizeimpl(sumOf);
        for (int i = 0; i < iM1458getSizeimpl; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(kotlin.UInt.m1391boximpl(kotlin.UIntArray.m1457getpVg5ArA(sumOf, i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    private static final java.math.BigDecimal sumOfBigDecimal(long[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends java.math.BigDecimal> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iM1537getSizeimpl = kotlin.ULongArray.m1537getSizeimpl(sumOf);
        for (int i = 0; i < iM1537getSizeimpl; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(kotlin.ULong.m1470boximpl(kotlin.ULongArray.m1536getsVKNKU(sumOf, i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    private static final java.math.BigDecimal sumOfBigDecimal(byte[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends java.math.BigDecimal> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iM1379getSizeimpl = kotlin.UByteArray.m1379getSizeimpl(sumOf);
        for (int i = 0; i < iM1379getSizeimpl; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(kotlin.UByte.m1313boximpl(kotlin.UByteArray.m1378getw2LRezQ(sumOf, i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    private static final java.math.BigDecimal sumOfBigDecimal(short[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends java.math.BigDecimal> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigDecimal bigDecimalValueOf = java.math.BigDecimal.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        int iM1642getSizeimpl = kotlin.UShortArray.m1642getSizeimpl(sumOf);
        for (int i = 0; i < iM1642getSizeimpl; i++) {
            bigDecimalValueOf = bigDecimalValueOf.add(selector.invoke(kotlin.UShort.m1577boximpl(kotlin.UShortArray.m1641getMh2AYeg(sumOf, i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "add(...)");
        }
        return bigDecimalValueOf;
    }

    private static final java.math.BigInteger sumOfBigInteger(int[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UInt, ? extends java.math.BigInteger> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iM1458getSizeimpl = kotlin.UIntArray.m1458getSizeimpl(sumOf);
        for (int i = 0; i < iM1458getSizeimpl; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(kotlin.UInt.m1391boximpl(kotlin.UIntArray.m1457getpVg5ArA(sumOf, i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    private static final java.math.BigInteger sumOfBigInteger(long[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.ULong, ? extends java.math.BigInteger> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iM1537getSizeimpl = kotlin.ULongArray.m1537getSizeimpl(sumOf);
        for (int i = 0; i < iM1537getSizeimpl; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(kotlin.ULong.m1470boximpl(kotlin.ULongArray.m1536getsVKNKU(sumOf, i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    private static final java.math.BigInteger sumOfBigInteger(byte[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UByte, ? extends java.math.BigInteger> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iM1379getSizeimpl = kotlin.UByteArray.m1379getSizeimpl(sumOf);
        for (int i = 0; i < iM1379getSizeimpl; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(kotlin.UByte.m1313boximpl(kotlin.UByteArray.m1378getw2LRezQ(sumOf, i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }

    private static final java.math.BigInteger sumOfBigInteger(short[] sumOf, kotlin.jvm.functions.Function1<? super kotlin.UShort, ? extends java.math.BigInteger> selector) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(sumOf, "$this$sumOf");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(selector, "selector");
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(0L);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "valueOf(...)");
        int iM1642getSizeimpl = kotlin.UShortArray.m1642getSizeimpl(sumOf);
        for (int i = 0; i < iM1642getSizeimpl; i++) {
            bigIntegerValueOf = bigIntegerValueOf.add(selector.invoke(kotlin.UShort.m1577boximpl(kotlin.UShortArray.m1641getMh2AYeg(sumOf, i))));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bigIntegerValueOf, "add(...)");
        }
        return bigIntegerValueOf;
    }
}
