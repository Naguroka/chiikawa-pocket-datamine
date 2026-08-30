package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public interface pa extends com.applovin.impl.h5 {

    public interface b extends com.applovin.impl.h5.a {
        @Override // com.applovin.impl.h5.a
        com.applovin.impl.pa a();
    }

    public static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.Map f1142a = new java.util.HashMap();
        private java.util.Map b;

        public synchronized java.util.Map a() {
            if (this.b == null) {
                this.b = java.util.Collections.unmodifiableMap(new java.util.HashMap(this.f1142a));
            }
            return this.b;
        }
    }

    public static class c extends com.applovin.impl.i5 {
        public final com.applovin.impl.k5 b;
        public final int c;

        private static int a(int i, int i2) {
            if (i == 2000 && i2 == 1) {
                return 2001;
            }
            return i;
        }

        public static com.applovin.impl.pa.c a(java.io.IOException iOException, com.applovin.impl.k5 k5Var, int i) {
            int i2;
            java.lang.String message = iOException.getMessage();
            if (iOException instanceof java.net.SocketTimeoutException) {
                i2 = 2002;
            } else if (iOException instanceof java.io.InterruptedIOException) {
                i2 = 1004;
            } else {
                i2 = (message == null || !com.applovin.exoplayer2.common.base.Ascii.toLowerCase(message).matches("cleartext.*not permitted.*")) ? 2001 : 2007;
            }
            if (i2 == 2007) {
                return new com.applovin.impl.pa.a(iOException, k5Var);
            }
            return new com.applovin.impl.pa.c(iOException, k5Var, i2, i);
        }

        public c(com.applovin.impl.k5 k5Var, int i, int i2) {
            super(a(i, i2));
            this.b = k5Var;
            this.c = i2;
        }

        public c(java.io.IOException iOException, com.applovin.impl.k5 k5Var, int i, int i2) {
            super(iOException, a(i, i2));
            this.b = k5Var;
            this.c = i2;
        }

        public c(java.lang.String str, com.applovin.impl.k5 k5Var, int i, int i2) {
            super(str, a(i, i2));
            this.b = k5Var;
            this.c = i2;
        }

        public c(java.lang.String str, java.io.IOException iOException, com.applovin.impl.k5 k5Var, int i, int i2) {
            super(str, iOException, a(i, i2));
            this.b = k5Var;
            this.c = i2;
        }
    }

    public static final class a extends com.applovin.impl.pa.c {
        public a(java.io.IOException iOException, com.applovin.impl.k5 k5Var) {
            super("Cleartext HTTP traffic not permitted. See https://exoplayer.dev/issues/cleartext-not-permitted", iOException, k5Var, 2007, 1);
        }
    }

    public static final class d extends com.applovin.impl.pa.c {
        public final java.lang.String d;

        public d(java.lang.String str, com.applovin.impl.k5 k5Var) {
            super("Invalid content type: " + str, k5Var, 2003, 1);
            this.d = str;
        }
    }

    public static final class e extends com.applovin.impl.pa.c {
        public final int d;
        public final java.lang.String f;
        public final java.util.Map g;
        public final byte[] h;

        public e(int i, java.lang.String str, java.io.IOException iOException, java.util.Map map, com.applovin.impl.k5 k5Var, byte[] bArr) {
            super("Response code: " + i, iOException, k5Var, 2004, 1);
            this.d = i;
            this.f = str;
            this.g = map;
            this.h = bArr;
        }
    }
}
