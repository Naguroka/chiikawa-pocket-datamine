package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public abstract class ByteSink {
    public abstract java.io.OutputStream openStream() throws java.io.IOException;

    protected ByteSink() {
    }

    public com.google.common.io.CharSink asCharSink(java.nio.charset.Charset charset) {
        return new com.google.common.io.ByteSink.AsCharSink(charset);
    }

    public java.io.OutputStream openBufferedStream() throws java.io.IOException {
        java.io.OutputStream outputStreamOpenStream = openStream();
        if (outputStreamOpenStream instanceof java.io.BufferedOutputStream) {
            return (java.io.BufferedOutputStream) outputStreamOpenStream;
        }
        return new java.io.BufferedOutputStream(outputStreamOpenStream);
    }

    public void write(byte[] bytes) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(bytes);
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            java.io.OutputStream outputStream = (java.io.OutputStream) closerCreate.register(openStream());
            outputStream.write(bytes);
            outputStream.flush();
            closerCreate.close();
        } catch (java.lang.Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (java.lang.Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    public long writeFrom(java.io.InputStream input) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(input);
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            java.io.OutputStream outputStream = (java.io.OutputStream) closerCreate.register(openStream());
            long jCopy = com.google.common.io.ByteStreams.copy(input, outputStream);
            outputStream.flush();
            closerCreate.close();
            return jCopy;
        } catch (java.lang.Throwable th) {
            try {
                throw closerCreate.rethrow(th);
            } catch (java.lang.Throwable th2) {
                closerCreate.close();
                throw th2;
            }
        }
    }

    private final class AsCharSink extends com.google.common.io.CharSink {
        private final java.nio.charset.Charset charset;

        private AsCharSink(java.nio.charset.Charset charset) {
            this.charset = (java.nio.charset.Charset) com.google.common.base.Preconditions.checkNotNull(charset);
        }

        @Override // com.google.common.io.CharSink
        public java.io.Writer openStream() throws java.io.IOException {
            return new java.io.OutputStreamWriter(com.google.common.io.ByteSink.this.openStream(), this.charset);
        }

        public java.lang.String toString() {
            return com.google.common.io.ByteSink.this.toString() + ".asCharSink(" + this.charset + ")";
        }
    }
}
