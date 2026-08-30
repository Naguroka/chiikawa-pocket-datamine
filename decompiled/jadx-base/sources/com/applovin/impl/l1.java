package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class l1 implements com.applovin.impl.o2 {
    public static final com.applovin.impl.l1 g = new com.applovin.impl.l1.b().a();
    public static final com.applovin.impl.o2.a h = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.l1$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.o2.a
        public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
            return com.applovin.impl.l1.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f973a;
    public final int b;
    public final int c;
    public final int d;
    private android.media.AudioAttributes f;

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f974a = 0;
        private int b = 0;
        private int c = 1;
        private int d = 1;

        public com.applovin.impl.l1.b b(int i) {
            this.f974a = i;
            return this;
        }

        public com.applovin.impl.l1.b c(int i) {
            this.b = i;
            return this;
        }

        public com.applovin.impl.l1.b d(int i) {
            this.c = i;
            return this;
        }

        public com.applovin.impl.l1.b a(int i) {
            this.d = i;
            return this;
        }

        public com.applovin.impl.l1 a() {
            return new com.applovin.impl.l1(this.f974a, this.b, this.c, this.d);
        }
    }

    private l1(int i, int i2, int i3, int i4) {
        this.f973a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public android.media.AudioAttributes a() {
        if (this.f == null) {
            android.media.AudioAttributes.Builder usage = new android.media.AudioAttributes.Builder().setContentType(this.f973a).setFlags(this.b).setUsage(this.c);
            if (com.applovin.impl.xp.f1515a >= 29) {
                usage.setAllowedCapturePolicy(this.d);
            }
            this.f = usage.build();
        }
        return this.f;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.l1.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.l1 l1Var = (com.applovin.impl.l1) obj;
        return this.f973a == l1Var.f973a && this.b == l1Var.b && this.c == l1Var.c && this.d == l1Var.d;
    }

    public int hashCode() {
        return ((((((this.f973a + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c) * 31) + this.d;
    }

    private static java.lang.String a(int i) {
        return java.lang.Integer.toString(i, 36);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.l1 a(android.os.Bundle bundle) {
        com.applovin.impl.l1.b bVar = new com.applovin.impl.l1.b();
        if (bundle.containsKey(a(0))) {
            bVar.b(bundle.getInt(a(0)));
        }
        if (bundle.containsKey(a(1))) {
            bVar.c(bundle.getInt(a(1)));
        }
        if (bundle.containsKey(a(2))) {
            bVar.d(bundle.getInt(a(2)));
        }
        if (bundle.containsKey(a(3))) {
            bVar.a(bundle.getInt(a(3)));
        }
        return bVar.a();
    }
}
