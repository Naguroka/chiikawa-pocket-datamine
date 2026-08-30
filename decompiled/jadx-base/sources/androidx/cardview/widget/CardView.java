package androidx.cardview.widget;

/* JADX INFO: loaded from: classes.dex */
public class CardView extends android.widget.FrameLayout {
    private static final int[] COLOR_BACKGROUND_ATTR = {android.R.attr.colorBackground};
    private static final androidx.cardview.widget.CardViewImpl IMPL;
    private final androidx.cardview.widget.CardViewDelegate mCardViewDelegate;
    private boolean mCompatPadding;
    final android.graphics.Rect mContentPadding;
    private boolean mPreventCornerOverlap;
    final android.graphics.Rect mShadowBounds;
    int mUserSetMinHeight;
    int mUserSetMinWidth;

    @Override // android.view.View
    public void setPadding(int i, int i2, int i3, int i4) {
    }

    @Override // android.view.View
    public void setPaddingRelative(int i, int i2, int i3, int i4) {
    }

    static {
        androidx.cardview.widget.CardViewApi21Impl cardViewApi21Impl = new androidx.cardview.widget.CardViewApi21Impl();
        IMPL = cardViewApi21Impl;
        cardViewApi21Impl.initStatic();
    }

    public CardView(android.content.Context context) {
        this(context, null);
    }

