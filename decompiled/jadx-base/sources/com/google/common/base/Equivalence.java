package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public abstract class Equivalence<T> {
    protected abstract boolean doEquivalent(T a2, T b);

    protected abstract int doHash(T t);

    protected Equivalence() {
    }

    public final boolean equivalent(@javax.annotation.CheckForNull T a2, @javax.annotation.CheckForNull T b) {
        if (a2 == b) {
            return true;
        }
        if (a2 == null || b == null) {
            return false;
        }
        return doEquivalent(a2, b);
    }

    public final int hash(@javax.annotation.CheckForNull T t) {
        if (t == null) {
            return 0;
        }
        return doHash(t);
    }

    public final <F> com.google.common.base.Equivalence<F> onResultOf(com.google.common.base.Function<? super F, ? extends T> function) {
        return new com.google.common.base.FunctionalEquivalence(function, this);
    }

    public final <S extends T> com.google.common.base.Equivalence.Wrapper<S> wrap(@com.google.common.base.ParametricNullness S reference) {
        return new com.google.common.base.Equivalence.Wrapper<>(reference);
    }

    public static final class Wrapper<T> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Equivalence<? super T> equivalence;

        @com.google.common.base.ParametricNullness
        private final T reference;

        private Wrapper(com.google.common.base.Equivalence<? super T> equivalence, @com.google.common.base.ParametricNullness T reference) {
            this.equivalence = (com.google.common.base.Equivalence) com.google.common.base.Preconditions.checkNotNull(equivalence);
            this.reference = reference;
        }

        @com.google.common.base.ParametricNullness
        public T get() {
            return this.reference;
        }

        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.google.common.base.Equivalence.Wrapper)) {
                return false;
            }
            com.google.common.base.Equivalence.Wrapper wrapper = (com.google.common.base.Equivalence.Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.equivalent(this.reference, wrapper.reference);
            }
            return false;
        }

        public int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public java.lang.String toString() {
            return this.equivalence + ".wrap(" + this.reference + ")";
        }
    }

    public final <S extends T> com.google.common.base.Equivalence<java.lang.Iterable<S>> pairwise() {
        return new com.google.common.base.PairwiseEquivalence(this);
    }

    public final com.google.common.base.Predicate<T> equivalentTo(@javax.annotation.CheckForNull T target) {
        return new com.google.common.base.Equivalence.EquivalentToPredicate(this, target);
    }

    private static final class EquivalentToPredicate<T> implements com.google.common.base.Predicate<T>, java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.google.common.base.Equivalence<T> equivalence;

        @javax.annotation.CheckForNull
        private final T target;

        EquivalentToPredicate(com.google.common.base.Equivalence<T> equivalence, @javax.annotation.CheckForNull T target) {
            this.equivalence = (com.google.common.base.Equivalence) com.google.common.base.Preconditions.checkNotNull(equivalence);
            this.target = target;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@javax.annotation.CheckForNull T input) {
            return this.equivalence.equivalent(input, this.target);
        }

        @Override // com.google.common.base.Predicate
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.google.common.base.Equivalence.EquivalentToPredicate)) {
                return false;
            }
            com.google.common.base.Equivalence.EquivalentToPredicate equivalentToPredicate = (com.google.common.base.Equivalence.EquivalentToPredicate) obj;
            return this.equivalence.equals(equivalentToPredicate.equivalence) && com.google.common.base.Objects.equal(this.target, equivalentToPredicate.target);
        }

        public int hashCode() {
            return com.google.common.base.Objects.hashCode(this.equivalence, this.target);
        }

        public java.lang.String toString() {
            return this.equivalence + ".equivalentTo(" + this.target + ")";
        }
    }

    public static com.google.common.base.Equivalence<java.lang.Object> equals() {
        return com.google.common.base.Equivalence.Equals.INSTANCE;
    }

    public static com.google.common.base.Equivalence<java.lang.Object> identity() {
        return com.google.common.base.Equivalence.Identity.INSTANCE;
    }

    static final class Equals extends com.google.common.base.Equivalence<java.lang.Object> implements java.io.Serializable {
        static final com.google.common.base.Equivalence.Equals INSTANCE = new com.google.common.base.Equivalence.Equals();
        private static final long serialVersionUID = 1;

        Equals() {
        }

        @Override // com.google.common.base.Equivalence
        protected boolean doEquivalent(java.lang.Object a2, java.lang.Object b) {
            return a2.equals(b);
        }

        @Override // com.google.common.base.Equivalence
        protected int doHash(java.lang.Object o) {
            return o.hashCode();
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    static final class Identity extends com.google.common.base.Equivalence<java.lang.Object> implements java.io.Serializable {
        static final com.google.common.base.Equivalence.Identity INSTANCE = new com.google.common.base.Equivalence.Identity();
        private static final long serialVersionUID = 1;

        @Override // com.google.common.base.Equivalence
        protected boolean doEquivalent(java.lang.Object a2, java.lang.Object b) {
            return false;
        }

        Identity() {
        }

        @Override // com.google.common.base.Equivalence
        protected int doHash(java.lang.Object o) {
            return java.lang.System.identityHashCode(o);
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }
}
