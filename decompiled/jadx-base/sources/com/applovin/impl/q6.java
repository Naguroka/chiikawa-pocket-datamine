package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class q6 implements com.applovin.impl.o2 {
    public static final com.applovin.impl.q6 d = new com.applovin.impl.q6(0, 0, 0);
    public static final com.applovin.impl.o2.a f = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.q6$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.o2.a
        public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
            return com.applovin.impl.q6.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1173a;
    public final int b;
    public final int c;

    public q6(int i, int i2, int i3) {
        this.f1173a = i;
        this.b = i2;
        this.c = i3;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.applovin.impl.q6)) {
            return false;
        }
        com.applovin.impl.q6 q6Var = (com.applovin.impl.q6) obj;
        return this.f1173a == q6Var.f1173a && this.b == q6Var.b && this.c == q6Var.c;
    }

    public int hashCode() {
        return ((((this.f1173a + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c;
    }

    private static java.lang.String a(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.q6 a(android.os.Bundle bundle) {
        return new com.applovin.impl.q6(bundle.getInt(a(0), 0), bundle.getInt(a(1), 0), bundle.getInt(a(2), 0));
    }
}
