package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class GeneralRange<T> implements java.io.Serializable {
    private final java.util.Comparator<? super T> comparator;
    private final boolean hasLowerBound;
    private final boolean hasUpperBound;
    private final com.google.common.collect.BoundType lowerBoundType;

    @javax.annotation.CheckForNull
    private final T lowerEndpoint;

    @javax.annotation.CheckForNull
    @com.google.errorprone.annotations.concurrent.LazyInit
    private transient com.google.common.collect.GeneralRange<T> reverse;
    private final com.google.common.collect.BoundType upperBoundType;

    @javax.annotation.CheckForNull
    private final T upperEndpoint;

    static <T extends java.lang.Comparable> com.google.common.collect.GeneralRange<T> from(com.google.common.collect.Range<T> range) {
        return new com.google.common.collect.GeneralRange<>(com.google.common.collect.Ordering.natural(), range.hasLowerBound(), range.hasLowerBound() ? range.lowerEndpoint() : null, range.hasLowerBound() ? range.lowerBoundType() : com.google.common.collect.BoundType.OPEN, range.hasUpperBound(), range.hasUpperBound() ? range.upperEndpoint() : null, range.hasUpperBound() ? range.upperBoundType() : com.google.common.collect.BoundType.OPEN);
    }

    static <T> com.google.common.collect.GeneralRange<T> all(java.util.Comparator<? super T> comparator) {
        return new com.google.common.collect.GeneralRange<>(comparator, false, null, com.google.common.collect.BoundType.OPEN, false, null, com.google.common.collect.BoundType.OPEN);
    }

    static <T> com.google.common.collect.GeneralRange<T> downTo(java.util.Comparator<? super T> comparator, @com.google.common.collect.ParametricNullness T endpoint, com.google.common.collect.BoundType boundType) {
        return new com.google.common.collect.GeneralRange<>(comparator, true, endpoint, boundType, false, null, com.google.common.collect.BoundType.OPEN);
    }

    static <T> com.google.common.collect.GeneralRange<T> upTo(java.util.Comparator<? super T> comparator, @com.google.common.collect.ParametricNullness T endpoint, com.google.common.collect.BoundType boundType) {
        return new com.google.common.collect.GeneralRange<>(comparator, false, null, com.google.common.collect.BoundType.OPEN, true, endpoint, boundType);
    }

    static <T> com.google.common.collect.GeneralRange<T> range(java.util.Comparator<? super T> comparator, @com.google.common.collect.ParametricNullness T lower, com.google.common.collect.BoundType lowerType, @com.google.common.collect.ParametricNullness T upper, com.google.common.collect.BoundType upperType) {
        return new com.google.common.collect.GeneralRange<>(comparator, true, lower, lowerType, true, upper, upperType);
    }

    private GeneralRange(java.util.Comparator<? super T> comparator, boolean z, @javax.annotation.CheckForNull T t, com.google.common.collect.BoundType boundType, boolean z2, @javax.annotation.CheckForNull T t2, com.google.common.collect.BoundType boundType2) {
        this.comparator = (java.util.Comparator) com.google.common.base.Preconditions.checkNotNull(comparator);
        this.hasLowerBound = z;
        this.hasUpperBound = z2;
        this.lowerEndpoint = t;
        this.lowerBoundType = (com.google.common.collect.BoundType) com.google.common.base.Preconditions.checkNotNull(boundType);
        this.upperEndpoint = t2;
        this.upperBoundType = (com.google.common.collect.BoundType) com.google.common.base.Preconditions.checkNotNull(boundType2);
        if (z) {
            comparator.compare((java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(t), (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(t));
        }
        if (z2) {
            comparator.compare((java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(t2), (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(t2));
        }
        if (z && z2) {
            int iCompare = comparator.compare((java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(t), (java.lang.Object) com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(t2));
            boolean z3 = true;
            com.google.common.base.Preconditions.checkArgument(iCompare <= 0, "lowerEndpoint (%s) > upperEndpoint (%s)", t, t2);
            if (iCompare == 0) {
                if (boundType == com.google.common.collect.BoundType.OPEN && boundType2 == com.google.common.collect.BoundType.OPEN) {
                    z3 = false;
                }
                com.google.common.base.Preconditions.checkArgument(z3);
            }
        }
    }

    java.util.Comparator<? super T> comparator() {
        return this.comparator;
    }

    boolean hasLowerBound() {
        return this.hasLowerBound;
    }

    boolean hasUpperBound() {
        return this.hasUpperBound;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean isEmpty() {
        return (hasUpperBound() && tooLow(com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(getUpperEndpoint()))) || (hasLowerBound() && tooHigh(com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(getLowerEndpoint())));
    }

    boolean tooLow(@com.google.common.collect.ParametricNullness T t) {
        if (!hasLowerBound()) {
            return false;
        }
        int iCompare = this.comparator.compare(t, com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(getLowerEndpoint()));
        return ((iCompare == 0) & (getLowerBoundType() == com.google.common.collect.BoundType.OPEN)) | (iCompare < 0);
    }

    boolean tooHigh(@com.google.common.collect.ParametricNullness T t) {
        if (!hasUpperBound()) {
            return false;
        }
        int iCompare = this.comparator.compare(t, com.google.common.collect.NullnessCasts.uncheckedCastNullableTToT(getUpperEndpoint()));
        return ((iCompare == 0) & (getUpperBoundType() == com.google.common.collect.BoundType.OPEN)) | (iCompare > 0);
    }

    boolean contains(@com.google.common.collect.ParametricNullness T t) {
        return (tooLow(t) || tooHigh(t)) ? false : true;
    }

    com.google.common.collect.GeneralRange<T> intersect(com.google.common.collect.GeneralRange<T> other) {
        int iCompare;
        int iCompare2;
        T t;
        com.google.common.collect.BoundType boundType;
        com.google.common.collect.BoundType boundType2;
        int iCompare3;
        com.google.common.base.Preconditions.checkNotNull(other);
        com.google.common.base.Preconditions.checkArgument(this.comparator.equals(other.comparator));
        boolean z = this.hasLowerBound;
        T lowerEndpoint = getLowerEndpoint();
        com.google.common.collect.BoundType lowerBoundType = getLowerBoundType();
        if (!hasLowerBound()) {
            z = other.hasLowerBound;
            lowerEndpoint = other.getLowerEndpoint();
            lowerBoundType = other.getLowerBoundType();
        } else if (other.hasLowerBound() && ((iCompare = this.comparator.compare(getLowerEndpoint(), other.getLowerEndpoint())) < 0 || (iCompare == 0 && other.getLowerBoundType() == com.google.common.collect.BoundType.OPEN))) {
            lowerEndpoint = other.getLowerEndpoint();
            lowerBoundType = other.getLowerBoundType();
        }
        boolean z2 = z;
        boolean z3 = this.hasUpperBound;
        T upperEndpoint = getUpperEndpoint();
        com.google.common.collect.BoundType upperBoundType = getUpperBoundType();
        if (!hasUpperBound()) {
            z3 = other.hasUpperBound;
            upperEndpoint = other.getUpperEndpoint();
            upperBoundType = other.getUpperBoundType();
        } else if (other.hasUpperBound() && ((iCompare2 = this.comparator.compare(getUpperEndpoint(), other.getUpperEndpoint())) > 0 || (iCompare2 == 0 && other.getUpperBoundType() == com.google.common.collect.BoundType.OPEN))) {
            upperEndpoint = other.getUpperEndpoint();
            upperBoundType = other.getUpperBoundType();
        }
        boolean z4 = z3;
        T t2 = upperEndpoint;
        if (z2 && z4 && ((iCompare3 = this.comparator.compare(lowerEndpoint, t2)) > 0 || (iCompare3 == 0 && lowerBoundType == com.google.common.collect.BoundType.OPEN && upperBoundType == com.google.common.collect.BoundType.OPEN))) {
            boundType = com.google.common.collect.BoundType.OPEN;
            boundType2 = com.google.common.collect.BoundType.CLOSED;
            t = t2;
        } else {
            t = lowerEndpoint;
            boundType = lowerBoundType;
            boundType2 = upperBoundType;
        }
        return new com.google.common.collect.GeneralRange<>(this.comparator, z2, t, boundType, z4, t2, boundType2);
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (!(obj instanceof com.google.common.collect.GeneralRange)) {
            return false;
        }
        com.google.common.collect.GeneralRange generalRange = (com.google.common.collect.GeneralRange) obj;
        return this.comparator.equals(generalRange.comparator) && this.hasLowerBound == generalRange.hasLowerBound && this.hasUpperBound == generalRange.hasUpperBound && getLowerBoundType().equals(generalRange.getLowerBoundType()) && getUpperBoundType().equals(generalRange.getUpperBoundType()) && com.google.common.base.Objects.equal(getLowerEndpoint(), generalRange.getLowerEndpoint()) && com.google.common.base.Objects.equal(getUpperEndpoint(), generalRange.getUpperEndpoint());
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(this.comparator, getLowerEndpoint(), getLowerBoundType(), getUpperEndpoint(), getUpperBoundType());
    }

    com.google.common.collect.GeneralRange<T> reverse() {
        com.google.common.collect.GeneralRange<T> generalRange = this.reverse;
        if (generalRange != null) {
            return generalRange;
        }
        com.google.common.collect.GeneralRange<T> generalRange2 = new com.google.common.collect.GeneralRange<>(com.google.common.collect.Ordering.from(this.comparator).reverse(), this.hasUpperBound, getUpperEndpoint(), getUpperBoundType(), this.hasLowerBound, getLowerEndpoint(), getLowerBoundType());
        generalRange2.reverse = this;
        this.reverse = generalRange2;
        return generalRange2;
    }

    public java.lang.String toString() {
        return this.comparator + ":" + (this.lowerBoundType == com.google.common.collect.BoundType.CLOSED ? '[' : '(') + (this.hasLowerBound ? this.lowerEndpoint : "-∞") + ',' + (this.hasUpperBound ? this.upperEndpoint : "∞") + (this.upperBoundType == com.google.common.collect.BoundType.CLOSED ? ']' : ')');
    }

    @javax.annotation.CheckForNull
    T getLowerEndpoint() {
        return this.lowerEndpoint;
    }

    com.google.common.collect.BoundType getLowerBoundType() {
        return this.lowerBoundType;
    }

    @javax.annotation.CheckForNull
    T getUpperEndpoint() {
        return this.upperEndpoint;
    }

    com.google.common.collect.BoundType getUpperBoundType() {
        return this.upperBoundType;
    }
}
