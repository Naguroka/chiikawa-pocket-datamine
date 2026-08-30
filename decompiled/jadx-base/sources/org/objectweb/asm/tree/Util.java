package org.objectweb.asm.tree;

/* JADX INFO: loaded from: classes6.dex */
final class Util {
    private Util() {
    }

    static <T> java.util.List<T> add(java.util.List<T> list, T t) {
        if (list == null) {
            list = new java.util.ArrayList<>(1);
        }
        list.add(t);
        return list;
    }

    static <T> java.util.List<T> asArrayList(int i) {
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(null);
        }
        return arrayList;
    }

    static <T> java.util.List<T> asArrayList(T[] tArr) {
        if (tArr == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(t);
        }
        return arrayList;
    }

    static java.util.List<java.lang.Byte> asArrayList(byte[] bArr) {
        if (bArr == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(java.lang.Byte.valueOf(b));
        }
        return arrayList;
    }

    static java.util.List<java.lang.Boolean> asArrayList(boolean[] zArr) {
        if (zArr == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(java.lang.Boolean.valueOf(z));
        }
        return arrayList;
    }

    static java.util.List<java.lang.Short> asArrayList(short[] sArr) {
        if (sArr == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(java.lang.Short.valueOf(s));
        }
        return arrayList;
    }

    static java.util.List<java.lang.Character> asArrayList(char[] cArr) {
        if (cArr == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(cArr.length);
        for (char c : cArr) {
            arrayList.add(java.lang.Character.valueOf(c));
        }
        return arrayList;
    }

    static java.util.List<java.lang.Integer> asArrayList(int[] iArr) {
        if (iArr == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(java.lang.Integer.valueOf(i));
        }
        return arrayList;
    }

    static java.util.List<java.lang.Float> asArrayList(float[] fArr) {
        if (fArr == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(java.lang.Float.valueOf(f));
        }
        return arrayList;
    }

    static java.util.List<java.lang.Long> asArrayList(long[] jArr) {
        if (jArr == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(java.lang.Long.valueOf(j));
        }
        return arrayList;
    }

    static java.util.List<java.lang.Double> asArrayList(double[] dArr) {
        if (dArr == null) {
            return new java.util.ArrayList();
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(java.lang.Double.valueOf(d));
        }
        return arrayList;
    }

    static <T> java.util.List<T> asArrayList(int i, T[] tArr) {
        java.util.ArrayList arrayList = new java.util.ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add(tArr[i2]);
        }
        return arrayList;
    }
}
