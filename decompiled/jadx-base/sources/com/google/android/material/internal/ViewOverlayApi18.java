package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
class ViewOverlayApi18 implements com.google.android.material.internal.ViewOverlayImpl {
    private final android.view.ViewOverlay viewOverlay;

    ViewOverlayApi18(android.view.View view) {
        this.viewOverlay = view.getOverlay();
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void add(android.graphics.drawable.Drawable drawable) {
        this.viewOverlay.add(drawable);
    }

    @Override // com.google.android.material.internal.ViewOverlayImpl
    public void remove(android.graphics.drawable.Drawable drawable) {
        this.viewOverlay.remove(drawable);
    }
}
