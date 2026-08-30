package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
final class MatrixUtils {
    private static final float[][] NDC_CUBE = {new float[]{1.0f, 0.0f, 0.0f, 1.0f}, new float[]{-1.0f, 0.0f, 0.0f, 1.0f}, new float[]{0.0f, 1.0f, 0.0f, 1.0f}, new float[]{0.0f, -1.0f, 0.0f, 1.0f}, new float[]{0.0f, 0.0f, 1.0f, 1.0f}, new float[]{0.0f, 0.0f, -1.0f, 1.0f}};

    public static float[] getGlMatrixArray(android.graphics.Matrix matrix) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] matrix4x4Array = getMatrix4x4Array(fArr);
        float[] fArr2 = new float[16];
        android.opengl.Matrix.transposeM(fArr2, 0, matrix4x4Array, 0);
        return fArr2;
    }

    private static float[] getMatrix4x4Array(float[] fArr) {
        float[] fArr2 = new float[16];
        fArr2[10] = 1.0f;
        int i = 0;
        while (i < 3) {
            int i2 = 0;
            while (i2 < 3) {
                fArr2[((i == 2 ? 3 : i) * 4) + (i2 == 2 ? 3 : i2)] = fArr[(i * 3) + i2];
                i2++;
            }
            i++;
        }
        return fArr2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static com.google.common.collect.ImmutableList<float[]> clipConvexPolygonToNdcRange(com.google.common.collect.ImmutableList<float[]> immutableList) {
        androidx.media3.common.util.Assertions.checkArgument(immutableList.size() >= 3, "A polygon must have at least 3 vertices.");
        com.google.common.collect.ImmutableList.Builder builderAddAll = new com.google.common.collect.ImmutableList.Builder().addAll((java.lang.Iterable) immutableList);
        float[][] fArr = NDC_CUBE;
        int length = fArr.length;
        int i = 0;
        while (i < length) {
            float[] fArr2 = fArr[i];
            com.google.common.collect.ImmutableList immutableListBuild = builderAddAll.build();
            com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
            for (int i2 = 0; i2 < immutableListBuild.size(); i2++) {
                float[] fArr3 = (float[]) immutableListBuild.get(i2);
                float[] fArr4 = (float[]) immutableListBuild.get(((immutableListBuild.size() + i2) - 1) % immutableListBuild.size());
                if (isInsideClippingHalfSpace(fArr3, fArr2)) {
                    if (!isInsideClippingHalfSpace(fArr4, fArr2)) {
                        float[] fArrComputeIntersectionPoint = computeIntersectionPoint(fArr2, fArr2, fArr4, fArr3);
                        if (!java.util.Arrays.equals(fArr3, fArrComputeIntersectionPoint)) {
                            builder.add(fArrComputeIntersectionPoint);
                        }
                    }
                    builder.add(fArr3);
                } else if (isInsideClippingHalfSpace(fArr4, fArr2)) {
                    float[] fArrComputeIntersectionPoint2 = computeIntersectionPoint(fArr2, fArr2, fArr4, fArr3);
                    if (!java.util.Arrays.equals(fArr4, fArrComputeIntersectionPoint2)) {
                        builder.add(fArrComputeIntersectionPoint2);
                    }
                }
            }
            i++;
            builderAddAll = builder;
        }
        return builderAddAll.build();
    }

    private static boolean isInsideClippingHalfSpace(float[] fArr, float[] fArr2) {
        androidx.media3.common.util.Assertions.checkArgument(fArr2.length == 4, "Expecting 4 plane parameters");
        return ((fArr2[0] * fArr[0]) + (fArr2[1] * fArr[1])) + (fArr2[2] * fArr[2]) <= fArr2[3];
    }

    private static float[] computeIntersectionPoint(float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4) {
        androidx.media3.common.util.Assertions.checkArgument(fArr2.length == 4, "Expecting 4 plane parameters");
        float f = fArr[0];
        float f2 = fArr3[0];
        float f3 = fArr2[0];
        float f4 = fArr[1];
        float f5 = fArr3[1];
        float f6 = fArr2[1];
        float f7 = fArr[2];
        float f8 = fArr3[2];
        float f9 = fArr2[2];
        float f10 = ((f - f2) * f3) + ((f4 - f5) * f6) + ((f7 - f8) * f9);
        float f11 = fArr4[0];
        float f12 = (f11 - f2) * f3;
        float f13 = fArr4[1];
        float f14 = fArr4[2];
        float f15 = f10 / ((f12 + ((f13 - f5) * f6)) + ((f14 - f8) * f9));
        return new float[]{f2 + ((f11 - f2) * f15), f5 + ((f13 - f5) * f15), f8 + ((f14 - f8) * f15), 1.0f};
    }

    public static com.google.common.collect.ImmutableList<float[]> transformPoints(float[] fArr, com.google.common.collect.ImmutableList<float[]> immutableList) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        for (int i = 0; i < immutableList.size(); i++) {
            float[] fArr2 = new float[4];
            android.opengl.Matrix.multiplyMV(fArr2, 0, fArr, 0, immutableList.get(i), 0);
            float f = fArr2[0];
            float f2 = fArr2[3];
            fArr2[0] = f / f2;
            fArr2[1] = fArr2[1] / f2;
            fArr2[2] = fArr2[2] / f2;
            fArr2[3] = 1.0f;
            builder.add(fArr2);
        }
        return builder.build();
    }

    public static androidx.media3.common.util.Size configureAndGetOutputSize(int i, int i2, java.util.List<androidx.media3.effect.GlMatrixTransformation> list) {
        androidx.media3.common.util.Assertions.checkArgument(i > 0, "inputWidth must be positive");
        androidx.media3.common.util.Assertions.checkArgument(i2 > 0, "inputHeight must be positive");
        androidx.media3.common.util.Size size = new androidx.media3.common.util.Size(i, i2);
        for (int i3 = 0; i3 < list.size(); i3++) {
            size = list.get(i3).configure(size.getWidth(), size.getHeight());
        }
        return size;
    }

    private MatrixUtils() {
    }
}
