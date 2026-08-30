package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
public abstract class Converter<A, B> implements com.google.common.base.Function<A, B> {
    private final boolean handleNullAutomatically;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.base.Converter<B, A> reverse;

    protected abstract A doBackward(B b);

    protected abstract B doForward(A a2);

    protected Converter() {
        this(true);
    }

    Converter(boolean handleNullAutomatically) {
        this.handleNullAutomatically = handleNullAutomatically;
    }

    @javax.annotation.CheckForNull
    public final B convert(@javax.annotation.CheckForNull A a2) {
        return correctedDoForward(a2);
    }

    @javax.annotation.CheckForNull
    B correctedDoForward(@javax.annotation.CheckForNull A a2) {
        if (!this.handleNullAutomatically) {
            return unsafeDoForward(a2);
        }
        if (a2 == null) {
            return null;
        }
        return (B) com.google.common.base.Preconditions.checkNotNull(doForward(a2));
    }

    @javax.annotation.CheckForNull
    A correctedDoBackward(@javax.annotation.CheckForNull B b) {
        if (!this.handleNullAutomatically) {
            return unsafeDoBackward(b);
        }
        if (b == null) {
            return null;
        }
        return (A) com.google.common.base.Preconditions.checkNotNull(doBackward(b));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @javax.annotation.CheckForNull
    private B unsafeDoForward(@javax.annotation.CheckForNull A a2) {
        return (B) doForward(com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(a2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @javax.annotation.CheckForNull
    private A unsafeDoBackward(@javax.annotation.CheckForNull B b) {
        return (A) doBackward(com.google.common.base.NullnessCasts.uncheckedCastNullableTToT(b));
    }

    public java.lang.Iterable<B> convertAll(final java.lang.Iterable<? extends A> fromIterable) {
        com.google.common.base.Preconditions.checkNotNull(fromIterable, "fromIterable");
        return new java.lang.Iterable<B>() { // from class: com.google.common.base.Converter.1
            @Override // java.lang.Iterable
            public java.util.Iterator<B> iterator() {
                return new java.util.Iterator<B>() { // from class: com.google.common.base.Converter.1.1
                    private final java.util.Iterator<? extends A> fromIterator;

                    {
                        this.fromIterator = fromIterable.iterator();
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return this.fromIterator.hasNext();
                    }

                    @Override // java.util.Iterator
                    public B next() {
                        return (B) com.google.common.base.Converter.this.convert(this.fromIterator.next());
                    }

                    @Override // java.util.Iterator
                    public void remove() {
                        this.fromIterator.remove();
                    }
                };
            }
        };
    }

    @com.google.errorprone.annotations.CheckReturnValue
    public com.google.common.base.Converter<B, A> reverse() {
        com.google.common.base.Converter<B, A> converter = this.reverse;
        if (converter != null) {
            return converter;
        }
        com.google.common.base.Converter.ReverseConverter reverseConverter = new com.google.common.base.Converter.ReverseConverter(this);
        this.reverse = reverseConverter;
        return reverseConverter;
    }

    private static final class ReverseConverter<A, B> extends com.google.common.base.Converter<B, A> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Converter<A, B> original;

        ReverseConverter(com.google.common.base.Converter<A, B> original) {
            this.original = original;
        }

        @Override // com.google.common.base.Converter
        protected A doForward(B b) {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.base.Converter
        protected B doBackward(A a2) {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.base.Converter
        @javax.annotation.CheckForNull
        A correctedDoForward(@javax.annotation.CheckForNull B b) {
            return this.original.correctedDoBackward(b);
        }

        @Override // com.google.common.base.Converter
        @javax.annotation.CheckForNull
        B correctedDoBackward(@javax.annotation.CheckForNull A a2) {
            return this.original.correctedDoForward(a2);
        }

        @Override // com.google.common.base.Converter
        public com.google.common.base.Converter<A, B> reverse() {
            return this.original;
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (object instanceof com.google.common.base.Converter.ReverseConverter) {
                return this.original.equals(((com.google.common.base.Converter.ReverseConverter) object).original);
            }
            return false;
        }

        public int hashCode() {
            return ~this.original.hashCode();
        }

        public java.lang.String toString() {
            return this.original + ".reverse()";
        }
    }

    public final <C> com.google.common.base.Converter<A, C> andThen(com.google.common.base.Converter<B, C> secondConverter) {
        return doAndThen(secondConverter);
    }

    <C> com.google.common.base.Converter<A, C> doAndThen(com.google.common.base.Converter<B, C> secondConverter) {
        return new com.google.common.base.Converter.ConverterComposition(this, (com.google.common.base.Converter) com.google.common.base.Preconditions.checkNotNull(secondConverter));
    }

    private static final class ConverterComposition<A, B, C> extends com.google.common.base.Converter<A, C> implements java.io.Serializable {
        private static final long serialVersionUID = 0;
        final com.google.common.base.Converter<A, B> first;
        final com.google.common.base.Converter<B, C> second;

        ConverterComposition(com.google.common.base.Converter<A, B> first, com.google.common.base.Converter<B, C> second) {
            this.first = first;
            this.second = second;
        }

        @Override // com.google.common.base.Converter
        protected C doForward(A a2) {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.base.Converter
        protected A doBackward(C c) {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.base.Converter
        @javax.annotation.CheckForNull
        C correctedDoForward(@javax.annotation.CheckForNull A a2) {
            return (C) this.second.correctedDoForward(this.first.correctedDoForward(a2));
        }

        @Override // com.google.common.base.Converter
        @javax.annotation.CheckForNull
        A correctedDoBackward(@javax.annotation.CheckForNull C c) {
            return (A) this.first.correctedDoBackward(this.second.correctedDoBackward(c));
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (!(object instanceof com.google.common.base.Converter.ConverterComposition)) {
                return false;
            }
            com.google.common.base.Converter.ConverterComposition converterComposition = (com.google.common.base.Converter.ConverterComposition) object;
            return this.first.equals(converterComposition.first) && this.second.equals(converterComposition.second);
        }

        public int hashCode() {
            return (this.first.hashCode() * 31) + this.second.hashCode();
        }

        public java.lang.String toString() {
            return this.first + ".andThen(" + this.second + ")";
        }
    }

    @Override // com.google.common.base.Function
    @java.lang.Deprecated
    public final B apply(A a2) {
        return convert(a2);
    }

    @Override // com.google.common.base.Function
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        return super.equals(object);
    }

    public static <A, B> com.google.common.base.Converter<A, B> from(com.google.common.base.Function<? super A, ? extends B> forwardFunction, com.google.common.base.Function<? super B, ? extends A> backwardFunction) {
        return new com.google.common.base.Converter.FunctionBasedConverter(forwardFunction, backwardFunction);
    }

    private static final class FunctionBasedConverter<A, B> extends com.google.common.base.Converter<A, B> implements java.io.Serializable {
        private final com.google.common.base.Function<? super B, ? extends A> backwardFunction;
        private final com.google.common.base.Function<? super A, ? extends B> forwardFunction;

        private FunctionBasedConverter(com.google.common.base.Function<? super A, ? extends B> forwardFunction, com.google.common.base.Function<? super B, ? extends A> backwardFunction) {
            this.forwardFunction = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(forwardFunction);
            this.backwardFunction = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(backwardFunction);
        }

        @Override // com.google.common.base.Converter
        protected B doForward(A a2) {
            return this.forwardFunction.apply(a2);
        }

        @Override // com.google.common.base.Converter
        protected A doBackward(B b) {
            return this.backwardFunction.apply(b);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
            if (!(object instanceof com.google.common.base.Converter.FunctionBasedConverter)) {
                return false;
            }
            com.google.common.base.Converter.FunctionBasedConverter functionBasedConverter = (com.google.common.base.Converter.FunctionBasedConverter) object;
            return this.forwardFunction.equals(functionBasedConverter.forwardFunction) && this.backwardFunction.equals(functionBasedConverter.backwardFunction);
        }

        public int hashCode() {
            return (this.forwardFunction.hashCode() * 31) + this.backwardFunction.hashCode();
        }

        public java.lang.String toString() {
            return "Converter.from(" + this.forwardFunction + ", " + this.backwardFunction + ")";
        }
    }

    public static <T> com.google.common.base.Converter<T, T> identity() {
        return (com.google.common.base.Converter.IdentityConverter) com.google.common.base.Converter.IdentityConverter.INSTANCE;
    }

    private static final class IdentityConverter<T> extends com.google.common.base.Converter<T, T> implements java.io.Serializable {
        static final com.google.common.base.Converter<?, ?> INSTANCE = new com.google.common.base.Converter.IdentityConverter();
        private static final long serialVersionUID = 0;

        @Override // com.google.common.base.Converter
        protected T doBackward(T t) {
            return t;
        }

        @Override // com.google.common.base.Converter
        protected T doForward(T t) {
            return t;
        }

        @Override // com.google.common.base.Converter
        public com.google.common.base.Converter.IdentityConverter<T> reverse() {
            return this;
        }

        public java.lang.String toString() {
            return "Converter.identity()";
        }

        private IdentityConverter() {
        }

        @Override // com.google.common.base.Converter
        <S> com.google.common.base.Converter<T, S> doAndThen(com.google.common.base.Converter<T, S> otherConverter) {
            return (com.google.common.base.Converter) com.google.common.base.Preconditions.checkNotNull(otherConverter, "otherConverter");
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }
}
