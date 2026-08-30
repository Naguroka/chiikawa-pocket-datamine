package com.apm.insight.k;

/* JADX INFO: compiled from: ZipWithZipOutputStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k extends java.util.zip.GZIPOutputStream {
    @Override // java.util.zip.DeflaterOutputStream, java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
    }

    @Override // java.util.zip.GZIPOutputStream, java.util.zip.DeflaterOutputStream
    public final void finish() throws java.io.IOException {
    }

    public k(java.io.OutputStream outputStream) throws java.io.IOException {
        super(outputStream);
    }

    public final void a() throws java.io.IOException {
        super.close();
    }

    public final void b() throws java.io.IOException {
        super.finish();
    }
}
