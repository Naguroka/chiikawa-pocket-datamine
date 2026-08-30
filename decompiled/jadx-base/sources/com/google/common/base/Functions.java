package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public final class Functions {

    private enum IdentityFunction implements com.google.common.base.Function<java.lang.Object, java.lang.Object> {
        INSTANCE;

        @Override // com.google.common.base.Function
        @javax.annotation.CheckForNull
        public java.lang.Object apply(@javax.annotation.CheckForNull java.lang.Object o) {
            return o;
        }

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "Functions.identity()";
        }
    }

    private Functions() {
    }

    public static com.google.common.base.Function<java.lang.Object, java.lang.String> toStringFunction() {
        return com.google.common.base.Functions.ToStringFunction.INSTANCE;
    }

    private enum ToStringFunction implements com.google.common.base.Function<java.lang.Object, java.lang.String> {
        INSTANCE;

        @Override // java.lang.Enum
        public java.lang.String toString() {
            return "Functions.toStringFunction()";
        }

        @Override // com.google.common.base.Function
        public java.lang.String apply(java.lang.Object o) {
            com.google.common.base.Preconditions.checkNotNull(o);
            return o.toString();
        }
    }

    public static <E> com.google.common.base.Function<E, E> identity() {
        return com.google.common.base.Functions.IdentityFunction.INSTANCE;
    }

    public static <K, V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, V> map) {
        return new com.google.common.base.Functions.FunctionForMapNoDefault(map);
    }

    public static <K, V> com.google.common.base.Function<K, V> forMap(java.util.Map<K, ? extends V> map, @com.google.common.base.ParametricNullness V defaultValue) {
        return new com.google.common.base.Functions.ForMapWithDefault(map, defaultValue);
    }

    private static class FunctionForMapNoDefault<K, V> implements com.google.common.base.Function<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        final java.util.Map<K, V> map;

        FunctionForMapNoDefault(java.util.Map<K, V> map) {
            this.map = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(map);
        }

        @Override // com.google.common.base.Function
        @com.google.common.base.ParametricNullness
        public V apply(@com.google.common.base.ParametricNullness K k) {
            V v = this.map.get(k);
            com.google.common.base.Preconditions.checkArgument(v != null || this.map.containsKey(k), "Key '%s' not present in map", k);
            return (V) com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(v);
        }

        @Override // com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
            if (o instanceof com.google.common.base.Functions.FunctionForMapNoDefault) {
                return this.map.equals(((com.google.common.base.Functions.FunctionForMapNoDefault) o).map);
            }
            return false;
        }

        public int hashCode() {
            return this.map.hashCode();
        }

        public java.lang.String toString() {
            return "Functions.forMap(" + this.map + ")";
        }
    }

    private static class ForMapWithDefault<K, V> implements com.google.common.base.Function<K, V>, java.io.Serializable {
        private static final long serialVersionUID = 0;

        @com.google.common.base.ParametricNullness
        final V defaultValue;
        final java.util.Map<K, ? extends V> map;

        ForMapWithDefault(java.util.Map<K, ? extends V> map, @com.google.common.base.ParametricNullness V defaultValue) {
            this.map = (java.util.Map) com.google.common.base.Preconditions.checkNotNull(map);
            this.defaultValue = defaultValue;
        }

        @Override // com.google.common.base.Function
        @com.google.common.base.ParametricNullness
        public V apply(@com.google.common.base.ParametricNullness K k) {
            V v = this.map.get(k);
            if (v != null || this.map.containsKey(k)) {
                return (V) com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(v);
            }
            return this.defaultValue;
        }

        @Override // com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object o) {
            if (!(o instanceof com.google.common.base.Functions.ForMapWithDefault)) {
                return false;
            }
            com.google.common.base.Functions.ForMapWithDefault forMapWithDefault = (com.google.common.base.Functions.ForMapWithDefault) o;
            return this.map.equals(forMapWithDefault.map) && com.google.common.base.Objects.equal(this.defaultValue, forMapWithDefault.defaultValue);
        }

        public int hashCode() {
            return com.google.common.base.Objects.hashCode(this.map, this.defaultValue);
        }

        public java.lang.String toString() {
            return "Functions.forMap(" + this.map + ", defaultValue=" + this.defaultValue + ")";
        }
    }

    public static <A, B, C> com.google.common.base.Function<A, C> compose(com.google.common.base.Function<B, C> g, com.google.common.base.Function<A, ? extends B> f) {
        return new com.google.common.base.Functions.FunctionComposition(g, f);
    }

    private static class FunctionComposition<A, B, C> implements com.google.common.base.Function<A, C>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Function<A, ? extends B> f;
        private final com.google.common.base.Function<B, C> g;

        public FunctionComposition(com.google.common.base.Function<B, C> g, com.google.common.base.Function<A, ? extends B> f) {
            this.g = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(g);
            this.f = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(f);
        }

        @Override // com.google.common.base.Function
        @com.google.common.base.ParametricNullness
        public C apply(@com.google.common.base.ParametricNullness A a2) {
            return (C) this.g.apply(this.f.apply(a2));
        }

        @Override // com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (!(obj instanceof com.google.common.base.Functions.FunctionComposition)) {
                return false;
            }
            com.google.common.base.Functions.FunctionComposition functionComposition = (com.google.common.base.Functions.FunctionComposition) obj;
            return this.f.equals(functionComposition.f) && this.g.equals(functionComposition.g);
        }

        public int hashCode() {
            return this.f.hashCode() ^ this.g.hashCode();
        }

        public java.lang.String toString() {
            return this.g + "(" + this.f + ")";
        }
    }

    public static <T> com.google.common.base.Function<T, java.lang.Boolean> forPredicate(com.google.common.base.Predicate<T> predicate) {
        return new com.google.common.base.Functions.PredicateFunction(predicate);
    }

    private static class PredicateFunction<T> implements com.google.common.base.Function<T, java.lang.Boolean>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Predicate<T> predicate;

        private PredicateFunction(com.google.common.base.Predicate<T> predicate) {
            this.predicate = (com.google.common.base.Predicate) com.google.common.base.Preconditions.checkNotNull(predicate);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.google.common.base.Function
        public java.lang.Boolean apply(@com.google.common.base.ParametricNullness T t) {
            return java.lang.Boolean.valueOf(this.predicate.apply(t));
        }

        @Override // com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Functions.PredicateFunction) {
                return this.predicate.equals(((com.google.common.base.Functions.PredicateFunction) obj).predicate);
            }
            return false;
        }

        public int hashCode() {
            return this.predicate.hashCode();
        }

        public java.lang.String toString() {
            return "Functions.forPredicate(" + this.predicate + ")";
        }
    }

    public static <E> com.google.common.base.Function<java.lang.Object, E> constant(@com.google.common.base.ParametricNullness E value) {
        return new com.google.common.base.Functions.ConstantFunction(value);
    }

    private static class ConstantFunction<E> implements com.google.common.base.Function<java.lang.Object, E>, java.io.Serializable {
        private static final long serialVersionUID = 0;

        @com.google.common.base.ParametricNullness
        private final E value;

        public ConstantFunction(@com.google.common.base.ParametricNullness E value) {
            this.value = value;
        }

        @Override // com.google.common.base.Function
        @com.google.common.base.ParametricNullness
        public E apply(@javax.annotation.CheckForNull java.lang.Object from) {
            return this.value;
        }

        @Override // com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Functions.ConstantFunction) {
                return com.google.common.base.Objects.equal(this.value, ((com.google.common.base.Functions.ConstantFunction) obj).value);
            }
            return false;
        }

        public int hashCode() {
            E e = this.value;
            if (e == null) {
                return 0;
            }
            return e.hashCode();
        }

        public java.lang.String toString() {
            return "Functions.constant(" + this.value + ")";
        }
    }

    public static <F, T> com.google.common.base.Function<F, T> forSupplier(com.google.common.base.Supplier<T> supplier) {
        return new com.google.common.base.Functions.SupplierFunction(supplier);
    }

    private static class SupplierFunction<F, T> implements com.google.common.base.Function<F, T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Supplier<T> supplier;

        private SupplierFunction(com.google.common.base.Supplier<T> supplier) {
            this.supplier = (com.google.common.base.Supplier) com.google.common.base.Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.base.Function
        @com.google.common.base.ParametricNullness
        public T apply(@com.google.common.base.ParametricNullness F input) {
            return this.supplier.get();
        }

        @Override // com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (obj instanceof com.google.common.base.Functions.SupplierFunction) {
                return this.supplier.equals(((com.google.common.base.Functions.SupplierFunction) obj).supplier);
            }
            return false;
        }

        public int hashCode() {
            return this.supplier.hashCode();
        }

        public java.lang.String toString() {
            return "Functions.forSupplier(" + this.supplier + ")";
        }
    }
}
