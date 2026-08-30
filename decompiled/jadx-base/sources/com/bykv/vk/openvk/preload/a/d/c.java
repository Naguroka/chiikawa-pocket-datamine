package com.bykv.vk.openvk.preload.a.d;

/* JADX INFO: compiled from: JsonWriter.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements java.io.Closeable, java.io.Flushable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final java.lang.String[] f1688a = new java.lang.String[128];
    private static final java.lang.String[] b;
    private final java.io.Writer c;
    private int[] d = new int[32];
    private int e = 0;
    private java.lang.String f;
    private boolean g;
    private boolean h;
    private java.lang.String i;
    private boolean j;

    static {
        for (int i = 0; i <= 31; i++) {
            f1688a[i] = java.lang.String.format("\\u%04x", java.lang.Integer.valueOf(i));
        }
        java.lang.String[] strArr = f1688a;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        java.lang.String[] strArr2 = (java.lang.String[]) strArr.clone();
        b = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(java.io.Writer writer) {
        a(6);
        this.f = ":";
        this.j = true;
        if (writer == null) {
            throw new java.lang.NullPointerException("out == null");
        }
        this.c = writer;
    }

    public final void a(boolean z) {
        this.g = z;
    }

    public final boolean a() {
        return this.g;
    }

    public final void b(boolean z) {
        this.h = z;
    }

    public final boolean b() {
        return this.h;
    }

    public final void c(boolean z) {
        this.j = z;
    }

    public final boolean c() {
        return this.j;
    }

    public final com.bykv.vk.openvk.preload.a.d.c d() throws java.io.IOException {
        j();
        return a(1, '[');
    }

    public final com.bykv.vk.openvk.preload.a.d.c e() throws java.io.IOException {
        return a(1, 2, ']');
    }

    public final com.bykv.vk.openvk.preload.a.d.c f() throws java.io.IOException {
        j();
        return a(3, '{');
    }

    public final com.bykv.vk.openvk.preload.a.d.c g() throws java.io.IOException {
        return a(3, 5, '}');
    }

    private com.bykv.vk.openvk.preload.a.d.c a(int i, char c) throws java.io.IOException {
        l();
        a(i);
        this.c.write(c);
        return this;
    }

    private com.bykv.vk.openvk.preload.a.d.c a(int i, int i2, char c) throws java.io.IOException {
        int i3 = i();
        if (i3 != i2 && i3 != i) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        if (this.i != null) {
            throw new java.lang.IllegalStateException("Dangling name: " + this.i);
        }
        this.e--;
        this.c.write(c);
        return this;
    }

    private void a(int i) {
        int i2 = this.e;
        int[] iArr = this.d;
        if (i2 == iArr.length) {
            this.d = java.util.Arrays.copyOf(iArr, i2 << 1);
        }
        int[] iArr2 = this.d;
        int i3 = this.e;
        this.e = i3 + 1;
        iArr2[i3] = i;
    }

    private int i() {
        int i = this.e;
        if (i == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        return this.d[i - 1];
    }

    private void b(int i) {
        this.d[this.e - 1] = i;
    }

    public final com.bykv.vk.openvk.preload.a.d.c a(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            throw new java.lang.NullPointerException("name == null");
        }
        if (this.i != null) {
            throw new java.lang.IllegalStateException();
        }
        if (this.e == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        this.i = str;
        return this;
    }

    private void j() throws java.io.IOException {
        if (this.i != null) {
            k();
            c(this.i);
            this.i = null;
        }
    }

    public final com.bykv.vk.openvk.preload.a.d.c b(java.lang.String str) throws java.io.IOException {
        if (str == null) {
            return h();
        }
        j();
        l();
        c(str);
        return this;
    }

    public final com.bykv.vk.openvk.preload.a.d.c h() throws java.io.IOException {
        if (this.i != null) {
            if (this.j) {
                j();
            } else {
                this.i = null;
                return this;
            }
        }
        l();
        this.c.write("null");
        return this;
    }

    public final com.bykv.vk.openvk.preload.a.d.c d(boolean z) throws java.io.IOException {
        j();
        l();
        this.c.write(z ? com.json.mediationsdk.metadata.a.g : "false");
        return this;
    }

    public final com.bykv.vk.openvk.preload.a.d.c a(java.lang.Boolean bool) throws java.io.IOException {
        if (bool == null) {
            return h();
        }
        j();
        l();
        this.c.write(bool.booleanValue() ? com.json.mediationsdk.metadata.a.g : "false");
        return this;
    }

    public final com.bykv.vk.openvk.preload.a.d.c a(long j) throws java.io.IOException {
        j();
        l();
        this.c.write(java.lang.Long.toString(j));
        return this;
    }

    public final com.bykv.vk.openvk.preload.a.d.c a(java.lang.Number number) throws java.io.IOException {
        if (number == null) {
            return h();
        }
        j();
        java.lang.String string = number.toString();
        if (!this.g && (string.equals("-Infinity") || string.equals("Infinity") || string.equals("NaN"))) {
            throw new java.lang.IllegalArgumentException("Numeric values must be finite, but was ".concat(java.lang.String.valueOf(number)));
        }
        l();
        this.c.append((java.lang.CharSequence) string);
        return this;
    }

    @Override // java.io.Flushable
    public final void flush() throws java.io.IOException {
        if (this.e == 0) {
            throw new java.lang.IllegalStateException("JsonWriter is closed.");
        }
        this.c.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws java.io.IOException {
        this.c.close();
        int i = this.e;
        if (i > 1 || (i == 1 && this.d[i - 1] != 7)) {
            throw new java.io.IOException("Incomplete document");
        }
        this.e = 0;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0034  */
    private void c(java.lang.String str) throws java.io.IOException {
        java.lang.String str2;
        java.lang.String[] strArr = this.h ? b : f1688a;
        this.c.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if (cCharAt < 128) {
                str2 = strArr[cCharAt];
                if (str2 != null) {
                    if (i < i2) {
                        this.c.write(str, i, i2 - i);
                    }
                    this.c.write(str2);
                    i = i2 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                    this.c.write(str, i, i2 - i);
                }
                this.c.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            this.c.write(str, i, length - i);
        }
        this.c.write(34);
    }

    private void k() throws java.io.IOException {
        int i = i();
        if (i == 5) {
            this.c.write(44);
        } else if (i != 3) {
            throw new java.lang.IllegalStateException("Nesting problem.");
        }
        b(4);
    }

    private void l() throws java.io.IOException {
        int i = i();
        if (i == 1) {
            b(2);
            return;
        }
        if (i == 2) {
            this.c.append(',');
            return;
        }
        if (i != 4) {
            if (i != 6) {
                if (i == 7) {
                    if (!this.g) {
                        throw new java.lang.IllegalStateException("JSON must have only one top-level value.");
                    }
                } else {
                    throw new java.lang.IllegalStateException("Nesting problem.");
                }
            }
            b(7);
            return;
        }
        this.c.append((java.lang.CharSequence) this.f);
        b(5);
    }
}
