package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public final class CompoundButtonCompat {
    private static final java.lang.String TAG = "CompoundButtonCompat";
    private static java.lang.reflect.Field sButtonDrawableField;
    private static boolean sButtonDrawableFieldFetched;

    private CompoundButtonCompat() {
    }

    public static void setButtonTintList(android.widget.CompoundButton compoundButton, android.content.res.ColorStateList colorStateList) {
        androidx.core.widget.CompoundButtonCompat.Api21Impl.setButtonTintList(compoundButton, colorStateList);
    }

    public static android.content.res.ColorStateList getButtonTintList(android.widget.CompoundButton compoundButton) {
        return androidx.core.widget.CompoundButtonCompat.Api21Impl.getButtonTintList(compoundButton);
    }

    public static void setButtonTintMode(android.widget.CompoundButton compoundButton, android.graphics.PorterDuff.Mode mode) {
        androidx.core.widget.CompoundButtonCompat.Api21Impl.setButtonTintMode(compoundButton, mode);
    }

    public static android.graphics.PorterDuff.Mode getButtonTintMode(android.widget.CompoundButton compoundButton) {
        return androidx.core.widget.CompoundButtonCompat.Api21Impl.getButtonTintMode(compoundButton);
    }

    public static android.graphics.drawable.Drawable getButtonDrawable(android.widget.CompoundButton compoundButton) {
        return androidx.core.widget.CompoundButtonCompat.Api23Impl.getButtonDrawable(compoundButton);
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static void setButtonTintList(android.widget.CompoundButton compoundButton, android.content.res.ColorStateList colorStateList) {
            compoundButton.setButtonTintList(colorStateList);
        }

        static android.content.res.ColorStateList getButtonTintList(android.widget.CompoundButton compoundButton) {
            return compoundButton.getButtonTintList();
        }

        static void setButtonTintMode(android.widget.CompoundButton compoundButton, android.graphics.PorterDuff.Mode mode) {
            compoundButton.setButtonTintMode(mode);
        }

        static android.graphics.PorterDuff.Mode getButtonTintMode(android.widget.CompoundButton compoundButton) {
            return compoundButton.getButtonTintMode();
        }
    }

    static class Api23Impl {
        private Api23Impl() {
        }

        static android.graphics.drawable.Drawable getButtonDrawable(android.widget.CompoundButton compoundButton) {
            return compoundButton.getButtonDrawable();
        }
    }
}
