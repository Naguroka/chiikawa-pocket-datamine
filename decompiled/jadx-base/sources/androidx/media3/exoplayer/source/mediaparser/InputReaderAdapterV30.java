package androidx.media3.exoplayer.source.mediaparser;

/* JADX INFO: loaded from: classes.dex */
public final class InputReaderAdapterV30 implements android.media.MediaParser.SeekableInputReader {
    private long currentPosition;
    private androidx.media3.common.DataReader dataReader;
    private long lastSeekPosition;
    private long resourceLength;

    public void setDataReader(androidx.media3.common.DataReader dataReader, long j) {
        this.dataReader = dataReader;
        this.resourceLength = j;
        this.lastSeekPosition = -1L;
    }

    public void setCurrentPosition(long j) {
        this.currentPosition = j;
    }

    public long getAndResetSeekPosition() {
        long j = this.lastSeekPosition;
        this.lastSeekPosition = -1L;
        return j;
    }

    @Override // android.media.MediaParser.SeekableInputReader
    public void seekToPosition(long j) {
        this.lastSeekPosition = j;
    }

    @Override // android.media.MediaParser.InputReader
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = ((androidx.media3.common.DataReader) androidx.media3.common.util.Util.castNonNull(this.dataReader)).read(bArr, i, i2);
        this.currentPosition += (long) i3;
        return i3;
    }

    @Override // android.media.MediaParser.InputReader
    public long getPosition() {
        return this.currentPosition;
    }

    @Override // android.media.MediaParser.InputReader
    public long getLength() {
        return this.resourceLength;
    }
}
