package com.applovin.exoplayer2.common.base;

/* JADX INFO: loaded from: classes3.dex */
final class a extends com.applovin.exoplayer2.common.base.Optional {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final com.applovin.exoplayer2.common.base.a f551a = new com.applovin.exoplayer2.common.base.a();

    private a() {
    }

    static com.applovin.exoplayer2.common.base.Optional a() {
        return f551a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public java.util.Set asSet() {
        return java.util.Collections.emptySet();
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean equals(java.lang.Object obj) {
        return obj == this;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public java.lang.Object get() {
        throw new java.lang.IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public int hashCode() {
        return 2040732332;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean isPresent() {
        return false;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public java.lang.Object or(java.lang.Object obj) {
        return com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public java.lang.Object orNull() {
        return null;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public java.lang.String toString() {
        return "Optional.absent()";
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public com.applovin.exoplayer2.common.base.Optional transform(com.applovin.exoplayer2.common.base.Function function) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(function);
        return com.applovin.exoplayer2.common.base.Optional.absent();
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public com.applovin.exoplayer2.common.base.Optional or(com.applovin.exoplayer2.common.base.Optional optional) {
        return (com.applovin.exoplayer2.common.base.Optional) com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(optional);
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public java.lang.Object or(com.applovin.exoplayer2.common.base.Supplier supplier) {
        return com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(supplier.get(), "use Optional.orNull() instead of a Supplier that returns null");
    }
}
