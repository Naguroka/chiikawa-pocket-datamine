package androidx.exifinterface.media;

/* JADX INFO: loaded from: classes.dex */
class ExifInterfaceUtils {
    private static final java.lang.String TAG = "ExifInterfaceUtils";

    private ExifInterfaceUtils() {
    }

    static int copy(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        byte[] bArr = new byte[8192];
        int i = 0;
        while (true) {
            int i2 = inputStream.read(bArr);
            if (i2 == -1) {
                return i;
            }
            i += i2;
            outputStream.write(bArr, 0, i2);
        }
    }

    static void copy(java.io.InputStream inputStream, java.io.OutputStream outputStream, int i) throws java.io.IOException {
        byte[] bArr = new byte[8192];
        while (i > 0) {
            int iMin = java.lang.Math.min(i, 8192);
            int i2 = inputStream.read(bArr, 0, iMin);
            if (i2 != iMin) {
                throw new java.io.IOException("Failed to copy the given amount of bytes from the inputstream to the output stream.");
            }
            i -= i2;
            outputStream.write(bArr, 0, i2);
        }
    }

    static long[] convertToLongArray(java.lang.Object obj) {
        if (obj instanceof int[]) {
            int[] iArr = (int[]) obj;
            long[] jArr = new long[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                jArr[i] = iArr[i];
            }
            return jArr;
        }
        if (obj instanceof long[]) {
            return (long[]) obj;
        }
        return null;
    }

    static boolean startsWith(byte[] bArr, byte[] bArr2) {
        if (bArr == null || bArr2 == null || bArr.length < bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr2.length; i++) {
            if (bArr[i] != bArr2[i]) {
                return false;
            }
        }
        return true;
    }

    static java.lang.String byteArrayToHexString(byte[] bArr) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(java.lang.String.format("%02x", java.lang.Byte.valueOf(b)));
        }
        return sb.toString();
    }

    static long parseSubSeconds(java.lang.String str) {
        try {
            int iMin = java.lang.Math.min(str.length(), 3);
            long j = java.lang.Long.parseLong(str.substring(0, iMin));
            while (iMin < 3) {
                j *= 10;
                iMin++;
            }
            return j;
        } catch (java.lang.NumberFormatException unused) {
            return 0L;
        }
    }

    static void closeQuietly(java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.lang.RuntimeException e) {
                throw e;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    static void closeFileDescriptor(java.io.FileDescriptor fileDescriptor) {
        try {
            androidx.exifinterface.media.ExifInterfaceUtils.Api21Impl.close(fileDescriptor);
        } catch (java.lang.Exception unused) {
            android.util.Log.e(TAG, "Error closing fd.");
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static java.io.FileDescriptor dup(java.io.FileDescriptor fileDescriptor) throws android.system.ErrnoException {
            return android.system.Os.dup(fileDescriptor);
        }

        static long lseek(java.io.FileDescriptor fileDescriptor, long j, int i) throws android.system.ErrnoException {
            return android.system.Os.lseek(fileDescriptor, j, i);
        }

        static void close(java.io.FileDescriptor fileDescriptor) throws android.system.ErrnoException {
            android.system.Os.close(fileDescriptor);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static void setDataSource(android.media.MediaMetadataRetriever mediaMetadataRetriever, android.media.MediaDataSource mediaDataSource) {
            mediaMetadataRetriever.setDataSource(mediaDataSource);
        }
    }
}
