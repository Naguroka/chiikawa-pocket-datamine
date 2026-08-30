package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class cl extends com.applovin.impl.ki {
    public static final com.applovin.impl.o2.a d = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.cl$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.o2.a
        public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
            return com.applovin.impl.cl.b(bundle);
        }
    };
    private final int b;
    private final float c;

    public cl(int i) {
        com.applovin.impl.b1.a(i > 0, "maxStars must be a positive integer");
        this.b = i;
        this.c = -1.0f;
    }

    public int hashCode() {
        return com.applovin.exoplayer2.common.base.Objects.hashCode(java.lang.Integer.valueOf(this.b), java.lang.Float.valueOf(this.c));
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.applovin.impl.cl)) {
            return false;
        }
        com.applovin.impl.cl clVar = (com.applovin.impl.cl) obj;
        return this.b == clVar.b && this.c == clVar.c;
    }

    public cl(int i, float f) {
        com.applovin.impl.b1.a(i > 0, "maxStars must be a positive integer");
        com.applovin.impl.b1.a(f >= 0.0f && f <= ((float) i), "starRating is out of range [0, maxStars]");
        this.b = i;
        this.c = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.applovin.impl.cl b(android.os.Bundle bundle) {
        com.applovin.impl.b1.a(bundle.getInt(a(0), -1) == 2);
        int i = bundle.getInt(a(1), 5);
        float f = bundle.getFloat(a(2), -1.0f);
        if (f == -1.0f) {
            return new com.applovin.impl.cl(i);
        }
        return new com.applovin.impl.cl(i, f);
    }

    private static java.lang.String a(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
