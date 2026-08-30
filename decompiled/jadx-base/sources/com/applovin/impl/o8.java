package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class o8 extends com.applovin.impl.a2 {
    private java.io.RandomAccessFile e;
    private android.net.Uri f;
    private long g;
    private boolean h;

    public static class b extends com.applovin.impl.i5 {
        public b(java.lang.String str, java.lang.Throwable th, int i) {
            super(str, th, i);
        }

        public b(java.lang.Throwable th, int i) {
            super(th, i);
        }
    }

    public o8() {
        super(false);
    }

    @Override // com.applovin.impl.h5
    public long a(com.applovin.impl.k5 k5Var) throws com.applovin.impl.o8.b {
        android.net.Uri uri = k5Var.f947a;
        this.f = uri;
        b(k5Var);
        java.io.RandomAccessFile randomAccessFileA = a(uri);
        this.e = randomAccessFileA;
        try {
            randomAccessFileA.seek(k5Var.g);
            long length = k5Var.h;
            if (length == -1) {
                length = this.e.length() - k5Var.g;
            }
            this.g = length;
            if (length >= 0) {
                this.h = true;
                c(k5Var);
                return this.g;
            }
            throw new com.applovin.impl.o8.b(null, null, 2008);
        } catch (java.io.IOException e) {
            throw new com.applovin.impl.o8.b(e, 2000);
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
            java.io.RandomAccessFile randomAccessFile = this.e;
            if (randomAccessFile != null) {
                randomAccessFile.close();
            }
            this.e = null;
            if (this.h) {
                this.h = false;
                g();
            }
        } catch (java.io.IOException e) {
            throw new com.applovin.impl.o8.b(e, 2000);
        }
    }

    private static final class a {
        /* JADX INFO: Access modifiers changed from: private */
        public static boolean b(java.lang.Throwable th) {
            return (th instanceof android.system.ErrnoException) && ((android.system.ErrnoException) th).errno == android.system.OsConstants.EACCES;
        }
    }

    @Override // com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) throws com.applovin.impl.o8.b {
        if (i2 == 0) {
            return 0;
        }
        if (this.g == 0) {
            return -1;
        }
        try {
            int i3 = ((java.io.RandomAccessFile) com.applovin.impl.xp.a((java.lang.Object) this.e)).read(bArr, i, (int) java.lang.Math.min(this.g, i2));
            if (i3 > 0) {
                this.g -= (long) i3;
                d(i3);
            }
            return i3;
        } catch (java.io.IOException e) {
            throw new com.applovin.impl.o8.b(e, 2000);
        }
    }

    private static java.io.RandomAccessFile a(android.net.Uri uri) throws com.applovin.impl.o8.b {
        try {
            return new java.io.RandomAccessFile((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) uri.getPath()), com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
        } catch (java.io.FileNotFoundException e) {
            if (android.text.TextUtils.isEmpty(uri.getQuery()) && android.text.TextUtils.isEmpty(uri.getFragment())) {
                throw new com.applovin.impl.o8.b(e, (com.applovin.impl.xp.f1515a < 21 || !com.applovin.impl.o8.a.b(e.getCause())) ? 2005 : 2006);
            }
            throw new com.applovin.impl.o8.b(java.lang.String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e, 1004);
        } catch (java.lang.SecurityException e2) {
            throw new com.applovin.impl.o8.b(e2, 2006);
        } catch (java.lang.RuntimeException e3) {
            throw new com.applovin.impl.o8.b(e3, 2000);
        }
    }
}
