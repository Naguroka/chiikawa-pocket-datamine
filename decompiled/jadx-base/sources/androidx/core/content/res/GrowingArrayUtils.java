package androidx.core.content.res;

/* JADX INFO: loaded from: classes.dex */
final class GrowingArrayUtils {
    public static int growSize(int i) {
        if (i <= 4) {
            return 8;
        }
        return i * 2;
    }

    public static <T> T[] append(T[] tArr, int i, T t) {
        if (i + 1 > tArr.length) {
            java.lang.Object[] objArr = (java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), growSize(i));
            java.lang.System.arraycopy(tArr, 0, objArr, 0, i);
            tArr = (T[]) objArr;
        }
        tArr[i] = t;
        return tArr;
    }

    public static int[] append(int[] iArr, int i, int i2) {
        if (i + 1 > iArr.length) {
            int[] iArr2 = new int[growSize(i)];
            java.lang.System.arraycopy(iArr, 0, iArr2, 0, i);
            iArr = iArr2;
        }
        iArr[i] = i2;
        return iArr;
    }

    public static long[] append(long[] jArr, int i, long j) {
        if (i + 1 > jArr.length) {
            long[] jArr2 = new long[growSize(i)];
            java.lang.System.arraycopy(jArr, 0, jArr2, 0, i);
            jArr = jArr2;
        }
        jArr[i] = j;
        return jArr;
    }

    public static boolean[] append(boolean[] zArr, int i, boolean z) {
        if (i + 1 > zArr.length) {
            boolean[] zArr2 = new boolean[growSize(i)];
            java.lang.System.arraycopy(zArr, 0, zArr2, 0, i);
            zArr = zArr2;
        }
        zArr[i] = z;
        return zArr;
    }

    public static <T> T[] insert(T[] tArr, int i, int i2, T t) {
        if (i + 1 <= tArr.length) {
            java.lang.System.arraycopy(tArr, i2, tArr, i2 + 1, i - i2);
            tArr[i2] = t;
            return tArr;
        }
        T[] tArr2 = (T[]) ((java.lang.Object[]) java.lang.reflect.Array.newInstance(tArr.getClass().getComponentType(), growSize(i)));
        java.lang.System.arraycopy(tArr, 0, tArr2, 0, i2);
        tArr2[i2] = t;
        java.lang.System.arraycopy(tArr, i2, tArr2, i2 + 1, tArr.length - i2);
        return tArr2;
    }

    public static int[] insert(int[] iArr, int i, int i2, int i3) {
        if (i + 1 <= iArr.length) {
            java.lang.System.arraycopy(iArr, i2, iArr, i2 + 1, i - i2);
            iArr[i2] = i3;
            return iArr;
        }
        int[] iArr2 = new int[growSize(i)];
        java.lang.System.arraycopy(iArr, 0, iArr2, 0, i2);
        iArr2[i2] = i3;
        java.lang.System.arraycopy(iArr, i2, iArr2, i2 + 1, iArr.length - i2);
        return iArr2;
    }

    public static long[] insert(long[] jArr, int i, int i2, long j) {
        if (i + 1 <= jArr.length) {
            java.lang.System.arraycopy(jArr, i2, jArr, i2 + 1, i - i2);
            jArr[i2] = j;
            return jArr;
        }
        long[] jArr2 = new long[growSize(i)];
        java.lang.System.arraycopy(jArr, 0, jArr2, 0, i2);
        jArr2[i2] = j;
        java.lang.System.arraycopy(jArr, i2, jArr2, i2 + 1, jArr.length - i2);
        return jArr2;
    }

    public static boolean[] insert(boolean[] zArr, int i, int i2, boolean z) {
        if (i + 1 <= zArr.length) {
            java.lang.System.arraycopy(zArr, i2, zArr, i2 + 1, i - i2);
            zArr[i2] = z;
            return zArr;
        }
        boolean[] zArr2 = new boolean[growSize(i)];
        java.lang.System.arraycopy(zArr, 0, zArr2, 0, i2);
        zArr2[i2] = z;
        java.lang.System.arraycopy(zArr, i2, zArr2, i2 + 1, zArr.length - i2);
        return zArr2;
    }

    private GrowingArrayUtils() {
    }
}
