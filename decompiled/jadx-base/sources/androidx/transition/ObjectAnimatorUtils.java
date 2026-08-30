package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class ObjectAnimatorUtils {
    static <T> android.animation.ObjectAnimator ofPointF(T t, android.util.Property<T, android.graphics.PointF> property, android.graphics.Path path) {
        return android.animation.ObjectAnimator.ofObject(t, property, (android.animation.TypeConverter) null, path);
    }

    private ObjectAnimatorUtils() {
    }
}
