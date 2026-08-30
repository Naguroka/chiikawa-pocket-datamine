package com.google.android.material.color;

/* JADX INFO: loaded from: classes5.dex */
final class ThemeUtils {
    private ThemeUtils() {
    }

    static void applyThemeOverlay(android.content.Context context, int i) {
        android.content.res.Resources.Theme windowDecorViewTheme;
        context.getTheme().applyStyle(i, true);
        if (!(context instanceof android.app.Activity) || (windowDecorViewTheme = getWindowDecorViewTheme((android.app.Activity) context)) == null) {
            return;
        }
        windowDecorViewTheme.applyStyle(i, true);
    }

    private static android.content.res.Resources.Theme getWindowDecorViewTheme(android.app.Activity activity) {
        android.view.View viewPeekDecorView;
        android.content.Context context;
        android.view.Window window = activity.getWindow();
        if (window == null || (viewPeekDecorView = window.peekDecorView()) == null || (context = viewPeekDecorView.getContext()) == null) {
            return null;
        }
        return context.getTheme();
    }
}
