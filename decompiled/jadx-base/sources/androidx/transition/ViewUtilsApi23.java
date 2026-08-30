package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class ViewUtilsApi23 extends androidx.transition.ViewUtilsApi22 {
    private static boolean sTryHiddenSetTransitionVisibility = true;

    ViewUtilsApi23() {
    }

    @Override // androidx.transition.ViewUtilsBase
    public void setTransitionVisibility(android.view.View view, int i) {
        if (android.os.Build.VERSION.SDK_INT == 28) {
            super.setTransitionVisibility(view, i);
        } else if (sTryHiddenSetTransitionVisibility) {
            try {
                view.setTransitionVisibility(i);
            } catch (java.lang.NoSuchMethodError unused) {
                sTryHiddenSetTransitionVisibility = false;
            }
        }
    }
}
