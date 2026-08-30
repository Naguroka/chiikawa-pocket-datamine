package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class ViewGroupUtilsApi14 {
    private static final int LAYOUT_TRANSITION_CHANGING = 4;
    private static final java.lang.String TAG = "ViewGroupUtilsApi14";
    private static java.lang.reflect.Method sCancelMethod;
    private static boolean sCancelMethodFetched;
    private static android.animation.LayoutTransition sEmptyLayoutTransition;
    private static java.lang.reflect.Field sLayoutSuppressedField;
    private static boolean sLayoutSuppressedFieldFetched;

    static void suppressLayout(android.view.ViewGroup viewGroup, boolean z) {
        boolean z2 = false;
        if (sEmptyLayoutTransition == null) {
            android.animation.LayoutTransition layoutTransition = new android.animation.LayoutTransition() { // from class: androidx.transition.ViewGroupUtilsApi14.1
                @Override // android.animation.LayoutTransition
                public boolean isChangingLayout() {
                    return true;
                }
            };
            sEmptyLayoutTransition = layoutTransition;
            layoutTransition.setAnimator(2, null);
            sEmptyLayoutTransition.setAnimator(0, null);
            sEmptyLayoutTransition.setAnimator(1, null);
            sEmptyLayoutTransition.setAnimator(3, null);
            sEmptyLayoutTransition.setAnimator(4, null);
        }
        if (z) {
            android.animation.LayoutTransition layoutTransition2 = viewGroup.getLayoutTransition();
            if (layoutTransition2 != null) {
                if (layoutTransition2.isRunning()) {
                    cancelLayoutTransition(layoutTransition2);
                }
                if (layoutTransition2 != sEmptyLayoutTransition) {
                    viewGroup.setTag(androidx.transition.R.id.transition_layout_save, layoutTransition2);
                }
            }
            viewGroup.setLayoutTransition(sEmptyLayoutTransition);
            return;
        }
        viewGroup.setLayoutTransition(null);
        if (!sLayoutSuppressedFieldFetched) {
            try {
                java.lang.reflect.Field declaredField = android.view.ViewGroup.class.getDeclaredField("mLayoutSuppressed");
                sLayoutSuppressedField = declaredField;
                declaredField.setAccessible(true);
            } catch (java.lang.NoSuchFieldException unused) {
                android.util.Log.i(TAG, "Failed to access mLayoutSuppressed field by reflection");
            }
            sLayoutSuppressedFieldFetched = true;
        }
        java.lang.reflect.Field field = sLayoutSuppressedField;
        if (field != null) {
            try {
                boolean z3 = field.getBoolean(viewGroup);
                if (z3) {
                    try {
                        sLayoutSuppressedField.setBoolean(viewGroup, false);
                    } catch (java.lang.IllegalAccessException unused2) {
                        z2 = z3;
                        android.util.Log.i(TAG, "Failed to get mLayoutSuppressed field by reflection");
                    }
                }
                z2 = z3;
            } catch (java.lang.IllegalAccessException unused3) {
            }
        }
        if (z2) {
            viewGroup.requestLayout();
        }
        android.animation.LayoutTransition layoutTransition3 = (android.animation.LayoutTransition) viewGroup.getTag(androidx.transition.R.id.transition_layout_save);
        if (layoutTransition3 != null) {
            viewGroup.setTag(androidx.transition.R.id.transition_layout_save, null);
            viewGroup.setLayoutTransition(layoutTransition3);
        }
    }

    private static void cancelLayoutTransition(android.animation.LayoutTransition layoutTransition) {
        if (!sCancelMethodFetched) {
            try {
                java.lang.reflect.Method declaredMethod = android.animation.LayoutTransition.class.getDeclaredMethod("cancel", new java.lang.Class[0]);
                sCancelMethod = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
                android.util.Log.i(TAG, "Failed to access cancel method by reflection");
            }
            sCancelMethodFetched = true;
        }
        java.lang.reflect.Method method = sCancelMethod;
        if (method != null) {
            try {
                method.invoke(layoutTransition, new java.lang.Object[0]);
            } catch (java.lang.IllegalAccessException unused2) {
                android.util.Log.i(TAG, "Failed to access cancel method by reflection");
            } catch (java.lang.reflect.InvocationTargetException unused3) {
                android.util.Log.i(TAG, "Failed to invoke cancel method by reflection");
            }
        }
    }

    private ViewGroupUtilsApi14() {
    }
}
