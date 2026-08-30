package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class ViewUtilsApi21 extends androidx.transition.ViewUtilsApi19 {
    private static boolean sTryHiddenSetAnimationMatrix = true;
    private static boolean sTryHiddenTransformMatrixToGlobal = true;
    private static boolean sTryHiddenTransformMatrixToLocal = true;

    ViewUtilsApi21() {
    }

    @Override // androidx.transition.ViewUtilsBase
    public void transformMatrixToGlobal(android.view.View view, android.graphics.Matrix matrix) {
        if (sTryHiddenTransformMatrixToGlobal) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (java.lang.NoSuchMethodError unused) {
                sTryHiddenTransformMatrixToGlobal = false;
            }
        }
    }

    @Override // androidx.transition.ViewUtilsBase
    public void transformMatrixToLocal(android.view.View view, android.graphics.Matrix matrix) {
        if (sTryHiddenTransformMatrixToLocal) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (java.lang.NoSuchMethodError unused) {
                sTryHiddenTransformMatrixToLocal = false;
            }
        }
    }

    @Override // androidx.transition.ViewUtilsBase
    public void setAnimationMatrix(android.view.View view, android.graphics.Matrix matrix) {
        if (sTryHiddenSetAnimationMatrix) {
            try {
                view.setAnimationMatrix(matrix);
            } catch (java.lang.NoSuchMethodError unused) {
                sTryHiddenSetAnimationMatrix = false;
            }
        }
    }
}
