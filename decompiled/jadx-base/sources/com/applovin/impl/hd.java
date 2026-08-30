package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public class hd extends com.applovin.impl.kd implements com.applovin.impl.fd {
    private final android.content.Context J0;
    private final com.applovin.impl.q1.a K0;
    private final com.applovin.impl.r1 L0;
    private int M0;
    private boolean N0;
    private com.applovin.impl.e9 O0;
    private long P0;
    private boolean Q0;
    private boolean R0;
    private boolean S0;
    private boolean T0;
    private com.applovin.impl.qi.a U0;

    private static boolean c0() {
        if (com.applovin.impl.xp.f1515a == 23) {
            java.lang.String str = com.applovin.impl.xp.d;
            if ("ZTE B2017G".equals(str) || "AXON 7 mini".equals(str)) {
                return true;
            }
        }
        return false;
    }

    private static boolean h(java.lang.String str) {
        if (com.applovin.impl.xp.f1515a < 24 && "OMX.SEC.aac.dec".equals(str) && com.adjust.sdk.Constants.REFERRER_API_SAMSUNG.equals(com.applovin.impl.xp.c)) {
            java.lang.String str2 = com.applovin.impl.xp.b;
            if (str2.startsWith("zeroflte") || str2.startsWith("herolte") || str2.startsWith("heroqlte")) {
                return true;
            }
        }
        return false;
    }

    @Override // com.applovin.impl.qi, com.applovin.impl.ri
    public java.lang.String getName() {
        return "MediaCodecAudioRenderer";
    }

    @Override // com.applovin.impl.e2, com.applovin.impl.qi
    public com.applovin.impl.fd l() {
        return this;
    }

    public hd(android.content.Context context, com.applovin.impl.gd.b bVar, com.applovin.impl.ld ldVar, boolean z, android.os.Handler handler, com.applovin.impl.q1 q1Var, com.applovin.impl.r1 r1Var) {
        super(1, bVar, ldVar, z, 44100.0f);
        this.J0 = context.getApplicationContext();
        this.L0 = r1Var;
        this.K0 = new com.applovin.impl.q1.a(handler, q1Var);
        r1Var.a(new com.applovin.impl.hd.b());
    }

    @Override // com.applovin.impl.kd
    protected void g(java.lang.String str) {
        this.K0.a(str);
    }

    public hd(android.content.Context context, com.applovin.impl.ld ldVar, boolean z, android.os.Handler handler, com.applovin.impl.q1 q1Var, com.applovin.impl.r1 r1Var) {
        this(context, com.applovin.impl.gd.b.f820a, ldVar, z, handler, q1Var, r1Var);
    }

    @Override // com.applovin.impl.kd
    protected com.applovin.impl.p5 a(com.applovin.impl.jd jdVar, com.applovin.impl.e9 e9Var, com.applovin.impl.e9 e9Var2) {
        com.applovin.impl.p5 p5VarA = jdVar.a(e9Var, e9Var2);
        int i = p5VarA.e;
        if (a(jdVar, e9Var2) > this.M0) {
            i |= 64;
        }
        int i2 = i;
        return new com.applovin.impl.p5(jdVar.f920a, e9Var, e9Var2, i2 != 0 ? 0 : p5VarA.d, i2);
    }

    protected void d0() {
        this.R0 = true;
    }

    @Override // com.applovin.impl.kd, com.applovin.impl.e2
    protected void x() {
        super.x();
        this.L0.j();
    }

    @Override // com.applovin.impl.kd, com.applovin.impl.e2
    protected void y() {
        e0();
        this.L0.pause();
        super.y();
    }

    @Override // com.applovin.impl.kd, com.applovin.impl.e2
    protected void v() {
        this.S0 = true;
        try {
            this.L0.b();
            try {
                super.v();
            } finally {
                this.K0.a(this.E0);
            }
        } catch (java.lang.Throwable th) {
            try {
                super.v();
                throw th;
            } finally {
                this.K0.a(this.E0);
            }
        }
    }

    @Override // com.applovin.impl.kd, com.applovin.impl.e2
    protected void w() {
        try {
            super.w();
        } finally {
            if (this.S0) {
                this.S0 = false;
                this.L0.reset();
            }
        }
    }

    @Override // com.applovin.impl.kd, com.applovin.impl.qi
    public boolean c() {
        return super.c() && this.L0.c();
    }

    @Override // com.applovin.impl.kd, com.applovin.impl.qi
    public boolean d() {
        return this.L0.g() || super.d();
    }

    @Override // com.applovin.impl.fd
    public long p() {
        if (b() == 2) {
            e0();
        }
        return this.P0;
    }

    @Override // com.applovin.impl.kd
    protected void Q() {
        super.Q();
        this.L0.i();
    }

    @Override // com.applovin.impl.kd
    protected void V() throws com.applovin.impl.z7 {
        try {
            this.L0.f();
        } catch (com.applovin.impl.r1.e e) {
            throw a(e, e.c, e.b, 5002);
        }
    }

    @Override // com.applovin.impl.kd
    protected void b(com.applovin.impl.o5 o5Var) {
        if (!this.Q0 || o5Var.d()) {
            return;
        }
        if (java.lang.Math.abs(o5Var.f - this.P0) > 500000) {
            this.P0 = o5Var.f;
        }
        this.Q0 = false;
    }

    private void e0() {
        long jA = this.L0.a(c());
        if (jA != Long.MIN_VALUE) {
            if (!this.R0) {
                jA = java.lang.Math.max(this.P0, jA);
            }
            this.P0 = jA;
            this.R0 = false;
        }
    }

    private final class b implements com.applovin.impl.r1.c {
        private b() {
        }

        @Override // com.applovin.impl.r1.c
        public void b(long j) {
            if (com.applovin.impl.hd.this.U0 != null) {
                com.applovin.impl.hd.this.U0.a(j);
            }
        }

        @Override // com.applovin.impl.r1.c
        public void a(java.lang.Exception exc) {
            com.applovin.impl.oc.a("MediaCodecAudioRenderer", "Audio sink error", exc);
            com.applovin.impl.hd.this.K0.b(exc);
        }

        @Override // com.applovin.impl.r1.c
        public void b() {
            com.applovin.impl.hd.this.d0();
        }

        @Override // com.applovin.impl.r1.c
        public void a() {
            if (com.applovin.impl.hd.this.U0 != null) {
                com.applovin.impl.hd.this.U0.a();
            }
        }

        @Override // com.applovin.impl.r1.c
        public void a(long j) {
            com.applovin.impl.hd.this.K0.b(j);
        }

        @Override // com.applovin.impl.r1.c
        public void a(boolean z) {
            com.applovin.impl.hd.this.K0.b(z);
        }

        @Override // com.applovin.impl.r1.c
        public void a(int i, long j, long j2) {
            com.applovin.impl.hd.this.K0.b(i, j, j2);
        }
    }

    @Override // com.applovin.impl.kd
    protected boolean c(com.applovin.impl.e9 e9Var) {
        return this.L0.a(e9Var);
    }

    private int a(com.applovin.impl.jd jdVar, com.applovin.impl.e9 e9Var) {
        int i;
        if (!"OMX.google.raw.decoder".equals(jdVar.f920a) || (i = com.applovin.impl.xp.f1515a) >= 24 || (i == 23 && com.applovin.impl.xp.d(this.J0))) {
            return e9Var.n;
        }
        return -1;
    }

    protected int a(com.applovin.impl.jd jdVar, com.applovin.impl.e9 e9Var, com.applovin.impl.e9[] e9VarArr) {
        int iA = a(jdVar, e9Var);
        if (e9VarArr.length == 1) {
            return iA;
        }
        for (com.applovin.impl.e9 e9Var2 : e9VarArr) {
            if (jdVar.a(e9Var, e9Var2).d != 0) {
                iA = java.lang.Math.max(iA, a(jdVar, e9Var2));
            }
        }
        return iA;
    }

    @Override // com.applovin.impl.kd
    protected float a(float f, com.applovin.impl.e9 e9Var, com.applovin.impl.e9[] e9VarArr) {
        int iMax = -1;
        for (com.applovin.impl.e9 e9Var2 : e9VarArr) {
            int i = e9Var2.A;
            if (i != -1) {
                iMax = java.lang.Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return f * iMax;
    }

    @Override // com.applovin.impl.kd
    protected java.util.List a(com.applovin.impl.ld ldVar, com.applovin.impl.e9 e9Var, boolean z) {
        com.applovin.impl.jd jdVarA;
        java.lang.String str = e9Var.m;
        if (str == null) {
            return java.util.Collections.emptyList();
        }
        if (this.L0.a(e9Var) && (jdVarA = com.applovin.impl.md.a()) != null) {
            return java.util.Collections.singletonList(jdVarA);
        }
        java.util.List listA = com.applovin.impl.md.a(ldVar.a(str, z, false), e9Var);
        if (androidx.media3.common.MimeTypes.AUDIO_E_AC3_JOC.equals(str)) {
            java.util.ArrayList arrayList = new java.util.ArrayList(listA);
            arrayList.addAll(ldVar.a(androidx.media3.common.MimeTypes.AUDIO_E_AC3, z, false));
            listA = arrayList;
        }
        return java.util.Collections.unmodifiableList(listA);
    }

    @Override // com.applovin.impl.kd
    protected com.applovin.impl.gd.a a(com.applovin.impl.jd jdVar, com.applovin.impl.e9 e9Var, android.media.MediaCrypto mediaCrypto, float f) {
        this.M0 = a(jdVar, e9Var, t());
        this.N0 = h(jdVar.f920a);
        android.media.MediaFormat mediaFormatA = a(e9Var, jdVar.c, this.M0, f);
        this.O0 = (!androidx.media3.common.MimeTypes.AUDIO_RAW.equals(jdVar.b) || androidx.media3.common.MimeTypes.AUDIO_RAW.equals(e9Var.m)) ? null : e9Var;
        return com.applovin.impl.gd.a.a(jdVar, mediaFormatA, e9Var, mediaCrypto);
    }

    @Override // com.applovin.impl.fd
    public com.applovin.impl.ph a() {
        return this.L0.a();
    }

    @Override // com.applovin.impl.e2, com.applovin.impl.rh.b
    public void a(int i, java.lang.Object obj) {
        if (i == 2) {
            this.L0.a(((java.lang.Float) obj).floatValue());
            return;
        }
        if (i == 3) {
            this.L0.a((com.applovin.impl.l1) obj);
            return;
        }
        if (i != 6) {
            switch (i) {
                case 9:
                    this.L0.b(((java.lang.Boolean) obj).booleanValue());
                    break;
                case 10:
                    this.L0.a(((java.lang.Integer) obj).intValue());
                    break;
                case 11:
                    this.U0 = (com.applovin.impl.qi.a) obj;
                    break;
                default:
                    super.a(i, obj);
                    break;
            }
            return;
        }
        this.L0.a((com.applovin.impl.v1) obj);
    }

    @Override // com.applovin.impl.kd
    protected void a(java.lang.Exception exc) {
        com.applovin.impl.oc.a("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.K0.a(exc);
    }

    @Override // com.applovin.impl.kd
    protected void a(java.lang.String str, long j, long j2) {
        this.K0.a(str, j, j2);
    }

    @Override // com.applovin.impl.kd, com.applovin.impl.e2
    protected void a(boolean z, boolean z2) {
        super.a(z, z2);
        this.K0.b(this.E0);
        if (q().f1338a) {
            this.L0.e();
        } else {
            this.L0.d();
        }
    }

    @Override // com.applovin.impl.kd
    protected com.applovin.impl.p5 a(com.applovin.impl.f9 f9Var) throws com.applovin.impl.z7 {
        com.applovin.impl.p5 p5VarA = super.a(f9Var);
        this.K0.a(f9Var.b, p5VarA);
        return p5VarA;
    }

    @Override // com.applovin.impl.kd
    protected void a(com.applovin.impl.e9 e9Var, android.media.MediaFormat mediaFormat) throws com.applovin.impl.z7 {
        int iD;
        int i;
        com.applovin.impl.e9 e9Var2 = this.O0;
        int[] iArr = null;
        if (e9Var2 != null) {
            e9Var = e9Var2;
        } else if (I() != null) {
            if (androidx.media3.common.MimeTypes.AUDIO_RAW.equals(e9Var.m)) {
                iD = e9Var.B;
            } else if (com.applovin.impl.xp.f1515a >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                iD = mediaFormat.getInteger("pcm-encoding");
            } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                iD = com.applovin.impl.xp.d(mediaFormat.getInteger("v-bits-per-sample"));
            } else {
                iD = androidx.media3.common.MimeTypes.AUDIO_RAW.equals(e9Var.m) ? e9Var.B : 2;
            }
            com.applovin.impl.e9 e9VarA = new com.applovin.impl.e9.b().f(androidx.media3.common.MimeTypes.AUDIO_RAW).j(iD).e(e9Var.C).f(e9Var.D).c(mediaFormat.getInteger("channel-count")).n(mediaFormat.getInteger("sample-rate")).a();
            if (this.N0 && e9VarA.z == 6 && (i = e9Var.z) < 6) {
                int[] iArr2 = new int[i];
                for (int i2 = 0; i2 < e9Var.z; i2++) {
                    iArr2[i2] = i2;
                }
                iArr = iArr2;
            }
            e9Var = e9VarA;
        }
        try {
            this.L0.a(e9Var, 0, iArr);
        } catch (com.applovin.impl.r1.a e) {
            throw a(e, e.f1206a, 5001);
        }
    }

    @Override // com.applovin.impl.kd, com.applovin.impl.e2
    protected void a(long j, boolean z) throws com.applovin.impl.z7 {
        super.a(j, z);
        if (this.T0) {
            this.L0.h();
        } else {
            this.L0.b();
        }
        this.P0 = j;
        this.Q0 = true;
        this.R0 = true;
    }

    @Override // com.applovin.impl.kd
    protected boolean a(long j, long j2, com.applovin.impl.gd gdVar, java.nio.ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, com.applovin.impl.e9 e9Var) throws com.applovin.impl.z7 {
        com.applovin.impl.b1.a(byteBuffer);
        if (this.O0 != null && (i2 & 2) != 0) {
            ((com.applovin.impl.gd) com.applovin.impl.b1.a(gdVar)).a(i, false);
            return true;
        }
        if (z) {
            if (gdVar != null) {
                gdVar.a(i, false);
            }
            this.E0.f += i3;
            this.L0.i();
            return true;
        }
        try {
            if (!this.L0.a(byteBuffer, j3, i3)) {
                return false;
            }
            if (gdVar != null) {
                gdVar.a(i, false);
            }
            this.E0.e += i3;
            return true;
        } catch (com.applovin.impl.r1.b e) {
            throw a(e, e.c, e.b, 5001);
        } catch (com.applovin.impl.r1.e e2) {
            throw a(e2, e9Var, e2.b, 5002);
        }
    }

    @Override // com.applovin.impl.fd
    public void a(com.applovin.impl.ph phVar) {
        this.L0.a(phVar);
    }

    @Override // com.applovin.impl.kd
    protected int a(com.applovin.impl.ld ldVar, com.applovin.impl.e9 e9Var) {
        if (!com.applovin.impl.hf.g(e9Var.m)) {
            return com.applovin.impl.ri.a(0);
        }
        int i = com.applovin.impl.xp.f1515a >= 21 ? 32 : 0;
        boolean z = e9Var.F != 0;
        boolean zD = com.applovin.impl.kd.d(e9Var);
        int i2 = 8;
        if (zD && this.L0.a(e9Var) && (!z || com.applovin.impl.md.a() != null)) {
            return com.applovin.impl.ri.a(4, 8, i);
        }
        if (androidx.media3.common.MimeTypes.AUDIO_RAW.equals(e9Var.m) && !this.L0.a(e9Var)) {
            return com.applovin.impl.ri.a(1);
        }
        if (!this.L0.a(com.applovin.impl.xp.b(2, e9Var.z, e9Var.A))) {
            return com.applovin.impl.ri.a(1);
        }
        java.util.List listA = a(ldVar, e9Var, false);
        if (listA.isEmpty()) {
            return com.applovin.impl.ri.a(1);
        }
        if (!zD) {
            return com.applovin.impl.ri.a(2);
        }
        com.applovin.impl.jd jdVar = (com.applovin.impl.jd) listA.get(0);
        boolean zB = jdVar.b(e9Var);
        if (zB && jdVar.c(e9Var)) {
            i2 = 16;
        }
        return com.applovin.impl.ri.a(zB ? 4 : 3, i2, i);
    }

    protected android.media.MediaFormat a(com.applovin.impl.e9 e9Var, java.lang.String str, int i, float f) {
        android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", e9Var.z);
        mediaFormat.setInteger("sample-rate", e9Var.A);
        com.applovin.impl.rd.a(mediaFormat, e9Var.o);
        com.applovin.impl.rd.a(mediaFormat, "max-input-size", i);
        int i2 = com.applovin.impl.xp.f1515a;
        if (i2 >= 23) {
            mediaFormat.setInteger(com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_DOWNLOAD_PRIORITY, 0);
            if (f != -1.0f && !c0()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (i2 <= 28 && androidx.media3.common.MimeTypes.AUDIO_AC4.equals(e9Var.m)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (i2 >= 24 && this.L0.b(com.applovin.impl.xp.b(4, e9Var.z, e9Var.A)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        return mediaFormat;
    }
}
