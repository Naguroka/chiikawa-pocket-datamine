package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class r4 extends com.applovin.impl.a2 {
    private final android.content.ContentResolver e;
    private android.net.Uri f;
    private android.content.res.AssetFileDescriptor g;
    private java.io.FileInputStream h;
    private long i;
    private boolean j;

    public static class b extends com.applovin.impl.i5 {
        public b(java.io.IOException iOException, int i) {
            super(iOException, i);
        }
    }

    public r4(android.content.Context context) {
        super(false);
        this.e = context.getContentResolver();
    }

    @Override // com.applovin.impl.h5
    public long a(com.applovin.impl.k5 k5Var) throws com.applovin.impl.r4.b {
        android.content.res.AssetFileDescriptor assetFileDescriptorOpenAssetFileDescriptor;
        try {
            android.net.Uri uri = k5Var.f947a;
            this.f = uri;
            b(k5Var);
            if ("content".equals(k5Var.f947a.getScheme())) {
                android.os.Bundle bundle = new android.os.Bundle();
                if (com.applovin.impl.xp.f1515a >= 31) {
                    com.applovin.impl.r4.a.a(bundle);
                }
                assetFileDescriptorOpenAssetFileDescriptor = this.e.openTypedAssetFileDescriptor(uri, "*/*", bundle);
            } else {
                assetFileDescriptorOpenAssetFileDescriptor = this.e.openAssetFileDescriptor(uri, com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ);
            }
            this.g = assetFileDescriptorOpenAssetFileDescriptor;
            if (assetFileDescriptorOpenAssetFileDescriptor != null) {
                long length = assetFileDescriptorOpenAssetFileDescriptor.getLength();
                java.io.FileInputStream fileInputStream = new java.io.FileInputStream(assetFileDescriptorOpenAssetFileDescriptor.getFileDescriptor());
                this.h = fileInputStream;
                if (length != -1 && k5Var.g > length) {
                    throw new com.applovin.impl.r4.b(null, 2008);
                }
                long startOffset = assetFileDescriptorOpenAssetFileDescriptor.getStartOffset();
                long jSkip = fileInputStream.skip(k5Var.g + startOffset) - startOffset;
                if (jSkip == k5Var.g) {
                    if (length == -1) {
                        java.nio.channels.FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.i = -1L;
                        } else {
                            long jPosition = size - channel.position();
                            this.i = jPosition;
                            if (jPosition < 0) {
                                throw new com.applovin.impl.r4.b(null, 2008);
                            }
                        }
                    } else {
                        long j = length - jSkip;
                        this.i = j;
                        if (j < 0) {
                            throw new com.applovin.impl.r4.b(null, 2008);
                        }
                    }
                    long jMin = k5Var.h;
                    if (jMin != -1) {
                        long j2 = this.i;
                        if (j2 != -1) {
                            jMin = java.lang.Math.min(j2, jMin);
                        }
                        this.i = jMin;
                    }
                    this.j = true;
                    c(k5Var);
                    long j3 = k5Var.h;
                    return j3 != -1 ? j3 : this.i;
                }
                throw new com.applovin.impl.r4.b(null, 2008);
            }
            throw new com.applovin.impl.r4.b(new java.io.IOException("Could not open file descriptor for: " + uri), 2000);
        } catch (com.applovin.impl.r4.b e) {
            throw e;
        } catch (java.io.IOException e2) {
            throw new com.applovin.impl.r4.b(e2, e2 instanceof java.io.FileNotFoundException ? 2005 : 2000);
        }
    }

    @Override // com.applovin.impl.h5
    public android.net.Uri c() {
        return this.f;
    }

    /* JADX WARN: Bottom block not found for handler: all -> 0x0037 */
    /* JADX WARN: Bottom block not found for handler: all -> 0x0055 */
    @Override // com.applovin.impl.h5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void close() {
        this.f = null;
        try {
            java.io.FileInputStream fileInputStream = this.h;
            if (fileInputStream != null) {
                fileInputStream.close();
            }
            this.h = null;
            try {
                try {
                    android.content.res.AssetFileDescriptor assetFileDescriptor = this.g;
                    if (assetFileDescriptor != null) {
                        assetFileDescriptor.close();
                    }
                    this.g = null;
                    if (this.j) {
                        this.j = false;
                        g();
                    }
                } catch (java.io.IOException e) {
                    throw new com.applovin.impl.r4.b(e, 2000);
                }
            } catch (java.lang.Throwable th) {
                this.g = null;
                if (this.j) {
                    this.j = false;
                    g();
                }
                throw th;
            }
        } catch (java.io.IOException e2) {
            throw new com.applovin.impl.r4.b(e2, 2000);
        }
    }

    private static final class a {
        public static void a(android.os.Bundle bundle) {
            bundle.putParcelable("android.provider.extra.MEDIA_CAPABILITIES", new android.media.ApplicationMediaCapabilities.Builder().addSupportedVideoMimeType("video/hevc").addSupportedHdrType("android.media.feature.hdr.dolby_vision").addSupportedHdrType("android.media.feature.hdr.hdr10").addSupportedHdrType("android.media.feature.hdr.hdr10_plus").addSupportedHdrType("android.media.feature.hdr.hlg").build());
        }
    }

    @Override // com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) throws com.applovin.impl.r4.b {
        if (i2 == 0) {
            return 0;
        }
        long j = this.i;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) java.lang.Math.min(j, i2);
            } catch (java.io.IOException e) {
                throw new com.applovin.impl.r4.b(e, 2000);
            }
        }
        int i3 = ((java.io.FileInputStream) com.applovin.impl.xp.a((java.lang.Object) this.h)).read(bArr, i, i2);
        if (i3 == -1) {
            return -1;
        }
        long j2 = this.i;
        if (j2 != -1) {
            this.i = j2 - ((long) i3);
        }
        d(i3);
        return i3;
    }
}
