package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class ViewGroupOverlayApi18 implements androidx.transition.ViewGroupOverlayImpl {
    private final android.view.ViewGroupOverlay mViewGroupOverlay;

    ViewGroupOverlayApi18(android.view.ViewGroup viewGroup) {
        this.mViewGroupOverlay = viewGroup.getOverlay();
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void add(android.graphics.drawable.Drawable drawable) {
        this.mViewGroupOverlay.add(drawable);
    }

    @Override // androidx.transition.ViewOverlayImpl
    public void remove(android.graphics.drawable.Drawable drawable) {
        this.mViewGroupOverlay.remove(drawable);
    }

    @Override // androidx.transition.ViewGroupOverlayImpl
    public void add(android.view.View view) {
        this.mViewGroupOverlay.add(view);
    }

    @Override // androidx.transition.ViewGroupOverlayImpl
    public void remove(android.view.View view) {
        this.mViewGroupOverlay.remove(view);
    }
}
