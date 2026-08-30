package com.google.android.material.circularreveal;

/* JADX INFO: loaded from: classes5.dex */
public class CircularRevealGridLayout extends android.widget.GridLayout implements com.google.android.material.circularreveal.CircularRevealWidget {
    private final com.google.android.material.circularreveal.CircularRevealHelper helper;

    public CircularRevealGridLayout(android.content.Context context) {
        this(context, null);
    }

    public CircularRevealGridLayout(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.helper = new com.google.android.material.circularreveal.CircularRevealHelper(this);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void buildCircularRevealCache() {
        this.helper.buildCircularRevealCache();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void destroyCircularRevealCache() {
        this.helper.destroyCircularRevealCache();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo getRevealInfo() {
        return this.helper.getRevealInfo();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setRevealInfo(com.google.android.material.circularreveal.CircularRevealWidget.RevealInfo revealInfo) {
        this.helper.setRevealInfo(revealInfo);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public int getCircularRevealScrimColor() {
        return this.helper.getCircularRevealScrimColor();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealScrimColor(int i) {
        this.helper.setCircularRevealScrimColor(i);
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public android.graphics.drawable.Drawable getCircularRevealOverlayDrawable() {
        return this.helper.getCircularRevealOverlayDrawable();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealWidget
    public void setCircularRevealOverlayDrawable(android.graphics.drawable.Drawable drawable) {
        this.helper.setCircularRevealOverlayDrawable(drawable);
    }

    @Override // android.view.View, com.google.android.material.circularreveal.CircularRevealWidget
    public void draw(android.graphics.Canvas canvas) {
        com.google.android.material.circularreveal.CircularRevealHelper circularRevealHelper = this.helper;
        if (circularRevealHelper != null) {
            circularRevealHelper.draw(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.CircularRevealHelper.Delegate
    public void actualDraw(android.graphics.Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View, com.google.android.material.circularreveal.CircularRevealWidget
    public boolean isOpaque() {
        com.google.android.material.circularreveal.CircularRevealHelper circularRevealHelper = this.helper;
        if (circularRevealHelper != null) {
            return circularRevealHelper.isOpaque();
        }
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.CircularRevealHelper.Delegate
    public boolean actualIsOpaque() {
        return super.isOpaque();
    }
}
