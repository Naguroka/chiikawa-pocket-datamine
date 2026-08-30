package com.applovin.exoplayer2.common.base;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Equivalence<T> {

    public static final class Wrapper<T> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        private final com.applovin.exoplayer2.common.base.Equivalence<? super T> equivalence;

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        private final T reference;

        public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof com.applovin.exoplayer2.common.base.Equivalence.Wrapper)) {
                return false;
            }
            com.applovin.exoplayer2.common.base.Equivalence.Wrapper wrapper = (com.applovin.exoplayer2.common.base.Equivalence.Wrapper) obj;
            if (this.equivalence.equals(wrapper.equivalence)) {
                return this.equivalence.equivalent(this.reference, wrapper.reference);
            }
            return false;
        }

        @org.checkerframework.checker.nullness.compatqual.NullableDecl
        public T get() {
            return this.reference;
        }

        public int hashCode() {
            return this.equivalence.hash(this.reference);
        }

        public java.lang.String toString() {
            return this.equivalence + ".wrap(" + this.reference + ")";
        }

        private Wrapper(com.applovin.exoplayer2.common.base.Equivalence<? super T> equivalence, @org.checkerframework.checker.nullness.compatqual.NullableDecl T t) {
            this.equivalence = (com.applovin.exoplayer2.common.base.Equivalence) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(equivalence);
            this.reference = t;
        }
    }

    static final class b extends com.applovin.exoplayer2.common.base.Equivalence implements java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final com.applovin.exoplayer2.common.base.Equivalence.b f533a = new com.applovin.exoplayer2.common.base.Equivalence.b();

        b() {
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        protected boolean doEquivalent(java.lang.Object obj, java.lang.Object obj2) {
            return obj.equals(obj2);
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        protected int doHash(java.lang.Object obj) {
            return obj.hashCode();
        }
    }

    private static final class c implements com.applovin.exoplayer2.common.base.Predicate, java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.common.base.Equivalence f534a;
        private final java.lang.Object b;

        c(com.applovin.exoplayer2.common.base.Equivalence equivalence, java.lang.Object obj) {
            this.f534a = (com.applovin.exoplayer2.common.base.Equivalence) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(equivalence);
            this.b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean apply(java.lang.Object obj) {
            return this.f534a.equivalent(obj, this.b);
        }

        @Override // com.applovin.exoplayer2.common.base.Predicate
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof com.applovin.exoplayer2.common.base.Equivalence.c)) {
                return false;
            }
            com.applovin.exoplayer2.common.base.Equivalence.c cVar = (com.applovin.exoplayer2.common.base.Equivalence.c) obj;
            return this.f534a.equals(cVar.f534a) && com.applovin.exoplayer2.common.base.Objects.equal(this.b, cVar.b);
        }

        public int hashCode() {
            return com.applovin.exoplayer2.common.base.Objects.hashCode(this.f534a, this.b);
        }

        public java.lang.String toString() {
            return this.f534a + ".equivalentTo(" + this.b + ")";
        }
    }

    static final class d extends com.applovin.exoplayer2.common.base.Equivalence implements java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final com.applovin.exoplayer2.common.base.Equivalence.d f535a = new com.applovin.exoplayer2.common.base.Equivalence.d();

        d() {
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        protected boolean doEquivalent(java.lang.Object obj, java.lang.Object obj2) {
            return false;
        }

        @Override // com.applovin.exoplayer2.common.base.Equivalence
        protected int doHash(java.lang.Object obj) {
            return java.lang.System.identityHashCode(obj);
        }
    }

    protected Equivalence() {
    }

    public static com.applovin.exoplayer2.common.base.Equivalence<java.lang.Object> equals() {
        return com.applovin.exoplayer2.common.base.Equivalence.b.f533a;
    }

    public static com.applovin.exoplayer2.common.base.Equivalence<java.lang.Object> identity() {
        return com.applovin.exoplayer2.common.base.Equivalence.d.f535a;
    }

    protected abstract boolean doEquivalent(T t, T t2);

    protected abstract int doHash(T t);

    public final boolean equivalent(@org.checkerframework.checker.nullness.compatqual.NullableDecl T t, @org.checkerframework.checker.nullness.compatqual.NullableDecl T t2) {
        if (t == t2) {
            return true;
        }
        if (t == null || t2 == null) {
            return false;
        }
        return doEquivalent(t, t2);
    }

    public final com.applovin.exoplayer2.common.base.Predicate<T> equivalentTo(@org.checkerframework.checker.nullness.compatqual.NullableDecl T t) {
        return new com.applovin.exoplayer2.common.base.Equivalence.c(this, t);
    }

    public final int hash(@org.checkerframework.checker.nullness.compatqual.NullableDecl T t) {
        if (t == null) {
            return 0;
        }
        return doHash(t);
    }

    public final <S extends T> com.applovin.exoplayer2.common.base.Equivalence.Wrapper<S> wrap(@org.checkerframework.checker.nullness.compatqual.NullableDecl S s) {
        return new com.applovin.exoplayer2.common.base.Equivalence.Wrapper<>(s);
    }
}
