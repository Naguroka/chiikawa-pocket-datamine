package org.chromium.net;

/* JADX INFO: loaded from: classes6.dex */
public abstract class UploadDataProvider implements java.io.Closeable {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
    }

    public abstract long getLength() throws java.io.IOException;

    public abstract void read(org.chromium.net.UploadDataSink uploadDataSink, java.nio.ByteBuffer byteBuffer) throws java.io.IOException;

    public abstract void rewind(org.chromium.net.UploadDataSink uploadDataSink) throws java.io.IOException;
}
