package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class ViewUtilsApi29 extends androidx.transition.ViewUtilsApi23 {
    ViewUtilsApi29() {
    }

    @Override // androidx.transition.ViewUtilsApi19, androidx.transition.ViewUtilsBase
    public void setTransitionAlpha(android.view.View view, float f) {
        view.setTransitionAlpha(f);
    }

    @Override // androidx.transition.ViewUtilsApi19, androidx.transition.ViewUtilsBase
    public float getTransitionAlpha(android.view.View view) {
        return view.getTransitionAlpha();
    }

    @Override // androidx.transition.ViewUtilsApi23, androidx.transition.ViewUtilsBase
    public void setTransitionVisibility(android.view.View view, int i) {
        view.setTransitionVisibility(i);
    }

    @Override // androidx.transition.ViewUtilsApi22, androidx.transition.ViewUtilsBase
    public void setLeftTopRightBottom(android.view.View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsBase
    public void transformMatrixToGlobal(android.view.View view, android.graphics.Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsBase
    public void transformMatrixToLocal(android.view.View view, android.graphics.Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }

    @Override // androidx.transition.ViewUtilsApi21, androidx.transition.ViewUtilsBase
    public void setAnimationMatrix(android.view.View view, android.graphics.Matrix matrix) {
        view.setAnimationMatrix(matrix);
    }
}