    public CardView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, androidx.cardview.R.attr.cardViewStyle);
    }

    public CardView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int color;
        android.content.res.ColorStateList colorStateListValueOf;
        super(context, attributeSet, i);
        android.graphics.Rect rect = new android.graphics.Rect();
        this.mContentPadding = rect;
        this.mShadowBounds = new android.graphics.Rect();
        androidx.cardview.widget.CardViewDelegate cardViewDelegate = new androidx.cardview.widget.CardViewDelegate() { // from class: androidx.cardview.widget.CardView.1
            private android.graphics.drawable.Drawable mCardBackground;

            @Override // androidx.cardview.widget.CardViewDelegate
            public void setCardBackground(android.graphics.drawable.Drawable drawable) {
                this.mCardBackground = drawable;
                androidx.cardview.widget.CardView.this.setBackgroundDrawable(drawable);
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public boolean getUseCompatPadding() {
                return androidx.cardview.widget.CardView.this.getUseCompatPadding();
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public boolean getPreventCornerOverlap() {
                return androidx.cardview.widget.CardView.this.getPreventCornerOverlap();
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public void setShadowPadding(int i2, int i3, int i4, int i5) {
                androidx.cardview.widget.CardView.this.mShadowBounds.set(i2, i3, i4, i5);
                androidx.cardview.widget.CardView cardView = androidx.cardview.widget.CardView.this;
                androidx.cardview.widget.CardView.super.setPadding(i2 + cardView.mContentPadding.left, i3 + androidx.cardview.widget.CardView.this.mContentPadding.top, i4 + androidx.cardview.widget.CardView.this.mContentPadding.right, i5 + androidx.cardview.widget.CardView.this.mContentPadding.bottom);
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public void setMinWidthHeightInternal(int i2, int i3) {
                if (i2 > androidx.cardview.widget.CardView.this.mUserSetMinWidth) {
                    androidx.cardview.widget.CardView.super.setMinimumWidth(i2);
                }
                if (i3 > androidx.cardview.widget.CardView.this.mUserSetMinHeight) {
                    androidx.cardview.widget.CardView.super.setMinimumHeight(i3);
                }
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public android.graphics.drawable.Drawable getCardBackground() {
                return this.mCardBackground;
            }

            @Override // androidx.cardview.widget.CardViewDelegate
            public android.view.View getCardView() {
                return androidx.cardview.widget.CardView.this;
            }
        };
        this.mCardViewDelegate = cardViewDelegate;
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.cardview.R.styleable.CardView, i, androidx.cardview.R.style.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(androidx.cardview.R.styleable.CardView_cardBackgroundColor)) {
            colorStateListValueOf = typedArrayObtainStyledAttributes.getColorStateList(androidx.cardview.R.styleable.CardView_cardBackgroundColor);
        } else {
            android.content.res.TypedArray typedArrayObtainStyledAttributes2 = getContext().obtainStyledAttributes(COLOR_BACKGROUND_ATTR);
            int color2 = typedArrayObtainStyledAttributes2.getColor(0, 0);
            typedArrayObtainStyledAttributes2.recycle();
            float[] fArr = new float[3];
            android.graphics.Color.colorToHSV(color2, fArr);
            if (fArr[2] > 0.5f) {
                color = getResources().getColor(androidx.cardview.R.color.cardview_light_background);
            } else {
                color = getResources().getColor(androidx.cardview.R.color.cardview_dark_background);
            }
            colorStateListValueOf = android.content.res.ColorStateList.valueOf(color);
        }
        android.content.res.ColorStateList colorStateList = colorStateListValueOf;
        float dimension = typedArrayObtainStyledAttributes.getDimension(androidx.cardview.R.styleable.CardView_cardCornerRadius, 0.0f);
        float dimension2 = typedArrayObtainStyledAttributes.getDimension(androidx.cardview.R.styleable.CardView_cardElevation, 0.0f);
        float dimension3 = typedArrayObtainStyledAttributes.getDimension(androidx.cardview.R.styleable.CardView_cardMaxElevation, 0.0f);
        this.mCompatPadding = typedArrayObtainStyledAttributes.getBoolean(androidx.cardview.R.styleable.CardView_cardUseCompatPadding, false);
        this.mPreventCornerOverlap = typedArrayObtainStyledAttributes.getBoolean(androidx.cardview.R.styleable.CardView_cardPreventCornerOverlap, true);
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPadding, 0);
        rect.left = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingLeft, dimensionPixelSize);
        rect.top = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingTop, dimensionPixelSize);
        rect.right = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingRight, dimensionPixelSize);
        rect.bottom = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_contentPaddingBottom, dimensionPixelSize);
        float f = dimension2 > dimension3 ? dimension2 : dimension3;
        this.mUserSetMinWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_android_minWidth, 0);
        this.mUserSetMinHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(androidx.cardview.R.styleable.CardView_android_minHeight, 0);
        typedArrayObtainStyledAttributes.recycle();
        IMPL.initialize(cardViewDelegate, context, colorStateList, dimension, dimension2, f);
    }

    public boolean getUseCompatPadding() {
        return this.mCompatPadding;
    }

    public void setUseCompatPadding(boolean z) {
        if (this.mCompatPadding != z) {
            this.mCompatPadding = z;
            IMPL.onCompatPaddingChanged(this.mCardViewDelegate);
        }
    }

    public void setContentPadding(int i, int i2, int i3, int i4) {
        this.mContentPadding.set(i, i2, i3, i4);
        IMPL.updatePadding(this.mCardViewDelegate);
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        androidx.cardview.widget.CardViewImpl cardViewImpl = IMPL;
        if (!(cardViewImpl instanceof androidx.cardview.widget.CardViewApi21Impl)) {
            int mode = android.view.View.MeasureSpec.getMode(i);
            if (mode == Integer.MIN_VALUE || mode == 1073741824) {
                i = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max((int) java.lang.Math.ceil(cardViewImpl.getMinWidth(this.mCardViewDelegate)), android.view.View.MeasureSpec.getSize(i)), mode);
            }
            int mode2 = android.view.View.MeasureSpec.getMode(i2);
            if (mode2 == Integer.MIN_VALUE || mode2 == 1073741824) {
                i2 = android.view.View.MeasureSpec.makeMeasureSpec(java.lang.Math.max((int) java.lang.Math.ceil(cardViewImpl.getMinHeight(this.mCardViewDelegate)), android.view.View.MeasureSpec.getSize(i2)), mode2);
            }
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(i, i2);
    }

    @Override // android.view.View
    public void setMinimumWidth(int i) {
        this.mUserSetMinWidth = i;
        super.setMinimumWidth(i);
    }

    @Override // android.view.View
    public void setMinimumHeight(int i) {
        this.mUserSetMinHeight = i;
        super.setMinimumHeight(i);
    }

    public void setCardBackgroundColor(int i) {
        IMPL.setBackgroundColor(this.mCardViewDelegate, android.content.res.ColorStateList.valueOf(i));
    }

    public void setCardBackgroundColor(android.content.res.ColorStateList colorStateList) {
        IMPL.setBackgroundColor(this.mCardViewDelegate, colorStateList);
    }

    public android.content.res.ColorStateList getCardBackgroundColor() {
        return IMPL.getBackgroundColor(this.mCardViewDelegate);
    }

    public int getContentPaddingLeft() {
        return this.mContentPadding.left;
    }

    public int getContentPaddingRight() {
        return this.mContentPadding.right;
    }

    public int getContentPaddingTop() {
        return this.mContentPadding.top;
    }

    public int getContentPaddingBottom() {
        return this.mContentPadding.bottom;
    }

    public void setRadius(float f) {
        IMPL.setRadius(this.mCardViewDelegate, f);
    }

    public float getRadius() {
        return IMPL.getRadius(this.mCardViewDelegate);
    }

    public void setCardElevation(float f) {
        IMPL.setElevation(this.mCardViewDelegate, f);
    }

    public float getCardElevation() {
        return IMPL.getElevation(this.mCardViewDelegate);
    }

    public void setMaxCardElevation(float f) {
        IMPL.setMaxElevation(this.mCardViewDelegate, f);
    }

    public float getMaxCardElevation() {
        return IMPL.getMaxElevation(this.mCardViewDelegate);
    }

    public boolean getPreventCornerOverlap() {
        return this.mPreventCornerOverlap;
    }

    public void setPreventCornerOverlap(boolean z) {
        if (z != this.mPreventCornerOverlap) {
            this.mPreventCornerOverlap = z;
            IMPL.onPreventCornerOverlapChanged(this.mCardViewDelegate);
        }
    }
}
