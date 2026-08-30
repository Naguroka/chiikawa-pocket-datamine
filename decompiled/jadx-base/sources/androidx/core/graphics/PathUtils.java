package androidx.core.graphics;

/* JADX INFO: loaded from: classes.dex */
public final class PathUtils {
    public static java.util.Collection<androidx.core.graphics.PathSegment> flatten(android.graphics.Path path) {
        return flatten(path, 0.5f);
    }

    public static java.util.Collection<androidx.core.graphics.PathSegment> flatten(android.graphics.Path path, float f) {
        float[] fArrApproximate = androidx.core.graphics.PathUtils.Api26Impl.approximate(path, f);
        int length = fArrApproximate.length / 3;
        java.util.ArrayList arrayList = new java.util.ArrayList(length);
        for (int i = 1; i < length; i++) {
            int i2 = i * 3;
            int i3 = (i - 1) * 3;
            float f2 = fArrApproximate[i2];
            float f3 = fArrApproximate[i2 + 1];
            float f4 = fArrApproximate[i2 + 2];
            float f5 = fArrApproximate[i3];
            float f6 = fArrApproximate[i3 + 1];
            float f7 = fArrApproximate[i3 + 2];
            if (f2 != f5 && (f3 != f6 || f4 != f7)) {
                arrayList.add(new androidx.core.graphics.PathSegment(new android.graphics.PointF(f6, f7), f5, new android.graphics.PointF(f3, f4), f2));
            }
        }
        return arrayList;
    }

    private PathUtils() {
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static float[] approximate(android.graphics.Path path, float f) {
            return path.approximate(f);
        }
    }
}
