package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
class NativeSessionFileGzipper {
    NativeSessionFileGzipper() {
    }

    static void processNativeSessions(java.io.File file, java.util.List<com.google.firebase.crashlytics.internal.common.NativeSessionFile> list) {
        for (com.google.firebase.crashlytics.internal.common.NativeSessionFile nativeSessionFile : list) {
            java.io.InputStream stream = null;
            try {
                stream = nativeSessionFile.getStream();
                if (stream != null) {
                    gzipInputStream(stream, new java.io.File(file, nativeSessionFile.getReportsEndpointFilename()));
                }
            } catch (java.io.IOException unused) {
            } finally {
                com.google.firebase.crashlytics.internal.common.CommonUtils.closeQuietly(null);
            }
        }
    }

    private static void gzipInputStream(java.io.InputStream inputStream, java.io.File file) throws java.lang.Throwable {
        if (inputStream == null) {
            return;
        }
        byte[] bArr = new byte[8192];
        java.util.zip.GZIPOutputStream gZIPOutputStream = null;
        try {
            java.util.zip.GZIPOutputStream gZIPOutputStream2 = new java.util.zip.GZIPOutputStream(new java.io.FileOutputStream(file));
            while (true) {
                try {
                    int i = inputStream.read(bArr);
                    if (i > 0) {
                        gZIPOutputStream2.write(bArr, 0, i);
                    } else {
                        gZIPOutputStream2.finish();
                        com.google.firebase.crashlytics.internal.common.CommonUtils.closeQuietly(gZIPOutputStream2);
                        return;
                    }
                } catch (java.lang.Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    com.google.firebase.crashlytics.internal.common.CommonUtils.closeQuietly(gZIPOutputStream);
                    throw th;
                }
            }
        } catch (java.lang.Throwable th2) {
            th = th2;
        }
    }
}
