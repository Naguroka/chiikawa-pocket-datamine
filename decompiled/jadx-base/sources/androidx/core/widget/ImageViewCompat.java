package androidx.core.widget;

/* JADX INFO: loaded from: classes.dex */
public class ImageViewCompat {
    public static android.content.res.ColorStateList getImageTintList(android.widget.ImageView imageView) {
        return androidx.core.widget.ImageViewCompat.Api21Impl.getImageTintList(imageView);
    }

    public static void setImageTintList(android.widget.ImageView imageView, android.content.res.ColorStateList colorStateList) {
        androidx.core.widget.ImageViewCompat.Api21Impl.setImageTintList(imageView, colorStateList);
    }

    public static android.graphics.PorterDuff.Mode getImageTintMode(android.widget.ImageView imageView) {
        return androidx.core.widget.ImageViewCompat.Api21Impl.getImageTintMode(imageView);
    }

    public static void setImageTintMode(android.widget.ImageView imageView, android.graphics.PorterDuff.Mode mode) {
        androidx.core.widget.ImageViewCompat.Api21Impl.setImageTintMode(imageView, mode);
    }

    private ImageViewCompat() {
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static android.content.res.ColorStateList getImageTintList(android.widget.ImageView imageView) {
            return imageView.getImageTintList();
        }

        static void setImageTintList(android.widget.ImageView imageView, android.content.res.ColorStateList colorStateList) {
            imageView.setImageTintList(colorStateList);
        }

        static android.graphics.PorterDuff.Mode getImageTintMode(android.widget.ImageView imageView) {
            return imageView.getImageTintMode();
        }

        static void setImageTintMode(android.widget.ImageView imageView, android.graphics.PorterDuff.Mode mode) {
            imageView.setImageTintMode(mode);
        }
    }
}
