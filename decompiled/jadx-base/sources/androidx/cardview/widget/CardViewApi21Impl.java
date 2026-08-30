package androidx.cardview.widget;

/* JADX INFO: loaded from: classes.dex */
class CardViewApi21Impl implements androidx.cardview.widget.CardViewImpl {
    @Override // androidx.cardview.widget.CardViewImpl
    public void initStatic() {
    }

    CardViewApi21Impl() {
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void initialize(androidx.cardview.widget.CardViewDelegate cardViewDelegate, android.content.Context context, android.content.res.ColorStateList colorStateList, float f, float f2, float f3) {
        cardViewDelegate.setCardBackground(new androidx.cardview.widget.RoundRectDrawable(colorStateList, f));
        android.view.View cardView = cardViewDelegate.getCardView();
        cardView.setClipToOutline(true);
        cardView.setElevation(f2);
        setMaxElevation(cardViewDelegate, f3);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setRadius(androidx.cardview.widget.CardViewDelegate cardViewDelegate, float f) {
        getCardBackground(cardViewDelegate).setRadius(f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setMaxElevation(androidx.cardview.widget.CardViewDelegate cardViewDelegate, float f) {
        getCardBackground(cardViewDelegate).setPadding(f, cardViewDelegate.getUseCompatPadding(), cardViewDelegate.getPreventCornerOverlap());
        updatePadding(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMaxElevation(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getCardBackground(cardViewDelegate).getPadding();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMinWidth(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getRadius(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMinHeight(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getRadius(cardViewDelegate) * 2.0f;
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getRadius(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getCardBackground(cardViewDelegate).getRadius();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setElevation(androidx.cardview.widget.CardViewDelegate cardViewDelegate, float f) {
        cardViewDelegate.getCardView().setElevation(f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getElevation(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return cardViewDelegate.getCardView().getElevation();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void updatePadding(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        if (!cardViewDelegate.getUseCompatPadding()) {
            cardViewDelegate.setShadowPadding(0, 0, 0, 0);
            return;
        }
        float maxElevation = getMaxElevation(cardViewDelegate);
        float radius = getRadius(cardViewDelegate);
        int iCeil = (int) java.lang.Math.ceil(androidx.cardview.widget.RoundRectDrawableWithShadow.calculateHorizontalPadding(maxElevation, radius, cardViewDelegate.getPreventCornerOverlap()));
        int iCeil2 = (int) java.lang.Math.ceil(androidx.cardview.widget.RoundRectDrawableWithShadow.calculateVerticalPadding(maxElevation, radius, cardViewDelegate.getPreventCornerOverlap()));
        cardViewDelegate.setShadowPadding(iCeil, iCeil2, iCeil, iCeil2);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void onCompatPaddingChanged(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        setMaxElevation(cardViewDelegate, getMaxElevation(cardViewDelegate));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void onPreventCornerOverlapChanged(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        setMaxElevation(cardViewDelegate, getMaxElevation(cardViewDelegate));
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setBackgroundColor(androidx.cardview.widget.CardViewDelegate cardViewDelegate, android.content.res.ColorStateList colorStateList) {
        getCardBackground(cardViewDelegate).setColor(colorStateList);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public android.content.res.ColorStateList getBackgroundColor(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getCardBackground(cardViewDelegate).getColor();
    }

    private androidx.cardview.widget.RoundRectDrawable getCardBackground(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return (androidx.cardview.widget.RoundRectDrawable) cardViewDelegate.getCardBackground();
    }
}
