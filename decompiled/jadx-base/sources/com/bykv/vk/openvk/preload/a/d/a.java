package com.bykv.vk.openvk.preload.a.d;

/* JADX INFO: compiled from: JsonReader.java */
/* JADX INFO: loaded from: classes3.dex */
public class a implements java.io.Closeable {
    private final java.io.Reader b;
    private long i;
    private int j;
    private java.lang.String k;
    private int[] l;
    private java.lang.String[] n;
    private int[] o;
    private boolean c = false;
    private final char[] d = new char[1024];
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f1686a = 0;
    private int m = 0 + 1;

    public a(java.io.Reader reader) {
        int[] iArr = new int[32];
        this.l = iArr;
        iArr[0] = 6;
        this.n = new java.lang.String[32];
        this.o = new int[32];
        if (reader == null) {
            throw new java.lang.NullPointerException("in == null");
        }
        this.b = reader;
    }

    public final void a(boolean z) {
        this.c = z;
    }

    public final boolean q() {
        return this.c;
    }

    public void a() throws java.io.IOException {
        int iR = this.f1686a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 3) {
            a(1);
            this.o[this.m - 1] = 0;
            this.f1686a = 0;
            return;
        }
        throw new java.lang.IllegalStateException("Expected BEGIN_ARRAY but was " + f() + s());
    }

    public void b() throws java.io.IOException {
        int iR = this.f1686a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 4) {
            int i = this.m - 1;
            this.m = i;
            int[] iArr = this.o;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f1686a = 0;
            return;
        }
        throw new java.lang.IllegalStateException("Expected END_ARRAY but was " + f() + s());
    }

    public void c() throws java.io.IOException {
        int iR = this.f1686a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 1) {
            a(3);
            this.f1686a = 0;
            return;
        }
        throw new java.lang.IllegalStateException("Expected BEGIN_OBJECT but was " + f() + s());
    }

    public void d() throws java.io.IOException {
        int iR = this.f1686a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 2) {
            int i = this.m - 1;
            this.m = i;
            this.n[i] = null;
            int[] iArr = this.o;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
            this.f1686a = 0;
            return;
        }
        throw new java.lang.IllegalStateException("Expected END_OBJECT but was " + f() + s());
    }

    public boolean e() throws java.io.IOException {
        int iR = this.f1686a;
        if (iR == 0) {
            iR = r();
        }
        return (iR == 2 || iR == 4) ? false : true;
    }

    public com.bykv.vk.openvk.preload.a.d.b f() throws java.io.IOException {
        int iR = this.f1686a;
        if (iR == 0) {
            iR = r();
        }
        switch (iR) {
            case 1:
                return com.bykv.vk.openvk.preload.a.d.b.BEGIN_OBJECT;
            case 2:
                return com.bykv.vk.openvk.preload.a.d.b.END_OBJECT;
            case 3:
                return com.bykv.vk.openvk.preload.a.d.b.BEGIN_ARRAY;
            case 4:
                return com.bykv.vk.openvk.preload.a.d.b.END_ARRAY;
            case 5:
            case 6:
                return com.bykv.vk.openvk.preload.a.d.b.BOOLEAN;
            case 7:
                return com.bykv.vk.openvk.preload.a.d.b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return com.bykv.vk.openvk.preload.a.d.b.STRING;
            case 12:
            case 13:
            case 14:
                return com.bykv.vk.openvk.preload.a.d.b.NAME;
            case 15:
            case 16:
                return com.bykv.vk.openvk.preload.a.d.b.NUMBER;
            case 17:
                return com.bykv.vk.openvk.preload.a.d.b.END_DOCUMENT;
            default:
                throw new java.lang.AssertionError();
        }
    }

    final int r() throws java.io.IOException {
        int iB;
        int[] iArr = this.l;
        int i = this.m;
        int i2 = iArr[i - 1];
        if (i2 == 1) {
            iArr[i - 1] = 2;
        } else if (i2 == 2) {
            int iB2 = b(true);
            if (iB2 != 44) {
                if (iB2 != 59) {
                    if (iB2 == 93) {
                        this.f1686a = 4;
                        return 4;
                    }
                    throw b("Unterminated array");
                }
                v();
            }
        } else {
            if (i2 == 3 || i2 == 5) {
                iArr[i - 1] = 4;
                if (i2 == 5 && (iB = b(true)) != 44) {
                    if (iB != 59) {
                        if (iB == 125) {
                            this.f1686a = 2;
                            return 2;
                        }
                        throw b("Unterminated object");
                    }
                    v();
                }
                int iB3 = b(true);
                if (iB3 == 34) {
                    this.f1686a = 13;
                    return 13;
                }
                if (iB3 == 39) {
                    v();
                    this.f1686a = 12;
                    return 12;
                }
                if (iB3 == 125) {
                    if (i2 != 5) {
                        this.f1686a = 2;
                        return 2;
                    }
                    throw b("Expected name");
                }
                v();
                this.e--;
                if (a((char) iB3)) {
                    this.f1686a = 14;
                    return 14;
                }
                throw b("Expected name");
            }
            if (i2 == 4) {
                iArr[i - 1] = 5;
                int iB4 = b(true);
                if (iB4 != 58) {
                    if (iB4 == 61) {
                        v();
                        if (this.e < this.f || b(1)) {
                            char[] cArr = this.d;
                            int i3 = this.e;
                            if (cArr[i3] == '>') {
                                this.e = i3 + 1;
                            }
                        }
                    } else {
                        throw b("Expected ':'");
                    }
                }
            } else if (i2 == 6) {
                if (this.c) {
                    y();
                }
                this.l[this.m - 1] = 7;
            } else if (i2 == 7) {
                if (b(false) == -1) {
                    this.f1686a = 17;
                    return 17;
                }
                v();
                this.e--;
            } else if (i2 == 8) {
                throw new java.lang.IllegalStateException("JsonReader is closed");
            }
        }
        int iB5 = b(true);
        if (iB5 == 34) {
            this.f1686a = 9;
            return 9;
        }
        if (iB5 == 39) {
            v();
            this.f1686a = 8;
            return 8;
        }
        if (iB5 != 44 && iB5 != 59) {
            if (iB5 == 91) {
                this.f1686a = 3;
                return 3;
            }
            if (iB5 != 93) {
                if (iB5 == 123) {
                    this.f1686a = 1;
                    return 1;
                }
                this.e--;
                int iO = o();
                if (iO != 0) {
                    return iO;
                }
                int iT = t();
                if (iT != 0) {
                    return iT;
                }
                if (!a(this.d[this.e])) {
                    throw b("Expected value");
                }
                v();
                this.f1686a = 10;
                return 10;
            }
            if (i2 == 1) {
                this.f1686a = 4;
                return 4;
            }
        }
        if (i2 == 1 || i2 == 2) {
            v();
            this.e--;
            this.f1686a = 7;
            return 7;
        }
        throw b("Unexpected value");
    }

    private int o() throws java.io.IOException {
        java.lang.String str;
        java.lang.String str2;
        int i;
        char c = this.d[this.e];
        if (c == 't' || c == 'T') {
            str = com.json.mediationsdk.metadata.a.g;
            str2 = "TRUE";
            i = 5;
        } else if (c == 'f' || c == 'F') {
            str = "false";
            str2 = "FALSE";
            i = 6;
        } else {
            if (c != 'n' && c != 'N') {
                return 0;
            }
            str = "null";
            str2 = "NULL";
            i = 7;
        }
        int length = str.length();
        for (int i2 = 1; i2 < length; i2++) {
            if (this.e + i2 >= this.f && !b(i2 + 1)) {
                return 0;
            }
            char c2 = this.d[this.e + i2];
            if (c2 != str.charAt(i2) && c2 != str2.charAt(i2)) {
                return 0;
            }
        }
        if ((this.e + length < this.f || b(length + 1)) && a(this.d[this.e + length])) {
            return 0;
        }
        this.e += length;
        this.f1686a = i;
        return i;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x00f5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:13:0x002f  */
    /* JADX WARN: Code duplicated, block: B:89:0x00de  */
    /* JADX WARN: Code duplicated, block: B:91:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:96:0x00ea  */
    private int t() throws java.io.IOException {
        char c;
        char c2;
        char[] cArr = this.d;
        int i = this.e;
        int i2 = this.f;
        int i3 = 0;
        int i4 = 0;
        char c3 = 0;
        boolean z = false;
        boolean z2 = true;
        long j = 0;
        while (true) {
            if (i + i4 == i2) {
                if (i4 != 1024) {
                    if (!b(i4 + 1)) {
                        break;
                    }
                    i = this.e;
                    i2 = this.f;
                    c = cArr[i + i4];
                    if (c != '+') {
                        if (c != 'E') {
                            i3 = 0;
                            if (c3 == 2) {
                            }
                            c3 = 5;
                        } else {
                            i3 = 0;
                            if (c3 == 2) {
                            }
                            c3 = 5;
                        }
                        i4++;
                    } else {
                        c2 = 6;
                        i3 = 0;
                        if (c3 != 5) {
                            return 0;
                        }
                    }
                    c3 = c2;
                    i4++;
                } else {
                    return i3;
                }
            } else {
                c = cArr[i + i4];
                if (c != '+') {
                    if (c != 'E' || c == 'e') {
                        i3 = 0;
                        if (c3 == 2 && c3 != 4) {
                            return 0;
                        }
                        c3 = 5;
                    } else if (c != '-') {
                        c2 = 3;
                        if (c == '.') {
                            i3 = 0;
                            if (c3 != 2) {
                                return 0;
                            }
                        } else {
                            if (c < '0' || c > '9') {
                                if (!a(c)) {
                                    break;
                                }
                                return 0;
                            }
                            if (c3 == 1 || c3 == 0) {
                                j = -(c - '0');
                                c3 = 2;
                            } else if (c3 == 2) {
                                if (j == 0) {
                                    return 0;
                                }
                                long j2 = (10 * j) - ((long) (c - '0'));
                                z2 &= j > okio.internal.Buffer.OVERFLOW_ZONE || (j == okio.internal.Buffer.OVERFLOW_ZONE && j2 < j);
                                j = j2;
                            } else if (c3 == 3) {
                                i3 = 0;
                                c3 = 4;
                            } else if (c3 == 5 || c3 == 6) {
                                i3 = 0;
                                c3 = 7;
                            }
                            i3 = 0;
                        }
                    } else {
                        c2 = 6;
                        i3 = 0;
                        if (c3 == 0) {
                            c3 = 1;
                            z = true;
                        } else if (c3 != 5) {
                            return 0;
                        }
                    }
                    i4++;
                } else {
                    c2 = 6;
                    i3 = 0;
                    if (c3 != 5) {
                        return 0;
                    }
                }
                c3 = c2;
                i4++;
            }
        }
        if (c3 == 2 && z2 && ((j != Long.MIN_VALUE || z) && (j != 0 || !z))) {
            if (!z) {
                j = -j;
            }
            this.i = j;
            this.e += i4;
            this.f1686a = 15;
            return 15;
        }
        if (c3 != 2 && c3 != 4 && c3 != 7) {
            return 0;
        }
        this.j = i4;
        this.f1686a = 16;
        return 16;
    }

    private boolean a(char c) throws java.io.IOException {
        if (c == '\t' || c == '\n' || c == '\f' || c == '\r' || c == ' ') {
            return false;
        }
        if (c != '#') {
            if (c == ',') {
                return false;
            }
            if (c != '/' && c != '=') {
                if (c == '{' || c == '}' || c == ':') {
                    return false;
                }
                if (c != ';') {
                    switch (c) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        v();
        return false;
    }

    public java.lang.String g() throws java.io.IOException {
        java.lang.String strB;
        int iR = this.f1686a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 14) {
            strB = u();
        } else if (iR == 12) {
            strB = b('\'');
        } else if (iR == 13) {
            strB = b(kotlin.text.Typography.quote);
        } else {
            throw new java.lang.IllegalStateException("Expected a name but was " + f() + s());
        }
        this.f1686a = 0;
        this.n[this.m - 1] = strB;
        return strB;
    }

    public java.lang.String h() throws java.io.IOException {
        java.lang.String str;
        int iR = this.f1686a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 10) {
            str = u();
        } else if (iR == 8) {
            str = b('\'');
        } else if (iR == 9) {
            str = b(kotlin.text.Typography.quote);
        } else if (iR == 11) {
            str = this.k;
            this.k = null;
        } else if (iR == 15) {
            str = java.lang.Long.toString(this.i);
        } else if (iR == 16) {
            str = new java.lang.String(this.d, this.e, this.j);
            this.e += this.j;
        } else {
            throw new java.lang.IllegalStateException("Expected a string but was " + f() + s());
        }
        this.f1686a = 0;
        int[] iArr = this.o;
        int i = this.m - 1;
        iArr[i] = iArr[i] + 1;
        return str;
    }

    public boolean i() throws java.io.IOException {
        int iR = this.f1686a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 5) {
            this.f1686a = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return true;
        }
        if (iR == 6) {
            this.f1686a = 0;
            int[] iArr2 = this.o;
            int i2 = this.m - 1;
            iArr2[i2] = iArr2[i2] + 1;
            return false;
        }
        throw new java.lang.IllegalStateException("Expected a boolean but was " + f() + s());
    }

    public void j() throws java.io.IOException {
        int iR = this.f1686a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 7) {
            this.f1686a = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return;
        }
        throw new java.lang.IllegalStateException("Expected null but was " + f() + s());
    }

    public double k() throws java.io.IOException {
        int iR = this.f1686a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 15) {
            this.f1686a = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iR == 16) {
            this.k = new java.lang.String(this.d, this.e, this.j);
            this.e += this.j;
        } else if (iR == 8 || iR == 9) {
            this.k = b(iR == 8 ? '\'' : kotlin.text.Typography.quote);
        } else if (iR == 10) {
            this.k = u();
        } else if (iR != 11) {
            throw new java.lang.IllegalStateException("Expected a double but was " + f() + s());
        }
        this.f1686a = 11;
        double d = java.lang.Double.parseDouble(this.k);
        if (!this.c && (java.lang.Double.isNaN(d) || java.lang.Double.isInfinite(d))) {
            throw new com.bykv.vk.openvk.preload.a.d.d("JSON forbids NaN and infinities: " + d + s());
        }
        this.k = null;
        this.f1686a = 0;
        int[] iArr2 = this.o;
        int i2 = this.m - 1;
        iArr2[i2] = iArr2[i2] + 1;
        return d;
    }

    public long l() throws java.io.IOException {
        int iR = this.f1686a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 15) {
            this.f1686a = 0;
            int[] iArr = this.o;
            int i = this.m - 1;
            iArr[i] = iArr[i] + 1;
            return this.i;
        }
        if (iR == 16) {
            this.k = new java.lang.String(this.d, this.e, this.j);
            this.e += this.j;
        } else if (iR == 8 || iR == 9 || iR == 10) {
            if (iR == 10) {
                this.k = u();
            } else {
                this.k = b(iR == 8 ? '\'' : kotlin.text.Typography.quote);
            }
            try {
                long j = java.lang.Long.parseLong(this.k);
                this.f1686a = 0;
                int[] iArr2 = this.o;
                int i2 = this.m - 1;
                iArr2[i2] = iArr2[i2] + 1;
                return j;
            } catch (java.lang.NumberFormatException unused) {
            }
        } else {
            throw new java.lang.IllegalStateException("Expected a long but was " + f() + s());
        }
        this.f1686a = 11;
        double d = java.lang.Double.parseDouble(this.k);
        long j2 = (long) d;
        if (j2 != d) {
            throw new java.lang.NumberFormatException("Expected a long but was " + this.k + s());
        }
        this.k = null;
        this.f1686a = 0;
        int[] iArr3 = this.o;
        int i3 = this.m - 1;
        iArr3[i3] = iArr3[i3] + 1;
        return j2;
    }

    private java.lang.String b(char c) throws java.io.IOException {
        char[] cArr = this.d;
        java.lang.StringBuilder sb = null;
        while (true) {
            int i = this.e;
            int i2 = this.f;
            int i3 = i;
            while (true) {
                if (i3 < i2) {
                    int i4 = i3 + 1;
                    char c2 = cArr[i3];
                    if (c2 == c) {
                        this.e = i4;
                        int i5 = (i4 - i) - 1;
                        if (sb == null) {
                            return new java.lang.String(cArr, i, i5);
                        }
                        sb.append(cArr, i, i5);
                        return sb.toString();
                    }
                    if (c2 == '\\') {
                        this.e = i4;
                        int i6 = (i4 - i) - 1;
                        if (sb == null) {
                            sb = new java.lang.StringBuilder(java.lang.Math.max((i6 + 1) << 1, 16));
                        }
                        sb.append(cArr, i, i6);
                        sb.append(x());
                        break;
                    }
                    if (c2 == '\n') {
                        this.g++;
                        this.h = i4;
                    }
                    i3 = i4;
                } else {
                    if (sb == null) {
                        sb = new java.lang.StringBuilder(java.lang.Math.max((i3 - i) << 1, 16));
                    }
                    sb.append(cArr, i, i3 - i);
                    this.e = i3;
                    if (b(1)) {
                        break;
                    }
                    throw b("Unterminated string");
                }
            }
        }
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:32:0x0044. Please report as an issue. */
    private java.lang.String u() throws java.io.IOException {
        java.lang.StringBuilder sb = null;
        int i = 0;
        while (true) {
            int i2 = 0;
            while (true) {
                int i3 = this.e;
                if (i3 + i2 < this.f) {
                    char c = this.d[i3 + i2];
                    if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                        if (c != '#') {
                            if (c != ',') {
                                if (c != '/' && c != '=') {
                                    if (c != '{' && c != '}' && c != ':') {
                                        if (c != ';') {
                                            switch (c) {
                                                case '[':
                                                case ']':
                                                    break;
                                                case '\\':
                                                    break;
                                                default:
                                                    i2++;
                                                    break;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        v();
                    }
                    i = i2;
                } else if (i2 < 1024) {
                    if (!b(i2 + 1)) {
                        i = i2;
                    }
                } else {
                    if (sb == null) {
                        sb = new java.lang.StringBuilder(java.lang.Math.max(i2, 16));
                    }
                    sb.append(this.d, this.e, i2);
                    this.e += i2;
                    if (!b(1)) {
                    }
                }
                java.lang.String str = sb == null ? new java.lang.String(this.d, this.e, i) : sb.append(this.d, this.e, i).toString();
                this.e += i;
                return str;
            }
        }
    }

    private void c(char c) throws java.io.IOException {
        char[] cArr = this.d;
        while (true) {
            int i = this.e;
            int i2 = this.f;
            while (true) {
                if (i < i2) {
                    int i3 = i + 1;
                    char c2 = cArr[i];
                    if (c2 == c) {
                        this.e = i3;
                        return;
                    }
                    if (c2 == '\\') {
                        this.e = i3;
                        x();
                        break;
                    } else {
                        if (c2 == '\n') {
                            this.g++;
                            this.h = i3;
                        }
                        i = i3;
                    }
                } else {
                    this.e = i;
                    if (!b(1)) {
                        throw b("Unterminated string");
                    }
                    break;
                }
            }
        }
    }

    public int m() throws java.io.IOException {
        int iR = this.f1686a;
        if (iR == 0) {
            iR = r();
        }
        if (iR == 15) {
            long j = this.i;
            int i = (int) j;
            if (j != i) {
                throw new java.lang.NumberFormatException("Expected an int but was " + this.i + s());
            }
            this.f1686a = 0;
            int[] iArr = this.o;
            int i2 = this.m - 1;
            iArr[i2] = iArr[i2] + 1;
            return i;
        }
        if (iR == 16) {
            this.k = new java.lang.String(this.d, this.e, this.j);
            this.e += this.j;
        } else if (iR == 8 || iR == 9 || iR == 10) {
            if (iR == 10) {
                this.k = u();
            } else {
                this.k = b(iR == 8 ? '\'' : kotlin.text.Typography.quote);
            }
            try {
                int i3 = java.lang.Integer.parseInt(this.k);
                this.f1686a = 0;
                int[] iArr2 = this.o;
                int i4 = this.m - 1;
                iArr2[i4] = iArr2[i4] + 1;
                return i3;
            } catch (java.lang.NumberFormatException unused) {
            }
        } else {
            throw new java.lang.IllegalStateException("Expected an int but was " + f() + s());
        }
        this.f1686a = 11;
        double d = java.lang.Double.parseDouble(this.k);
        int i5 = (int) d;
        if (i5 != d) {
            throw new java.lang.NumberFormatException("Expected an int but was " + this.k + s());
        }
        this.k = null;
        this.f1686a = 0;
        int[] iArr3 = this.o;
        int i6 = this.m - 1;
        iArr3[i6] = iArr3[i6] + 1;
        return i5;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws java.io.IOException {
        this.f1686a = 0;
        this.l[0] = 8;
        this.m = 1;
        this.b.close();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:61:0x009d. Please report as an issue. */
    public void n() throws java.io.IOException {
        int i = 0;
        do {
            int iR = this.f1686a;
            if (iR == 0) {
                iR = r();
            }
            if (iR == 3) {
                a(1);
            } else {
                if (iR == 1) {
                    a(3);
                } else if (iR == 4 || iR == 2) {
                    this.m--;
                    i--;
                } else if (iR == 14 || iR == 10) {
                    while (true) {
                        int i2 = 0;
                        while (true) {
                            int i3 = this.e;
                            if (i3 + i2 < this.f) {
                                char c = this.d[i3 + i2];
                                if (c != '\t' && c != '\n' && c != '\f' && c != '\r' && c != ' ') {
                                    if (c != '#') {
                                        if (c != ',') {
                                            if (c != '/' && c != '=') {
                                                if (c != '{' && c != '}' && c != ':') {
                                                    if (c != ';') {
                                                        switch (c) {
                                                            case '[':
                                                            case ']':
                                                                break;
                                                            case '\\':
                                                                break;
                                                            default:
                                                                i2++;
                                                                break;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    v();
                                }
                                this.e += i2;
                            } else {
                                this.e = i3 + i2;
                                if (!b(1)) {
                                }
                            }
                        }
                    }
                } else if (iR == 8 || iR == 12) {
                    c('\'');
                } else if (iR == 9 || iR == 13) {
                    c(kotlin.text.Typography.quote);
                } else if (iR == 16) {
                    this.e += this.j;
                }
                this.f1686a = 0;
            }
            i++;
            this.f1686a = 0;
        } while (i != 0);
        int[] iArr = this.o;
        int i4 = this.m;
        int i5 = i4 - 1;
        iArr[i5] = iArr[i5] + 1;
        this.n[i4 - 1] = "null";
    }

    private void a(int i) {
        int i2 = this.m;
        int[] iArr = this.l;
        if (i2 == iArr.length) {
            int i3 = i2 << 1;
            this.l = java.util.Arrays.copyOf(iArr, i3);
            this.o = java.util.Arrays.copyOf(this.o, i3);
            this.n = (java.lang.String[]) java.util.Arrays.copyOf(this.n, i3);
        }
        int[] iArr2 = this.l;
        int i4 = this.m;
        this.m = i4 + 1;
        iArr2[i4] = i;
    }

    private boolean b(int i) throws java.io.IOException {
        int i2;
        int i3;
        char[] cArr = this.d;
        int i4 = this.h;
        int i5 = this.e;
        this.h = i4 - i5;
        int i6 = this.f;
        if (i6 != i5) {
            int i7 = i6 - i5;
            this.f = i7;
            java.lang.System.arraycopy(cArr, i5, cArr, 0, i7);
        } else {
            this.f = 0;
        }
        this.e = 0;
        do {
            java.io.Reader reader = this.b;
            int i8 = this.f;
            int i9 = reader.read(cArr, i8, 1024 - i8);
            if (i9 == -1) {
                return false;
            }
            i2 = this.f + i9;
            this.f = i2;
            if (this.g == 0 && (i3 = this.h) == 0 && i2 > 0 && cArr[0] == 65279) {
                this.e++;
                this.h = i3 + 1;
                i++;
            }
        } while (i2 < i);
        return true;
    }

    private int b(boolean z) throws java.io.IOException {
        char[] cArr = this.d;
        int i = this.e;
        int i2 = this.f;
        while (true) {
            if (i == i2) {
                this.e = i;
                if (!b(1)) {
                    if (z) {
                        throw new java.io.EOFException("End of input" + s());
                    }
                    return -1;
                }
                i = this.e;
                i2 = this.f;
            }
            int i3 = i + 1;
            char c = cArr[i];
            if (c == '\n') {
                this.g++;
                this.h = i3;
            } else if (c != ' ' && c != '\r' && c != '\t') {
                if (c == '/') {
                    this.e = i3;
                    if (i3 == i2) {
                        this.e = i3 - 1;
                        boolean zB = b(2);
                        this.e++;
                        if (!zB) {
                            return c;
                        }
                    }
                    v();
                    int i4 = this.e;
                    char c2 = cArr[i4];
                    if (c2 == '*') {
                        this.e = i4 + 1;
                        if (!a("*/")) {
                            throw b("Unterminated comment");
                        }
                        i = this.e + 2;
                        i2 = this.f;
                    } else {
                        if (c2 != '/') {
                            return c;
                        }
                        this.e = i4 + 1;
                        w();
                        i = this.e;
                        i2 = this.f;
                    }
                } else if (c == '#') {
                    this.e = i3;
                    v();
                    w();
                    i = this.e;
                    i2 = this.f;
                } else {
                    this.e = i3;
                    return c;
                }
            }
            i = i3;
        }
    }

    private void v() throws java.io.IOException {
        if (!this.c) {
            throw b("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void w() throws java.io.IOException {
        char c;
        do {
            if (this.e >= this.f && !b(1)) {
                return;
            }
            char[] cArr = this.d;
            int i = this.e;
            int i2 = i + 1;
            this.e = i2;
            c = cArr[i];
            if (c == '\n') {
                this.g++;
                this.h = i2;
                return;
            }
        } while (c != '\r');
    }

    private boolean a(java.lang.String str) throws java.io.IOException {
        int length = str.length();
        while (true) {
            if (this.e + length > this.f && !b(length)) {
                return false;
            }
            char[] cArr = this.d;
            int i = this.e;
            if (cArr[i] != '\n') {
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.d[this.e + i2] == str.charAt(i2)) {
                    }
                }
                return true;
            }
            this.g++;
            this.h = i + 1;
            this.e++;
        }
    }

    public java.lang.String toString() {
        return getClass().getSimpleName() + s();
    }

    final java.lang.String s() {
        return " at line " + (this.g + 1) + " column " + ((this.e - this.h) + 1) + " path " + p();
    }

    public java.lang.String p() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("$");
        int i = this.m;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.l[i2];
            if (i3 == 1 || i3 == 2) {
                sb.append('[').append(this.o[i2]).append(']');
            } else if (i3 == 3 || i3 == 4 || i3 == 5) {
                sb.append('.');
                java.lang.String str = this.n[i2];
                if (str != null) {
                    sb.append(str);
                }
            }
        }
        return sb.toString();
    }

    private char x() throws java.io.IOException {
        int i;
        int i2;
        if (this.e == this.f && !b(1)) {
            throw b("Unterminated escape sequence");
        }
        char[] cArr = this.d;
        int i3 = this.e;
        int i4 = i3 + 1;
        this.e = i4;
        char c = cArr[i3];
        if (c == '\n') {
            this.g++;
            this.h = i4;
        } else if (c != '\"' && c != '\'' && c != '/' && c != '\\') {
            if (c == 'b') {
                return '\b';
            }
            if (c == 'f') {
                return '\f';
            }
            if (c == 'n') {
                return '\n';
            }
            if (c == 'r') {
                return '\r';
            }
            if (c == 't') {
                return '\t';
            }
            if (c == 'u') {
                if (i4 + 4 > this.f && !b(4)) {
                    throw b("Unterminated escape sequence");
                }
                int i5 = this.e;
                int i6 = i5 + 4;
                char c2 = 0;
                while (i5 < i6) {
                    char c3 = this.d[i5];
                    char c4 = (char) (c2 << 4);
                    if (c3 < '0' || c3 > '9') {
                        if (c3 >= 'a' && c3 <= 'f') {
                            i = c3 - 'a';
                        } else {
                            if (c3 < 'A' || c3 > 'F') {
                                throw new java.lang.NumberFormatException("\\u".concat(new java.lang.String(this.d, this.e, 4)));
                            }
                            i = c3 - 'A';
                        }
                        i2 = i + 10;
                    } else {
                        i2 = c3 - '0';
                    }
                    c2 = (char) (c4 + i2);
                    i5++;
                }
                this.e += 4;
                return c2;
            }
            throw b("Invalid escape sequence");
        }
        return c;
    }

    private java.io.IOException b(java.lang.String str) throws java.io.IOException {
        throw new com.bykv.vk.openvk.preload.a.d.d(str + s());
    }

    private void y() throws java.io.IOException {
        b(true);
        int i = this.e - 1;
        this.e = i;
        if (i + 5 <= this.f || b(5)) {
            char[] cArr = this.d;
            if (cArr[i] == ')' && cArr[i + 1] == ']' && cArr[i + 2] == '}' && cArr[i + 3] == '\'' && cArr[i + 4] == '\n') {
                this.e += 5;
            }
        }
    }

    static {
        com.bykv.vk.openvk.preload.a.b.e.f1667a = new com.bykv.vk.openvk.preload.a.b.e() { // from class: com.bykv.vk.openvk.preload.a.d.a.1
            @Override // com.bykv.vk.openvk.preload.a.b.e
            public final void a(com.bykv.vk.openvk.preload.a.d.a aVar) throws java.io.IOException {
                if (aVar instanceof com.bykv.vk.openvk.preload.a.b.a.e) {
                    ((com.bykv.vk.openvk.preload.a.b.a.e) aVar).o();
                    return;
                }
                int iR = aVar.f1686a;
                if (iR == 0) {
                    iR = aVar.r();
                }
                if (iR == 13) {
                    aVar.f1686a = 9;
                } else if (iR == 12) {
                    aVar.f1686a = 8;
                } else {
                    if (iR == 14) {
                        aVar.f1686a = 10;
                        return;
                    }
                    throw new java.lang.IllegalStateException("Expected a name but was " + aVar.f() + aVar.s());
                }
            }
        };
    }
}
