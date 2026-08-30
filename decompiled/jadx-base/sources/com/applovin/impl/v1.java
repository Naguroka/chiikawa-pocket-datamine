package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class v1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1416a;
    public final float b;

    public v1(int i, float f) {
        this.f1416a = i;
        this.b = f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.v1.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.v1 v1Var = (com.applovin.impl.v1) obj;
        return this.f1416a == v1Var.f1416a && java.lang.Float.compare(v1Var.b, this.b) == 0;
    }

    public int hashCode() {
        return ((this.f1416a + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + java.lang.Float.floatToIntBits(this.b);
    }
}
