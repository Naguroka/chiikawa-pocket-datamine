package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class y2 extends com.applovin.impl.a3 {
    private final int h;
    private final int i;
    private final int j;
    private final long k;
    private java.util.List n;
    private java.util.List o;
    private int p;
    private int q;
    private boolean r;
    private boolean s;
    private byte t;
    private byte u;
    private boolean w;
    private long x;
    private static final int[] y = {11, 1, 3, 12, 14, 5, 7, 9};
    private static final int[] z = {0, 4, 8, 12, 16, 20, 24, 28};
    private static final int[] A = {-1, -16711936, -16776961, -16711681, -65536, androidx.core.view.InputDeviceCompat.SOURCE_ANY, -65281};
    private static final int[] B = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, 250, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, 209, 241, 9632};
    private static final int[] C = {org.objectweb.asm.Opcodes.FRETURN, org.objectweb.asm.Opcodes.ARETURN, 189, org.objectweb.asm.Opcodes.ATHROW, 8482, org.objectweb.asm.Opcodes.IF_ICMPGE, org.objectweb.asm.Opcodes.IF_ICMPGT, 9834, 224, 32, 232, 226, 234, 238, 244, 251};
    private static final int[] D = {org.objectweb.asm.Opcodes.INSTANCEOF, com.ironsource.g3.c.b.INSTANCE_LOAD, 211, 218, 220, 252, 8216, org.objectweb.asm.Opcodes.IF_ICMPLT, 42, 39, 8212, org.objectweb.asm.Opcodes.RET, 8480, 8226, 8220, 8221, 192, org.objectweb.asm.Opcodes.MONITORENTER, org.objectweb.asm.Opcodes.IFNONNULL, 200, com.ironsource.g3.c.b.INSTANCE_LOAD_SUCCESS, com.ironsource.g3.c.b.INSTANCE_LOAD_FAILED, 235, com.ironsource.g3.c.b.INSTANCE_NOT_FOUND_IN_LOAD, 207, 239, 212, 217, 249, 219, org.objectweb.asm.Opcodes.LOOKUPSWITCH, org.objectweb.asm.Opcodes.NEW};
    private static final int[] E = {org.objectweb.asm.Opcodes.MONITOREXIT, 227, com.ironsource.g3.c.b.INSTANCE_AUCTION_SUCCESS, 204, 236, 210, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, org.objectweb.asm.Opcodes.IF_ACMPEQ, org.objectweb.asm.Opcodes.IF_ICMPLE, 9474, org.objectweb.asm.Opcodes.MULTIANEWARRAY, 229, 216, 248, 9484, 9488, 9492, 9496};
    private static final boolean[] F = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final com.applovin.impl.ah g = new com.applovin.impl.ah();
    private final java.util.ArrayList l = new java.util.ArrayList();
    private com.applovin.impl.y2.a m = new com.applovin.impl.y2.a(0, 4);
    private int v = 0;

    private static int b(byte b) {
        return (b >> 3) & 1;
    }

    private static boolean c(byte b, byte b2) {
        return (b & 246) == 18 && (b2 & 224) == 32;
    }

    private static boolean d(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 32;
    }

    private static boolean e(byte b, byte b2) {
        return (b & 246) == 20 && (b2 & 240) == 32;
    }

    private static boolean f(byte b, byte b2) {
        return (b & 240) == 16 && (b2 & 192) == 64;
    }

    private static boolean g(byte b, byte b2) {
        return (b & 247) == 17 && (b2 & 240) == 48;
    }

    private static boolean h(byte b) {
        return (b & 224) == 0;
    }

    private static boolean h(byte b, byte b2) {
        return (b & 247) == 23 && b2 >= 33 && b2 <= 35;
    }

    private static boolean i(byte b) {
        return (b & 240) == 16;
    }

    private static boolean j(byte b) {
        return (b & 247) == 20;
    }

    private static boolean k(byte b) {
        return 1 <= b && b <= 15;
    }

    @Override // com.applovin.impl.a3, com.applovin.impl.l5
    public void a() {
    }

    @Override // com.applovin.impl.a3
    /* JADX INFO: renamed from: f */
    public /* bridge */ /* synthetic */ com.applovin.impl.rl d() {
        return super.d();
    }

    public y2(java.lang.String str, int i, long j) {
        this.k = j > 0 ? j * 1000 : -9223372036854775807L;
        this.h = androidx.media3.common.MimeTypes.APPLICATION_MP4CEA608.equals(str) ? 2 : 3;
        if (i == 1) {
            this.j = 0;
            this.i = 0;
        } else if (i == 2) {
            this.j = 1;
            this.i = 0;
        } else if (i == 3) {
            this.j = 0;
            this.i = 1;
        } else if (i != 4) {
            com.applovin.impl.oc.d("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
            this.j = 0;
            this.i = 0;
        } else {
            this.j = 1;
            this.i = 1;
        }
        a(0);
        m();
        this.w = true;
        this.x = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.applovin.impl.a3, com.applovin.impl.l5
    public void b() {
        super.b();
        this.n = null;
        this.o = null;
        a(0);
        b(4);
        m();
        this.r = false;
        this.s = false;
        this.t = (byte) 0;
        this.u = (byte) 0;
        this.v = 0;
        this.w = true;
        this.x = androidx.media3.common.C.TIME_UNSET;
    }

    @Override // com.applovin.impl.a3, com.applovin.impl.l5
    /* JADX INFO: renamed from: g */
    public com.applovin.impl.sl c() {
        com.applovin.impl.sl slVarH;
        com.applovin.impl.sl slVarC = super.c();
        if (slVarC != null) {
            return slVarC;
        }
        if (!n() || (slVarH = h()) == null) {
            return null;
        }
        this.n = java.util.Collections.emptyList();
        this.x = androidx.media3.common.C.TIME_UNSET;
        slVarH.a(i(), e(), Long.MAX_VALUE);
        return slVarH;
    }

    @Override // com.applovin.impl.a3
    protected boolean j() {
        return this.n != this.o;
    }

    @Override // com.applovin.impl.a3
    protected com.applovin.impl.nl e() {
        java.util.List list = this.n;
        this.o = list;
        return new com.applovin.impl.b3((java.util.List) com.applovin.impl.b1.a(list));
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0064  */
    @Override // com.applovin.impl.a3
    protected void a(com.applovin.impl.rl rlVar) {
        boolean z2;
        java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) com.applovin.impl.b1.a(rlVar.c);
        this.g.a(byteBuffer.array(), byteBuffer.limit());
        boolean z3 = false;
        while (true) {
            int iA = this.g.a();
            int i = this.h;
            if (iA < i) {
                break;
            }
            byte bW = i == 2 ? (byte) -4 : (byte) this.g.w();
            int iW = this.g.w();
            int iW2 = this.g.w();
            if ((bW & 2) == 0 && (bW & 1) == this.i) {
                byte b = (byte) (iW & 127);
                byte b2 = (byte) (iW2 & 127);
                if (b != 0 || b2 != 0) {
                    boolean z4 = this.r;
                    if ((bW & 4) == 4) {
                        boolean[] zArr = F;
                        if (zArr[iW] && zArr[iW2]) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                    } else {
                        z2 = false;
                    }
                    this.r = z2;
                    if (!a(z2, b, b2)) {
                        if (this.r) {
                            i(b, b2);
                            if (this.w && l(b)) {
                                if (h(b)) {
                                    if (g(b, b2)) {
                                        this.m.a(e(b2));
                                    } else if (c(b, b2)) {
                                        this.m.a();
                                        this.m.a(a(b, b2));
                                    } else if (d(b, b2)) {
                                        f(b2);
                                    } else if (f(b, b2)) {
                                        b(b, b2);
                                    } else if (!h(b, b2)) {
                                        if (e(b, b2)) {
                                            g(b2);
                                        }
                                    } else {
                                        this.m.f = b2 - 32;
                                    }
                                } else {
                                    this.m.a(a(b));
                                    if ((b2 & 224) != 0) {
                                        this.m.a(a(b2));
                                    }
                                }
                                z3 = true;
                            }
                        } else if (z4) {
                            m();
                            z3 = true;
                        }
                    }
                }
            }
        }
        if (z3) {
            int i2 = this.p;
            if (i2 == 1 || i2 == 3) {
                this.n = l();
                this.x = i();
            }
        }
    }

    private void f(byte b) {
        this.m.a(' ');
        this.m.a((b >> 1) & 7, (b & 1) == 1);
    }

    private java.util.List l() {
        int size = this.l.size();
        java.util.ArrayList arrayList = new java.util.ArrayList(size);
        int iMin = 2;
        for (int i = 0; i < size; i++) {
            com.applovin.impl.a5 a5VarA = ((com.applovin.impl.y2.a) this.l.get(i)).a(Integer.MIN_VALUE);
            arrayList.add(a5VarA);
            if (a5VarA != null) {
                iMin = java.lang.Math.min(iMin, a5VarA.j);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            com.applovin.impl.a5 a5Var = (com.applovin.impl.a5) arrayList.get(i2);
            if (a5Var != null) {
                if (a5Var.j != iMin) {
                    a5Var = (com.applovin.impl.a5) com.applovin.impl.b1.a(((com.applovin.impl.y2.a) this.l.get(i2)).a(iMin));
                }
                arrayList2.add(a5Var);
            }
        }
        return arrayList2;
    }

    private void m() {
        this.m.b(this.p);
        this.l.clear();
        this.l.add(this.m);
    }

    private void i(byte b, byte b2) {
        if (k(b)) {
            this.w = false;
            return;
        }
        if (j(b)) {
            if (b2 != 32 && b2 != 47) {
                switch (b2) {
                    case 37:
                    case 38:
                    case 39:
                        break;
                    default:
                        switch (b2) {
                            case 42:
                            case 43:
                                this.w = false;
                                break;
                        }
                }
            }
            this.w = true;
        }
    }

    private static char d(byte b) {
        return (char) E[b & 31];
    }

    private static char c(byte b) {
        return (char) D[b & 31];
    }

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final java.util.List f1527a = new java.util.ArrayList();
        private final java.util.List b = new java.util.ArrayList();
        private final java.lang.StringBuilder c = new java.lang.StringBuilder();
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;

        public a(int i, int i2) {
            b(i);
            this.h = i2;
        }

        public void d() {
            this.b.add(b());
            this.c.setLength(0);
            this.f1527a.clear();
            int iMin = java.lang.Math.min(this.h, this.d);
            while (this.b.size() >= iMin) {
                this.b.remove(0);
            }
        }

        /* JADX INFO: renamed from: com.applovin.impl.y2$a$a, reason: collision with other inner class name */
        private static class C0060a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final int f1528a;
            public final boolean b;
            public int c;

            public C0060a(int i, boolean z, int i2) {
                this.f1528a = i;
                this.b = z;
                this.c = i2;
            }
        }

        public void b(int i) {
            this.g = i;
            this.f1527a.clear();
            this.b.clear();
            this.c.setLength(0);
            this.d = 15;
            this.e = 0;
            this.f = 0;
        }

        public boolean c() {
            return this.f1527a.isEmpty() && this.b.isEmpty() && this.c.length() == 0;
        }

        public void d(int i) {
            this.h = i;
        }

        public void a(char c) {
            if (this.c.length() < 32) {
                this.c.append(c);
            }
        }

        public void c(int i) {
            this.g = i;
        }

        private static void b(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new android.text.style.UnderlineSpan(), i, i2, 33);
        }

        private android.text.SpannableString b() {
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder(this.c);
            int length = spannableStringBuilder.length();
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = 0;
            int i6 = 0;
            boolean z = false;
            while (i5 < this.f1527a.size()) {
                com.applovin.impl.y2.a.C0060a c0060a = (com.applovin.impl.y2.a.C0060a) this.f1527a.get(i5);
                boolean z2 = c0060a.b;
                int i7 = c0060a.f1528a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i4 = com.applovin.impl.y2.A[i7];
                    }
                    z = z3;
                }
                int i8 = c0060a.c;
                i5++;
                if (i8 != (i5 < this.f1527a.size() ? ((com.applovin.impl.y2.a.C0060a) this.f1527a.get(i5)).c : length)) {
                    if (i != -1 && !z2) {
                        b(spannableStringBuilder, i, i8);
                        i = -1;
                    } else if (i == -1 && z2) {
                        i = i8;
                    }
                    if (i2 != -1 && !z) {
                        a(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z) {
                        i2 = i8;
                    }
                    if (i4 != i3) {
                        a(spannableStringBuilder, i6, i8, i3);
                        i3 = i4;
                        i6 = i8;
                    }
                }
            }
            if (i != -1 && i != length) {
                b(spannableStringBuilder, i, length);
            }
            if (i2 != -1 && i2 != length) {
                a(spannableStringBuilder, i2, length);
            }
            if (i6 != length) {
                a(spannableStringBuilder, i6, length, i3);
            }
            return new android.text.SpannableString(spannableStringBuilder);
        }

        public void a() {
            int length = this.c.length();
            if (length > 0) {
                this.c.delete(length - 1, length);
                for (int size = this.f1527a.size() - 1; size >= 0; size--) {
                    com.applovin.impl.y2.a.C0060a c0060a = (com.applovin.impl.y2.a.C0060a) this.f1527a.get(size);
                    int i = c0060a.c;
                    if (i != length) {
                        return;
                    }
                    c0060a.c = i - 1;
                }
            }
        }

        public com.applovin.impl.a5 a(int i) {
            float f;
            int i2 = this.e + this.f;
            int i3 = 32 - i2;
            android.text.SpannableStringBuilder spannableStringBuilder = new android.text.SpannableStringBuilder();
            for (int i4 = 0; i4 < this.b.size(); i4++) {
                spannableStringBuilder.append(com.applovin.impl.xp.a((java.lang.CharSequence) this.b.get(i4), i3));
                spannableStringBuilder.append('\n');
            }
            spannableStringBuilder.append(com.applovin.impl.xp.a(b(), i3));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i3 - spannableStringBuilder.length();
            int i5 = i2 - length;
            if (i == Integer.MIN_VALUE) {
                if (this.g != 2 || (java.lang.Math.abs(i5) >= 3 && length >= 0)) {
                    i = (this.g != 2 || i5 <= 0) ? 0 : 2;
                } else {
                    i = 1;
                }
            }
            if (i != 1) {
                if (i == 2) {
                    i2 = 32 - length;
                }
                f = ((i2 / 32.0f) * 0.8f) + 0.1f;
            } else {
                f = 0.5f;
            }
            int i6 = this.d;
            if (i6 > 7) {
                i6 -= 17;
            } else if (this.g == 1) {
                i6 -= this.h - 1;
            }
            return new com.applovin.impl.a5.b().a(spannableStringBuilder).b(android.text.Layout.Alignment.ALIGN_NORMAL).a(i6, 1).b(f).b(i).a();
        }

        private static void a(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 == -1) {
                return;
            }
            spannableStringBuilder.setSpan(new android.text.style.ForegroundColorSpan(i3), i, i2, 33);
        }

        private static void a(android.text.SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new android.text.style.StyleSpan(2), i, i2, 33);
        }

        public void a(int i, boolean z) {
            this.f1527a.add(new com.applovin.impl.y2.a.C0060a(i, z, this.c.length()));
        }
    }

    private void b(byte b, byte b2) {
        int i = y[b & 7];
        if ((b2 & 32) != 0) {
            i++;
        }
        if (i != this.m.d) {
            if (this.p != 1 && !this.m.c()) {
                com.applovin.impl.y2.a aVar = new com.applovin.impl.y2.a(this.p, this.q);
                this.m = aVar;
                this.l.add(aVar);
            }
            this.m.d = i;
        }
        boolean z2 = (b2 & 16) == 16;
        boolean z3 = (b2 & 1) == 1;
        int i2 = (b2 >> 1) & 7;
        this.m.a(z2 ? 8 : i2, z3);
        if (z2) {
            this.m.e = z[i2];
        }
    }

    private void g(byte b) {
        if (b == 32) {
            a(2);
            return;
        }
        if (b != 41) {
            switch (b) {
                case 37:
                    a(1);
                    b(2);
                    break;
                case 38:
                    a(1);
                    b(3);
                    break;
                case 39:
                    a(1);
                    b(4);
                    break;
                default:
                    int i = this.p;
                    if (i != 0) {
                        if (b != 33) {
                            switch (b) {
                                case 44:
                                    this.n = java.util.Collections.emptyList();
                                    int i2 = this.p;
                                    if (i2 == 1 || i2 == 3) {
                                        m();
                                    }
                                    break;
                                case 45:
                                    if (i == 1 && !this.m.c()) {
                                        this.m.d();
                                        break;
                                    }
                                    break;
                                case 46:
                                    m();
                                    break;
                                case 47:
                                    this.n = l();
                                    m();
                                    break;
                            }
                        } else {
                            this.m.a();
                            break;
                        }
                    }
                    break;
            }
            return;
        }
        a(3);
    }

    @Override // com.applovin.impl.a3
    /* JADX INFO: renamed from: b */
    public /* bridge */ /* synthetic */ void a(com.applovin.impl.rl rlVar) {
        super.a(rlVar);
    }

    private boolean n() {
        return (this.k == androidx.media3.common.C.TIME_UNSET || this.x == androidx.media3.common.C.TIME_UNSET || i() - this.x < this.k) ? false : true;
    }

    private static char e(byte b) {
        return (char) C[b & 15];
    }

    private boolean l(byte b) {
        if (h(b)) {
            this.v = b(b);
        }
        return this.v == this.j;
    }

    private static char a(byte b) {
        return (char) B[(b & 127) - 32];
    }

    private void b(int i) {
        this.q = i;
        this.m.d(i);
    }

    private static char a(byte b, byte b2) {
        if ((b & 1) == 0) {
            return c(b2);
        }
        return d(b2);
    }

    private boolean a(boolean z2, byte b, byte b2) {
        if (z2 && i(b)) {
            if (this.s && this.t == b && this.u == b2) {
                this.s = false;
                return true;
            }
            this.s = true;
            this.t = b;
            this.u = b2;
        } else {
            this.s = false;
        }
        return false;
    }

    private void a(int i) {
        int i2 = this.p;
        if (i2 == i) {
            return;
        }
        this.p = i;
        if (i == 3) {
            for (int i3 = 0; i3 < this.l.size(); i3++) {
                ((com.applovin.impl.y2.a) this.l.get(i3)).c(i);
            }
            return;
        }
        m();
        if (i2 == 3 || i == 1 || i == 0) {
            this.n = java.util.Collections.emptyList();
        }
    }

    @Override // com.applovin.impl.a3, com.applovin.impl.ol
    public /* bridge */ /* synthetic */ void a(long j) {
        super.a(j);
    }
}
