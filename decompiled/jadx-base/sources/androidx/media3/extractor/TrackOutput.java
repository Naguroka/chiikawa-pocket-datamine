package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public interface TrackOutput {
    public static final int SAMPLE_DATA_PART_ENCRYPTION = 1;
    public static final int SAMPLE_DATA_PART_MAIN = 0;
    public static final int SAMPLE_DATA_PART_SUPPLEMENTAL = 2;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface SampleDataPart {
    }

    void format(androidx.media3.common.Format format);

    int sampleData(androidx.media3.common.DataReader dataReader, int i, boolean z, int i2) throws java.io.IOException;

    void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, int i2);

    void sampleMetadata(long j, int i, int i2, int i3, androidx.media3.extractor.TrackOutput.CryptoData cryptoData);

    public static final class CryptoData {
        public final int clearBlocks;
        public final int cryptoMode;
        public final int encryptedBlocks;
        public final byte[] encryptionKey;

        public CryptoData(int i, byte[] bArr, int i2, int i3) {
            this.cryptoMode = i;
            this.encryptionKey = bArr;
            this.encryptedBlocks = i2;
            this.clearBlocks = i3;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            androidx.media3.extractor.TrackOutput.CryptoData cryptoData = (androidx.media3.extractor.TrackOutput.CryptoData) obj;
            return this.cryptoMode == cryptoData.cryptoMode && this.encryptedBlocks == cryptoData.encryptedBlocks && this.clearBlocks == cryptoData.clearBlocks && java.util.Arrays.equals(this.encryptionKey, cryptoData.encryptionKey);
        }

        public int hashCode() {
            return (((((this.cryptoMode * 31) + java.util.Arrays.hashCode(this.encryptionKey)) * 31) + this.encryptedBlocks) * 31) + this.clearBlocks;
        }
    }

    default int sampleData(androidx.media3.common.DataReader dataReader, int i, boolean z) throws java.io.IOException {
        return sampleData(dataReader, i, z, 0);
    }

    default void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        sampleData(parsableByteArray, i, 0);
    }
}
