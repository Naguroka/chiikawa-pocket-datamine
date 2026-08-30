package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class r5 implements com.applovin.impl.r1 {
    public static boolean a0 = false;
    private long A;
    private long B;
    private long C;
    private int D;
    private boolean E;
    private boolean F;
    private long G;
    private float H;
    private com.applovin.impl.p1[] I;
    private java.nio.ByteBuffer[] J;
    private java.nio.ByteBuffer K;
    private int L;
    private java.nio.ByteBuffer M;
    private byte[] N;
    private int O;
    private int P;
    private boolean Q;
    private boolean R;
    private boolean S;
    private boolean T;
    private int U;
    private com.applovin.impl.v1 V;
    private boolean W;
    private long X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.n1 f1212a;
    private final com.applovin.impl.r5.b b;
    private final boolean c;
    private final com.applovin.impl.d3 d;
    private final com.applovin.impl.zo e;
    private final com.applovin.impl.p1[] f;
    private final com.applovin.impl.p1[] g;
    private final android.os.ConditionVariable h;
    private final com.applovin.impl.u1 i;
    private final java.util.ArrayDeque j;
    private final boolean k;
    private final int l;
    private com.applovin.impl.r5.i m;
    private final com.applovin.impl.r5.g n;
    private final com.applovin.impl.r5.g o;
    private com.applovin.impl.r1.c p;
    private com.applovin.impl.r5.c q;
    private com.applovin.impl.r5.c r;
    private android.media.AudioTrack s;
    private com.applovin.impl.l1 t;
    private com.applovin.impl.r5.f u;
    private com.applovin.impl.r5.f v;
    private com.applovin.impl.ph w;
    private java.nio.ByteBuffer x;
    private int y;
    private long z;

    public interface b {
        long a(long j);

        com.applovin.impl.ph a(com.applovin.impl.ph phVar);

        boolean a(boolean z);

        com.applovin.impl.p1[] a();

        long b();
    }

    @Override // com.applovin.impl.r1
    public void h() {
        if (com.applovin.impl.xp.f1515a < 25) {
            b();
            return;
        }
        this.o.a();
        this.n.a();
        if (t()) {
            w();
            if (this.i.d()) {
                this.s.pause();
            }
            this.s.flush();
            this.i.g();
            com.applovin.impl.u1 u1Var = this.i;
            android.media.AudioTrack audioTrack = this.s;
            com.applovin.impl.r5.c cVar = this.r;
            u1Var.a(audioTrack, cVar.c == 2, cVar.g, cVar.d, cVar.h);
            this.F = true;
        }
    }

    private final class h implements com.applovin.impl.u1.a {
        @Override // com.applovin.impl.u1.a
        public void b(long j, long j2, long j3, long j4) {
            java.lang.String str = "Spurious audio timestamp (system clock mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + com.applovin.impl.r5.this.q() + ", " + com.applovin.impl.r5.this.r();
            if (com.applovin.impl.r5.a0) {
                throw new com.applovin.impl.r5.e(str, null);
            }
            com.applovin.impl.oc.d("DefaultAudioSink", str);
        }

        @Override // com.applovin.impl.u1.a
        public void b(long j) {
            com.applovin.impl.oc.d("DefaultAudioSink", "Ignoring impossibly large audio latency: " + j);
        }

        private h() {
        }

        @Override // com.applovin.impl.u1.a
        public void a(long j) {
            if (com.applovin.impl.r5.this.p != null) {
                com.applovin.impl.r5.this.p.a(j);
            }
        }

        /* synthetic */ h(com.applovin.impl.r5 r5Var, com.applovin.impl.r5.a aVar) {
            this();
        }

        @Override // com.applovin.impl.u1.a
        public void a(int i, long j) {
            if (com.applovin.impl.r5.this.p != null) {
                com.applovin.impl.r5.this.p.a(i, j, android.os.SystemClock.elapsedRealtime() - com.applovin.impl.r5.this.X);
            }
        }

        @Override // com.applovin.impl.u1.a
        public void a(long j, long j2, long j3, long j4) {
            java.lang.String str = "Spurious audio timestamp (frame position mismatch): " + j + ", " + j2 + ", " + j3 + ", " + j4 + ", " + com.applovin.impl.r5.this.q() + ", " + com.applovin.impl.r5.this.r();
            if (!com.applovin.impl.r5.a0) {
                com.applovin.impl.oc.d("DefaultAudioSink", str);
                return;
            }
            throw new com.applovin.impl.r5.e(str, null);
        }
    }

    private static boolean e(int i2) {
        return (com.applovin.impl.xp.f1515a >= 24 && i2 == -6) || i2 == -32;
    }

    @Override // com.applovin.impl.r1
    public void e() {
        com.applovin.impl.b1.b(com.applovin.impl.xp.f1515a >= 21);
        com.applovin.impl.b1.b(this.T);
        if (this.W) {
            return;
        }
        this.W = true;
        b();
    }

    public static final class e extends java.lang.RuntimeException {
        private e(java.lang.String str) {
            super(str);
        }

        /* synthetic */ e(java.lang.String str, com.applovin.impl.r5.a aVar) {
            this(str);
        }
    }

    public static class d implements com.applovin.impl.r5.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.p1[] f1215a;
        private final com.applovin.impl.ak b;
        private final com.applovin.impl.ok c;

        public d(com.applovin.impl.p1... p1VarArr) {
            this(p1VarArr, new com.applovin.impl.ak(), new com.applovin.impl.ok());
        }

        @Override // com.applovin.impl.r5.b
        public com.applovin.impl.ph a(com.applovin.impl.ph phVar) {
            this.c.b(phVar.f1145a);
            this.c.a(phVar.b);
            return phVar;
        }

        @Override // com.applovin.impl.r5.b
        public long b() {
            return this.b.j();
        }

        public d(com.applovin.impl.p1[] p1VarArr, com.applovin.impl.ak akVar, com.applovin.impl.ok okVar) {
            com.applovin.impl.p1[] p1VarArr2 = new com.applovin.impl.p1[p1VarArr.length + 2];
            this.f1215a = p1VarArr2;
            java.lang.System.arraycopy(p1VarArr, 0, p1VarArr2, 0, p1VarArr.length);
            this.b = akVar;
            this.c = okVar;
            p1VarArr2[p1VarArr.length] = akVar;
            p1VarArr2[p1VarArr.length + 1] = okVar;
        }

        @Override // com.applovin.impl.r5.b
        public boolean a(boolean z) {
            this.b.a(z);
            return z;
        }

        @Override // com.applovin.impl.r5.b
        public com.applovin.impl.p1[] a() {
            return this.f1215a;
        }

        @Override // com.applovin.impl.r5.b
        public long a(long j) {
            return this.c.a(j);
        }
    }

    public r5(com.applovin.impl.n1 n1Var, com.applovin.impl.r5.b bVar, boolean z, boolean z2, int i2) {
        this.f1212a = n1Var;
        this.b = (com.applovin.impl.r5.b) com.applovin.impl.b1.a(bVar);
        int i3 = com.applovin.impl.xp.f1515a;
        this.c = i3 >= 21 && z;
        this.k = i3 >= 23 && z2;
        this.l = i3 >= 29 ? i2 : 0;
        this.h = new android.os.ConditionVariable(true);
        this.i = new com.applovin.impl.u1(new com.applovin.impl.r5.h(this, null));
        com.applovin.impl.d3 d3Var = new com.applovin.impl.d3();
        this.d = d3Var;
        com.applovin.impl.zo zoVar = new com.applovin.impl.zo();
        this.e = zoVar;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Collections.addAll(arrayList, new com.applovin.impl.wi(), d3Var, zoVar);
        java.util.Collections.addAll(arrayList, bVar.a());
        this.f = (com.applovin.impl.p1[]) arrayList.toArray(new com.applovin.impl.p1[0]);
        this.g = new com.applovin.impl.p1[]{new com.applovin.impl.b9()};
        this.H = 1.0f;
        this.t = com.applovin.impl.l1.g;
        this.U = 0;
        this.V = new com.applovin.impl.v1(0, 0.0f);
        com.applovin.impl.ph phVar = com.applovin.impl.ph.d;
        this.v = new com.applovin.impl.r5.f(phVar, false, 0L, 0L, null);
        this.w = phVar;
        this.P = -1;
        this.I = new com.applovin.impl.p1[0];
        this.J = new java.nio.ByteBuffer[0];
        this.j = new java.util.ArrayDeque();
        this.n = new com.applovin.impl.r5.g(100L);
        this.o = new com.applovin.impl.r5.g(100L);
    }

    private void y() {
        com.applovin.impl.p1[] p1VarArr = this.r.i;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (com.applovin.impl.p1 p1Var : p1VarArr) {
            if (p1Var.f()) {
                arrayList.add(p1Var);
            } else {
                p1Var.b();
            }
        }
        int size = arrayList.size();
        this.I = (com.applovin.impl.p1[]) arrayList.toArray(new com.applovin.impl.p1[size]);
        this.J = new java.nio.ByteBuffer[size];
        m();
    }

    private void m() {
        int i2 = 0;
        while (true) {
            com.applovin.impl.p1[] p1VarArr = this.I;
            if (i2 >= p1VarArr.length) {
                return;
            }
            com.applovin.impl.p1 p1Var = p1VarArr[i2];
            p1Var.b();
            this.J[i2] = p1Var.d();
            i2++;
        }
    }

    private void s() throws com.applovin.impl.r1.b {
        this.h.block();
        android.media.AudioTrack audioTrackK = k();
        this.s = audioTrackK;
        if (a(audioTrackK)) {
            b(this.s);
            if (this.l != 3) {
                android.media.AudioTrack audioTrack = this.s;
                com.applovin.impl.e9 e9Var = this.r.f1214a;
                audioTrack.setOffloadDelayPadding(e9Var.C, e9Var.D);
            }
        }
        this.U = this.s.getAudioSessionId();
        com.applovin.impl.u1 u1Var = this.i;
        android.media.AudioTrack audioTrack2 = this.s;
        com.applovin.impl.r5.c cVar = this.r;
        u1Var.a(audioTrack2, cVar.c == 2, cVar.g, cVar.d, cVar.h);
        x();
        int i2 = this.V.f1416a;
        if (i2 != 0) {
            this.s.attachAuxEffect(i2);
            this.s.setAuxEffectSendLevel(this.V.b);
        }
        this.F = true;
    }

    @Override // com.applovin.impl.r1
    public void j() {
        this.S = true;
        if (t()) {
            this.i.i();
            this.s.play();
        }
    }

    @Override // com.applovin.impl.r1
    public void i() {
        this.E = true;
    }

    private android.media.AudioTrack k() throws com.applovin.impl.r1.b {
        try {
            return ((com.applovin.impl.r5.c) com.applovin.impl.b1.a(this.r)).a(this.W, this.t, this.U);
        } catch (com.applovin.impl.r1.b e2) {
            u();
            com.applovin.impl.r1.c cVar = this.p;
            if (cVar != null) {
                cVar.a(e2);
            }
            throw e2;
        }
    }

    private void u() {
        if (this.r.b()) {
            this.Y = true;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    /* JADX WARN: Code duplicated, block: B:14:0x0028 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:15:0x0029  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0029 -> B:5:0x0009). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    private boolean l() {
        /*
            r9 = this;
            int r0 = r9.P
            r1 = 1
            r2 = 0
            r3 = -1
            if (r0 != r3) goto Lb
            r9.P = r2
        L9:
            r0 = r1
            goto Lc
        Lb:
            r0 = r2
        Lc:
            int r4 = r9.P
            com.applovin.impl.p1[] r5 = r9.I
            int r6 = r5.length
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 >= r6) goto L2f
            r4 = r5[r4]
            if (r0 == 0) goto L1f
            r4.e()
        L1f:
            r9.d(r7)
            boolean r0 = r4.c()
            if (r0 != 0) goto L29
            return r2
        L29:
            int r0 = r9.P
            int r0 = r0 + r1
            r9.P = r0
            goto L9
        L2f:
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L3b
            r9.a(r0, r7)
            java.nio.ByteBuffer r0 = r9.M
            if (r0 == 0) goto L3b
            return r2
        L3b:
            r9.P = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.r5.l():boolean");
    }

    @Override // com.applovin.impl.r1
    public void f() {
        if (!this.Q && t() && l()) {
            v();
            this.Q = true;
        }
    }

    public boolean p() {
        return o().b;
    }

    @Override // com.applovin.impl.r1
    public boolean g() {
        return t() && this.i.e(r());
    }

    private void x() {
        if (t()) {
            if (com.applovin.impl.xp.f1515a >= 21) {
                a(this.s, this.H);
            } else {
                b(this.s, this.H);
            }
        }
    }

    @Override // com.applovin.impl.r1
    public void pause() {
        this.S = false;
        if (t() && this.i.f()) {
            this.s.pause();
        }
    }

    class a extends java.lang.Thread {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ android.media.AudioTrack f1213a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(java.lang.String str, android.media.AudioTrack audioTrack) {
            super(str);
            this.f1213a = audioTrack;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            try {
                this.f1213a.flush();
                this.f1213a.release();
            } finally {
                com.applovin.impl.r5.this.h.open();
            }
        }
    }

    @Override // com.applovin.impl.r1
    public void d() {
        if (this.W) {
            this.W = false;
            b();
        }
    }

    @Override // com.applovin.impl.r1
    public void reset() {
        b();
        for (com.applovin.impl.p1 p1Var : this.f) {
            p1Var.reset();
        }
        for (com.applovin.impl.p1 p1Var2 : this.g) {
            p1Var2.reset();
        }
        this.S = false;
        this.Y = false;
    }

    private void w() {
        this.z = 0L;
        this.A = 0L;
        this.B = 0L;
        this.C = 0L;
        this.Z = false;
        this.D = 0;
        this.v = new com.applovin.impl.r5.f(n(), p(), 0L, 0L, null);
        this.G = 0L;
        this.u = null;
        this.j.clear();
        this.K = null;
        this.L = 0;
        this.M = null;
        this.R = false;
        this.Q = false;
        this.P = -1;
        this.x = null;
        this.y = 0;
        this.e.k();
        m();
    }

    private com.applovin.impl.ph n() {
        return o().f1216a;
    }

    private com.applovin.impl.r5.f o() {
        com.applovin.impl.r5.f fVar = this.u;
        if (fVar != null) {
            return fVar;
        }
        if (!this.j.isEmpty()) {
            return (com.applovin.impl.r5.f) this.j.getLast();
        }
        return this.v;
    }

    private boolean z() {
        return (this.W || !androidx.media3.common.MimeTypes.AUDIO_RAW.equals(this.r.f1214a.m) || f(this.r.f1214a.B)) ? false : true;
    }

    private boolean t() {
        return this.s != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long q() {
        com.applovin.impl.r5.c cVar = this.r;
        if (cVar.c == 0) {
            return this.z / ((long) cVar.b);
        }
        return this.A;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long r() {
        com.applovin.impl.r5.c cVar = this.r;
        if (cVar.c == 0) {
            return this.B / ((long) cVar.d);
        }
        return this.C;
    }

    private void a(long j) {
        com.applovin.impl.ph phVarA;
        if (z()) {
            phVarA = this.b.a(n());
        } else {
            phVarA = com.applovin.impl.ph.d;
        }
        com.applovin.impl.ph phVar = phVarA;
        boolean zA = z() ? this.b.a(p()) : false;
        this.j.add(new com.applovin.impl.r5.f(phVar, zA, java.lang.Math.max(0L, j), this.r.b(r()), null));
        y();
        com.applovin.impl.r1.c cVar = this.p;
        if (cVar != null) {
            cVar.a(zA);
        }
    }

    private long c(long j) {
        return j + this.r.b(this.b.b());
    }

    private long b(long j) {
        while (!this.j.isEmpty() && j >= ((com.applovin.impl.r5.f) this.j.getFirst()).d) {
            this.v = (com.applovin.impl.r5.f) this.j.remove();
        }
        com.applovin.impl.r5.f fVar = this.v;
        long j2 = j - fVar.d;
        if (fVar.f1216a.equals(com.applovin.impl.ph.d)) {
            return this.v.c + j2;
        }
        if (this.j.isEmpty()) {
            return this.v.c + this.b.a(j2);
        }
        com.applovin.impl.r5.f fVar2 = (com.applovin.impl.r5.f) this.j.getFirst();
        return fVar2.c - com.applovin.impl.xp.a(fVar2.d - j, this.v.f1216a.f1145a);
    }

    private void v() {
        if (this.R) {
            return;
        }
        this.R = true;
        this.i.d(r());
        this.s.stop();
        this.y = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final android.os.Handler f1219a = new android.os.Handler();
        private final android.media.AudioTrack.StreamEventCallback b;

        public i() {
            this.b = new com.applovin.impl.r5.i.a(com.applovin.impl.r5.this);
        }

        class a extends android.media.AudioTrack.StreamEventCallback {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ com.applovin.impl.r5 f1220a;

            a(com.applovin.impl.r5 r5Var) {
                this.f1220a = r5Var;
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onDataRequest(android.media.AudioTrack audioTrack, int i) {
                com.applovin.impl.b1.b(audioTrack == com.applovin.impl.r5.this.s);
                if (com.applovin.impl.r5.this.p == null || !com.applovin.impl.r5.this.S) {
                    return;
                }
                com.applovin.impl.r5.this.p.a();
            }

            @Override // android.media.AudioTrack.StreamEventCallback
            public void onTearDown(android.media.AudioTrack audioTrack) {
                com.applovin.impl.b1.b(audioTrack == com.applovin.impl.r5.this.s);
                if (com.applovin.impl.r5.this.p == null || !com.applovin.impl.r5.this.S) {
                    return;
                }
                com.applovin.impl.r5.this.p.a();
            }
        }

        public void a(android.media.AudioTrack audioTrack) {
            final android.os.Handler handler = this.f1219a;
            java.util.Objects.requireNonNull(handler);
            audioTrack.registerStreamEventCallback(new java.util.concurrent.Executor() { // from class: com.applovin.impl.r5$i$$ExternalSyntheticLambda0
                @Override // java.util.concurrent.Executor
                public final void execute(java.lang.Runnable runnable) {
                    handler.post(runnable);
                }
            }, this.b);
        }

        public void b(android.media.AudioTrack audioTrack) {
            audioTrack.unregisterStreamEventCallback(this.b);
            this.f1219a.removeCallbacksAndMessages(null);
        }
    }

    private static final class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.ph f1216a;
        public final boolean b;
        public final long c;
        public final long d;

        private f(com.applovin.impl.ph phVar, boolean z, long j, long j2) {
            this.f1216a = phVar;
            this.b = z;
            this.c = j;
            this.d = j2;
        }

        /* synthetic */ f(com.applovin.impl.ph phVar, boolean z, long j, long j2, com.applovin.impl.r5.a aVar) {
            this(phVar, z, j, j2);
        }
    }

    private static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.applovin.impl.e9 f1214a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final com.applovin.impl.p1[] i;

        public c(com.applovin.impl.e9 e9Var, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, com.applovin.impl.p1[] p1VarArr) {
            this.f1214a = e9Var;
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
            this.f = i5;
            this.g = i6;
            this.i = p1VarArr;
            this.h = a(i7, z);
        }

        public long b(long j) {
            return (j * 1000000) / ((long) this.e);
        }

        public android.media.AudioTrack a(boolean z, com.applovin.impl.l1 l1Var, int i) throws com.applovin.impl.r1.b {
            try {
                android.media.AudioTrack audioTrackB = b(z, l1Var, i);
                int state = audioTrackB.getState();
                if (state == 1) {
                    return audioTrackB;
                }
                try {
                    audioTrackB.release();
                } catch (java.lang.Exception unused) {
                }
                throw new com.applovin.impl.r1.b(state, this.e, this.f, this.h, this.f1214a, b(), null);
            } catch (java.lang.IllegalArgumentException | java.lang.UnsupportedOperationException e) {
                throw new com.applovin.impl.r1.b(0, this.e, this.f, this.h, this.f1214a, b(), e);
            }
        }

        private android.media.AudioTrack d(boolean z, com.applovin.impl.l1 l1Var, int i) {
            return new android.media.AudioTrack.Builder().setAudioAttributes(a(l1Var, z)).setAudioFormat(com.applovin.impl.r5.b(this.e, this.f, this.g)).setTransferMode(1).setBufferSizeInBytes(this.h).setSessionId(i).setOffloadedPlayback(this.c == 1).build();
        }

        private int c(long j) {
            int iD = com.applovin.impl.r5.d(this.g);
            if (this.g == 5) {
                iD *= 2;
            }
            return (int) ((j * ((long) iD)) / 1000000);
        }

        private android.media.AudioTrack c(boolean z, com.applovin.impl.l1 l1Var, int i) {
            return new android.media.AudioTrack(a(l1Var, z), com.applovin.impl.r5.b(this.e, this.f, this.g), this.h, 1, i);
        }

        public boolean a(com.applovin.impl.r5.c cVar) {
            return cVar.c == this.c && cVar.g == this.g && cVar.e == this.e && cVar.f == this.f && cVar.d == this.d;
        }

        public long d(long j) {
            return (j * 1000000) / ((long) this.f1214a.A);
        }

        public boolean b() {
            return this.c == 1;
        }

        private android.media.AudioTrack b(boolean z, com.applovin.impl.l1 l1Var, int i) {
            int i2 = com.applovin.impl.xp.f1515a;
            if (i2 >= 29) {
                return d(z, l1Var, i);
            }
            if (i2 >= 21) {
                return c(z, l1Var, i);
            }
            return a(l1Var, i);
        }

        private int a(int i, boolean z) {
            if (i != 0) {
                return i;
            }
            int i2 = this.c;
            if (i2 == 0) {
                return a(z ? 8.0f : 1.0f);
            }
            if (i2 == 1) {
                return c(50000000L);
            }
            if (i2 == 2) {
                return c(250000L);
            }
            throw new java.lang.IllegalStateException();
        }

        private android.media.AudioTrack a(com.applovin.impl.l1 l1Var, int i) {
            int iE = com.applovin.impl.xp.e(l1Var.c);
            if (i == 0) {
                return new android.media.AudioTrack(iE, this.e, this.f, this.g, this.h, 1);
            }
            return new android.media.AudioTrack(iE, this.e, this.f, this.g, this.h, 1, i);
        }

        public long a(long j) {
            return (j * ((long) this.e)) / 1000000;
        }

        private static android.media.AudioAttributes a(com.applovin.impl.l1 l1Var, boolean z) {
            if (z) {
                return a();
            }
            return l1Var.a();
        }

        private int a(float f) {
            int minBufferSize = android.media.AudioTrack.getMinBufferSize(this.e, this.f, this.g);
            com.applovin.impl.b1.b(minBufferSize != -2);
            int iA = com.applovin.impl.xp.a(minBufferSize * 4, ((int) a(250000L)) * this.d, java.lang.Math.max(minBufferSize, ((int) a(750000L)) * this.d));
            return f != 1.0f ? java.lang.Math.round(iA * f) : iA;
        }

        private static android.media.AudioAttributes a() {
            return new android.media.AudioAttributes.Builder().setContentType(3).setFlags(16).setUsage(1).build();
        }
    }

    @Override // com.applovin.impl.r1
    public void a(com.applovin.impl.e9 e9Var, int i2, int[] iArr) throws com.applovin.impl.r1.a {
        int iB;
        com.applovin.impl.p1[] p1VarArr;
        int iIntValue;
        int i3;
        int i4;
        int iIntValue2;
        int i5;
        com.applovin.impl.p1[] p1VarArr2;
        int[] iArr2;
        if (androidx.media3.common.MimeTypes.AUDIO_RAW.equals(e9Var.m)) {
            com.applovin.impl.b1.a(com.applovin.impl.xp.g(e9Var.B));
            int iB2 = com.applovin.impl.xp.b(e9Var.B, e9Var.z);
            if (f(e9Var.B)) {
                p1VarArr2 = this.g;
            } else {
                p1VarArr2 = this.f;
            }
            this.e.a(e9Var.C, e9Var.D);
            if (com.applovin.impl.xp.f1515a < 21 && e9Var.z == 8 && iArr == null) {
                iArr2 = new int[6];
                for (int i6 = 0; i6 < 6; i6++) {
                    iArr2[i6] = i6;
                }
            } else {
                iArr2 = iArr;
            }
            this.d.a(iArr2);
            com.applovin.impl.p1.a aVar = new com.applovin.impl.p1.a(e9Var.A, e9Var.z, e9Var.B);
            for (com.applovin.impl.p1 p1Var : p1VarArr2) {
                try {
                    com.applovin.impl.p1.a aVarA = p1Var.a(aVar);
                    if (p1Var.f()) {
                        aVar = aVarA;
                    }
                } catch (com.applovin.impl.p1.b e2) {
                    throw new com.applovin.impl.r1.a(e2, e9Var);
                }
            }
            int i7 = aVar.c;
            i3 = aVar.f1139a;
            iIntValue2 = com.applovin.impl.xp.a(aVar.b);
            p1VarArr = p1VarArr2;
            iIntValue = i7;
            i4 = iB2;
            iB = com.applovin.impl.xp.b(i7, aVar.b);
            i5 = 0;
        } else {
            com.applovin.impl.p1[] p1VarArr3 = new com.applovin.impl.p1[0];
            int i8 = e9Var.A;
            iB = -1;
            if (a(e9Var, this.t)) {
                p1VarArr = p1VarArr3;
                iIntValue = com.applovin.impl.hf.b((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) e9Var.m), e9Var.j);
                i5 = 1;
                iIntValue2 = com.applovin.impl.xp.a(e9Var.z);
                i3 = i8;
                i4 = -1;
            } else {
                android.util.Pair pairA = a(e9Var, this.f1212a);
                if (pairA != null) {
                    p1VarArr = p1VarArr3;
                    iIntValue = ((java.lang.Integer) pairA.first).intValue();
                    i3 = i8;
                    i4 = -1;
                    iIntValue2 = ((java.lang.Integer) pairA.second).intValue();
                    i5 = 2;
                } else {
                    throw new com.applovin.impl.r1.a("Unable to configure passthrough for: " + e9Var, e9Var);
                }
            }
        }
        if (iIntValue == 0) {
            throw new com.applovin.impl.r1.a("Invalid output encoding (mode=" + i5 + ") for: " + e9Var, e9Var);
        }
        if (iIntValue2 != 0) {
            this.Y = false;
            com.applovin.impl.r5.c cVar = new com.applovin.impl.r5.c(e9Var, i4, i5, iB, i3, iIntValue2, iIntValue, i2, this.k, p1VarArr);
            if (t()) {
                this.q = cVar;
                return;
            } else {
                this.r = cVar;
                return;
            }
        }
        throw new com.applovin.impl.r1.a("Invalid output channel config (mode=" + i5 + ") for: " + e9Var, e9Var);
    }

    private static final class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final long f1217a;
        private java.lang.Exception b;
        private long c;

        public g(long j) {
            this.f1217a = j;
        }

        public void a() {
            this.b = null;
        }

        public void a(java.lang.Exception exc) throws java.lang.Exception {
            long jElapsedRealtime = android.os.SystemClock.elapsedRealtime();
            if (this.b == null) {
                this.b = exc;
                this.c = this.f1217a + jElapsedRealtime;
            }
            if (jElapsedRealtime >= this.c) {
                java.lang.Exception exc2 = this.b;
                if (exc2 != exc) {
                    exc2.addSuppressed(exc);
                }
                java.lang.Exception exc3 = this.b;
                a();
                throw exc3;
            }
        }
    }

    private boolean f(int i2) {
        return this.c && com.applovin.impl.xp.f(i2);
    }

    @Override // com.applovin.impl.r1
    public boolean c() {
        return !t() || (this.Q && !g());
    }

    private static int c(int i2) {
        int i3 = com.applovin.impl.xp.f1515a;
        if (i3 <= 28) {
            if (i2 == 7) {
                i2 = 8;
            } else if (i2 == 3 || i2 == 4 || i2 == 5) {
                i2 = 6;
            }
        }
        if (i3 <= 26 && "fugu".equals(com.applovin.impl.xp.b) && i2 == 1) {
            i2 = 2;
        }
        return com.applovin.impl.xp.a(i2);
    }

    @Override // com.applovin.impl.r1
    public long a(boolean z) {
        if (!t() || this.F) {
            return Long.MIN_VALUE;
        }
        return c(b(java.lang.Math.min(this.i.a(z), this.r.b(r()))));
    }

    @Override // com.applovin.impl.r1
    public void b() {
        if (t()) {
            w();
            if (this.i.d()) {
                this.s.pause();
            }
            if (a(this.s)) {
                ((com.applovin.impl.r5.i) com.applovin.impl.b1.a(this.m)).b(this.s);
            }
            android.media.AudioTrack audioTrack = this.s;
            this.s = null;
            if (com.applovin.impl.xp.f1515a < 21 && !this.T) {
                this.U = 0;
            }
            com.applovin.impl.r5.c cVar = this.q;
            if (cVar != null) {
                this.r = cVar;
                this.q = null;
            }
            this.i.g();
            this.h.close();
            new com.applovin.impl.r5.a("ExoPlayer:AudioTrackReleaseThread", audioTrack).start();
        }
        this.o.a();
        this.n.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int d(int i2) {
        switch (i2) {
            case 5:
                return androidx.media3.extractor.Ac3Util.AC3_MAX_RATE_BYTES_PER_SECOND;
            case 6:
            case 18:
                return 768000;
            case 7:
                return androidx.media3.extractor.DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND;
            case 8:
                return androidx.media3.extractor.DtsUtil.DTS_HD_MAX_RATE_BYTES_PER_SECOND;
            case 9:
                return androidx.media3.extractor.MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND;
            case 10:
                return androidx.media3.extractor.AacUtil.AAC_LC_MAX_RATE_BYTES_PER_SECOND;
            case 11:
                return androidx.media3.extractor.AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND;
            case 12:
                return 7000;
            case 13:
            default:
                throw new java.lang.IllegalArgumentException();
            case 14:
                return androidx.media3.extractor.Ac3Util.TRUEHD_MAX_RATE_BYTES_PER_SECOND;
            case 15:
                return 8000;
            case 16:
                return androidx.media3.extractor.AacUtil.AAC_XHE_MAX_RATE_BYTES_PER_SECOND;
            case 17:
                return androidx.media3.extractor.Ac4Util.MAX_RATE_BYTES_PER_SECOND;
        }
    }

    @Override // com.applovin.impl.r1
    public int b(com.applovin.impl.e9 e9Var) {
        if (!androidx.media3.common.MimeTypes.AUDIO_RAW.equals(e9Var.m)) {
            return ((this.Y || !a(e9Var, this.t)) && !b(e9Var, this.f1212a)) ? 0 : 2;
        }
        if (!com.applovin.impl.xp.g(e9Var.B)) {
            com.applovin.impl.oc.d("DefaultAudioSink", "Invalid PCM encoding: " + e9Var.B);
            return 0;
        }
        int i2 = e9Var.B;
        return (i2 == 2 || (this.c && i2 == 4)) ? 2 : 1;
    }

    private void d(long j) throws java.lang.Exception {
        java.nio.ByteBuffer byteBuffer;
        int length = this.I.length;
        int i2 = length;
        while (i2 >= 0) {
            if (i2 > 0) {
                byteBuffer = this.J[i2 - 1];
            } else {
                byteBuffer = this.K;
                if (byteBuffer == null) {
                    byteBuffer = com.applovin.impl.p1.f1138a;
                }
            }
            if (i2 == length) {
                a(byteBuffer, j);
            } else {
                com.applovin.impl.p1 p1Var = this.I[i2];
                if (i2 > this.P) {
                    p1Var.a(byteBuffer);
                }
                java.nio.ByteBuffer byteBufferD = p1Var.d();
                this.J[i2] = byteBufferD;
                if (byteBufferD.hasRemaining()) {
                    i2++;
                }
            }
            if (byteBuffer.hasRemaining()) {
                return;
            } else {
                i2--;
            }
        }
    }

    private static android.util.Pair a(com.applovin.impl.e9 e9Var, com.applovin.impl.n1 n1Var) {
        if (n1Var == null) {
            return null;
        }
        int iB = com.applovin.impl.hf.b((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) e9Var.m), e9Var.j);
        int iA = 6;
        if (iB != 5 && iB != 6 && iB != 18 && iB != 17 && iB != 7 && iB != 8 && iB != 14) {
            return null;
        }
        if (iB == 18 && !n1Var.a(18)) {
            iB = 6;
        } else if (iB == 8 && !n1Var.a(8)) {
            iB = 7;
        }
        if (!n1Var.a(iB)) {
            return null;
        }
        if (iB == 18) {
            if (com.applovin.impl.xp.f1515a >= 29 && (iA = a(18, e9Var.A)) == 0) {
                com.applovin.impl.oc.d("DefaultAudioSink", "E-AC3 JOC encoding supported but no channel count supported");
                return null;
            }
        } else {
            iA = e9Var.z;
            if (iA > n1Var.c()) {
                return null;
            }
        }
        int iC = c(iA);
        if (iC == 0) {
            return null;
        }
        return android.util.Pair.create(java.lang.Integer.valueOf(iB), java.lang.Integer.valueOf(iC));
    }

    private static boolean b(com.applovin.impl.e9 e9Var, com.applovin.impl.n1 n1Var) {
        return a(e9Var, n1Var) != null;
    }

    private void b(android.media.AudioTrack audioTrack) {
        if (this.m == null) {
            this.m = new com.applovin.impl.r5.i();
        }
        this.m.a(audioTrack);
    }

    private static int a(int i2, java.nio.ByteBuffer byteBuffer) {
        switch (i2) {
            case 5:
            case 6:
            case 18:
                return com.applovin.impl.k.b(byteBuffer);
            case 7:
            case 8:
                return com.applovin.impl.e7.a(byteBuffer);
            case 9:
                int iD = com.applovin.impl.sf.d(com.applovin.impl.xp.a(byteBuffer, byteBuffer.position()));
                if (iD != -1) {
                    return iD;
                }
                throw new java.lang.IllegalArgumentException();
            case 10:
                return 1024;
            case 11:
            case 12:
                return 2048;
            case 13:
            default:
                throw new java.lang.IllegalStateException("Unexpected audio encoding: " + i2);
            case 14:
                int iA = com.applovin.impl.k.a(byteBuffer);
                if (iA == -1) {
                    return 0;
                }
                return com.applovin.impl.k.a(byteBuffer, iA) * 16;
            case 15:
                return 512;
            case 16:
                return 1024;
            case 17:
                return com.applovin.impl.n.a(byteBuffer);
        }
    }

    private void b(com.applovin.impl.ph phVar) {
        if (t()) {
            try {
                this.s.setPlaybackParams(new android.media.PlaybackParams().allowDefaults().setSpeed(phVar.f1145a).setPitch(phVar.b).setAudioFallbackMode(2));
            } catch (java.lang.IllegalArgumentException e2) {
                com.applovin.impl.oc.c("DefaultAudioSink", "Failed to set playback params", e2);
            }
            phVar = new com.applovin.impl.ph(this.s.getPlaybackParams().getSpeed(), this.s.getPlaybackParams().getPitch());
            this.i.a(phVar.f1145a);
        }
        this.w = phVar;
    }

    @Override // com.applovin.impl.r1
    public com.applovin.impl.ph a() {
        if (this.k) {
            return this.w;
        }
        return n();
    }

    @Override // com.applovin.impl.r1
    public boolean a(java.nio.ByteBuffer byteBuffer, long j, int i2) throws java.lang.Exception {
        java.nio.ByteBuffer byteBuffer2 = this.K;
        com.applovin.impl.b1.a(byteBuffer2 == null || byteBuffer == byteBuffer2);
        if (this.q != null) {
            if (!l()) {
                return false;
            }
            if (!this.q.a(this.r)) {
                v();
                if (g()) {
                    return false;
                }
                b();
            } else {
                this.r = this.q;
                this.q = null;
                if (a(this.s) && this.l != 3) {
                    this.s.setOffloadEndOfStream();
                    android.media.AudioTrack audioTrack = this.s;
                    com.applovin.impl.e9 e9Var = this.r.f1214a;
                    audioTrack.setOffloadDelayPadding(e9Var.C, e9Var.D);
                    this.Z = true;
                }
            }
            a(j);
        }
        if (!t()) {
            try {
                s();
            } catch (com.applovin.impl.r1.b e2) {
                if (!e2.b) {
                    this.n.a(e2);
                    return false;
                }
                throw e2;
            }
        }
        this.n.a();
        if (this.F) {
            this.G = java.lang.Math.max(0L, j);
            this.E = false;
            this.F = false;
            if (this.k && com.applovin.impl.xp.f1515a >= 23) {
                b(this.w);
            }
            a(j);
            if (this.S) {
                j();
            }
        }
        if (!this.i.g(r())) {
            return false;
        }
        if (this.K == null) {
            com.applovin.impl.b1.a(byteBuffer.order() == java.nio.ByteOrder.LITTLE_ENDIAN);
            if (!byteBuffer.hasRemaining()) {
                return true;
            }
            com.applovin.impl.r5.c cVar = this.r;
            if (cVar.c != 0 && this.D == 0) {
                int iA = a(cVar.g, byteBuffer);
                this.D = iA;
                if (iA == 0) {
                    return true;
                }
            }
            if (this.u != null) {
                if (!l()) {
                    return false;
                }
                a(j);
                this.u = null;
            }
            long jD = this.G + this.r.d(q() - this.e.j());
            if (!this.E && java.lang.Math.abs(jD - j) > 200000) {
                this.p.a(new com.applovin.impl.r1.d(j, jD));
                this.E = true;
            }
            if (this.E) {
                if (!l()) {
                    return false;
                }
                long j2 = j - jD;
                this.G += j2;
                this.E = false;
                a(j);
                com.applovin.impl.r1.c cVar2 = this.p;
                if (cVar2 != null && j2 != 0) {
                    cVar2.b();
                }
            }
            if (this.r.c == 0) {
                this.z += (long) byteBuffer.remaining();
            } else {
                this.A += (long) (this.D * i2);
            }
            this.K = byteBuffer;
            this.L = i2;
        }
        d(j);
        if (!this.K.hasRemaining()) {
            this.K = null;
            this.L = 0;
            return true;
        }
        if (!this.i.f(r())) {
            return false;
        }
        com.applovin.impl.oc.d("DefaultAudioSink", "Resetting stalled audio track");
        b();
        return true;
    }

    @Override // com.applovin.impl.r1
    public void b(boolean z) {
        a(n(), z);
    }

    @Override // com.applovin.impl.r1
    public void a(com.applovin.impl.l1 l1Var) {
        if (this.t.equals(l1Var)) {
            return;
        }
        this.t = l1Var;
        if (this.W) {
            return;
        }
        b();
    }

    private static void b(android.media.AudioTrack audioTrack, float f2) {
        audioTrack.setStereoVolume(f2, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static android.media.AudioFormat b(int i2, int i3, int i4) {
        return new android.media.AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(i4).build();
    }

    private void a(com.applovin.impl.ph phVar, boolean z) {
        com.applovin.impl.r5.f fVarO = o();
        if (phVar.equals(fVarO.f1216a) && z == fVarO.b) {
            return;
        }
        com.applovin.impl.r5.f fVar = new com.applovin.impl.r5.f(phVar, z, androidx.media3.common.C.TIME_UNSET, androidx.media3.common.C.TIME_UNSET, null);
        if (t()) {
            this.u = fVar;
        } else {
            this.v = fVar;
        }
    }

    @Override // com.applovin.impl.r1
    public void a(int i2) {
        if (this.U != i2) {
            this.U = i2;
            this.T = i2 != 0;
            b();
        }
    }

    @Override // com.applovin.impl.r1
    public void a(com.applovin.impl.v1 v1Var) {
        if (this.V.equals(v1Var)) {
            return;
        }
        int i2 = v1Var.f1416a;
        float f2 = v1Var.b;
        android.media.AudioTrack audioTrack = this.s;
        if (audioTrack != null) {
            if (this.V.f1416a != i2) {
                audioTrack.attachAuxEffect(i2);
            }
            if (i2 != 0) {
                this.s.setAuxEffectSendLevel(f2);
            }
        }
        this.V = v1Var;
    }

    @Override // com.applovin.impl.r1
    public void a(com.applovin.impl.r1.c cVar) {
        this.p = cVar;
    }

    @Override // com.applovin.impl.r1
    public void a(com.applovin.impl.ph phVar) {
        com.applovin.impl.ph phVar2 = new com.applovin.impl.ph(com.applovin.impl.xp.a(phVar.f1145a, 0.1f, 8.0f), com.applovin.impl.xp.a(phVar.b, 0.1f, 8.0f));
        if (this.k && com.applovin.impl.xp.f1515a >= 23) {
            b(phVar2);
        } else {
            a(phVar2, p());
        }
    }

    @Override // com.applovin.impl.r1
    public void a(float f2) {
        if (this.H != f2) {
            this.H = f2;
            x();
        }
    }

    private static void a(android.media.AudioTrack audioTrack, float f2) {
        audioTrack.setVolume(f2);
    }

    @Override // com.applovin.impl.r1
    public boolean a(com.applovin.impl.e9 e9Var) {
        return b(e9Var) != 0;
    }

    private void a(java.nio.ByteBuffer byteBuffer, long j) throws java.lang.Exception {
        int iA;
        if (byteBuffer.hasRemaining()) {
            java.nio.ByteBuffer byteBuffer2 = this.M;
            if (byteBuffer2 != null) {
                com.applovin.impl.b1.a(byteBuffer2 == byteBuffer);
            } else {
                this.M = byteBuffer;
                if (com.applovin.impl.xp.f1515a < 21) {
                    int iRemaining = byteBuffer.remaining();
                    byte[] bArr = this.N;
                    if (bArr == null || bArr.length < iRemaining) {
                        this.N = new byte[iRemaining];
                    }
                    int iPosition = byteBuffer.position();
                    byteBuffer.get(this.N, 0, iRemaining);
                    byteBuffer.position(iPosition);
                    this.O = 0;
                }
            }
            int iRemaining2 = byteBuffer.remaining();
            if (com.applovin.impl.xp.f1515a < 21) {
                int iB = this.i.b(this.B);
                if (iB > 0) {
                    iA = this.s.write(this.N, this.O, java.lang.Math.min(iRemaining2, iB));
                    if (iA > 0) {
                        this.O += iA;
                        byteBuffer.position(byteBuffer.position() + iA);
                    }
                } else {
                    iA = 0;
                }
            } else if (this.W) {
                com.applovin.impl.b1.b(j != androidx.media3.common.C.TIME_UNSET);
                iA = a(this.s, byteBuffer, iRemaining2, j);
            } else {
                iA = a(this.s, byteBuffer, iRemaining2);
            }
            this.X = android.os.SystemClock.elapsedRealtime();
            if (iA < 0) {
                boolean zE = e(iA);
                if (zE) {
                    u();
                }
                com.applovin.impl.r1.e eVar = new com.applovin.impl.r1.e(iA, this.r.f1214a, zE);
                com.applovin.impl.r1.c cVar = this.p;
                if (cVar != null) {
                    cVar.a(eVar);
                }
                if (!eVar.b) {
                    this.o.a(eVar);
                    return;
                }
                throw eVar;
            }
            this.o.a();
            if (a(this.s)) {
                long j2 = this.C;
                if (j2 > 0) {
                    this.Z = false;
                }
                if (this.S && this.p != null && iA < iRemaining2 && !this.Z) {
                    this.p.b(this.i.c(j2));
                }
            }
            int i2 = this.r.c;
            if (i2 == 0) {
                this.B += (long) iA;
            }
            if (iA == iRemaining2) {
                if (i2 != 0) {
                    com.applovin.impl.b1.b(byteBuffer == this.K);
                    this.C += (long) (this.D * this.L);
                }
                this.M = null;
            }
        }
    }

    private static int a(android.media.AudioTrack audioTrack, java.nio.ByteBuffer byteBuffer, int i2) {
        return audioTrack.write(byteBuffer, i2, 1);
    }

    private static int a(int i2, int i3) {
        android.media.AudioAttributes audioAttributesBuild = new android.media.AudioAttributes.Builder().setUsage(1).setContentType(3).build();
        for (int i4 = 8; i4 > 0; i4--) {
            if (android.media.AudioTrack.isDirectPlaybackSupported(new android.media.AudioFormat.Builder().setEncoding(i2).setSampleRate(i3).setChannelMask(com.applovin.impl.xp.a(i4)).build(), audioAttributesBuild)) {
                return i4;
            }
        }
        return 0;
    }

    private boolean a(com.applovin.impl.e9 e9Var, com.applovin.impl.l1 l1Var) {
        int iB;
        int iA;
        int iA2;
        if (com.applovin.impl.xp.f1515a < 29 || this.l == 0 || (iB = com.applovin.impl.hf.b((java.lang.String) com.applovin.impl.b1.a((java.lang.Object) e9Var.m), e9Var.j)) == 0 || (iA = com.applovin.impl.xp.a(e9Var.z)) == 0 || (iA2 = a(b(e9Var.A, iA, iB), l1Var.a())) == 0) {
            return false;
        }
        if (iA2 == 1) {
            return ((e9Var.C != 0 || e9Var.D != 0) && (this.l == 1)) ? false : true;
        }
        if (iA2 == 2) {
            return true;
        }
        throw new java.lang.IllegalStateException();
    }

    private int a(android.media.AudioFormat audioFormat, android.media.AudioAttributes audioAttributes) {
        int i2 = com.applovin.impl.xp.f1515a;
        if (i2 >= 31) {
            return android.media.AudioManager.getPlaybackOffloadSupport(audioFormat, audioAttributes);
        }
        if (android.media.AudioManager.isOffloadedPlaybackSupported(audioFormat, audioAttributes)) {
            return (i2 == 30 && com.applovin.impl.xp.d.startsWith("Pixel")) ? 2 : 1;
        }
        return 0;
    }

    private static boolean a(android.media.AudioTrack audioTrack) {
        return com.applovin.impl.xp.f1515a >= 29 && audioTrack.isOffloadedPlayback();
    }

    private int a(android.media.AudioTrack audioTrack, java.nio.ByteBuffer byteBuffer, int i2, long j) {
        if (com.applovin.impl.xp.f1515a >= 26) {
            return audioTrack.write(byteBuffer, i2, 1, j * 1000);
        }
        if (this.x == null) {
            java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(16);
            this.x = byteBufferAllocate;
            byteBufferAllocate.order(java.nio.ByteOrder.BIG_ENDIAN);
            this.x.putInt(1431633921);
        }
        if (this.y == 0) {
            this.x.putInt(4, i2);
            this.x.putLong(8, j * 1000);
            this.x.position(0);
            this.y = i2;
        }
        int iRemaining = this.x.remaining();
        if (iRemaining > 0) {
            int iWrite = audioTrack.write(this.x, iRemaining, 1);
            if (iWrite < 0) {
                this.y = 0;
                return iWrite;
            }
            if (iWrite < iRemaining) {
                return 0;
            }
        }
        int iA = a(audioTrack, byteBuffer, i2);
        if (iA < 0) {
            this.y = 0;
            return iA;
        }
        this.y -= iA;
        return iA;
    }
}
