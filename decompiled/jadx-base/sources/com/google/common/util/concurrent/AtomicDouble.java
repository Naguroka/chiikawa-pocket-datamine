package com.google.common.util.concurrent;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.util.concurrent.ElementTypesAreNonnullByDefault
public class AtomicDouble extends java.lang.Number implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private transient java.util.concurrent.atomic.AtomicLong value;

    public AtomicDouble(double initialValue) {
        this.value = new java.util.concurrent.atomic.AtomicLong(java.lang.Double.doubleToRawLongBits(initialValue));
    }

    public AtomicDouble() {
        this(0.0d);
    }

    public final double get() {
        return java.lang.Double.longBitsToDouble(this.value.get());
    }

    public final void set(double newValue) {
        this.value.set(java.lang.Double.doubleToRawLongBits(newValue));
    }

    public final void lazySet(double newValue) {
        this.value.lazySet(java.lang.Double.doubleToRawLongBits(newValue));
    }

    public final double getAndSet(double newValue) {
        return java.lang.Double.longBitsToDouble(this.value.getAndSet(java.lang.Double.doubleToRawLongBits(newValue)));
    }

    public final boolean compareAndSet(double expect, double update) {
        return this.value.compareAndSet(java.lang.Double.doubleToRawLongBits(expect), java.lang.Double.doubleToRawLongBits(update));
    }

    public final boolean weakCompareAndSet(double expect, double update) {
        return this.value.weakCompareAndSet(java.lang.Double.doubleToRawLongBits(expect), java.lang.Double.doubleToRawLongBits(update));
    }

    public final double getAndAdd(double delta) {
        long j;
        double dLongBitsToDouble;
        do {
            j = this.value.get();
            dLongBitsToDouble = java.lang.Double.longBitsToDouble(j);
        } while (!this.value.compareAndSet(j, java.lang.Double.doubleToRawLongBits(dLongBitsToDouble + delta)));
        return dLongBitsToDouble;
    }

    public final double addAndGet(double delta) {
        long j;
        double dLongBitsToDouble;
        do {
            j = this.value.get();
            dLongBitsToDouble = java.lang.Double.longBitsToDouble(j) + delta;
        } while (!this.value.compareAndSet(j, java.lang.Double.doubleToRawLongBits(dLongBitsToDouble)));
        return dLongBitsToDouble;
    }

    public java.lang.String toString() {
        return java.lang.Double.toString(get());
    }

    @Override // java.lang.Number
    public int intValue() {
        return (int) get();
    }

    @Override // java.lang.Number
    public long longValue() {
        return (long) get();
    }

    @Override // java.lang.Number
    public float floatValue() {
        return (float) get();
    }

    @Override // java.lang.Number
    public double doubleValue() {
        return get();
    }

    private void writeObject(java.io.ObjectOutputStream s) throws java.io.IOException {
        s.defaultWriteObject();
        s.writeDouble(get());
    }

    private void readObject(java.io.ObjectInputStream s) throws java.lang.ClassNotFoundException, java.io.IOException {
        s.defaultReadObject();
        this.value = new java.util.concurrent.atomic.AtomicLong();
        set(s.readDouble());
    }
}
