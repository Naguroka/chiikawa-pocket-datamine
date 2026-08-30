package com.five_corp.ad.internal.movie.partialcache;

/* JADX INFO: loaded from: classes4.dex */
public final class r1 implements com.five_corp.ad.internal.movie.partialcache.w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.InterfaceC1465e f2020a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ byte[] e;
    public final /* synthetic */ com.five_corp.ad.internal.movie.partialcache.u1 f;

    public r1(com.five_corp.ad.internal.movie.partialcache.u1 u1Var, com.five_corp.ad.internal.movie.partialcache.C1467f c1467f, int i, int i2, int i3, byte[] bArr) {
        this.f = u1Var;
        this.f2020a = c1467f;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = bArr;
    }

    /* JADX WARN: Code duplicated, block: B:110:0x02c6  */
    /* JADX WARN: Code duplicated, block: B:112:0x02d0  */
    /* JADX WARN: Code duplicated, block: B:114:0x02da  */
    /* JADX WARN: Code duplicated, block: B:190:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:191:0x038a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:196:0x0355 A[SYNTHETIC] */
    @Override // com.five_corp.ad.internal.movie.partialcache.w1
    public final void a(java.lang.Object obj) {
        com.five_corp.ad.internal.movie.partialcache.C1486o0 c1486o0;
        int i;
        com.five_corp.ad.internal.movie.partialcache.C1482m0 c1482m0;
        com.five_corp.ad.internal.movie.partialcache.H0 h0;
        com.five_corp.ad.internal.movie.partialcache.D0 d0;
        com.five_corp.ad.internal.movie.partialcache.C1474i0 c1474i0;
        com.five_corp.ad.internal.movie.partialcache.C1458a0 c1458a0;
        com.five_corp.ad.internal.movie.partialcache.X x;
        com.five_corp.ad.internal.movie.partialcache.X x2;
        com.five_corp.ad.internal.movie.partialcache.A a2;
        com.five_corp.ad.internal.movie.partialcache.B b;
        com.five_corp.ad.internal.movie.partialcache.v1 v1Var = (com.five_corp.ad.internal.movie.partialcache.v1) obj;
        if (v1Var.d != 3 && v1Var.f2024a == this.f2020a) {
            int i2 = this.b;
            int i3 = 2;
            char c = 0;
            if (i2 <= 0) {
                com.five_corp.ad.internal.movie.partialcache.u1 u1Var = this.f;
                com.five_corp.ad.internal.s sVar = new com.five_corp.ad.internal.s(com.five_corp.ad.internal.t.p5, java.lang.String.format("onLoadNewData: offsetFromStartByteInclusive: %d, size: %d, offsetFromResourceFileHead: %d", java.lang.Integer.valueOf(this.c), java.lang.Integer.valueOf(this.b), java.lang.Integer.valueOf(this.d)), null, null);
                u1Var.getClass();
                if (v1Var.d == 3) {
                    return;
                }
                v1Var.d = 3;
                u1Var.e.a(sVar);
                return;
            }
            com.five_corp.ad.internal.util.g gVarA = v1Var.b.a(this.e, this.c, i2, this.d);
            if (!gVarA.f2085a) {
                com.five_corp.ad.internal.movie.partialcache.u1 u1Var2 = this.f;
                com.five_corp.ad.internal.s sVar2 = gVarA.b;
                u1Var2.getClass();
                if (v1Var.d == 3) {
                    return;
                }
                v1Var.d = 3;
                u1Var2.e.a(sVar2);
                return;
            }
            if (v1Var.d == 1) {
                com.five_corp.ad.internal.movie.partialcache.u1 u1Var3 = this.f;
                u1Var3.getClass();
                com.five_corp.ad.internal.movie.partialcache.m1 m1Var = v1Var.c;
                com.five_corp.ad.internal.util.c cVar = v1Var.b;
                if (m1Var.k) {
                    i = 2;
                } else {
                    if (m1Var.b == null) {
                        m1Var.b = new com.five_corp.ad.internal.movie.partialcache.C1490q0(cVar, m1Var.f2007a);
                    }
                    com.five_corp.ad.internal.movie.partialcache.C1490q0 c1490q0 = m1Var.b;
                    int i4 = 4;
                    if (c1490q0.c == null) {
                        while (true) {
                            int i5 = com.five_corp.ad.internal.movie.partialcache.AbstractC1506z.f2032a[c1490q0.b.ordinal()];
                            if (i5 == 1) {
                                c1490q0.g = 0L;
                                com.five_corp.ad.internal.util.c cVar2 = c1490q0.f2019a;
                                if (cVar2.g < cVar2.h + i4) {
                                    break;
                                }
                                int iB = cVar2.b();
                                java.util.HashMap map = com.five_corp.ad.internal.movie.partialcache.j1.f2005a;
                                long j = iB;
                                if (iB < 0) {
                                    j += 4294967296L;
                                }
                                c1490q0.d = j;
                                c1490q0.b = com.five_corp.ad.internal.movie.partialcache.EnumC1488p0.AfterSize;
                                c1490q0.g += 4;
                                i3 = 2;
                                c = 0;
                                i4 = 4;
                            } else if (i5 == i3) {
                                com.five_corp.ad.internal.util.c cVar3 = c1490q0.f2019a;
                                if (cVar3.g < cVar3.h + i4) {
                                    break;
                                }
                                cVar3.a(c1490q0.e);
                                c1490q0.b = com.five_corp.ad.internal.movie.partialcache.EnumC1488p0.AfterType;
                                c1490q0.g += 4;
                                i3 = 2;
                            } else if (i5 == 3) {
                                long j2 = c1490q0.d;
                                if (j2 == 0) {
                                    c1490q0.b = com.five_corp.ad.internal.movie.partialcache.EnumC1488p0.AfterExtendedSze;
                                    break;
                                }
                                if (j2 == 1) {
                                    com.five_corp.ad.internal.util.c cVar4 = c1490q0.f2019a;
                                    if (cVar4.g < cVar4.h + 8) {
                                        break;
                                    }
                                    c1490q0.d = cVar4.c();
                                    c1490q0.b = com.five_corp.ad.internal.movie.partialcache.EnumC1488p0.AfterExtendedSze;
                                    c1490q0.g += 8;
                                } else {
                                    c1490q0.b = com.five_corp.ad.internal.movie.partialcache.EnumC1488p0.AfterExtendedSze;
                                }
                                i3 = 2;
                            } else if (i5 == i4) {
                                if (java.util.Arrays.equals(c1490q0.e, com.five_corp.ad.internal.movie.partialcache.D.e)) {
                                    com.five_corp.ad.internal.util.c cVar5 = c1490q0.f2019a;
                                    int i6 = cVar5.g;
                                    int i7 = cVar5.h;
                                    byte[] bArr = c1490q0.f;
                                    if (i6 < i7 + bArr.length) {
                                        break;
                                    }
                                    cVar5.a(bArr);
                                    c1490q0.b = com.five_corp.ad.internal.movie.partialcache.EnumC1488p0.InBox;
                                    c1490q0.g += 16;
                                } else {
                                    c1490q0.b = com.five_corp.ad.internal.movie.partialcache.EnumC1488p0.InBox;
                                }
                                i3 = 2;
                            } else if (i5 != 5) {
                                continue;
                            } else {
                                int i8 = (int) ((((long) c1490q0.f2019a.h) + c1490q0.d) - c1490q0.g);
                                byte[] bArr2 = c1490q0.e;
                                byte[] bArr3 = com.five_corp.ad.internal.movie.partialcache.D.e;
                                if (java.util.Arrays.equals(bArr2, (byte[]) com.five_corp.ad.internal.movie.partialcache.j1.f2005a.get(com.five_corp.ad.internal.movie.partialcache.C1486o0.class))) {
                                    com.five_corp.ad.internal.util.c cVar6 = c1490q0.f2019a;
                                    if (cVar6.g < i8) {
                                        break;
                                    }
                                    try {
                                        c1490q0.c = (com.five_corp.ad.internal.movie.partialcache.C1486o0) com.five_corp.ad.internal.movie.partialcache.j1.a(cVar6, c1490q0.d, c1490q0.e, c1490q0.f, (int) c1490q0.g, c1490q0.h);
                                        break;
                                    } catch (com.five_corp.ad.internal.movie.partialcache.C1505y0 e) {
                                        java.util.HashMap map2 = com.five_corp.ad.internal.movie.partialcache.j1.f2005a;
                                        e.getMessage();
                                        break;
                                    }
                                }
                                com.five_corp.ad.internal.util.c cVar7 = c1490q0.f2019a;
                                if (cVar7.g < i8) {
                                    break;
                                }
                                cVar7.b(i8);
                                c1490q0.b = com.five_corp.ad.internal.movie.partialcache.EnumC1488p0.BeforeBox;
                                i3 = 2;
                            }
                        }
                    }
                    if (!m1Var.k && (c1486o0 = m1Var.b.c) != null) {
                        m1Var.c = c1486o0;
                        com.five_corp.ad.internal.movie.partialcache.C1499v0 c1499v0 = (com.five_corp.ad.internal.movie.partialcache.C1499v0) com.five_corp.ad.internal.movie.partialcache.l1.b(c1486o0, com.five_corp.ad.internal.movie.partialcache.C1499v0.class);
                        if (c1499v0 != null) {
                            m1Var.f = (int) ((c1499v0.i * 1000) / ((long) c1499v0.h));
                            com.five_corp.ad.internal.movie.partialcache.C1486o0 c1486o1 = m1Var.c;
                            java.util.ArrayList arrayList = new java.util.ArrayList();
                            for (com.five_corp.ad.internal.movie.partialcache.D d : c1486o1.c) {
                                if (com.five_corp.ad.internal.movie.partialcache.Z0.class.isInstance(d)) {
                                    arrayList.add(d);
                                }
                            }
                            java.util.Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                com.five_corp.ad.internal.movie.partialcache.C1476j0 c1476j0 = (com.five_corp.ad.internal.movie.partialcache.C1476j0) com.five_corp.ad.internal.movie.partialcache.l1.b((com.five_corp.ad.internal.movie.partialcache.Z0) it.next(), com.five_corp.ad.internal.movie.partialcache.C1476j0.class);
                                if (c1476j0 != null) {
                                    com.five_corp.ad.internal.movie.partialcache.C1480l0 c1480l0 = (com.five_corp.ad.internal.movie.partialcache.C1480l0) com.five_corp.ad.internal.movie.partialcache.l1.b(c1476j0, com.five_corp.ad.internal.movie.partialcache.C1480l0.class);
                                    com.five_corp.ad.internal.movie.partialcache.C1468f0 c1468f0 = (com.five_corp.ad.internal.movie.partialcache.C1468f0) com.five_corp.ad.internal.movie.partialcache.l1.b(c1476j0, com.five_corp.ad.internal.movie.partialcache.C1468f0.class);
                                    if (c1468f0 != null) {
                                        if (java.util.Arrays.equals(c1468f0.h, "vide".getBytes())) {
                                            com.five_corp.ad.internal.movie.partialcache.C1482m0 c1482m1 = (com.five_corp.ad.internal.movie.partialcache.C1482m0) com.five_corp.ad.internal.movie.partialcache.l1.b(c1476j0, com.five_corp.ad.internal.movie.partialcache.C1482m0.class);
                                            if (c1482m1 != null) {
                                                com.five_corp.ad.internal.movie.partialcache.H0 h1 = (com.five_corp.ad.internal.movie.partialcache.H0) com.five_corp.ad.internal.movie.partialcache.l1.b(c1482m1, com.five_corp.ad.internal.movie.partialcache.H0.class);
                                                if (c1480l0 != null) {
                                                    m1Var.i = new com.five_corp.ad.internal.movie.partialcache.k1(c1480l0.h, h1);
                                                    com.five_corp.ad.internal.movie.partialcache.D0 d1 = (com.five_corp.ad.internal.movie.partialcache.D0) com.five_corp.ad.internal.movie.partialcache.l1.b(h1, com.five_corp.ad.internal.movie.partialcache.D0.class);
                                                    if (d1 != null && (a2 = (com.five_corp.ad.internal.movie.partialcache.A) com.five_corp.ad.internal.movie.partialcache.l1.b(d1, com.five_corp.ad.internal.movie.partialcache.A.class)) != null && (b = (com.five_corp.ad.internal.movie.partialcache.B) com.five_corp.ad.internal.movie.partialcache.l1.b(a2, com.five_corp.ad.internal.movie.partialcache.B.class)) != null) {
                                                        java.nio.ByteBuffer byteBufferAllocate = java.nio.ByteBuffer.allocate(b.i[c].length + i4);
                                                        byte[] bArr4 = new byte[i4];
                                                        // fill-array-data instruction
                                                        bArr4[0] = 0;
                                                        bArr4[1] = 0;
                                                        bArr4[2] = 0;
                                                        bArr4[3] = 1;
                                                        byteBufferAllocate.put(bArr4);
                                                        byteBufferAllocate.put(b.i[c]);
                                                        byteBufferAllocate.rewind();
                                                        java.nio.ByteBuffer byteBufferAllocate2 = java.nio.ByteBuffer.allocate(b.j[c].length + i4);
                                                        byte[] bArr5 = new byte[i4];
                                                        // fill-array-data instruction
                                                        bArr5[0] = 0;
                                                        bArr5[1] = 0;
                                                        bArr5[2] = 0;
                                                        bArr5[3] = 1;
                                                        byteBufferAllocate2.put(bArr5);
                                                        byteBufferAllocate2.put(b.j[c]);
                                                        byteBufferAllocate2.rewind();
                                                        m1Var.g = new com.five_corp.ad.internal.movie.partialcache.y1(a2.f, a2.g, byteBufferAllocate, byteBufferAllocate2, b.f, b.g);
                                                        if (!java.util.Arrays.equals(c1468f0.h, "soun".getBytes())) {
                                                            c1482m0 = (com.five_corp.ad.internal.movie.partialcache.C1482m0) com.five_corp.ad.internal.movie.partialcache.l1.b(c1476j0, com.five_corp.ad.internal.movie.partialcache.C1482m0.class);
                                                            if (c1482m0 != null) {
                                                                h0 = (com.five_corp.ad.internal.movie.partialcache.H0) com.five_corp.ad.internal.movie.partialcache.l1.b(c1482m0, com.five_corp.ad.internal.movie.partialcache.H0.class);
                                                                if (c1480l0 != null) {
                                                                    m1Var.j = new com.five_corp.ad.internal.movie.partialcache.k1(c1480l0.h, h0);
                                                                    d0 = (com.five_corp.ad.internal.movie.partialcache.D0) com.five_corp.ad.internal.movie.partialcache.l1.b(h0, com.five_corp.ad.internal.movie.partialcache.D0.class);
                                                                    if (d0 == null) {
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        c = 0;
                                                        i4 = 4;
                                                    }
                                                }
                                            }
                                        } else {
                                            if (!java.util.Arrays.equals(c1468f0.h, "soun".getBytes())) {
                                                c1482m0 = (com.five_corp.ad.internal.movie.partialcache.C1482m0) com.five_corp.ad.internal.movie.partialcache.l1.b(c1476j0, com.five_corp.ad.internal.movie.partialcache.C1482m0.class);
                                                if (c1482m0 != null) {
                                                    h0 = (com.five_corp.ad.internal.movie.partialcache.H0) com.five_corp.ad.internal.movie.partialcache.l1.b(c1482m0, com.five_corp.ad.internal.movie.partialcache.H0.class);
                                                    if (c1480l0 != null) {
                                                        m1Var.j = new com.five_corp.ad.internal.movie.partialcache.k1(c1480l0.h, h0);
                                                        d0 = (com.five_corp.ad.internal.movie.partialcache.D0) com.five_corp.ad.internal.movie.partialcache.l1.b(h0, com.five_corp.ad.internal.movie.partialcache.D0.class);
                                                        if (d0 == null && (c1474i0 = (com.five_corp.ad.internal.movie.partialcache.C1474i0) com.five_corp.ad.internal.movie.partialcache.l1.b(d0, com.five_corp.ad.internal.movie.partialcache.C1474i0.class)) != null && (c1458a0 = (com.five_corp.ad.internal.movie.partialcache.C1458a0) com.five_corp.ad.internal.movie.partialcache.l1.b(c1474i0, com.five_corp.ad.internal.movie.partialcache.C1458a0.class)) != null) {
                                                            java.util.Iterator it2 = c1458a0.h.f1988a.iterator();
                                                            do {
                                                                if (!it2.hasNext()) {
                                                                    x = null;
                                                                    break;
                                                                }
                                                                x = (com.five_corp.ad.internal.movie.partialcache.X) it2.next();
                                                            } while (!com.five_corp.ad.internal.movie.partialcache.V.class.isInstance(x));
                                                            com.five_corp.ad.internal.movie.partialcache.V v = (com.five_corp.ad.internal.movie.partialcache.V) x;
                                                            if (v != null) {
                                                                java.util.Iterator it3 = v.f1988a.iterator();
                                                                do {
                                                                    if (!it3.hasNext()) {
                                                                        x2 = null;
                                                                        break;
                                                                    }
                                                                    x2 = (com.five_corp.ad.internal.movie.partialcache.X) it3.next();
                                                                } while (!com.five_corp.ad.internal.movie.partialcache.W.class.isInstance(x2));
                                                                com.five_corp.ad.internal.movie.partialcache.W w = (com.five_corp.ad.internal.movie.partialcache.W) x2;
                                                                if (w != null) {
                                                                    m1Var.h = new com.five_corp.ad.internal.movie.partialcache.C1457a(c1474i0.g, c1474i0.f, java.nio.ByteBuffer.wrap(w.b));
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                            c = 0;
                                            i4 = 4;
                                        }
                                    }
                                }
                            }
                            m1Var.b = null;
                            m1Var.k = true;
                            i = 2;
                        }
                        throw new java.lang.RuntimeException();
                    }
                }
                v1Var.d = i;
                com.five_corp.ad.internal.movie.partialcache.m1 m1Var2 = v1Var.c;
                int i9 = m1Var2.f;
                android.media.MediaFormat mediaFormatB = m1Var2.b();
                android.media.MediaFormat mediaFormatA = v1Var.c.a();
                v1Var.e = mediaFormatA != null;
                com.five_corp.ad.internal.movie.x xVar = u1Var3.e;
                xVar.getClass();
                xVar.n.post(new com.five_corp.ad.internal.movie.RunnableC1455l(xVar, new com.five_corp.ad.internal.movie.C1450g(xVar, mediaFormatB, mediaFormatA)));
            }
            if (v1Var.d == 2) {
                com.five_corp.ad.internal.movie.partialcache.u1.a(this.f, v1Var);
            }
        }
    }
}
