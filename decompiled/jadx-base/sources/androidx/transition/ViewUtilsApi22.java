package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class ViewUtilsApi22 extends androidx.transition.ViewUtilsApi21 {
    private static boolean sTryHiddenSetLeftTopRightBottom = true;

    ViewUtilsApi22() {
    }

    @Override // androidx.transition.ViewUtilsBase
    public void setLeftTopRightBottom(android.view.View view, int i, int i2, int i3, int i4) {
        if (sTryHiddenSetLeftTopRightBottom) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (java.lang.NoSuchMethodError unused) {
                sTryHiddenSetLeftTopRightBottom = false;
            }
        }
    }
}
