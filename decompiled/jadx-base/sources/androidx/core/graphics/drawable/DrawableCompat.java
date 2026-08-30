package androidx.core.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public final class DrawableCompat {
    private static final java.lang.String TAG = "DrawableCompat";
    private static java.lang.reflect.Method sGetLayoutDirectionMethod;
    private static boolean sGetLayoutDirectionMethodFetched;
    private static java.lang.reflect.Method sSetLayoutDirectionMethod;
    private static boolean sSetLayoutDirectionMethodFetched;

    public static android.graphics.drawable.Drawable wrap(android.graphics.drawable.Drawable drawable) {
        return drawable;
    }

    @java.lang.Deprecated
    public static void jumpToCurrentState(android.graphics.drawable.Drawable drawable) {
        drawable.jumpToCurrentState();
    }

    public static void setAutoMirrored(android.graphics.drawable.Drawable drawable, boolean z) {
        androidx.core.graphics.drawable.DrawableCompat.Api19Impl.setAutoMirrored(drawable, z);
    }

    public static boolean isAutoMirrored(android.graphics.drawable.Drawable drawable) {
        return androidx.core.graphics.drawable.DrawableCompat.Api19Impl.isAutoMirrored(drawable);
    }

    public static void setHotspot(android.graphics.drawable.Drawable drawable, float f, float f2) {
        androidx.core.graphics.drawable.DrawableCompat.Api21Impl.setHotspot(drawable, f, f2);
    }

    public static void setHotspotBounds(android.graphics.drawable.Drawable drawable, int i, int i2, int i3, int i4) {
        androidx.core.graphics.drawable.DrawableCompat.Api21Impl.setHotspotBounds(drawable, i, i2, i3, i4);
    }

    public static void setTint(android.graphics.drawable.Drawable drawable, int i) {
        androidx.core.graphics.drawable.DrawableCompat.Api21Impl.setTint(drawable, i);
    }

    public static void setTintList(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList) {
        androidx.core.graphics.drawable.DrawableCompat.Api21Impl.setTintList(drawable, colorStateList);
    }

    public static void setTintMode(android.graphics.drawable.Drawable drawable, android.graphics.PorterDuff.Mode mode) {
        androidx.core.graphics.drawable.DrawableCompat.Api21Impl.setTintMode(drawable, mode);
    }

    public static int getAlpha(android.graphics.drawable.Drawable drawable) {
        return androidx.core.graphics.drawable.DrawableCompat.Api19Impl.getAlpha(drawable);
    }

    public static void applyTheme(android.graphics.drawable.Drawable drawable, android.content.res.Resources.Theme theme) {
        androidx.core.graphics.drawable.DrawableCompat.Api21Impl.applyTheme(drawable, theme);
    }

    public static boolean canApplyTheme(android.graphics.drawable.Drawable drawable) {
        return androidx.core.graphics.drawable.DrawableCompat.Api21Impl.canApplyTheme(drawable);
    }

    public static android.graphics.ColorFilter getColorFilter(android.graphics.drawable.Drawable drawable) {
        return androidx.core.graphics.drawable.DrawableCompat.Api21Impl.getColorFilter(drawable);
    }

    public static void clearColorFilter(android.graphics.drawable.Drawable drawable) {
        drawable.clearColorFilter();
    }

    public static void inflate(android.graphics.drawable.Drawable drawable, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        androidx.core.graphics.drawable.DrawableCompat.Api21Impl.inflate(drawable, resources, xmlPullParser, attributeSet, theme);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T extends android.graphics.drawable.Drawable> T unwrap(android.graphics.drawable.Drawable drawable) {
        return drawable instanceof androidx.core.graphics.drawable.WrappedDrawable ? (T) ((androidx.core.graphics.drawable.WrappedDrawable) drawable).getWrappedDrawable() : drawable;
    }

    public static boolean setLayoutDirection(android.graphics.drawable.Drawable drawable, int i) {
        return androidx.core.graphics.drawable.DrawableCompat.Api23Impl.setLayoutDirection(drawable, i);
    }

    public static int getLayoutDirection(android.graphics.drawable.Drawable drawable) {
        return androidx.core.graphics.drawable.DrawableCompat.Api23Impl.getLayoutDirection(drawable);
    }

    private DrawableCompat() {
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static void setAutoMirrored(android.graphics.drawable.Drawable drawable, boolean z) {
            drawable.setAutoMirrored(z);
        }

        static boolean isAutoMirrored(android.graphics.drawable.Drawable drawable) {
            return drawable.isAutoMirrored();
        }

        static int getAlpha(android.graphics.drawable.Drawable drawable) {
            return drawable.getAlpha();
        }

        static android.graphics.drawable.Drawable getChild(android.graphics.drawable.DrawableContainer.DrawableContainerState drawableContainerState, int i) {
            return drawableContainerState.getChild(i);
        }

        static android.graphics.drawable.Drawable getDrawable(android.graphics.drawable.InsetDrawable insetDrawable) {
            return insetDrawable.getDrawable();
        }
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static void setHotspot(android.graphics.drawable.Drawable drawable, float f, float f2) {
            drawable.setHotspot(f, f2);
        }

        static void setTint(android.graphics.drawable.Drawable drawable, int i) {
            drawable.setTint(i);
        }

        static void setTintList(android.graphics.drawable.Drawable drawable, android.content.res.ColorStateList colorStateList) {
            drawable.setTintList(colorStateList);
        }

        static void setTintMode(android.graphics.drawable.Drawable drawable, android.graphics.PorterDuff.Mode mode) {
            drawable.setTintMode(mode);
        }

        static void applyTheme(android.graphics.drawable.Drawable drawable, android.content.res.Resources.Theme theme) {
            drawable.applyTheme(theme);
        }

        static boolean canApplyTheme(android.graphics.drawable.Drawable drawable) {
            return drawable.canApplyTheme();
        }

        static android.graphics.ColorFilter getColorFilter(android.graphics.drawable.Drawable drawable) {
            return drawable.getColorFilter();
        }

        static void inflate(android.graphics.drawable.Drawable drawable, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
        }

        static void setHotspotBounds(android.graphics.drawable.Drawable drawable, int i, int i2, int i3, int i4) {
            drawable.setHotspotBounds(i, i2, i3, i4);
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static boolean setLayoutDirection(android.graphics.drawable.Drawable drawable, int i) {
            return drawable.setLayoutDirection(i);
        }

        static int getLayoutDirection(android.graphics.drawable.Drawable drawable) {
            return drawable.getLayoutDirection();
        }
    }
}
