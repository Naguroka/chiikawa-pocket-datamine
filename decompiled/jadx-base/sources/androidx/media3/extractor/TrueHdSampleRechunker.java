package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class TrueHdSampleRechunker {
    private int chunkFlags;
    private int chunkOffset;
    private int chunkSampleCount;
    private int chunkSize;
    private long chunkTimeUs;
    private boolean foundSyncframe;
    private final byte[] syncframePrefix = new byte[10];

    public void reset() {
        this.foundSyncframe = false;
        this.chunkSampleCount = 0;
    }

    public void startSample(androidx.media3.extractor.ExtractorInput extractorInput) throws java.io.IOException {
        if (this.foundSyncframe) {
            return;
        }
        extractorInput.peekFully(this.syncframePrefix, 0, 10);
        extractorInput.resetPeekPosition();
        if (androidx.media3.extractor.Ac3Util.parseTrueHdSyncframeAudioSampleCount(this.syncframePrefix) == 0) {
            return;
        }
        this.foundSyncframe = true;
    }

    public void sampleMetadata(androidx.media3.extractor.TrackOutput trackOutput, long j, int i, int i2, int i3, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
        androidx.media3.common.util.Assertions.checkState(this.chunkOffset <= i2 + i3, "TrueHD chunk samples must be contiguous in the sample queue.");
        if (this.foundSyncframe) {
            int i4 = this.chunkSampleCount;
            int i5 = i4 + 1;
            this.chunkSampleCount = i5;
            if (i4 == 0) {
                this.chunkTimeUs = j;
                this.chunkFlags = i;
                this.chunkSize = 0;
            }
            this.chunkSize += i2;
            this.chunkOffset = i3;
            if (i5 >= 16) {
                outputPendingSampleMetadata(trackOutput, cryptoData);
            }
        }
    }

    public void outputPendingSampleMetadata(androidx.media3.extractor.TrackOutput trackOutput, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
        if (this.chunkSampleCount > 0) {
            trackOutput.sampleMetadata(this.chunkTimeUs, this.chunkFlags, this.chunkSize, this.chunkOffset, cryptoData);
            this.chunkSampleCount = 0;
        }
    }
}
