package com.apm.insight.k;

/* JADX INFO: compiled from: DataWithoutCloseStream.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f extends java.io.DataOutputStream {
    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
    }

    public f(java.io.OutputStream outputStream) {
        super(outputStream);
    }

    public final void a() throws java.io.IOException {
        super.close();
    }
}
