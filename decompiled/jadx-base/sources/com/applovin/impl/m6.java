package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class m6 implements com.applovin.impl.dp.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f1017a;
    private final java.util.List b;

    private com.applovin.impl.vp b(com.applovin.impl.dp.b bVar) {
        return new com.applovin.impl.vp(c(bVar));
    }

    public m6(int i) {
        this(i, com.applovin.impl.db.h());
    }

    private java.util.List c(com.applovin.impl.dp.b bVar) {
        java.lang.String str;
        int i;
        java.util.List listA;
        if (a(32)) {
            return this.b;
        }
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(bVar.d);
        java.util.List arrayList = this.b;
        while (ahVar.a() > 0) {
            int iW = ahVar.w();
            int iD = ahVar.d() + ahVar.w();
            if (iW == 134) {
                arrayList = new java.util.ArrayList();
                int iW2 = ahVar.w() & 31;
                for (int i2 = 0; i2 < iW2; i2++) {
                    java.lang.String strC = ahVar.c(3);
                    int iW3 = ahVar.w();
                    boolean z = (iW3 & 128) != 0;
                    if (z) {
                        i = iW3 & 63;
                        str = androidx.media3.common.MimeTypes.APPLICATION_CEA708;
                    } else {
                        str = androidx.media3.common.MimeTypes.APPLICATION_CEA608;
                        i = 1;
                    }
                    byte bW = (byte) ahVar.w();
                    ahVar.g(1);
                    if (z) {
                        listA = com.applovin.impl.o3.a((bW & 64) != 0);
                    } else {
                        listA = null;
                    }
                    arrayList.add(new com.applovin.impl.e9.b().f(str).e(strC).a(i).a(listA).a());
                }
            }
            ahVar.f(iD);
        }
        return arrayList;
    }

    public m6(int i, java.util.List list) {
        this.f1017a = i;
        this.b = list;
    }

    @Override // com.applovin.impl.dp.c
    public com.applovin.impl.dp a(int i, com.applovin.impl.dp.b bVar) {
        if (i == 2) {
            return new com.applovin.impl.ih(new com.applovin.impl.ea(b(bVar)));
        }
        if (i == 3 || i == 4) {
            return new com.applovin.impl.ih(new com.applovin.impl.rf(bVar.b));
        }
        if (i == 21) {
            return new com.applovin.impl.ih(new com.applovin.impl.za());
        }
        if (i == 27) {
            if (a(4)) {
                return null;
            }
            return new com.applovin.impl.ih(new com.applovin.impl.ga(a(bVar), a(1), a(8)));
        }
        if (i == 36) {
            return new com.applovin.impl.ih(new com.applovin.impl.ha(a(bVar)));
        }
        if (i != 89) {
            if (i != 138) {
                if (i == 172) {
                    return new com.applovin.impl.ih(new com.applovin.impl.m(bVar.b));
                }
                if (i == 257) {
                    return new com.applovin.impl.hj(new com.applovin.impl.dh(androidx.media3.common.MimeTypes.APPLICATION_AIT));
                }
                if (i != 129) {
                    if (i != 130) {
                        if (i == 134) {
                            if (a(16)) {
                                return null;
                            }
                            return new com.applovin.impl.hj(new com.applovin.impl.dh(androidx.media3.common.MimeTypes.APPLICATION_SCTE35));
                        }
                        if (i != 135) {
                            switch (i) {
                                case 15:
                                    if (a(2)) {
                                        return null;
                                    }
                                    return new com.applovin.impl.ih(new com.applovin.impl.k0(false, bVar.b));
                                case 16:
                                    return new com.applovin.impl.ih(new com.applovin.impl.fa(b(bVar)));
                                case 17:
                                    if (a(2)) {
                                        return null;
                                    }
                                    return new com.applovin.impl.ih(new com.applovin.impl.ac(bVar.b));
                                default:
                                    return null;
                            }
                        }
                    } else if (!a(64)) {
                        return null;
                    }
                }
                return new com.applovin.impl.ih(new com.applovin.impl.j(bVar.b));
            }
            return new com.applovin.impl.ih(new com.applovin.impl.d7(bVar.b));
        }
        return new com.applovin.impl.ih(new com.applovin.impl.l7(bVar.c));
    }

    private boolean a(int i) {
        return (i & this.f1017a) != 0;
    }

    @Override // com.applovin.impl.dp.c
    public android.util.SparseArray a() {
        return new android.util.SparseArray();
    }

    private com.applovin.impl.nj a(com.applovin.impl.dp.b bVar) {
        return new com.applovin.impl.nj(c(bVar));
    }
}
