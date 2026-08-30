package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class c1 extends com.applovin.impl.a2 {
    private final android.content.res.AssetManager e;
    private android.net.Uri f;
    private java.io.InputStream g;
    private long h;
    private boolean i;

    public static final class a extends com.applovin.impl.i5 {
        public a(java.lang.Throwable th, int i) {
            super(th, i);
        }
    }

    public c1(android.content.Context context) {
        super(false);
        this.e = context.getAssets();
    }

    @Override // com.applovin.impl.h5
    public long a(com.applovin.impl.k5 k5Var) throws com.applovin.impl.c1.a {
        try {
            android.net.Uri uri = k5Var.f947a;
            this.f = uri;
            java.lang.String strSubstring = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) uri.getPath());
            if (strSubstring.startsWith("/android_asset/")) {
                strSubstring = strSubstring.substring(15);
            } else if (strSubstring.startsWith("/")) {
                strSubstring = strSubstring.substring(1);
            }
            b(k5Var);
            java.io.InputStream inputStreamOpen = this.e.open(strSubstring, 1);
            this.g = inputStreamOpen;
            if (inputStreamOpen.skip(k5Var.g) >= k5Var.g) {
                long j = k5Var.h;
                if (j != -1) {
                    this.h = j;
                } else {
                    long jAvailable = this.g.available();
                    this.h = jAvailable;
                    if (jAvailable == 2147483647L) {
                        this.h = -1L;
                    }
                }
                this.i = true;
                c(k5Var);
                return this.h;
            }
            throw new com.applovin.impl.c1.a(null, 2008);
        } catch (com.applovin.impl.c1.a e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new com.applovin.impl.c1.a(e2, e2 instanceof java.io.FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.applovin.impl.h5
    public android.net.Uri c() {
        return this.f;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0017 */
    @Override // com.applovin.impl.h5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() {
        this.f = null;
        try {
            java.io.InputStream inputStream = this.g;
            if (inputStream != null) {
                inputStream.close();
            }
            this.g = null;
            if (this.i) {
                this.i = false;
                g();
            }
        } catch (java.io.IOException e) {
            throw new com.applovin.impl.c1.a(e, 2000);
        }
    }

    @Override // com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) throws com.applovin.impl.c1.a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.h;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) java.lang.Math.min(j, i2);
            } catch (java.io.IOException e) {
                throw new com.applovin.impl.c1.a(e, 2000);
            }
        }
        int i3 = ((java.io.InputStream) com.applovin.impl.xp.a((java.lang.Object) this.g)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.h;
        if (j2 != -1) {
            this.h = j2 - ((long) i3);
        }
        d(i3);
        return i3;
    }
}
