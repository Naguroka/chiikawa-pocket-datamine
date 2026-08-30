package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class od extends com.applovin.impl.kd {
    private static final int[] s1 = {1920, com.json.mediationsdk.utils.IronSourceConstants.RV_OPERATIONAL_LOAD_AD, 1440, 1280, 960, 854, 640, 540, 480};
    private static boolean t1;
    private static boolean u1;
    private final android.content.Context J0;
    private final com.applovin.impl.vq K0;
    private final com.applovin.impl.wq.a L0;
    private final long M0;
    private final int N0;
    private final boolean O0;
    private com.applovin.impl.od.a P0;
    private boolean Q0;
    private boolean R0;
    private android.view.Surface S0;
    private com.applovin.impl.g7 T0;
    private boolean U0;
    private int V0;
    private boolean W0;
    private boolean X0;
    private boolean Y0;
    private long Z0;
    private long a1;
    private long b1;
    private int c1;
    private int d1;
    private int e1;
    private long f1;
    private long g1;
    private long h1;
    private int i1;
    private int j1;
    private int k1;
    private int l1;
    private float m1;
    private com.applovin.impl.xq n1;
    private boolean o1;
    private int p1;
    com.applovin.impl.od.b q1;
    private com.applovin.impl.uq r1;

    private static boolean e0() {
        return "NVIDIA".equals(com.applovin.impl.xp.c);
    }

    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1093)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private static boolean f0() {
        /*
            Method dump skipped, instruction units count: 3052
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.od.f0():boolean");
    }

    private static boolean g(long j) {
        return j < -30000;
    }

    private static boolean h(long j) {
        return j < -500000;
    }

    @Override // com.applovin.impl.qi, com.applovin.impl.ri
    public java.lang.String getName() {
        return "MediaCodecVideoRenderer";
    }

    public od(android.content.Context context, com.applovin.impl.gd.b bVar, com.applovin.impl.ld ldVar, long j, boolean z, android.os.Handler handler, com.applovin.impl.wq wqVar, int i) {
        super(2, bVar, ldVar, z, 30.0f);
        this.M0 = j;
        this.N0 = i;
        android.content.Context applicationContext = context.getApplicationContext();
        this.J0 = applicationContext;
        this.K0 = new com.applovin.impl.vq(applicationContext);
        this.L0 = new com.applovin.impl.wq.a(handler, wqVar);
        this.O0 = e0();
        this.a1 = androidx.media3.common.C.TIME_UNSET;
        this.j1 = -1;
        this.k1 = -1;
        this.m1 = -1.0f;
        this.V0 = 1;
        this.p1 = 0;
        d0();
    }

    @Override // com.applovin.impl.kd, com.applovin.impl.qi
    public boolean d() {
        com.applovin.impl.g7 g7Var;
        if (super.d() && (this.W0 || (((g7Var = this.T0) != null && this.S0 == g7Var) || I() == null || this.o1))) {
            this.a1 = androidx.media3.common.C.TIME_UNSET;
            return true;
        }
        if (this.a1 == androidx.media3.common.C.TIME_UNSET) {
            return false;
        }
        if (android.os.SystemClock.elapsedRealtime() < this.a1) {
            return true;
        }
        this.a1 = androidx.media3.common.C.TIME_UNSET;
        return false;
    }

    @Override // com.applovin.impl.kd, com.applovin.impl.e2
    protected void x() {
        super.x();
        this.c1 = 0;
        this.b1 = android.os.SystemClock.elapsedRealtime();
        this.g1 = android.os.SystemClock.elapsedRealtime() * 1000;
        this.h1 = 0L;
        this.i1 = 0;
        this.K0.e();
    }

    @Override // com.applovin.impl.kd, com.applovin.impl.e2
    protected void y() {
        this.a1 = androidx.media3.common.C.TIME_UNSET;
        g0();
        i0();
        this.K0.f();
        super.y();
    }

    @Override // com.applovin.impl.kd, com.applovin.impl.e2
    protected void v() {
        d0();
        c0();
        this.U0 = false;
        this.K0.b();
        this.q1 = null;
        try {
            super.v();
        } finally {
            this.L0.a(this.E0);
        }
    }

    @Override // com.applovin.impl.kd, com.applovin.impl.e2
    protected void w() {
        com.applovin.impl.g7 g7Var;
        try {
            super.w();
            g7Var = this.T0;
            if (g7Var != null) {
                if (this.S0 == g7Var) {
                    this.S0 = null;
                }
            }
        } finally {
            if (this.T0 != null) {
                android.view.Surface surface = this.S0;
                g7Var = this.T0;
                if (surface == g7Var) {
                    this.S0 = null;
                }
                g7Var.release();
                this.T0 = null;
            }
        }
    }

    public od(android.content.Context context, com.applovin.impl.ld ldVar, long j, boolean z, android.os.Handler handler, com.applovin.impl.wq wqVar, int i) {
        this(context, com.applovin.impl.gd.b.f820a, ldVar, j, z, handler, wqVar, i);
    }

    @Override // com.applovin.impl.kd
    protected boolean K() {
        return this.o1 && com.applovin.impl.xp.f1515a < 23;
    }

    @Override // com.applovin.impl.kd
    protected void W() {
        super.W();
        this.e1 = 0;
    }

    @Override // com.applovin.impl.kd
    protected void g(java.lang.String str) {
        this.L0.a(str);
    }

    @Override // com.applovin.impl.kd
    protected com.applovin.impl.p5 a(com.applovin.impl.jd jdVar, com.applovin.impl.e9 e9Var, com.applovin.impl.e9 e9Var2) {
        com.applovin.impl.p5 p5VarA = jdVar.a(e9Var, e9Var2);
        int i = p5VarA.e;
        int i2 = e9Var2.r;
        com.applovin.impl.od.a aVar = this.P0;
        if (i2 > aVar.f1120a || e9Var2.s > aVar.b) {
            i |= 256;
        }
        if (c(jdVar, e9Var2) > this.P0.c) {
            i |= 64;
        }
        int i3 = i;
        return new com.applovin.impl.p5(jdVar.f920a, e9Var, e9Var2, i3 != 0 ? 0 : p5VarA.d, i3);
    }

    protected void i(long j) {
        f(j);
        j0();
        this.E0.e++;
        h0();
        d(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m0() {
        a0();
    }

    @Override // com.applovin.impl.kd
    protected void Q() {
        super.Q();
        c0();
    }

    protected void f(int i) {
        com.applovin.impl.m5 m5Var = this.E0;
        m5Var.g += i;
        this.c1 += i;
        int i2 = this.d1 + i;
        this.d1 = i2;
        m5Var.h = java.lang.Math.max(i2, m5Var.h);
        int i3 = this.N0;
        if (i3 <= 0 || this.c1 < i3) {
            return;
        }
        g0();
    }

    protected void j(long j) {
        this.E0.a(j);
        this.h1 += j;
        this.i1++;
    }

    private void n0() {
        this.a1 = this.M0 > 0 ? android.os.SystemClock.elapsedRealtime() + this.M0 : androidx.media3.common.C.TIME_UNSET;
    }

    private void c0() {
        com.applovin.impl.gd gdVarI;
        this.W0 = false;
        if (com.applovin.impl.xp.f1515a < 23 || !this.o1 || (gdVarI = I()) == null) {
            return;
        }
        this.q1 = new com.applovin.impl.od.b(gdVarI);
    }

    void h0() {
        this.Y0 = true;
        if (this.W0) {
            return;
        }
        this.W0 = true;
        this.L0.a(this.S0);
        this.U0 = true;
    }

    private void k0() {
        if (this.U0) {
            this.L0.a(this.S0);
        }
    }

    private void d0() {
        this.n1 = null;
    }

    private void j0() {
        int i = this.j1;
        if (i == -1 && this.k1 == -1) {
            return;
        }
        com.applovin.impl.xq xqVar = this.n1;
        if (xqVar != null && xqVar.f1516a == i && xqVar.b == this.k1 && xqVar.c == this.l1 && xqVar.d == this.m1) {
            return;
        }
        com.applovin.impl.xq xqVar2 = new com.applovin.impl.xq(this.j1, this.k1, this.l1, this.m1);
        this.n1 = xqVar2;
        this.L0.b(xqVar2);
    }

    private void l0() {
        com.applovin.impl.xq xqVar = this.n1;
        if (xqVar != null) {
            this.L0.b(xqVar);
        }
    }

    private void g0() {
        if (this.c1 > 0) {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            this.L0.a(this.c1, jElapsedRealtime - this.b1);
            this.c1 = 0;
            this.b1 = jElapsedRealtime;
        }
    }

    private void i0() {
        int i = this.i1;
        if (i != 0) {
            this.L0.b(this.h1, i);
            this.h1 = 0L;
            this.i1 = 0;
        }
    }

    private static android.graphics.Point b(com.applovin.impl.jd jdVar, com.applovin.impl.e9 e9Var) {
        int i = e9Var.s;
        int i2 = e9Var.r;
        boolean z = i > i2;
        int i3 = z ? i : i2;
        if (z) {
            i = i2;
        }
        float f = i / i3;
        for (int i4 : s1) {
            int i5 = (int) (i4 * f);
            if (i4 <= i3 || i5 <= i) {
                break;
            }
            if (com.applovin.impl.xp.f1515a >= 21) {
                int i6 = z ? i5 : i4;
                if (!z) {
                    i4 = i5;
                }
                android.graphics.Point pointA = jdVar.a(i6, i4);
                if (jdVar.a(pointA.x, pointA.y, e9Var.t)) {
                    return pointA;
                }
            } else {
                try {
                    int iA = com.applovin.impl.xp.a(i4, 16) * 16;
                    int iA2 = com.applovin.impl.xp.a(i5, 16) * 16;
                    if (iA * iA2 <= com.applovin.impl.md.b()) {
                        int i7 = z ? iA2 : iA;
                        if (!z) {
                            iA = iA2;
                        }
                        return new android.graphics.Point(i7, iA);
                    }
                } catch (com.applovin.impl.md.c unused) {
                }
            }
        }
        return null;
    }

    @Override // com.applovin.impl.kd
    protected void d(long j) {
        super.d(j);
        if (this.o1) {
            return;
        }
        this.e1--;
    }

    protected static int c(com.applovin.impl.jd jdVar, com.applovin.impl.e9 e9Var) {
        if (e9Var.n != -1) {
            int size = e9Var.o.size();
            int length = 0;
            for (int i = 0; i < size; i++) {
                length += ((byte[]) e9Var.o.get(i)).length;
            }
            return e9Var.n + length;
        }
        return a(jdVar, e9Var);
    }

    protected boolean h(java.lang.String str) {
        if (str.startsWith("OMX.google")) {
            return false;
        }
        synchronized (com.applovin.impl.od.class) {
            if (!t1) {
                u1 = f0();
                t1 = true;
            }
        }
        return u1;
    }

    protected static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f1120a;
        public final int b;
        public final int c;

        public a(int i, int i2, int i3) {
            this.f1120a = i;
            this.b = i2;
            this.c = i3;
        }
    }

    private final class b implements com.applovin.impl.gd.c, android.os.Handler.Callback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.os.Handler f1121a;

        public b(com.applovin.impl.gd gdVar) {
            android.os.Handler handlerA = com.applovin.impl.xp.a((android.os.Handler.Callback) this);
            this.f1121a = handlerA;
            gdVar.a(this, handlerA);
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(android.os.Message message) {
            if (message.what != 0) {
                return false;
            }
            a(com.applovin.impl.xp.c(message.arg1, message.arg2));
            return true;
        }

        private void a(long j) {
            com.applovin.impl.od odVar = com.applovin.impl.od.this;
            if (this != odVar.q1) {
                return;
            }
            if (j == Long.MAX_VALUE) {
                odVar.m0();
                return;
            }
            try {
                odVar.i(j);
            } catch (com.applovin.impl.z7 e) {
                com.applovin.impl.od.this.a(e);
            }
        }

        @Override // com.applovin.impl.gd.c
        public void a(com.applovin.impl.gd gdVar, long j, long j2) {
            if (com.applovin.impl.xp.f1515a < 30) {
                this.f1121a.sendMessageAtFrontOfQueue(android.os.Message.obtain(this.f1121a, 0, (int) (j >> 32), (int) j));
            } else {
                a(j);
            }
        }
    }

    private static void a(android.media.MediaFormat mediaFormat, int i) {
        mediaFormat.setFeatureEnabled("tunneled-playback", true);
        mediaFormat.setInteger("audio-session-id", i);
    }

    protected boolean d(long j, long j2) {
        return g(j) && j2 > androidx.media3.exoplayer.audio.SilenceSkippingAudioProcessor.DEFAULT_MINIMUM_SILENCE_DURATION_US;
    }

    protected void c(com.applovin.impl.gd gdVar, int i, long j) {
        com.applovin.impl.ko.a("skipVideoBuffer");
        gdVar.a(i, false);
        com.applovin.impl.ko.a();
        this.E0.f++;
    }

    protected boolean b(long j, boolean z) throws com.applovin.impl.z7 {
        int iB = b(j);
        if (iB == 0) {
            return false;
        }
        com.applovin.impl.m5 m5Var = this.E0;
        m5Var.i++;
        int i = this.e1 + iB;
        if (z) {
            m5Var.f += i;
        } else {
            f(i);
        }
        G();
        return true;
    }

    private boolean c(com.applovin.impl.jd jdVar) {
        return com.applovin.impl.xp.f1515a >= 23 && !this.o1 && !h(jdVar.f920a) && (!jdVar.g || com.applovin.impl.g7.b(this.J0));
    }

    protected void a(com.applovin.impl.gd gdVar, int i, long j) {
        com.applovin.impl.ko.a("dropVideoBuffer");
        gdVar.a(i, false);
        com.applovin.impl.ko.a();
        f(1);
    }

    @Override // com.applovin.impl.kd
    protected void b(com.applovin.impl.o5 o5Var) {
        boolean z = this.o1;
        if (!z) {
            this.e1++;
        }
        if (com.applovin.impl.xp.f1515a >= 23 || !z) {
            return;
        }
        i(o5Var.f);
    }

    protected void b(com.applovin.impl.gd gdVar, int i, long j) {
        j0();
        com.applovin.impl.ko.a("releaseOutputBuffer");
        gdVar.a(i, true);
        com.applovin.impl.ko.a();
        this.g1 = android.os.SystemClock.elapsedRealtime() * 1000;
        this.E0.e++;
        this.d1 = 0;
        h0();
    }

    private static int a(com.applovin.impl.jd jdVar, com.applovin.impl.e9 e9Var) {
        int iA;
        int iIntValue;
        int i = e9Var.r;
        int i2 = e9Var.s;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        java.lang.String str = e9Var.m;
        if (androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(str)) {
            android.util.Pair pairA = com.applovin.impl.md.a(e9Var);
            str = (pairA == null || !((iIntValue = ((java.lang.Integer) pairA.first).intValue()) == 512 || iIntValue == 1 || iIntValue == 2)) ? "video/hevc" : "video/avc";
        }
        str.hashCode();
        str.hashCode();
        int i3 = 4;
        switch (str) {
            case "video/3gpp":
            case "video/mp4v-es":
            case "video/x-vnd.on2.vp8":
                iA = i * i2;
                i3 = 2;
                return (iA * 3) / (i3 * 2);
            case "video/hevc":
            case "video/x-vnd.on2.vp9":
                iA = i * i2;
                return (iA * 3) / (i3 * 2);
            case "video/avc":
                java.lang.String str2 = com.applovin.impl.xp.d;
                if ("BRAVIA 4K 2015".equals(str2) || ("Amazon".equals(com.applovin.impl.xp.c) && ("KFSOWI".equals(str2) || ("AFTS".equals(str2) && jdVar.g)))) {
                    return -1;
                }
                iA = com.applovin.impl.xp.a(i, 16) * com.applovin.impl.xp.a(i2, 16) * 256;
                i3 = 2;
                return (iA * 3) / (i3 * 2);
            default:
                return -1;
        }
    }

    protected boolean b(long j, long j2, boolean z) {
        return g(j) && !z;
    }

    @Override // com.applovin.impl.kd
    protected boolean b(com.applovin.impl.jd jdVar) {
        return this.S0 != null || c(jdVar);
    }

    protected com.applovin.impl.od.a a(com.applovin.impl.jd jdVar, com.applovin.impl.e9 e9Var, com.applovin.impl.e9[] e9VarArr) {
        int iA;
        int iMax = e9Var.r;
        int iMax2 = e9Var.s;
        int iC = c(jdVar, e9Var);
        if (e9VarArr.length == 1) {
            if (iC != -1 && (iA = a(jdVar, e9Var)) != -1) {
                iC = java.lang.Math.min((int) (iC * 1.5f), iA);
            }
            return new com.applovin.impl.od.a(iMax, iMax2, iC);
        }
        int length = e9VarArr.length;
        boolean z = false;
        for (int i = 0; i < length; i++) {
            com.applovin.impl.e9 e9VarA = e9VarArr[i];
            if (e9Var.y != null && e9VarA.y == null) {
                e9VarA = e9VarA.a().a(e9Var.y).a();
            }
            if (jdVar.a(e9Var, e9VarA).d != 0) {
                int i2 = e9VarA.r;
                z |= i2 == -1 || e9VarA.s == -1;
                iMax = java.lang.Math.max(iMax, i2);
                iMax2 = java.lang.Math.max(iMax2, e9VarA.s);
                iC = java.lang.Math.max(iC, c(jdVar, e9VarA));
            }
        }
        if (z) {
            com.applovin.impl.oc.d("MediaCodecVideoRenderer", "Resolutions unknown. Codec max resolution: " + iMax + "x" + iMax2);
            android.graphics.Point pointB = b(jdVar, e9Var);
            if (pointB != null) {
                iMax = java.lang.Math.max(iMax, pointB.x);
                iMax2 = java.lang.Math.max(iMax2, pointB.y);
                iC = java.lang.Math.max(iC, a(jdVar, e9Var.a().q(iMax).g(iMax2).a()));
                com.applovin.impl.oc.d("MediaCodecVideoRenderer", "Codec max resolution adjusted to: " + iMax + "x" + iMax2);
            }
        }
        return new com.applovin.impl.od.a(iMax, iMax2, iC);
    }

    @Override // com.applovin.impl.kd
    protected float a(float f, com.applovin.impl.e9 e9Var, com.applovin.impl.e9[] e9VarArr) {
        float fMax = -1.0f;
        for (com.applovin.impl.e9 e9Var2 : e9VarArr) {
            float f2 = e9Var2.t;
            if (f2 != -1.0f) {
                fMax = java.lang.Math.max(fMax, f2);
            }
        }
        if (fMax == -1.0f) {
            return -1.0f;
        }
        return fMax * f;
    }

    @Override // com.applovin.impl.kd
    protected java.util.List a(com.applovin.impl.ld ldVar, com.applovin.impl.e9 e9Var, boolean z) {
        return a(ldVar, e9Var, z, this.o1);
    }

    private static java.util.List a(com.applovin.impl.ld ldVar, com.applovin.impl.e9 e9Var, boolean z, boolean z2) {
        android.util.Pair pairA;
        java.lang.String str = e9Var.m;
        if (str == null) {
            return java.util.Collections.emptyList();
        }
        java.util.List listA = com.applovin.impl.md.a(ldVar.a(str, z, z2), e9Var);
        if (androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(str) && (pairA = com.applovin.impl.md.a(e9Var)) != null) {
            int iIntValue = ((java.lang.Integer) pairA.first).intValue();
            if (iIntValue == 16 || iIntValue == 256) {
                listA.addAll(ldVar.a("video/hevc", z, z2));
            } else if (iIntValue == 512) {
                listA.addAll(ldVar.a("video/avc", z, z2));
            }
        }
        return java.util.Collections.unmodifiableList(listA);
    }

    @Override // com.applovin.impl.kd
    protected com.applovin.impl.gd.a a(com.applovin.impl.jd jdVar, com.applovin.impl.e9 e9Var, android.media.MediaCrypto mediaCrypto, float f) {
        com.applovin.impl.g7 g7Var = this.T0;
        if (g7Var != null && g7Var.f808a != jdVar.g) {
            g7Var.release();
            this.T0 = null;
        }
        java.lang.String str = jdVar.c;
        com.applovin.impl.od.a aVarA = a(jdVar, e9Var, t());
        this.P0 = aVarA;
        android.media.MediaFormat mediaFormatA = a(e9Var, str, aVarA, f, this.O0, this.o1 ? this.p1 : 0);
        if (this.S0 == null) {
            if (c(jdVar)) {
                if (this.T0 == null) {
                    this.T0 = com.applovin.impl.g7.a(this.J0, jdVar.g);
                }
                this.S0 = this.T0;
            } else {
                throw new java.lang.IllegalStateException();
            }
        }
        return com.applovin.impl.gd.a.a(jdVar, mediaFormatA, e9Var, this.S0, mediaCrypto);
    }

    protected android.media.MediaFormat a(com.applovin.impl.e9 e9Var, java.lang.String str, com.applovin.impl.od.a aVar, float f, boolean z, int i) {
        android.util.Pair pairA;
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("width", e9Var.r);
        mediaFormat.setInteger("height", e9Var.s);
        com.applovin.impl.rd.a(mediaFormat, e9Var.o);
        com.applovin.impl.rd.a(mediaFormat, "frame-rate", e9Var.t);
        com.applovin.impl.rd.a(mediaFormat, "rotation-degrees", e9Var.u);
        com.applovin.impl.rd.a(mediaFormat, e9Var.y);
        if (androidx.media3.common.MimeTypes.VIDEO_DOLBY_VISION.equals(e9Var.m) && (pairA = com.applovin.impl.md.a(e9Var)) != null) {
            com.applovin.impl.rd.a(mediaFormat, com.google.android.gms.common.Scopes.PROFILE, ((java.lang.Integer) pairA.first).intValue());
        }
        mediaFormat.setInteger("max-width", aVar.f1120a);
        mediaFormat.setInteger("max-height", aVar.b);
        com.applovin.impl.rd.a(mediaFormat, "max-input-size", aVar.c);
        if (com.applovin.impl.xp.f1515a >= 23) {
            mediaFormat.setInteger(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (z) {
            mediaFormat.setInteger("no-post-process", 1);
            mediaFormat.setInteger("auto-frc", 0);
        }
        if (i != 0) {
            a(mediaFormat, i);
        }
        return mediaFormat;
    }

    @Override // com.applovin.impl.kd
    protected void a(com.applovin.impl.o5 o5Var) {
        if (this.R0) {
            java.nio.ByteBuffer byteBuffer = (java.nio.ByteBuffer) com.applovin.impl.b1.a(o5Var.g);
            if (byteBuffer.remaining() >= 7) {
                byte b2 = byteBuffer.get();
                short s = byteBuffer.getShort();
                short s2 = byteBuffer.getShort();
                byte b3 = byteBuffer.get();
                byte b4 = byteBuffer.get();
                byteBuffer.position(0);
                if (b2 == -75 && s == 60 && s2 == 1 && b3 == 4 && b4 == 0) {
                    byte[] bArr = new byte[byteBuffer.remaining()];
                    byteBuffer.get(bArr);
                    byteBuffer.position(0);
                    a(I(), bArr);
                }
            }
        }
    }

    @Override // com.applovin.impl.e2, com.applovin.impl.rh.b
    public void a(int i, java.lang.Object obj) throws com.applovin.impl.z7 {
        if (i == 1) {
            a(obj);
            return;
        }
        if (i == 7) {
            this.r1 = (com.applovin.impl.uq) obj;
            return;
        }
        if (i == 10) {
            int iIntValue = ((java.lang.Integer) obj).intValue();
            if (this.p1 != iIntValue) {
                this.p1 = iIntValue;
                if (this.o1) {
                    U();
                    return;
                }
                return;
            }
            return;
        }
        if (i != 4) {
            if (i != 5) {
                super.a(i, obj);
                return;
            } else {
                this.K0.a(((java.lang.Integer) obj).intValue());
                return;
            }
        }
        this.V0 = ((java.lang.Integer) obj).intValue();
        com.applovin.impl.gd gdVarI = I();
        if (gdVarI != null) {
            gdVarI.c(this.V0);
        }
    }

    private void a(long j, long j2, com.applovin.impl.e9 e9Var) {
        com.applovin.impl.uq uqVar = this.r1;
        if (uqVar != null) {
            uqVar.a(j, j2, e9Var, L());
        }
    }

    @Override // com.applovin.impl.kd
    protected void a(java.lang.Exception exc) {
        com.applovin.impl.oc.a("MediaCodecVideoRenderer", "Video codec error", exc);
        this.L0.b(exc);
    }

    @Override // com.applovin.impl.kd
    protected void a(java.lang.String str, long j, long j2) {
        this.L0.a(str, j, j2);
        this.Q0 = h(str);
        this.R0 = ((com.applovin.impl.jd) com.applovin.impl.b1.a(J())).b();
        if (com.applovin.impl.xp.f1515a < 23 || !this.o1) {
            return;
        }
        this.q1 = new com.applovin.impl.od.b((com.applovin.impl.gd) com.applovin.impl.b1.a(I()));
    }

    @Override // com.applovin.impl.kd, com.applovin.impl.e2
    protected void a(boolean z, boolean z2) {
        super.a(z, z2);
        boolean z3 = q().f1338a;
        com.applovin.impl.b1.b((z3 && this.p1 == 0) ? false : true);
        if (this.o1 != z3) {
            this.o1 = z3;
            U();
        }
        this.L0.b(this.E0);
        this.K0.c();
        this.X0 = z2;
        this.Y0 = false;
    }

    @Override // com.applovin.impl.kd
    protected com.applovin.impl.p5 a(com.applovin.impl.f9 f9Var) throws com.applovin.impl.z7 {
        com.applovin.impl.p5 p5VarA = super.a(f9Var);
        this.L0.a(f9Var.b, p5VarA);
        return p5VarA;
    }

    @Override // com.applovin.impl.kd
    protected void a(com.applovin.impl.e9 e9Var, android.media.MediaFormat mediaFormat) {
        int integer;
        int integer2;
        com.applovin.impl.gd gdVarI = I();
        if (gdVarI != null) {
            gdVarI.c(this.V0);
        }
        if (this.o1) {
            this.j1 = e9Var.r;
            this.k1 = e9Var.s;
        } else {
            com.applovin.impl.b1.a(mediaFormat);
            boolean z = mediaFormat.containsKey("crop-right") && mediaFormat.containsKey("crop-left") && mediaFormat.containsKey("crop-bottom") && mediaFormat.containsKey("crop-top");
            if (z) {
                integer = (mediaFormat.getInteger("crop-right") - mediaFormat.getInteger("crop-left")) + 1;
            } else {
                integer = mediaFormat.getInteger("width");
            }
            this.j1 = integer;
            if (z) {
                integer2 = (mediaFormat.getInteger("crop-bottom") - mediaFormat.getInteger("crop-top")) + 1;
            } else {
                integer2 = mediaFormat.getInteger("height");
            }
            this.k1 = integer2;
        }
        float f = e9Var.v;
        this.m1 = f;
        if (com.applovin.impl.xp.f1515a >= 21) {
            int i = e9Var.u;
            if (i == 90 || i == 270) {
                int i2 = this.j1;
                this.j1 = this.k1;
                this.k1 = i2;
                this.m1 = 1.0f / f;
            }
        } else {
            this.l1 = e9Var.u;
        }
        this.K0.a(e9Var.t);
    }

    @Override // com.applovin.impl.kd, com.applovin.impl.e2
    protected void a(long j, boolean z) throws com.applovin.impl.z7 {
        super.a(j, z);
        c0();
        this.K0.d();
        this.f1 = androidx.media3.common.C.TIME_UNSET;
        this.Z0 = androidx.media3.common.C.TIME_UNSET;
        this.d1 = 0;
        if (z) {
            n0();
        } else {
            this.a1 = androidx.media3.common.C.TIME_UNSET;
        }
    }

    @Override // com.applovin.impl.kd
    protected boolean a(long j, long j2, com.applovin.impl.gd gdVar, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, com.applovin.impl.e9 e9Var) {
        com.applovin.impl.b1.a(gdVar);
        if (this.Z0 == androidx.media3.common.C.TIME_UNSET) {
            this.Z0 = j;
        }
        if (j3 != this.f1) {
            this.K0.b(j3);
            this.f1 = j3;
        }
        long jM = M();
        long j4 = j3 - jM;
        if (z && !z2) {
            c(gdVar, i, j4);
            return true;
        }
        double dN = N();
        boolean z3 = b() == 2;
        long jElapsedRealtime = android.os.SystemClock.elapsedRealtime() * 1000;
        long j5 = (long) ((j3 - j) / dN);
        if (z3) {
            j5 -= jElapsedRealtime - j2;
        }
        if (this.S0 == this.T0) {
            if (!g(j5)) {
                return false;
            }
            c(gdVar, i, j4);
            j(j5);
            return true;
        }
        long j6 = jElapsedRealtime - this.g1;
        boolean z4 = this.Y0 ? !this.W0 : z3 || this.X0;
        if (this.a1 == androidx.media3.common.C.TIME_UNSET && j >= jM && (z4 || (z3 && d(j5, j6)))) {
            long jNanoTime = java.lang.System.nanoTime();
            a(j4, jNanoTime, e9Var);
            if (com.applovin.impl.xp.f1515a >= 21) {
                a(gdVar, i, j4, jNanoTime);
            } else {
                b(gdVar, i, j4);
            }
            j(j5);
            return true;
        }
        if (z3 && j != this.Z0) {
            long jNanoTime2 = java.lang.System.nanoTime();
            long jA = this.K0.a((j5 * 1000) + jNanoTime2);
            long j7 = (jA - jNanoTime2) / 1000;
            boolean z5 = this.a1 != androidx.media3.common.C.TIME_UNSET;
            if (a(j7, j2, z2) && b(j, z5)) {
                return false;
            }
            if (b(j7, j2, z2)) {
                if (z5) {
                    c(gdVar, i, j4);
                } else {
                    a(gdVar, i, j4);
                }
                j(j7);
                return true;
            }
            if (com.applovin.impl.xp.f1515a >= 21) {
                if (j7 < 50000) {
                    a(j4, jA, e9Var);
                    a(gdVar, i, j4, jA);
                    j(j7);
                    return true;
                }
            } else if (j7 < 30000) {
                if (j7 > 11000) {
                    try {
                        java.lang.Thread.sleep((j7 - 10000) / 1000);
                    } catch (java.lang.InterruptedException unused) {
                        java.lang.Thread.currentThread().interrupt();
                        return false;
                    }
                }
                a(j4, jA, e9Var);
                b(gdVar, i, j4);
                j(j7);
                return true;
            }
        }
        return false;
    }

    protected void a(com.applovin.impl.gd gdVar, int i, long j, long j2) {
        j0();
        com.applovin.impl.ko.a("releaseOutputBuffer");
        gdVar.a(i, j2);
        com.applovin.impl.ko.a();
        this.g1 = android.os.SystemClock.elapsedRealtime() * 1000;
        this.E0.e++;
        this.d1 = 0;
        h0();
    }

    private static void a(com.applovin.impl.gd gdVar, byte[] bArr) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putByteArray("hdr10-plus-info", bArr);
        gdVar.a(bundle);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [com.applovin.impl.vq] */
    /* JADX WARN: Type inference failed for: r4v0, types: [com.applovin.impl.e2, com.applovin.impl.kd, com.applovin.impl.od] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [android.view.Surface] */
    /* JADX WARN: Type inference failed for: r5v6, types: [com.applovin.impl.g7] */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private void a(java.lang.Object obj) throws com.applovin.impl.z7 {
        ?? A;
        android.view.Surface surface;
        if (obj instanceof android.view.Surface) {
            surface = (android.view.Surface) obj;
        } else {
            A = 0;
        }
        if (A == 0) {
            com.applovin.impl.g7 g7Var = this.T0;
            if (g7Var != null) {
                A = surface;
                A = g7Var;
            } else {
                com.applovin.impl.jd jdVarJ = J();
                if (jdVarJ != null && c(jdVarJ)) {
                    A = surface;
                    A = com.applovin.impl.g7.a(this.J0, jdVarJ.g);
                    this.T0 = A;
                }
            }
        }
        A = surface;
        A = surface;
        A = surface;
        if (this.S0 != A) {
            this.S0 = A;
            this.K0.a(A);
            this.U0 = false;
            int iB = b();
            com.applovin.impl.gd gdVarI = I();
            if (gdVarI != null) {
                if (com.applovin.impl.xp.f1515a >= 23 && A != 0 && !this.Q0) {
                    a(gdVarI, A);
                } else {
                    U();
                    P();
                }
            }
            if (A != 0 && A != this.T0) {
                l0();
                c0();
                if (iB == 2) {
                    n0();
                    return;
                }
                return;
            }
            d0();
            c0();
            return;
        }
        if (A == 0 || A == this.T0) {
            return;
        }
        l0();
        k0();
    }

    protected void a(com.applovin.impl.gd gdVar, android.view.Surface surface) {
        gdVar.a(surface);
    }

    @Override // com.applovin.impl.kd, com.applovin.impl.qi
    public void a(float f, float f2) throws com.applovin.impl.z7 {
        super.a(f, f2);
        this.K0.b(f);
    }

    protected boolean a(long j, long j2, boolean z) {
        return h(j) && !z;
    }

    @Override // com.applovin.impl.kd
    protected int a(com.applovin.impl.ld ldVar, com.applovin.impl.e9 e9Var) {
        int i = 0;
        if (!com.applovin.impl.hf.i(e9Var.m)) {
            return com.applovin.impl.ri.a(0);
        }
        boolean z = e9Var.p != null;
        java.util.List listA = a(ldVar, e9Var, z, false);
        if (z && listA.isEmpty()) {
            listA = a(ldVar, e9Var, false, false);
        }
        if (listA.isEmpty()) {
            return com.applovin.impl.ri.a(1);
        }
        if (!com.applovin.impl.kd.d(e9Var)) {
            return com.applovin.impl.ri.a(2);
        }
        com.applovin.impl.jd jdVar = (com.applovin.impl.jd) listA.get(0);
        boolean zB = jdVar.b(e9Var);
        int i2 = jdVar.c(e9Var) ? 16 : 8;
        if (zB) {
            java.util.List listA2 = a(ldVar, e9Var, z, true);
            if (!listA2.isEmpty()) {
                com.applovin.impl.jd jdVar2 = (com.applovin.impl.jd) listA2.get(0);
                if (jdVar2.b(e9Var) && jdVar2.c(e9Var)) {
                    i = 32;
                }
            }
        }
        return com.applovin.impl.ri.a(zB ? 4 : 3, i2, i);
    }

    @Override // com.applovin.impl.kd
    protected com.applovin.impl.id a(java.lang.Throwable th, com.applovin.impl.jd jdVar) {
        return new com.applovin.impl.nd(th, jdVar, this.S0);
    }
}
