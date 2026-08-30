package androidx.profileinstaller;

/* JADX INFO: loaded from: classes3.dex */
class Encoding {
    static final int SIZEOF_BYTE = 8;
    static final int UINT_16_SIZE = 2;
    static final int UINT_32_SIZE = 4;
    static final int UINT_8_SIZE = 1;

    private Encoding() {
    }

    static int utf8Length(java.lang.String str) {
        return str.getBytes(java.nio.charset.StandardCharsets.UTF_8).length;
    }

    static void writeUInt(java.io.OutputStream outputStream, long j, int i) throws java.io.IOException {
        byte[] bArr = new byte[i];
        for (int i2 = 0; i2 < i; i2++) {
            bArr[i2] = (byte) ((j >> (i2 * 8)) & 255);
        }
        outputStream.write(bArr);
    }

    static void writeUInt8(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        writeUInt(outputStream, i, 1);
    }

    static void writeUInt16(java.io.OutputStream outputStream, int i) throws java.io.IOException {
        writeUInt(outputStream, i, 2);
    }

    static void writeUInt32(java.io.OutputStream outputStream, long j) throws java.io.IOException {
        writeUInt(outputStream, j, 4);
    }

    static void writeString(java.io.OutputStream outputStream, java.lang.String str) throws java.io.IOException {
        outputStream.write(str.getBytes(java.nio.charset.StandardCharsets.UTF_8));
    }

    static int bitsToBytes(int i) {
        return (((i + 8) - 1) & (-8)) / 8;
    }

    static byte[] read(java.io.InputStream inputStream, int i) throws java.io.IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = inputStream.read(bArr, i2, i - i2);
            if (i3 < 0) {
                throw error("Not enough bytes to read: " + i);
            }
            i2 += i3;
        }
        return bArr;
    }

    static long readUInt(java.io.InputStream inputStream, int i) throws java.io.IOException {
        byte[] bArr = read(inputStream, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j += ((long) (bArr[i2] & 255)) << (i2 * 8);
        }
        return j;
    }

    static int readUInt8(java.io.InputStream inputStream) throws java.io.IOException {
        return (int) readUInt(inputStream, 1);
    }

    static int readUInt16(java.io.InputStream inputStream) throws java.io.IOException {
        return (int) readUInt(inputStream, 2);
    }

    static long readUInt32(java.io.InputStream inputStream) throws java.io.IOException {
        return readUInt(inputStream, 4);
    }

    static java.lang.String readString(java.io.InputStream inputStream, int i) throws java.io.IOException {
        return new java.lang.String(read(inputStream, i), java.nio.charset.StandardCharsets.UTF_8);
    }

    static byte[] readCompressed(java.io.InputStream inputStream, int i, int i2) throws java.io.IOException {
        java.util.zip.Inflater inflater = new java.util.zip.Inflater();
        try {
            byte[] bArr = new byte[i2];
            byte[] bArr2 = new byte[2048];
            int i3 = 0;
            int iInflate = 0;
            while (!inflater.finished() && !inflater.needsDictionary() && i3 < i) {
                int i4 = inputStream.read(bArr2);
                if (i4 < 0) {
                    throw error("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected " + i + " bytes");
                }
                inflater.setInput(bArr2, 0, i4);
                try {
                    iInflate += inflater.inflate(bArr, iInflate, i2 - iInflate);
                    i3 += i4;
                } catch (java.util.zip.DataFormatException e) {
                    throw error(e.getMessage());
                }
            }
            if (i3 != i) {
                throw error("Didn't read enough bytes during decompression. expected=" + i + " actual=" + i3);
            }
            if (!inflater.finished()) {
                throw error("Inflater did not finish");
            }
            inflater.end();
            return bArr;
        } catch (java.lang.Throwable th) {
            inflater.end();
            throw th;
        }
    }

    static void writeCompressed(java.io.OutputStream outputStream, byte[] bArr) throws java.io.IOException {
        writeUInt32(outputStream, bArr.length);
        byte[] bArrCompress = compress(bArr);
        writeUInt32(outputStream, bArrCompress.length);
        outputStream.write(bArrCompress);
    }

    static byte[] compress(byte[] bArr) throws java.io.IOException {
        java.util.zip.Deflater deflater = new java.util.zip.Deflater(1);
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        try {
            java.util.zip.DeflaterOutputStream deflaterOutputStream = new java.util.zip.DeflaterOutputStream(byteArrayOutputStream, deflater);
            try {
                deflaterOutputStream.write(bArr);
                deflaterOutputStream.close();
                deflater.end();
                return byteArrayOutputStream.toByteArray();
            } catch (java.lang.Throwable th) {
                try {
                    deflaterOutputStream.close();
                } catch (java.lang.Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (java.lang.Throwable th3) {
            deflater.end();
            throw th3;
        }
    }

    static void writeAll(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArr = new byte[512];
        while (true) {
            int i = inputStream.read(bArr);
            if (i <= 0) {
                return;
            } else {
                outputStream.write(bArr, 0, i);
            }
        }
    }

    static java.lang.RuntimeException error(java.lang.String str) {
        return new java.lang.IllegalStateException(str);
    }
}
