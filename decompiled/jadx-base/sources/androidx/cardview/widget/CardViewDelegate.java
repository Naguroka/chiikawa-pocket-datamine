package androidx.cardview.widget;

/* JADX INFO: loaded from: classes.dex */
interface CardViewDelegate {
    android.graphics.drawable.Drawable getCardBackground();

    android.view.View getCardView();

    boolean getPreventCornerOverlap();

    boolean getUseCompatPadding();

    void setCardBackground(android.graphics.drawable.Drawable drawable);

    void setMinWidthHeightInternal(int i, int i2);

    void setShadowPadding(int i, int i2, int i3, int i4);
}
