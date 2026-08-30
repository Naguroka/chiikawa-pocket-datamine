package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class li extends com.applovin.impl.a2 {
    private final android.content.res.Resources e;
    private final java.lang.String f;
    private android.net.Uri g;
    private android.content.res.AssetFileDescriptor h;
    private java.io.InputStream i;
    private long j;
    private boolean k;

    public static class a extends com.applovin.impl.i5 {
        public a(java.lang.String str, java.lang.Throwable th, int i) {
            super(str, th, i);
        }
    }

    public li(android.content.Context context) {
        super(false);
        this.e = context.getResources();
        this.f = context.getPackageName();
    }

    @Override // com.applovin.impl.h5
    public long a(com.applovin.impl.k5 k5Var) throws com.applovin.impl.li.a {
        int identifier;
        android.net.Uri uri = k5Var.f947a;
        this.g = uri;
        if (!android.text.TextUtils.equals(androidx.media3.datasource.RawResourceDataSource.RAW_RESOURCE_SCHEME, uri.getScheme()) && (!android.text.TextUtils.equals("android.resource", uri.getScheme()) || uri.getPathSegments().size() != 1 || !((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) uri.getLastPathSegment())).matches("\\d+"))) {
            if (android.text.TextUtils.equals("android.resource", uri.getScheme())) {
                java.lang.String strSubstring = (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) uri.getPath());
                if (strSubstring.startsWith("/")) {
                    strSubstring = strSubstring.substring(1);
                }
                java.lang.String host = uri.getHost();
                identifier = this.e.getIdentifier((android.text.TextUtils.isEmpty(host) ? "" : host + ":") + strSubstring, "raw", this.f);
                if (identifier == 0) {
                    throw new com.applovin.impl.li.a("Resource not found.", null, 2005);
                }
            } else {
                throw new com.applovin.impl.li.a("URI must either use scheme rawresource or android.resource", null, 1004);
            }
        } else {
            try {
                identifier = java.lang.Integer.parseInt((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) uri.getLastPathSegment()));
            } catch (java.lang.NumberFormatException unused) {
                throw new com.applovin.impl.li.a("Resource identifier must be an integer.", null, 1004);
            }
        }
        b(k5Var);
        try {
            android.content.res.AssetFileDescriptor assetFileDescriptorOpenRawResourceFd = this.e.openRawResourceFd(identifier);
            this.h = assetFileDescriptorOpenRawResourceFd;
            if (assetFileDescriptorOpenRawResourceFd != null) {
                long length = assetFileDescriptorOpenRawResourceFd.getLength();
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(assetFileDescriptorOpenRawResourceFd.getFileDescriptor());
                this.i = fileInputStream;
                if (length != -1) {
                    try {
                        if (k5Var.g > length) {
                            throw new com.applovin.impl.li.a(null, null, 2008);
                        }
                    } catch (com.applovin.impl.li.a e) {
                        throw e;
                    } catch (java.io.IOException e2) {
                        throw new com.applovin.impl.li.a(null, e2, 2000);
                    }
                }
                long startOffset = assetFileDescriptorOpenRawResourceFd.getStartOffset();
                long jSkip = fileInputStream.skip(k5Var.g + startOffset) - startOffset;
                if (jSkip == k5Var.g) {
                    if (length == -1) {
                        java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                        if (channel.size() == 0) {
                            this.j = -1L;
                        } else {
                            long size = channel.size() - channel.position();
                            this.j = size;
                            if (size < 0) {
                                throw new com.applovin.impl.li.a(null, null, 2008);
                            }
                        }
                    } else {
                        long j = length - jSkip;
                        this.j = j;
                        if (j < 0) {
                            throw new com.applovin.impl.i5(2008);
                        }
                    }
                    long jMin = k5Var.h;
                    if (jMin != -1) {
                        long j2 = this.j;
                        if (j2 != -1) {
                            jMin = java.lang.Math.min(j2, jMin);
                        }
                        this.j = jMin;
                    }
                    this.k = true;
                    c(k5Var);
                    long j3 = k5Var.h;
                    return j3 != -1 ? j3 : this.j;
                }
                throw new com.applovin.impl.li.a(null, null, 2008);
            }
            throw new com.applovin.impl.li.a("Resource is compressed: " + uri, null, 2000);
        } catch (android.content.res.Resources.NotFoundException e3) {
            throw new com.applovin.impl.li.a(null, e3, 2005);
        }
    }

    @Override // com.applovin.impl.h5
    public android.net.Uri c() {
        return this.g;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // com.applovin.impl.h5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() {
        this.g = null;
        try {
            java.io.InputStream inputStream = this.i;
            if (inputStream != null) {
                inputStream.close();
            }
            this.i = null;
            try {
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptor = this.h;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.h = null;
                    if (this.k) {
                        this.k = false;
                        g();
                    }
                } catch (java.io.IOException e) {
                    throw new com.applovin.impl.li.a(null, e, 2000);
                }
            } catch (java.lang.Throwable th) {
                this.h = null;
                if (this.k) {
                    this.k = false;
                    g();
                }
                throw th;
            }
        } catch (java.io.IOException e2) {
            throw new com.applovin.impl.li.a(null, e2, 2000);
        }
    }

    @Override // com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) throws com.applovin.impl.li.a {
        if (i2 == 0) {
            return 0;
        }
        long j = this.j;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) java.lang.Math.min(j, i2);
            } catch (java.io.IOException e) {
                throw new com.applovin.impl.li.a(null, e, 2000);
            }
        }
        int i3 = ((java.io.InputStream) com.applovin.impl.xp.a((java.lang.Object) this.i)).read(bArr, i, i2);
        if (i3 == -1) {
            if (this.j == -1) {
                return -1;
            }
            throw new com.applovin.impl.li.a("End of stream reached having not read sufficient data.", new java.io.EOFException(), 2000);
        }
        long j2 = this.j;
        if (j2 != -1) {
            this.j = j2 - ((long) i3);
        }
        d(i3);
        return i3;
    }
}
