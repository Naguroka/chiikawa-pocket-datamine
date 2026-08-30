package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public final class DummyTrackOutput implements androidx.media3.extractor.TrackOutput {
    private final androidx.media3.extractor.DiscardingTrackOutput discardingTrackOutput = new androidx.media3.extractor.DiscardingTrackOutput();

    @Override // androidx.media3.extractor.TrackOutput
    public void format(androidx.media3.common.Format format) {
        this.discardingTrackOutput.format(format);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(androidx.media3.common.DataReader dataReader, int i, boolean z) throws java.io.IOException {
        return this.discardingTrackOutput.sampleData(dataReader, i, z);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i) {
        this.discardingTrackOutput.sampleData(parsableByteArray, i);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public int sampleData(androidx.media3.common.DataReader dataReader, int i, boolean z, int i2) throws java.io.IOException {
        return this.discardingTrackOutput.sampleData(dataReader, i, z, i2);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleData(androidx.media3.common.util.ParsableByteArray parsableByteArray, int i, int i2) {
        this.discardingTrackOutput.sampleData(parsableByteArray, i, i2);
    }

    @Override // androidx.media3.extractor.TrackOutput
    public void sampleMetadata(long j, int i, int i2, int i3, androidx.media3.extractor.TrackOutput.CryptoData cryptoData) {
        this.discardingTrackOutput.sampleMetadata(j, i, i2, i3, cryptoData);
    }
}
