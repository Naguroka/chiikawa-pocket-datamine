package androidx.media3.common.util;

/* JADX INFO: loaded from: classes.dex */
@com.google.errorprone.annotations.CheckReturnValue
public final class ParsableByteArray {
    private static final char[] CR_AND_LF = {'\r', '\n'};
    private static final char[] LF = {'\n'};
    private static final com.google.common.collect.ImmutableSet<java.nio.charset.Charset> SUPPORTED_CHARSETS_FOR_READLINE = com.google.common.collect.ImmutableSet.of(com.google.common.base.Charsets.US_ASCII, com.google.common.base.Charsets.UTF_8, com.google.common.base.Charsets.UTF_16, com.google.common.base.Charsets.UTF_16BE, com.google.common.base.Charsets.UTF_16LE);
    private byte[] data;
    private int limit;
    private int position;

    public ParsableByteArray() {
        this.data = androidx.media3.common.util.Util.EMPTY_BYTE_ARRAY;
    }

    public ParsableByteArray(int i) {
        this.data = new byte[i];
        this.limit = i;
    }

    public ParsableByteArray(byte[] bArr) {
        this.data = bArr;
        this.limit = bArr.length;
    }

    public ParsableByteArray(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
    }

    public void reset(int i) {
        reset(capacity() < i ? new byte[i] : this.data, i);
    }

    public void reset(byte[] bArr) {
        reset(bArr, bArr.length);
    }

    public void reset(byte[] bArr, int i) {
        this.data = bArr;
        this.limit = i;
        this.position = 0;
    }

    public void ensureCapacity(int i) {
        if (i > capacity()) {
            this.data = java.util.Arrays.copyOf(this.data, i);
        }
    }

    public int bytesLeft() {
        return this.limit - this.position;
    }

    public int limit() {
        return this.limit;
    }

