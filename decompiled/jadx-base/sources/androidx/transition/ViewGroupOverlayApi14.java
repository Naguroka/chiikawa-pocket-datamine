package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class ViewGroupOverlayApi14 extends androidx.transition.ViewOverlayApi14 implements androidx.transition.ViewGroupOverlayImpl {
    ViewGroupOverlayApi14(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        super(context, viewGroup, view);
    }

    static androidx.transition.ViewGroupOverlayApi14 createFrom(android.view.ViewGroup viewGroup) {
        return (androidx.transition.ViewGroupOverlayApi14) androidx.transition.ViewOverlayApi14.createFrom(viewGroup);
    }

    @Override // androidx.transition.ViewGroupOverlayImpl
    public void add(android.view.View view) {
        this.mOverlayViewGroup.add(view);
    }

    @Override // androidx.transition.ViewGroupOverlayImpl
    public void remove(android.view.View view) {
        this.mOverlayViewGroup.remove(view);
    }
}
