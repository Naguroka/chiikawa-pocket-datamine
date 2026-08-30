package kotlin;

/* JADX INFO: compiled from: UnsignedUtils.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0015\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0004\u001a\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u0007\u001a\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0001\u001a\u001f\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u001f\u0010\u000f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u0001H\u0001¢\u0006\u0004\b\u0010\u0010\u000e\u001a\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\tH\u0001\u001a\u0018\u0010\u0012\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\u0013H\u0001\u001a\u001f\u0010\u0014\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u001f\u0010\u0017\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0018\u0010\u0016\u001a\u0010\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00020\u0013H\u0001\u001a\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u0013H\u0000\u001a\u0018\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0002\u001a\u00020\u00132\u0006\u0010\u001c\u001a\u00020\tH\u0000¨\u0006\u001d"}, d2 = {"doubleToUInt", "Lkotlin/UInt;", "v", "", "(D)I", "doubleToULong", "Lkotlin/ULong;", "(D)J", "uintCompare", "", "v1", "v2", "uintDivide", "uintDivide-J1ME1BU", "(II)I", "uintRemainder", "uintRemainder-J1ME1BU", "uintToDouble", "ulongCompare", "", "ulongDivide", "ulongDivide-eb3DHEI", "(JJ)J", "ulongRemainder", "ulongRemainder-eb3DHEI", "ulongToDouble", "ulongToString", "", androidx.media3.extractor.text.ttml.TtmlNode.RUBY_BASE, "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class UnsignedKt {
    public static final double uintToDouble(int i) {
        return ((double) (Integer.MAX_VALUE & i)) + (((double) ((i >>> 31) << 30)) * ((double) 2));
    }

    public static final double ulongToDouble(long j) {
        return ((j >>> 11) * ((double) 2048)) + (j & 2047);
    }

    public static final int uintCompare(int i, int i2) {
        return kotlin.jvm.internal.Intrinsics.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
    }

    public static final int ulongCompare(long j, long j2) {
        return kotlin.jvm.internal.Intrinsics.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE);
    }

    /* JADX INFO: renamed from: uintDivide-J1ME1BU, reason: not valid java name */
    public static final int m1653uintDivideJ1ME1BU(int i, int i2) {
        return kotlin.UInt.m1397constructorimpl((int) ((((long) i) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) / (((long) i2) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE)));
    }

    /* JADX INFO: renamed from: uintRemainder-J1ME1BU, reason: not valid java name */
    public static final int m1654uintRemainderJ1ME1BU(int i, int i2) {
        return kotlin.UInt.m1397constructorimpl((int) ((((long) i) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE) % (((long) i2) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE)));
    }

    /* JADX INFO: renamed from: ulongDivide-eb3DHEI, reason: not valid java name */
    public static final long m1655ulongDivideeb3DHEI(long j, long j2) {
        if (j2 < 0) {
            return java.lang.Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) < 0 ? kotlin.ULong.m1476constructorimpl(0L) : kotlin.ULong.m1476constructorimpl(1L);
        }
        if (j >= 0) {
            return kotlin.ULong.m1476constructorimpl(j / j2);
        }
        long j3 = ((j >>> 1) / j2) << 1;
        return kotlin.ULong.m1476constructorimpl(j3 + ((long) (java.lang.Long.compare(kotlin.ULong.m1476constructorimpl(j - (j3 * j2)) ^ Long.MIN_VALUE, kotlin.ULong.m1476constructorimpl(j2) ^ Long.MIN_VALUE) < 0 ? 0 : 1)));
    }

    /* JADX INFO: renamed from: ulongRemainder-eb3DHEI, reason: not valid java name */
    public static final long m1656ulongRemaindereb3DHEI(long j, long j2) {
        if (j2 < 0) {
            return java.lang.Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) < 0 ? j : kotlin.ULong.m1476constructorimpl(j - j2);
        }
        if (j >= 0) {
            return kotlin.ULong.m1476constructorimpl(j % j2);
        }
        long j3 = j - ((((j >>> 1) / j2) << 1) * j2);
        if (java.lang.Long.compare(kotlin.ULong.m1476constructorimpl(j3) ^ Long.MIN_VALUE, kotlin.ULong.m1476constructorimpl(j2) ^ Long.MIN_VALUE) < 0) {
            j2 = 0;
        }
        return kotlin.ULong.m1476constructorimpl(j3 - j2);
    }

    public static final int doubleToUInt(double d) {
        if (java.lang.Double.isNaN(d) || d <= uintToDouble(0)) {
            return 0;
        }
        if (d >= uintToDouble(-1)) {
            return -1;
        }
        if (d <= 2.147483647E9d) {
            return kotlin.UInt.m1397constructorimpl((int) d);
        }
        return kotlin.UInt.m1397constructorimpl(kotlin.UInt.m1397constructorimpl((int) (d - ((double) Integer.MAX_VALUE))) + kotlin.UInt.m1397constructorimpl(Integer.MAX_VALUE));
    }

    public static final long doubleToULong(double d) {
        if (java.lang.Double.isNaN(d) || d <= ulongToDouble(0L)) {
            return 0L;
        }
        if (d >= ulongToDouble(-1L)) {
            return -1L;
        }
        if (d < 9.223372036854776E18d) {
            return kotlin.ULong.m1476constructorimpl((long) d);
        }
        return kotlin.ULong.m1476constructorimpl(kotlin.ULong.m1476constructorimpl((long) (d - 9.223372036854776E18d)) - Long.MIN_VALUE);
    }

    public static final java.lang.String ulongToString(long j) {
        return ulongToString(j, 10);
    }

    public static final java.lang.String ulongToString(long j, int i) {
        if (j >= 0) {
            java.lang.String string = java.lang.Long.toString(j, kotlin.text.CharsKt.checkRadix(i));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
            return string;
        }
        long j2 = i;
        long j3 = ((j >>> 1) / j2) << 1;
        long j4 = j - (j3 * j2);
        if (j4 >= j2) {
            j4 -= j2;
            j3++;
        }
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        java.lang.String string2 = java.lang.Long.toString(j3, kotlin.text.CharsKt.checkRadix(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        java.lang.StringBuilder sbAppend = sb.append(string2);
        java.lang.String string3 = java.lang.Long.toString(j4, kotlin.text.CharsKt.checkRadix(i));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        return sbAppend.append(string3).toString();
    }
}
