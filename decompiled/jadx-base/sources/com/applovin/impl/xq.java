package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class xq implements com.applovin.impl.o2 {
    public static final com.applovin.impl.xq f = new com.applovin.impl.xq(0, 0);
    public static final com.applovin.impl.o2.a g = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.xq$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.o2.a
        public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
            return com.applovin.impl.xq.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1516a;
    public final int b;
    public final int c;
    public final float d;

    public xq(int i, int i2) {
        this(i, i2, 0, 1.0f);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.xq)) {
            return false;
        }
        com.applovin.impl.xq xqVar = (com.applovin.impl.xq) obj;
        return this.f1516a == xqVar.f1516a && this.b == xqVar.b && this.c == xqVar.c && this.d == xqVar.d;
    }

    public int hashCode() {
        return ((((((this.f1516a + 217) * 31) + this.b) * 31) + this.c) * 31) + java.lang.Float.floatToRawIntBits(this.d);
    }

    private static java.lang.String a(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    public xq(int i, int i2, int i3, float f2) {
        this.f1516a = i;
        this.b = i2;
        this.c = i3;
        this.d = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.xq a(android.os.Bundle bundle) {
        return new com.applovin.impl.xq(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0), bundle.getFloat(a(3), 1.0f));
    }
}
