package androidx.cardview.widget;

/* JADX INFO: loaded from: classes.dex */
class CardViewBaseImpl implements androidx.cardview.widget.CardViewImpl {
    final android.graphics.RectF mCornerRect = new android.graphics.RectF();

    @Override // androidx.cardview.widget.CardViewImpl
    public void onCompatPaddingChanged(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
    }

    CardViewBaseImpl() {
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void initStatic() {
        androidx.cardview.widget.RoundRectDrawableWithShadow.sRoundRectHelper = new androidx.cardview.widget.RoundRectDrawableWithShadow.RoundRectHelper() { // from class: androidx.cardview.widget.CardViewBaseImpl.1
            @Override // androidx.cardview.widget.RoundRectDrawableWithShadow.RoundRectHelper
            public void drawRoundRect(android.graphics.Canvas canvas, android.graphics.RectF rectF, float f, android.graphics.Paint paint) {
                float f2 = 2.0f * f;
                float fWidth = (rectF.width() - f2) - 1.0f;
                float fHeight = (rectF.height() - f2) - 1.0f;
                if (f >= 1.0f) {
                    float f3 = f + 0.5f;
                    float f4 = -f3;
                    androidx.cardview.widget.CardViewBaseImpl.this.mCornerRect.set(f4, f4, f3, f3);
                    int iSave = canvas.save();
                    canvas.translate(rectF.left + f3, rectF.top + f3);
                    canvas.drawArc(androidx.cardview.widget.CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint);
                    canvas.translate(fWidth, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(androidx.cardview.widget.CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint);
                    canvas.translate(fHeight, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(androidx.cardview.widget.CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint);
                    canvas.translate(fWidth, 0.0f);
                    canvas.rotate(90.0f);
                    canvas.drawArc(androidx.cardview.widget.CardViewBaseImpl.this.mCornerRect, 180.0f, 90.0f, true, paint);
                    canvas.restoreToCount(iSave);
                    canvas.drawRect((rectF.left + f3) - 1.0f, rectF.top, (rectF.right - f3) + 1.0f, rectF.top + f3, paint);
                    canvas.drawRect((rectF.left + f3) - 1.0f, rectF.bottom - f3, (rectF.right - f3) + 1.0f, rectF.bottom, paint);
                }
                canvas.drawRect(rectF.left, rectF.top + f, rectF.right, rectF.bottom - f, paint);
            }
        };
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void initialize(androidx.cardview.widget.CardViewDelegate cardViewDelegate, android.content.Context context, android.content.res.ColorStateList colorStateList, float f, float f2, float f3) {
        androidx.cardview.widget.RoundRectDrawableWithShadow roundRectDrawableWithShadowCreateBackground = createBackground(context, colorStateList, f, f2, f3);
        roundRectDrawableWithShadowCreateBackground.setAddPaddingForCorners(cardViewDelegate.getPreventCornerOverlap());
        cardViewDelegate.setCardBackground(roundRectDrawableWithShadowCreateBackground);
        updatePadding(cardViewDelegate);
    }

    private androidx.cardview.widget.RoundRectDrawableWithShadow createBackground(android.content.Context context, android.content.res.ColorStateList colorStateList, float f, float f2, float f3) {
        return new androidx.cardview.widget.RoundRectDrawableWithShadow(context.getResources(), colorStateList, f, f2, f3);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void updatePadding(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        android.graphics.Rect rect = new android.graphics.Rect();
        getShadowBackground(cardViewDelegate).getMaxShadowAndCornerPadding(rect);
        cardViewDelegate.setMinWidthHeightInternal((int) java.lang.Math.ceil(getMinWidth(cardViewDelegate)), (int) java.lang.Math.ceil(getMinHeight(cardViewDelegate)));
        cardViewDelegate.setShadowPadding(rect.left, rect.top, rect.right, rect.bottom);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void onPreventCornerOverlapChanged(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        getShadowBackground(cardViewDelegate).setAddPaddingForCorners(cardViewDelegate.getPreventCornerOverlap());
        updatePadding(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setBackgroundColor(androidx.cardview.widget.CardViewDelegate cardViewDelegate, android.content.res.ColorStateList colorStateList) {
        getShadowBackground(cardViewDelegate).setColor(colorStateList);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public android.content.res.ColorStateList getBackgroundColor(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getColor();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setRadius(androidx.cardview.widget.CardViewDelegate cardViewDelegate, float f) {
        getShadowBackground(cardViewDelegate).setCornerRadius(f);
        updatePadding(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getRadius(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getCornerRadius();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setElevation(androidx.cardview.widget.CardViewDelegate cardViewDelegate, float f) {
        getShadowBackground(cardViewDelegate).setShadowSize(f);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getElevation(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getShadowSize();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public void setMaxElevation(androidx.cardview.widget.CardViewDelegate cardViewDelegate, float f) {
        getShadowBackground(cardViewDelegate).setMaxShadowSize(f);
        updatePadding(cardViewDelegate);
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMaxElevation(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getMaxShadowSize();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMinWidth(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getMinWidth();
    }

    @Override // androidx.cardview.widget.CardViewImpl
    public float getMinHeight(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return getShadowBackground(cardViewDelegate).getMinHeight();
    }

    private androidx.cardview.widget.RoundRectDrawableWithShadow getShadowBackground(androidx.cardview.widget.CardViewDelegate cardViewDelegate) {
        return (androidx.cardview.widget.RoundRectDrawableWithShadow) cardViewDelegate.getCardBackground();
    }
}
