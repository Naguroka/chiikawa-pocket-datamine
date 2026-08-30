package com.google.android.gms.common.images;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class zag {
    final com.google.android.gms.common.images.zad zaa;
    protected int zab;

    public zag(android.net.Uri uri, int i) {
        this.zab = 0;
        this.zaa = new com.google.android.gms.common.images.zad(uri);
        this.zab = i;
    }

    protected abstract void zaa(android.graphics.drawable.Drawable drawable, boolean z, boolean z2, boolean z3);

    final void zab(android.content.Context context, com.google.android.gms.internal.base.zak zakVar, boolean z) {
        int i = this.zab;
        zaa(i != 0 ? context.getResources().getDrawable(i) : null, z, false, false);
    }

    final void zac(android.content.Context context, android.graphics.Bitmap bitmap, boolean z) {
        com.google.android.gms.common.internal.Asserts.checkNotNull(bitmap);
        zaa(new android.graphics.drawable.BitmapDrawable(context.getResources(), bitmap), false, false, true);
    }
}
