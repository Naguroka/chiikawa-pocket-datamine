package androidx.media3.extractor;

/* JADX INFO: loaded from: classes.dex */
public final class ExtractorUtil {
    @org.checkerframework.dataflow.qual.Pure
    public static void checkContainerInput(boolean z, java.lang.String str) throws androidx.media3.common.ParserException {
        if (!z) {
            throw androidx.media3.common.ParserException.createForMalformedContainer(str, null);
        }
    }

    public static int peekToLength(androidx.media3.extractor.ExtractorInput extractorInput, byte[] bArr, int i, int i2) throws java.io.IOException {
        int i3 = 0;
        while (i3 < i2) {
            int iPeek = extractorInput.peek(bArr, i + i3, i2 - i3);
            if (iPeek == -1) {
                break;
            }
            i3 += iPeek;
        }
        return i3;
    }

    public static boolean readFullyQuietly(androidx.media3.extractor.ExtractorInput extractorInput, byte[] bArr, int i, int i2) throws java.io.IOException {
        try {
            extractorInput.readFully(bArr, i, i2);
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    public static boolean skipFullyQuietly(androidx.media3.extractor.ExtractorInput extractorInput, int i) throws java.io.IOException {
        try {
            extractorInput.skipFully(i);
            return true;
        } catch (java.io.EOFException unused) {
            return false;
        }
    }

    public static boolean peekFullyQuietly(androidx.media3.extractor.ExtractorInput extractorInput, byte[] bArr, int i, int i2, boolean z) throws java.io.IOException {
        try {
            return extractorInput.peekFully(bArr, i, i2, z);
        } catch (java.io.EOFException e) {
            if (z) {
                return false;
            }
            throw e;
        }
    }

    private ExtractorUtil() {
    }
}
