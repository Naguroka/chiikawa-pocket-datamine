package kotlin.random;

/* JADX INFO: compiled from: URandom.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0019\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010\u001a\u001b\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0011\u001a\u00020\fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a/\u0010\u000b\u001a\u00020\f*\u00020\r2\u0006\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0014\u001a\u00020\u000f2\b\b\u0002\u0010\u0015\u001a\u00020\u000fH\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u0011\u0010\u0018\u001a\u00020\u0003*\u00020\rH\u0007¢\u0006\u0002\u0010\u0019\u001a\u001b\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a#\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0007¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0019\u0010\u0018\u001a\u00020\u0003*\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001fH\u0007¢\u0006\u0002\u0010 \u001a\u0011\u0010!\u001a\u00020\b*\u00020\rH\u0007¢\u0006\u0002\u0010\"\u001a\u001b\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u0004\u001a\u00020\bH\u0007¢\u0006\u0004\b#\u0010$\u001a#\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u0002\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\bH\u0007¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010!\u001a\u00020\b*\u00020\r2\u0006\u0010\u001e\u001a\u00020'H\u0007¢\u0006\u0002\u0010(¨\u0006)"}, d2 = {"checkUIntRangeBounds", "", "from", "Lkotlin/UInt;", "until", "checkUIntRangeBounds-J1ME1BU", "(II)V", "checkULongRangeBounds", "Lkotlin/ULong;", "checkULongRangeBounds-eb3DHEI", "(JJ)V", "nextUBytes", "Lkotlin/UByteArray;", "Lkotlin/random/Random;", "size", "", "(Lkotlin/random/Random;I)[B", "array", "nextUBytes-EVgfTAA", "(Lkotlin/random/Random;[B)[B", "fromIndex", "toIndex", "nextUBytes-Wvrt4B4", "(Lkotlin/random/Random;[BII)[B", "nextUInt", "(Lkotlin/random/Random;)I", "nextUInt-qCasIEU", "(Lkotlin/random/Random;I)I", "nextUInt-a8DCA5k", "(Lkotlin/random/Random;II)I", "range", "Lkotlin/ranges/UIntRange;", "(Lkotlin/random/Random;Lkotlin/ranges/UIntRange;)I", "nextULong", "(Lkotlin/random/Random;)J", "nextULong-V1Xi4fY", "(Lkotlin/random/Random;J)J", "nextULong-jmpaW-c", "(Lkotlin/random/Random;JJ)J", "Lkotlin/ranges/ULongRange;", "(Lkotlin/random/Random;Lkotlin/ranges/ULongRange;)J", "kotlin-stdlib"}, k = 2, mv = {1, 9, 0}, xi = 48)
public final class URandomKt {
    public static final int nextUInt(kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "<this>");
        return kotlin.UInt.m1397constructorimpl(random.nextInt());
    }

    /* JADX INFO: renamed from: nextUInt-qCasIEU, reason: not valid java name */
    public static final int m2523nextUIntqCasIEU(kotlin.random.Random nextUInt, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        return m2522nextUInta8DCA5k(nextUInt, 0, i);
    }

    /* JADX INFO: renamed from: nextUInt-a8DCA5k, reason: not valid java name */
    public static final int m2522nextUInta8DCA5k(kotlin.random.Random nextUInt, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextUInt, "$this$nextUInt");
        m2517checkUIntRangeBoundsJ1ME1BU(i, i2);
        return kotlin.UInt.m1397constructorimpl(nextUInt.nextInt(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE) ^ Integer.MIN_VALUE);
    }

    public static final int nextUInt(kotlin.random.Random random, kotlin.ranges.UIntRange range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        if (java.lang.Integer.compare(range.getLast() ^ Integer.MIN_VALUE, (-1) ^ Integer.MIN_VALUE) < 0) {
            return m2522nextUInta8DCA5k(random, range.getFirst(), kotlin.UInt.m1397constructorimpl(range.getLast() + 1));
        }
        return java.lang.Integer.compare(range.getFirst() ^ Integer.MIN_VALUE, 0 ^ Integer.MIN_VALUE) > 0 ? kotlin.UInt.m1397constructorimpl(m2522nextUInta8DCA5k(random, kotlin.UInt.m1397constructorimpl(range.getFirst() - 1), range.getLast()) + 1) : nextUInt(random);
    }

    public static final long nextULong(kotlin.random.Random random) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "<this>");
        return kotlin.ULong.m1476constructorimpl(random.nextLong());
    }

    /* JADX INFO: renamed from: nextULong-V1Xi4fY, reason: not valid java name */
    public static final long m2524nextULongV1Xi4fY(kotlin.random.Random nextULong, long j) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        return m2525nextULongjmpaWc(nextULong, 0L, j);
    }

    /* JADX INFO: renamed from: nextULong-jmpaW-c, reason: not valid java name */
    public static final long m2525nextULongjmpaWc(kotlin.random.Random nextULong, long j, long j2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextULong, "$this$nextULong");
        m2518checkULongRangeBoundseb3DHEI(j, j2);
        return kotlin.ULong.m1476constructorimpl(nextULong.nextLong(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) ^ Long.MIN_VALUE);
    }

    public static final long nextULong(kotlin.random.Random random, kotlin.ranges.ULongRange range) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(range, "range");
        if (range.isEmpty()) {
            throw new java.lang.IllegalArgumentException("Cannot get random in empty range: " + range);
        }
        if (java.lang.Long.compare(range.getLast() ^ Long.MIN_VALUE, (-1) ^ Long.MIN_VALUE) < 0) {
            return m2525nextULongjmpaWc(random, range.getFirst(), kotlin.ULong.m1476constructorimpl(range.getLast() + kotlin.ULong.m1476constructorimpl(((long) 1) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE)));
        }
        if (java.lang.Long.compare(range.getFirst() ^ Long.MIN_VALUE, 0 ^ Long.MIN_VALUE) <= 0) {
            return nextULong(random);
        }
        long j = range.getFirst();
        long j2 = ((long) 1) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE;
        return kotlin.ULong.m1476constructorimpl(m2525nextULongjmpaWc(random, kotlin.ULong.m1476constructorimpl(j - kotlin.ULong.m1476constructorimpl(j2)), range.getLast()) + kotlin.ULong.m1476constructorimpl(j2));
    }

    /* JADX INFO: renamed from: nextUBytes-EVgfTAA, reason: not valid java name */
    public static final byte[] m2519nextUBytesEVgfTAA(kotlin.random.Random nextUBytes, byte[] array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array);
        return array;
    }

    public static final byte[] nextUBytes(kotlin.random.Random random, int i) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(random, "<this>");
        return kotlin.UByteArray.m1373constructorimpl(random.nextBytes(i));
    }

    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4$default, reason: not valid java name */
    public static /* synthetic */ byte[] m2521nextUBytesWvrt4B4$default(kotlin.random.Random random, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = kotlin.UByteArray.m1379getSizeimpl(bArr);
        }
        return m2520nextUBytesWvrt4B4(random, bArr, i, i2);
    }

    /* JADX INFO: renamed from: nextUBytes-Wvrt4B4, reason: not valid java name */
    public static final byte[] m2520nextUBytesWvrt4B4(kotlin.random.Random nextUBytes, byte[] array, int i, int i2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nextUBytes, "$this$nextUBytes");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        nextUBytes.nextBytes(array, i, i2);
        return array;
    }

    /* JADX INFO: renamed from: checkUIntRangeBounds-J1ME1BU, reason: not valid java name */
    public static final void m2517checkUIntRangeBoundsJ1ME1BU(int i, int i2) {
        if (!(java.lang.Integer.compare(i2 ^ Integer.MIN_VALUE, i ^ Integer.MIN_VALUE) > 0)) {
            throw new java.lang.IllegalArgumentException(kotlin.random.RandomKt.boundsErrorMessage(kotlin.UInt.m1391boximpl(i), kotlin.UInt.m1391boximpl(i2)).toString());
        }
    }

    /* JADX INFO: renamed from: checkULongRangeBounds-eb3DHEI, reason: not valid java name */
    public static final void m2518checkULongRangeBoundseb3DHEI(long j, long j2) {
        if (!(java.lang.Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE) > 0)) {
            throw new java.lang.IllegalArgumentException(kotlin.random.RandomKt.boundsErrorMessage(kotlin.ULong.m1470boximpl(j), kotlin.ULong.m1470boximpl(j2)).toString());
        }
    }
}
