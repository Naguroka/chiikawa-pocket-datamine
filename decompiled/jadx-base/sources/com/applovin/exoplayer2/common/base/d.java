package com.applovin.exoplayer2.common.base;

/* JADX INFO: loaded from: classes3.dex */
final class d extends com.applovin.exoplayer2.common.base.Optional {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final java.lang.Object f555a;

    d(java.lang.Object obj) {
        this.f555a = obj;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public java.util.Set asSet() {
        return java.util.Collections.singleton(this.f555a);
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean equals(java.lang.Object obj) {
        if (obj instanceof com.applovin.exoplayer2.common.base.d) {
            return this.f555a.equals(((com.applovin.exoplayer2.common.base.d) obj).f555a);
        }
        return false;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public java.lang.Object get() {
        return this.f555a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public int hashCode() {
        return this.f555a.hashCode() + 1502476572;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public boolean isPresent() {
        return true;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public java.lang.Object or(java.lang.Object obj) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(obj, "use Optional.orNull() instead of Optional.or(null)");
        return this.f555a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public java.lang.Object orNull() {
        return this.f555a;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public java.lang.String toString() {
        return "Optional.of(" + this.f555a + ")";
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public com.applovin.exoplayer2.common.base.Optional transform(com.applovin.exoplayer2.common.base.Function function) {
        return new com.applovin.exoplayer2.common.base.d(com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(function.apply(this.f555a), "the Function passed to Optional.transform() must not return null."));
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public com.applovin.exoplayer2.common.base.Optional or(com.applovin.exoplayer2.common.base.Optional optional) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(optional);
        return this;
    }

    @Override // com.applovin.exoplayer2.common.base.Optional
    public java.lang.Object or(com.applovin.exoplayer2.common.base.Supplier supplier) {
        com.applovin.exoplayer2.common.base.Preconditions.checkNotNull(supplier);
        return this.f555a;
    }
}
