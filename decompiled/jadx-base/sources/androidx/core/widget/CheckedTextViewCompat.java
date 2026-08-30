package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class CheckedTextViewCompat {
    private static final java.lang.String TAG = "CheckedTextViewCompat";

    private CheckedTextViewCompat() {
    }

    public static void setCheckMarkTintList(android.widget.CheckedTextView checkedTextView, android.content.res.ColorStateList colorStateList) {
        androidx.core.widget.CheckedTextViewCompat.Api21Impl.setCheckMarkTintList(checkedTextView, colorStateList);
    }

    public static android.content.res.ColorStateList getCheckMarkTintList(android.widget.CheckedTextView checkedTextView) {
        return androidx.core.widget.CheckedTextViewCompat.Api21Impl.getCheckMarkTintList(checkedTextView);
    }

    public static void setCheckMarkTintMode(android.widget.CheckedTextView checkedTextView, android.graphics.PorterDuff.Mode mode) {
        androidx.core.widget.CheckedTextViewCompat.Api21Impl.setCheckMarkTintMode(checkedTextView, mode);
    }

    public static android.graphics.PorterDuff.Mode getCheckMarkTintMode(android.widget.CheckedTextView checkedTextView) {
        return androidx.core.widget.CheckedTextViewCompat.Api21Impl.getCheckMarkTintMode(checkedTextView);
    }

    public static android.graphics.drawable.Drawable getCheckMarkDrawable(android.widget.CheckedTextView checkedTextView) {
        return androidx.core.widget.CheckedTextViewCompat.Api16Impl.getCheckMarkDrawable(checkedTextView);
    }

    private static class Api21Impl {
        private Api21Impl() {
        }

        static void setCheckMarkTintList(android.widget.CheckedTextView checkedTextView, android.content.res.ColorStateList colorStateList) {
            checkedTextView.setCheckMarkTintList(colorStateList);
        }

        static android.content.res.ColorStateList getCheckMarkTintList(android.widget.CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintList();
        }

        static void setCheckMarkTintMode(android.widget.CheckedTextView checkedTextView, android.graphics.PorterDuff.Mode mode) {
            checkedTextView.setCheckMarkTintMode(mode);
        }

        static android.graphics.PorterDuff.Mode getCheckMarkTintMode(android.widget.CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkTintMode();
        }
    }

    private static class Api16Impl {
        private Api16Impl() {
        }

        static android.graphics.drawable.Drawable getCheckMarkDrawable(android.widget.CheckedTextView checkedTextView) {
            return checkedTextView.getCheckMarkDrawable();
        }
    }

    private static class Api14Impl {
        private static java.lang.reflect.Field sCheckMarkDrawableField;
        private static boolean sResolved;

        private Api14Impl() {
        }

        static android.graphics.drawable.Drawable getCheckMarkDrawable(android.widget.CheckedTextView checkedTextView) {
            if (!sResolved) {
                try {
                    java.lang.reflect.Field declaredField = android.widget.CheckedTextView.class.getDeclaredField("mCheckMarkDrawable");
                    sCheckMarkDrawableField = declaredField;
                    declaredField.setAccessible(true);
                } catch (java.lang.NoSuchFieldException e) {
                    android.util.Log.i(androidx.core.widget.CheckedTextViewCompat.TAG, "Failed to retrieve mCheckMarkDrawable field", e);
                }
                sResolved = true;
            }
            java.lang.reflect.Field field = sCheckMarkDrawableField;
            if (field != null) {
                try {
                    return (android.graphics.drawable.Drawable) field.get(checkedTextView);
                } catch (java.lang.IllegalAccessException e2) {
                    android.util.Log.i(androidx.core.widget.CheckedTextViewCompat.TAG, "Failed to get check mark drawable via reflection", e2);
                    sCheckMarkDrawableField = null;
                }
            }
            return null;
        }
    }
}
