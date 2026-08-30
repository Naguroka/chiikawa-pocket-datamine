package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class to {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1374a;
    private final com.applovin.impl.so[] b;
    private int c;

    public to(com.applovin.impl.so... soVarArr) {
        this.b = soVarArr;
        this.f1374a = soVarArr.length;
    }

    public com.applovin.impl.so a(int i) {
        return this.b[i];
    }

    public int hashCode() {
        if (this.c == 0) {
            this.c = java.util.Arrays.hashCode(this.b) + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE;
        }
        return this.c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.to.class != obj.getClass()) {
            return false;
        }
        return java.util.Arrays.equals(this.b, ((com.applovin.impl.to) obj).b);
    }
}
