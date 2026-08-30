package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class co extends com.applovin.impl.ki {
    public static final com.applovin.impl.o2.a d = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.co$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.o2.a
        public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
            return com.applovin.impl.co.b(bundle);
        }
    };
    private final boolean b;
    private final boolean c;

    public co() {
        this.b = false;
        this.c = false;
    }

    public int hashCode() {
        return com.applovin.exoplayer2.common.base.Objects.hashCode(java.lang.Boolean.valueOf(this.b), java.lang.Boolean.valueOf(this.c));
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof com.applovin.impl.co)) {
            return false;
        }
        com.applovin.impl.co coVar = (com.applovin.impl.co) obj;
        return this.c == coVar.c && this.b == coVar.b;
    }

    public co(boolean z) {
        this.b = true;
        this.c = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.applovin.impl.co b(android.os.Bundle bundle) {
        com.applovin.impl.b1.a(bundle.getInt(a(0), -1) == 3);
        if (bundle.getBoolean(a(1), false)) {
            return new com.applovin.impl.co(bundle.getBoolean(a(2), false));
        }
        return new com.applovin.impl.co();
    }

    private static java.lang.String a(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
