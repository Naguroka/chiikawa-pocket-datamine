package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
public class DescendantOffsetUtils {
    private static final java.lang.ThreadLocal<android.graphics.Matrix> matrix = new java.lang.ThreadLocal<>();
    private static final java.lang.ThreadLocal<android.graphics.RectF> rectF = new java.lang.ThreadLocal<>();

    public static void offsetDescendantRect(android.view.ViewGroup viewGroup, android.view.View view, android.graphics.Rect rect) {
        java.lang.ThreadLocal<android.graphics.Matrix> threadLocal = matrix;
        android.graphics.Matrix matrix2 = threadLocal.get();
        if (matrix2 == null) {
            matrix2 = new android.graphics.Matrix();
            threadLocal.set(matrix2);
        } else {
            matrix2.reset();
        }
        offsetDescendantMatrix(viewGroup, view, matrix2);
        java.lang.ThreadLocal<android.graphics.RectF> threadLocal2 = rectF;
        android.graphics.RectF rectF2 = threadLocal2.get();
        if (rectF2 == null) {
            rectF2 = new android.graphics.RectF();
            threadLocal2.set(rectF2);
        }
        rectF2.set(rect);
        matrix2.mapRect(rectF2);
        rect.set((int) (rectF2.left + 0.5f), (int) (rectF2.top + 0.5f), (int) (rectF2.right + 0.5f), (int) (rectF2.bottom + 0.5f));
    }

    public static void getDescendantRect(android.view.ViewGroup viewGroup, android.view.View view, android.graphics.Rect rect) {
        rect.set(0, 0, view.getWidth(), view.getHeight());
        offsetDescendantRect(viewGroup, view, rect);
    }

    private static void offsetDescendantMatrix(android.view.ViewParent viewParent, android.view.View view, android.graphics.Matrix matrix2) {
        java.lang.Object parent = view.getParent();
        if ((parent instanceof android.view.View) && parent != viewParent) {
            android.view.View view2 = (android.view.View) parent;
            offsetDescendantMatrix(viewParent, view2, matrix2);
            matrix2.preTranslate(-view2.getScrollX(), -view2.getScrollY());
        }
        matrix2.preTranslate(view.getLeft(), view.getTop());
        if (view.getMatrix().isIdentity()) {
            return;
        }
        matrix2.preConcat(view.getMatrix());
    }
}
