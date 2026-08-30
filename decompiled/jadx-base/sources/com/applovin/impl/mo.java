package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class mo {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f1075a;
    public final java.lang.String b;
    public final com.applovin.impl.qo.a c;
    public final int d;
    public final byte[] e;

    public mo(boolean z, java.lang.String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        com.applovin.impl.b1.a((bArr2 == null) ^ (i == 0));
        this.f1075a = z;
        this.b = str;
        this.d = i;
        this.e = bArr2;
        this.c = new com.applovin.impl.qo.a(a(str), bArr, i2, i3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int a(java.lang.String str) {
        if (str == null) {
            return 1;
        }
        str.hashCode();
        byte b = -1;
        switch (str.hashCode()) {
            case 3046605:
                if (str.equals(androidx.media3.common.C.CENC_TYPE_cbc1)) {
                    b = 0;
                }
                break;
            case 3046671:
                if (str.equals(androidx.media3.common.C.CENC_TYPE_cbcs)) {
                    b = 1;
                }
                break;
            case 3049879:
                if (str.equals(androidx.media3.common.C.CENC_TYPE_cenc)) {
                    b = 2;
                }
                break;
            case 3049895:
                if (str.equals(androidx.media3.common.C.CENC_TYPE_cens)) {
                    b = 3;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
                return 2;
            default:
                com.applovin.impl.oc.d("TrackEncryptionBox", "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
