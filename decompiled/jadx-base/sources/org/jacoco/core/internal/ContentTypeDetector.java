package org.jacoco.core.internal;

/* JADX INFO: loaded from: classes6.dex */
public class ContentTypeDetector {
    private static final int BUFFER_SIZE = 8;
    public static final int CLASSFILE = -889275714;
    public static final int GZFILE = 529203200;
    public static final int PACK200FILE = -889270259;
    public static final int UNKNOWN = -1;
    public static final int ZIPFILE = 1347093252;
    private final java.io.InputStream in;
    private final int type;

    public ContentTypeDetector(java.io.InputStream inputStream) throws java.io.IOException {
        if (inputStream.markSupported()) {
            this.in = inputStream;
        } else {
            this.in = new java.io.BufferedInputStream(inputStream, 8);
        }
        this.in.mark(8);
        this.type = determineType(this.in);
        this.in.reset();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0011, code lost:
    
        if (r0 != 1347093252) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static int determineType(java.io.InputStream inputStream) throws java.io.IOException {
        int i = readInt(inputStream);
        if (i != -889275714) {
            int i2 = PACK200FILE;
            if (i != -889270259) {
                i2 = ZIPFILE;
            }
            return i2;
        }
        if ((readInt(inputStream) & 65535) >= 45) {
            return CLASSFILE;
        }
        if (((-65536) & i) == 529203200) {
            return GZFILE;
        }
        return -1;
    }

    private static int readInt(java.io.InputStream inputStream) throws java.io.IOException {
        return inputStream.read() | (inputStream.read() << 24) | (inputStream.read() << 16) | (inputStream.read() << 8);
    }

    public java.io.InputStream getInputStream() {
        return this.in;
    }

    public int getType() {
        return this.type;
    }
}
