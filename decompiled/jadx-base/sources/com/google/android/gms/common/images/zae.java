package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class zae extends com.google.android.gms.common.images.zag {
    private final java.lang.ref.WeakReference zac;

    public zae(android.widget.ImageView imageView, int i) {
        super(android.net.Uri.EMPTY, i);
        com.google.android.gms.common.internal.Asserts.checkNotNull(imageView);
        this.zac = new java.lang.ref.WeakReference(imageView);
    }

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.images.zae)) {
            return false;
        }
        android.widget.ImageView imageView = (android.widget.ImageView) this.zac.get();
        android.widget.ImageView imageView2 = (android.widget.ImageView) ((com.google.android.gms.common.images.zae) obj).zac.get();
        return (imageView2 == null || imageView == null || !com.google.android.gms.common.internal.Objects.equal(imageView2, imageView)) ? false : true;
    }

    public final int hashCode() {
        return 0;
    }

    @Override // com.google.android.gms.common.images.zag
    protected final void zaa(android.graphics.drawable.Drawable drawable, boolean z, boolean z2, boolean z3) {
        android.widget.ImageView imageView = (android.widget.ImageView) this.zac.get();
        if (imageView != null) {
            if (!z2 && !z3 && (imageView instanceof com.google.android.gms.internal.base.zaj)) {
                throw null;
            }
            boolean z4 = false;
            if (!z2 && !z) {
                z4 = true;
            }
            if (z4) {
                android.graphics.drawable.Drawable drawable2 = imageView.getDrawable();
                if (drawable2 == null) {
                    drawable2 = null;
                } else if (drawable2 instanceof com.google.android.gms.internal.base.zai) {
                    drawable2 = ((com.google.android.gms.internal.base.zai) drawable2).zaa();
                }
                drawable = new com.google.android.gms.internal.base.zai(drawable2, drawable);
            }
            imageView.setImageDrawable(drawable);
            if (imageView instanceof com.google.android.gms.internal.base.zaj) {
                throw null;
            }
            if (drawable == null || !z4) {
                return;
            }
            ((com.google.android.gms.internal.base.zai) drawable).zab(250);
        }
    }

    public zae(android.widget.ImageView imageView, android.net.Uri uri) {
        super(uri, 0);
        com.google.android.gms.common.internal.Asserts.checkNotNull(imageView);
        this.zac = new java.lang.ref.WeakReference(imageView);
    }
}
