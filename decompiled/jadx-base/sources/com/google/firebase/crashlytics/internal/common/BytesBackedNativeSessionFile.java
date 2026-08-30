package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
class BytesBackedNativeSessionFile implements com.google.firebase.crashlytics.internal.common.NativeSessionFile {
    private final byte[] bytes;
    private final java.lang.String dataTransportFilename;
    private final java.lang.String reportsEndpointFilename;

    BytesBackedNativeSessionFile(java.lang.String str, java.lang.String str2, byte[] bArr) {
        this.dataTransportFilename = str;
        this.reportsEndpointFilename = str2;
        this.bytes = bArr;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public java.lang.String getReportsEndpointFilename() {
        return this.reportsEndpointFilename;
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public java.io.InputStream getStream() {
        if (isEmpty()) {
            return null;
        }
        return new java.io.ByteArrayInputStream(this.bytes);
    }

    @Override // com.google.firebase.crashlytics.internal.common.NativeSessionFile
    public com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File asFilePayload() {
        byte[] bArrAsGzippedBytes = asGzippedBytes();
        if (bArrAsGzippedBytes == null) {
            return null;
        }
        return com.google.firebase.crashlytics.internal.model.CrashlyticsReport.FilesPayload.File.builder().setContents(bArrAsGzippedBytes).setFilename(this.dataTransportFilename).build();
    }

    private boolean isEmpty() {
        byte[] bArr = this.bytes;
        return bArr == null || bArr.length == 0;
    }

    private byte[] asGzippedBytes() {
        if (isEmpty()) {
            return null;
        }
        try {
            java.io.ByteArrayOutputStream byteArrayOutputStream = new java.io.ByteArrayOutputStream();
            try {
                java.util.zip.GZIPOutputStream gZIPOutputStream = new java.util.zip.GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream.write(this.bytes);
                    gZIPOutputStream.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (java.lang.Throwable th) {
                    try {
                        gZIPOutputStream.close();
                    } catch (java.lang.Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (java.lang.Throwable th3) {
                try {
                    byteArrayOutputStream.close();
                } catch (java.lang.Throwable th4) {
                    th3.addSuppressed(th4);
                }
                throw th3;
            }
        } catch (java.io.IOException unused) {
            return null;
        }
    }
}
