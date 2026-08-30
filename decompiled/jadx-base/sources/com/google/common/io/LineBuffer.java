package com.google.common.io;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.io.ElementTypesAreNonnullByDefault
abstract class LineBuffer {
    private java.lang.StringBuilder line = new java.lang.StringBuilder();
    private boolean sawReturn;

    protected abstract void handleLine(java.lang.String line, java.lang.String end) throws java.io.IOException;

    LineBuffer() {
    }

    /* JADX WARN: Code duplicated, block: B:12:0x001a  */
    protected void add(char[] cbuf, int off, int len) throws java.io.IOException {
        int i;
        if (!this.sawReturn || len <= 0) {
            i = off;
        } else {
            if (finishLine(cbuf[off] == '\n')) {
                i = off + 1;
            } else {
                i = off;
            }
        }
        int i2 = off + len;
        int i3 = i;
        while (i < i2) {
            char c = cbuf[i];
            if (c != '\n') {
                if (c == '\r') {
                    this.line.append(cbuf, i3, i - i3);
                    this.sawReturn = true;
                    int i4 = i + 1;
                    if (i4 < i2) {
                        if (finishLine(cbuf[i4] == '\n')) {
                            i = i4;
                        }
                    }
                }
                i++;
            } else {
                this.line.append(cbuf, i3, i - i3);
                finishLine(true);
            }
            i3 = i + 1;
            i++;
        }
        this.line.append(cbuf, i3, i2 - i3);
    }

    private boolean finishLine(boolean sawNewline) throws java.io.IOException {
        java.lang.String str;
        if (this.sawReturn) {
            str = sawNewline ? "\r\n" : "\r";
        } else {
            str = sawNewline ? "\n" : "";
        }
        handleLine(this.line.toString(), str);
        this.line = new java.lang.StringBuilder();
        this.sawReturn = false;
        return sawNewline;
    }

    protected void finish() throws java.io.IOException {
        if (this.sawReturn || this.line.length() > 0) {
            finishLine(false);
        }
    }
}
