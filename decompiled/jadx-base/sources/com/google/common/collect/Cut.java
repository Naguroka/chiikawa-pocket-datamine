package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
abstract class Cut<C extends java.lang.Comparable> implements java.lang.Comparable<com.google.common.collect.Cut<C>>, java.io.Serializable {
    private static final long serialVersionUID = 0;
    final C endpoint;

    com.google.common.collect.Cut<C> canonical(com.google.common.collect.DiscreteDomain<C> domain) {
        return this;
    }

    abstract void describeAsLowerBound(java.lang.StringBuilder sb);

    abstract void describeAsUpperBound(java.lang.StringBuilder sb);

    @javax.annotation.CheckForNull
    abstract C greatestValueBelow(com.google.common.collect.DiscreteDomain<C> domain);

    public abstract int hashCode();

    abstract boolean isLessThan(C value);

    @javax.annotation.CheckForNull
    abstract C leastValueAbove(com.google.common.collect.DiscreteDomain<C> domain);

    abstract com.google.common.collect.BoundType typeAsLowerBound();

    abstract com.google.common.collect.BoundType typeAsUpperBound();

    abstract com.google.common.collect.Cut<C> withLowerBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<C> domain);

    abstract com.google.common.collect.Cut<C> withUpperBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<C> domain);

    Cut(C endpoint) {
        this.endpoint = endpoint;
    }

    @Override // java.lang.Comparable
    public int compareTo(com.google.common.collect.Cut<C> that) {
        if (that == belowAll()) {
            return 1;
        }
        if (that == aboveAll()) {
            return -1;
        }
        int iCompareOrThrow = com.google.common.collect.Range.compareOrThrow(this.endpoint, that.endpoint);
        return iCompareOrThrow != 0 ? iCompareOrThrow : com.google.common.primitives.Booleans.compare(this instanceof com.google.common.collect.Cut.AboveValue, that instanceof com.google.common.collect.Cut.AboveValue);
    }

    C endpoint() {
        return this.endpoint;
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof com.google.common.collect.Cut)) {
            return false;
        }
        try {
            return compareTo((com.google.common.collect.Cut) obj) == 0;
        } catch (java.lang.ClassCastException unused) {
            return false;
        }
    }

    static <C extends java.lang.Comparable> com.google.common.collect.Cut<C> belowAll() {
        return com.google.common.collect.Cut.BelowAll.INSTANCE;
    }

    private static final class BelowAll extends com.google.common.collect.Cut<java.lang.Comparable<?>> {
        private static final com.google.common.collect.Cut.BelowAll INSTANCE = new com.google.common.collect.Cut.BelowAll();
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public int compareTo(com.google.common.collect.Cut<java.lang.Comparable<?>> o) {
            return o == this ? 0 : -1;
        }

        @Override // com.google.common.collect.Cut
        boolean isLessThan(java.lang.Comparable<?> value) {
            return true;
        }

        public java.lang.String toString() {
            return "-∞";
        }

        private BelowAll() {
            super("");
        }

        @Override // com.google.common.collect.Cut
        java.lang.Comparable<?> endpoint() {
            throw new java.lang.IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.BoundType typeAsLowerBound() {
            throw new java.lang.IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.BoundType typeAsUpperBound() {
            throw new java.lang.AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<java.lang.Comparable<?>> withLowerBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> domain) {
            throw new java.lang.IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<java.lang.Comparable<?>> withUpperBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> domain) {
            throw new java.lang.AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        void describeAsLowerBound(java.lang.StringBuilder sb) {
            sb.append("(-∞");
        }

        @Override // com.google.common.collect.Cut
        void describeAsUpperBound(java.lang.StringBuilder sb) {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.Cut
        java.lang.Comparable<?> leastValueAbove(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> domain) {
            return domain.minValue();
        }

        @Override // com.google.common.collect.Cut
        java.lang.Comparable<?> greatestValueBelow(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> domain) {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<java.lang.Comparable<?>> canonical(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> domain) {
            try {
                return com.google.common.collect.Cut.belowValue(domain.minValue());
            } catch (java.util.NoSuchElementException unused) {
                return this;
            }
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return java.lang.System.identityHashCode(this);
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    static <C extends java.lang.Comparable> com.google.common.collect.Cut<C> aboveAll() {
        return com.google.common.collect.Cut.AboveAll.INSTANCE;
    }

    private static final class AboveAll extends com.google.common.collect.Cut<java.lang.Comparable<?>> {
        private static final com.google.common.collect.Cut.AboveAll INSTANCE = new com.google.common.collect.Cut.AboveAll();
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public int compareTo(com.google.common.collect.Cut<java.lang.Comparable<?>> o) {
            return o == this ? 0 : 1;
        }

        @Override // com.google.common.collect.Cut
        boolean isLessThan(java.lang.Comparable<?> value) {
            return false;
        }

        public java.lang.String toString() {
            return "+∞";
        }

        private AboveAll() {
            super("");
        }

        @Override // com.google.common.collect.Cut
        java.lang.Comparable<?> endpoint() {
            throw new java.lang.IllegalStateException("range unbounded on this side");
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.BoundType typeAsLowerBound() {
            throw new java.lang.AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.BoundType typeAsUpperBound() {
            throw new java.lang.IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<java.lang.Comparable<?>> withLowerBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> domain) {
            throw new java.lang.AssertionError("this statement should be unreachable");
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<java.lang.Comparable<?>> withUpperBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> domain) {
            throw new java.lang.IllegalStateException();
        }

        @Override // com.google.common.collect.Cut
        void describeAsLowerBound(java.lang.StringBuilder sb) {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.Cut
        void describeAsUpperBound(java.lang.StringBuilder sb) {
            sb.append("+∞)");
        }

        @Override // com.google.common.collect.Cut
        java.lang.Comparable<?> leastValueAbove(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> domain) {
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.Cut
        java.lang.Comparable<?> greatestValueBelow(com.google.common.collect.DiscreteDomain<java.lang.Comparable<?>> domain) {
            return domain.maxValue();
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return java.lang.System.identityHashCode(this);
        }

        private java.lang.Object readResolve() {
            return INSTANCE;
        }
    }

    static <C extends java.lang.Comparable> com.google.common.collect.Cut<C> belowValue(C endpoint) {
        return new com.google.common.collect.Cut.BelowValue(endpoint);
    }

    private static final class BelowValue<C extends java.lang.Comparable> extends com.google.common.collect.Cut<C> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object that) {
            return super.compareTo((com.google.common.collect.Cut) that);
        }

        BelowValue(C endpoint) {
            super((java.lang.Comparable) com.google.common.base.Preconditions.checkNotNull(endpoint));
        }

        @Override // com.google.common.collect.Cut
        boolean isLessThan(C value) {
            return com.google.common.collect.Range.compareOrThrow(this.endpoint, value) <= 0;
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.BoundType typeAsLowerBound() {
            return com.google.common.collect.BoundType.CLOSED;
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.BoundType typeAsUpperBound() {
            return com.google.common.collect.BoundType.OPEN;
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<C> withLowerBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<C> domain) {
            int i = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                java.lang.Comparable comparablePrevious = domain.previous(this.endpoint);
                return comparablePrevious == null ? com.google.common.collect.Cut.belowAll() : new com.google.common.collect.Cut.AboveValue(comparablePrevious);
            }
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<C> withUpperBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<C> domain) {
            int i = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType[boundType.ordinal()];
            if (i == 1) {
                java.lang.Comparable comparablePrevious = domain.previous(this.endpoint);
                return comparablePrevious == null ? com.google.common.collect.Cut.aboveAll() : new com.google.common.collect.Cut.AboveValue(comparablePrevious);
            }
            if (i == 2) {
                return this;
            }
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.Cut
        void describeAsLowerBound(java.lang.StringBuilder sb) {
            sb.append('[').append(this.endpoint);
        }

        @Override // com.google.common.collect.Cut
        void describeAsUpperBound(java.lang.StringBuilder sb) {
            sb.append(this.endpoint).append(')');
        }

        @Override // com.google.common.collect.Cut
        C leastValueAbove(com.google.common.collect.DiscreteDomain<C> domain) {
            return this.endpoint;
        }

        @Override // com.google.common.collect.Cut
        @javax.annotation.CheckForNull
        C greatestValueBelow(com.google.common.collect.DiscreteDomain<C> discreteDomain) {
            return (C) discreteDomain.previous(this.endpoint);
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return this.endpoint.hashCode();
        }

        public java.lang.String toString() {
            return "\\" + this.endpoint + "/";
        }
    }

    /* JADX INFO: renamed from: com.google.common.collect.Cut$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$common$collect$BoundType;

        static {
            int[] iArr = new int[com.google.common.collect.BoundType.values().length];
            $SwitchMap$com$google$common$collect$BoundType = iArr;
            try {
                iArr[com.google.common.collect.BoundType.CLOSED.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$common$collect$BoundType[com.google.common.collect.BoundType.OPEN.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
        }
    }

    static <C extends java.lang.Comparable> com.google.common.collect.Cut<C> aboveValue(C endpoint) {
        return new com.google.common.collect.Cut.AboveValue(endpoint);
    }

    private static final class AboveValue<C extends java.lang.Comparable> extends com.google.common.collect.Cut<C> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.Cut, java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(java.lang.Object that) {
            return super.compareTo((com.google.common.collect.Cut) that);
        }

        AboveValue(C endpoint) {
            super((java.lang.Comparable) com.google.common.base.Preconditions.checkNotNull(endpoint));
        }

        @Override // com.google.common.collect.Cut
        boolean isLessThan(C value) {
            return com.google.common.collect.Range.compareOrThrow(this.endpoint, value) < 0;
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.BoundType typeAsLowerBound() {
            return com.google.common.collect.BoundType.OPEN;
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.BoundType typeAsUpperBound() {
            return com.google.common.collect.BoundType.CLOSED;
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<C> withLowerBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<C> domain) {
            int i = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType[boundType.ordinal()];
            if (i == 1) {
                java.lang.Comparable next = domain.next(this.endpoint);
                return next == null ? com.google.common.collect.Cut.belowAll() : belowValue(next);
            }
            if (i == 2) {
                return this;
            }
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<C> withUpperBoundType(com.google.common.collect.BoundType boundType, com.google.common.collect.DiscreteDomain<C> domain) {
            int i = com.google.common.collect.Cut.AnonymousClass1.$SwitchMap$com$google$common$collect$BoundType[boundType.ordinal()];
            if (i == 1) {
                return this;
            }
            if (i == 2) {
                java.lang.Comparable next = domain.next(this.endpoint);
                return next == null ? com.google.common.collect.Cut.aboveAll() : belowValue(next);
            }
            throw new java.lang.AssertionError();
        }

        @Override // com.google.common.collect.Cut
        void describeAsLowerBound(java.lang.StringBuilder sb) {
            sb.append('(').append(this.endpoint);
        }

        @Override // com.google.common.collect.Cut
        void describeAsUpperBound(java.lang.StringBuilder sb) {
            sb.append(this.endpoint).append(']');
        }

        @Override // com.google.common.collect.Cut
        @javax.annotation.CheckForNull
        C leastValueAbove(com.google.common.collect.DiscreteDomain<C> discreteDomain) {
            return (C) discreteDomain.next(this.endpoint);
        }

        @Override // com.google.common.collect.Cut
        C greatestValueBelow(com.google.common.collect.DiscreteDomain<C> domain) {
            return this.endpoint;
        }

        @Override // com.google.common.collect.Cut
        com.google.common.collect.Cut<C> canonical(com.google.common.collect.DiscreteDomain<C> domain) {
            java.lang.Comparable comparableLeastValueAbove = leastValueAbove(domain);
            return comparableLeastValueAbove != null ? belowValue(comparableLeastValueAbove) : com.google.common.collect.Cut.aboveAll();
        }

        @Override // com.google.common.collect.Cut
        public int hashCode() {
            return ~this.endpoint.hashCode();
        }

        public java.lang.String toString() {
            return "/" + this.endpoint + "\\";
        }
    }
}
