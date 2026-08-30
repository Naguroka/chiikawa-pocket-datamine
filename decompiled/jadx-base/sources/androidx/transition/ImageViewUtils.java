package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class ImageViewUtils {
    private static java.lang.reflect.Field sDrawMatrixField = null;
    private static boolean sDrawMatrixFieldFetched = false;
    private static boolean sTryHiddenAnimateTransform = true;

    static void animateTransform(android.widget.ImageView imageView, android.graphics.Matrix matrix) {
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            imageView.animateTransform(matrix);
            return;
        }
        if (matrix == null) {
            android.graphics.drawable.Drawable drawable = imageView.getDrawable();
            if (drawable != null) {
                drawable.setBounds(0, 0, (imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight(), (imageView.getHeight() - imageView.getPaddingTop()) - imageView.getPaddingBottom());
                imageView.invalidate();
                return;
            }
            return;
        }
        hiddenAnimateTransform(imageView, matrix);
    }

    private static void hiddenAnimateTransform(android.widget.ImageView imageView, android.graphics.Matrix matrix) {
        if (sTryHiddenAnimateTransform) {
            try {
                imageView.animateTransform(matrix);
            } catch (java.lang.NoSuchMethodError unused) {
                sTryHiddenAnimateTransform = false;
            }
        }
    }

    private static void fetchDrawMatrixField() {
        if (sDrawMatrixFieldFetched) {
            return;
        }
        try {
            java.lang.reflect.Field declaredField = android.widget.ImageView.class.getDeclaredField("mDrawMatrix");
            sDrawMatrixField = declaredField;
            declaredField.setAccessible(true);
        } catch (java.lang.NoSuchFieldException unused) {
        }
        sDrawMatrixFieldFetched = true;
    }

    private ImageViewUtils() {
    }
}
