package com.google.android.gms.internal.base;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
final class zag extends android.graphics.drawable.Drawable.ConstantState {
    int zaa;
    int zab;

    zag(com.google.android.gms.internal.base.zag zagVar) {
        if (zagVar != null) {
            this.zaa = zagVar.zaa;
            this.zab = zagVar.zab;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.zaa;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final android.graphics.drawable.Drawable newDrawable() {
        return new com.google.android.gms.internal.base.zai(this);
    }
}
