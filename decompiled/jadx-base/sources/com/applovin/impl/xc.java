package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class xc implements com.applovin.impl.j8 {
    public static final com.applovin.impl.n8 b0 = new com.applovin.impl.n8() { // from class: com.applovin.impl.xc$$ExternalSyntheticLambda0
        @Override // com.applovin.impl.n8
        public final com.applovin.impl.j8[] a() {
            return com.applovin.impl.xc.g();
        }
    };
    private static final byte[] c0 = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    private static final byte[] d0 = com.applovin.impl.xp.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");
    private static final byte[] e0 = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    private static final java.util.UUID f0 = new java.util.UUID(72057594037932032L, -9223371306706625679L);
    private static final java.util.Map g0;
    private long A;
    private long B;
    private com.applovin.impl.qc C;
    private com.applovin.impl.qc D;
    private boolean E;
    private boolean F;
    private int G;
    private long H;
    private long I;
    private int J;
    private int K;
    private int[] L;
    private int M;
    private int N;
    private int O;
    private int P;
    private boolean Q;
    private int R;
    private int S;
    private int T;
    private boolean U;
    private boolean V;
    private boolean W;
    private int X;
    private byte Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.o7 f1500a;
    private com.applovin.impl.l8 a0;
    private final com.applovin.impl.zp b;
    private final android.util.SparseArray c;
    private final boolean d;
    private final com.applovin.impl.ah e;
    private final com.applovin.impl.ah f;
    private final com.applovin.impl.ah g;
    private final com.applovin.impl.ah h;
    private final com.applovin.impl.ah i;
    private final com.applovin.impl.ah j;
    private final com.applovin.impl.ah k;
    private final com.applovin.impl.ah l;
    private final com.applovin.impl.ah m;
    private final com.applovin.impl.ah n;
    private java.nio.ByteBuffer o;
    private long p;
    private long q;
    private long r;
    private long s;
    private long t;
    private com.applovin.impl.xc.c u;
    private boolean v;
    private int w;
    private long x;
    private boolean y;
    private long z;

    static {
        java.util.HashMap map = new java.util.HashMap();
        map.put("htc_video_rotA-000", 0);
        map.put("htc_video_rotA-090", 90);
        map.put("htc_video_rotA-180", java.lang.Integer.valueOf(org.objectweb.asm.Opcodes.GETFIELD));
        map.put("htc_video_rotA-270", 270);
        g0 = java.util.Collections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ com.applovin.impl.j8[] g() {
        return new com.applovin.impl.j8[]{new com.applovin.impl.xc()};
    }

    @Override // com.applovin.impl.j8
    public final void a() {
    }

    protected int e(int i) {
        switch (i) {
            case org.objectweb.asm.Opcodes.LXOR /* 131 */:
            case 136:
            case 155:
            case org.objectweb.asm.Opcodes.IF_ICMPEQ /* 159 */:
            case org.objectweb.asm.Opcodes.ARETURN /* 176 */:
            case org.objectweb.asm.Opcodes.PUTSTATIC /* 179 */:
            case org.objectweb.asm.Opcodes.INVOKEDYNAMIC /* 186 */:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case com.google.firebase.FirebaseError.ERROR_WEAK_PASSWORD /* 17026 */:
            case 21358:
            case 2274716:
                return 3;
            case org.objectweb.asm.Opcodes.IF_ICMPNE /* 160 */:
            case org.objectweb.asm.Opcodes.IF_ACMPNE /* 166 */:
            case org.objectweb.asm.Opcodes.FRETURN /* 174 */:
            case org.objectweb.asm.Opcodes.INVOKESPECIAL /* 183 */:
            case org.objectweb.asm.Opcodes.NEW /* 187 */:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case org.objectweb.asm.Opcodes.IF_ICMPLT /* 161 */:
            case org.objectweb.asm.Opcodes.IF_ICMPGT /* 163 */:
            case org.objectweb.asm.Opcodes.IF_ACMPEQ /* 165 */:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case org.objectweb.asm.Opcodes.PUTFIELD /* 181 */:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    protected boolean f(int i) {
        return i == 357149030 || i == 524531317 || i == 475249515 || i == 374648427;
    }

    public xc() {
        this(0);
    }

    protected void c(int i) throws com.applovin.impl.ch {
        e();
        if (i == 160) {
            if (this.G != 2) {
                return;
            }
            int i2 = 0;
            for (int i3 = 0; i3 < this.K; i3++) {
                i2 += this.L[i3];
            }
            com.applovin.impl.xc.c cVar = (com.applovin.impl.xc.c) this.c.get(this.M);
            cVar.a();
            for (int i4 = 0; i4 < this.K; i4++) {
                long j = ((long) ((cVar.e * i4) / 1000)) + this.H;
                int i5 = this.O;
                if (i4 == 0 && !this.Q) {
                    i5 |= 1;
                }
                int i6 = this.L[i4];
                i2 -= i6;
                a(cVar, j, i5, i6, i2);
            }
            this.G = 0;
            return;
        }
        if (i == 174) {
            com.applovin.impl.xc.c cVar2 = (com.applovin.impl.xc.c) com.applovin.impl.b1.b(this.u);
            java.lang.String str = cVar2.b;
            if (str != null) {
                if (a(str)) {
                    cVar2.a(this.a0, cVar2.c);
                    this.c.put(cVar2.c, cVar2);
                }
                this.u = null;
                return;
            }
            throw com.applovin.impl.ch.a("CodecId is missing in TrackEntry element", null);
        }
        if (i == 19899) {
            int i7 = this.w;
            if (i7 != -1) {
                long j2 = this.x;
                if (j2 != -1) {
                    if (i7 == 475249515) {
                        this.z = j2;
                        return;
                    }
                    return;
                }
            }
            throw com.applovin.impl.ch.a("Mandatory element SeekID or SeekPosition not found", null);
        }
        if (i == 25152) {
            b(i);
            com.applovin.impl.xc.c cVar3 = this.u;
            if (cVar3.h) {
                if (cVar3.j != null) {
                    cVar3.l = new com.applovin.impl.x6(new com.applovin.impl.x6.b(com.applovin.impl.t2.f1347a, "video/webm", this.u.j.b));
                    return;
                }
                throw com.applovin.impl.ch.a("Encrypted Track found but ContentEncKeyID was not found", null);
            }
            return;
        }
        if (i == 28032) {
            b(i);
            com.applovin.impl.xc.c cVar4 = this.u;
            if (cVar4.h && cVar4.i != null) {
                throw com.applovin.impl.ch.a("Combining encryption and compression is not supported", null);
            }
            return;
        }
        if (i == 357149030) {
            if (this.r == androidx.media3.common.C.TIME_UNSET) {
                this.r = 1000000L;
            }
            long j3 = this.s;
            if (j3 != androidx.media3.common.C.TIME_UNSET) {
                this.t = a(j3);
                return;
            }
            return;
        }
        if (i == 374648427) {
            if (this.c.size() != 0) {
                this.a0.c();
                return;
            }
            throw com.applovin.impl.ch.a("No valid tracks were found", null);
        }
        if (i != 475249515) {
            return;
        }
        if (!this.v) {
            this.a0.a(a(this.C, this.D));
            this.v = true;
        }
        this.C = null;
        this.D = null;
    }

    public xc(int i) {
        this(new com.applovin.impl.z5(), i);
    }

    xc(com.applovin.impl.o7 o7Var, int i) {
        this.q = -1L;
        this.r = androidx.media3.common.C.TIME_UNSET;
        this.s = androidx.media3.common.C.TIME_UNSET;
        this.t = androidx.media3.common.C.TIME_UNSET;
        this.z = -1L;
        this.A = -1L;
        this.B = androidx.media3.common.C.TIME_UNSET;
        this.f1500a = o7Var;
        o7Var.a(new com.applovin.impl.xc.b());
        this.d = (i & 1) == 0;
        this.b = new com.applovin.impl.zp();
        this.c = new android.util.SparseArray();
        this.g = new com.applovin.impl.ah(4);
        this.h = new com.applovin.impl.ah(java.nio.ByteBuffer.allocate(4).putInt(-1).array());
        this.i = new com.applovin.impl.ah(4);
        this.e = new com.applovin.impl.ah(com.applovin.impl.yf.f1540a);
        this.f = new com.applovin.impl.ah(4);
        this.j = new com.applovin.impl.ah();
        this.k = new com.applovin.impl.ah();
        this.l = new com.applovin.impl.ah(8);
        this.m = new com.applovin.impl.ah();
        this.n = new com.applovin.impl.ah();
        this.L = new int[1];
    }

    private void b(int i) throws com.applovin.impl.ch {
        if (this.u == null) {
            throw com.applovin.impl.ch.a("Element " + i + " must be in a TrackEntry", null);
        }
    }

    private void a(int i) throws com.applovin.impl.ch {
        if (this.C == null || this.D == null) {
            throw com.applovin.impl.ch.a("Element " + i + " must be in a Cues", null);
        }
    }

    private com.applovin.impl.xc.c d(int i) throws com.applovin.impl.ch {
        b(i);
        return this.u;
    }

    private int f() {
        int i = this.S;
        h();
        return i;
    }

    private void h() {
        this.R = 0;
        this.S = 0;
        this.T = 0;
        this.U = false;
        this.V = false;
        this.W = false;
        this.X = 0;
        this.Y = (byte) 0;
        this.Z = false;
        this.j.d(0);
    }

    private void e() {
        com.applovin.impl.b1.b(this.a0);
    }

    private final class b implements com.applovin.impl.n7 {
        private b() {
        }

        @Override // com.applovin.impl.n7
        public int b(int i) {
            return com.applovin.impl.xc.this.e(i);
        }

        @Override // com.applovin.impl.n7
        public boolean c(int i) {
            return com.applovin.impl.xc.this.f(i);
        }

        @Override // com.applovin.impl.n7
        public void a(int i, int i2, com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch {
            com.applovin.impl.xc.this.a(i, i2, k8Var);
        }

        @Override // com.applovin.impl.n7
        public void a(int i) throws com.applovin.impl.ch {
            com.applovin.impl.xc.this.c(i);
        }

        @Override // com.applovin.impl.n7
        public void a(int i, double d) {
            com.applovin.impl.xc.this.a(i, d);
        }

        @Override // com.applovin.impl.n7
        public void a(int i, long j) throws com.applovin.impl.ch {
            com.applovin.impl.xc.this.a(i, j);
        }

        @Override // com.applovin.impl.n7
        public void a(int i, long j, long j2) throws com.applovin.impl.ch {
            com.applovin.impl.xc.this.a(i, j, j2);
        }

        @Override // com.applovin.impl.n7
        public void a(int i, java.lang.String str) throws com.applovin.impl.ch {
            com.applovin.impl.xc.this.a(i, str);
        }
    }

    private static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f1503a = new byte[10];
        private boolean b;
        private int c;
        private long d;
        private int e;
        private int f;
        private int g;

        public void a(com.applovin.impl.xc.c cVar) {
            if (this.c > 0) {
                cVar.X.a(this.d, this.e, this.f, this.g, cVar.j);
                this.c = 0;
            }
        }

        public void a() {
            this.b = false;
            this.c = 0;
        }

        public void a(com.applovin.impl.xc.c cVar, long j, int i, int i2, int i3) {
            if (this.b) {
                int i4 = this.c;
                int i5 = i4 + 1;
                this.c = i5;
                if (i4 == 0) {
                    this.d = j;
                    this.e = i;
                    this.f = 0;
                }
                this.f += i2;
                this.g = i3;
                if (i5 >= 16) {
                    a(cVar);
                }
            }
        }

        public void a(com.applovin.impl.k8 k8Var) {
            if (this.b) {
                return;
            }
            k8Var.c(this.f1503a, 0, 10);
            k8Var.b();
            if (com.applovin.impl.k.b(this.f1503a) == 0) {
                return;
            }
            this.b = true;
        }
    }

    private static final class c {
        public int A;
        public int B;
        public int C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public float M;
        public byte[] N;
        public int O;
        public int P;
        public int Q;
        public long R;
        public long S;
        public com.applovin.impl.xc.d T;
        public boolean U;
        public boolean V;
        private java.lang.String W;
        public com.applovin.impl.qo X;
        public int Y;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public java.lang.String f1502a;
        public java.lang.String b;
        public int c;
        public int d;
        public int e;
        public int f;
        private int g;
        public boolean h;
        public byte[] i;
        public com.applovin.impl.qo.a j;
        public byte[] k;
        public com.applovin.impl.x6 l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public int r;
        public float s;
        public float t;
        public float u;
        public byte[] v;
        public int w;
        public boolean x;
        public int y;
        public int z;

        private c() {
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = -1;
            this.q = 0;
            this.r = -1;
            this.s = 0.0f;
            this.t = 0.0f;
            this.u = 0.0f;
            this.v = null;
            this.w = -1;
            this.x = false;
            this.y = -1;
            this.z = -1;
            this.A = -1;
            this.B = 1000;
            this.C = 200;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.M = -1.0f;
            this.O = 1;
            this.P = -1;
            this.Q = 8000;
            this.R = 0L;
            this.S = 0L;
            this.V = true;
            this.W = "eng";
        }

        public void c() {
            com.applovin.impl.xc.d dVar = this.T;
            if (dVar != null) {
                dVar.a(this);
            }
        }

        public void d() {
            com.applovin.impl.xc.d dVar = this.T;
            if (dVar != null) {
                dVar.a();
            }
        }

        private byte[] b() {
            if (this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f || this.M == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            java.nio.ByteBuffer byteBufferOrder = java.nio.ByteBuffer.wrap(bArr).order(java.nio.ByteOrder.LITTLE_ENDIAN);
            byteBufferOrder.put((byte) 0);
            byteBufferOrder.putShort((short) ((this.D * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.E * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.F * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.G * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.H * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.I * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.J * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) ((this.K * 50000.0f) + 0.5f));
            byteBufferOrder.putShort((short) (this.L + 0.5f));
            byteBufferOrder.putShort((short) (this.M + 0.5f));
            byteBufferOrder.putShort((short) this.B);
            byteBufferOrder.putShort((short) this.C);
            return bArr;
        }

        private static boolean b(com.applovin.impl.ah ahVar) throws com.applovin.impl.ch {
            try {
                int iR = ahVar.r();
                if (iR == 1) {
                    return true;
                }
                if (iR != 65534) {
                    return false;
                }
                ahVar.f(24);
                return ahVar.s() == com.applovin.impl.xc.f0.getMostSignificantBits() && ahVar.s() == com.applovin.impl.xc.f0.getLeastSignificantBits();
            } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                throw com.applovin.impl.ch.a("Error parsing MS/ACM codec private", null);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            com.applovin.impl.b1.a(this.X);
        }

        private byte[] a(java.lang.String str) throws com.applovin.impl.ch {
            byte[] bArr = this.k;
            if (bArr != null) {
                return bArr;
            }
            throw com.applovin.impl.ch.a("Missing CodecPrivate for codec " + str, null);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:198:0x0421  */
        /* JADX WARN: Code duplicated, block: B:203:0x0436  */
        /* JADX WARN: Code duplicated, block: B:204:0x0438  */
        /* JADX WARN: Code duplicated, block: B:207:0x0445  */
        /* JADX WARN: Code duplicated, block: B:208:0x0457  */
        /* JADX WARN: Code duplicated, block: B:210:0x045d  */
        /* JADX WARN: Code duplicated, block: B:212:0x0461  */
        /* JADX WARN: Code duplicated, block: B:214:0x0466  */
        /* JADX WARN: Code duplicated, block: B:217:0x046e  */
        /* JADX WARN: Code duplicated, block: B:219:0x0473  */
        /* JADX WARN: Code duplicated, block: B:222:0x0478  */
        /* JADX WARN: Code duplicated, block: B:225:0x0486  */
        /* JADX WARN: Code duplicated, block: B:228:0x048c  */
        /* JADX WARN: Code duplicated, block: B:231:0x049f  */
        /* JADX WARN: Code duplicated, block: B:236:0x04bf  */
        /* JADX WARN: Code duplicated, block: B:255:0x050b  */
        /* JADX WARN: Code duplicated, block: B:257:0x0531  */
        /* JADX WARN: Code duplicated, block: B:259:0x0537  */
        /* JADX WARN: Code duplicated, block: B:272:0x055d  */
        /* JADX WARN: Code duplicated, block: B:4:0x0018  */
        public void a(com.applovin.impl.l8 l8Var, int i) throws com.applovin.impl.ch {
            byte b;
            java.util.List listSingletonList;
            java.lang.String str;
            java.lang.String str2;
            int i2;
            java.lang.String str3;
            int i3;
            java.util.List list;
            java.lang.String str4;
            java.lang.String str5;
            java.lang.String str6;
            byte[] bArr;
            int i4;
            com.applovin.impl.e9.b bVar;
            int iIntValue;
            int i5;
            float f;
            int i6;
            int i7;
            int i8;
            com.applovin.impl.w6 w6VarA;
            java.lang.String str7 = this.b;
            str7.hashCode();
            str7.hashCode();
            int iD = 4;
            int i9 = 3;
            int i10 = 0;
            switch (str7) {
                case "V_MPEG4/ISO/AP":
                    b = 0;
                    break;
                case "V_MPEG4/ISO/SP":
                    b = 1;
                    break;
                case "A_MS/ACM":
                    b = 2;
                    break;
                case "A_TRUEHD":
                    b = 3;
                    break;
                case "A_VORBIS":
                    b = 4;
                    break;
                case "A_MPEG/L2":
                    b = 5;
                    break;
                case "A_MPEG/L3":
                    b = 6;
                    break;
                case "V_MS/VFW/FOURCC":
                    b = 7;
                    break;
                case "S_DVBSUB":
                    b = 8;
                    break;
                case "V_MPEG4/ISO/ASP":
                    b = 9;
                    break;
                case "V_MPEG4/ISO/AVC":
                    b = 10;
                    break;
                case "S_VOBSUB":
                    b = 11;
                    break;
                case "A_DTS/LOSSLESS":
                    b = 12;
                    break;
                case "A_AAC":
                    b = 13;
                    break;
                case "A_AC3":
                    b = 14;
                    break;
                case "A_DTS":
                    b = 15;
                    break;
                case "V_AV1":
                    b = 16;
                    break;
                case "V_VP8":
                    b = 17;
                    break;
                case "V_VP9":
                    b = 18;
                    break;
                case "S_HDMV/PGS":
                    b = 19;
                    break;
                case "V_THEORA":
                    b = 20;
                    break;
                case "A_DTS/EXPRESS":
                    b = 21;
                    break;
                case "A_PCM/FLOAT/IEEE":
                    b = 22;
                    break;
                case "A_PCM/INT/BIG":
                    b = 23;
                    break;
                case "A_PCM/INT/LIT":
                    b = 24;
                    break;
                case "S_TEXT/ASS":
                    b = 25;
                    break;
                case "V_MPEGH/ISO/HEVC":
                    b = 26;
                    break;
                case "S_TEXT/UTF8":
                    b = 27;
                    break;
                case "V_MPEG2":
                    b = 28;
                    break;
                case "A_EAC3":
                    b = 29;
                    break;
                case "A_FLAC":
                    b = 30;
                    break;
                case "A_OPUS":
                    b = 31;
                    break;
                default:
                    b = -1;
                    break;
            }
            java.lang.String str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
            java.lang.String str9 = androidx.media3.common.MimeTypes.AUDIO_RAW;
            switch (b) {
                case 0:
                case 1:
                case 9:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    byte[] bArr2 = this.k;
                    listSingletonList = bArr2 == null ? null : java.util.Collections.singletonList(bArr2);
                    str = androidx.media3.common.MimeTypes.VIDEO_MP4V;
                    iD = -1;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str10 = str5;
                    str3 = str6;
                    str2 = str10;
                    bArr = this.N;
                    if (bArr != null && (w6VarA = com.applovin.impl.w6.a(new com.applovin.impl.ah(bArr))) != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i11 = (z ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue || (i6 = this.p) == iIntValue) {
                            f = -1.0f;
                        } else {
                            f = (this.n * i5) / (this.m * i6);
                        }
                        com.applovin.impl.r3 r3Var = this.x ? new com.applovin.impl.r3(this.y, this.A, this.z, b()) : null;
                        if (this.f1502a != null && com.applovin.impl.xc.g0.containsKey(this.f1502a)) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0 || java.lang.Float.compare(this.s, 0.0f) != 0 || java.lang.Float.compare(this.t, 0.0f) != 0) {
                            i10 = iIntValue;
                        } else if (java.lang.Float.compare(this.u, 0.0f) != 0) {
                            if (java.lang.Float.compare(this.t, 90.0f) == 0) {
                                i10 = 90;
                            } else if (java.lang.Float.compare(this.t, -180.0f) == 0 || java.lang.Float.compare(this.t, 180.0f) == 0) {
                                i10 = org.objectweb.asm.Opcodes.GETFIELD;
                            } else if (java.lang.Float.compare(this.t, -90.0f) == 0) {
                                i10 = 270;
                            } else {
                                i10 = iIntValue;
                            }
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2) && !str8.equals(str2) && !androidx.media3.common.MimeTypes.APPLICATION_VOBSUB.equals(str2) && !androidx.media3.common.MimeTypes.APPLICATION_PGS.equals(str2) && !androidx.media3.common.MimeTypes.APPLICATION_DVBSUBS.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null && !com.applovin.impl.xc.g0.containsKey(this.f1502a)) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA = bVar.h(i).f(str2).i(i3).e(this.W).o(i11).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA = l8Var.a(this.c, i9);
                    this.X = qoVarA;
                    qoVarA.a(e9VarA);
                    return;
                case 2:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    if (b(new com.applovin.impl.ah(a(this.b)))) {
                        int iD2 = com.applovin.impl.xp.d(this.P);
                        if (iD2 == 0) {
                            com.applovin.impl.oc.d("MatroskaExtractor", "Unsupported PCM bit depth: " + this.P + ". Setting mimeType to audio/x-unknown");
                        } else {
                            iD = iD2;
                        }
                        listSingletonList = null;
                        str = str9;
                        str5 = str;
                        str6 = null;
                        i3 = -1;
                        java.lang.String str11 = str5;
                        str3 = str6;
                        str2 = str11;
                        bArr = this.N;
                        if (bArr != null) {
                            str3 = w6VarA.c;
                            str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                        }
                        boolean z2 = this.V;
                        if (this.U) {
                            i4 = 2;
                        } else {
                            i4 = 0;
                        }
                        int i12 = (z2 ? 1 : 0) | i4;
                        bVar = new com.applovin.impl.e9.b();
                        if (com.applovin.impl.hf.g(str2)) {
                            bVar.c(this.O).n(this.Q).j(iD);
                            i9 = 1;
                        } else if (com.applovin.impl.hf.i(str2)) {
                            if (this.q == 0) {
                                i7 = this.o;
                                iIntValue = -1;
                                if (i7 == -1) {
                                    i7 = this.m;
                                }
                                this.o = i7;
                                i8 = this.p;
                                if (i8 == -1) {
                                    i8 = this.n;
                                }
                                this.p = i8;
                            } else {
                                iIntValue = -1;
                            }
                            i5 = this.o;
                            if (i5 != iIntValue) {
                                f = -1.0f;
                            } else {
                                f = -1.0f;
                            }
                            if (this.x) {
                            }
                            if (this.f1502a != null) {
                                iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                            }
                            if (this.r == 0) {
                                i10 = iIntValue;
                            } else {
                                i10 = iIntValue;
                            }
                            bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                            i9 = 2;
                        } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                            throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                        }
                        if (this.f1502a != null) {
                            bVar.d(this.f1502a);
                        }
                        com.applovin.impl.e9 e9VarA2 = bVar.h(i).f(str2).i(i3).e(this.W).o(i12).a(listSingletonList).a(str3).a(this.l).a();
                        com.applovin.impl.qo qoVarA2 = l8Var.a(this.c, i9);
                        this.X = qoVarA2;
                        qoVarA2.a(e9VarA2);
                        return;
                    }
                    com.applovin.impl.oc.d("MatroskaExtractor", "Non-PCM MS/ACM is unsupported. Setting mimeType to audio/x-unknown");
                    str9 = androidx.media3.common.MimeTypes.AUDIO_UNKNOWN;
                    iD = -1;
                    listSingletonList = null;
                    str = str9;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str12 = str5;
                    str3 = str6;
                    str2 = str12;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z3 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i13 = (z3 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA3 = bVar.h(i).f(str2).i(i3).e(this.W).o(i13).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA3 = l8Var.a(this.c, i9);
                    this.X = qoVarA3;
                    qoVarA3.a(e9VarA3);
                    return;
                case 3:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    this.T = new com.applovin.impl.xc.d();
                    str9 = androidx.media3.common.MimeTypes.AUDIO_TRUEHD;
                    iD = -1;
                    listSingletonList = null;
                    str = str9;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str13 = str5;
                    str3 = str6;
                    str2 = str13;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z4 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i14 = (z4 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA4 = bVar.h(i).f(str2).i(i3).e(this.W).o(i14).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA4 = l8Var.a(this.c, i9);
                    this.X = qoVarA4;
                    qoVarA4.a(e9VarA4);
                    return;
                case 4:
                    listSingletonList = a(a(this.b));
                    str2 = androidx.media3.common.MimeTypes.AUDIO_VORBIS;
                    i2 = 8192;
                    i3 = i2;
                    str3 = null;
                    iD = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z5 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i15 = (z5 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA5 = bVar.h(i).f(str2).i(i3).e(this.W).o(i15).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA5 = l8Var.a(this.c, i9);
                    this.X = qoVarA5;
                    qoVarA5.a(e9VarA5);
                    return;
                case 5:
                    str2 = androidx.media3.common.MimeTypes.AUDIO_MPEG_L2;
                    listSingletonList = null;
                    str3 = null;
                    i3 = 4096;
                    iD = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z6 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i16 = (z6 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA6 = bVar.h(i).f(str2).i(i3).e(this.W).o(i16).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA6 = l8Var.a(this.c, i9);
                    this.X = qoVarA6;
                    qoVarA6.a(e9VarA6);
                    return;
                case 6:
                    str2 = androidx.media3.common.MimeTypes.AUDIO_MPEG;
                    listSingletonList = null;
                    str3 = null;
                    i3 = 4096;
                    iD = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z7 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i17 = (z7 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA7 = bVar.h(i).f(str2).i(i3).e(this.W).o(i17).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA7 = l8Var.a(this.c, i9);
                    this.X = qoVarA7;
                    qoVarA7.a(e9VarA7);
                    return;
                case 7:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    android.util.Pair pairA = a(new com.applovin.impl.ah(a(this.b)));
                    str = (java.lang.String) pairA.first;
                    listSingletonList = (java.util.List) pairA.second;
                    iD = -1;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str14 = str5;
                    str3 = str6;
                    str2 = str14;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z8 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i18 = (z8 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA8 = bVar.h(i).f(str2).i(i3).e(this.W).o(i18).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA8 = l8Var.a(this.c, i9);
                    this.X = qoVarA8;
                    qoVarA8.a(e9VarA8);
                    return;
                case 8:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    byte[] bArr3 = new byte[4];
                    java.lang.System.arraycopy(a(this.b), 0, bArr3, 0, 4);
                    listSingletonList = com.applovin.impl.db.a(bArr3);
                    str = androidx.media3.common.MimeTypes.APPLICATION_DVBSUBS;
                    iD = -1;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str15 = str5;
                    str3 = str6;
                    str2 = str15;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z9 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i19 = (z9 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA9 = bVar.h(i).f(str2).i(i3).e(this.W).o(i19).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA9 = l8Var.a(this.c, i9);
                    this.X = qoVarA9;
                    qoVarA9.a(e9VarA9);
                    return;
                case 10:
                    com.applovin.impl.w1 w1VarB = com.applovin.impl.w1.b(new com.applovin.impl.ah(a(this.b)));
                    list = w1VarB.f1445a;
                    this.Y = w1VarB.b;
                    str4 = w1VarB.f;
                    str5 = "video/avc";
                    iD = -1;
                    java.util.List list2 = list;
                    str6 = str4;
                    listSingletonList = list2;
                    i3 = -1;
                    java.lang.String str16 = str5;
                    str3 = str6;
                    str2 = str16;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z10 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i110 = (z10 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA10 = bVar.h(i).f(str2).i(i3).e(this.W).o(i110).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA10 = l8Var.a(this.c, i9);
                    this.X = qoVarA10;
                    qoVarA10.a(e9VarA10);
                    return;
                case 11:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    listSingletonList = com.applovin.impl.db.a(a(this.b));
                    str = androidx.media3.common.MimeTypes.APPLICATION_VOBSUB;
                    iD = -1;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str17 = str5;
                    str3 = str6;
                    str2 = str17;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z11 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i111 = (z11 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA11 = bVar.h(i).f(str2).i(i3).e(this.W).o(i111).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA11 = l8Var.a(this.c, i9);
                    this.X = qoVarA11;
                    qoVarA11.a(e9VarA11);
                    return;
                case 12:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    str9 = androidx.media3.common.MimeTypes.AUDIO_DTS_HD;
                    iD = -1;
                    listSingletonList = null;
                    str = str9;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str18 = str5;
                    str3 = str6;
                    str2 = str18;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z12 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i112 = (z12 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA12 = bVar.h(i).f(str2).i(i3).e(this.W).o(i112).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA12 = l8Var.a(this.c, i9);
                    this.X = qoVarA12;
                    qoVarA12.a(e9VarA12);
                    return;
                case 13:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    listSingletonList = java.util.Collections.singletonList(a(this.b));
                    com.applovin.impl.a.b bVarA = com.applovin.impl.a.a(this.k);
                    this.Q = bVarA.f574a;
                    this.O = bVarA.b;
                    str6 = bVarA.c;
                    str5 = androidx.media3.common.MimeTypes.AUDIO_AAC;
                    iD = -1;
                    i3 = -1;
                    java.lang.String str19 = str5;
                    str3 = str6;
                    str2 = str19;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z13 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i113 = (z13 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA13 = bVar.h(i).f(str2).i(i3).e(this.W).o(i113).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA13 = l8Var.a(this.c, i9);
                    this.X = qoVarA13;
                    qoVarA13.a(e9VarA13);
                    return;
                case 14:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    str9 = androidx.media3.common.MimeTypes.AUDIO_AC3;
                    iD = -1;
                    listSingletonList = null;
                    str = str9;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str110 = str5;
                    str3 = str6;
                    str2 = str110;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z14 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i114 = (z14 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA14 = bVar.h(i).f(str2).i(i3).e(this.W).o(i114).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA14 = l8Var.a(this.c, i9);
                    this.X = qoVarA14;
                    qoVarA14.a(e9VarA14);
                    return;
                case 15:
                case 21:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    str9 = androidx.media3.common.MimeTypes.AUDIO_DTS;
                    iD = -1;
                    listSingletonList = null;
                    str = str9;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str111 = str5;
                    str3 = str6;
                    str2 = str111;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z15 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i115 = (z15 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA15 = bVar.h(i).f(str2).i(i3).e(this.W).o(i115).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA15 = l8Var.a(this.c, i9);
                    this.X = qoVarA15;
                    qoVarA15.a(e9VarA15);
                    return;
                case 16:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    str9 = "video/av01";
                    iD = -1;
                    listSingletonList = null;
                    str = str9;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str112 = str5;
                    str3 = str6;
                    str2 = str112;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z16 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i116 = (z16 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA16 = bVar.h(i).f(str2).i(i3).e(this.W).o(i116).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA16 = l8Var.a(this.c, i9);
                    this.X = qoVarA16;
                    qoVarA16.a(e9VarA16);
                    return;
                case 17:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    str9 = androidx.media3.common.MimeTypes.VIDEO_VP8;
                    iD = -1;
                    listSingletonList = null;
                    str = str9;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str113 = str5;
                    str3 = str6;
                    str2 = str113;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z17 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i117 = (z17 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA17 = bVar.h(i).f(str2).i(i3).e(this.W).o(i117).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA17 = l8Var.a(this.c, i9);
                    this.X = qoVarA17;
                    qoVarA17.a(e9VarA17);
                    return;
                case 18:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    str9 = androidx.media3.common.MimeTypes.VIDEO_VP9;
                    iD = -1;
                    listSingletonList = null;
                    str = str9;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str114 = str5;
                    str3 = str6;
                    str2 = str114;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z18 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i118 = (z18 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA18 = bVar.h(i).f(str2).i(i3).e(this.W).o(i118).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA18 = l8Var.a(this.c, i9);
                    this.X = qoVarA18;
                    qoVarA18.a(e9VarA18);
                    return;
                case 19:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    str9 = androidx.media3.common.MimeTypes.APPLICATION_PGS;
                    iD = -1;
                    listSingletonList = null;
                    str = str9;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str115 = str5;
                    str3 = str6;
                    str2 = str115;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z19 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i119 = (z19 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA19 = bVar.h(i).f(str2).i(i3).e(this.W).o(i119).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA19 = l8Var.a(this.c, i9);
                    this.X = qoVarA19;
                    qoVarA19.a(e9VarA19);
                    return;
                case 20:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    str9 = androidx.media3.common.MimeTypes.VIDEO_UNKNOWN;
                    iD = -1;
                    listSingletonList = null;
                    str = str9;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str116 = str5;
                    str3 = str6;
                    str2 = str116;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z110 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1110 = (z110 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA110 = bVar.h(i).f(str2).i(i3).e(this.W).o(i1110).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA110 = l8Var.a(this.c, i9);
                    this.X = qoVarA110;
                    qoVarA110.a(e9VarA110);
                    return;
                case 22:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    if (this.P != 32) {
                        com.applovin.impl.oc.d("MatroskaExtractor", "Unsupported floating point PCM bit depth: " + this.P + ". Setting mimeType to audio/x-unknown");
                        str9 = androidx.media3.common.MimeTypes.AUDIO_UNKNOWN;
                        iD = -1;
                    }
                    listSingletonList = null;
                    str = str9;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str117 = str5;
                    str3 = str6;
                    str2 = str117;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z111 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1111 = (z111 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA111 = bVar.h(i).f(str2).i(i3).e(this.W).o(i1111).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA111 = l8Var.a(this.c, i9);
                    this.X = qoVarA111;
                    qoVarA111.a(e9VarA111);
                    return;
                case 23:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    int i20 = this.P;
                    if (i20 == 8) {
                        iD = 3;
                    } else if (i20 == 16) {
                        iD = 268435456;
                    } else {
                        com.applovin.impl.oc.d("MatroskaExtractor", "Unsupported big endian PCM bit depth: " + this.P + ". Setting mimeType to audio/x-unknown");
                        str9 = androidx.media3.common.MimeTypes.AUDIO_UNKNOWN;
                        iD = -1;
                    }
                    listSingletonList = null;
                    str = str9;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str118 = str5;
                    str3 = str6;
                    str2 = str118;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z112 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1112 = (z112 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA112 = bVar.h(i).f(str2).i(i3).e(this.W).o(i1112).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA112 = l8Var.a(this.c, i9);
                    this.X = qoVarA112;
                    qoVarA112.a(e9VarA112);
                    return;
                case 24:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    iD = com.applovin.impl.xp.d(this.P);
                    if (iD == 0) {
                        com.applovin.impl.oc.d("MatroskaExtractor", "Unsupported little endian PCM bit depth: " + this.P + ". Setting mimeType to audio/x-unknown");
                        str9 = androidx.media3.common.MimeTypes.AUDIO_UNKNOWN;
                        iD = -1;
                    }
                    listSingletonList = null;
                    str = str9;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str119 = str5;
                    str3 = str6;
                    str2 = str119;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z113 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1113 = (z113 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA113 = bVar.h(i).f(str2).i(i3).e(this.W).o(i1113).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA113 = l8Var.a(this.c, i9);
                    this.X = qoVarA113;
                    qoVarA113.a(e9VarA113);
                    return;
                case 25:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    listSingletonList = com.applovin.impl.db.a(com.applovin.impl.xc.d0, a(this.b));
                    str = str8;
                    iD = -1;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str1110 = str5;
                    str3 = str6;
                    str2 = str1110;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z114 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1114 = (z114 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA114 = bVar.h(i).f(str2).i(i3).e(this.W).o(i1114).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA114 = l8Var.a(this.c, i9);
                    this.X = qoVarA114;
                    qoVarA114.a(e9VarA114);
                    return;
                case 26:
                    com.applovin.impl.na naVarA = com.applovin.impl.na.a(new com.applovin.impl.ah(a(this.b)));
                    list = naVarA.f1088a;
                    this.Y = naVarA.b;
                    str4 = naVarA.c;
                    str5 = "video/hevc";
                    iD = -1;
                    java.util.List list3 = list;
                    str6 = str4;
                    listSingletonList = list3;
                    i3 = -1;
                    java.lang.String str1111 = str5;
                    str3 = str6;
                    str2 = str1111;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z115 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1115 = (z115 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA115 = bVar.h(i).f(str2).i(i3).e(this.W).o(i1115).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA115 = l8Var.a(this.c, i9);
                    this.X = qoVarA115;
                    qoVarA115.a(e9VarA115);
                    return;
                case 27:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    str9 = androidx.media3.common.MimeTypes.APPLICATION_SUBRIP;
                    iD = -1;
                    listSingletonList = null;
                    str = str9;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str1112 = str5;
                    str3 = str6;
                    str2 = str1112;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z116 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1116 = (z116 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA116 = bVar.h(i).f(str2).i(i3).e(this.W).o(i1116).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA116 = l8Var.a(this.c, i9);
                    this.X = qoVarA116;
                    qoVarA116.a(e9VarA116);
                    return;
                case 28:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    str9 = androidx.media3.common.MimeTypes.VIDEO_MPEG2;
                    iD = -1;
                    listSingletonList = null;
                    str = str9;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str1113 = str5;
                    str3 = str6;
                    str2 = str1113;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z117 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1117 = (z117 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA117 = bVar.h(i).f(str2).i(i3).e(this.W).o(i1117).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA117 = l8Var.a(this.c, i9);
                    this.X = qoVarA117;
                    qoVarA117.a(e9VarA117);
                    return;
                case 29:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    str9 = androidx.media3.common.MimeTypes.AUDIO_E_AC3;
                    iD = -1;
                    listSingletonList = null;
                    str = str9;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str1114 = str5;
                    str3 = str6;
                    str2 = str1114;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z118 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1118 = (z118 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA118 = bVar.h(i).f(str2).i(i3).e(this.W).o(i1118).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA118 = l8Var.a(this.c, i9);
                    this.X = qoVarA118;
                    qoVarA118.a(e9VarA118);
                    return;
                case 30:
                    str8 = androidx.media3.common.MimeTypes.TEXT_SSA;
                    listSingletonList = java.util.Collections.singletonList(a(this.b));
                    str = androidx.media3.common.MimeTypes.AUDIO_FLAC;
                    iD = -1;
                    str5 = str;
                    str6 = null;
                    i3 = -1;
                    java.lang.String str1115 = str5;
                    str3 = str6;
                    str2 = str1115;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z119 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i1119 = (z119 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA119 = bVar.h(i).f(str2).i(i3).e(this.W).o(i1119).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA119 = l8Var.a(this.c, i9);
                    this.X = qoVarA119;
                    qoVarA119.a(e9VarA119);
                    return;
                case 31:
                    listSingletonList = new java.util.ArrayList(3);
                    listSingletonList.add(a(this.b));
                    java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(8);
                    java.nio.ByteOrder byteOrder = java.nio.ByteOrder.LITTLE_ENDIAN;
                    listSingletonList.add(byteBufferAllocate.order(byteOrder).putLong(this.R).array());
                    listSingletonList.add(java.nio.ByteBuffer.allocate(8).order(byteOrder).putLong(this.S).array());
                    str2 = androidx.media3.common.MimeTypes.AUDIO_OPUS;
                    i2 = 5760;
                    i3 = i2;
                    str3 = null;
                    iD = -1;
                    bArr = this.N;
                    if (bArr != null) {
                        str3 = w6VarA.c;
                        str2 = androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION;
                    }
                    boolean z1110 = this.V;
                    if (this.U) {
                        i4 = 2;
                    } else {
                        i4 = 0;
                    }
                    int i11110 = (z1110 ? 1 : 0) | i4;
                    bVar = new com.applovin.impl.e9.b();
                    if (com.applovin.impl.hf.g(str2)) {
                        bVar.c(this.O).n(this.Q).j(iD);
                        i9 = 1;
                    } else if (com.applovin.impl.hf.i(str2)) {
                        if (this.q == 0) {
                            i7 = this.o;
                            iIntValue = -1;
                            if (i7 == -1) {
                                i7 = this.m;
                            }
                            this.o = i7;
                            i8 = this.p;
                            if (i8 == -1) {
                                i8 = this.n;
                            }
                            this.p = i8;
                        } else {
                            iIntValue = -1;
                        }
                        i5 = this.o;
                        if (i5 != iIntValue) {
                            f = -1.0f;
                        } else {
                            f = -1.0f;
                        }
                        if (this.x) {
                        }
                        if (this.f1502a != null) {
                            iIntValue = ((java.lang.Integer) com.applovin.impl.xc.g0.get(this.f1502a)).intValue();
                        }
                        if (this.r == 0) {
                            i10 = iIntValue;
                        } else {
                            i10 = iIntValue;
                        }
                        bVar.q(this.m).g(this.n).b(f).m(i10).a(this.v).p(this.w).a(r3Var);
                        i9 = 2;
                    } else if (!androidx.media3.common.MimeTypes.APPLICATION_SUBRIP.equals(str2)) {
                        throw com.applovin.impl.ch.a("Unexpected MIME type.", null);
                    }
                    if (this.f1502a != null) {
                        bVar.d(this.f1502a);
                    }
                    com.applovin.impl.e9 e9VarA1110 = bVar.h(i).f(str2).i(i3).e(this.W).o(i11110).a(listSingletonList).a(str3).a(this.l).a();
                    com.applovin.impl.qo qoVarA1110 = l8Var.a(this.c, i9);
                    this.X = qoVarA1110;
                    qoVarA1110.a(e9VarA1110);
                    return;
                default:
                    throw com.applovin.impl.ch.a("Unrecognized codec identifier.", null);
            }
        }

        private static android.util.Pair a(com.applovin.impl.ah ahVar) throws com.applovin.impl.ch {
            try {
                ahVar.g(16);
                long jP = ahVar.p();
                if (jP == 1482049860) {
                    return new android.util.Pair(androidx.media3.common.MimeTypes.VIDEO_DIVX, null);
                }
                if (jP == 859189832) {
                    return new android.util.Pair(androidx.media3.common.MimeTypes.VIDEO_H263, null);
                }
                if (jP == 826496599) {
                    byte[] bArrC = ahVar.c();
                    for (int iD = ahVar.d() + 20; iD < bArrC.length - 4; iD++) {
                        if (bArrC[iD] == 0 && bArrC[iD + 1] == 0 && bArrC[iD + 2] == 1 && bArrC[iD + 3] == 15) {
                            return new android.util.Pair(androidx.media3.common.MimeTypes.VIDEO_VC1, java.util.Collections.singletonList(java.util.Arrays.copyOfRange(bArrC, iD, bArrC.length)));
                        }
                    }
                    throw com.applovin.impl.ch.a("Failed to find FourCC VC1 initialization data", null);
                }
                com.applovin.impl.oc.d("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new android.util.Pair(androidx.media3.common.MimeTypes.VIDEO_UNKNOWN, null);
            } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                throw com.applovin.impl.ch.a("Error parsing FourCC private data", null);
            }
        }

        private static java.util.List a(byte[] bArr) throws com.applovin.impl.ch {
            int i;
            int i2;
            try {
                if (bArr[0] == 2) {
                    int i3 = 0;
                    int i4 = 1;
                    while (true) {
                        i = bArr[i4] & 255;
                        if (i != 255) {
                            break;
                        }
                        i3 += 255;
                        i4++;
                    }
                    int i5 = i4 + 1;
                    int i6 = i3 + i;
                    int i7 = 0;
                    while (true) {
                        i2 = bArr[i5] & 255;
                        if (i2 != 255) {
                            break;
                        }
                        i7 += 255;
                        i5++;
                    }
                    int i8 = i5 + 1;
                    int i9 = i7 + i2;
                    if (bArr[i8] == 1) {
                        byte[] bArr2 = new byte[i6];
                        java.lang.System.arraycopy(bArr, i8, bArr2, 0, i6);
                        int i10 = i8 + i6;
                        if (bArr[i10] == 3) {
                            int i11 = i10 + i9;
                            if (bArr[i11] == 5) {
                                byte[] bArr3 = new byte[bArr.length - i11];
                                java.lang.System.arraycopy(bArr, i11, bArr3, 0, bArr.length - i11);
                                java.util.ArrayList arrayList = new java.util.ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw com.applovin.impl.ch.a("Error parsing vorbis codec private", null);
                        }
                        throw com.applovin.impl.ch.a("Error parsing vorbis codec private", null);
                    }
                    throw com.applovin.impl.ch.a("Error parsing vorbis codec private", null);
                }
                throw com.applovin.impl.ch.a("Error parsing vorbis codec private", null);
            } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
                throw com.applovin.impl.ch.a("Error parsing vorbis codec private", null);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:99:0x0278  */
    protected void a(int i, int i2, com.applovin.impl.k8 k8Var) throws com.applovin.impl.ch {
        com.applovin.impl.xc.c cVar;
        int i3;
        com.applovin.impl.xc.c cVar2;
        com.applovin.impl.xc.c cVar3;
        long j;
        int i4;
        int i5;
        int i6;
        int i7;
        java.lang.Throwable th = null;
        int i8 = 1;
        int i9 = 0;
        if (i != 161 && i != 163) {
            if (i == 165) {
                if (this.G != 2) {
                    return;
                }
                a((com.applovin.impl.xc.c) this.c.get(this.M), this.P, k8Var, i2);
                return;
            }
            if (i == 16877) {
                a(d(i), k8Var, i2);
                return;
            }
            if (i == 16981) {
                b(i);
                byte[] bArr = new byte[i2];
                this.u.i = bArr;
                k8Var.d(bArr, 0, i2);
                return;
            }
            if (i == 18402) {
                byte[] bArr2 = new byte[i2];
                k8Var.d(bArr2, 0, i2);
                d(i).j = new com.applovin.impl.qo.a(1, bArr2, 0, 0);
                return;
            }
            if (i == 21419) {
                java.util.Arrays.fill(this.i.c(), (byte) 0);
                k8Var.d(this.i.c(), 4 - i2, i2);
                this.i.f(0);
                this.w = (int) this.i.y();
                return;
            }
            if (i == 25506) {
                b(i);
                byte[] bArr3 = new byte[i2];
                this.u.k = bArr3;
                k8Var.d(bArr3, 0, i2);
                return;
            }
            if (i != 30322) {
                throw com.applovin.impl.ch.a("Unexpected id: " + i, null);
            }
            b(i);
            byte[] bArr4 = new byte[i2];
            this.u.v = bArr4;
            k8Var.d(bArr4, 0, i2);
            return;
        }
        if (this.G == 0) {
            this.M = (int) this.b.a(k8Var, false, true, 8);
            this.N = this.b.a();
            this.I = androidx.media3.common.C.TIME_UNSET;
            this.G = 1;
            this.g.d(0);
        }
        com.applovin.impl.xc.c cVar4 = (com.applovin.impl.xc.c) this.c.get(this.M);
        if (cVar4 != null) {
            cVar4.a();
            if (this.G == 1) {
                a(k8Var, 3);
                int i10 = (this.g.c()[2] & 6) >> 1;
                if (i10 == 0) {
                    this.K = 1;
                    int[] iArrA = a(this.L, 1);
                    this.L = iArrA;
                    iArrA[0] = (i2 - this.N) - 3;
                } else {
                    int i11 = 4;
                    a(k8Var, 4);
                    int i12 = (this.g.c()[3] & 255) + 1;
                    this.K = i12;
                    int[] iArrA2 = a(this.L, i12);
                    this.L = iArrA2;
                    if (i10 == 2) {
                        int i13 = (i2 - this.N) - 4;
                        int i14 = this.K;
                        java.util.Arrays.fill(iArrA2, 0, i14, i13 / i14);
                    } else {
                        if (i10 == 1) {
                            int i15 = 0;
                            int i16 = 0;
                            while (true) {
                                i4 = this.K - 1;
                                if (i15 >= i4) {
                                    break;
                                }
                                this.L[i15] = 0;
                                while (true) {
                                    i5 = i11 + 1;
                                    a(k8Var, i5);
                                    int i17 = this.g.c()[i11] & 255;
                                    int[] iArr = this.L;
                                    i6 = iArr[i15] + i17;
                                    iArr[i15] = i6;
                                    if (i17 != 255) {
                                        break;
                                    } else {
                                        i11 = i5;
                                    }
                                }
                                i16 += i6;
                                i15++;
                                i11 = i5;
                            }
                            this.L[i4] = ((i2 - this.N) - i11) - i16;
                        } else {
                            if (i10 != 3) {
                                throw com.applovin.impl.ch.a("Unexpected lacing value: " + i10, null);
                            }
                            int i18 = 0;
                            int i19 = 0;
                            while (true) {
                                int i20 = this.K - i8;
                                if (i18 < i20) {
                                    this.L[i18] = i9;
                                    int i21 = i11 + 1;
                                    a(k8Var, i21);
                                    if (this.g.c()[i11] == 0) {
                                        throw com.applovin.impl.ch.a("No valid varint length mask found", th);
                                    }
                                    int i22 = i9;
                                    while (true) {
                                        if (i22 < 8) {
                                            int i23 = i8 << (7 - i22);
                                            if ((this.g.c()[i11] & i23) != 0) {
                                                int i24 = i21 + i22;
                                                a(k8Var, i24);
                                                j = (~i23) & this.g.c()[i11] & 255;
                                                while (i21 < i24) {
                                                    j = (j << 8) | ((long) (this.g.c()[i21] & 255));
                                                    i21++;
                                                    cVar4 = cVar4;
                                                }
                                                cVar3 = cVar4;
                                                if (i18 > 0) {
                                                    j -= (1 << ((i22 * 7) + 6)) - 1;
                                                    i11 = i24;
                                                    break;
                                                }
                                                i21 = i24;
                                            } else {
                                                i22++;
                                                i8 = 1;
                                            }
                                        } else {
                                            cVar3 = cVar4;
                                            j = 0;
                                        }
                                        i11 = i21;
                                        break;
                                    }
                                    if (j >= -2147483648L && j <= 2147483647L) {
                                        int i25 = (int) j;
                                        int[] iArr2 = this.L;
                                        if (i18 != 0) {
                                            i25 += iArr2[i18 - 1];
                                        }
                                        iArr2[i18] = i25;
                                        i19 += i25;
                                        i18++;
                                        cVar4 = cVar3;
                                        th = null;
                                        i8 = 1;
                                        i9 = 0;
                                    } else {
                                        throw com.applovin.impl.ch.a("EBML lacing sample size out of range.", null);
                                    }
                                } else {
                                    cVar2 = cVar4;
                                    this.L[i20] = ((i2 - this.N) - i11) - i19;
                                    break;
                                }
                            }
                        }
                        this.H = this.B + a((this.g.c()[0] << 8) | (this.g.c()[1] & 255));
                        cVar = cVar2;
                        if (cVar.d != 2 || (i == 163 && (this.g.c()[2] & 128) == 128)) {
                            i7 = 1;
                        } else {
                            i7 = 0;
                        }
                        this.O = i7;
                        this.G = 2;
                        this.J = 0;
                        i3 = org.objectweb.asm.Opcodes.IF_ICMPGT;
                    }
                }
                cVar2 = cVar4;
                this.H = this.B + a((this.g.c()[0] << 8) | (this.g.c()[1] & 255));
                cVar = cVar2;
                if (cVar.d != 2) {
                    i7 = 1;
                } else {
                    i7 = 1;
                }
                this.O = i7;
                this.G = 2;
                this.J = 0;
                i3 = org.objectweb.asm.Opcodes.IF_ICMPGT;
            } else {
                cVar = cVar4;
                i3 = 163;
            }
            if (i == i3) {
                while (true) {
                    int i26 = this.J;
                    if (i26 < this.K) {
                        a(cVar, ((long) ((this.J * cVar.e) / 1000)) + this.H, this.O, a(k8Var, cVar, this.L[i26]), 0);
                        this.J++;
                    } else {
                        this.G = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i27 = this.J;
                    if (i27 >= this.K) {
                        return;
                    }
                    int[] iArr3 = this.L;
                    iArr3[i27] = a(k8Var, cVar, iArr3[i27]);
                    this.J++;
                }
            }
        } else {
            k8Var.a(i2 - this.N);
            this.G = 0;
        }
    }

    private com.applovin.impl.ij a(com.applovin.impl.qc qcVar, com.applovin.impl.qc qcVar2) {
        int i;
        if (this.q != -1 && this.t != androidx.media3.common.C.TIME_UNSET && qcVar != null && qcVar.a() != 0 && qcVar2 != null && qcVar2.a() == qcVar.a()) {
            int iA = qcVar.a();
            int[] iArrCopyOf = new int[iA];
            long[] jArrCopyOf = new long[iA];
            long[] jArrCopyOf2 = new long[iA];
            long[] jArrCopyOf3 = new long[iA];
            int i2 = 0;
            for (int i3 = 0; i3 < iA; i3++) {
                jArrCopyOf3[i3] = qcVar.a(i3);
                jArrCopyOf[i3] = this.q + qcVar2.a(i3);
            }
            while (true) {
                i = iA - 1;
                if (i2 >= i) {
                    break;
                }
                int i4 = i2 + 1;
                iArrCopyOf[i2] = (int) (jArrCopyOf[i4] - jArrCopyOf[i2]);
                jArrCopyOf2[i2] = jArrCopyOf3[i4] - jArrCopyOf3[i2];
                i2 = i4;
            }
            iArrCopyOf[i] = (int) ((this.q + this.p) - jArrCopyOf[i]);
            long j = this.t - jArrCopyOf3[i];
            jArrCopyOf2[i] = j;
            if (j <= 0) {
                com.applovin.impl.oc.d("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j);
                iArrCopyOf = java.util.Arrays.copyOf(iArrCopyOf, i);
                jArrCopyOf = java.util.Arrays.copyOf(jArrCopyOf, i);
                jArrCopyOf2 = java.util.Arrays.copyOf(jArrCopyOf2, i);
                jArrCopyOf3 = java.util.Arrays.copyOf(jArrCopyOf3, i);
            }
            return new com.applovin.impl.g3(iArrCopyOf, jArrCopyOf, jArrCopyOf2, jArrCopyOf3);
        }
        return new com.applovin.impl.ij.b(this.t);
    }

    private void a(com.applovin.impl.xc.c cVar, long j, int i, int i2, int i3) {
        com.applovin.impl.xc.d dVar = cVar.T;
        if (dVar != null) {
            dVar.a(cVar, j, i, i2, i3);
        } else {
            if ("S_TEXT/UTF8".equals(cVar.b) || "S_TEXT/ASS".equals(cVar.b)) {
                if (this.K > 1) {
                    com.applovin.impl.oc.d("MatroskaExtractor", "Skipping subtitle sample in laced block.");
                } else {
                    long j2 = this.I;
                    if (j2 == androidx.media3.common.C.TIME_UNSET) {
                        com.applovin.impl.oc.d("MatroskaExtractor", "Skipping subtitle sample with no duration.");
                    } else {
                        a(cVar.b, j2, this.k.c());
                        for (int iD = this.k.d(); iD < this.k.e(); iD++) {
                            if (this.k.c()[iD] == 0) {
                                this.k.e(iD);
                                break;
                            }
                        }
                        com.applovin.impl.qo qoVar = cVar.X;
                        com.applovin.impl.ah ahVar = this.k;
                        qoVar.a(ahVar, ahVar.e());
                        i2 += this.k.e();
                    }
                }
            }
            if ((268435456 & i) != 0) {
                if (this.K > 1) {
                    i &= -268435457;
                } else {
                    int iE = this.n.e();
                    cVar.X.a(this.n, iE, 2);
                    i2 += iE;
                }
            }
            cVar.X.a(j, i, i2, i3, cVar.j);
        }
        this.F = true;
    }

    private static int[] a(int[] iArr, int i) {
        if (iArr == null) {
            return new int[i];
        }
        return iArr.length >= i ? iArr : new int[java.lang.Math.max(iArr.length * 2, i)];
    }

    protected void a(int i, double d2) {
        if (i == 181) {
            d(i).Q = (int) d2;
            return;
        }
        if (i != 17545) {
            switch (i) {
                case 21969:
                    d(i).D = (float) d2;
                    break;
                case 21970:
                    d(i).E = (float) d2;
                    break;
                case 21971:
                    d(i).F = (float) d2;
                    break;
                case 21972:
                    d(i).G = (float) d2;
                    break;
                case 21973:
                    d(i).H = (float) d2;
                    break;
                case 21974:
                    d(i).I = (float) d2;
                    break;
                case 21975:
                    d(i).J = (float) d2;
                    break;
                case 21976:
                    d(i).K = (float) d2;
                    break;
                case 21977:
                    d(i).L = (float) d2;
                    break;
                case 21978:
                    d(i).M = (float) d2;
                    break;
                default:
                    switch (i) {
                        case 30323:
                            d(i).s = (float) d2;
                            break;
                        case 30324:
                            d(i).t = (float) d2;
                            break;
                        case 30325:
                            d(i).u = (float) d2;
                            break;
                    }
                    break;
            }
            return;
        }
        this.s = (long) d2;
    }

    private static byte[] a(long j, java.lang.String str, long j2) {
        com.applovin.impl.b1.a(j != androidx.media3.common.C.TIME_UNSET);
        int i = (int) (j / 3600000000L);
        long j3 = j - (((long) (i * 3600)) * 1000000);
        int i2 = (int) (j3 / 60000000);
        long j4 = j3 - (((long) (i2 * 60)) * 1000000);
        int i3 = (int) (j4 / 1000000);
        return com.applovin.impl.xp.c(java.lang.String.format(java.util.Locale.US, str, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3), java.lang.Integer.valueOf((int) ((j4 - (((long) i3) * 1000000)) / j2))));
    }

    protected void a(com.applovin.impl.xc.c cVar, com.applovin.impl.k8 k8Var, int i) {
        if (cVar.g != 1685485123 && cVar.g != 1685480259) {
            k8Var.a(i);
            return;
        }
        byte[] bArr = new byte[i];
        cVar.N = bArr;
        k8Var.d(bArr, 0, i);
    }

    protected void a(com.applovin.impl.xc.c cVar, int i, com.applovin.impl.k8 k8Var, int i2) {
        if (i == 4 && "V_VP9".equals(cVar.b)) {
            this.n.d(i2);
            k8Var.d(this.n.c(), 0, i2);
        } else {
            k8Var.a(i2);
        }
    }

    @Override // com.applovin.impl.j8
    public final void a(com.applovin.impl.l8 l8Var) {
        this.a0 = l8Var;
    }

    protected void a(int i, long j) throws com.applovin.impl.ch {
        if (i == 20529) {
            if (j != 0) {
                throw com.applovin.impl.ch.a("ContentEncodingOrder " + j + " not supported", null);
            }
            return;
        }
        if (i == 20530) {
            if (j != 1) {
                throw com.applovin.impl.ch.a("ContentEncodingScope " + j + " not supported", null);
            }
            return;
        }
        switch (i) {
            case org.objectweb.asm.Opcodes.LXOR /* 131 */:
                d(i).d = (int) j;
                return;
            case 136:
                d(i).V = j == 1;
                return;
            case 155:
                this.I = a(j);
                return;
            case org.objectweb.asm.Opcodes.IF_ICMPEQ /* 159 */:
                d(i).O = (int) j;
                return;
            case org.objectweb.asm.Opcodes.ARETURN /* 176 */:
                d(i).m = (int) j;
                return;
            case org.objectweb.asm.Opcodes.PUTSTATIC /* 179 */:
                a(i);
                this.C.a(a(j));
                return;
            case org.objectweb.asm.Opcodes.INVOKEDYNAMIC /* 186 */:
                d(i).n = (int) j;
                return;
            case 215:
                d(i).c = (int) j;
                return;
            case 231:
                this.B = a(j);
                return;
            case 238:
                this.P = (int) j;
                return;
            case 241:
                if (this.E) {
                    return;
                }
                a(i);
                this.D.a(j);
                this.E = true;
                return;
            case 251:
                this.Q = true;
                return;
            case 16871:
                d(i).g = (int) j;
                return;
            case 16980:
                if (j != 3) {
                    throw com.applovin.impl.ch.a("ContentCompAlgo " + j + " not supported", null);
                }
                return;
            case 17029:
                if (j < 1 || j > 2) {
                    throw com.applovin.impl.ch.a("DocTypeReadVersion " + j + " not supported", null);
                }
                return;
            case 17143:
                if (j != 1) {
                    throw com.applovin.impl.ch.a("EBMLReadVersion " + j + " not supported", null);
                }
                return;
            case 18401:
                if (j != 5) {
                    throw com.applovin.impl.ch.a("ContentEncAlgo " + j + " not supported", null);
                }
                return;
            case 18408:
                if (j != 1) {
                    throw com.applovin.impl.ch.a("AESSettingsCipherMode " + j + " not supported", null);
                }
                return;
            case 21420:
                this.x = j + this.q;
                return;
            case 21432:
                int i2 = (int) j;
                b(i);
                if (i2 == 0) {
                    this.u.w = 0;
                    return;
                }
                if (i2 == 1) {
                    this.u.w = 2;
                    return;
                } else if (i2 == 3) {
                    this.u.w = 1;
                    return;
                } else {
                    if (i2 != 15) {
                        return;
                    }
                    this.u.w = 3;
                    return;
                }
            case 21680:
                d(i).o = (int) j;
                return;
            case 21682:
                d(i).q = (int) j;
                return;
            case 21690:
                d(i).p = (int) j;
                return;
            case 21930:
                d(i).U = j == 1;
                return;
            case 21998:
                d(i).f = (int) j;
                return;
            case 22186:
                d(i).R = j;
                return;
            case 22203:
                d(i).S = j;
                return;
            case 25188:
                d(i).P = (int) j;
                return;
            case 30321:
                b(i);
                int i3 = (int) j;
                if (i3 == 0) {
                    this.u.r = 0;
                    return;
                }
                if (i3 == 1) {
                    this.u.r = 1;
                    return;
                } else if (i3 == 2) {
                    this.u.r = 2;
                    return;
                } else {
                    if (i3 != 3) {
                        return;
                    }
                    this.u.r = 3;
                    return;
                }
            case 2352003:
                d(i).e = (int) j;
                return;
            case 2807729:
                this.r = j;
                return;
            default:
                switch (i) {
                    case 21945:
                        b(i);
                        int i4 = (int) j;
                        if (i4 == 1) {
                            this.u.A = 2;
                            return;
                        } else {
                            if (i4 != 2) {
                                return;
                            }
                            this.u.A = 1;
                            return;
                        }
                    case 21946:
                        b(i);
                        int iB = com.applovin.impl.r3.b((int) j);
                        if (iB != -1) {
                            this.u.z = iB;
                            return;
                        }
                        return;
                    case 21947:
                        b(i);
                        this.u.x = true;
                        int iA = com.applovin.impl.r3.a((int) j);
                        if (iA != -1) {
                            this.u.y = iA;
                            return;
                        }
                        return;
                    case 21948:
                        d(i).B = (int) j;
                        return;
                    case 21949:
                        d(i).C = (int) j;
                        return;
                    default:
                        return;
                }
        }
    }

    private static boolean a(java.lang.String str) {
        str.hashCode();
        str.hashCode();
        switch (str) {
            case "V_MPEG4/ISO/AP":
            case "V_MPEG4/ISO/SP":
            case "A_MS/ACM":
            case "A_TRUEHD":
            case "A_VORBIS":
            case "A_MPEG/L2":
            case "A_MPEG/L3":
            case "V_MS/VFW/FOURCC":
            case "S_DVBSUB":
            case "V_MPEG4/ISO/ASP":
            case "V_MPEG4/ISO/AVC":
            case "S_VOBSUB":
            case "A_DTS/LOSSLESS":
            case "A_AAC":
            case "A_AC3":
            case "A_DTS":
            case "V_AV1":
            case "V_VP8":
            case "V_VP9":
            case "S_HDMV/PGS":
            case "V_THEORA":
            case "A_DTS/EXPRESS":
            case "A_PCM/FLOAT/IEEE":
            case "A_PCM/INT/BIG":
            case "A_PCM/INT/LIT":
            case "S_TEXT/ASS":
            case "V_MPEGH/ISO/HEVC":
            case "S_TEXT/UTF8":
            case "V_MPEG2":
            case "A_EAC3":
            case "A_FLAC":
            case "A_OPUS":
                return true;
            default:
                return false;
        }
    }

    private boolean a(com.applovin.impl.th thVar, long j) {
        if (this.y) {
            this.A = j;
            thVar.f1364a = this.z;
            this.y = false;
            return true;
        }
        if (this.v) {
            long j2 = this.A;
            if (j2 != -1) {
                thVar.f1364a = j2;
                this.A = -1L;
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.impl.j8
    public final int a(com.applovin.impl.k8 k8Var, com.applovin.impl.th thVar) {
        this.F = false;
        boolean zA = true;
        while (zA && !this.F) {
            zA = this.f1500a.a(k8Var);
            if (zA && a(thVar, k8Var.f())) {
                return 1;
            }
        }
        if (zA) {
            return 0;
        }
        for (int i = 0; i < this.c.size(); i++) {
            com.applovin.impl.xc.c cVar = (com.applovin.impl.xc.c) this.c.valueAt(i);
            cVar.a();
            cVar.c();
        }
        return -1;
    }

    private void a(com.applovin.impl.k8 k8Var, int i) {
        if (this.g.e() >= i) {
            return;
        }
        if (this.g.b() < i) {
            com.applovin.impl.ah ahVar = this.g;
            ahVar.a(java.lang.Math.max(ahVar.b() * 2, i));
        }
        k8Var.d(this.g.c(), this.g.e(), i - this.g.e());
        this.g.e(i);
    }

    private long a(long j) throws com.applovin.impl.ch {
        long j2 = this.r;
        if (j2 != androidx.media3.common.C.TIME_UNSET) {
            return com.applovin.impl.xp.c(j, j2, 1000L);
        }
        throw com.applovin.impl.ch.a("Can't scale timecode prior to timecodeScale being set.", null);
    }

    @Override // com.applovin.impl.j8
    public void a(long j, long j2) {
        this.B = androidx.media3.common.C.TIME_UNSET;
        this.G = 0;
        this.f1500a.reset();
        this.b.b();
        h();
        for (int i = 0; i < this.c.size(); i++) {
            ((com.applovin.impl.xc.c) this.c.valueAt(i)).d();
        }
    }

    private static void a(java.lang.String str, long j, byte[] bArr) {
        byte[] bArrA;
        int i;
        str.hashCode();
        if (str.equals("S_TEXT/ASS")) {
            bArrA = a(j, "%01d:%02d:%02d:%02d", 10000L);
            i = 21;
        } else if (str.equals("S_TEXT/UTF8")) {
            bArrA = a(j, "%02d:%02d:%02d,%03d", 1000L);
            i = 19;
        } else {
            throw new java.lang.IllegalArgumentException();
        }
        java.lang.System.arraycopy(bArrA, 0, bArr, i, bArrA.length);
    }

    protected void a(int i, long j, long j2) throws com.applovin.impl.ch {
        e();
        if (i == 160) {
            this.Q = false;
            return;
        }
        if (i == 174) {
            this.u = new com.applovin.impl.xc.c();
            return;
        }
        if (i == 187) {
            this.E = false;
            return;
        }
        if (i == 19899) {
            this.w = -1;
            this.x = -1L;
            return;
        }
        if (i == 20533) {
            d(i).h = true;
            return;
        }
        if (i == 21968) {
            d(i).x = true;
            return;
        }
        if (i == 408125543) {
            long j3 = this.q;
            if (j3 != -1 && j3 != j) {
                throw com.applovin.impl.ch.a("Multiple Segment elements not supported", null);
            }
            this.q = j;
            this.p = j2;
            return;
        }
        if (i != 475249515) {
            if (i == 524531317 && !this.v) {
                if (this.d && this.z != -1) {
                    this.y = true;
                    return;
                } else {
                    this.a0.a(new com.applovin.impl.ij.b(this.t));
                    this.v = true;
                    return;
                }
            }
            return;
        }
        this.C = new com.applovin.impl.qc();
        this.D = new com.applovin.impl.qc();
    }

    protected void a(int i, java.lang.String str) throws com.applovin.impl.ch {
        if (i == 134) {
            d(i).b = str;
            return;
        }
        if (i == 17026) {
            if (!"webm".equals(str) && !"matroska".equals(str)) {
                throw com.applovin.impl.ch.a("DocType " + str + " not supported", null);
            }
        } else if (i == 21358) {
            d(i).f1502a = str;
        } else {
            if (i != 2274716) {
                return;
            }
            d(i).W = str;
        }
    }

    private int a(com.applovin.impl.k8 k8Var, com.applovin.impl.xc.c cVar, int i) throws com.applovin.impl.ch {
        int i2;
        if ("S_TEXT/UTF8".equals(cVar.b)) {
            a(k8Var, c0, i);
            return f();
        }
        if ("S_TEXT/ASS".equals(cVar.b)) {
            a(k8Var, e0, i);
            return f();
        }
        com.applovin.impl.qo qoVar = cVar.X;
        if (!this.U) {
            if (cVar.h) {
                this.O &= -1073741825;
                if (!this.V) {
                    k8Var.d(this.g.c(), 0, 1);
                    this.R++;
                    if ((this.g.c()[0] & 128) != 128) {
                        this.Y = this.g.c()[0];
                        this.V = true;
                    } else {
                        throw com.applovin.impl.ch.a("Extension bit is set in signal byte", null);
                    }
                }
                byte b2 = this.Y;
                if ((b2 & 1) == 1) {
                    boolean z = (b2 & 2) == 2;
                    this.O |= 1073741824;
                    if (!this.Z) {
                        k8Var.d(this.l.c(), 0, 8);
                        this.R += 8;
                        this.Z = true;
                        this.g.c()[0] = (byte) ((z ? 128 : 0) | 8);
                        this.g.f(0);
                        qoVar.a(this.g, 1, 1);
                        this.S++;
                        this.l.f(0);
                        qoVar.a(this.l, 8, 1);
                        this.S += 8;
                    }
                    if (z) {
                        if (!this.W) {
                            k8Var.d(this.g.c(), 0, 1);
                            this.R++;
                            this.g.f(0);
                            this.X = this.g.w();
                            this.W = true;
                        }
                        int i3 = this.X * 4;
                        this.g.d(i3);
                        k8Var.d(this.g.c(), 0, i3);
                        this.R += i3;
                        short s = (short) ((this.X / 2) + 1);
                        int i4 = (s * 6) + 2;
                        java.nio.ByteBuffer byteBuffer = this.o;
                        if (byteBuffer == null || byteBuffer.capacity() < i4) {
                            this.o = java.nio.ByteBuffer.allocate(i4);
                        }
                        this.o.position(0);
                        this.o.putShort(s);
                        int i5 = 0;
                        int i6 = 0;
                        while (true) {
                            i2 = this.X;
                            if (i5 >= i2) {
                                break;
                            }
                            int iA = this.g.A();
                            if (i5 % 2 == 0) {
                                this.o.putShort((short) (iA - i6));
                            } else {
                                this.o.putInt(iA - i6);
                            }
                            i5++;
                            i6 = iA;
                        }
                        int i7 = (i - this.R) - i6;
                        if (i2 % 2 == 1) {
                            this.o.putInt(i7);
                        } else {
                            this.o.putShort((short) i7);
                            this.o.putInt(0);
                        }
                        this.m.a(this.o.array(), i4);
                        qoVar.a(this.m, i4, 1);
                        this.S += i4;
                    }
                }
            } else {
                byte[] bArr = cVar.i;
                if (bArr != null) {
                    this.j.a(bArr, bArr.length);
                }
            }
            if (cVar.f > 0) {
                this.O |= 268435456;
                this.n.d(0);
                this.g.d(4);
                this.g.c()[0] = (byte) ((i >> 24) & 255);
                this.g.c()[1] = (byte) ((i >> 16) & 255);
                this.g.c()[2] = (byte) ((i >> 8) & 255);
                this.g.c()[3] = (byte) (i & 255);
                qoVar.a(this.g, 4, 2);
                this.S += 4;
            }
            this.U = true;
        }
        int iE = i + this.j.e();
        if (!"V_MPEG4/ISO/AVC".equals(cVar.b) && !"V_MPEGH/ISO/HEVC".equals(cVar.b)) {
            if (cVar.T != null) {
                com.applovin.impl.b1.b(this.j.e() == 0);
                cVar.T.a(k8Var);
            }
            while (true) {
                int i8 = this.R;
                if (i8 >= iE) {
                    break;
                }
                int iA2 = a(k8Var, qoVar, iE - i8);
                this.R += iA2;
                this.S += iA2;
            }
        } else {
            byte[] bArrC = this.f.c();
            bArrC[0] = 0;
            bArrC[1] = 0;
            bArrC[2] = 0;
            int i9 = cVar.Y;
            int i10 = 4 - i9;
            while (this.R < iE) {
                int i11 = this.T;
                if (i11 == 0) {
                    a(k8Var, bArrC, i10, i9);
                    this.R += i9;
                    this.f.f(0);
                    this.T = this.f.A();
                    this.e.f(0);
                    qoVar.a(this.e, 4);
                    this.S += 4;
                } else {
                    int iA3 = a(k8Var, qoVar, i11);
                    this.R += iA3;
                    this.S += iA3;
                    this.T -= iA3;
                }
            }
        }
        if ("A_VORBIS".equals(cVar.b)) {
            this.h.f(0);
            qoVar.a(this.h, 4);
            this.S += 4;
        }
        return f();
    }

    private void a(com.applovin.impl.k8 k8Var, byte[] bArr, int i) {
        int length = bArr.length + i;
        if (this.k.b() < length) {
            this.k.a(java.util.Arrays.copyOf(bArr, length + i));
        } else {
            java.lang.System.arraycopy(bArr, 0, this.k.c(), 0, bArr.length);
        }
        k8Var.d(this.k.c(), bArr.length, i);
        this.k.f(0);
        this.k.e(length);
    }

    private int a(com.applovin.impl.k8 k8Var, com.applovin.impl.qo qoVar, int i) {
        int iA = this.j.a();
        if (iA > 0) {
            int iMin = java.lang.Math.min(i, iA);
            qoVar.a(this.j, iMin);
            return iMin;
        }
        return qoVar.a((com.applovin.impl.f5) k8Var, i, false);
    }

    private void a(com.applovin.impl.k8 k8Var, byte[] bArr, int i, int i2) {
        int iMin = java.lang.Math.min(i2, this.j.a());
        k8Var.d(bArr, i + iMin, i2 - iMin);
        if (iMin > 0) {
            this.j.a(bArr, i, iMin);
        }
    }

    @Override // com.applovin.impl.j8
    public final boolean a(com.applovin.impl.k8 k8Var) {
        return new com.applovin.impl.mk().b(k8Var);
    }
}
