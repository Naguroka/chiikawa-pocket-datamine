package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.errorprone.annotations.DoNotMock("Use Optional.of(value) or Optional.absent()")
@com.google.common.base.ElementTypesAreNonnullByDefault
public abstract class Optional<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;

    public abstract java.util.Set<T> asSet();

    public abstract boolean equals(@javax.annotation.CheckForNull java.lang.Object object);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract com.google.common.base.Optional<T> or(com.google.common.base.Optional<? extends T> secondChoice);

    public abstract T or(com.google.common.base.Supplier<? extends T> supplier);

    public abstract T or(T defaultValue);

    @javax.annotation.CheckForNull
    public abstract T orNull();

    public abstract java.lang.String toString();

    public abstract <V> com.google.common.base.Optional<V> transform(com.google.common.base.Function<? super T, V> function);

    public static <T> com.google.common.base.Optional<T> absent() {
        return com.google.common.base.Absent.withType();
    }

    public static <T> com.google.common.base.Optional<T> of(T reference) {
        return new com.google.common.base.Present(com.google.common.base.Preconditions.checkNotNull(reference));
    }

    public static <T> com.google.common.base.Optional<T> fromNullable(@javax.annotation.CheckForNull T nullableReference) {
        return nullableReference == null ? absent() : new com.google.common.base.Present(nullableReference);
    }

    Optional() {
    }

    public static <T> java.lang.Iterable<T> presentInstances(final java.lang.Iterable<? extends com.google.common.base.Optional<? extends T>> optionals) {
        com.google.common.base.Preconditions.checkNotNull(optionals);
        return new java.lang.Iterable<T>() { // from class: com.google.common.base.Optional.1
            @Override // java.lang.Iterable
            public java.util.Iterator<T> iterator() {
                return new com.google.common.base.AbstractIterator<T>() { // from class: com.google.common.base.Optional.1.1
                    private final java.util.Iterator<? extends com.google.common.base.Optional<? extends T>> iterator;

                    {
                        this.iterator = (java.util.Iterator) com.google.common.base.Preconditions.checkNotNull(optionals.iterator());
                    }

                    @Override // com.google.common.base.AbstractIterator
                    @javax.annotation.CheckForNull
                    protected T computeNext() {
                        while (this.iterator.hasNext()) {
                            com.google.common.base.Optional<? extends T> next = this.iterator.next();
                            if (next.isPresent()) {
                                return next.get();
                            }
                        }
                        return endOfData();
                    }
                };
            }
        };
    }
}
