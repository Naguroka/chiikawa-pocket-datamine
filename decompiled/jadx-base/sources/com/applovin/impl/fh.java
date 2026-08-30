package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class fh extends com.applovin.impl.ki {
    public static final com.applovin.impl.o2.a c = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.fh$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.o2.a
        public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
            return com.applovin.impl.fh.b(bundle);
        }
    };
    private final float b;

    public fh() {
        this.b = -1.0f;
    }

    public int hashCode() {
        return com.applovin.exoplayer2.common.base.Objects.hashCode(java.lang.Float.valueOf(this.b));
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof com.applovin.impl.fh) && this.b == ((com.applovin.impl.fh) obj).b;
    }

    public fh(float f) {
        com.applovin.impl.b1.a(f >= 0.0f && f <= 100.0f, "percent must be in the range of [0, 100]");
        this.b = f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.applovin.impl.fh b(android.os.Bundle bundle) {
        com.applovin.impl.b1.a(bundle.getInt(a(0), -1) == 1);
        float f = bundle.getFloat(a(1), -1.0f);
        return f == -1.0f ? new com.applovin.impl.fh() : new com.applovin.impl.fh(f);
    }

    private static java.lang.String a(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
