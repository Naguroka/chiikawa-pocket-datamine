package androidx.appcompat.widget;

/* JADX INFO: loaded from: classes.dex */
class TintResources extends androidx.appcompat.widget.ResourcesWrapper {
    private final java.lang.ref.WeakReference<android.content.Context> mContextRef;

    public TintResources(android.content.Context context, android.content.res.Resources resources) {
        super(resources);
        this.mContextRef = new java.lang.ref.WeakReference<>(context);
    }

    @Override // androidx.appcompat.widget.ResourcesWrapper, android.content.res.Resources
    public android.graphics.drawable.Drawable getDrawable(int i) throws android.content.res.Resources.NotFoundException {
        android.graphics.drawable.Drawable drawableCanonical = getDrawableCanonical(i);
        android.content.Context context = this.mContextRef.get();
        if (drawableCanonical != null && context != null) {
            androidx.appcompat.widget.ResourceManagerInternal.get().tintDrawableUsingColorFilter(context, i, drawableCanonical);
        }
        return drawableCanonical;
    }
}
