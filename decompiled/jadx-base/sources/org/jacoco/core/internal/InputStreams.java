package org.jacoco.core.internal;

/* JADX INFO: loaded from: classes6.dex */
public final class InputStreams {
    private InputStreams() {
    }

    public static byte[] readFully(java.io.InputStream inputStream) throws java.io.IOException {
        byte[] bArr = new byte[1024];
        java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
        while (true) {
            int i = inputStream.read(bArr);
            if (i != -1) {
                byteArrayOutputStream.write(bArr, 0, i);
            } else {
                return byteArrayOutputStream.toByteArray();
            }
        }
    }
}
