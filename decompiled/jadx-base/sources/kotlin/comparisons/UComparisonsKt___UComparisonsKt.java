package kotlin.comparisons;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _UComparisons.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000B\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a(\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b\u0007\u0010\b\u001a#\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0001H\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001f\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a(\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a#\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\n\u0010\t\u001a\u00020\u0012\"\u00020\rH\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001f\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a(\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b¢\u0006\u0004\b\u0018\u0010\u0019\u001a#\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u001a\"\u00020\u0015H\u0007¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u001f\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001dH\u0007¢\u0006\u0004\b\u001e\u0010\u001f\u001a(\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\u0087\b¢\u0006\u0004\b \u0010!\u001a#\u0010\u0000\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\n\u0010\t\u001a\u00020\"\"\u00020\u001dH\u0007¢\u0006\u0004\b#\u0010$\u001a\u001f\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\u0007¢\u0006\u0004\b&\u0010\u0005\u001a(\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0001H\u0087\b¢\u0006\u0004\b'\u0010\b\u001a#\u0010%\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\n\u0010\t\u001a\u00020\n\"\u00020\u0001H\u0007¢\u0006\u0004\b(\u0010\f\u001a\u001f\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\rH\u0007¢\u0006\u0004\b)\u0010\u000f\u001a(\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b¢\u0006\u0004\b*\u0010\u0011\u001a#\u0010%\u001a\u00020\r2\u0006\u0010\u0002\u001a\u00020\r2\n\u0010\t\u001a\u00020\u0012\"\u00020\rH\u0007¢\u0006\u0004\b+\u0010\u0014\u001a\u001f\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0015H\u0007¢\u0006\u0004\b,\u0010\u0017\u001a(\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b¢\u0006\u0004\b-\u0010\u0019\u001a#\u0010%\u001a\u00020\u00152\u0006\u0010\u0002\u001a\u00020\u00152\n\u0010\t\u001a\u00020\u001a\"\u00020\u0015H\u0007¢\u0006\u0004\b.\u0010\u001c\u001a\u001f\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001dH\u0007¢\u0006\u0004\b/\u0010\u001f\u001a(\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\u0006\u0010\u0003\u001a\u00020\u001d2\u0006\u0010\u0006\u001a\u00020\u001dH\u0087\b¢\u0006\u0004\b0\u0010!\u001a#\u0010%\u001a\u00020\u001d2\u0006\u0010\u0002\u001a\u00020\u001d2\n\u0010\t\u001a\u00020\"\"\u00020\u001dH\u0007¢\u0006\u0004\b1\u0010$¨\u00062"}, d2 = {"maxOf", "Lkotlin/UByte;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "maxOf-Kr8caGY", "(BB)B", "c", "maxOf-b33U2AM", "(BBB)B", "other", "Lkotlin/UByteArray;", "maxOf-Wr6uiD8", "(B[B)B", "Lkotlin/UInt;", "maxOf-J1ME1BU", "(II)I", "maxOf-WZ9TVnA", "(III)I", "Lkotlin/UIntArray;", "maxOf-Md2H83M", "(I[I)I", "Lkotlin/ULong;", "maxOf-eb3DHEI", "(JJ)J", "maxOf-sambcqE", "(JJJ)J", "Lkotlin/ULongArray;", "maxOf-R03FKyM", "(J[J)J", "Lkotlin/UShort;", "maxOf-5PvTz6A", "(SS)S", "maxOf-VKSA0NQ", "(SSS)S", "Lkotlin/UShortArray;", "maxOf-t1qELG4", "(S[S)S", "minOf", "minOf-Kr8caGY", "minOf-b33U2AM", "minOf-Wr6uiD8", "minOf-J1ME1BU", "minOf-WZ9TVnA", "minOf-Md2H83M", "minOf-eb3DHEI", "minOf-sambcqE", "minOf-R03FKyM", "minOf-5PvTz6A", "minOf-VKSA0NQ", "minOf-t1qELG4", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/UComparisonsKt")
public class UComparisonsKt___UComparisonsKt {
    /* JADX INFO: renamed from: maxOf-J1ME1BU, reason: not valid java name */
    public static final int m2485maxOfJ1ME1BU(int i, int i2) {
        return java.lang.Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) >= 0 ? i : i2;
    }

    /* JADX INFO: renamed from: maxOf-eb3DHEI, reason: not valid java name */
    public static final long m2493maxOfeb3DHEI(long j, long j2) {
        return java.lang.Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) >= 0 ? j : j2;
    }

    /* JADX INFO: renamed from: maxOf-Kr8caGY, reason: not valid java name */
    public static final byte m2486maxOfKr8caGY(byte b, byte b2) {
        return kotlin.jvm.internal.Intrinsics.compare(b & 255, b2 & 255) >= 0 ? b : b2;
    }

    /* JADX INFO: renamed from: maxOf-5PvTz6A, reason: not valid java name */
    public static final short m2484maxOf5PvTz6A(short s, short s2) {
        return kotlin.jvm.internal.Intrinsics.compare(s & kotlin.UShort.MAX_VALUE, 65535 & s2) >= 0 ? s : s2;
    }

    /* JADX INFO: renamed from: maxOf-WZ9TVnA, reason: not valid java name */
    private static final int m2490maxOfWZ9TVnA(int i, int i2, int i3) {
        return kotlin.comparisons.UComparisonsKt.m2485maxOfJ1ME1BU(i, kotlin.comparisons.UComparisonsKt.m2485maxOfJ1ME1BU(i2, i3));
    }

    /* JADX INFO: renamed from: maxOf-sambcqE, reason: not valid java name */
    private static final long m2494maxOfsambcqE(long j, long j2, long j3) {
        return kotlin.comparisons.UComparisonsKt.m2493maxOfeb3DHEI(j, kotlin.comparisons.UComparisonsKt.m2493maxOfeb3DHEI(j2, j3));
    }

    /* JADX INFO: renamed from: maxOf-b33U2AM, reason: not valid java name */
    private static final byte m2492maxOfb33U2AM(byte b, byte b2, byte b3) {
        return kotlin.comparisons.UComparisonsKt.m2486maxOfKr8caGY(b, kotlin.comparisons.UComparisonsKt.m2486maxOfKr8caGY(b2, b3));
    }

    /* JADX INFO: renamed from: maxOf-VKSA0NQ, reason: not valid java name */
    private static final short m2489maxOfVKSA0NQ(short s, short s2, short s3) {
        return kotlin.comparisons.UComparisonsKt.m2484maxOf5PvTz6A(s, kotlin.comparisons.UComparisonsKt.m2484maxOf5PvTz6A(s2, s3));
    }

    /* JADX INFO: renamed from: maxOf-Md2H83M, reason: not valid java name */
    public static final int m2487maxOfMd2H83M(int i, int... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int iM1458getSizeimpl = kotlin.UIntArray.m1458getSizeimpl(other);
        for (int i2 = 0; i2 < iM1458getSizeimpl; i2++) {
            i = kotlin.comparisons.UComparisonsKt.m2485maxOfJ1ME1BU(i, kotlin.UIntArray.m1457getpVg5ArA(other, i2));
        }
        return i;
    }

    /* JADX INFO: renamed from: maxOf-R03FKyM, reason: not valid java name */
    public static final long m2488maxOfR03FKyM(long j, long... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int iM1537getSizeimpl = kotlin.ULongArray.m1537getSizeimpl(other);
        for (int i = 0; i < iM1537getSizeimpl; i++) {
            j = kotlin.comparisons.UComparisonsKt.m2493maxOfeb3DHEI(j, kotlin.ULongArray.m1536getsVKNKU(other, i));
        }
        return j;
    }

    /* JADX INFO: renamed from: maxOf-Wr6uiD8, reason: not valid java name */
    public static final byte m2491maxOfWr6uiD8(byte b, byte... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int iM1379getSizeimpl = kotlin.UByteArray.m1379getSizeimpl(other);
        for (int i = 0; i < iM1379getSizeimpl; i++) {
            b = kotlin.comparisons.UComparisonsKt.m2486maxOfKr8caGY(b, kotlin.UByteArray.m1378getw2LRezQ(other, i));
        }
        return b;
    }

    /* JADX INFO: renamed from: maxOf-t1qELG4, reason: not valid java name */
    public static final short m2495maxOft1qELG4(short s, short... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int iM1642getSizeimpl = kotlin.UShortArray.m1642getSizeimpl(other);
        for (int i = 0; i < iM1642getSizeimpl; i++) {
            s = kotlin.comparisons.UComparisonsKt.m2484maxOf5PvTz6A(s, kotlin.UShortArray.m1641getMh2AYeg(other, i));
        }
        return s;
    }

    /* JADX INFO: renamed from: minOf-J1ME1BU, reason: not valid java name */
    public static final int m2497minOfJ1ME1BU(int i, int i2) {
        return java.lang.Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) <= 0 ? i : i2;
    }

    /* JADX INFO: renamed from: minOf-eb3DHEI, reason: not valid java name */
    public static final long m2505minOfeb3DHEI(long j, long j2) {
        return java.lang.Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) <= 0 ? j : j2;
    }

    /* JADX INFO: renamed from: minOf-Kr8caGY, reason: not valid java name */
    public static final byte m2498minOfKr8caGY(byte b, byte b2) {
        return kotlin.jvm.internal.Intrinsics.compare(b & 255, b2 & 255) <= 0 ? b : b2;
    }

    /* JADX INFO: renamed from: minOf-5PvTz6A, reason: not valid java name */
    public static final short m2496minOf5PvTz6A(short s, short s2) {
        return kotlin.jvm.internal.Intrinsics.compare(s & kotlin.UShort.MAX_VALUE, 65535 & s2) <= 0 ? s : s2;
    }

    /* JADX INFO: renamed from: minOf-WZ9TVnA, reason: not valid java name */
    private static final int m2502minOfWZ9TVnA(int i, int i2, int i3) {
        return kotlin.comparisons.UComparisonsKt.m2497minOfJ1ME1BU(i, kotlin.comparisons.UComparisonsKt.m2497minOfJ1ME1BU(i2, i3));
    }

    /* JADX INFO: renamed from: minOf-sambcqE, reason: not valid java name */
    private static final long m2506minOfsambcqE(long j, long j2, long j3) {
        return kotlin.comparisons.UComparisonsKt.m2505minOfeb3DHEI(j, kotlin.comparisons.UComparisonsKt.m2505minOfeb3DHEI(j2, j3));
    }

    /* JADX INFO: renamed from: minOf-b33U2AM, reason: not valid java name */
    private static final byte m2504minOfb33U2AM(byte b, byte b2, byte b3) {
        return kotlin.comparisons.UComparisonsKt.m2498minOfKr8caGY(b, kotlin.comparisons.UComparisonsKt.m2498minOfKr8caGY(b2, b3));
    }

    /* JADX INFO: renamed from: minOf-VKSA0NQ, reason: not valid java name */
    private static final short m2501minOfVKSA0NQ(short s, short s2, short s3) {
        return kotlin.comparisons.UComparisonsKt.m2496minOf5PvTz6A(s, kotlin.comparisons.UComparisonsKt.m2496minOf5PvTz6A(s2, s3));
    }

    /* JADX INFO: renamed from: minOf-Md2H83M, reason: not valid java name */
    public static final int m2499minOfMd2H83M(int i, int... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int iM1458getSizeimpl = kotlin.UIntArray.m1458getSizeimpl(other);
        for (int i2 = 0; i2 < iM1458getSizeimpl; i2++) {
            i = kotlin.comparisons.UComparisonsKt.m2497minOfJ1ME1BU(i, kotlin.UIntArray.m1457getpVg5ArA(other, i2));
        }
        return i;
    }

    /* JADX INFO: renamed from: minOf-R03FKyM, reason: not valid java name */
    public static final long m2500minOfR03FKyM(long j, long... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int iM1537getSizeimpl = kotlin.ULongArray.m1537getSizeimpl(other);
        for (int i = 0; i < iM1537getSizeimpl; i++) {
            j = kotlin.comparisons.UComparisonsKt.m2505minOfeb3DHEI(j, kotlin.ULongArray.m1536getsVKNKU(other, i));
        }
        return j;
    }

    /* JADX INFO: renamed from: minOf-Wr6uiD8, reason: not valid java name */
    public static final byte m2503minOfWr6uiD8(byte b, byte... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int iM1379getSizeimpl = kotlin.UByteArray.m1379getSizeimpl(other);
        for (int i = 0; i < iM1379getSizeimpl; i++) {
            b = kotlin.comparisons.UComparisonsKt.m2498minOfKr8caGY(b, kotlin.UByteArray.m1378getw2LRezQ(other, i));
        }
        return b;
    }

    /* JADX INFO: renamed from: minOf-t1qELG4, reason: not valid java name */
    public static final short m2507minOft1qELG4(short s, short... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        int iM1642getSizeimpl = kotlin.UShortArray.m1642getSizeimpl(other);
        for (int i = 0; i < iM1642getSizeimpl; i++) {
            s = kotlin.comparisons.UComparisonsKt.m2496minOf5PvTz6A(s, kotlin.UShortArray.m1641getMh2AYeg(other, i));
        }
        return s;
    }
}
