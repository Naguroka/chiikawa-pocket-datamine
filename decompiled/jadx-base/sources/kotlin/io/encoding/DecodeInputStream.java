package kotlin.io.encoding;

/* JADX INFO: compiled from: Base64IOStream.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u000f\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0013\u001a\u00020\u0014H\u0016J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0002J(\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\u0010\u0010\u001c\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\tH\u0002J\b\u0010\u001d\u001a\u00020\tH\u0016J \u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\tH\u0016J\b\u0010 \u001a\u00020\tH\u0002J\b\u0010!\u001a\u00020\u0014H\u0002J\b\u0010\"\u001a\u00020\u0014H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lkotlin/io/encoding/DecodeInputStream;", "Ljava/io/InputStream;", "input", "base64", "Lkotlin/io/encoding/Base64;", "(Ljava/io/InputStream;Lkotlin/io/encoding/Base64;)V", "byteBuffer", "", "byteBufferEndIndex", "", "byteBufferLength", "getByteBufferLength", "()I", "byteBufferStartIndex", "isClosed", "", "isEOF", "singleByteBuffer", "symbolBuffer", "close", "", "copyByteBufferInto", "dst", "dstOffset", "length", "decodeSymbolBufferInto", "dstEndIndex", "symbolBufferLength", "handlePaddingSymbol", "read", com.google.firebase.analytics.FirebaseAnalytics.Param.DESTINATION, androidx.constraintlayout.core.motion.utils.TypedValues.CycleType.S_WAVE_OFFSET, "readNextSymbol", "resetByteBufferIfEmpty", "shiftByteBufferToStartIfNeeded", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
final class DecodeInputStream extends java.io.InputStream {
    private final kotlin.io.encoding.Base64 base64;
    private final byte[] byteBuffer;
    private int byteBufferEndIndex;
    private int byteBufferStartIndex;
    private final java.io.InputStream input;
    private boolean isClosed;
    private boolean isEOF;
    private final byte[] singleByteBuffer;
    private final byte[] symbolBuffer;

    public DecodeInputStream(java.io.InputStream input, kotlin.io.encoding.Base64 base64) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(input, "input");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(base64, "base64");
        this.input = input;
        this.base64 = base64;
        this.singleByteBuffer = new byte[1];
        this.symbolBuffer = new byte[1024];
        this.byteBuffer = new byte[1024];
    }

    private final int getByteBufferLength() {
        return this.byteBufferEndIndex - this.byteBufferStartIndex;
    }

    @Override // java.io.InputStream
    public int read() throws java.io.IOException {
        int i = this.byteBufferStartIndex;
        if (i < this.byteBufferEndIndex) {
            int i2 = this.byteBuffer[i] & 255;
            this.byteBufferStartIndex = i + 1;
            resetByteBufferIfEmpty();
            return i2;
        }
        int i3 = read(this.singleByteBuffer, 0, 1);
        if (i3 == -1) {
            return -1;
        }
        if (i3 == 1) {
            return this.singleByteBuffer[0] & 255;
        }
        throw new java.lang.IllegalStateException("Unreachable".toString());
    }

    @Override // java.io.InputStream
    public int read(byte[] destination, int offset, int length) throws java.io.IOException {
        int i;
        boolean z;
        boolean z2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(destination, "destination");
        if (offset < 0 || length < 0 || (i = offset + length) > destination.length) {
            throw new java.lang.IndexOutOfBoundsException("offset: " + offset + ", length: " + length + ", buffer size: " + destination.length);
        }
        if (this.isClosed) {
            throw new java.io.IOException("The input stream is closed.");
        }
        if (this.isEOF) {
            return -1;
        }
        if (length == 0) {
            return 0;
        }
        if (getByteBufferLength() >= length) {
            copyByteBufferInto(destination, offset, length);
            return length;
        }
        int byteBufferLength = ((((length - getByteBufferLength()) + 3) - 1) / 3) * 4;
        int iDecodeSymbolBufferInto = offset;
        while (true) {
            z = this.isEOF;
            if (z || byteBufferLength <= 0) {
                break;
            }
            int iMin = java.lang.Math.min(this.symbolBuffer.length, byteBufferLength);
            int iHandlePaddingSymbol = 0;
            while (true) {
                z2 = this.isEOF;
                if (z2 || iHandlePaddingSymbol >= iMin) {
                    break;
                }
                int nextSymbol = readNextSymbol();
                if (nextSymbol == -1) {
                    this.isEOF = true;
                } else if (nextSymbol == 61) {
                    iHandlePaddingSymbol = handlePaddingSymbol(iHandlePaddingSymbol);
                    this.isEOF = true;
                } else {
                    this.symbolBuffer[iHandlePaddingSymbol] = (byte) nextSymbol;
                    iHandlePaddingSymbol++;
                }
            }
            if (!(z2 || iHandlePaddingSymbol == iMin)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            byteBufferLength -= iHandlePaddingSymbol;
            iDecodeSymbolBufferInto += decodeSymbolBufferInto(destination, iDecodeSymbolBufferInto, i, iHandlePaddingSymbol);
        }
        if (iDecodeSymbolBufferInto == offset && z) {
            return -1;
        }
        return iDecodeSymbolBufferInto - offset;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        if (this.isClosed) {
            return;
        }
        this.isClosed = true;
        this.input.close();
    }

    private final int decodeSymbolBufferInto(byte[] dst, int dstOffset, int dstEndIndex, int symbolBufferLength) {
        int i = this.byteBufferEndIndex;
        this.byteBufferEndIndex = i + this.base64.decodeIntoByteArray(this.symbolBuffer, this.byteBuffer, i, 0, symbolBufferLength);
        int iMin = java.lang.Math.min(getByteBufferLength(), dstEndIndex - dstOffset);
        copyByteBufferInto(dst, dstOffset, iMin);
        shiftByteBufferToStartIfNeeded();
        return iMin;
    }

    private final void copyByteBufferInto(byte[] dst, int dstOffset, int length) {
        byte[] bArr = this.byteBuffer;
        int i = this.byteBufferStartIndex;
        kotlin.collections.ArraysKt.copyInto(bArr, dst, dstOffset, i, i + length);
        this.byteBufferStartIndex += length;
        resetByteBufferIfEmpty();
    }

    private final void resetByteBufferIfEmpty() {
        if (this.byteBufferStartIndex == this.byteBufferEndIndex) {
            this.byteBufferStartIndex = 0;
            this.byteBufferEndIndex = 0;
        }
    }

    private final void shiftByteBufferToStartIfNeeded() {
        byte[] bArr = this.byteBuffer;
        int length = bArr.length;
        int i = this.byteBufferEndIndex;
        if ((this.symbolBuffer.length / 4) * 3 > length - i) {
            kotlin.collections.ArraysKt.copyInto(bArr, bArr, 0, this.byteBufferStartIndex, i);
            this.byteBufferEndIndex -= this.byteBufferStartIndex;
            this.byteBufferStartIndex = 0;
        }
    }

    private final int handlePaddingSymbol(int symbolBufferLength) throws java.io.IOException {
        this.symbolBuffer[symbolBufferLength] = kotlin.io.encoding.Base64.padSymbol;
        if ((symbolBufferLength & 3) != 2) {
            return symbolBufferLength + 1;
        }
        int nextSymbol = readNextSymbol();
        if (nextSymbol >= 0) {
            this.symbolBuffer[symbolBufferLength + 1] = (byte) nextSymbol;
        }
        return symbolBufferLength + 2;
    }

    private final int readNextSymbol() throws java.io.IOException {
        int i;
        if (!this.base64.getIsMimeScheme()) {
            return this.input.read();
        }
        do {
            i = this.input.read();
            if (i == -1) {
                break;
            }
        } while (!kotlin.io.encoding.Base64Kt.isInMimeAlphabet(i));
        return i;
    }
}
