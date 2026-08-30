package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public final class w1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final java.util.List f1445a;
    public final int b;
    public final int c;
    public final int d;
    public final float e;
    public final java.lang.String f;

    public static com.applovin.impl.w1 b(com.applovin.impl.ah ahVar) throws com.applovin.impl.ch {
        int i;
        int i2;
        float f;
        java.lang.String strA;
        try {
            ahVar.g(4);
            int iW = (ahVar.w() & 3) + 1;
            if (iW != 3) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                int iW2 = ahVar.w() & 31;
                for (int i3 = 0; i3 < iW2; i3++) {
                    arrayList.add(a(ahVar));
                }
                int iW3 = ahVar.w();
                for (int i4 = 0; i4 < iW3; i4++) {
                    arrayList.add(a(ahVar));
                }
                if (iW2 > 0) {
                    com.applovin.impl.yf.b bVarC = com.applovin.impl.yf.c((byte[]) arrayList.get(0), iW, ((byte[]) arrayList.get(0)).length);
                    int i5 = bVarC.e;
                    int i6 = bVarC.f;
                    float f2 = bVarC.g;
                    strA = com.applovin.impl.o3.a(bVarC.f1542a, bVarC.b, bVarC.c);
                    i = i5;
                    i2 = i6;
                    f = f2;
                } else {
                    i = -1;
                    i2 = -1;
                    f = 1.0f;
                    strA = null;
                }
                return new com.applovin.impl.w1(arrayList, iW, i, i2, f, strA);
            }
            throw new java.lang.IllegalStateException();
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
            throw com.applovin.impl.ch.a("Error parsing AVC config", e);
        }
    }

    private w1(java.util.List list, int i, int i2, int i3, float f, java.lang.String str) {
        this.f1445a = list;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = f;
        this.f = str;
    }

    private static byte[] a(com.applovin.impl.ah ahVar) {
        int iC = ahVar.C();
        int iD = ahVar.d();
        ahVar.g(iC);
        return com.applovin.impl.o3.a(ahVar.c(), iD, iC);
    }
}
