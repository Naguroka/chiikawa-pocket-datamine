package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
class ViewGroupOverlayApi18 implements com.google.android.material.internal.ViewGroupOverlayImpl {
    private final android.view.ViewGroupOverlay viewGroupOverlay;

    ViewGroupOverlayApi18(android.view.ViewGroup viewGroup) {
        this.viewGroupOverlay = viewGroup.getOverlay();
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(android.graphics.drawable.Drawable drawable) {
        this.viewGroupOverlay.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(android.graphics.drawable.Drawable drawable) {
        this.viewGroupOverlay.remove(drawable);
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void add(android.view.View view) {
        this.viewGroupOverlay.add(view);
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void remove(android.view.View view) {
        this.viewGroupOverlay.remove(view);
    }
}
