package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class ViewOverlayApi18 implements androidx.transition.ViewOverlayImpl {
    private final android.view.ViewOverlay mViewOverlay;

    ViewOverlayApi18(android.view.View view) {
        this.mViewOverlay = view.getOverlay();
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void add(android.graphics.drawable.Drawable drawable) {
        this.mViewOverlay.add(drawable);
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void remove(android.graphics.drawable.Drawable drawable) {
        this.mViewOverlay.remove(drawable);
    }
}
