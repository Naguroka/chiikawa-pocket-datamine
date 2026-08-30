package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class z7 extends com.applovin.impl.nh {
    public static final com.applovin.impl.o2.a l = new com.applovin.impl.o2.a() { // from class: com.applovin.impl.z7$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.o2.a
        public final com.applovin.impl.o2 a(android.os.Bundle bundle) {
            return com.applovin.impl.z7.$r8$lambda$y6FNmY07NYpZgEG_YmCja5Bv0g8(bundle);
        }
    };
    public final int d;
    public final java.lang.String f;
    public final int g;
    public final com.applovin.impl.e9 h;
    public final int i;
    public final com.applovin.impl.xd j;
    final boolean k;

    public static /* synthetic */ com.applovin.impl.z7 $r8$lambda$y6FNmY07NYpZgEG_YmCja5Bv0g8(android.os.Bundle bundle) {
        return new com.applovin.impl.z7(bundle);
    }

    public static com.applovin.impl.z7 a(java.lang.Throwable th, java.lang.String str, int i, com.applovin.impl.e9 e9Var, int i2, boolean z, int i3) {
        return new com.applovin.impl.z7(1, th, null, i3, str, i, e9Var, e9Var == null ? 4 : i2, z);
    }

    private z7(int i, java.lang.Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, false);
    }

    public static com.applovin.impl.z7 a(java.lang.RuntimeException runtimeException) {
        return a(runtimeException, 1000);
    }

    private z7(int i, java.lang.Throwable th, java.lang.String str, int i2, java.lang.String str2, int i3, com.applovin.impl.e9 e9Var, int i4, boolean z) {
        this(a(i, str, str2, i3, e9Var, i4), th, i2, i, str2, i3, e9Var, i4, null, android.os.SystemClock.elapsedRealtime(), z);
    }

    private z7(android.os.Bundle bundle) {
        super(bundle);
        this.d = bundle.getInt(com.applovin.impl.nh.b(1001), 2);
        this.f = bundle.getString(com.applovin.impl.nh.b(1002));
        this.g = bundle.getInt(com.applovin.impl.nh.b(1003), -1);
        this.h = (com.applovin.impl.e9) com.applovin.impl.p2.a(com.applovin.impl.e9.I, bundle.getBundle(com.applovin.impl.nh.b(1004)));
        this.i = bundle.getInt(com.applovin.impl.nh.b(1005), 4);
        this.k = bundle.getBoolean(com.applovin.impl.nh.b(1006), false);
        this.j = null;
    }

    private static java.lang.String a(int i, java.lang.String str, java.lang.String str2, int i2, com.applovin.impl.e9 e9Var, int i3) {
        java.lang.String str3;
        if (i == 0) {
            str3 = "Source error";
        } else if (i != 1) {
            str3 = i != 3 ? "Unexpected runtime error" : "Remote error";
        } else {
            str3 = str2 + " error, index=" + i2 + ", format=" + e9Var + ", format_supported=" + com.applovin.impl.t2.b(i3);
        }
        return !android.text.TextUtils.isEmpty(str) ? str3 + ": " + str : str3;
    }

    public static com.applovin.impl.z7 a(java.io.IOException iOException, int i) {
        return new com.applovin.impl.z7(0, iOException, i);
    }

    public static com.applovin.impl.z7 a(java.lang.RuntimeException runtimeException, int i) {
        return new com.applovin.impl.z7(2, runtimeException, i);
    }

    com.applovin.impl.z7 a(com.applovin.impl.xd xdVar) {
        return new com.applovin.impl.z7((java.lang.String) com.applovin.impl.xp.a((java.lang.Object) getMessage()), getCause(), this.f1097a, this.d, this.f, this.g, this.h, this.i, xdVar, this.b, this.k);
    }

    private z7(java.lang.String str, java.lang.Throwable th, int i, int i2, java.lang.String str2, int i3, com.applovin.impl.e9 e9Var, int i4, com.applovin.impl.xd xdVar, long j, boolean z) {
        super(str, th, i, j);
        com.applovin.impl.b1.a(!z || i2 == 1);
        com.applovin.impl.b1.a(th != null || i2 == 3);
        this.d = i2;
        this.f = str2;
        this.g = i3;
        this.h = e9Var;
        this.i = i4;
        this.j = xdVar;
        this.k = z;
    }
}
