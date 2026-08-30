package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class ViewUtilsApi19 extends androidx.transition.ViewUtilsBase {
    private static boolean sTryHiddenTransitionAlpha = true;

    @Override // androidx.transition.ViewUtilsBase
    public void clearNonTransitionAlpha(android.view.View view) {
    }

    @Override // androidx.transition.ViewUtilsBase
    public void saveNonTransitionAlpha(android.view.View view) {
    }

    ViewUtilsApi19() {
    }

    @Override // androidx.transition.ViewUtilsBase
    public void setTransitionAlpha(android.view.View view, float f) {
        if (sTryHiddenTransitionAlpha) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (java.lang.NoSuchMethodError unused) {
                sTryHiddenTransitionAlpha = false;
            }
        }
        view.setAlpha(f);
    }

    @Override // androidx.transition.ViewUtilsBase
    public float getTransitionAlpha(android.view.View view) {
        if (sTryHiddenTransitionAlpha) {
            try {
                return view.getTransitionAlpha();
            } catch (java.lang.NoSuchMethodError unused) {
                sTryHiddenTransitionAlpha = false;
            }
        }
        return view.getAlpha();
    }
}
