package com.five_corp.ad.internal.view;

/* JADX INFO: loaded from: classes4.dex */
public final class G extends com.five_corp.ad.internal.view.J implements com.five_corp.ad.internal.view.C, com.five_corp.ad.internal.movie.F {
    public final com.five_corp.ad.internal.r i;
    public final java.lang.Object j;
    public int k;
    public final com.five_corp.ad.internal.movie.G l;
    public boolean m;
    public boolean n;
    public final com.five_corp.ad.internal.ad.t o;
    public final com.five_corp.ad.internal.ad.t p;

    public G(android.content.Context context, com.five_corp.ad.internal.context.l lVar, com.five_corp.ad.internal.o oVar, com.five_corp.ad.internal.view.I i, com.five_corp.ad.internal.logger.a aVar, com.five_corp.ad.internal.r rVar, com.five_corp.ad.internal.http.movcache.h hVar) {
        super(context, lVar, oVar, i, aVar);
        java.lang.System.identityHashCode(this);
        this.j = new java.lang.Object();
        this.m = true;
        this.i = rVar;
        this.n = false;
        this.l = a(context, lVar, this.c, aVar, hVar);
        this.k = 2;
        com.five_corp.ad.internal.ad.g gVar = lVar.b.H;
        if (gVar == null || gVar.a() != 2) {
            return;
        }
        com.five_corp.ad.internal.ad.t tVar = new com.five_corp.ad.internal.ad.t(getContext());
        this.o = tVar;
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams.gravity = 48;
        tVar.setLayoutParams(layoutParams);
        tVar.setGravity(17);
        tVar.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        androidx.core.widget.TextViewCompat.setAutoSizeTextTypeWithDefaults(tVar, 1);
        addView(tVar);
        com.five_corp.ad.internal.ad.t tVar2 = new com.five_corp.ad.internal.ad.t(getContext());
        this.p = tVar2;
        android.widget.FrameLayout.LayoutParams layoutParams2 = new android.widget.FrameLayout.LayoutParams(-1, -2);
        layoutParams2.gravity = 80;
        tVar2.setLayoutParams(layoutParams2);
        tVar2.setGravity(17);
        tVar.setTextColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        androidx.core.widget.TextViewCompat.setAutoSizeTextTypeWithDefaults(tVar2, 1);
        addView(tVar2);
    }

    public final com.five_corp.ad.internal.movie.G a(android.content.Context context, com.five_corp.ad.internal.context.l lVar, com.five_corp.ad.internal.view.C1515h c1515h, com.five_corp.ad.internal.logger.a aVar, com.five_corp.ad.internal.http.movcache.h hVar) {
        com.five_corp.ad.internal.cache.q qVar = lVar.g;
        com.five_corp.ad.internal.cache.o oVar = (com.five_corp.ad.internal.cache.o) qVar.f1875a.get(lVar.b.n);
        android.view.TextureView textureView = new android.view.TextureView(context);
        com.five_corp.ad.internal.view.D d = new com.five_corp.ad.internal.view.D(context, this, this, c1515h, lVar.h, lVar.b.p, textureView);
        int iOrdinal = lVar.i.ordinal();
        if (iOrdinal == 1) {
            return new com.five_corp.ad.internal.movie.E(this, oVar, d, textureView, aVar);
        }
        if (iOrdinal == 2) {
            return new com.five_corp.ad.internal.movie.x(this, oVar, lVar, hVar, d, textureView, lVar.j, aVar);
        }
        if (iOrdinal == 3) {
            return new com.five_corp.ad.internal.movie.exoplayer.a(new com.five_corp.ad.internal.movie.exoplayer.o(context, textureView, d, androidx.media3.common.MediaItem.fromUri(lVar.b.n.f1835a), lVar.b.i), this);
        }
        if (iOrdinal == 4) {
            return new com.five_corp.ad.internal.movie.exoplayer.a(new com.five_corp.ad.internal.movie.exoplayer.o(context, textureView, d, androidx.media3.common.MediaItem.fromUri(oVar.c()), lVar.b.i), this);
        }
        throw new java.lang.RuntimeException("Unreachable only for compiler.");
    }

