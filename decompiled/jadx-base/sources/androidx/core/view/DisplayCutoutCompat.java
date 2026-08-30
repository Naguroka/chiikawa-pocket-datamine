package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class DisplayCutoutCompat {
    private final android.view.DisplayCutout mDisplayCutout;

    public DisplayCutoutCompat(android.graphics.Rect rect, java.util.List<android.graphics.Rect> list) {
        this(android.os.Build.VERSION.SDK_INT >= 28 ? androidx.core.view.DisplayCutoutCompat.Api28Impl.createDisplayCutout(rect, list) : null);
    }

    public DisplayCutoutCompat(androidx.core.graphics.Insets insets, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, android.graphics.Rect rect4, androidx.core.graphics.Insets insets2) {
        this(constructDisplayCutout(insets, rect, rect2, rect3, rect4, insets2));
    }

    private static android.view.DisplayCutout constructDisplayCutout(androidx.core.graphics.Insets insets, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, android.graphics.Rect rect4, androidx.core.graphics.Insets insets2) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.view.DisplayCutoutCompat.Api30Impl.createDisplayCutout(insets.toPlatformInsets(), rect, rect2, rect3, rect4, insets2.toPlatformInsets());
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            return androidx.core.view.DisplayCutoutCompat.Api29Impl.createDisplayCutout(insets.toPlatformInsets(), rect, rect2, rect3, rect4);
        }
        if (android.os.Build.VERSION.SDK_INT < 28) {
            return null;
        }
        android.graphics.Rect rect5 = new android.graphics.Rect(insets.left, insets.top, insets.right, insets.bottom);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (rect != null) {
            arrayList.add(rect);
        }
        if (rect2 != null) {
            arrayList.add(rect2);
        }
        if (rect3 != null) {
            arrayList.add(rect3);
        }
        if (rect4 != null) {
            arrayList.add(rect4);
        }
        return androidx.core.view.DisplayCutoutCompat.Api28Impl.createDisplayCutout(rect5, arrayList);
    }

    private DisplayCutoutCompat(android.view.DisplayCutout displayCutout) {
        this.mDisplayCutout = displayCutout;
    }

    public int getSafeInsetTop() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetTop(this.mDisplayCutout);
        }
        return 0;
    }

    public int getSafeInsetBottom() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetBottom(this.mDisplayCutout);
        }
        return 0;
    }

    public int getSafeInsetLeft() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetLeft(this.mDisplayCutout);
        }
        return 0;
    }

    public int getSafeInsetRight() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.DisplayCutoutCompat.Api28Impl.getSafeInsetRight(this.mDisplayCutout);
        }
        return 0;
    }

    public java.util.List<android.graphics.Rect> getBoundingRects() {
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            return androidx.core.view.DisplayCutoutCompat.Api28Impl.getBoundingRects(this.mDisplayCutout);
        }
        return java.util.Collections.emptyList();
    }

    public androidx.core.graphics.Insets getWaterfallInsets() {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            return androidx.core.graphics.Insets.toCompatInsets(androidx.core.view.DisplayCutoutCompat.Api30Impl.getWaterfallInsets(this.mDisplayCutout));
        }
        return androidx.core.graphics.Insets.NONE;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return androidx.core.util.ObjectsCompat.equals(this.mDisplayCutout, ((androidx.core.view.DisplayCutoutCompat) obj).mDisplayCutout);
    }

    public int hashCode() {
        android.view.DisplayCutout displayCutout = this.mDisplayCutout;
        if (displayCutout == null) {
            return 0;
        }
        return displayCutout.hashCode();
    }

    public java.lang.String toString() {
        return "DisplayCutoutCompat{" + this.mDisplayCutout + "}";
    }

    static androidx.core.view.DisplayCutoutCompat wrap(android.view.DisplayCutout displayCutout) {
        if (displayCutout == null) {
            return null;
        }
        return new androidx.core.view.DisplayCutoutCompat(displayCutout);
    }

    android.view.DisplayCutout unwrap() {
        return this.mDisplayCutout;
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static android.view.DisplayCutout createDisplayCutout(android.graphics.Rect rect, java.util.List<android.graphics.Rect> list) {
            return new android.view.DisplayCutout(rect, list);
        }

        static int getSafeInsetTop(android.view.DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }

        static int getSafeInsetBottom(android.view.DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        static int getSafeInsetLeft(android.view.DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        static int getSafeInsetRight(android.view.DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        static java.util.List<android.graphics.Rect> getBoundingRects(android.view.DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }
    }

    static class Api30Impl {
        private Api30Impl() {
        }

        static android.view.DisplayCutout createDisplayCutout(android.graphics.Insets insets, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, android.graphics.Rect rect4, android.graphics.Insets insets2) {
            return new android.view.DisplayCutout(insets, rect, rect2, rect3, rect4, insets2);
        }

        static android.graphics.Insets getWaterfallInsets(android.view.DisplayCutout displayCutout) {
            return displayCutout.getWaterfallInsets();
        }
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static android.view.DisplayCutout createDisplayCutout(android.graphics.Insets insets, android.graphics.Rect rect, android.graphics.Rect rect2, android.graphics.Rect rect3, android.graphics.Rect rect4) {
            return new android.view.DisplayCutout(insets, rect, rect2, rect3, rect4);
        }
    }
}
