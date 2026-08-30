package kotlin.random;

/* JADX INFO: compiled from: Random.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b'\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H&J\b\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016J$\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u0004H\u0016J\u0010\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\u0018\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0010\u001a\u00020\u0004H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016J\u0018\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u0016H\u0016¨\u0006\u0018"}, d2 = {"Lkotlin/random/Random;", "", "()V", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", androidx.webkit.Profile.DEFAULT_PROFILE_NAME, "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
public abstract class Random {

    /* JADX INFO: renamed from: Default, reason: from kotlin metadata */
    public static final kotlin.random.Random.Companion INSTANCE = new kotlin.random.Random.Companion(null);
    private static final kotlin.random.Random defaultRandom = kotlin.internal.PlatformImplementationsKt.IMPLEMENTATIONS.defaultPlatformRandom();

    public abstract int nextBits(int bitCount);

    public int nextInt() {
        return nextBits(32);
    }

    public int nextInt(int until) {
        return nextInt(0, until);
    }

    public int nextInt(int from, int until) {
        int iNextInt;
        int i;
        int iNextBits;
        int iNextInt2;
        boolean z;
        kotlin.random.RandomKt.checkRangeBounds(from, until);
        int i2 = until - from;
        if (i2 > 0 || i2 == Integer.MIN_VALUE) {
            if (((-i2) & i2) == i2) {
                iNextBits = nextBits(kotlin.random.RandomKt.fastLog2(i2));
            } else {
                do {
                    iNextInt = nextInt() >>> 1;
                    i = iNextInt % i2;
                } while ((iNextInt - i) + (i2 - 1) < 0);
                iNextBits = i;
            }
            return from + iNextBits;
        }
        do {
            iNextInt2 = nextInt();
            z = false;
            if (from <= iNextInt2 && iNextInt2 < until) {
                z = true;
            }
        } while (!z);
        return iNextInt2;
    }

    public long nextLong() {
        return (((long) nextInt()) << 32) + ((long) nextInt());
    }

    public long nextLong(long until) {
        return nextLong(0L, until);
    }

    public long nextLong(long from, long until) {
        long jNextLong;
        boolean z;
        long jNextLong2;
        long j;
        long jNextBits;
        int iNextInt;
        kotlin.random.RandomKt.checkRangeBounds(from, until);
        long j2 = until - from;
        if (j2 <= 0) {
            do {
                jNextLong = nextLong();
                z = false;
                if (from <= jNextLong && jNextLong < until) {
                    z = true;
                }
            } while (!z);
            return jNextLong;
        }
        if (((-j2) & j2) == j2) {
            int i = (int) j2;
            int i2 = (int) (j2 >>> 32);
            if (i != 0) {
                iNextInt = nextBits(kotlin.random.RandomKt.fastLog2(i));
            } else if (i2 == 1) {
                iNextInt = nextInt();
            } else {
                jNextBits = (((long) nextBits(kotlin.random.RandomKt.fastLog2(i2))) << 32) + (((long) nextInt()) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE);
            }
            jNextBits = ((long) iNextInt) & androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE;
        } else {
            do {
                jNextLong2 = nextLong() >>> 1;
                j = jNextLong2 % j2;
            } while ((jNextLong2 - j) + (j2 - 1) < 0);
            jNextBits = j;
        }
        return from + jNextBits;
    }

    public boolean nextBoolean() {
        return nextBits(1) != 0;
    }

    public double nextDouble() {
        return kotlin.random.PlatformRandomKt.doubleFromParts(nextBits(26), nextBits(27));
    }

    public double nextDouble(double until) {
        return nextDouble(0.0d, until);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003d  */
    public double nextDouble(double from, double until) {
        double dNextDouble;
        kotlin.random.RandomKt.checkRangeBounds(from, until);
        double d = until - from;
        if (java.lang.Double.isInfinite(d)) {
            if ((java.lang.Double.isInfinite(from) || java.lang.Double.isNaN(from)) ? false : true) {
                if ((java.lang.Double.isInfinite(until) || java.lang.Double.isNaN(until)) ? false : true) {
                    double d2 = 2;
                    double dNextDouble2 = nextDouble() * ((until / d2) - (from / d2));
                    dNextDouble = from + dNextDouble2 + dNextDouble2;
                } else {
                    dNextDouble = from + (nextDouble() * d);
                }
            } else {
                dNextDouble = from + (nextDouble() * d);
            }
        } else {
            dNextDouble = from + (nextDouble() * d);
        }
        return dNextDouble >= until ? java.lang.Math.nextAfter(until, Double.NEGATIVE_INFINITY) : dNextDouble;
    }

    public float nextFloat() {
        return nextBits(24) / 1.6777216E7f;
    }

    public static /* synthetic */ byte[] nextBytes$default(kotlin.random.Random random, byte[] bArr, int i, int i2, int i3, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: nextBytes");
        }
        if ((i3 & 2) != 0) {
            i = 0;
        }
        if ((i3 & 4) != 0) {
            i2 = bArr.length;
        }
        return random.nextBytes(bArr, i, i2);
    }

    public byte[] nextBytes(byte[] array, int fromIndex, int toIndex) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        if (!(new kotlin.ranges.IntRange(0, array.length).contains(fromIndex) && new kotlin.ranges.IntRange(0, array.length).contains(toIndex))) {
            throw new java.lang.IllegalArgumentException(("fromIndex (" + fromIndex + ") or toIndex (" + toIndex + ") are out of range: 0.." + array.length + '.').toString());
        }
        if (!(fromIndex <= toIndex)) {
            throw new java.lang.IllegalArgumentException(("fromIndex (" + fromIndex + ") must be not greater than toIndex (" + toIndex + ").").toString());
        }
        int i = (toIndex - fromIndex) / 4;
        for (int i2 = 0; i2 < i; i2++) {
            int iNextInt = nextInt();
            array[fromIndex] = (byte) iNextInt;
            array[fromIndex + 1] = (byte) (iNextInt >>> 8);
            array[fromIndex + 2] = (byte) (iNextInt >>> 16);
            array[fromIndex + 3] = (byte) (iNextInt >>> 24);
            fromIndex += 4;
        }
        int i3 = toIndex - fromIndex;
        int iNextBits = nextBits(i3 * 8);
        for (int i4 = 0; i4 < i3; i4++) {
            array[fromIndex + i4] = (byte) (iNextBits >>> (i4 * 8));
        }
        return array;
    }

    public byte[] nextBytes(byte[] array) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
        return nextBytes(array, 0, array.length);
    }

    public byte[] nextBytes(int size) {
        return nextBytes(new byte[size]);
    }

    /* JADX INFO: renamed from: kotlin.random.Random$Default, reason: from kotlin metadata */
    /* JADX INFO: compiled from: Random.kt */
    @kotlin.Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003:\u0001\u001cB\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0007H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\u0018\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0007H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\u0018\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u001bH\u0002R\u000e\u0010\u0005\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lkotlin/random/Random$Default;", "Lkotlin/random/Random;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "defaultRandom", "nextBits", "", "bitCount", "nextBoolean", "", "nextBytes", "", "array", "fromIndex", "toIndex", "size", "nextDouble", "", "until", "from", "nextFloat", "", "nextInt", "nextLong", "", "writeReplace", "", "Serialized", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion extends kotlin.random.Random implements java.io.Serializable {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: renamed from: kotlin.random.Random$Default$Serialized */
        /* JADX INFO: compiled from: Random.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0000\n\u0000\bÂ\u0002\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\b\u0010\u0006\u001a\u00020\u0007H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lkotlin/random/Random$Default$Serialized;", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "()V", "serialVersionUID", "", "readResolve", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
        private static final class Serialized implements java.io.Serializable {
            public static final kotlin.random.Random.Companion.Serialized INSTANCE = new kotlin.random.Random.Companion.Serialized();
            private static final long serialVersionUID = 0;

            private Serialized() {
            }

            private final java.lang.Object readResolve() {
                return kotlin.random.Random.INSTANCE;
            }
        }

        private final java.lang.Object writeReplace() {
            return kotlin.random.Random.Companion.Serialized.INSTANCE;
        }

        @Override // kotlin.random.Random
        public int nextBits(int bitCount) {
            return kotlin.random.Random.defaultRandom.nextBits(bitCount);
        }

        @Override // kotlin.random.Random
        public int nextInt() {
            return kotlin.random.Random.defaultRandom.nextInt();
        }

        @Override // kotlin.random.Random
        public int nextInt(int until) {
            return kotlin.random.Random.defaultRandom.nextInt(until);
        }

        @Override // kotlin.random.Random
        public int nextInt(int from, int until) {
            return kotlin.random.Random.defaultRandom.nextInt(from, until);
        }

        @Override // kotlin.random.Random
        public long nextLong() {
            return kotlin.random.Random.defaultRandom.nextLong();
        }

        @Override // kotlin.random.Random
        public long nextLong(long until) {
            return kotlin.random.Random.defaultRandom.nextLong(until);
        }

        @Override // kotlin.random.Random
        public long nextLong(long from, long until) {
            return kotlin.random.Random.defaultRandom.nextLong(from, until);
        }

        @Override // kotlin.random.Random
        public boolean nextBoolean() {
            return kotlin.random.Random.defaultRandom.nextBoolean();
        }

        @Override // kotlin.random.Random
        public double nextDouble() {
            return kotlin.random.Random.defaultRandom.nextDouble();
        }

        @Override // kotlin.random.Random
        public double nextDouble(double until) {
            return kotlin.random.Random.defaultRandom.nextDouble(until);
        }

        @Override // kotlin.random.Random
        public double nextDouble(double from, double until) {
            return kotlin.random.Random.defaultRandom.nextDouble(from, until);
        }

        @Override // kotlin.random.Random
        public float nextFloat() {
            return kotlin.random.Random.defaultRandom.nextFloat();
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] array) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
            return kotlin.random.Random.defaultRandom.nextBytes(array);
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(int size) {
            return kotlin.random.Random.defaultRandom.nextBytes(size);
        }

        @Override // kotlin.random.Random
        public byte[] nextBytes(byte[] array, int fromIndex, int toIndex) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(array, "array");
            return kotlin.random.Random.defaultRandom.nextBytes(array, fromIndex, toIndex);
        }
    }
}