    public void setLimit(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i <= this.data.length);
        this.limit = i;
    }

    public int getPosition() {
        return this.position;
    }

    public void setPosition(int i) {
        androidx.media3.common.util.Assertions.checkArgument(i >= 0 && i <= this.limit);
        this.position = i;
    }

    public byte[] getData() {
        return this.data;
    }

    public int capacity() {
        return this.data.length;
    }

    public void skipBytes(int i) {
        setPosition(this.position + i);
    }

    public void readBytes(androidx.media3.common.util.ParsableBitArray parsableBitArray, int i) {
        readBytes(parsableBitArray.data, 0, i);
        parsableBitArray.setPosition(0);
    }

    public void readBytes(byte[] bArr, int i, int i2) {
        java.lang.System.arraycopy(this.data, this.position, bArr, i, i2);
        this.position += i2;
    }

    public void readBytes(java.nio.ByteBuffer byteBuffer, int i) {
        byteBuffer.put(this.data, this.position, i);
        this.position += i;
    }

    public int peekUnsignedByte() {
        return this.data[this.position] & 255;
    }

    public char peekChar() {
        byte[] bArr = this.data;
        int i = this.position;
        return (char) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    public char peekChar(java.nio.charset.Charset charset) {
        androidx.media3.common.util.Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        return (char) (peekCharacterAndSize(charset) >> 16);
    }

    public int readUnsignedByte() {
        byte[] bArr = this.data;
        int i = this.position;
        this.position = i + 1;
        return bArr[i] & 255;
    }

    public int readUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.position = i2 + 1;
        return (bArr[i2] & 255) | i3;
    }

    public int readLittleEndianUnsignedShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.position = i2 + 1;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public short readShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.position = i2 + 1;
        return (short) ((bArr[i2] & 255) | i3);
    }

    public short readLittleEndianShort() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.position = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | i3);
    }

    public int readUnsignedInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.position = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    public int readInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (((bArr[i] & 255) << 24) >> 8) | ((bArr[i2] & 255) << 8);
        this.position = i3 + 1;
        return (bArr[i3] & 255) | i4;
    }

    public int readLittleEndianInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        this.position = i3 + 1;
        return ((bArr[i3] & 255) << 16) | i4;
    }

    public int readLittleEndianUnsignedInt24() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        this.position = i3 + 1;
        return ((bArr[i3] & 255) << 16) | i4;
    }

    public long readUnsignedInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        long j = (((long) bArr[i]) & 255) << 24;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8);
        this.position = i4 + 1;
        return j2 | (((long) bArr[i4]) & 255);
    }

    public long readLittleEndianUnsignedInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        long j = ((long) bArr[i]) & 255;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16);
        this.position = i4 + 1;
        return j2 | ((((long) bArr[i4]) & 255) << 24);
    }

    public int readInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 8);
        this.position = i5 + 1;
        return (bArr[i5] & 255) | i6;
    }

    public int readLittleEndianInt() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i5 = i3 + 1;
        int i6 = i4 | ((bArr[i3] & 255) << 16);
        this.position = i5 + 1;
        return ((bArr[i5] & 255) << 24) | i6;
    }

    public long readLong() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        long j = (((long) bArr[i]) & 255) << 56;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40);
        int i5 = i4 + 1;
        long j3 = j2 | ((((long) bArr[i4]) & 255) << 32);
        int i6 = i5 + 1;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 24);
        int i7 = i6 + 1;
        long j5 = j4 | ((((long) bArr[i6]) & 255) << 16);
        int i8 = i7 + 1;
        long j6 = j5 | ((((long) bArr[i7]) & 255) << 8);
        this.position = i8 + 1;
        return j6 | (((long) bArr[i8]) & 255);
    }

    public long readLittleEndianLong() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        long j = ((long) bArr[i]) & 255;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        long j2 = j | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16);
        int i5 = i4 + 1;
        long j3 = j2 | ((((long) bArr[i4]) & 255) << 24);
        int i6 = i5 + 1;
        long j4 = j3 | ((((long) bArr[i5]) & 255) << 32);
        int i7 = i6 + 1;
        long j5 = j4 | ((((long) bArr[i6]) & 255) << 40);
        int i8 = i7 + 1;
        long j6 = j5 | ((((long) bArr[i7]) & 255) << 48);
        this.position = i8 + 1;
        return j6 | ((((long) bArr[i8]) & 255) << 56);
    }

    public int readUnsignedFixedPoint1616() {
        byte[] bArr = this.data;
        int i = this.position;
        int i2 = i + 1;
        int i3 = (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
        this.position = i2 + 1 + 2;
        return i3;
    }

    public int readSynchSafeInt() {
        return (readUnsignedByte() << 21) | (readUnsignedByte() << 14) | (readUnsignedByte() << 7) | readUnsignedByte();
    }

    public int readUnsignedIntToInt() {
        int i = readInt();
        if (i >= 0) {
            return i;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: " + i);
    }

    public int readLittleEndianUnsignedIntToInt() {
        int littleEndianInt = readLittleEndianInt();
        if (littleEndianInt >= 0) {
            return littleEndianInt;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: " + littleEndianInt);
    }

    public long readUnsignedLongToLong() {
        long j = readLong();
        if (j >= 0) {
            return j;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: " + j);
    }

    public float readFloat() {
        return java.lang.Float.intBitsToFloat(readInt());
    }

    public double readDouble() {
        return java.lang.Double.longBitsToDouble(readLong());
    }

    public java.lang.String readString(int i) {
        return readString(i, com.google.common.base.Charsets.UTF_8);
    }

    public java.lang.String readString(int i, java.nio.charset.Charset charset) {
        java.lang.String str = new java.lang.String(this.data, this.position, i, charset);
        this.position += i;
        return str;
    }

    public java.lang.String readNullTerminatedString(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.position;
        int i3 = (i2 + i) - 1;
        java.lang.String strFromUtf8Bytes = androidx.media3.common.util.Util.fromUtf8Bytes(this.data, i2, (i3 >= this.limit || this.data[i3] != 0) ? i : i - 1);
        this.position += i;
        return strFromUtf8Bytes;
    }

    public java.lang.String readNullTerminatedString() {
        return readDelimiterTerminatedString((char) 0);
    }

    public java.lang.String readDelimiterTerminatedString(char c) {
        if (bytesLeft() == 0) {
            return null;
        }
        int i = this.position;
        while (i < this.limit && this.data[i] != c) {
            i++;
        }
        byte[] bArr = this.data;
        int i2 = this.position;
        java.lang.String strFromUtf8Bytes = androidx.media3.common.util.Util.fromUtf8Bytes(bArr, i2, i - i2);
        this.position = i;
        if (i < this.limit) {
            this.position = i + 1;
        }
        return strFromUtf8Bytes;
    }

    public java.lang.String readLine() {
        return readLine(com.google.common.base.Charsets.UTF_8);
    }

    public java.lang.String readLine(java.nio.charset.Charset charset) {
        androidx.media3.common.util.Assertions.checkArgument(SUPPORTED_CHARSETS_FOR_READLINE.contains(charset), "Unsupported charset: " + charset);
        if (bytesLeft() == 0) {
            return null;
        }
        if (!charset.equals(com.google.common.base.Charsets.US_ASCII)) {
            readUtfCharsetFromBom();
        }
        java.lang.String string = readString(findNextLineTerminator(charset) - this.position, charset);
        if (this.position == this.limit) {
            return string;
        }
        skipLineTerminator(charset);
        return string;
    }

    public long readUtf8EncodedLong() {
        int i;
        int i2;
        long j = this.data[this.position];
        int i3 = 7;
        while (true) {
            if (i3 >= 0) {
                int i4 = 1 << i3;
                if ((((long) i4) & j) == 0) {
                    if (i3 < 6) {
                        j &= (long) (i4 - 1);
                        i2 = 7 - i3;
                        break;
                    }
                    if (i3 == 7) {
                        i2 = 1;
                        break;
                    }
                } else {
                    i3--;
                }
            }
            i2 = 0;
            break;
        }
        if (i2 == 0) {
            throw new java.lang.NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
        }
        for (i = 1; i < i2; i++) {
            byte b = this.data[this.position + i];
            if ((b & 192) != 128) {
                throw new java.lang.NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
            }
            j = (j << 6) | ((long) (b & okio.Utf8.REPLACEMENT_BYTE));
        }
        this.position += i2;
        return j;
    }

    public java.nio.charset.Charset readUtfCharsetFromBom() {
        if (bytesLeft() >= 3) {
            byte[] bArr = this.data;
            int i = this.position;
            if (bArr[i] == -17 && bArr[i + 1] == -69 && bArr[i + 2] == -65) {
                this.position = i + 3;
                return com.google.common.base.Charsets.UTF_8;
            }
        }
        if (bytesLeft() < 2) {
            return null;
        }
        byte[] bArr2 = this.data;
        int i2 = this.position;
        byte b = bArr2[i2];
        if (b == -2 && bArr2[i2 + 1] == -1) {
            this.position = i2 + 2;
            return com.google.common.base.Charsets.UTF_16BE;
        }
        if (b != -1 || bArr2[i2 + 1] != -2) {
            return null;
        }
        this.position = i2 + 2;
        return com.google.common.base.Charsets.UTF_16LE;
    }

    private int findNextLineTerminator(java.nio.charset.Charset charset) {
        int i;
        if (charset.equals(com.google.common.base.Charsets.UTF_8) || charset.equals(com.google.common.base.Charsets.US_ASCII)) {
            i = 1;
        } else {
            if (!charset.equals(com.google.common.base.Charsets.UTF_16) && !charset.equals(com.google.common.base.Charsets.UTF_16LE) && !charset.equals(com.google.common.base.Charsets.UTF_16BE)) {
                throw new java.lang.IllegalArgumentException("Unsupported charset: " + charset);
            }
            i = 2;
        }
        int i2 = this.position;
        while (true) {
            int i3 = this.limit;
            if (i2 >= i3 - (i - 1)) {
                return i3;
            }
            if ((charset.equals(com.google.common.base.Charsets.UTF_8) || charset.equals(com.google.common.base.Charsets.US_ASCII)) && androidx.media3.common.util.Util.isLinebreak(this.data[i2])) {
                return i2;
            }
            if (charset.equals(com.google.common.base.Charsets.UTF_16) || charset.equals(com.google.common.base.Charsets.UTF_16BE)) {
                byte[] bArr = this.data;
                if (bArr[i2] == 0 && androidx.media3.common.util.Util.isLinebreak(bArr[i2 + 1])) {
                    return i2;
                }
            }
            if (charset.equals(com.google.common.base.Charsets.UTF_16LE)) {
                byte[] bArr2 = this.data;
                if (bArr2[i2 + 1] == 0 && androidx.media3.common.util.Util.isLinebreak(bArr2[i2])) {
                    return i2;
                }
            }
            i2 += i;
        }
    }

    private void skipLineTerminator(java.nio.charset.Charset charset) {
        if (readCharacterIfInList(charset, CR_AND_LF) == '\r') {
            readCharacterIfInList(charset, LF);
        }
    }

    private char readCharacterIfInList(java.nio.charset.Charset charset, char[] cArr) {
        int iPeekCharacterAndSize = peekCharacterAndSize(charset);
        if (iPeekCharacterAndSize == 0) {
            return (char) 0;
        }
        char c = (char) (iPeekCharacterAndSize >> 16);
        if (!com.google.common.primitives.Chars.contains(cArr, c)) {
            return (char) 0;
        }
        this.position += iPeekCharacterAndSize & 65535;
        return c;
    }

    private int peekCharacterAndSize(java.nio.charset.Charset charset) {
        byte bCheckedCast;
        char cFromBytes;
        int i = 1;
        if ((charset.equals(com.google.common.base.Charsets.UTF_8) || charset.equals(com.google.common.base.Charsets.US_ASCII)) && bytesLeft() >= 1) {
            bCheckedCast = (byte) com.google.common.primitives.Chars.checkedCast(com.google.common.primitives.UnsignedBytes.toInt(this.data[this.position]));
        } else {
            if ((charset.equals(com.google.common.base.Charsets.UTF_16) || charset.equals(com.google.common.base.Charsets.UTF_16BE)) && bytesLeft() >= 2) {
                byte[] bArr = this.data;
                int i2 = this.position;
                cFromBytes = com.google.common.primitives.Chars.fromBytes(bArr[i2], bArr[i2 + 1]);
            } else {
                if (!charset.equals(com.google.common.base.Charsets.UTF_16LE) || bytesLeft() < 2) {
                    return 0;
                }
                byte[] bArr2 = this.data;
                int i3 = this.position;
                cFromBytes = com.google.common.primitives.Chars.fromBytes(bArr2[i3 + 1], bArr2[i3]);
            }
            bCheckedCast = (byte) cFromBytes;
            i = 2;
        }
        return (com.google.common.primitives.Chars.checkedCast(bCheckedCast) << 16) + i;
    }
}
