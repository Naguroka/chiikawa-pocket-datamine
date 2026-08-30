package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public abstract class DiscreteDomain<C extends java.lang.Comparable> {
    final boolean supportsFastOffset;

    public abstract long distance(C start, C end);

    @javax.annotation.CheckForNull
    public abstract C next(C value);

    @javax.annotation.CheckForNull
    public abstract C previous(C value);

    public static com.google.common.collect.DiscreteDomain<java.lang.Integer> integers() {
        return com.google.common.collect.DiscreteDomain.IntegerDomain.INSTANCE;
    }

    private static final class IntegerDomain extends com.google.common.collect.DiscreteDomain<java.lang.Integer> implements java.io.Serializable {
        private static final com.google.common.collect.DiscreteDomain.IntegerDomain INSTANCE = new com.google.common.collect.DiscreteDomain.IntegerDomain();
        private static final long serialVersionUID = 0;

        public java.lang.String toString() {
            return "DiscreteDomain.integers()";
        }

        IntegerDomain() {
            super(true);
        }

        @Override // com.google.common.collect.DiscreteDomain
        @javax.annotation.CheckForNull
        public java.lang.Integer next(java.lang.Integer value) {
            int iIntValue = value.intValue();
            if (iIntValue == Integer.MAX_VALUE) {
                return null;
            }
            return java.lang.Integer.valueOf(iIntValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        @javax.annotation.CheckForNull
        public java.lang.Integer previous(java.lang.Integer value) {
            int iIntValue = value.intValue();
            if (iIntValue == Integer.MIN_VALUE) {
                return null;
            }
            return java.lang.Integer.valueOf(iIntValue - 1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        public java.lang.Integer offset(java.lang.Integer origin, long distance) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(distance, "distance");
            return java.lang.Integer.valueOf(com.google.common.primitives.Ints.checkedCast(origin.longValue() + distance));
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(java.lang.Integer start, java.lang.Integer end) {
            return ((long) end.intValue()) - ((long) start.intValue());
        }

        @Override // com.google.common.collect.DiscreteDomain
        public java.lang.Integer minValue() {
            return Integer.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public java.lang.Integer maxValue() {
            return Integer.MAX_VALUE;
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    public static com.google.common.collect.DiscreteDomain<java.lang.Long> longs() {
        return com.google.common.collect.DiscreteDomain.LongDomain.INSTANCE;
    }

    private static final class LongDomain extends com.google.common.collect.DiscreteDomain<java.lang.Long> implements java.io.Serializable {
        private static final com.google.common.collect.DiscreteDomain.LongDomain INSTANCE = new com.google.common.collect.DiscreteDomain.LongDomain();
        private static final long serialVersionUID = 0;

        public java.lang.String toString() {
            return "DiscreteDomain.longs()";
        }

        LongDomain() {
            super(true);
        }

        @Override // com.google.common.collect.DiscreteDomain
        @javax.annotation.CheckForNull
        public java.lang.Long next(java.lang.Long value) {
            long jLongValue = value.longValue();
            if (jLongValue == Long.MAX_VALUE) {
                return null;
            }
            return java.lang.Long.valueOf(jLongValue + 1);
        }

        @Override // com.google.common.collect.DiscreteDomain
        @javax.annotation.CheckForNull
        public java.lang.Long previous(java.lang.Long value) {
            long jLongValue = value.longValue();
            if (jLongValue == Long.MIN_VALUE) {
                return null;
            }
            return java.lang.Long.valueOf(jLongValue - 1);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        public java.lang.Long offset(java.lang.Long origin, long distance) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(distance, "distance");
            long jLongValue = origin.longValue() + distance;
            if (jLongValue < 0) {
                com.google.common.base.Preconditions.checkArgument(origin.longValue() < 0, "overflow");
            }
            return java.lang.Long.valueOf(jLongValue);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(java.lang.Long start, java.lang.Long end) {
            long jLongValue = end.longValue() - start.longValue();
            if (end.longValue() > start.longValue() && jLongValue < 0) {
                return Long.MAX_VALUE;
            }
            if (end.longValue() >= start.longValue() || jLongValue <= 0) {
                return jLongValue;
            }
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public java.lang.Long minValue() {
            return Long.MIN_VALUE;
        }

        @Override // com.google.common.collect.DiscreteDomain
        public java.lang.Long maxValue() {
            return Long.MAX_VALUE;
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    public static com.google.common.collect.DiscreteDomain<java.math.BigInteger> bigIntegers() {
        return com.google.common.collect.DiscreteDomain.BigIntegerDomain.INSTANCE;
    }

    private static final class BigIntegerDomain extends com.google.common.collect.DiscreteDomain<java.math.BigInteger> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private static final com.google.common.collect.DiscreteDomain.BigIntegerDomain INSTANCE = new com.google.common.collect.DiscreteDomain.BigIntegerDomain();
        private static final java.math.BigInteger MIN_LONG = java.math.BigInteger.valueOf(Long.MIN_VALUE);
        private static final java.math.BigInteger MAX_LONG = java.math.BigInteger.valueOf(Long.MAX_VALUE);

        public java.lang.String toString() {
            return "DiscreteDomain.bigIntegers()";
        }

        BigIntegerDomain() {
            super(true);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public java.math.BigInteger next(java.math.BigInteger value) {
            return value.add(java.math.BigInteger.ONE);
        }

        @Override // com.google.common.collect.DiscreteDomain
        public java.math.BigInteger previous(java.math.BigInteger value) {
            return value.subtract(java.math.BigInteger.ONE);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DiscreteDomain
        public java.math.BigInteger offset(java.math.BigInteger origin, long distance) {
            com.google.common.collect.CollectPreconditions.checkNonnegative(distance, "distance");
            return origin.add(java.math.BigInteger.valueOf(distance));
        }

        @Override // com.google.common.collect.DiscreteDomain
        public long distance(java.math.BigInteger start, java.math.BigInteger end) {
            return end.subtract(start).max(MIN_LONG).min(MAX_LONG).longValue();
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    protected DiscreteDomain() {
        this(false);
    }

    private DiscreteDomain(boolean supportsFastOffset) {
        this.supportsFastOffset = supportsFastOffset;
    }

    C offset(C c, long j) {
        com.google.common.collect.CollectPreconditions.checkNonnegative(j, "distance");
        C c2 = c;
        for (long j2 = 0; j2 < j; j2++) {
            c2 = (C) next(c2);
            if (c2 == null) {
                throw new java.lang.IllegalArgumentException("overflowed computing offset(" + c + ", " + j + ")");
            }
        }
        return c2;
    }

    public C minValue() {
        throw new java.util.NoSuchElementException();
    }

    public C maxValue() {
        throw new java.util.NoSuchElementException();
    }
}
