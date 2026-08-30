package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
final class Present<T> extends com.google.common.base.Optional<T> {
    private static final long serialVersionUID = 0;
    private final T reference;

    @Override // com.google.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    Present(T reference) {
        this.reference = reference;
    }

    @Override // com.google.common.base.Optional
    public T get() {
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public T or(T defaultValue) {
        com.google.common.base.Preconditions.checkNotNull(defaultValue, "use Optional.orNull() instead of Optional.or(null)");
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public com.google.common.base.Optional<T> or(com.google.common.base.Optional<? extends T> secondChoice) {
        com.google.common.base.Preconditions.checkNotNull(secondChoice);
        return this;
    }

    @Override // com.google.common.base.Optional
    public T or(com.google.common.base.Supplier<? extends T> supplier) {
        com.google.common.base.Preconditions.checkNotNull(supplier);
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public T orNull() {
        return this.reference;
    }

    @Override // com.google.common.base.Optional
    public java.util.Set<T> asSet() {
        return java.util.Collections.singleton(this.reference);
    }

    @Override // com.google.common.base.Optional
    public <V> com.google.common.base.Optional<V> transform(com.google.common.base.Function<? super T, V> function) {
        return new com.google.common.base.Present(com.google.common.base.Preconditions.checkNotNull(function.apply(this.reference), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.google.common.base.Optional
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object instanceof com.google.common.base.Present) {
            return this.reference.equals(((com.google.common.base.Present) object).reference);
        }
        return false;
    }

    @Override // com.google.common.base.Optional
    public int hashCode() {
        return this.reference.hashCode() + 1502476572;
    }

    @Override // com.google.common.base.Optional
    public java.lang.String toString() {
        return "Optional.of(" + this.reference + ")";
    }
}
