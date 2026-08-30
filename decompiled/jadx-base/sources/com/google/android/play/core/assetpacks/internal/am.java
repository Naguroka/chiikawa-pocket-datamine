package com.google.android.play.core.assetpacks.internal;

/* JADX INFO: compiled from: com.google.android.play:asset-delivery@@2.1.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class am {
    public static long a(com.google.android.play.core.assetpacks.internal.an anVar, java.io.InputStream inputStream, java.io.OutputStream outputStream, long j) throws java.io.IOException {
        byte[] bArr = new byte[16384];
        java.io.DataInputStream dataInputStream = new java.io.DataInputStream(new java.io.BufferedInputStream(inputStream, 4096));
        int i = dataInputStream.readInt();
        if (i != -771763713) {
            throw new com.google.android.play.core.assetpacks.internal.al("Unexpected magic=".concat(java.lang.String.valueOf(java.lang.String.format("%x", java.lang.Integer.valueOf(i)))));
        }
        int i2 = dataInputStream.read();
        if (i2 != 4) {
            throw new com.google.android.play.core.assetpacks.internal.al("Unexpected version=" + i2);
        }
        long j2 = 0;
        while (true) {
            long j3 = j - j2;
            try {
                int unsignedShort = dataInputStream.read();
                if (unsignedShort == -1) {
                    throw new java.io.IOException("Patch file overrun");
                }
                if (unsignedShort == 0) {
                    outputStream.flush();
                    return j2;
                }
                switch (unsignedShort) {
                    case 247:
                        unsignedShort = dataInputStream.readUnsignedShort();
                        c(bArr, dataInputStream, outputStream, unsignedShort, j3);
                        break;
                    case 248:
                        unsignedShort = dataInputStream.readInt();
                        c(bArr, dataInputStream, outputStream, unsignedShort, j3);
                        break;
                    case 249:
                        long unsignedShort2 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new java.io.IOException("Unexpected end of patch");
                        }
                        b(bArr, anVar, outputStream, unsignedShort2, unsignedShort, j3);
                        break;
                        break;
                    case 250:
                        long unsignedShort3 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        b(bArr, anVar, outputStream, unsignedShort3, unsignedShort, j3);
                        break;
                    case 251:
                        long unsignedShort4 = dataInputStream.readUnsignedShort();
                        unsignedShort = dataInputStream.readInt();
                        b(bArr, anVar, outputStream, unsignedShort4, unsignedShort, j3);
                        break;
                    case 252:
                        long j4 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.read();
                        if (unsignedShort == -1) {
                            throw new java.io.IOException("Unexpected end of patch");
                        }
                        b(bArr, anVar, outputStream, j4, unsignedShort, j3);
                        break;
                        break;
                    case 253:
                        long j5 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readUnsignedShort();
                        b(bArr, anVar, outputStream, j5, unsignedShort, j3);
                        break;
                    case 254:
                        long j6 = dataInputStream.readInt();
                        unsignedShort = dataInputStream.readInt();
                        b(bArr, anVar, outputStream, j6, unsignedShort, j3);
                        break;
                    case 255:
                        long j7 = dataInputStream.readLong();
                        unsignedShort = dataInputStream.readInt();
                        b(bArr, anVar, outputStream, j7, unsignedShort, j3);
                        break;
                    default:
                        c(bArr, dataInputStream, outputStream, unsignedShort, j3);
                        break;
                }
                j2 += (long) unsignedShort;
            } catch (java.lang.Throwable th) {
                outputStream.flush();
                throw th;
            }
        }
    }

    private static void b(byte[] bArr, com.google.android.play.core.assetpacks.internal.an anVar, java.io.OutputStream outputStream, long j, int i, long j2) throws java.io.IOException {
        if (i < 0) {
            throw new java.io.IOException("copyLength negative");
        }
        if (j < 0) {
            throw new java.io.IOException("inputOffset negative");
        }
        long j3 = i;
        if (j3 > j2) {
            throw new java.io.IOException("Output length overrun");
        }
        try {
            java.io.InputStream inputStreamC = new com.google.android.play.core.assetpacks.internal.ao(anVar, j, j3).c();
            while (i > 0) {
                try {
                    int iMin = java.lang.Math.min(i, 16384);
                    int i2 = 0;
                    while (i2 < iMin) {
                        int i3 = inputStreamC.read(bArr, i2, iMin - i2);
                        if (i3 == -1) {
                            throw new java.io.IOException("truncated input stream");
                        }
                        i2 += i3;
                    }
                    outputStream.write(bArr, 0, iMin);
                    i -= iMin;
                } catch (java.lang.Throwable th) {
                    try {
                        inputStreamC.close();
                    } catch (java.lang.Throwable th2) {
                        try {
                            java.lang.Throwable.class.getDeclaredMethod("addSuppressed", java.lang.Throwable.class).invoke(th, th2);
                        } catch (java.lang.Exception unused) {
                        }
                    }
                    throw th;
                }
            }
            inputStreamC.close();
        } catch (java.io.EOFException e) {
            throw new java.io.IOException("patch underrun", e);
        }
    }

    private static void c(byte[] bArr, java.io.DataInputStream dataInputStream, java.io.OutputStream outputStream, int i, long j) throws java.io.IOException {
        if (i < 0) {
            throw new java.io.IOException("copyLength negative");
        }
        if (i > j) {
            throw new java.io.IOException("Output length overrun");
        }
        while (i > 0) {
            try {
                int iMin = java.lang.Math.min(i, 16384);
                dataInputStream.readFully(bArr, 0, iMin);
                outputStream.write(bArr, 0, iMin);
                i -= iMin;
            } catch (java.io.EOFException unused) {
                throw new java.io.IOException("patch underrun");
            }
        }
    }
}
