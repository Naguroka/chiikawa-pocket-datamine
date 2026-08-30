package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class ea implements com.applovin.impl.p7 {
    private static final double[] q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private java.lang.String f751a;
    private com.applovin.impl.qo b;
    private final com.applovin.impl.vp c;
    private final com.applovin.impl.ah d;
    private final com.applovin.impl.xf e;
    private final boolean[] f;
    private final com.applovin.impl.ea.a g;
    private long h;
    private boolean i;
    private boolean j;
    private long k;
    private long l;
    private long m;
    private long n;
    private boolean o;
    private boolean p;

    @Override // com.applovin.impl.p7
    public void b() {
    }

    public ea() {
        this(null);
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0112  */
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
    @Override // com.applovin.impl.p7
    public void a(com.applovin.impl.ah ahVar) {
        boolean z;
        int i;
        com.applovin.impl.b1.b(this.b);
        int iD = ahVar.d();
        int iE = ahVar.e();
        byte[] bArrC = ahVar.c();
        this.h += (long) ahVar.a();
        this.b.a(ahVar, ahVar.a());
        while (true) {
            int iA = com.applovin.impl.yf.a(bArrC, iD, iE, this.f);
            if (iA == iE) {
                break;
            }
            int i2 = iA + 3;
            int i3 = ahVar.c()[i2] & 255;
            int i4 = iA - iD;
            if (!this.j) {
                if (i4 > 0) {
                    this.g.a(bArrC, iD, iA);
                }
                if (this.g.a(i3, i4 < 0 ? -i4 : 0)) {
                    android.util.Pair pairA = a(this.g, (java.lang.String) com.applovin.impl.b1.a((java.lang.Object) this.f751a));
                    this.b.a((com.applovin.impl.e9) pairA.first);
                    this.k = ((java.lang.Long) pairA.second).longValue();
                    this.j = true;
                }
            }
            com.applovin.impl.xf xfVar = this.e;
            if (xfVar != null) {
                if (i4 > 0) {
                    xfVar.a(bArrC, iD, iA);
                    i = 0;
                } else {
                    i = -i4;
                }
                if (this.e.a(i)) {
                    com.applovin.impl.xf xfVar2 = this.e;
                    ((com.applovin.impl.ah) com.applovin.impl.xp.a(this.d)).a(this.e.d, com.applovin.impl.yf.c(xfVar2.d, xfVar2.e));
                    ((com.applovin.impl.vp) com.applovin.impl.xp.a(this.c)).a(this.n, this.d);
                }
                if (i3 == 178 && ahVar.c()[iA + 2] == 1) {
                    this.e.b(i3);
                }
            }
            if (i3 == 0 || i3 == 179) {
                int i5 = iE - iA;
                if (this.p && this.j) {
                    long j = this.n;
                    if (j != androidx.media3.common.C.TIME_UNSET) {
                        this.b.a(j, this.o ? 1 : 0, ((int) (this.h - this.m)) - i5, i5, null);
                    }
                }
                if (!this.i || this.p) {
                    this.m = this.h - ((long) i5);
                    long j2 = this.l;
                    if (j2 == androidx.media3.common.C.TIME_UNSET) {
                        long j3 = this.n;
                        j2 = j3 != androidx.media3.common.C.TIME_UNSET ? j3 + this.k : -9223372036854775807L;
                    }
                    this.n = j2;
                    this.o = false;
                    this.l = androidx.media3.common.C.TIME_UNSET;
                    z = true;
                    this.i = true;
                } else {
                    z = true;
                }
                this.p = i3 == 0 ? z : false;
            } else if (i3 == 184) {
                this.o = true;
            }
            iD = i2;
        }
        if (!this.j) {
            this.g.a(bArrC, iD, iE);
        }
        com.applovin.impl.xf xfVar3 = this.e;
        if (xfVar3 != null) {
            xfVar3.a(bArrC, iD, iE);
        }
    }

    ea(com.applovin.impl.vp vpVar) {
        this.c = vpVar;
        this.f = new boolean[4];
        this.g = new com.applovin.impl.ea.a(128);
        if (vpVar != null) {
            this.e = new com.applovin.impl.xf(org.objectweb.asm.Opcodes.GETSTATIC, 128);
            this.d = new com.applovin.impl.ah();
        } else {
            this.e = null;
            this.d = null;
        }
        this.l = androidx.media3.common.C.TIME_UNSET;
        this.n = androidx.media3.common.C.TIME_UNSET;
    }

    private static final class a {
        private static final byte[] e = {0, 0, 1};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f752a;
        public int b;
        public int c;
        public byte[] d;

        public a(int i) {
            this.d = new byte[i];
        }

        public void a(byte[] bArr, int i, int i2) {
            if (this.f752a) {
                int i3 = i2 - i;
                byte[] bArr2 = this.d;
                int length = bArr2.length;
                int i4 = this.b + i3;
                if (length < i4) {
                    this.d = java.util.Arrays.copyOf(bArr2, i4 * 2);
                }
                java.lang.System.arraycopy(bArr, i, this.d, this.b, i3);
                this.b += i3;
            }
        }

        public boolean a(int i, int i2) {
            if (this.f752a) {
                int i3 = this.b - i2;
                this.b = i3;
                if (this.c == 0 && i == 181) {
                    this.c = i3;
                } else {
                    this.f752a = false;
                    return true;
                }
            } else if (i == 179) {
                this.f752a = true;
            }
            byte[] bArr = e;
            a(bArr, 0, bArr.length);
            return false;
        }

        public void a() {
            this.f752a = false;
            this.b = 0;
            this.c = 0;
        }
    }

    @Override // com.applovin.impl.p7
    public void a(com.applovin.impl.l8 l8Var, com.applovin.impl.dp.d dVar) {
        dVar.a();
        this.f751a = dVar.b();
        this.b = l8Var.a(dVar.c(), 2);
        com.applovin.impl.vp vpVar = this.c;
        if (vpVar != null) {
            vpVar.a(l8Var, dVar);
        }
    }

    @Override // com.applovin.impl.p7
    public void a(long j, int i) {
        this.l = j;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0072  */
    /* JADX WARN: Code duplicated, block: B:16:0x0077  */
    /* JADX WARN: Code duplicated, block: B:18:0x0086  */
    /* JADX WARN: Code duplicated, block: B:20:0x0097  */
    private static android.util.Pair a(com.applovin.impl.ea.a aVar, java.lang.String str) {
        float f;
        int i;
        float f2;
        int i2;
        long j;
        double[] dArr;
        double d;
        int i3;
        int i4;
        byte[] bArrCopyOf = java.util.Arrays.copyOf(aVar.d, aVar.b);
        int i5 = bArrCopyOf[4] & 255;
        byte b = bArrCopyOf[5];
        int i6 = (i5 << 4) | ((b & 255) >> 4);
        int i7 = ((b & 15) << 8) | (bArrCopyOf[6] & 255);
        int i8 = (bArrCopyOf[7] & 240) >> 4;
        if (i8 == 2) {
            f = i7 * 4;
            i = i6 * 3;
        } else {
            if (i8 != 3) {
                if (i8 != 4) {
                    f2 = 1.0f;
                } else {
                    f = i7 * 121;
                    i = i6 * 100;
                }
                com.applovin.impl.e9 e9VarA = new com.applovin.impl.e9.b().c(str).f(androidx.media3.common.MimeTypes.VIDEO_MPEG2).q(i6).g(i7).b(f2).a(java.util.Collections.singletonList(bArrCopyOf)).a();
                i2 = (bArrCopyOf[7] & 15) - 1;
                if (i2 >= 0) {
                    dArr = q;
                    if (i2 < dArr.length) {
                        d = dArr[i2];
                        byte b2 = bArrCopyOf[aVar.c + 9];
                        i3 = (b2 & 96) >> 5;
                        i4 = b2 & 31;
                        if (i3 != i4) {
                            d *= (((double) i3) + 1.0d) / ((double) (i4 + 1));
                        }
                        j = (long) (1000000.0d / d);
                    } else {
                        j = 0;
                    }
                } else {
                    j = 0;
                }
                return android.util.Pair.create(e9VarA, java.lang.Long.valueOf(j));
            }
            f = i7 * 16;
            i = i6 * 9;
        }
        f2 = f / i;
        com.applovin.impl.e9 e9VarA2 = new com.applovin.impl.e9.b().c(str).f(androidx.media3.common.MimeTypes.VIDEO_MPEG2).q(i6).g(i7).b(f2).a(java.util.Collections.singletonList(bArrCopyOf)).a();
        i2 = (bArrCopyOf[7] & 15) - 1;
        if (i2 >= 0) {
            dArr = q;
            if (i2 < dArr.length) {
                d = dArr[i2];
                byte b3 = bArrCopyOf[aVar.c + 9];
                i3 = (b3 & 96) >> 5;
                i4 = b3 & 31;
                if (i3 != i4) {
                    d *= (((double) i3) + 1.0d) / ((double) (i4 + 1));
                }
                j = (long) (1000000.0d / d);
            } else {
                j = 0;
            }
        } else {
            j = 0;
        }
        return android.util.Pair.create(e9VarA2, java.lang.Long.valueOf(j));
    }

    @Override // com.applovin.impl.p7
    public void a() {
        com.applovin.impl.yf.a(this.f);
        this.g.a();
        com.applovin.impl.xf xfVar = this.e;
        if (xfVar != null) {
            xfVar.b();
        }
        this.h = 0L;
        this.i = false;
        this.l = androidx.media3.common.C.TIME_UNSET;
        this.n = androidx.media3.common.C.TIME_UNSET;
    }
}
