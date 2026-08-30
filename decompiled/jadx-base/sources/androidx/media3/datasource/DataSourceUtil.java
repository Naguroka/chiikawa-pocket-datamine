package androidx.media3.datasource;

/* JADX INFO: loaded from: classes.dex */
public final class DataSourceUtil {
    private DataSourceUtil() {
    }

    public static byte[] readToEnd(androidx.media3.datasource.DataSource dataSource) throws java.io.IOException {
        byte[] bArrCopyOf = new byte[1024];
        int i = 0;
        int i2 = 0;
        while (i != -1) {
            if (i2 == bArrCopyOf.length) {
                bArrCopyOf = java.util.Arrays.copyOf(bArrCopyOf, bArrCopyOf.length * 2);
            }
            i = dataSource.read(bArrCopyOf, i2, bArrCopyOf.length - i2);
            if (i != -1) {
                i2 += i;
            }
        }
        return java.util.Arrays.copyOf(bArrCopyOf, i2);
    }

    public static byte[] readExactly(androidx.media3.datasource.DataSource dataSource, int i) throws java.io.IOException {
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int i3 = dataSource.read(bArr, i2, i - i2);
            if (i3 == -1) {
                throw new java.lang.IllegalStateException("Not enough data could be read: " + i2 + " < " + i);
            }
            i2 += i3;
        }
        return bArr;
    }

    public static void closeQuietly(androidx.media3.datasource.DataSource dataSource) {
        if (dataSource != null) {
            try {
                dataSource.close();
            } catch (java.io.IOException unused) {
            }
        }
    }
}
