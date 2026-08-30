package com.apm.insight.l;

/* JADX INFO: compiled from: DigestPrintWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends java.io.PrintWriter {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.security.MessageDigest f443a;
    private java.nio.charset.Charset b;
    private com.apm.insight.l.e.a c;

    /* JADX INFO: compiled from: DigestPrintWriter.java */
    public static class a {
        public boolean a(java.lang.String str) {
            return true;
        }
    }

    public e(java.io.OutputStream outputStream, java.security.MessageDigest messageDigest, com.apm.insight.l.e.a aVar) {
        super(outputStream);
        this.b = null;
        this.f443a = messageDigest;
        this.c = aVar;
        if (messageDigest != null) {
            this.b = java.nio.charset.Charset.defaultCharset();
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        super.write(cArr, i, i2);
        java.security.MessageDigest messageDigest = this.f443a;
        if (messageDigest != null) {
            messageDigest.update(this.b.encode(java.nio.CharBuffer.wrap(cArr)).array());
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(int i) {
        super.write(i);
        java.security.MessageDigest messageDigest = this.f443a;
        if (messageDigest != null) {
            messageDigest.update((byte) i);
        }
    }

    @Override // java.io.PrintWriter, java.io.Writer
    public final void write(java.lang.String str, int i, int i2) {
        super.write(str, i, i2);
        if (this.f443a != null) {
            com.apm.insight.l.e.a aVar = this.c;
            if (aVar == null || aVar.a(str)) {
                this.f443a.update(this.b.encode(java.nio.CharBuffer.wrap(str, i, i2 + i)).array());
            }
        }
    }
}
