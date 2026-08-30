package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class si {
    public static final com.applovin.impl.si b = new com.applovin.impl.si(false);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1338a;

    public si(boolean z) {
        this.f1338a = z;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && com.applovin.impl.si.class == obj.getClass() && this.f1338a == ((com.applovin.impl.si) obj).f1338a;
    }

    public int hashCode() {
        return !this.f1338a ? 1 : 0;
    }
}
