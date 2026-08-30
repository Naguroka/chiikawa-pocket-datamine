package com.google.android.material.internal;

/* JADX INFO: loaded from: classes5.dex */
class ViewGroupOverlayApi14 extends com.google.android.material.internal.ViewOverlayApi14 implements com.google.android.material.internal.ViewGroupOverlayImpl {
    ViewGroupOverlayApi14(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view) {
        super(context, viewGroup, view);
    }

    static com.google.android.material.internal.ViewGroupOverlayApi14 createFrom(android.view.ViewGroup viewGroup) {
        return (com.google.android.material.internal.ViewGroupOverlayApi14) com.google.android.material.internal.ViewOverlayApi14.createFrom(viewGroup);
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void add(android.view.View view) {
        this.overlayViewGroup.add(view);
    }

    @Override // com.google.android.material.internal.ViewGroupOverlayImpl
    public void remove(android.view.View view) {
        this.overlayViewGroup.remove(view);
    }
}
