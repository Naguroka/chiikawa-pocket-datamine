package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
final class Absent<T> extends com.google.common.base.Optional<T> {
    static final com.google.common.base.Absent<java.lang.Object> INSTANCE = new com.google.common.base.Absent<>();
    private static final long serialVersionUID = 0;

    @Override // com.google.common.base.Optional
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return object == this;
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // com.google.common.base.Optional
    @javax.annotation.CheckForNull
    public T orNull() {
        return null;
    }

    @Override // com.google.common.base.Optional
    public java.lang.String toString() {
        return "Optional.absent()";
    }

    static <T> com.google.common.base.Optional<T> withType() {
        return INSTANCE;
    }

    private Absent() {
    }

    @Override // com.google.common.base.Optional
    public T get() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.google.common.base.Optional
    public T or(T t) {
        return (T) com.google.common.base.Preconditions.checkNotNull(t, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // com.google.common.base.Optional
    public com.google.common.base.Optional<T> or(com.google.common.base.Optional<? extends T> secondChoice) {
        return (com.google.common.base.Optional) com.google.common.base.Preconditions.checkNotNull(secondChoice);
    }

    @Override // com.google.common.base.Optional
    public T or(com.google.common.base.Supplier<? extends T> supplier) {
        return (T) com.google.common.base.Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }

    @Override // com.google.common.base.Optional
    public java.util.Set<T> asSet() {
        return java.util.Collections.emptySet();
    }

    @Override // com.google.common.base.Optional
    public <V> com.google.common.base.Optional<V> transform(com.google.common.base.Function<? super T, V> function) {
        com.google.common.base.Preconditions.checkNotNull(function);
        return com.google.common.base.Optional.absent();
    }

    private java.lang.Object readResolve() {
        return INSTANCE;
    }
}
