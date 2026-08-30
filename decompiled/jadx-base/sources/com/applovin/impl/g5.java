package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class g5 extends com.applovin.impl.a2 {
    private com.applovin.impl.k5 e;
    private byte[] f;
    private int g;
    private int h;

    public g5() {
        super(false);
    }

    @Override // com.applovin.impl.h5
    public long a(com.applovin.impl.k5 k5Var) throws com.applovin.impl.i5, com.applovin.impl.ch {
        b(k5Var);
        this.e = k5Var;
        android.net.Uri uri = k5Var.f947a;
        java.lang.String scheme = uri.getScheme();
        com.applovin.impl.b1.a("data".equals(scheme), "Unsupported scheme: " + scheme);
        java.lang.String[] strArrA = com.applovin.impl.xp.a(uri.getSchemeSpecificPart(), ",");
        if (strArrA.length == 2) {
            java.lang.String str = strArrA[1];
            if (strArrA[0].contains(";base64")) {
                try {
                    this.f = android.util.Base64.decode(str, 0);
                } catch (java.lang.IllegalArgumentException e) {
                    throw com.applovin.impl.ch.b("Error while parsing Base64 encoded string: " + str, e);
                }
            } else {
                this.f = com.applovin.impl.xp.c(java.net.URLDecoder.decode(str, com.applovin.exoplayer2.common.base.Charsets.US_ASCII.name()));
            }
            long j = k5Var.g;
            byte[] bArr = this.f;
            if (j <= bArr.length) {
                int i = (int) j;
                this.g = i;
                int length = bArr.length - i;
                this.h = length;
                long j2 = k5Var.h;
                if (j2 != -1) {
                    this.h = (int) java.lang.Math.min(length, j2);
                }
                c(k5Var);
                long j3 = k5Var.h;
                return j3 != -1 ? j3 : this.h;
            }
            this.f = null;
            throw new com.applovin.impl.i5(2008);
        }
        throw com.applovin.impl.ch.b("Unexpected URI format: " + uri, null);
    }

    @Override // com.applovin.impl.h5
    public android.net.Uri c() {
        com.applovin.impl.k5 k5Var = this.e;
        if (k5Var != null) {
            return k5Var.f947a;
        }
        return null;
    }

    @Override // com.applovin.impl.h5
    public void close() {
        if (this.f != null) {
            this.f = null;
            g();
        }
        this.e = null;
    }

    @Override // com.applovin.impl.f5
    public int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        int i3 = this.h;
        if (i3 == 0) {
            return -1;
        }
        int iMin = java.lang.Math.min(i2, i3);
        java.lang.System.arraycopy(com.applovin.impl.xp.a((java.lang.Object) this.f), this.g, bArr, i, iMin);
        this.g += iMin;
        this.h -= iMin;
        d(iMin);
        return iMin;
    }
}
