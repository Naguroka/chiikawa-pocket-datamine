package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class CanvasUtils {
    private static java.lang.reflect.Method sInorderBarrierMethod;
    private static boolean sOrderMethodsFetched;
    private static java.lang.reflect.Method sReorderBarrierMethod;

    static void enableZ(android.graphics.Canvas canvas, boolean z) {
        java.lang.reflect.Method method;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            if (z) {
                canvas.enableZ();
                return;
            } else {
                canvas.disableZ();
                return;
            }
        }
        if (android.os.Build.VERSION.SDK_INT == 28) {
            throw new java.lang.IllegalStateException("This method doesn't work on Pie!");
        }
        if (!sOrderMethodsFetched) {
            try {
                java.lang.reflect.Method declaredMethod = android.graphics.Canvas.class.getDeclaredMethod("insertReorderBarrier", new java.lang.Class[0]);
                sReorderBarrierMethod = declaredMethod;
                declaredMethod.setAccessible(true);
                java.lang.reflect.Method declaredMethod2 = android.graphics.Canvas.class.getDeclaredMethod("insertInorderBarrier", new java.lang.Class[0]);
                sInorderBarrierMethod = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (java.lang.NoSuchMethodException unused) {
            }
            sOrderMethodsFetched = true;
        }
        if (z) {
            try {
                java.lang.reflect.Method method2 = sReorderBarrierMethod;
                if (method2 != null) {
                    method2.invoke(canvas, new java.lang.Object[0]);
                }
            } catch (java.lang.IllegalAccessException unused2) {
                return;
            } catch (java.lang.reflect.InvocationTargetException e) {
                throw new java.lang.RuntimeException(e.getCause());
            }
        }
        if (z || (method = sInorderBarrierMethod) == null) {
            return;
        }
        method.invoke(canvas, new java.lang.Object[0]);
    }

    private CanvasUtils() {
    }
}