    public final void b(int i) {
        if (this.k == 3) {
            this.k = 4;
        }
        com.five_corp.ad.f fVar = (com.five_corp.ad.f) this.d;
        fVar.s.a();
        fVar.o.o(i, fVar.t);
        com.five_corp.ad.internal.layouter.k kVar = fVar.w;
        com.five_corp.ad.internal.layouter.i iVar = kVar.b;
        kVar.a(com.five_corp.ad.internal.layouter.i.a(i, iVar.c, false, iVar.f, false));
    }

    @Override // com.five_corp.ad.internal.view.J
    public final boolean c() {
        return this.k == 5;
    }

    @Override // com.five_corp.ad.internal.view.J
    public final void d() {
        this.l.prepare();
    }

    @Override // com.five_corp.ad.internal.view.J
    public final void e() {
        this.l.release();
    }

    @Override // com.five_corp.ad.internal.view.J
    public final void f() {
        int i = this.k;
        if (i == 1 || i == 2) {
            return;
        }
        this.k = 2;
        this.n = false;
        this.l.b();
    }

    @Override // com.five_corp.ad.internal.view.J
    public final void g() {
        synchronized (this.j) {
            this.n = !this.n;
        }
    }

    @Override // com.five_corp.ad.internal.view.J
    public int getCurrentPositionMs() {
        return this.l.a();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            this.l.prepare();
        } else {
            this.l.release();
        }
    }

    public final void c(int i) {
        if (this.k == 4) {
            this.k = 3;
            com.five_corp.ad.f fVar = (com.five_corp.ad.f) this.d;
            fVar.o.s(i, fVar.t);
            com.five_corp.ad.internal.layouter.k kVar = fVar.w;
            com.five_corp.ad.internal.layouter.i iVar = kVar.b;
            kVar.a(com.five_corp.ad.internal.layouter.i.a(i, iVar.c, false, iVar.f, true));
        }
    }

    @Override // com.five_corp.ad.internal.movie.F
    public final void b() {
        int i = this.k;
        if (i == 1 || i == 5) {
            return;
        }
        this.k = 2;
    }

    @Override // com.five_corp.ad.internal.view.J
    public final void a(boolean z) {
        if (this.m == z) {
            return;
        }
        this.m = z;
        this.l.a(z);
    }

    public final void a(com.five_corp.ad.internal.s sVar) {
        try {
            if (sVar.f2045a.c) {
                this.i.a(this.b.b.n);
            }
            this.k = 1;
            ((com.five_corp.ad.f) this.d).a(getCurrentPositionMs(), sVar);
        } catch (java.lang.Throwable th) {
            this.e.a(th);
        }
    }

    public final void a(int i) {
        if (this.k != 3) {
            return;
        }
        this.k = 5;
        com.five_corp.ad.f fVar = (com.five_corp.ad.f) this.d;
        long j = i;
        for (com.five_corp.ad.internal.beacon.d dVar : fVar.s.f1852a) {
            if (!dVar.f) {
                com.five_corp.ad.internal.ad.beacon.a aVar = dVar.b;
                if (aVar.f1791a == 1 && aVar.b == 3) {
                    long j2 = aVar.c;
                    if (j < j2) {
                        com.five_corp.ad.internal.logger.a aVar2 = dVar.f1847a;
                        java.util.Locale locale = java.util.Locale.US;
                        aVar2.a(4, "eventThresholdMs is larger than movie duration. ots = " + dVar.h + ", thresholdMs = " + j2 + ", (estimated) movie duration = " + j);
                    }
                    dVar.f = true;
                    dVar.g.a(j, dVar.b);
                }
            }
        }
        fVar.o.v(j, fVar.t);
        com.five_corp.ad.internal.layouter.k kVar = fVar.w;
        com.five_corp.ad.internal.layouter.i iVar = kVar.b;
        int i2 = iVar.c;
        kVar.a(com.five_corp.ad.internal.layouter.i.a(i2, i2, true, iVar.f, false));
        com.five_corp.ad.internal.fullscreen.e eVar = fVar.v;
        if (eVar != null) {
            eVar.d();
        }
    }

    @Override // com.five_corp.ad.internal.movie.F
    public final void a() {
        if (this.k == 2) {
            this.k = 4;
            com.five_corp.ad.f fVar = (com.five_corp.ad.f) this.d;
            fVar.r = true;
            fVar.k = Long.MAX_VALUE;
            com.five_corp.ad.internal.B b = fVar.o;
            if (!b.l) {
                b.l = true;
                if (b.g.d.b.h) {
                    b.a(16, 0L, 0.0d, null, null);
                }
            }
            this.l.a(this.m);
        }
    }

    /* JADX WARN: Code duplicated, block: B:22:0x004a  */
    /* JADX WARN: Code duplicated, block: B:24:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x005e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:40:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:54:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:58:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:66:0x0105  */
    /* JADX WARN: Code duplicated, block: B:69:0x008f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:71:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:72:0x00a8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:73:0x009a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:75:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:76:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:78:0x007f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    @Override // com.five_corp.ad.internal.view.J
    public final void a(com.five_corp.ad.internal.viewability.b bVar) {
        boolean z;
        com.five_corp.ad.internal.ad.t tVar;
        com.five_corp.ad.internal.ad.t tVar2;
        long j;
        com.five_corp.ad.internal.ad.beacon.a aVar;
        long j2;
        long j3;
        com.five_corp.ad.internal.ad.beacon.j jVar = this.b.b.B;
        int iA = com.five_corp.ad.e.a(jVar.f1796a);
        if (iA == 0) {
            double d = bVar.f2115a;
            double d2 = jVar.b;
            if (d2 > 0.0d ? d >= java.lang.Math.min(d2, 0.99d) : d > 0.0d) {
                z = this.n ? false : true;
            }
            if (!z) {
                if (z) {
                    this.l.start();
                }
            } else if (z) {
                this.l.start();
            }
            if (this.k == 3) {
                com.five_corp.ad.internal.view.I i = this.d;
                int currentPositionMs = getCurrentPositionMs();
                com.five_corp.ad.f fVar = (com.five_corp.ad.f) i;
                j = currentPositionMs;
                for (com.five_corp.ad.internal.beacon.d dVar : fVar.s.f1852a) {
                    if (!dVar.f) {
                        aVar = dVar.b;
                        if (aVar.f1791a == 1) {
                            if (aVar.b != 3) {
                                if (dVar.e) {
                                    j3 = dVar.c;
                                    if (j >= j3) {
                                        dVar.d += j - j3;
                                    } else {
                                        dVar.e = true;
                                    }
                                } else {
                                    dVar.e = true;
                                }
                                j2 = dVar.d;
                                if (j2 >= aVar.c) {
                                    dVar.f = true;
                                    dVar.g.a(j2, aVar);
                                }
                                dVar.c = j;
                            } else if (j >= aVar.c) {
                                dVar.f = true;
                                dVar.g.a(j, aVar);
                            }
                        }
                    }
                }
                com.five_corp.ad.internal.layouter.k kVar = fVar.w;
                com.five_corp.ad.internal.layouter.i iVar = kVar.b;
                kVar.a(com.five_corp.ad.internal.layouter.i.a(currentPositionMs, iVar.c, iVar.e, iVar.f, iVar.g));
            }
            tVar = this.o;
            if (tVar != null) {
                tVar.setText(java.lang.String.format("MA: %.2f, AC: %.2f", java.lang.Double.valueOf(bVar.f2115a), java.lang.Double.valueOf(bVar.b)));
            }
            tVar2 = this.p;
            if (tVar2 != null) {
                tVar2.setText(java.lang.String.format("MA: %.2f, AC: %.2f", java.lang.Double.valueOf(bVar.f2115a), java.lang.Double.valueOf(bVar.b)));
            }
        }
        if (iA != 1) {
            throw new java.lang.RuntimeException();
        }
        double d3 = bVar.b;
        double d4 = jVar.b;
        if (d4 > 0.0d ? d3 >= java.lang.Math.min(d4, 0.99d) : d3 > 0.0d) {
            if (this.n) {
            }
        }
        if (!z && this.k == 3) {
            this.l.pause();
        } else if (z && this.k == 4) {
            this.l.start();
        }
        if (this.k == 3) {
            com.five_corp.ad.internal.view.I i2 = this.d;
            int currentPositionMs2 = getCurrentPositionMs();
            com.five_corp.ad.f fVar2 = (com.five_corp.ad.f) i2;
            j = currentPositionMs2;
            while (r3.hasNext()) {
                if (!dVar.f) {
                    aVar = dVar.b;
                    if (aVar.f1791a == 1) {
                        if (aVar.b != 3) {
                            if (dVar.e) {
                                j3 = dVar.c;
                                if (j >= j3) {
                                    dVar.d += j - j3;
                                } else {
                                    dVar.e = true;
                                }
                            } else {
                                dVar.e = true;
                            }
                            j2 = dVar.d;
                            if (j2 >= aVar.c) {
                                dVar.f = true;
                                dVar.g.a(j2, aVar);
                            }
                            dVar.c = j;
                        } else if (j >= aVar.c) {
                            dVar.f = true;
                            dVar.g.a(j, aVar);
                        }
                    }
                }
            }
            com.five_corp.ad.internal.layouter.k kVar2 = fVar2.w;
            com.five_corp.ad.internal.layouter.i iVar2 = kVar2.b;
            kVar2.a(com.five_corp.ad.internal.layouter.i.a(currentPositionMs2, iVar2.c, iVar2.e, iVar2.f, iVar2.g));
        }
        tVar = this.o;
        if (tVar != null) {
            tVar.setText(java.lang.String.format("MA: %.2f, AC: %.2f", java.lang.Double.valueOf(bVar.f2115a), java.lang.Double.valueOf(bVar.b)));
        }
        tVar2 = this.p;
        if (tVar2 != null) {
            tVar2.setText(java.lang.String.format("MA: %.2f, AC: %.2f", java.lang.Double.valueOf(bVar.f2115a), java.lang.Double.valueOf(bVar.b)));
        }
        if (!z) {
            if (z) {
                this.l.start();
            }
        } else if (z) {
            this.l.start();
        }
        if (this.k == 3) {
            com.five_corp.ad.internal.view.I i3 = this.d;
            int currentPositionMs3 = getCurrentPositionMs();
            com.five_corp.ad.f fVar3 = (com.five_corp.ad.f) i3;
            j = currentPositionMs3;
            while (r3.hasNext()) {
                if (!dVar.f) {
                    aVar = dVar.b;
                    if (aVar.f1791a == 1) {
                        if (aVar.b != 3) {
                            if (dVar.e) {
                                j3 = dVar.c;
                                if (j >= j3) {
                                    dVar.d += j - j3;
                                } else {
                                    dVar.e = true;
                                }
                            } else {
                                dVar.e = true;
                            }
                            j2 = dVar.d;
                            if (j2 >= aVar.c) {
                                dVar.f = true;
                                dVar.g.a(j2, aVar);
                            }
                            dVar.c = j;
                        } else if (j >= aVar.c) {
                            dVar.f = true;
                            dVar.g.a(j, aVar);
                        }
                    }
                }
            }
            com.five_corp.ad.internal.layouter.k kVar3 = fVar3.w;
            com.five_corp.ad.internal.layouter.i iVar3 = kVar3.b;
            kVar3.a(com.five_corp.ad.internal.layouter.i.a(currentPositionMs3, iVar3.c, iVar3.e, iVar3.f, iVar3.g));
        }
        tVar = this.o;
        if (tVar != null) {
            tVar.setText(java.lang.String.format("MA: %.2f, AC: %.2f", java.lang.Double.valueOf(bVar.f2115a), java.lang.Double.valueOf(bVar.b)));
        }
        tVar2 = this.p;
        if (tVar2 != null) {
            tVar2.setText(java.lang.String.format("MA: %.2f, AC: %.2f", java.lang.Double.valueOf(bVar.f2115a), java.lang.Double.valueOf(bVar.b)));
        }
    }
}
