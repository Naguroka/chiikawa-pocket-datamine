package com.google.common.primitives;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.primitives.ElementTypesAreNonnullByDefault
public final class UnsignedInteger extends java.lang.Number implements java.lang.Comparable<com.google.common.primitives.UnsignedInteger> {
    private final int value;
    public static final com.google.common.primitives.UnsignedInteger ZERO = fromIntBits(0);
    public static final com.google.common.primitives.UnsignedInteger ONE = fromIntBits(1);
    public static final com.google.common.primitives.UnsignedInteger MAX_VALUE = fromIntBits(-1);

    private UnsignedInteger(int value) {
        this.value = value & (-1);
    }

    public static com.google.common.primitives.UnsignedInteger fromIntBits(int bits) {
        return new com.google.common.primitives.UnsignedInteger(bits);
    }

    public static com.google.common.primitives.UnsignedInteger valueOf(long value) {
        com.google.common.base.Preconditions.checkArgument((androidx.media3.muxer.Mp4Utils.UNSIGNED_INT_MAX_VALUE & value) == value, "value (%s) is outside the range for an unsigned integer value", value);
        return fromIntBits((int) value);
    }

    public static com.google.common.primitives.UnsignedInteger valueOf(java.math.BigInteger value) {
        com.google.common.base.Preconditions.checkNotNull(value);
        com.google.common.base.Preconditions.checkArgument(value.signum() >= 0 && value.bitLength() <= 32, "value (%s) is outside the range for an unsigned integer value", value);
        return fromIntBits(value.intValue());
    }

    public static com.google.common.primitives.UnsignedInteger valueOf(java.lang.String string) {
        return valueOf(string, 10);
    }

    public static com.google.common.primitives.UnsignedInteger valueOf(java.lang.String string, int radix) {
        return fromIntBits(com.google.common.primitives.UnsignedInts.parseUnsignedInt(string, radix));
    }

    public com.google.common.primitives.UnsignedInteger plus(com.google.common.primitives.UnsignedInteger val) {
        return fromIntBits(this.value + ((com.google.common.primitives.UnsignedInteger) com.google.common.base.Preconditions.checkNotNull(val)).value);
    }

    public com.google.common.primitives.UnsignedInteger minus(com.google.common.primitives.UnsignedInteger val) {
        return fromIntBits(this.value - ((com.google.common.primitives.UnsignedInteger) com.google.common.base.Preconditions.checkNotNull(val)).value);
    }

    public com.google.common.primitives.UnsignedInteger times(com.google.common.primitives.UnsignedInteger val) {
        return fromIntBits(this.value * ((com.google.common.primitives.UnsignedInteger) com.google.common.base.Preconditions.checkNotNull(val)).value);
    }

    public com.google.common.primitives.UnsignedInteger dividedBy(com.google.common.primitives.UnsignedInteger val) {
        return fromIntBits(com.google.common.primitives.UnsignedInts.divide(this.value, ((com.google.common.primitives.UnsignedInteger) com.google.common.base.Preconditions.checkNotNull(val)).value));
    }

    public com.google.common.primitives.UnsignedInteger mod(com.google.common.primitives.UnsignedInteger val) {
        return fromIntBits(com.google.common.primitives.UnsignedInts.remainder(this.value, ((com.google.common.primitives.UnsignedInteger) com.google.common.base.Preconditions.checkNotNull(val)).value));
    }

    @Override // java.lang.Number
    public int intValue() {
        return this.value;
    }

    @Override // java.lang.Number
    public long longValue() {
        return com.google.common.primitives.UnsignedInts.toLong(this.value);
    }

    @Override // java.lang.Number
    public float floatValue() {
        return longValue();
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return longValue();
    }

    public java.math.BigInteger bigIntegerValue() {
        return java.math.BigInteger.valueOf(longValue());
    }

    @Override // java.lang.Comparable
    public int compareTo(com.google.common.primitives.UnsignedInteger other) {
        com.google.common.base.Preconditions.checkNotNull(other);
        return com.google.common.primitives.UnsignedInts.compare(this.value, other.value);
    }

    public int hashCode() {
        return this.value;
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        return (obj instanceof com.google.common.primitives.UnsignedInteger) && this.value == ((com.google.common.primitives.UnsignedInteger) obj).value;
    }

    public java.lang.String toString() {
        return toString(10);
    }

    public java.lang.String toString(int radix) {
        return com.google.common.primitives.UnsignedInts.toString(this.value, radix);
    }
}
