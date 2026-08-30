package com.google.common.base;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.base.ElementTypesAreNonnullByDefault
final class FunctionalEquivalence<F, T> extends com.google.common.base.Equivalence<F> implements java.io.Serializable {
    private static final long serialVersionUID = 0;
    private final com.google.common.base.Function<? super F, ? extends T> function;
    private final com.google.common.base.Equivalence<T> resultEquivalence;

    FunctionalEquivalence(com.google.common.base.Function<? super F, ? extends T> function, com.google.common.base.Equivalence<T> resultEquivalence) {
        this.function = (com.google.common.base.Function) com.google.common.base.Preconditions.checkNotNull(function);
        this.resultEquivalence = (com.google.common.base.Equivalence) com.google.common.base.Preconditions.checkNotNull(resultEquivalence);
    }

    @Override // com.google.common.base.Equivalence
    protected boolean doEquivalent(F f, F f2) {
        return this.resultEquivalence.equivalent(this.function.apply(f), this.function.apply(f2));
    }

    @Override // com.google.common.base.Equivalence
    protected int doHash(F f) {
        return this.resultEquivalence.hash(this.function.apply(f));
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.common.base.FunctionalEquivalence)) {
            return false;
        }
        com.google.common.base.FunctionalEquivalence functionalEquivalence = (com.google.common.base.FunctionalEquivalence) obj;
        return this.function.equals(functionalEquivalence.function) && this.resultEquivalence.equals(functionalEquivalence.resultEquivalence);
    }

    public int hashCode() {
        return com.google.common.base.Objects.hashCode(this.function, this.resultEquivalence);
    }

    public java.lang.String toString() {
        return this.resultEquivalence + ".onResultOf(" + this.function + ")";
    }
}
