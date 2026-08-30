package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
public final class LineReader {
    private final char[] buf;
    private final java.nio.CharBuffer cbuf;
    private final com.google.common.io.LineBuffer lineBuf;
    private final java.util.Queue<java.lang.String> lines;
    private final java.lang.Readable readable;

    @javax.annotation.CheckForNull
    private final java.io.Reader reader;

    public LineReader(java.lang.Readable readable) {
        java.nio.CharBuffer charBufferCreateBuffer = com.google.common.io.CharStreams.createBuffer();
        this.cbuf = charBufferCreateBuffer;
        this.buf = charBufferCreateBuffer.array();
        this.lines = new java.util.ArrayDeque();
        this.lineBuf = new com.google.common.io.LineBuffer() { // from class: com.google.common.io.LineReader.1
            @Override // com.google.common.io.LineBuffer
            protected void handleLine(java.lang.String line, java.lang.String end) {
                com.google.common.io.LineReader.this.lines.add(line);
            }
        };
        this.readable = (java.lang.Readable) com.google.common.base.Preconditions.checkNotNull(readable);
        this.reader = readable instanceof java.io.Reader ? (java.io.Reader) readable : null;
    }

    @javax.annotation.CheckForNull
    public java.lang.String readLine() throws java.io.IOException {
        int i;
        while (this.lines.peek() == null) {
            com.google.common.io.Java8Compatibility.clear(this.cbuf);
            java.io.Reader reader = this.reader;
            if (reader != null) {
                char[] cArr = this.buf;
                i = reader.read(cArr, 0, cArr.length);
            } else {
                i = this.readable.read(this.cbuf);
            }
            if (i == -1) {
                this.lineBuf.finish();
                break;
            }
            this.lineBuf.add(this.buf, 0, i);
        }
        return this.lines.poll();
    }
}
