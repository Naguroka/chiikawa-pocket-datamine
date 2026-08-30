package com.applovin.exoplayer2.common.base;

/* JADX INFO: loaded from: classes3.dex */
public abstract class Converter<A, B> implements com.applovin.exoplayer2.common.base.Function<A, B> {
    private final boolean handleNullAutomatically;

    @com.google.errorprone.annotations.concurrent.LazyInit
    @org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl
    private transient com.applovin.exoplayer2.common.base.Converter<B, A> reverse;

    class a implements java.lang.Iterable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.Iterable f527a;

        /* JADX INFO: renamed from: com.applovin.exoplayer2.common.base.Converter$a$a, reason: collision with other inner class name */
        class C0022a implements java.util.Iterator {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final java.util.Iterator f528a;

            C0022a() {
                this.f528a = com.applovin.exoplayer2.common.base.Converter.a.this.f527a.iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f528a.hasNext();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Iterator
            public java.lang.Object next() {
                return com.applovin.exoplayer2.common.base.Converter.this.convert(this.f528a.next());
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f528a.remove();
            }
        }

        a(java.lang.Iterable iterable) {
            this.f527a = iterable;
        }

        @Override // java.lang.Iterable
        public java.util.Iterator iterator() {
            return new com.applovin.exoplayer2.common.base.Converter.a.C0022a();
        }
    }

    private static final class b extends com.applovin.exoplayer2.common.base.Converter implements java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.applovin.exoplayer2.common.base.Converter f529a;
        final com.applovin.exoplayer2.common.base.Converter b;

