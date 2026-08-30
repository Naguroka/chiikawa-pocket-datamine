package androidx.media3.decoder;

/* JADX INFO: loaded from: classes.dex */
public final class CryptoInfo {
    public int clearBlocks;
    public int encryptedBlocks;
    private final android.media.MediaCodec.CryptoInfo frameworkCryptoInfo;
    public byte[] iv;
    public byte[] key;
    public int mode;
    public int[] numBytesOfClearData;
    public int[] numBytesOfEncryptedData;
    public int numSubSamples;
    private final androidx.media3.decoder.CryptoInfo.PatternHolderV24 patternHolder;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoInfo() {
        android.media.MediaCodec.CryptoInfo cryptoInfo = new android.media.MediaCodec.CryptoInfo();
        this.frameworkCryptoInfo = cryptoInfo;
        this.patternHolder = androidx.media3.common.util.Util.SDK_INT >= 24 ? new androidx.media3.decoder.CryptoInfo.PatternHolderV24(cryptoInfo) : null;
    }

    public void set(int i, int[] iArr, int[] iArr2, byte[] bArr, byte[] bArr2, int i2, int i3, int i4) {
        this.numSubSamples = i;
        this.numBytesOfClearData = iArr;
        this.numBytesOfEncryptedData = iArr2;
        this.key = bArr;
        this.iv = bArr2;
        this.mode = i2;
        this.encryptedBlocks = i3;
        this.clearBlocks = i4;
        this.frameworkCryptoInfo.numSubSamples = i;
        this.frameworkCryptoInfo.numBytesOfClearData = iArr;
        this.frameworkCryptoInfo.numBytesOfEncryptedData = iArr2;
        this.frameworkCryptoInfo.key = bArr;
        this.frameworkCryptoInfo.iv = bArr2;
        this.frameworkCryptoInfo.mode = i2;
        if (androidx.media3.common.util.Util.SDK_INT >= 24) {
            ((androidx.media3.decoder.CryptoInfo.PatternHolderV24) androidx.media3.common.util.Assertions.checkNotNull(this.patternHolder)).set(i3, i4);
        }
    }

    public android.media.MediaCodec.CryptoInfo getFrameworkCryptoInfo() {
        return this.frameworkCryptoInfo;
    }

    public void increaseClearDataFirstSubSampleBy(int i) {
        if (i == 0) {
            return;
        }
        if (this.numBytesOfClearData == null) {
            int[] iArr = new int[1];
            this.numBytesOfClearData = iArr;
            this.frameworkCryptoInfo.numBytesOfClearData = iArr;
        }
        int[] iArr2 = this.numBytesOfClearData;
        iArr2[0] = iArr2[0] + i;
    }

    private static final class PatternHolderV24 {
        private final android.media.MediaCodec.CryptoInfo frameworkCryptoInfo;
        private final android.media.MediaCodec.CryptoInfo.Pattern pattern;

        private PatternHolderV24(android.media.MediaCodec.CryptoInfo cryptoInfo) {
            this.frameworkCryptoInfo = cryptoInfo;
            this.pattern = new android.media.MediaCodec.CryptoInfo.Pattern(0, 0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void set(int i, int i2) {
            this.pattern.set(i, i2);
            this.frameworkCryptoInfo.setPattern(this.pattern);
        }
    }
}
