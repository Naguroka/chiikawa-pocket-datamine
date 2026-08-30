package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public abstract class o3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f1109a = {0, 0, 0, 1};
    private static final java.lang.String[] b = {"", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};

    public static java.lang.String a(int i, int i2, int i3) {
        return java.lang.String.format("avc1.%02X%02X%02X", java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3));
    }

    public static java.util.List a(boolean z) {
        return java.util.Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static java.lang.String a(com.applovin.impl.bh bhVar) {
        bhVar.d(24);
        int iB = bhVar.b(2);
        boolean zC = bhVar.c();
        int iB2 = bhVar.b(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (bhVar.c()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = bhVar.b(8);
        }
        int iB3 = bhVar.b(8);
        java.lang.Object[] objArr = new java.lang.Object[5];
        objArr[0] = b[iB];
        objArr[1] = java.lang.Integer.valueOf(iB2);
        objArr[2] = java.lang.Integer.valueOf(i);
        objArr[3] = java.lang.Character.valueOf(zC ? 'H' : 'L');
        objArr[4] = java.lang.Integer.valueOf(iB3);
        java.lang.StringBuilder sb = new java.lang.StringBuilder(com.applovin.impl.xp.a("hvc1.%s%d.%X.%c%d", objArr));
        while (i3 > 0 && iArr[i3 - 1] == 0) {
            i3--;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append(java.lang.String.format(".%02X", java.lang.Integer.valueOf(iArr[i5])));
        }
        return sb.toString();
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f1109a;
        byte[] bArr3 = new byte[bArr2.length + i2];
        java.lang.System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        java.lang.System.arraycopy(bArr, i, bArr3, bArr2.length, i2);
        return bArr3;
    }

    public static boolean a(java.util.List list) {
        return list.size() == 1 && ((byte[]) list.get(0)).length == 1 && ((byte[]) list.get(0))[0] == 1;
    }

    public static android.util.Pair a(byte[] bArr) {
        com.applovin.impl.ah ahVar = new com.applovin.impl.ah(bArr);
        ahVar.f(9);
        int iW = ahVar.w();
        ahVar.f(20);
        return android.util.Pair.create(java.lang.Integer.valueOf(ahVar.A()), java.lang.Integer.valueOf(iW));
    }
}
