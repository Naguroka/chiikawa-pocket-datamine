package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public abstract class CharSink {
    public abstract java.io.Writer openStream() throws java.io.IOException;

    protected CharSink() {
    }

    public java.io.Writer openBufferedStream() throws java.io.IOException {
        java.io.Writer writerOpenStream = openStream();
        if (writerOpenStream instanceof java.io.BufferedWriter) {
            return (java.io.BufferedWriter) writerOpenStream;
        }
        return new java.io.BufferedWriter(writerOpenStream);
    }

    public void write(java.lang.CharSequence charSequence) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(charSequence);
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            java.io.Writer writer = (java.io.Writer) closerCreate.register(openStream());
            writer.append(charSequence);
            writer.flush();
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

    public void writeLines(java.lang.Iterable<? extends java.lang.CharSequence> lines) throws java.lang.Throwable {
        writeLines(lines, java.lang.System.getProperty("line.separator"));
    }

    public void writeLines(java.lang.Iterable<? extends java.lang.CharSequence> lines, java.lang.String lineSeparator) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(lines);
        com.google.common.base.Preconditions.checkNotNull(lineSeparator);
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            java.io.Writer writer = (java.io.Writer) closerCreate.register(openBufferedStream());
            java.util.Iterator<? extends java.lang.CharSequence> it = lines.iterator();
            while (it.hasNext()) {
                writer.append(it.next()).append((java.lang.CharSequence) lineSeparator);
            }
            writer.flush();
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

    public long writeFrom(java.lang.Readable readable) throws java.lang.Throwable {
        com.google.common.base.Preconditions.checkNotNull(readable);
        com.google.common.io.Closer closerCreate = com.google.common.io.Closer.create();
        try {
            java.io.Writer writer = (java.io.Writer) closerCreate.register(openStream());
            long jCopy = com.google.common.io.CharStreams.copy(readable, writer);
            writer.flush();
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
}
