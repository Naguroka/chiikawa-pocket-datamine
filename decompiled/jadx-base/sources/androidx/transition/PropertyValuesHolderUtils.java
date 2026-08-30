package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class PropertyValuesHolderUtils {
    static android.animation.PropertyValuesHolder ofPointF(android.util.Property<?, android.graphics.PointF> property, android.graphics.Path path) {
        return android.animation.PropertyValuesHolder.ofObject(property, (android.animation.TypeConverter) null, path);
    }

    private PropertyValuesHolderUtils() {
    }
}
