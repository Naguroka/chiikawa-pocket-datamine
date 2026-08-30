package com.google.android.material.tooltip;

/* JADX INFO: loaded from: classes5.dex */
public class TooltipDrawable extends com.google.android.material.shape.MaterialShapeDrawable implements com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate {
    private static final int DEFAULT_STYLE = com.google.android.material.R.style.Widget_MaterialComponents_Tooltip;
    private static final int DEFAULT_THEME_ATTR = com.google.android.material.R.attr.tooltipStyle;
    private int arrowSize;
    private final android.view.View.OnLayoutChangeListener attachedViewLayoutChangeListener;
    private final android.content.Context context;
    private final android.graphics.Rect displayFrame;
    private final android.graphics.Paint.FontMetrics fontMetrics;
    private float labelOpacity;
    private int layoutMargin;
    private int locationOnScreenX;
    private int minHeight;
    private int minWidth;
    private int padding;
    private java.lang.CharSequence text;
    private final com.google.android.material.internal.TextDrawableHelper textDrawableHelper;
    private final float tooltipPivotX;
    private float tooltipPivotY;
    private float tooltipScaleX;
    private float tooltipScaleY;

    public static com.google.android.material.tooltip.TooltipDrawable createFromAttributes(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        com.google.android.material.tooltip.TooltipDrawable tooltipDrawable = new com.google.android.material.tooltip.TooltipDrawable(context, attributeSet, i, i2);
        tooltipDrawable.loadFromAttributes(attributeSet, i, i2);
        return tooltipDrawable;
    }

