package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Suppliers {

    private interface SupplierFunction<T> extends com.google.common.base.Function<com.google.common.base.Supplier<T>, T> {
    }

    private Suppliers() {
    }

    public static <F, T> com.google.common.base.Supplier<T> compose(com.google.common.base.Function<? super F, T> function, com.google.common.base.Supplier<F> supplier) {
        return new com.google.common.base.Suppliers.SupplierComposition(function, supplier);
    }

    private static class SupplierComposition<F, T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Function<? super F, T> function;
        final com.google.common.base.Supplier<F> supplier;

        SupplierComposition(com.google.common.base.Function<? super F, T> function, com.google.common.base.Supplier<F> supplier) {
            this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
            this.supplier = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Supplier
        @com.google.common.base.ParametricNullness
        public T get() {
            return this.function.apply(this.supplier.get());
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (!(obj instanceof com.google.common.base.Suppliers.SupplierComposition)) {
                return false;
            }
            com.google.common.base.Suppliers.SupplierComposition supplierComposition = (com.google.common.base.Suppliers.SupplierComposition) obj;
            return this.function.equals(supplierComposition.function) && this.supplier.equals(supplierComposition.supplier);
        }

        public int hashCode() {
            return com.google.common.base.Objects.hashCode(this.function, this.supplier);
        }

        public java.lang.String toString() {
            return "Suppliers.compose(" + this.function + ", " + this.supplier + ")";
        }
    }

    public static <T> com.google.common.base.Supplier<T> memoize(com.google.common.base.Supplier<T> delegate) {
        if ((delegate instanceof com.google.common.base.Suppliers.NonSerializableMemoizingSupplier) || (delegate instanceof com.google.common.base.Suppliers.MemoizingSupplier)) {
            return delegate;
        }
        if (delegate instanceof java.io.Serializable) {
            return new com.google.common.base.Suppliers.MemoizingSupplier(delegate);
        }
        return new com.google.common.base.Suppliers.NonSerializableMemoizingSupplier(delegate);
    }

    static class MemoizingSupplier<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Supplier<T> delegate;
        volatile transient boolean initialized;

        @javax.annotation.CheckForNull
        transient T value;

        MemoizingSupplier(com.google.common.base.Supplier<T> delegate) {
            this.delegate = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(delegate);
        }

        @Override // com.google.common.base.Supplier
        @com.google.common.base.ParametricNullness
        public T get() {
            if (!this.initialized) {
                synchronized (this) {
                    if (!this.initialized) {
                        T t = this.delegate.get();
                        this.value = t;
                        this.initialized = true;
                        return t;
                    }
                }
            }
            return (T) com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public java.lang.String toString() {
            return "Suppliers.memoize(" + (this.initialized ? "<supplier that returned " + this.value + ">" : this.delegate) + ")";
        }
    }

    static class NonSerializableMemoizingSupplier<T> implements com.google.common.base.Supplier<T> {
        private static final com.google.common.base.Supplier<java.lang.Void> SUCCESSFULLY_COMPUTED = new com.google.common.base.Supplier() { // from class: com.google.common.base.Suppliers$NonSerializableMemoizingSupplier$$ExternalSyntheticLambda0
            @Override // com.google.common.base.Supplier
            public final java.lang.Object get() {
                return com.google.common.base.Suppliers.NonSerializableMemoizingSupplier.lambda$static$0();
            }
        };
        private volatile com.google.common.base.Supplier<T> delegate;

        @javax.annotation.CheckForNull
        private T value;

        static /* synthetic */ java.lang.Void lambda$static$0() {
            throw new java.lang.IllegalStateException();
        }

        NonSerializableMemoizingSupplier(com.google.common.base.Supplier<T> delegate) {
            this.delegate = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(delegate);
        }

        @Override // com.google.common.base.Supplier
        @com.google.common.base.ParametricNullness
        public T get() {
            com.google.common.base.Supplier<T> supplier = this.delegate;
            com.google.common.base.Supplier<T> supplier2 = (com.google.common.base.Supplier<T>) SUCCESSFULLY_COMPUTED;
            if (supplier != supplier2) {
                synchronized (this) {
                    if (this.delegate != supplier2) {
                        T t = this.delegate.get();
                        this.value = t;
                        this.delegate = supplier2;
                        return t;
                    }
                }
            }
            return (T) com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public java.lang.String toString() {
            java.lang.Object obj = this.delegate;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("Suppliers.memoize(");
            if (obj == SUCCESSFULLY_COMPUTED) {
                obj = "<supplier that returned " + this.value + ">";
            }
            return sb.append(obj).append(")").toString();
        }
    }

    public static <T> com.google.common.base.Supplier<T> memoizeWithExpiration(com.google.common.base.Supplier<T> delegate, long duration, java.util.concurrent.TimeUnit unit) {
        return new com.google.common.base.Suppliers.ExpiringMemoizingSupplier(delegate, duration, unit);
    }

    static class ExpiringMemoizingSupplier<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Supplier<T> delegate;
        final long durationNanos;
        volatile transient long expirationNanos;

        @javax.annotation.CheckForNull
        volatile transient T value;

        ExpiringMemoizingSupplier(com.google.common.base.Supplier<T> delegate, long duration, java.util.concurrent.TimeUnit unit) {
            this.delegate = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(delegate);
            this.durationNanos = unit.toNanos(duration);
            com.google.common.base.Preconditions.checkArgument(duration > 0, "duration (%s %s) must be > 0", duration, unit);
        }

        @Override // com.google.common.base.Supplier
        @com.google.common.base.ParametricNullness
        public T get() {
            long j = this.expirationNanos;
            long jNanoTime = java.lang.System.nanoTime();
            if (j == 0 || jNanoTime - j >= 0) {
                synchronized (this) {
                    if (j == this.expirationNanos) {
                        T t = this.delegate.get();
                        this.value = t;
                        long j2 = jNanoTime + this.durationNanos;
                        if (j2 == 0) {
                            j2 = 1;
                        }
                        this.expirationNanos = j2;
                        return t;
                    }
                }
            }
            return (T) com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(this.value);
        }

        public java.lang.String toString() {
            return "Suppliers.memoizeWithExpiration(" + this.delegate + ", " + this.durationNanos + ", NANOS)";
        }
    }

    public static <T> com.google.common.base.Supplier<T> ofInstance(@com.google.common.base.ParametricNullness T instance) {
        return new com.google.common.base.Suppliers.SupplierOfInstance(instance);
    }

    private static class SupplierOfInstance<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;

        @com.google.common.base.ParametricNullness
        final T instance;

        SupplierOfInstance(@com.google.common.base.ParametricNullness T instance) {
            this.instance = instance;
        }

        @Override // com.google.common.base.Supplier
        @com.google.common.base.ParametricNullness
        public T get() {
            return this.instance;
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Suppliers.SupplierOfInstance) {
                return com.google.common.base.Objects.equal(this.instance, ((com.google.common.base.Suppliers.SupplierOfInstance) obj).instance);
            }
            return false;
        }

        public int hashCode() {
            return com.google.common.base.Objects.hashCode(this.instance);
        }

        public java.lang.String toString() {
            return "Suppliers.ofInstance(" + this.instance + ")";
        }
    }

    public static <T> com.google.common.base.Supplier<T> synchronizedSupplier(com.google.common.base.Supplier<T> delegate) {
        return new com.google.common.base.Suppliers.ThreadSafeSupplier(delegate);
    }

    private static class ThreadSafeSupplier<T> implements com.google.common.base.Supplier<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Supplier<T> delegate;

        ThreadSafeSupplier(com.google.common.base.Supplier<T> delegate) {
            this.delegate = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(delegate);
        }

        @Override // com.google.common.base.Supplier
        @com.google.common.base.ParametricNullness
        public T get() {
            T t;
            synchronized (this.delegate) {
                t = this.delegate.get();
            }
            return t;
        }

        public java.lang.String toString() {
            return "Suppliers.synchronizedSupplier(" + this.delegate + ")";
        }
    }

    public static <T> com.google.common.base.Function<com.google.common.base.Supplier<T>, T> supplierFunction() {
        return com.google.common.base.Suppliers.SupplierFunctionImpl.INSTANCE;
    }

    private enum SupplierFunctionImpl implements com.google.common.base.Suppliers.SupplierFunction<java.lang.Object> {
        INSTANCE;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "Suppliers.supplierFunction()";
        }

        @Override // com.google.common.base.Function
        @javax.annotation.CheckForNull
        public java.lang.Object apply(com.google.common.base.Supplier<java.lang.Object> input) {
            return input.get();
        }
    }
}
