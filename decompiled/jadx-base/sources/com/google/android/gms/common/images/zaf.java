package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zaf extends com.google.android.gms.common.images.zag {
    private final java.lang.ref.WeakReference zac;

    public zaf(com.google.android.gms.common.images.ImageManager.OnImageLoadedListener onImageLoadedListener, android.net.Uri uri) {
        super(uri, 0);
        com.google.android.gms.common.internal.Asserts.checkNotNull(onImageLoadedListener);
        this.zac = new java.lang.ref.WeakReference(onImageLoadedListener);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.images.zaf)) {
            return false;
        }
        com.google.android.gms.common.images.zaf zafVar = (com.google.android.gms.common.images.zaf) obj;
        com.google.android.gms.common.images.ImageManager.OnImageLoadedListener onImageLoadedListener = (com.google.android.gms.common.images.ImageManager.OnImageLoadedListener) this.zac.get();
        com.google.android.gms.common.images.ImageManager.OnImageLoadedListener onImageLoadedListener2 = (com.google.android.gms.common.images.ImageManager.OnImageLoadedListener) zafVar.zac.get();
        return onImageLoadedListener2 != null && onImageLoadedListener != null && com.google.android.gms.common.internal.Objects.equal(onImageLoadedListener2, onImageLoadedListener) && com.google.android.gms.common.internal.Objects.equal(zafVar.zaa, this.zaa);
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zaa);
    }

    @Override // com.google.android.gms.common.images.zag
    protected final void zaa(android.graphics.drawable.Drawable drawable, boolean z, boolean z2, boolean z3) {
        com.google.android.gms.common.images.ImageManager.OnImageLoadedListener onImageLoadedListener;
        if (z2 || (onImageLoadedListener = (com.google.android.gms.common.images.ImageManager.OnImageLoadedListener) this.zac.get()) == null) {
            return;
        }
        onImageLoadedListener.onImageLoaded(this.zaa.zaa, drawable, z3);
    }
}