        b(com.applovin.exoplayer2.common.base.Converter converter, com.applovin.exoplayer2.common.base.Converter converter2) {
            this.f529a = converter;
            this.b = converter2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.base.Converter
        java.lang.Object correctedDoBackward(java.lang.Object obj) {
            return this.f529a.correctedDoBackward(this.b.correctedDoBackward(obj));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.applovin.exoplayer2.common.base.Converter
        java.lang.Object correctedDoForward(java.lang.Object obj) {
            return this.b.correctedDoForward(this.f529a.correctedDoForward(obj));
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected java.lang.Object doBackward(java.lang.Object obj) {
            throw new java.lang.AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected java.lang.Object doForward(java.lang.Object obj) {
            throw new java.lang.AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.applovin.exoplayer2.common.base.Converter.b)) {
                return false;
            }
            com.applovin.exoplayer2.common.base.Converter.b bVar = (com.applovin.exoplayer2.common.base.Converter.b) obj;
            return this.f529a.equals(bVar.f529a) && this.b.equals(bVar.b);
        }

        public int hashCode() {
            return (this.f529a.hashCode() * 31) + this.b.hashCode();
        }

        public java.lang.String toString() {
            return this.f529a + ".andThen(" + this.b + ")";
        }
    }

    private static final class c extends com.applovin.exoplayer2.common.base.Converter implements java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.exoplayer2.common.base.Function f530a;
        private final com.applovin.exoplayer2.common.base.Function b;

        /* synthetic */ c(com.applovin.exoplayer2.common.base.Function function, com.applovin.exoplayer2.common.base.Function function2, com.applovin.exoplayer2.common.base.Converter.a aVar) {
            this(function, function2);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected java.lang.Object doBackward(java.lang.Object obj) {
            return this.b.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected java.lang.Object doForward(java.lang.Object obj) {
            return this.f530a.apply(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(java.lang.Object obj) {
            if (!(obj instanceof com.applovin.exoplayer2.common.base.Converter.c)) {
                return false;
            }
            com.applovin.exoplayer2.common.base.Converter.c cVar = (com.applovin.exoplayer2.common.base.Converter.c) obj;
            return this.f530a.equals(cVar.f530a) && this.b.equals(cVar.b);
        }

        public int hashCode() {
            return (this.f530a.hashCode() * 31) + this.b.hashCode();
        }

        public java.lang.String toString() {
            return "Converter.from(" + this.f530a + ", " + this.b + ")";
        }

        private c(com.applovin.exoplayer2.common.base.Function function, com.applovin.exoplayer2.common.base.Function function2) {
            this.f530a = (com.applovin.exoplayer2.common.base.Function) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(function);
            this.b = (com.applovin.exoplayer2.common.base.Function) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(function2);
        }
    }

    private static final class d extends com.applovin.exoplayer2.common.base.Converter implements java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final com.applovin.exoplayer2.common.base.Converter.d f531a = new com.applovin.exoplayer2.common.base.Converter.d();

        private d() {
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        com.applovin.exoplayer2.common.base.Converter doAndThen(com.applovin.exoplayer2.common.base.Converter converter) {
            return (com.applovin.exoplayer2.common.base.Converter) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(converter, "otherConverter");
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected java.lang.Object doBackward(java.lang.Object obj) {
            return obj;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected java.lang.Object doForward(java.lang.Object obj) {
            return obj;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public com.applovin.exoplayer2.common.base.Converter.d reverse() {
            return this;
        }

        public java.lang.String toString() {
            return "Converter.identity()";
        }
    }

    private static final class e extends com.applovin.exoplayer2.common.base.Converter implements java.io.Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final com.applovin.exoplayer2.common.base.Converter f532a;

        e(com.applovin.exoplayer2.common.base.Converter converter) {
            this.f532a = converter;
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        java.lang.Object correctedDoBackward(java.lang.Object obj) {
            return this.f532a.correctedDoForward(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        java.lang.Object correctedDoForward(java.lang.Object obj) {
            return this.f532a.correctedDoBackward(obj);
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected java.lang.Object doBackward(java.lang.Object obj) {
            throw new java.lang.AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        protected java.lang.Object doForward(java.lang.Object obj) {
            throw new java.lang.AssertionError();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter, com.applovin.exoplayer2.common.base.Function
        public boolean equals(java.lang.Object obj) {
            if (obj instanceof com.applovin.exoplayer2.common.base.Converter.e) {
                return this.f532a.equals(((com.applovin.exoplayer2.common.base.Converter.e) obj).f532a);
            }
            return false;
        }

        public int hashCode() {
            return ~this.f532a.hashCode();
        }

        @Override // com.applovin.exoplayer2.common.base.Converter
        public com.applovin.exoplayer2.common.base.Converter reverse() {
            return this.f532a;
        }

        public java.lang.String toString() {
            return this.f532a + ".reverse()";
        }
    }

    protected Converter() {
        this(true);
    }

    public static <A, B> com.applovin.exoplayer2.common.base.Converter<A, B> from(com.applovin.exoplayer2.common.base.Function<? super A, ? extends B> function, com.applovin.exoplayer2.common.base.Function<? super B, ? extends A> function2) {
        return new com.applovin.exoplayer2.common.base.Converter.c(function, function2, null);
    }

    public static <T> com.applovin.exoplayer2.common.base.Converter<T, T> identity() {
        return com.applovin.exoplayer2.common.base.Converter.d.f531a;
    }

    public final <C> com.applovin.exoplayer2.common.base.Converter<A, C> andThen(com.applovin.exoplayer2.common.base.Converter<B, C> converter) {
        return doAndThen(converter);
    }

    @Override // com.applovin.exoplayer2.common.base.Function
    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    @java.lang.Deprecated
    public final B apply(@org.checkerframework.checker.nullness.compatqual.NullableDecl A a2) {
        return convert(a2);
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    public final B convert(@org.checkerframework.checker.nullness.compatqual.NullableDecl A a2) {
        return correctedDoForward(a2);
    }

    public java.lang.Iterable<B> convertAll(java.lang.Iterable<? extends A> iterable) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(iterable, "fromIterable");
        return new com.applovin.exoplayer2.common.base.Converter.a(iterable);
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    A correctedDoBackward(@org.checkerframework.checker.nullness.compatqual.NullableDecl B b2) {
        if (!this.handleNullAutomatically) {
            return doBackward(b2);
        }
        if (b2 == null) {
            return null;
        }
        return (A) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(doBackward(b2));
    }

    @org.checkerframework.checker.nullness.compatqual.NullableDecl
    B correctedDoForward(@org.checkerframework.checker.nullness.compatqual.NullableDecl A a2) {
        if (!this.handleNullAutomatically) {
            return doForward(a2);
        }
        if (a2 == null) {
            return null;
        }
        return (B) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(doForward(a2));
    }

    <C> com.applovin.exoplayer2.common.base.Converter<A, C> doAndThen(com.applovin.exoplayer2.common.base.Converter<B, C> converter) {
        return new com.applovin.exoplayer2.common.base.Converter.b(this, (com.applovin.exoplayer2.common.base.Converter) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(converter));
    }

    protected abstract A doBackward(B b2);

    protected abstract B doForward(A a2);

    @Override // com.applovin.exoplayer2.common.base.Function
    public boolean equals(@org.checkerframework.checker.nullness.compatqual.NullableDecl java.lang.Object obj) {
        return super.equals(obj);
    }

    public com.applovin.exoplayer2.common.base.Converter<B, A> reverse() {
        com.applovin.exoplayer2.common.base.Converter<B, A> converter = this.reverse;
        if (converter != null) {
            return converter;
        }
        com.applovin.exoplayer2.common.base.Converter.e eVar = new com.applovin.exoplayer2.common.base.Converter.e(this);
        this.reverse = eVar;
        return eVar;
    }

    Converter(boolean z) {
        this.handleNullAutomatically = z;
    }
}
