package androidx.window.layout;

/* JADX INFO: compiled from: WindowMetricsCalculatorCompat.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\fJ\u0015\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\u000eJ\u0015\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\u0010J\u0015\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\b\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0015\u001a\u00020\u0016H\u0003J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u0015\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0015\u001a\u00020\u0016H\u0001¢\u0006\u0002\b\u001dJ\u0018\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010 \u001a\u00020\u000bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Landroidx/window/layout/WindowMetricsCalculatorCompat;", "Landroidx/window/layout/WindowMetricsCalculator;", "()V", "TAG", "", "computeCurrentWindowMetrics", "Landroidx/window/layout/WindowMetrics;", "activity", "Landroid/app/Activity;", "computeMaximumWindowMetrics", "computeWindowBoundsIceCreamSandwich", "Landroid/graphics/Rect;", "computeWindowBoundsIceCreamSandwich$window_release", "computeWindowBoundsN", "computeWindowBoundsN$window_release", "computeWindowBoundsP", "computeWindowBoundsP$window_release", "computeWindowBoundsQ", "computeWindowBoundsQ$window_release", "getCutoutForDisplay", "Landroid/view/DisplayCutout;", "display", "Landroid/view/Display;", "getNavigationBarHeight", "", "context", "Landroid/content/Context;", "getRealSizeForDisplay", "Landroid/graphics/Point;", "getRealSizeForDisplay$window_release", "getRectSizeFromDisplay", "", "bounds", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WindowMetricsCalculatorCompat implements androidx.window.layout.WindowMetricsCalculator {
    public static final androidx.window.layout.WindowMetricsCalculatorCompat INSTANCE = new androidx.window.layout.WindowMetricsCalculatorCompat();
    private static final java.lang.String TAG;

    private WindowMetricsCalculatorCompat() {
    }

    static {
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue("WindowMetricsCalculatorCompat", "WindowMetricsCalculatorC…at::class.java.simpleName");
        TAG = "WindowMetricsCalculatorCompat";
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public androidx.window.layout.WindowMetrics computeCurrentWindowMetrics(android.app.Activity activity) {
        android.graphics.Rect rectComputeWindowBoundsN$window_release;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            rectComputeWindowBoundsN$window_release = androidx.window.layout.ActivityCompatHelperApi30.INSTANCE.currentWindowBounds(activity);
        } else if (android.os.Build.VERSION.SDK_INT >= 29) {
            rectComputeWindowBoundsN$window_release = computeWindowBoundsQ$window_release(activity);
        } else if (android.os.Build.VERSION.SDK_INT >= 28) {
            rectComputeWindowBoundsN$window_release = computeWindowBoundsP$window_release(activity);
        } else {
            rectComputeWindowBoundsN$window_release = computeWindowBoundsN$window_release(activity);
        }
        return new androidx.window.layout.WindowMetrics(rectComputeWindowBoundsN$window_release);
    }

    @Override // androidx.window.layout.WindowMetricsCalculator
    public androidx.window.layout.WindowMetrics computeMaximumWindowMetrics(android.app.Activity activity) {
        android.graphics.Rect rect;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            rect = androidx.window.layout.ActivityCompatHelperApi30.INSTANCE.maximumWindowBounds(activity);
        } else {
            android.view.Display display = activity.getWindowManager().getDefaultDisplay();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(display, "display");
            android.graphics.Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(display);
            rect = new android.graphics.Rect(0, 0, realSizeForDisplay$window_release.x, realSizeForDisplay$window_release.y);
        }
        return new androidx.window.layout.WindowMetrics(rect);
    }

    public final android.graphics.Rect computeWindowBoundsQ$window_release(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        android.content.res.Configuration configuration = activity.getResources().getConfiguration();
        try {
            java.lang.reflect.Field declaredField = android.content.res.Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(configuration);
            java.lang.Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
            if (objInvoke != null) {
                return new android.graphics.Rect((android.graphics.Rect) objInvoke);
            }
            throw new java.lang.NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.w(TAG, e);
            return computeWindowBoundsP$window_release(activity);
        } catch (java.lang.NoSuchFieldException e2) {
            android.util.Log.w(TAG, e2);
            return computeWindowBoundsP$window_release(activity);
        } catch (java.lang.NoSuchMethodException e3) {
            android.util.Log.w(TAG, e3);
            return computeWindowBoundsP$window_release(activity);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            android.util.Log.w(TAG, e4);
            return computeWindowBoundsP$window_release(activity);
        }
    }

    public final android.graphics.Rect computeWindowBoundsP$window_release(android.app.Activity activity) {
        android.view.DisplayCutout cutoutForDisplay;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        android.graphics.Rect rect = new android.graphics.Rect();
        android.content.res.Configuration configuration = activity.getResources().getConfiguration();
        try {
            java.lang.reflect.Field declaredField = android.content.res.Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(configuration);
            if (androidx.window.layout.ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
                java.lang.Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
                if (objInvoke == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((android.graphics.Rect) objInvoke);
            } else {
                java.lang.Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", new java.lang.Class[0]).invoke(obj, new java.lang.Object[0]);
                if (objInvoke2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type android.graphics.Rect");
                }
                rect.set((android.graphics.Rect) objInvoke2);
            }
        } catch (java.lang.IllegalAccessException e) {
            android.util.Log.w(TAG, e);
            getRectSizeFromDisplay(activity, rect);
        } catch (java.lang.NoSuchFieldException e2) {
            android.util.Log.w(TAG, e2);
            getRectSizeFromDisplay(activity, rect);
        } catch (java.lang.NoSuchMethodException e3) {
            android.util.Log.w(TAG, e3);
            getRectSizeFromDisplay(activity, rect);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            android.util.Log.w(TAG, e4);
            getRectSizeFromDisplay(activity, rect);
        }
        android.view.Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        android.graphics.Point point = new android.graphics.Point();
        androidx.window.layout.DisplayCompatHelperApi17 displayCompatHelperApi17 = androidx.window.layout.DisplayCompatHelperApi17.INSTANCE;
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(currentDisplay, "currentDisplay");
        displayCompatHelperApi17.getRealSize(currentDisplay, point);
        if (!androidx.window.layout.ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            int navigationBarHeight = getNavigationBarHeight(activity);
            if (rect.bottom + navigationBarHeight == point.y) {
                rect.bottom += navigationBarHeight;
            } else if (rect.right + navigationBarHeight == point.x) {
                rect.right += navigationBarHeight;
            } else if (rect.left == navigationBarHeight) {
                rect.left = 0;
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !androidx.window.layout.ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity) && (cutoutForDisplay = getCutoutForDisplay(currentDisplay)) != null) {
            if (rect.left == androidx.window.layout.DisplayCompatHelperApi28.INSTANCE.safeInsetLeft(cutoutForDisplay)) {
                rect.left = 0;
            }
            if (point.x - rect.right == androidx.window.layout.DisplayCompatHelperApi28.INSTANCE.safeInsetRight(cutoutForDisplay)) {
                rect.right += androidx.window.layout.DisplayCompatHelperApi28.INSTANCE.safeInsetRight(cutoutForDisplay);
            }
            if (rect.top == androidx.window.layout.DisplayCompatHelperApi28.INSTANCE.safeInsetTop(cutoutForDisplay)) {
                rect.top = 0;
            }
            if (point.y - rect.bottom == androidx.window.layout.DisplayCompatHelperApi28.INSTANCE.safeInsetBottom(cutoutForDisplay)) {
                rect.bottom += androidx.window.layout.DisplayCompatHelperApi28.INSTANCE.safeInsetBottom(cutoutForDisplay);
            }
        }
        return rect;
    }

    private final void getRectSizeFromDisplay(android.app.Activity activity, android.graphics.Rect bounds) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(bounds);
    }

    public final android.graphics.Rect computeWindowBoundsN$window_release(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        android.graphics.Rect rect = new android.graphics.Rect();
        android.view.Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!androidx.window.layout.ActivityCompatHelperApi24.INSTANCE.isInMultiWindowMode(activity)) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultDisplay, "defaultDisplay");
            android.graphics.Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
            int navigationBarHeight = getNavigationBarHeight(activity);
            if (rect.bottom + navigationBarHeight == realSizeForDisplay$window_release.y) {
                rect.bottom += navigationBarHeight;
            } else if (rect.right + navigationBarHeight == realSizeForDisplay$window_release.x) {
                rect.right += navigationBarHeight;
            }
        }
        return rect;
    }

    public final android.graphics.Rect computeWindowBoundsIceCreamSandwich$window_release(android.app.Activity activity) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activity, "activity");
        android.view.Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultDisplay, "defaultDisplay");
        android.graphics.Point realSizeForDisplay$window_release = getRealSizeForDisplay$window_release(defaultDisplay);
        android.graphics.Rect rect = new android.graphics.Rect();
        if (realSizeForDisplay$window_release.x == 0 || realSizeForDisplay$window_release.y == 0) {
            defaultDisplay.getRectSize(rect);
        } else {
            rect.right = realSizeForDisplay$window_release.x;
            rect.bottom = realSizeForDisplay$window_release.y;
        }
        return rect;
    }

    public final android.graphics.Point getRealSizeForDisplay$window_release(android.view.Display display) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(display, "display");
        android.graphics.Point point = new android.graphics.Point();
        androidx.window.layout.DisplayCompatHelperApi17.INSTANCE.getRealSize(display, point);
        return point;
    }

    private final int getNavigationBarHeight(android.content.Context context) {
        android.content.res.Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    private final android.view.DisplayCutout getCutoutForDisplay(android.view.Display display) {
        try {
            java.lang.reflect.Constructor<?> constructor = java.lang.Class.forName("android.view.DisplayInfo").getConstructor(new java.lang.Class[0]);
            constructor.setAccessible(true);
            java.lang.Object objNewInstance = constructor.newInstance(new java.lang.Object[0]);
            java.lang.reflect.Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            java.lang.reflect.Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            java.lang.Object obj = declaredField.get(objNewInstance);
            if (obj instanceof android.view.DisplayCutout) {
                return (android.view.DisplayCutout) obj;
            }
        } catch (java.lang.ClassNotFoundException e) {
            android.util.Log.w(TAG, e);
        } catch (java.lang.IllegalAccessException e2) {
            android.util.Log.w(TAG, e2);
        } catch (java.lang.InstantiationException e3) {
            android.util.Log.w(TAG, e3);
        } catch (java.lang.NoSuchFieldException e4) {
            android.util.Log.w(TAG, e4);
        } catch (java.lang.NoSuchMethodException e5) {
            android.util.Log.w(TAG, e5);
        } catch (java.lang.reflect.InvocationTargetException e6) {
            android.util.Log.w(TAG, e6);
        }
        return null;
    }
}
