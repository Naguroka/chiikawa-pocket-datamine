package androidx.core.util;

/* JADX INFO: loaded from: classes.dex */
@java.lang.Deprecated
public class LogWriter extends java.io.Writer {
    private java.lang.StringBuilder mBuilder = new java.lang.StringBuilder(128);
    private final java.lang.String mTag;

    public LogWriter(java.lang.String str) {
        this.mTag = str;
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        flushBuilder();
    }

    @Override // java.io.Writer, java.io.Flushable
    public void flush() {
        flushBuilder();
    }

    @Override // java.io.Writer
    public void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                flushBuilder();
            } else {
                this.mBuilder.append(c);
            }
        }
    }

    private void flushBuilder() {
        if (this.mBuilder.length() > 0) {
            android.util.Log.d(this.mTag, this.mBuilder.toString());
            java.lang.StringBuilder sb = this.mBuilder;
            sb.delete(0, sb.length());
        }
    }
}
