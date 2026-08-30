package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
public final class Interners {
    private Interners() {
    }

    public static class InternerBuilder {
        private final com.google.common.collect.MapMaker mapMaker;
        private boolean strong;

        private InternerBuilder() {
            this.mapMaker = new com.google.common.collect.MapMaker();
            this.strong = true;
        }

        public com.google.common.collect.Interners.InternerBuilder strong() {
            this.strong = true;
            return this;
        }

        public com.google.common.collect.Interners.InternerBuilder weak() {
            this.strong = false;
            return this;
        }

        public com.google.common.collect.Interners.InternerBuilder concurrencyLevel(int concurrencyLevel) {
            this.mapMaker.concurrencyLevel(concurrencyLevel);
            return this;
        }

        public <E> com.google.common.collect.Interner<E> build() {
            if (!this.strong) {
                this.mapMaker.weakKeys();
            }
            return new com.google.common.collect.Interners.InternerImpl(this.mapMaker);
        }
    }

    public static com.google.common.collect.Interners.InternerBuilder newBuilder() {
        return new com.google.common.collect.Interners.InternerBuilder();
    }

    public static <E> com.google.common.collect.Interner<E> newStrongInterner() {
        return newBuilder().strong().build();
    }

    public static <E> com.google.common.collect.Interner<E> newWeakInterner() {
        return newBuilder().weak().build();
    }

    static final class InternerImpl<E> implements com.google.common.collect.Interner<E> {
        final com.google.common.collect.MapMakerInternalMap<E, com.google.common.collect.MapMaker.Dummy, ?, ?> map;

        private InternerImpl(com.google.common.collect.MapMaker mapMaker) {
            this.map = com.google.common.collect.MapMakerInternalMap.createWithDummyValues(mapMaker.keyEquivalence(com.google.common.base.Equivalence.equals()));
        }

        @Override // com.google.common.collect.Interner
        public E intern(E e) {
            E e2;
            do {
                com.google.common.collect.MapMakerInternalMap.InternalEntry entry = this.map.getEntry(e);
                if (entry != null && (e2 = (E) entry.getKey()) != null) {
                    return e2;
                }
            } while (this.map.putIfAbsent(e, com.google.common.collect.MapMaker.Dummy.VALUE) != null);
            return e;
        }
    }

    public static <E> com.google.common.base.Function<E, E> asFunction(com.google.common.collect.Interner<E> interner) {
        return new com.google.common.collect.Interners.InternerFunction((com.google.common.collect.Interner) com.google.common.base.Preconditions.checkNotNull(interner));
    }

    private static class InternerFunction<E> implements com.google.common.base.Function<E, E> {
        private final com.google.common.collect.Interner<E> interner;

        public InternerFunction(com.google.common.collect.Interner<E> interner) {
            this.interner = interner;
        }

        @Override // com.google.common.base.Function
        public E apply(E input) {
            return this.interner.intern(input);
        }

        public int hashCode() {
            return this.interner.hashCode();
        }

        @Override // com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object other) {
            if (other instanceof com.google.common.collect.Interners.InternerFunction) {
                return this.interner.equals(((com.google.common.collect.Interners.InternerFunction) other).interner);
            }
            return false;
        }
    }
}
