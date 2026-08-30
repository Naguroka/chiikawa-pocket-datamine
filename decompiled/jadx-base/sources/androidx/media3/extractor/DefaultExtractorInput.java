package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultExtractorInput implements androidx.media3.extractor.ExtractorInput {
    private static final int PEEK_MAX_FREE_SPACE = 524288;
    private static final int PEEK_MIN_FREE_SPACE_AFTER_RESIZE = 65536;
    private static final int SCRATCH_SPACE_SIZE = 4096;
    private final androidx.media3.common.DataReader dataReader;
    private int peekBufferLength;
    private int peekBufferPosition;
    private long position;
    private final long streamLength;
    private byte[] peekBuffer = new byte[65536];
    private final byte[] scratchSpace = new byte[4096];

    static {
        androidx.media3.common.MediaLibraryInfo.registerModule("media3.extractor");
    }

    public DefaultExtractorInput(androidx.media3.common.DataReader dataReader, long j, long j2) {
        this.dataReader = dataReader;
        this.position = j;
        this.streamLength = j2;
    }

    @Override // androidx.media3.extractor.ExtractorInput, androidx.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws java.io.IOException {
        int fromPeekBuffer = readFromPeekBuffer(bArr, i, i2);
        if (fromPeekBuffer == 0) {
            fromPeekBuffer = readFromUpstream(bArr, i, i2, 0, true);
        }
        commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean readFully(byte[] bArr, int i, int i2, boolean z) throws java.io.IOException {
        int fromPeekBuffer = readFromPeekBuffer(bArr, i, i2);
        while (fromPeekBuffer < i2 && fromPeekBuffer != -1) {
            fromPeekBuffer = readFromUpstream(bArr, i, i2, fromPeekBuffer, z);
        }
        commitBytesRead(fromPeekBuffer);
        return fromPeekBuffer != -1;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i, int i2) throws java.io.IOException {
        readFully(bArr, i, i2, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public int skip(int i) throws java.io.IOException {
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i);
        if (iSkipFromPeekBuffer == 0) {
            byte[] bArr = this.scratchSpace;
            iSkipFromPeekBuffer = readFromUpstream(bArr, 0, java.lang.Math.min(i, bArr.length), 0, true);
        }
        commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean skipFully(int i, boolean z) throws java.io.IOException {
        int iSkipFromPeekBuffer = skipFromPeekBuffer(i);
        while (iSkipFromPeekBuffer < i && iSkipFromPeekBuffer != -1) {
            iSkipFromPeekBuffer = readFromUpstream(this.scratchSpace, -iSkipFromPeekBuffer, java.lang.Math.min(i, this.scratchSpace.length + iSkipFromPeekBuffer), iSkipFromPeekBuffer, z);
        }
        commitBytesRead(iSkipFromPeekBuffer);
        return iSkipFromPeekBuffer != -1;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void skipFully(int i) throws java.io.IOException {
        skipFully(i, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public int peek(byte[] bArr, int i, int i2) throws java.io.IOException {
        int iMin;
        ensureSpaceForPeek(i2);
        int i3 = this.peekBufferLength;
        int i4 = this.peekBufferPosition;
        int i5 = i3 - i4;
        if (i5 == 0) {
            iMin = readFromUpstream(this.peekBuffer, i4, i2, 0, true);
            if (iMin == -1) {
                return -1;
            }
            this.peekBufferLength += iMin;
        } else {
            iMin = java.lang.Math.min(i2, i5);
        }
        java.lang.System.arraycopy(this.peekBuffer, this.peekBufferPosition, bArr, i, iMin);
        this.peekBufferPosition += iMin;
        return iMin;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws java.io.IOException {
        if (!advancePeekPosition(i2, z)) {
            return false;
        }
        java.lang.System.arraycopy(this.peekBuffer, this.peekBufferPosition - i2, bArr, i, i2);
        return true;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void peekFully(byte[] bArr, int i, int i2) throws java.io.IOException {
        peekFully(bArr, i, i2, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public boolean advancePeekPosition(int i, boolean z) throws java.io.IOException {
        ensureSpaceForPeek(i);
        int fromUpstream = this.peekBufferLength - this.peekBufferPosition;
        while (fromUpstream < i) {
            fromUpstream = readFromUpstream(this.peekBuffer, this.peekBufferPosition, i, fromUpstream, z);
            if (fromUpstream == -1) {
                return false;
            }
            this.peekBufferLength = this.peekBufferPosition + fromUpstream;
        }
        this.peekBufferPosition += i;
        return true;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void advancePeekPosition(int i) throws java.io.IOException {
        advancePeekPosition(i, false);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public void resetPeekPosition() {
        this.peekBufferPosition = 0;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.position + ((long) this.peekBufferPosition);
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getPosition() {
        return this.position;
    }

    @Override // androidx.media3.extractor.ExtractorInput
    public long getLength() {
        return this.streamLength;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends java.lang.Throwable */
    @Override // androidx.media3.extractor.ExtractorInput
    public <E extends java.lang.Throwable> void setRetryPosition(long j, E e) throws java.lang.Throwable {
        androidx.media3.common.util.Assertions.checkArgument(j >= 0);
        this.position = j;
        throw e;
    }

    private void ensureSpaceForPeek(int i) {
        int i2 = this.peekBufferPosition + i;
        byte[] bArr = this.peekBuffer;
        if (i2 > bArr.length) {
            this.peekBuffer = java.util.Arrays.copyOf(this.peekBuffer, androidx.media3.common.util.Util.constrainValue(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    private int skipFromPeekBuffer(int i) {
        int iMin = java.lang.Math.min(this.peekBufferLength, i);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private int readFromPeekBuffer(byte[] bArr, int i, int i2) {
        int i3 = this.peekBufferLength;
        if (i3 == 0) {
            return 0;
        }
        int iMin = java.lang.Math.min(i3, i2);
        java.lang.System.arraycopy(this.peekBuffer, 0, bArr, i, iMin);
        updatePeekBuffer(iMin);
        return iMin;
    }

    private void updatePeekBuffer(int i) {
        int i2 = this.peekBufferLength - i;
        this.peekBufferLength = i2;
        this.peekBufferPosition = 0;
        byte[] bArr = this.peekBuffer;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        this.peekBuffer = bArr2;
    }

    private int readFromUpstream(byte[] bArr, int i, int i2, int i3, boolean z) throws java.io.IOException {
        if (java.lang.Thread.interrupted()) {
            throw new java.io.InterruptedIOException();
        }
        int i4 = this.dataReader.read(bArr, i + i3, i2 - i3);
        if (i4 != -1) {
            return i3 + i4;
        }
        if (i3 == 0 && z) {
            return -1;
        }
        throw new java.io.EOFException();
    }

    private void commitBytesRead(int i) {
        if (i != -1) {
            this.position += (long) i;
        }
    }
}
