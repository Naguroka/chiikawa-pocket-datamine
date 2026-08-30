package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
class FileBackedNativeSessionFile implements com.google.firebase.crashlytics.internal.common.NativeSessionFile {
    private final java.lang.String dataTransportFilename;
    private final java.io.File file;
    private final java.lang.String reportsEndpointFilename;

    FileBackedNativeSessionFile(java.lang.String str, java.lang.String str2, java.io.File file) {
        this.dataTransportFilename = str;
        this.reportsEndpointFilename = str2;
        this.file = file;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public java.lang.String getReportsEndpointFilename() {
        return this.reportsEndpointFilename;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public java.io.InputStream getStream() {
        if (this.file.exists() && this.file.isFile()) {
            try {
                return new java.io.FileInputStream(this.file);
            } catch (java.io.FileNotFoundException unused) {
            }
        }
        return null;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File asFilePayload() {
        byte[] bArrAsGzippedBytes = asGzippedBytes();
        if (bArrAsGzippedBytes != null) {
            return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.builder().setContents(bArrAsGzippedBytes).setFilename(this.dataTransportFilename).build();
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private byte[] asGzippedBytes() {
        byte[] bArr = new byte[8192];
        try {
            java.io.InputStream stream = getStream();
            try {
                java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
                try {
                    java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                    if (stream != null) {
                        while (true) {
                            try {
                                int i = stream.read(bArr);
                                if (i <= 0) {
                                    break;
                                }
                                gZIPOutputStream.write(bArr, 0, i);
                            } catch (java.lang.Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (java.lang.Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                            try {
                                byteArrayOutputStream.close();
                            } catch (java.lang.Throwable th3) {
                                th.addSuppressed(th3);
                            }
                            throw th;
                        }
                        gZIPOutputStream.finish();
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        gZIPOutputStream.close();
                        byteArrayOutputStream.close();
                        if (stream != null) {
                            stream.close();
                        }
                        return byteArray;
                    }
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    if (stream != null) {
                        stream.close();
                    }
                    return null;
                } catch (java.lang.Throwable th4) {
                    byteArrayOutputStream.close();
                    throw th4;
                }
            } catch (java.lang.Throwable th5) {
                if (stream != null) {
                    try {
                        stream.close();
                    } catch (java.lang.Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
            if (stream != null) {
                stream.close();
            }
            throw th5;
        } catch (java.io.IOException unused) {
            return null;
        }
    }
}
