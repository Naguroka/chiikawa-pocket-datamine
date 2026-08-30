package com.google.android.gms.common.util;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public final class IOUtils {
    private IOUtils() {
    }

    public static void closeQuietly(@javax.annotation.Nullable android.os.ParcelFileDescriptor parcelFileDescriptor) {
        if (parcelFileDescriptor != null) {
            try {
                parcelFileDescriptor.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    @java.lang.Deprecated
    public static long copyStream(java.io.InputStream inputStream, java.io.OutputStream outputStream) throws java.io.IOException {
        return copyStream(inputStream, outputStream, false, 1024);
    }

    public static boolean isGzipByteBuffer(byte[] bArr) {
        if (bArr.length > 1) {
            if ((((bArr[1] & 255) << 8) | (bArr[0] & 255)) == 35615) {
                return true;
            }
        }
        return false;
    }

    @java.lang.Deprecated
    public static byte[] readInputStreamFully(java.io.InputStream inputStream) throws java.io.IOException {
        return readInputStreamFully(inputStream, true);
    }

    @java.lang.Deprecated
    public static byte[] toByteArray(java.io.InputStream inputStream) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        com.google.android.gms.common.internal.Preconditions.checkNotNull(inputStream);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(byteArrayOutputStream);
        byte[] bArr = new byte[4096];
        while (true) {
            int i = inputStream.read(bArr);
            if (i == -1) {
                return byteArrayOutputStream.toByteArray();
            }
            byteArrayOutputStream.write(bArr, 0, i);
        }
    }

    public static void closeQuietly(@javax.annotation.Nullable java.io.Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (java.io.IOException unused) {
            }
        }
    }

    @java.lang.Deprecated
    public static long copyStream(java.io.InputStream inputStream, java.io.OutputStream outputStream, boolean z, int i) throws java.io.IOException {
        byte[] bArr = new byte[i];
        long j = 0;
        while (true) {
            try {
                int i2 = inputStream.read(bArr, 0, i);
                if (i2 == -1) {
                    break;
                }
                j += (long) i2;
                outputStream.write(bArr, 0, i2);
            } catch (java.lang.Throwable th) {
                if (z) {
                    closeQuietly(inputStream);
                    closeQuietly(outputStream);
                }
                throw th;
            }
        }
        if (z) {
            closeQuietly(inputStream);
            closeQuietly(outputStream);
        }
        return j;
    }

    @java.lang.Deprecated
    public static byte[] readInputStreamFully(java.io.InputStream inputStream, boolean z) throws java.io.IOException {
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        copyStream(inputStream, byteArrayOutputStream, z, 1024);
        return byteArrayOutputStream.toByteArray();
    }
}
