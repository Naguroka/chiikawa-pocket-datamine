package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class r3 implements com.applovin.impl.o2 {
    public static final com.applovin.impl.o2.a g = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.r3$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.o2.a
        public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
            return com.applovin.impl.r3.a(bundle);
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1211a;
    public final int b;
    public final int c;
    public final byte[] d;
    private int f;

    public static int a(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int b(int i) {
        if (i == 1) {
            return 3;
        }
        if (i == 16) {
            return 6;
        }
        if (i != 18) {
            return (i == 6 || i == 7) ? 3 : -1;
        }
        return 7;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.r3 a(android.os.Bundle bundle) {
        return new com.applovin.impl.r3(bundle.getInt(c(0), -1), bundle.getInt(c(1), -1), bundle.getInt(c(2), -1), bundle.getByteArray(c(3)));
    }

    public r3(int i, int i2, int i3, byte[] bArr) {
        this.f1211a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || com.applovin.impl.r3.class != obj.getClass()) {
            return false;
        }
        com.applovin.impl.r3 r3Var = (com.applovin.impl.r3) obj;
        return this.f1211a == r3Var.f1211a && this.b == r3Var.b && this.c == r3Var.c && java.util.Arrays.equals(this.d, r3Var.d);
    }

    public java.lang.String toString() {
        return "ColorInfo(" + this.f1211a + ", " + this.b + ", " + this.c + ", " + (this.d != null) + ")";
    }

    public int hashCode() {
        if (this.f == 0) {
            this.f = ((((((this.f1211a + com.json.mediationsdk.logger.IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.b) * 31) + this.c) * 31) + java.util.Arrays.hashCode(this.d);
        }
        return this.f;
    }

    private static java.lang.String c(int i) {
        return java.lang.Integer.toString(i, 36);
    }
}
