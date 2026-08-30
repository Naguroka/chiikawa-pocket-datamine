package androidx.dynamicanimation.animation;

/* JADX INFO: loaded from: classes.dex */
public abstract class FloatPropertyCompat<T> {
    final java.lang.String mPropertyName;

    public abstract float getValue(T t);

    public abstract void setValue(T t, float f);

    public FloatPropertyCompat(java.lang.String str) {
        this.mPropertyName = str;
    }

    public static <T> androidx.dynamicanimation.animation.FloatPropertyCompat<T> createFloatPropertyCompat(final android.util.FloatProperty<T> floatProperty) {
        return new androidx.dynamicanimation.animation.FloatPropertyCompat<T>(floatProperty.getName()) { // from class: androidx.dynamicanimation.animation.FloatPropertyCompat.1
            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public float getValue(T t) {
                return ((java.lang.Float) floatProperty.get(t)).floatValue();
            }

            @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
            public void setValue(T t, float f) {
                floatProperty.setValue(t, f);
            }
        };
    }
}
