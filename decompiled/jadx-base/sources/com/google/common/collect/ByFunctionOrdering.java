package com.google.common.collect;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.collect.ElementTypesAreNonnullByDefault
final class ByFunctionOrdering<F, T> extends com.google.common.collect.Ordering<F> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    final com.google.common.base.Function<F, ? extends T> function;
    final com.google.common.collect.Ordering<T> ordering;

    ByFunctionOrdering(com.google.common.base.Function<F, ? extends T> function, com.google.common.collect.Ordering<T> ordering) {
        this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
        this.ordering = (com.google.common.collect.Ordering) com.google.common.base.Preconditions.checkNotNull(ordering);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@com.google.common.collect.ParametricNullness F f, @com.google.common.collect.ParametricNullness F f2) {
        return this.ordering.compare(this.function.apply(f), this.function.apply(f2));
    }

    @Override // java.util.Comparator
    public boolean equals(@javax.annotation.CheckForNull java.lang.Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof com.google.common.collect.ByFunctionOrdering)) {
            return false;
        }
        com.google.common.collect.ByFunctionOrdering byFunctionOrdering = (com.google.common.collect.ByFunctionOrdering) object;
        return this.function.equals(byFunctionOrdering.function) && this.ordering.equals(byFunctionOrdering.ordering);
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(this.function, this.ordering);
    }

    public java.lang.String toString() {
        return this.ordering + ".onResultOf(" + this.function + ")";
    }
}
