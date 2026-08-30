package kotlin.comparisons;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: _ComparisonsJvm.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000F\n\u0002\b\u0002\n\u0002\u0010\u000f\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\u0010\u0006\n\u0002\u0010\u0013\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\u0010\b\n\u0002\u0010\u0015\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\u0010\n\n\u0002\u0010\u0017\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a5\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0006\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0007\u001a9\u0010\u0000\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\t\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a!\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\f\"\u00020\u000bH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0087\b\u001a!\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\n\u0010\b\u001a\u00020\u000e\"\u00020\rH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\n\u0010\b\u001a\u00020\u0010\"\u00020\u000fH\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\n\u0010\b\u001a\u00020\u0012\"\u00020\u0011H\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0013H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0013H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\n\u0010\b\u001a\u00020\u0014\"\u00020\u0013H\u0007\u001a\u0019\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0087\b\u001a!\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b\u001a\u001c\u0010\u0000\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\n\u0010\b\u001a\u00020\u0016\"\u00020\u0015H\u0007\u001a-\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0005\u001a5\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0006\u0010\u0004\u001a\u0002H\u00012\u0006\u0010\u0006\u001a\u0002H\u0001H\u0007¢\u0006\u0002\u0010\u0007\u001a9\u0010\u0017\u001a\u0002H\u0001\"\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u0002H\u00012\u0012\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00010\t\"\u0002H\u0001H\u0007¢\u0006\u0002\u0010\n\u001a\u0019\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000bH\u0087\b\u001a!\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u000bH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\f\"\u00020\u000bH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\rH\u0087\b\u001a!\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\u0006\u0010\u0004\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\rH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\r2\n\u0010\b\u001a\u00020\u000e\"\u00020\rH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000fH\u0087\b\u001a!\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\u0006\u0010\u0004\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u000fH\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u000f2\n\u0010\b\u001a\u00020\u0010\"\u00020\u000fH\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0011H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0011H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00112\n\u0010\b\u001a\u00020\u0012\"\u00020\u0011H\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0013H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0013H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00132\n\u0010\b\u001a\u00020\u0014\"\u00020\u0013H\u0007\u001a\u0019\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0015H\u0087\b\u001a!\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00152\u0006\u0010\u0006\u001a\u00020\u0015H\u0087\b\u001a\u001c\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00152\n\u0010\b\u001a\u00020\u0016\"\u00020\u0015H\u0007¨\u0006\u0018"}, d2 = {"maxOf", "T", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "(Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "c", "(Ljava/lang/Comparable;Ljava/lang/Comparable;Ljava/lang/Comparable;)Ljava/lang/Comparable;", "other", "", "(Ljava/lang/Comparable;[Ljava/lang/Comparable;)Ljava/lang/Comparable;", "", "", "", "", "", "", "", "", "", "", "", "", "minOf", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/comparisons/ComparisonsKt")
public class ComparisonsKt___ComparisonsJvmKt extends kotlin.comparisons.ComparisonsKt__ComparisonsKt {
    public static final <T extends java.lang.Comparable<? super T>> T maxOf(T a2, T b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "a");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "b");
        return a2.compareTo(b) >= 0 ? a2 : b;
    }

    private static final byte maxOf(byte b, byte b2) {
        return (byte) java.lang.Math.max((int) b, (int) b2);
    }

    private static final short maxOf(short s, short s2) {
        return (short) java.lang.Math.max((int) s, (int) s2);
    }

    private static final int maxOf(int i, int i2) {
        return java.lang.Math.max(i, i2);
    }

    private static final long maxOf(long j, long j2) {
        return java.lang.Math.max(j, j2);
    }

    private static final float maxOf(float f, float f2) {
        return java.lang.Math.max(f, f2);
    }

    private static final double maxOf(double d, double d2) {
        return java.lang.Math.max(d, d2);
    }

    public static final <T extends java.lang.Comparable<? super T>> T maxOf(T a2, T b, T c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "a");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "b");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "c");
        return (T) kotlin.comparisons.ComparisonsKt.maxOf(a2, kotlin.comparisons.ComparisonsKt.maxOf(b, c));
    }

    private static final byte maxOf(byte b, byte b2, byte b3) {
        return (byte) java.lang.Math.max((int) b, java.lang.Math.max((int) b2, (int) b3));
    }

    private static final short maxOf(short s, short s2, short s3) {
        return (short) java.lang.Math.max((int) s, java.lang.Math.max((int) s2, (int) s3));
    }

    private static final int maxOf(int i, int i2, int i3) {
        return java.lang.Math.max(i, java.lang.Math.max(i2, i3));
    }

    private static final long maxOf(long j, long j2, long j3) {
        return java.lang.Math.max(j, java.lang.Math.max(j2, j3));
    }

    private static final float maxOf(float f, float f2, float f3) {
        return java.lang.Math.max(f, java.lang.Math.max(f2, f3));
    }

    private static final double maxOf(double d, double d2, double d3) {
        return java.lang.Math.max(d, java.lang.Math.max(d2, d3));
    }

    public static final <T extends java.lang.Comparable<? super T>> T maxOf(T a2, T... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "a");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        for (T t : other) {
            a2 = (T) kotlin.comparisons.ComparisonsKt.maxOf(a2, t);
        }
        return a2;
    }

    public static final byte maxOf(byte b, byte... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        for (byte b2 : other) {
            b = (byte) java.lang.Math.max((int) b, (int) b2);
        }
        return b;
    }

    public static final short maxOf(short s, short... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        for (short s2 : other) {
            s = (short) java.lang.Math.max((int) s, (int) s2);
        }
        return s;
    }

    public static final int maxOf(int i, int... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        for (int i2 : other) {
            i = java.lang.Math.max(i, i2);
        }
        return i;
    }

    public static final long maxOf(long j, long... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        for (long j2 : other) {
            j = java.lang.Math.max(j, j2);
        }
        return j;
    }

    public static final float maxOf(float f, float... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        for (float f2 : other) {
            f = java.lang.Math.max(f, f2);
        }
        return f;
    }

    public static final double maxOf(double d, double... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        for (double d2 : other) {
            d = java.lang.Math.max(d, d2);
        }
        return d;
    }

    public static final <T extends java.lang.Comparable<? super T>> T minOf(T a2, T b) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "a");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "b");
        return a2.compareTo(b) <= 0 ? a2 : b;
    }

    private static final byte minOf(byte b, byte b2) {
        return (byte) java.lang.Math.min((int) b, (int) b2);
    }

    private static final short minOf(short s, short s2) {
        return (short) java.lang.Math.min((int) s, (int) s2);
    }

    private static final int minOf(int i, int i2) {
        return java.lang.Math.min(i, i2);
    }

    private static final long minOf(long j, long j2) {
        return java.lang.Math.min(j, j2);
    }

    private static final float minOf(float f, float f2) {
        return java.lang.Math.min(f, f2);
    }

    private static final double minOf(double d, double d2) {
        return java.lang.Math.min(d, d2);
    }

    public static final <T extends java.lang.Comparable<? super T>> T minOf(T a2, T b, T c) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "a");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "b");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "c");
        return (T) kotlin.comparisons.ComparisonsKt.minOf(a2, kotlin.comparisons.ComparisonsKt.minOf(b, c));
    }

    private static final byte minOf(byte b, byte b2, byte b3) {
        return (byte) java.lang.Math.min((int) b, java.lang.Math.min((int) b2, (int) b3));
    }

    private static final short minOf(short s, short s2, short s3) {
        return (short) java.lang.Math.min((int) s, java.lang.Math.min((int) s2, (int) s3));
    }

    private static final int minOf(int i, int i2, int i3) {
        return java.lang.Math.min(i, java.lang.Math.min(i2, i3));
    }

    private static final long minOf(long j, long j2, long j3) {
        return java.lang.Math.min(j, java.lang.Math.min(j2, j3));
    }

    private static final float minOf(float f, float f2, float f3) {
        return java.lang.Math.min(f, java.lang.Math.min(f2, f3));
    }

    private static final double minOf(double d, double d2, double d3) {
        return java.lang.Math.min(d, java.lang.Math.min(d2, d3));
    }

    public static final <T extends java.lang.Comparable<? super T>> T minOf(T a2, T... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a2, "a");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        for (T t : other) {
            a2 = (T) kotlin.comparisons.ComparisonsKt.minOf(a2, t);
        }
        return a2;
    }

    public static final byte minOf(byte b, byte... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        for (byte b2 : other) {
            b = (byte) java.lang.Math.min((int) b, (int) b2);
        }
        return b;
    }

    public static final short minOf(short s, short... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        for (short s2 : other) {
            s = (short) java.lang.Math.min((int) s, (int) s2);
        }
        return s;
    }

    public static final int minOf(int i, int... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        for (int i2 : other) {
            i = java.lang.Math.min(i, i2);
        }
        return i;
    }

    public static final long minOf(long j, long... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        for (long j2 : other) {
            j = java.lang.Math.min(j, j2);
        }
        return j;
    }

    public static final float minOf(float f, float... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        for (float f2 : other) {
            f = java.lang.Math.min(f, f2);
        }
        return f;
    }

    public static final double minOf(double d, double... other) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(other, "other");
        for (double d2 : other) {
            d = java.lang.Math.min(d, d2);
        }
        return d;
    }
}