    public static com.google.android.material.tooltip.TooltipDrawable createFromAttributes(android.content.Context context, android.util.AttributeSet attributeSet) {
        return createFromAttributes(context, attributeSet, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }

    public static com.google.android.material.tooltip.TooltipDrawable create(android.content.Context context) {
        return createFromAttributes(context, null, DEFAULT_THEME_ATTR, DEFAULT_STYLE);
    }

    private TooltipDrawable(android.content.Context context, android.util.AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.fontMetrics = new android.graphics.Paint.FontMetrics();
        com.google.android.material.internal.TextDrawableHelper textDrawableHelper = new com.google.android.material.internal.TextDrawableHelper(this);
        this.textDrawableHelper = textDrawableHelper;
        this.attachedViewLayoutChangeListener = new android.view.View.OnLayoutChangeListener() { // from class: com.google.android.material.tooltip.TooltipDrawable.1
            @Override // android.view.View.OnLayoutChangeListener
            public void onLayoutChange(android.view.View view, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
                com.google.android.material.tooltip.TooltipDrawable.this.updateLocationOnScreen(view);
            }
        };
        this.displayFrame = new android.graphics.Rect();
        this.tooltipScaleX = 1.0f;
        this.tooltipScaleY = 1.0f;
        this.tooltipPivotX = 0.5f;
        this.tooltipPivotY = 0.5f;
        this.labelOpacity = 1.0f;
        this.context = context;
        textDrawableHelper.getTextPaint().density = context.getResources().getDisplayMetrics().density;
        textDrawableHelper.getTextPaint().setTextAlign(android.graphics.Paint.Align.CENTER);
    }

    private void loadFromAttributes(android.util.AttributeSet attributeSet, int i, int i2) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = com.google.android.material.internal.ThemeEnforcement.obtainStyledAttributes(this.context, attributeSet, com.google.android.material.R.styleable.Tooltip, i, i2, new int[0]);
        this.arrowSize = this.context.getResources().getDimensionPixelSize(com.google.android.material.R.dimen.mtrl_tooltip_arrowSize);
        setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(createMarkerEdge()).build());
        setText(typedArrayObtainStyledAttributes.getText(com.google.android.material.R.styleable.Tooltip_android_text));
        com.google.android.material.resources.TextAppearance textAppearance = com.google.android.material.resources.MaterialResources.getTextAppearance(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Tooltip_android_textAppearance);
        if (textAppearance != null && typedArrayObtainStyledAttributes.hasValue(com.google.android.material.R.styleable.Tooltip_android_textColor)) {
            textAppearance.setTextColor(com.google.android.material.resources.MaterialResources.getColorStateList(this.context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.Tooltip_android_textColor));
        }
        setTextAppearance(textAppearance);
        setFillColor(android.content.res.ColorStateList.valueOf(typedArrayObtainStyledAttributes.getColor(com.google.android.material.R.styleable.Tooltip_backgroundTint, com.google.android.material.color.MaterialColors.layer(androidx.core.graphics.ColorUtils.setAlphaComponent(com.google.android.material.color.MaterialColors.getColor(this.context, android.R.attr.colorBackground, com.google.android.material.tooltip.TooltipDrawable.class.getCanonicalName()), 229), androidx.core.graphics.ColorUtils.setAlphaComponent(com.google.android.material.color.MaterialColors.getColor(this.context, com.google.android.material.R.attr.colorOnBackground, com.google.android.material.tooltip.TooltipDrawable.class.getCanonicalName()), 153)))));
        setStrokeColor(android.content.res.ColorStateList.valueOf(com.google.android.material.color.MaterialColors.getColor(this.context, com.google.android.material.R.attr.colorSurface, com.google.android.material.tooltip.TooltipDrawable.class.getCanonicalName())));
        this.padding = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Tooltip_android_padding, 0);
        this.minWidth = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Tooltip_android_minWidth, 0);
        this.minHeight = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Tooltip_android_minHeight, 0);
        this.layoutMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(com.google.android.material.R.styleable.Tooltip_android_layout_margin, 0);
        typedArrayObtainStyledAttributes.recycle();
    }

    public java.lang.CharSequence getText() {
        return this.text;
    }

    public void setTextResource(int i) {
        setText(this.context.getResources().getString(i));
    }

    public void setText(java.lang.CharSequence charSequence) {
        if (android.text.TextUtils.equals(this.text, charSequence)) {
            return;
        }
        this.text = charSequence;
        this.textDrawableHelper.setTextWidthDirty(true);
        invalidateSelf();
    }

    public com.google.android.material.resources.TextAppearance getTextAppearance() {
        return this.textDrawableHelper.getTextAppearance();
    }

    public void setTextAppearanceResource(int i) {
        setTextAppearance(new com.google.android.material.resources.TextAppearance(this.context, i));
    }

    public void setTextAppearance(com.google.android.material.resources.TextAppearance textAppearance) {
        this.textDrawableHelper.setTextAppearance(textAppearance, this.context);
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    public void setMinWidth(int i) {
        this.minWidth = i;
        invalidateSelf();
    }

    public int getMinHeight() {
        return this.minHeight;
    }

    public void setMinHeight(int i) {
        this.minHeight = i;
        invalidateSelf();
    }

    public int getTextPadding() {
        return this.padding;
    }

    public void setTextPadding(int i) {
        this.padding = i;
        invalidateSelf();
    }

    public int getLayoutMargin() {
        return this.layoutMargin;
    }

    public void setLayoutMargin(int i) {
        this.layoutMargin = i;
        invalidateSelf();
    }

    public void setRevealFraction(float f) {
        this.tooltipPivotY = 1.2f;
        this.tooltipScaleX = f;
        this.tooltipScaleY = f;
        this.labelOpacity = com.google.android.material.animation.AnimationUtils.lerp(0.0f, 1.0f, 0.19f, 1.0f, f);
        invalidateSelf();
    }

    public void setRelativeToView(android.view.View view) {
        if (view == null) {
            return;
        }
        updateLocationOnScreen(view);
        view.addOnLayoutChangeListener(this.attachedViewLayoutChangeListener);
    }

    public void detachView(android.view.View view) {
        if (view == null) {
            return;
        }
        view.removeOnLayoutChangeListener(this.attachedViewLayoutChangeListener);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return (int) java.lang.Math.max((this.padding * 2) + getTextWidth(), this.minWidth);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) java.lang.Math.max(this.textDrawableHelper.getTextPaint().getTextSize(), this.minHeight);
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        canvas.save();
        float fCalculatePointerOffset = calculatePointerOffset();
        float f = (float) (-((((double) this.arrowSize) * java.lang.Math.sqrt(2.0d)) - ((double) this.arrowSize)));
        canvas.scale(this.tooltipScaleX, this.tooltipScaleY, getBounds().left + (getBounds().width() * 0.5f), getBounds().top + (getBounds().height() * this.tooltipPivotY));
        canvas.translate(fCalculatePointerOffset, f);
        super.draw(canvas);
        drawText(canvas);
        canvas.restore();
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        super.onBoundsChange(rect);
        setShapeAppearanceModel(getShapeAppearanceModel().toBuilder().setBottomEdge(createMarkerEdge()).build());
    }

    @Override // com.google.android.material.shape.MaterialShapeDrawable, android.graphics.drawable.Drawable, com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // com.google.android.material.internal.TextDrawableHelper.TextDrawableDelegate
    public void onTextSizeChange() {
        invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLocationOnScreen(android.view.View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        this.locationOnScreenX = iArr[0];
        view.getWindowVisibleDisplayFrame(this.displayFrame);
    }

    private float calculatePointerOffset() {
        int i;
        if (((this.displayFrame.right - getBounds().right) - this.locationOnScreenX) - this.layoutMargin < 0) {
            i = ((this.displayFrame.right - getBounds().right) - this.locationOnScreenX) - this.layoutMargin;
        } else {
            if (((this.displayFrame.left - getBounds().left) - this.locationOnScreenX) + this.layoutMargin <= 0) {
                return 0.0f;
            }
            i = ((this.displayFrame.left - getBounds().left) - this.locationOnScreenX) + this.layoutMargin;
        }
        return i;
    }

    private com.google.android.material.shape.EdgeTreatment createMarkerEdge() {
        float f = -calculatePointerOffset();
        float fWidth = ((float) (((double) getBounds().width()) - (((double) this.arrowSize) * java.lang.Math.sqrt(2.0d)))) / 2.0f;
        return new com.google.android.material.shape.OffsetEdgeTreatment(new com.google.android.material.shape.MarkerEdgeTreatment(this.arrowSize), java.lang.Math.min(java.lang.Math.max(f, -fWidth), fWidth));
    }

    private void drawText(android.graphics.Canvas canvas) {
        if (this.text == null) {
            return;
        }
        android.graphics.Rect bounds = getBounds();
        int iCalculateTextOriginAndAlignment = (int) calculateTextOriginAndAlignment(bounds);
        if (this.textDrawableHelper.getTextAppearance() != null) {
            this.textDrawableHelper.getTextPaint().drawableState = getState();
            this.textDrawableHelper.updateTextPaintDrawState(this.context);
            this.textDrawableHelper.getTextPaint().setAlpha((int) (this.labelOpacity * 255.0f));
        }
        java.lang.CharSequence charSequence = this.text;
        canvas.drawText(charSequence, 0, charSequence.length(), bounds.centerX(), iCalculateTextOriginAndAlignment, this.textDrawableHelper.getTextPaint());
    }

    private float getTextWidth() {
        java.lang.CharSequence charSequence = this.text;
        if (charSequence == null) {
            return 0.0f;
        }
        return this.textDrawableHelper.getTextWidth(charSequence.toString());
    }

    private float calculateTextOriginAndAlignment(android.graphics.Rect rect) {
        return rect.centerY() - calculateTextCenterFromBaseline();
    }

    private float calculateTextCenterFromBaseline() {
        this.textDrawableHelper.getTextPaint().getFontMetrics(this.fontMetrics);
        return (this.fontMetrics.descent + this.fontMetrics.ascent) / 2.0f;
    }
}
