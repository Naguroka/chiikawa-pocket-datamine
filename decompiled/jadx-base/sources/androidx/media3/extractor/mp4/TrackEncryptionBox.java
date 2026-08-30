package androidx.media3.extractor.mp4;

/* JADX INFO: loaded from: classes.dex */
public final class TrackEncryptionBox {
    private static final java.lang.String TAG = "TrackEncryptionBox";
    public final androidx.media3.extractor.TrackOutput.CryptoData cryptoData;
    public final byte[] defaultInitializationVector;
    public final boolean isEncrypted;
    public final int perSampleIvSize;
    public final java.lang.String schemeType;

    public TrackEncryptionBox(boolean z, java.lang.String str, int i, byte[] bArr, int i2, int i3, byte[] bArr2) {
        androidx.media3.common.util.Assertions.checkArgument((bArr2 == null) ^ (i == 0));
        this.isEncrypted = z;
        this.schemeType = str;
        this.perSampleIvSize = i;
        this.defaultInitializationVector = bArr2;
        this.cryptoData = new androidx.media3.extractor.TrackOutput.CryptoData(schemeToCryptoMode(str), bArr, i2, i3);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private static int schemeToCryptoMode(java.lang.String str) {
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
                androidx.media3.common.util.Log.w(TAG, "Unsupported protection scheme type '" + str + "'. Assuming AES-CTR crypto mode.");
            case 2:
            case 3:
                return 1;
        }
    }
}
