package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class fa implements com.applovin.impl.p7 {
    private static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.vp f783a;
    private final com.applovin.impl.ah b;
    private final com.applovin.impl.xf e;
    private com.applovin.impl.fa.b f;
    private long g;
    private java.lang.String h;
    private com.applovin.impl.qo i;
    private boolean j;
    private final boolean[] c = new boolean[4];
    private final com.applovin.impl.fa.a d = new com.applovin.impl.fa.a(128);
    private long k = androidx.media3.common.C.TIME_UNSET;

    @Override // com.applovin.impl.p7
    public void b() {
    }

    fa(com.applovin.impl.vp vpVar) {
        this.f783a = vpVar;
        if (vpVar != null) {
            this.e = new com.applovin.impl.xf(org.objectweb.asm.Opcodes.GETSTATIC, 128);
            this.b = new com.applovin.impl.ah();
        } else {
            this.e = null;
            this.b = null;
        }
    }

    @Override // com.applovin.impl.p7
    public void a(com.applovin.impl.ah ahVar) {
        com.applovin.impl.b1.b(this.f);
        com.applovin.impl.b1.b(this.i);
        int iD = ahVar.d();
        int iE = ahVar.e();
        byte[] bArrC = ahVar.c();
        this.g += (long) ahVar.a();
        this.i.a(ahVar, ahVar.a());
        while (true) {
            int iA = com.applovin.impl.yf.a(bArrC, iD, iE, this.c);
            if (iA == iE) {
                break;
            }
            int i = iA + 3;
            int i2 = ahVar.c()[i] & 255;
            int i3 = iA - iD;
            int i4 = 0;
            if (!this.j) {
                if (i3 > 0) {
                    this.d.a(bArrC, iD, iA);
                }
                if (this.d.a(i2, i3 < 0 ? -i3 : 0)) {
                    com.applovin.impl.qo qoVar = this.i;
                    com.applovin.impl.fa.a aVar = this.d;
                    qoVar.a(a(aVar, aVar.d, (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) this.h)));
                    this.j = true;
                }
            }
            this.f.a(bArrC, iD, iA);
            com.applovin.impl.xf xfVar = this.e;
            if (xfVar != null) {
                if (i3 > 0) {
                    xfVar.a(bArrC, iD, iA);
                } else {
                    i4 = -i3;
                }
                if (this.e.a(i4)) {
                    com.applovin.impl.xf xfVar2 = this.e;
                    ((com.applovin.impl.ah) com.applovin.impl.xp.a(this.b)).a(this.e.d, com.applovin.impl.yf.c(xfVar2.d, xfVar2.e));
                    ((com.applovin.impl.vp) com.applovin.impl.xp.a(this.f783a)).a(this.k, this.b);
                }
                if (i2 == 178 && ahVar.c()[iA + 2] == 1) {
                    this.e.b(i2);
                }
            }
            int i5 = iE - iA;
            this.f.a(this.g - ((long) i5), i5, this.j);
            this.f.a(i2, this.k);
            iD = i;
        }
        if (!this.j) {
            this.d.a(bArrC, iD, iE);
        }
        this.f.a(bArrC, iD, iE);
        com.applovin.impl.xf xfVar3 = this.e;
        if (xfVar3 != null) {
            xfVar3.a(bArrC, iD, iE);
        }
    }

    @Override // com.applovin.impl.p7
    public void a(com.applovin.impl.l8 l8Var, com.applovin.impl.dp.d dVar) {
        dVar.a();
        this.h = dVar.b();
        com.applovin.impl.qo qoVarA = l8Var.a(dVar.c(), 2);
        this.i = qoVarA;
        this.f = new com.applovin.impl.fa.b(qoVarA);
        com.applovin.impl.vp vpVar = this.f783a;
        if (vpVar != null) {
            vpVar.a(l8Var, dVar);
        }
    }

    private static final class a {
        private static final byte[] f = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f784a;
        private int b;
        public int c;
        public int d;
        public byte[] e;

        public a(int i) {
            this.e = new byte[i];
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.f784a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.e;
                int length = bArr2.length;
                int i4 = this.c + i3;
                if (length < i4) {
                    this.e = java.util.Arrays.copyOf(bArr2, i4 * 2);
                }
                java.lang.System.arraycopy(bArr, i, this.e, this.c, i3);
                this.c += i3;
            }
        }

        public boolean a(int i, int i2) {
            int i3 = this.b;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 != 4) {
                                throw new java.lang.IllegalStateException();
                            }
                            if (i == 179 || i == 181) {
                                this.c -= i2;
                                this.f784a = false;
                                return true;
                            }
                        } else if ((i & androidx.media3.extractor.ts.PsExtractor.VIDEO_STREAM_MASK) != 32) {
                            com.applovin.impl.oc.d("H263Reader", "Unexpected start code value");
                            a();
                        } else {
                            this.d = this.c;
                            this.b = 4;
                        }
                    } else if (i > 31) {
                        com.applovin.impl.oc.d("H263Reader", "Unexpected start code value");
                        a();
                    } else {
                        this.b = 3;
                    }
                } else if (i != 181) {
                    com.applovin.impl.oc.d("H263Reader", "Unexpected start code value");
                    a();
                } else {
                    this.b = 2;
                }
            } else if (i == 176) {
                this.b = 1;
                this.f784a = true;
            }
            byte[] bArr = f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void a() {
            this.f784a = false;
            this.c = 0;
            this.b = 0;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.qo f785a;
        private boolean b;
        private boolean c;
        private boolean d;
        private int e;
        private int f;
        private long g;
        private long h;

        public b(com.applovin.impl.qo qoVar) {
            this.f785a = qoVar;
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.c) {
                int i3 = this.f;
                int i4 = (i + 1) - i3;
                if (i4 < i2) {
                    this.d = ((bArr[i4] & 192) >> 6) == 0;
                    this.c = false;
                } else {
                    this.f = i3 + (i2 - i);
                }
            }
        }

        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        public void a(long j, int i, boolean z) {
            if (this.e == 182 && z && this.b) {
                long j2 = this.h;
                if (j2 != androidx.media3.common.C.TIME_UNSET) {
                    this.f785a.a(j2, this.d ? 1 : 0, (int) (j - this.g), i, null);
                }
            }
            if (this.e != 179) {
                this.g = j;
            }
        }

        public void a(int i, long j) {
            this.e = i;
            this.d = false;
            this.b = i == 182 || i == 179;
            this.c = i == 182;
            this.f = 0;
            this.h = j;
        }

        public void a() {
            this.b = false;
            this.c = false;
            this.d = false;
            this.e = -1;
        }
    }

    @Override // com.applovin.impl.p7
    public void a(long j, int i) {
        if (j != androidx.media3.common.C.TIME_UNSET) {
            this.k = j;
        }
    }

    private static com.applovin.impl.e9 a(com.applovin.impl.fa.a aVar, int i, java.lang.String str) {
        byte[] bArrCopyOf = java.util.Arrays.copyOf(aVar.e, aVar.c);
        com.applovin.impl.zg zgVar = new com.applovin.impl.zg(bArrCopyOf);
        zgVar.e(i);
        zgVar.e(4);
        zgVar.g();
        zgVar.d(8);
        if (zgVar.f()) {
            zgVar.d(4);
            zgVar.d(3);
        }
        int iA = zgVar.a(4);
        float f = 1.0f;
        if (iA == 15) {
            int iA2 = zgVar.a(8);
            int iA3 = zgVar.a(8);
            if (iA3 == 0) {
                com.applovin.impl.oc.d("H263Reader", "Invalid aspect ratio");
            } else {
                f = iA2 / iA3;
            }
        } else {
            float[] fArr = l;
            if (iA < fArr.length) {
                f = fArr[iA];
            } else {
                com.applovin.impl.oc.d("H263Reader", "Invalid aspect ratio");
            }
        }
        if (zgVar.f()) {
            zgVar.d(2);
            zgVar.d(1);
            if (zgVar.f()) {
                zgVar.d(15);
                zgVar.g();
                zgVar.d(15);
                zgVar.g();
                zgVar.d(15);
                zgVar.g();
                zgVar.d(3);
                zgVar.d(11);
                zgVar.g();
                zgVar.d(15);
                zgVar.g();
            }
        }
        if (zgVar.a(2) != 0) {
            com.applovin.impl.oc.d("H263Reader", "Unhandled video object layer shape");
        }
        zgVar.g();
        int iA4 = zgVar.a(16);
        zgVar.g();
        if (zgVar.f()) {
            if (iA4 == 0) {
                com.applovin.impl.oc.d("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i2 = 0;
                for (int i3 = iA4 - 1; i3 > 0; i3 >>= 1) {
                    i2++;
                }
                zgVar.d(i2);
            }
        }
        zgVar.g();
        int iA5 = zgVar.a(13);
        zgVar.g();
        int iA6 = zgVar.a(13);
        zgVar.g();
        zgVar.g();
        return new com.applovin.impl.e9.b().c(str).f(androidx.media3.common.MimeTypes.VIDEO_MP4V).q(iA5).g(iA6).b(f).a(java.util.Collections.singletonList(bArrCopyOf)).a();
    }

    @Override // com.applovin.impl.p7
    public void a() {
        com.applovin.impl.yf.a(this.c);
        this.d.a();
        com.applovin.impl.fa.b bVar = this.f;
        if (bVar != null) {
            bVar.a();
        }
        com.applovin.impl.xf xfVar = this.e;
        if (xfVar != null) {
            xfVar.b();
        }
        this.g = 0L;
        this.k = androidx.media3.common.C.TIME_UNSET;
    }
}
