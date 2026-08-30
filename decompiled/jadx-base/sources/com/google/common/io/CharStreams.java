package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public final class CharStreams {
    private static final int DEFAULT_BUF_SIZE = 2048;

    static java.nio.CharBuffer createBuffer() {
        return java.nio.CharBuffer.allocate(2048);
    }

    private CharStreams() {
    }

    public static long copy(java.lang.Readable from, java.lang.Appendable to) throws java.io.IOException {
        if (from instanceof java.io.Reader) {
            if (to instanceof java.lang.StringBuilder) {
                return copyReaderToBuilder((java.io.Reader) from, (java.lang.StringBuilder) to);
            }
            return copyReaderToWriter((java.io.Reader) from, asWriter(to));
        }
        com.google.common.base.Preconditions.checkNotNull(from);
        com.google.common.base.Preconditions.checkNotNull(to);
        java.nio.CharBuffer charBufferCreateBuffer = createBuffer();
        long jRemaining = 0;
        while (from.read(charBufferCreateBuffer) != -1) {
            com.google.common.io.Java8Compatibility.flip(charBufferCreateBuffer);
            to.append(charBufferCreateBuffer);
            jRemaining += (long) charBufferCreateBuffer.remaining();
            com.google.common.io.Java8Compatibility.clear(charBufferCreateBuffer);
        }
        return jRemaining;
    }

    static long copyReaderToBuilder(java.io.Reader from, java.lang.StringBuilder to) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(from);
        com.google.common.base.Preconditions.checkNotNull(to);
        char[] cArr = new char[2048];
        long j = 0;
        while (true) {
            int i = from.read(cArr);
            if (i == -1) {
                return j;
            }
            to.append(cArr, 0, i);
            j += (long) i;
        }
    }

    static long copyReaderToWriter(java.io.Reader from, java.io.Writer to) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(from);
        com.google.common.base.Preconditions.checkNotNull(to);
        char[] cArr = new char[2048];
        long j = 0;
        while (true) {
            int i = from.read(cArr);
            if (i == -1) {
                return j;
            }
            to.write(cArr, 0, i);
            j += (long) i;
        }
    }

    public static java.lang.String toString(java.lang.Readable r) throws java.io.IOException {
        return toStringBuilder(r).toString();
    }

    private static java.lang.StringBuilder toStringBuilder(java.lang.Readable r) throws java.io.IOException {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        if (r instanceof java.io.Reader) {
            copyReaderToBuilder((java.io.Reader) r, sb);
        } else {
            copy(r, sb);
        }
        return sb;
    }

    public static java.util.List<java.lang.String> readLines(java.lang.Readable r) throws java.io.IOException {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.google.common.io.LineReader lineReader = new com.google.common.io.LineReader(r);
        while (true) {
            java.lang.String line = lineReader.readLine();
            if (line == null) {
                return arrayList;
            }
            arrayList.add(line);
        }
    }

    @com.google.common.io.ParametricNullness
    public static <T> T readLines(java.lang.Readable readable, com.google.common.io.LineProcessor<T> processor) throws java.io.IOException {
        java.lang.String line;
        com.google.common.base.Preconditions.checkNotNull(readable);
        com.google.common.base.Preconditions.checkNotNull(processor);
        com.google.common.io.LineReader lineReader = new com.google.common.io.LineReader(readable);
        do {
            line = lineReader.readLine();
            if (line == null) {
                break;
            }
        } while (processor.processLine(line));
        return processor.getResult();
    }

    public static long exhaust(java.lang.Readable readable) throws java.io.IOException {
        java.nio.CharBuffer charBufferCreateBuffer = createBuffer();
        long j = 0;
        while (true) {
            long j2 = readable.read(charBufferCreateBuffer);
            if (j2 == -1) {
                return j;
            }
            j += j2;
            com.google.common.io.Java8Compatibility.clear(charBufferCreateBuffer);
        }
    }

    public static void skipFully(java.io.Reader reader, long n) throws java.io.IOException {
        com.google.common.base.Preconditions.checkNotNull(reader);
        while (n > 0) {
            long jSkip = reader.skip(n);
            if (jSkip == 0) {
                throw new java.io.EOFException();
            }
            n -= jSkip;
        }
    }

    public static java.io.Writer nullWriter() {
        return com.google.common.io.CharStreams.NullWriter.INSTANCE;
    }

    private static final class NullWriter extends java.io.Writer {
        private static final com.google.common.io.CharStreams.NullWriter INSTANCE = new com.google.common.io.CharStreams.NullWriter();

        @Override // java.io.Writer, java.lang.Appendable
        public java.io.Writer append(char c) {
            return this;
        }

        @Override // java.io.Writer, java.lang.Appendable
        public java.io.Writer append(@javax.annotation.CheckForNull java.lang.CharSequence csq) {
            return this;
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
        }

        public java.lang.String toString() {
            return "CharStreams.nullWriter()";
        }

        @Override // java.io.Writer
        public void write(int c) {
        }

        private NullWriter() {
        }

        @Override // java.io.Writer
        public void write(char[] cbuf) {
            com.google.common.base.Preconditions.checkNotNull(cbuf);
        }

        @Override // java.io.Writer
        public void write(char[] cbuf, int off, int len) {
            com.google.common.base.Preconditions.checkPositionIndexes(off, len + off, cbuf.length);
        }

        @Override // java.io.Writer
        public void write(java.lang.String str) {
            com.google.common.base.Preconditions.checkNotNull(str);
        }

        @Override // java.io.Writer
        public void write(java.lang.String str, int off, int len) {
            com.google.common.base.Preconditions.checkPositionIndexes(off, len + off, str.length());
        }

        @Override // java.io.Writer, java.lang.Appendable
        public java.io.Writer append(@javax.annotation.CheckForNull java.lang.CharSequence csq, int start, int end) {
            com.google.common.base.Preconditions.checkPositionIndexes(start, end, csq == null ? 4 : csq.length());
            return this;
        }
    }

    public static java.io.Writer asWriter(java.lang.Appendable target) {
        if (target instanceof java.io.Writer) {
            return (java.io.Writer) target;
        }
        return new com.google.common.io.AppendableWriter(target);
    }
}
