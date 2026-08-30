package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class z4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public byte[] f1559a;
    public byte[] b;
    public int c;
    public int[] d;
    public int[] e;
    public int f;
    public int g;
    public int h;
    private final android.media.MediaCodec.CryptoInfo i;
    private final com.applovin.impl.z4.b j;

    /* JADX WARN: Multi-variable type inference failed */
    public z4() {
        android.media.MediaCodec.CryptoInfo cryptoInfo = new android.media.MediaCodec.CryptoInfo();
        this.i = cryptoInfo;
        this.j = com.applovin.impl.xp.f1515a >= 24 ? new com.applovin.impl.z4.b(cryptoInfo) : null;
    }

    public android.media.MediaCodec.CryptoInfo a() {
        return this.i;
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.media.MediaCodec.CryptoInfo f1560a;
        private final android.media.MediaCodec.CryptoInfo.Pattern b;

        private b(android.media.MediaCodec.CryptoInfo cryptoInfo) {
            this.f1560a = cryptoInfo;
            this.b = new android.media.MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(int i, int i2) {
            this.b.set(i, i2);
            this.f1560a.setPattern(this.b);
        }
    }

    public void a(int i) {
        if (i == 0) {
            return;
        }
        if (this.d == null) {
            int[] iArr = new int[1];
            this.d = iArr;
            this.i.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.d;
        iArr2[0] = iArr2[0] + i;
    }

    public void a(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.f = i;
        this.d = iArr;
        this.e = iArr2;
        this.b = bArr;
        this.f1559a = bArr2;
        this.c = i2;
        this.g = i3;
        this.h = i4;
        android.media.MediaCodec.CryptoInfo cryptoInfo = this.i;
        cryptoInfo.numSubSamples = i;
        cryptoInfo.numBytesOfClearData = iArr;
        cryptoInfo.numBytesOfEncryptedData = iArr2;
        cryptoInfo.key = bArr;
        cryptoInfo.iv = bArr2;
        cryptoInfo.mode = i2;
        if (com.applovin.impl.xp.f1515a >= 24) {
            ((com.applovin.impl.z4.b) com.applovin.impl.b1.a(this.j)).a(i3, i4);
        }
    }
}
