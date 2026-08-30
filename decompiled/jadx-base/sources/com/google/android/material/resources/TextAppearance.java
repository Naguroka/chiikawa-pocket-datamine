package com.google.android.material.resources;

/* JADX INFO: loaded from: classes5.dex */
public class TextAppearance {
    private static final java.lang.String TAG = "TextAppearance";
    private static final int TYPEFACE_MONOSPACE = 3;
    private static final int TYPEFACE_SANS = 1;
    private static final int TYPEFACE_SERIF = 2;
    private android.graphics.Typeface font;
    public final java.lang.String fontFamily;
    private final int fontFamilyResourceId;
    private boolean fontResolved = false;
    public final boolean hasLetterSpacing;
    public final float letterSpacing;
    public final android.content.res.ColorStateList shadowColor;
    public final float shadowDx;
    public final float shadowDy;
    public final float shadowRadius;
    public final boolean textAllCaps;
    private android.content.res.ColorStateList textColor;
    public final android.content.res.ColorStateList textColorHint;
    public final android.content.res.ColorStateList textColorLink;
    private float textSize;
    public final int textStyle;
    public final int typeface;

    public TextAppearance(android.content.Context context, int i) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i, com.google.android.material.R.styleable.TextAppearance);
        setTextSize(typedArrayObtainStyledAttributes.getDimension(com.google.android.material.R.styleable.TextAppearance_android_textSize, 0.0f));
        setTextColor(com.google.android.material.resources.MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.TextAppearance_android_textColor));
        this.textColorHint = com.google.android.material.resources.MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.TextAppearance_android_textColorHint);
        this.textColorLink = com.google.android.material.resources.MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.TextAppearance_android_textColorLink);
        this.textStyle = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.TextAppearance_android_textStyle, 0);
        this.typeface = typedArrayObtainStyledAttributes.getInt(com.google.android.material.R.styleable.TextAppearance_android_typeface, 1);
        int indexWithValue = com.google.android.material.resources.MaterialResources.getIndexWithValue(typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.TextAppearance_fontFamily, com.google.android.material.R.styleable.TextAppearance_android_fontFamily);
        this.fontFamilyResourceId = typedArrayObtainStyledAttributes.getResourceId(indexWithValue, 0);
        this.fontFamily = typedArrayObtainStyledAttributes.getString(indexWithValue);
        this.textAllCaps = typedArrayObtainStyledAttributes.getBoolean(com.google.android.material.R.styleable.TextAppearance_textAllCaps, false);
        this.shadowColor = com.google.android.material.resources.MaterialResources.getColorStateList(context, typedArrayObtainStyledAttributes, com.google.android.material.R.styleable.TextAppearance_android_shadowColor);
        this.shadowDx = typedArrayObtainStyledAttributes.getFloat(com.google.android.material.R.styleable.TextAppearance_android_shadowDx, 0.0f);
        this.shadowDy = typedArrayObtainStyledAttributes.getFloat(com.google.android.material.R.styleable.TextAppearance_android_shadowDy, 0.0f);
        this.shadowRadius = typedArrayObtainStyledAttributes.getFloat(com.google.android.material.R.styleable.TextAppearance_android_shadowRadius, 0.0f);
        typedArrayObtainStyledAttributes.recycle();
        android.content.res.TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(i, com.google.android.material.R.styleable.MaterialTextAppearance);
        this.hasLetterSpacing = typedArrayObtainStyledAttributes2.hasValue(com.google.android.material.R.styleable.MaterialTextAppearance_android_letterSpacing);
        this.letterSpacing = typedArrayObtainStyledAttributes2.getFloat(com.google.android.material.R.styleable.MaterialTextAppearance_android_letterSpacing, 0.0f);
        typedArrayObtainStyledAttributes2.recycle();
    }

    public android.graphics.Typeface getFont(android.content.Context context) {
        if (this.fontResolved) {
            return this.font;
        }
        if (!context.isRestricted()) {
            try {
                android.graphics.Typeface font = androidx.core.content.res.ResourcesCompat.getFont(context, this.fontFamilyResourceId);
                this.font = font;
                if (font != null) {
                    this.font = android.graphics.Typeface.create(font, this.textStyle);
                }
            } catch (android.content.res.Resources.NotFoundException | java.lang.UnsupportedOperationException unused) {
            } catch (java.lang.Exception e) {
                android.util.Log.d(TAG, "Error loading font " + this.fontFamily, e);
            }
        }
        createFallbackFont();
        this.fontResolved = true;
        return this.font;
    }

    public void getFontAsync(android.content.Context context, final com.google.android.material.resources.TextAppearanceFontCallback textAppearanceFontCallback) {
        if (shouldLoadFontSynchronously(context)) {
            getFont(context);
        } else {
            createFallbackFont();
        }
        int i = this.fontFamilyResourceId;
        if (i == 0) {
            this.fontResolved = true;
        }
        if (this.fontResolved) {
            textAppearanceFontCallback.onFontRetrieved(this.font, true);
            return;
        }
        try {
            androidx.core.content.res.ResourcesCompat.getFont(context, i, new androidx.core.content.res.ResourcesCompat.FontCallback() { // from class: com.google.android.material.resources.TextAppearance.1
                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                /* JADX INFO: renamed from: onFontRetrieved */
                public void m22x46c88379(android.graphics.Typeface typeface) {
                    com.google.android.material.resources.TextAppearance textAppearance = com.google.android.material.resources.TextAppearance.this;
                    textAppearance.font = android.graphics.Typeface.create(typeface, textAppearance.textStyle);
                    com.google.android.material.resources.TextAppearance.this.fontResolved = true;
                    textAppearanceFontCallback.onFontRetrieved(com.google.android.material.resources.TextAppearance.this.font, false);
                }

                @Override // androidx.core.content.res.ResourcesCompat.FontCallback
                /* JADX INFO: renamed from: onFontRetrievalFailed */
                public void m21xb24343b7(int i2) {
                    com.google.android.material.resources.TextAppearance.this.fontResolved = true;
                    textAppearanceFontCallback.onFontRetrievalFailed(i2);
                }
            }, null);
        } catch (android.content.res.Resources.NotFoundException unused) {
            this.fontResolved = true;
            textAppearanceFontCallback.onFontRetrievalFailed(1);
        } catch (java.lang.Exception e) {
            android.util.Log.d(TAG, "Error loading font " + this.fontFamily, e);
            this.fontResolved = true;
            textAppearanceFontCallback.onFontRetrievalFailed(-3);
        }
    }

    public void getFontAsync(final android.content.Context context, final android.text.TextPaint textPaint, final com.google.android.material.resources.TextAppearanceFontCallback textAppearanceFontCallback) {
        updateTextPaintMeasureState(context, textPaint, getFallbackFont());
        getFontAsync(context, new com.google.android.material.resources.TextAppearanceFontCallback() { // from class: com.google.android.material.resources.TextAppearance.2
            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrieved(android.graphics.Typeface typeface, boolean z) {
                com.google.android.material.resources.TextAppearance.this.updateTextPaintMeasureState(context, textPaint, typeface);
                textAppearanceFontCallback.onFontRetrieved(typeface, z);
            }

            @Override // com.google.android.material.resources.TextAppearanceFontCallback
            public void onFontRetrievalFailed(int i) {
                textAppearanceFontCallback.onFontRetrievalFailed(i);
            }
        });
    }

    public android.graphics.Typeface getFallbackFont() {
        createFallbackFont();
        return this.font;
    }

    private void createFallbackFont() {
        java.lang.String str;
        if (this.font == null && (str = this.fontFamily) != null) {
            this.font = android.graphics.Typeface.create(str, this.textStyle);
        }
        if (this.font == null) {
            int i = this.typeface;
            if (i == 1) {
                this.font = android.graphics.Typeface.SANS_SERIF;
            } else if (i == 2) {
                this.font = android.graphics.Typeface.SERIF;
            } else if (i == 3) {
                this.font = android.graphics.Typeface.MONOSPACE;
            } else {
                this.font = android.graphics.Typeface.DEFAULT;
            }
            this.font = android.graphics.Typeface.create(this.font, this.textStyle);
        }
    }

    public void updateDrawState(android.content.Context context, android.text.TextPaint textPaint, com.google.android.material.resources.TextAppearanceFontCallback textAppearanceFontCallback) {
        updateMeasureState(context, textPaint, textAppearanceFontCallback);
        android.content.res.ColorStateList colorStateList = this.textColor;
        textPaint.setColor(colorStateList != null ? colorStateList.getColorForState(textPaint.drawableState, this.textColor.getDefaultColor()) : androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
        float f = this.shadowRadius;
        float f2 = this.shadowDx;
        float f3 = this.shadowDy;
        android.content.res.ColorStateList colorStateList2 = this.shadowColor;
        textPaint.setShadowLayer(f, f2, f3, colorStateList2 != null ? colorStateList2.getColorForState(textPaint.drawableState, this.shadowColor.getDefaultColor()) : 0);
    }

    public void updateMeasureState(android.content.Context context, android.text.TextPaint textPaint, com.google.android.material.resources.TextAppearanceFontCallback textAppearanceFontCallback) {
        if (shouldLoadFontSynchronously(context)) {
            updateTextPaintMeasureState(context, textPaint, getFont(context));
        } else {
            getFontAsync(context, textPaint, textAppearanceFontCallback);
        }
    }

    public void updateTextPaintMeasureState(android.content.Context context, android.text.TextPaint textPaint, android.graphics.Typeface typeface) {
        android.graphics.Typeface typefaceMaybeCopyWithFontWeightAdjustment = com.google.android.material.resources.TypefaceUtils.maybeCopyWithFontWeightAdjustment(context, typeface);
        if (typefaceMaybeCopyWithFontWeightAdjustment != null) {
            typeface = typefaceMaybeCopyWithFontWeightAdjustment;
        }
        textPaint.setTypeface(typeface);
        int i = this.textStyle & (~typeface.getStyle());
        textPaint.setFakeBoldText((i & 1) != 0);
        textPaint.setTextSkewX((i & 2) != 0 ? -0.25f : 0.0f);
        textPaint.setTextSize(this.textSize);
        if (this.hasLetterSpacing) {
            textPaint.setLetterSpacing(this.letterSpacing);
        }
    }

    public android.content.res.ColorStateList getTextColor() {
        return this.textColor;
    }

    public void setTextColor(android.content.res.ColorStateList colorStateList) {
        this.textColor = colorStateList;
    }

    public float getTextSize() {
        return this.textSize;
    }

    public void setTextSize(float f) {
        this.textSize = f;
    }

    private boolean shouldLoadFontSynchronously(android.content.Context context) {
        if (com.google.android.material.resources.TextAppearanceConfig.shouldLoadFontSynchronously()) {
            return true;
        }
        int i = this.fontFamilyResourceId;
        return (i != 0 ? androidx.core.content.res.ResourcesCompat.getCachedFont(context, i) : null) != null;
    }
}
