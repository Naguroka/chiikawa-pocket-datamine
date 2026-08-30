package androidx.coordinatorlayout.widget;

/* JADX INFO: loaded from: classes.dex */
public class ViewGroupUtils {
    private static final java.lang.ThreadLocal<android.graphics.Matrix> sMatrix = new java.lang.ThreadLocal<>();
    private static final java.lang.ThreadLocal<android.graphics.RectF> sRectF = new java.lang.ThreadLocal<>();

    static void offsetDescendantRect(android.view.ViewGroup viewGroup, android.view.View view, android.graphics.Rect rect) {
        java.lang.ThreadLocal<android.graphics.Matrix> threadLocal = sMatrix;
        android.graphics.Matrix matrix = threadLocal.get();
        if (matrix == null) {
            matrix = new android.graphics.Matrix();
            threadLocal.set(matrix);
        } else {
            matrix.reset();
        }
        offsetDescendantMatrix(viewGroup, view, matrix);
        java.lang.ThreadLocal<android.graphics.RectF> threadLocal2 = sRectF;
        android.graphics.RectF rectF = threadLocal2.get();
        if (rectF == null) {
            rectF = new android.graphics.RectF();
            threadLocal2.set(rectF);
        }
        rectF.set(rect);
        matrix.mapRect(rectF);
        rect.set((int) (rectF.left + 0.5f), (int) (rectF.top + 0.5f), (int) (rectF.right + 0.5f), (int) (rectF.bottom + 0.5f));
    }

    public static void getDescendantRect(android.view.ViewGroup viewGroup, android.view.View view, android.graphics.Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        offsetDescendantRect(viewGroup, view, rect);
    }

    private static void offsetDescendantMatrix(android.view.ViewParent viewParent, android.view.View view, android.graphics.Matrix matrix) {
        java.lang.Object parent = view.getParent();
        if ((parent instanceof android.view.View) && parent != viewParent) {
            android.view.View view2 = (android.view.View) parent;
            offsetDescendantMatrix(viewParent, view2, matrix);
            matrix.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix.preConcat(view.getMatrix());
    }

    private ViewGroupUtils() {
    }
}
