package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
abstract class di {
    private static int a(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    private static boolean a(com.applovin.impl.ah ahVar) {
        ahVar.g(4);
        int iJ = ahVar.j();
        ahVar.f(0);
        return iJ == 1886547818;
    }

    public static com.applovin.impl.ci a(byte[] bArr, int i) {
        java.util.ArrayList arrayListD;
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(bArr);
        try {
            arrayListD = a(ahVar) ? d(ahVar) : c(ahVar);
        } catch (java.lang.ArrayIndexOutOfBoundsException unused) {
            arrayListD = null;
        }
        if (arrayListD == null) {
            return null;
        }
        int size = arrayListD.size();
        if (size == 1) {
            return new com.applovin.impl.ci((com.applovin.impl.ci.a) arrayListD.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new com.applovin.impl.ci((com.applovin.impl.ci.a) arrayListD.get(0), (com.applovin.impl.ci.a) arrayListD.get(1), i);
    }

    private static java.util.ArrayList d(com.applovin.impl.ah ahVar) {
        int iJ;
        ahVar.g(8);
        int iD = ahVar.d();
        int iE = ahVar.e();
        while (iD < iE && (iJ = ahVar.j() + iD) > iD && iJ <= iE) {
            int iJ2 = ahVar.j();
            if (iJ2 != 2037673328 && iJ2 != 1836279920) {
                ahVar.f(iJ);
                iD = iJ;
            } else {
                ahVar.e(iJ);
                return c(ahVar);
            }
        }
        return null;
    }

    private static java.util.ArrayList c(com.applovin.impl.ah ahVar) {
        if (ahVar.w() != 0) {
            return null;
        }
        ahVar.g(7);
        int iJ = ahVar.j();
        if (iJ == 1684433976) {
            com.applovin.impl.ah ahVar2 = new com.applovin.impl.ah();
            java.util.zip.Inflater inflater = new java.util.zip.Inflater(true);
            try {
                if (!com.applovin.impl.xp.a(ahVar, ahVar2, inflater)) {
                    inflater.end();
                    return null;
                }
                inflater.end();
                ahVar = ahVar2;
            } catch (java.lang.Throwable th) {
                inflater.end();
                throw th;
            }
        } else if (iJ != 1918990112) {
            return null;
        }
        return e(ahVar);
    }

    private static java.util.ArrayList e(com.applovin.impl.ah ahVar) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        int iD = ahVar.d();
        int iE = ahVar.e();
        while (iD < iE) {
            int iJ = ahVar.j() + iD;
            if (iJ <= iD || iJ > iE) {
                return null;
            }
            if (ahVar.j() == 1835365224) {
                com.applovin.impl.ci.a aVarB = b(ahVar);
                if (aVarB == null) {
                    return null;
                }
                arrayList.add(aVarB);
            }
            ahVar.f(iJ);
            iD = iJ;
        }
        return arrayList;
    }

    private static com.applovin.impl.ci.a b(com.applovin.impl.ah ahVar) {
        int iJ = ahVar.j();
        if (iJ > 10000) {
            return null;
        }
        float[] fArr = new float[iJ];
        for (int i = 0; i < iJ; i++) {
            fArr[i] = ahVar.i();
        }
        int iJ2 = ahVar.j();
        if (iJ2 > 32000) {
            return null;
        }
        double d = 2.0d;
        double dLog = java.lang.Math.log(2.0d);
        int iCeil = (int) java.lang.Math.ceil(java.lang.Math.log(((double) iJ) * 2.0d) / dLog);
        com.applovin.impl.zg zgVar = new com.applovin.impl.zg(ahVar.c());
        int i2 = 8;
        zgVar.c(ahVar.d() * 8);
        float[] fArr2 = new float[iJ2 * 5];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < iJ2) {
            int i6 = 0;
            while (i6 < i3) {
                int iA = iArr[i6] + a(zgVar.a(iCeil));
                if (iA >= iJ || iA < 0) {
                    return null;
                }
                fArr2[i5] = fArr[iA];
                iArr[i6] = iA;
                i6++;
                i5++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        zgVar.c((zgVar.e() + 7) & (-8));
        int i7 = 32;
        int iA2 = zgVar.a(32);
        com.applovin.impl.ci.b[] bVarArr = new com.applovin.impl.ci.b[iA2];
        int i8 = 0;
        while (i8 < iA2) {
            int iA3 = zgVar.a(i2);
            int iA4 = zgVar.a(i2);
            int iA5 = zgVar.a(i7);
            if (iA5 > 128000) {
                return null;
            }
            int iCeil2 = (int) java.lang.Math.ceil(java.lang.Math.log(((double) iJ2) * d) / dLog);
            float[] fArr3 = new float[iA5 * 3];
            float[] fArr4 = new float[iA5 * 2];
            int iA6 = 0;
            for (int i9 = 0; i9 < iA5; i9++) {
                iA6 += a(zgVar.a(iCeil2));
                if (iA6 < 0 || iA6 >= iJ2) {
                    return null;
                }
                int i10 = i9 * 3;
                int i11 = iA6 * 5;
                fArr3[i10] = fArr2[i11];
                fArr3[i10 + 1] = fArr2[i11 + 1];
                fArr3[i10 + 2] = fArr2[i11 + 2];
                int i12 = i9 * 2;
                fArr4[i12] = fArr2[i11 + 3];
                fArr4[i12 + 1] = fArr2[i11 + 4];
            }
            bVarArr[i8] = new com.applovin.impl.ci.b(iA3, fArr3, fArr4, iA4);
            i8++;
            i7 = 32;
            d = 2.0d;
            i2 = 8;
        }
        return new com.applovin.impl.ci.a(bVarArr);
    }
}
