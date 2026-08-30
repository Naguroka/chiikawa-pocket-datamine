package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
public final class UnsignedLong extends java.lang.Number implements java.lang.Comparable<com.google.common.primitives.UnsignedLong>, java.io.Serializable {
    private static final long UNSIGNED_MASK = Long.MAX_VALUE;
    private final long value;
    public static final com.google.common.primitives.UnsignedLong ZERO = new com.google.common.primitives.UnsignedLong(0);
    public static final com.google.common.primitives.UnsignedLong ONE = new com.google.common.primitives.UnsignedLong(1);
    public static final com.google.common.primitives.UnsignedLong MAX_VALUE = new com.google.common.primitives.UnsignedLong(-1);

    private UnsignedLong(long value) {
        this.value = value;
    }

    public static com.google.common.primitives.UnsignedLong fromLongBits(long bits) {
        return new com.google.common.primitives.UnsignedLong(bits);
    }

    public static com.google.common.primitives.UnsignedLong valueOf(long value) {
        com.google.common.base.Preconditions.checkArgument(value >= 0, "value (%s) is outside the range for an unsigned long value", value);
        return fromLongBits(value);
    }

    public static com.google.common.primitives.UnsignedLong valueOf(java.math.BigInteger value) {
        com.google.common.base.Preconditions.checkNotNull(value);
        com.google.common.base.Preconditions.checkArgument(value.signum() >= 0 && value.bitLength() <= 64, "value (%s) is outside the range for an unsigned long value", value);
        return fromLongBits(value.longValue());
    }

    public static com.google.common.primitives.UnsignedLong valueOf(java.lang.String string) {
        return valueOf(string, 10);
    }

    public static com.google.common.primitives.UnsignedLong valueOf(java.lang.String string, int radix) {
        return fromLongBits(com.google.common.primitives.UnsignedLongs.parseUnsignedLong(string, radix));
    }

    public com.google.common.primitives.UnsignedLong plus(com.google.common.primitives.UnsignedLong val) {
        return fromLongBits(this.value + ((com.google.common.primitives.UnsignedLong) com.google.common.base.Preconditions.checkNotNull(val)).value);
    }

    public com.google.common.primitives.UnsignedLong minus(com.google.common.primitives.UnsignedLong val) {
        return fromLongBits(this.value - ((com.google.common.primitives.UnsignedLong) com.google.common.base.Preconditions.checkNotNull(val)).value);
    }

    public com.google.common.primitives.UnsignedLong times(com.google.common.primitives.UnsignedLong val) {
        return fromLongBits(this.value * ((com.google.common.primitives.UnsignedLong) com.google.common.base.Preconditions.checkNotNull(val)).value);
    }

    public com.google.common.primitives.UnsignedLong dividedBy(com.google.common.primitives.UnsignedLong val) {
        return fromLongBits(com.google.common.primitives.UnsignedLongs.divide(this.value, ((com.google.common.primitives.UnsignedLong) com.google.common.base.Preconditions.checkNotNull(val)).value));
    }

    public com.google.common.primitives.UnsignedLong mod(com.google.common.primitives.UnsignedLong val) {
        return fromLongBits(com.google.common.primitives.UnsignedLongs.remainder(this.value, ((com.google.common.primitives.UnsignedLong) com.google.common.base.Preconditions.checkNotNull(val)).value));
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public float floatValue() {
        long j = this.value;
        if (j >= 0) {
            return j;
        }
        return ((j & 1) | (j >>> 1)) * 2.0f;
    }

    @Override // java.lang.Number
    public double doubleValue() {
        long j = this.value;
        if (j >= 0) {
            return j;
        }
        return ((j & 1) | (j >>> 1)) * 2.0d;
    }

    public java.math.BigInteger bigIntegerValue() {
        java.math.BigInteger bigIntegerValueOf = java.math.BigInteger.valueOf(this.value & Long.MAX_VALUE);
        return this.value < 0 ? bigIntegerValueOf.setBit(63) : bigIntegerValueOf;
    }

    @Override // java.lang.Comparable
    public int compareTo(com.google.common.primitives.UnsignedLong o) {
        com.google.common.base.Preconditions.checkNotNull(o);
        return com.google.common.primitives.UnsignedLongs.compare(this.value, o.value);
    }

    public int hashCode() {
        return com.google.common.primitives.Longs.hashCode(this.value);
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return (obj instanceof com.google.common.primitives.UnsignedLong) && this.value == ((com.google.common.primitives.UnsignedLong) obj).value;
    }

    public java.lang.String toString() {
        return com.google.common.primitives.UnsignedLongs.toString(this.value);
    }

    public java.lang.String toString(int radix) {
        return com.google.common.primitives.UnsignedLongs.toString(this.value, radix);
    }
}
