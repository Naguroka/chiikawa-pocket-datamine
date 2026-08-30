package com.applovin.exoplayer2.common.base;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Optional<T> implements java.io.Serializable {
    private static final long serialVersionUID = 0;

    class a implements java.lang.Iterable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Iterable f537a;

        /* JADX INFO: renamed from: com.applovin.exoplayer2.common.base.Optional$a$a, reason: collision with other inner class name */
        class C0023a extends com.applovin.exoplayer2.common.base.b {
            private final java.util.Iterator c;

            C0023a() {
                this.c = (java.util.Iterator) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(com.applovin.exoplayer2.common.base.Optional.a.this.f537a.iterator());
            }

            @Override // com.applovin.exoplayer2.common.base.b
            protected java.lang.Object a() {
                while (this.c.hasNext()) {
                    com.applovin.exoplayer2.common.base.Optional optional = (com.applovin.exoplayer2.common.base.Optional) this.c.next();
                    if (optional.isPresent()) {
                        return optional.get();
                    }
                }
                return b();
            }
        }

        a(java.lang.Iterable iterable) {
            this.f537a = iterable;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator iterator() {
            return new com.applovin.exoplayer2.common.base.Optional.a.C0023a();
        }
    }

    Optional() {
    }

    public static <T> com.applovin.exoplayer2.common.base.Optional<T> absent() {
        return com.applovin.exoplayer2.common.base.a.a();
    }

    public static <T> com.applovin.exoplayer2.common.base.Optional<T> fromNullable(@org.checkerframework.checker.nullness.compatqual.NullableDecl T t) {
        return t == null ? absent() : new com.applovin.exoplayer2.common.base.d(t);
    }

    public static <T> com.applovin.exoplayer2.common.base.Optional<T> of(T t) {
        return new com.applovin.exoplayer2.common.base.d(com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(t));
    }

    public static <T> java.lang.Iterable<T> presentInstances(java.lang.Iterable<? extends com.applovin.exoplayer2.common.base.Optional<? extends T>> iterable) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(iterable);
        return new com.applovin.exoplayer2.common.base.Optional.a(iterable);
    }

    public abstract java.util.Set<T> asSet();

    public abstract boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj);

    public abstract T get();

    public abstract int hashCode();

    public abstract boolean isPresent();

    public abstract com.applovin.exoplayer2.common.base.Optional<T> or(com.applovin.exoplayer2.common.base.Optional<? extends T> optional);

    public abstract T or(com.applovin.exoplayer2.common.base.Supplier<? extends T> supplier);

    public abstract T or(T t);

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public abstract T orNull();

    public abstract java.lang.String toString();

    public abstract <V> com.applovin.exoplayer2.common.base.Optional<V> transform(com.applovin.exoplayer2.common.base.Function<? super T, V> function);
}
