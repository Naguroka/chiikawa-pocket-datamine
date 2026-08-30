package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ph implements com.applovin.impl.o2 {
    public static final com.applovin.impl.ph d = new com.applovin.impl.ph(1.0f);
    public static final com.applovin.impl.o2.a f = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.ph$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.o2.a
        public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
            return com.applovin.impl.ph.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f1145a;
    public final float b;
    private final int c;

    public ph(float f2) {
        this(f2, 1.0f);
    }

    public long a(long j) {
        return j * ((long) this.c);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.ph.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.ph phVar = (com.applovin.impl.ph) obj;
        return this.f1145a == phVar.f1145a && this.b == phVar.b;
    }

    public int hashCode() {
        return ((java.lang.Float.floatToRawIntBits(this.f1145a) + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + java.lang.Float.floatToRawIntBits(this.b);
    }

    public ph(float f2, float f3) {
        com.applovin.impl.b1.a(f2 > 0.0f);
        com.applovin.impl.b1.a(f3 > 0.0f);
        this.f1145a = f2;
        this.b = f3;
        this.c = java.lang.Math.round(f2 * 1000.0f);
    }

    public java.lang.String toString() {
        return com.applovin.impl.xp.a("PlaybackParameters(speed=%.2f, pitch=%.2f)", java.lang.Float.valueOf(this.f1145a), java.lang.Float.valueOf(this.b));
    }

    private static java.lang.String a(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.ph a(android.os.Bundle bundle) {
        return new com.applovin.impl.ph(bundle.getFloat(a(0), 1.0f), bundle.getFloat(a(1), 1.0f));
    }

    public com.applovin.impl.ph a(float f2) {
        return new com.applovin.impl.ph(f2, this.b);
    }
}
