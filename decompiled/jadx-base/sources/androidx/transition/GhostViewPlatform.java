package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class GhostViewPlatform implements androidx.transition.GhostView {
    private static final java.lang.String TAG = "GhostViewApi21";
    private static java.lang.reflect.Method sAddGhostMethod;
    private static boolean sAddGhostMethodFetched;
    private static java.lang.Class<?> sGhostViewClass;
    private static boolean sGhostViewClassFetched;
    private static java.lang.reflect.Method sRemoveGhostMethod;
    private static boolean sRemoveGhostMethodFetched;
    private final android.view.View mGhostView;

    @Override // androidx.transition.GhostView
    public void reserveEndViewTransition(android.view.ViewGroup viewGroup, android.view.View view) {
    }

    static androidx.transition.GhostView addGhost(android.view.View view, android.view.ViewGroup viewGroup, android.graphics.Matrix matrix) {
        fetchAddGhostMethod();
        java.lang.reflect.Method method = sAddGhostMethod;
        if (method != null) {
            try {
                return new androidx.transition.GhostViewPlatform((android.view.View) method.invoke(null, view, viewGroup, matrix));
            } catch (java.lang.IllegalAccessException unused) {
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw new java.lang.RuntimeException(e.getCause());
            }
        }
        return null;
    }

    static void removeGhost(android.view.View view) {
        fetchRemoveGhostMethod();
        java.lang.reflect.Method method = sRemoveGhostMethod;
        if (method != null) {
            try {
                method.invoke(null, view);
            } catch (java.lang.IllegalAccessException unused) {
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw new java.lang.RuntimeException(e.getCause());
            }
        }
    }

    private GhostViewPlatform(android.view.View view) {
        this.mGhostView = view;
    }

    @Override // androidx.transition.GhostView
    public void setVisibility(int i) {
        this.mGhostView.setVisibility(i);
    }

    private static void fetchGhostViewClass() {
        if (sGhostViewClassFetched) {
            return;
        }
        try {
            sGhostViewClass = java.lang.Class.forName("android.view.GhostView");
        } catch (java.lang.ClassNotFoundException e) {
            android.util.Log.i(TAG, "Failed to retrieve GhostView class", e);
        }
        sGhostViewClassFetched = true;
    }

    private static void fetchAddGhostMethod() {
        if (sAddGhostMethodFetched) {
            return;
        }
        try {
            fetchGhostViewClass();
            java.lang.reflect.Method declaredMethod = sGhostViewClass.getDeclaredMethod("addGhost", android.view.View.class, android.view.ViewGroup.class, android.graphics.Matrix.class);
            sAddGhostMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException e) {
            android.util.Log.i(TAG, "Failed to retrieve addGhost method", e);
        }
        sAddGhostMethodFetched = true;
    }

    private static void fetchRemoveGhostMethod() {
        if (sRemoveGhostMethodFetched) {
            return;
        }
        try {
            fetchGhostViewClass();
            java.lang.reflect.Method declaredMethod = sGhostViewClass.getDeclaredMethod("removeGhost", android.view.View.class);
            sRemoveGhostMethod = declaredMethod;
            declaredMethod.setAccessible(true);
        } catch (java.lang.NoSuchMethodException e) {
            android.util.Log.i(TAG, "Failed to retrieve removeGhost method", e);
        }
        sRemoveGhostMethodFetched = true;
    }
}
