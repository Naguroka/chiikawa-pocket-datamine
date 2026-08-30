package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public interface ExtractorInput extends androidx.media3.common.DataReader {
    void advancePeekPosition(int i) throws java.io.IOException;

    boolean advancePeekPosition(int i, boolean z) throws java.io.IOException;

    long getLength();

    long getPeekPosition();

    long getPosition();

    int peek(byte[] bArr, int i, int i2) throws java.io.IOException;

    void peekFully(byte[] bArr, int i, int i2) throws java.io.IOException;

    boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws java.io.IOException;

    @Override // androidx.media3.common.DataReader
    int read(byte[] bArr, int i, int i2) throws java.io.IOException;

    void readFully(byte[] bArr, int i, int i2) throws java.io.IOException;

    boolean readFully(byte[] bArr, int i, int i2, boolean z) throws java.io.IOException;

    void resetPeekPosition();

    <E extends java.lang.Throwable> void setRetryPosition(long j, E e) throws java.lang.Throwable;

    int skip(int i) throws java.io.IOException;

    void skipFully(int i) throws java.io.IOException;

    boolean skipFully(int i, boolean z) throws java.io.IOException;
}
