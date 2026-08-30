package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f1079a = {2002, 2000, 1920, com.json.mediationsdk.utils.IronSourceConstants.RV_OPERATIONAL_LOAD_SUCCESS, com.json.mediationsdk.utils.IronSourceConstants.RV_OPERATIONAL_LOAD_AD, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1080a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        private b(int i, int i2, int i3, int i4, int i5) {
            this.f1080a = i;
            this.c = i2;
            this.b = i3;
            this.d = i4;
            this.e = i5;
        }
    }

    public static void a(int i, com.applovin.impl.ah ahVar) {
        ahVar.d(7);
        byte[] bArrC = ahVar.c();
        bArrC[0] = -84;
        bArrC[1] = 64;
        bArrC[2] = -1;
        bArrC[3] = -1;
        bArrC[4] = (byte) ((i >> 16) & 255);
        bArrC[5] = (byte) ((i >> 8) & 255);
        bArrC[6] = (byte) (i & 255);
    }

    public static com.applovin.impl.e9 a(com.applovin.impl.ah ahVar, java.lang.String str, java.lang.String str2, com.applovin.impl.x6 x6Var) {
        ahVar.g(1);
        return new com.applovin.impl.e9.b().c(str).f(androidx.media3.common.MimeTypes.AUDIO_AC4).c(2).n(((ahVar.w() & 32) >> 5) == 1 ? androidx.media3.extractor.OpusUtil.SAMPLE_RATE : 44100).a(x6Var).e(str2).a();
    }

    public static int a(java.nio.ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return a(new com.applovin.impl.zg(bArr)).e;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0088  */
    /* JADX WARN: Code duplicated, block: B:47:0x008f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0092  */
    public static com.applovin.impl.n.b a(com.applovin.impl.zg zgVar) {
        int i;
        int i2;
        int iA = zgVar.a(16);
        int iA2 = zgVar.a(16);
        if (iA2 == 65535) {
            iA2 = zgVar.a(24);
            i = 7;
        } else {
            i = 4;
        }
        int i3 = iA2 + i;
        if (iA == 44097) {
            i3 += 2;
        }
        int i4 = i3;
        int iA3 = zgVar.a(2);
        if (iA3 == 3) {
            iA3 += a(zgVar, 2);
        }
        int i5 = iA3;
        int iA4 = zgVar.a(10);
        if (zgVar.f() && zgVar.a(3) > 0) {
            zgVar.d(2);
        }
        int i6 = zgVar.f() ? 48000 : 44100;
        int iA5 = zgVar.a(4);
        if (i6 == 44100 && iA5 == 13) {
            i2 = f1079a[iA5];
        } else if (i6 == 48000) {
            int[] iArr = f1079a;
            if (iA5 < iArr.length) {
                int i7 = iArr[iA5];
                int i8 = iA4 % 5;
                if (i8 == 1) {
                    if (iA5 != 3 || iA5 == 8) {
                        i7++;
                    }
                } else if (i8 != 2) {
                    if (i8 != 3) {
                        if (i8 == 4 && (iA5 == 3 || iA5 == 8 || iA5 == 11)) {
                            i7++;
                        }
                    } else if (iA5 != 3) {
                        i7++;
                    } else {
                        i7++;
                    }
                } else if (iA5 == 8 || iA5 == 11) {
                    i7++;
                }
                i2 = i7;
            } else {
                i2 = 0;
            }
        } else {
            i2 = 0;
        }
        return new com.applovin.impl.n.b(i5, 2, i6, i4, i2);
    }

    public static int a(byte[] bArr, int i) {
        int i2 = 7;
        if (bArr.length < 7) {
            return -1;
        }
        int i3 = ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        if (i3 == 65535) {
            i3 = ((bArr[4] & 255) << 16) | ((bArr[5] & 255) << 8) | (bArr[6] & 255);
        } else {
            i2 = 4;
        }
        if (i == 44097) {
            i2 += 2;
        }
        return i3 + i2;
    }

    private static int a(com.applovin.impl.zg zgVar, int i) {
        int i2 = 0;
        while (true) {
            int iA = i2 + zgVar.a(i);
            if (!zgVar.f()) {
                return iA;
            }
            i2 = (iA + 1) << i;
        }
    }
}
