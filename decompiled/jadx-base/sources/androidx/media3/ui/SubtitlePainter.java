package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
final class SubtitlePainter {
    private static final float INNER_PADDING_RATIO = 0.125f;
    private static final java.lang.String TAG = "SubtitlePainter";
    private int backgroundColor;
    private final android.graphics.Paint bitmapPaint;
    private android.graphics.Rect bitmapRect;
    private float bottomPaddingFraction;
    private android.graphics.Bitmap cueBitmap;
    private float cueBitmapHeight;
    private float cueLine;
    private int cueLineAnchor;
    private int cueLineType;
    private float cuePosition;
    private int cuePositionAnchor;
    private float cueSize;
    private java.lang.CharSequence cueText;
    private android.text.Layout.Alignment cueTextAlignment;
    private float cueTextSizePx;
    private float defaultTextSizePx;
    private int edgeColor;
    private android.text.StaticLayout edgeLayout;
    private int edgeType;
    private int foregroundColor;
    private final float outlineWidth;
    private int parentBottom;
    private int parentLeft;
    private int parentRight;
    private int parentTop;
    private final float shadowOffset;
    private final float shadowRadius;
    private final float spacingAdd;
    private final float spacingMult;
    private android.text.StaticLayout textLayout;
    private int textLeft;
    private int textPaddingX;
    private final android.text.TextPaint textPaint;
    private int textTop;
    private int windowColor;
    private final android.graphics.Paint windowPaint;

    public SubtitlePainter(android.content.Context context) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{android.R.attr.lineSpacingExtra, android.R.attr.lineSpacingMultiplier}, 0, 0);
        this.spacingAdd = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.spacingMult = typedArrayObtainStyledAttributes.getFloat(1, 1.0f);
        typedArrayObtainStyledAttributes.recycle();
        float fRound = java.lang.Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.outlineWidth = fRound;
        this.shadowRadius = fRound;
        this.shadowOffset = fRound;
        android.text.TextPaint textPaint = new android.text.TextPaint();
        this.textPaint = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        android.graphics.Paint paint = new android.graphics.Paint();
        this.windowPaint = paint;
        paint.setAntiAlias(true);
        paint.setStyle(android.graphics.Paint.Style.FILL);
        android.graphics.Paint paint2 = new android.graphics.Paint();
        this.bitmapPaint = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    public void draw(androidx.media3.common.text.Cue cue, androidx.media3.ui.CaptionStyleCompat captionStyleCompat, float f, float f2, float f3, android.graphics.Canvas canvas, int i, int i2, int i3, int i4) {
        int i5;
        boolean z = cue.bitmap == null;
        if (!z) {
            i5 = androidx.core.view.ViewCompat.MEASURED_STATE_MASK;
        } else if (android.text.TextUtils.isEmpty(cue.text)) {
            return;
        } else {
            i5 = cue.windowColorSet ? cue.windowColor : captionStyleCompat.windowColor;
        }
        if (areCharSequencesEqual(this.cueText, cue.text) && androidx.media3.common.util.Util.areEqual(this.cueTextAlignment, cue.textAlignment) && this.cueBitmap == cue.bitmap && this.cueLine == cue.line && this.cueLineType == cue.lineType && androidx.media3.common.util.Util.areEqual(java.lang.Integer.valueOf(this.cueLineAnchor), java.lang.Integer.valueOf(cue.lineAnchor)) && this.cuePosition == cue.position && androidx.media3.common.util.Util.areEqual(java.lang.Integer.valueOf(this.cuePositionAnchor), java.lang.Integer.valueOf(cue.positionAnchor)) && this.cueSize == cue.size && this.cueBitmapHeight == cue.bitmapHeight && this.foregroundColor == captionStyleCompat.foregroundColor && this.backgroundColor == captionStyleCompat.backgroundColor && this.windowColor == i5 && this.edgeType == captionStyleCompat.edgeType && this.edgeColor == captionStyleCompat.edgeColor && androidx.media3.common.util.Util.areEqual(this.textPaint.getTypeface(), captionStyleCompat.typeface) && this.defaultTextSizePx == f && this.cueTextSizePx == f2 && this.bottomPaddingFraction == f3 && this.parentLeft == i && this.parentTop == i2 && this.parentRight == i3 && this.parentBottom == i4) {
            drawLayout(canvas, z);
            return;
        }
        this.cueText = cue.text;
        this.cueTextAlignment = cue.textAlignment;
        this.cueBitmap = cue.bitmap;
        this.cueLine = cue.line;
        this.cueLineType = cue.lineType;
        this.cueLineAnchor = cue.lineAnchor;
        this.cuePosition = cue.position;
        this.cuePositionAnchor = cue.positionAnchor;
        this.cueSize = cue.size;
        this.cueBitmapHeight = cue.bitmapHeight;
        this.foregroundColor = captionStyleCompat.foregroundColor;
        this.backgroundColor = captionStyleCompat.backgroundColor;
        this.windowColor = i5;
        this.edgeType = captionStyleCompat.edgeType;
        this.edgeColor = captionStyleCompat.edgeColor;
        this.textPaint.setTypeface(captionStyleCompat.typeface);
        this.defaultTextSizePx = f;
        this.cueTextSizePx = f2;
        this.bottomPaddingFraction = f3;
        this.parentLeft = i;
        this.parentTop = i2;
        this.parentRight = i3;
        this.parentBottom = i4;
        if (z) {
            androidx.media3.common.util.Assertions.checkNotNull(this.cueText);
            setupTextLayout();
        } else {
            androidx.media3.common.util.Assertions.checkNotNull(this.cueBitmap);
            setupBitmapLayout();
        }
        drawLayout(canvas, z);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueText"})
    private void setupTextLayout() {
        android.text.SpannableStringBuilder spannableStringBuilder;
        int i;
        int i2;
        int iMax;
        int iMin;
        int iRound;
        int i3;
        java.lang.CharSequence charSequence = this.cueText;
        if (charSequence instanceof android.text.SpannableStringBuilder) {
            spannableStringBuilder = (android.text.SpannableStringBuilder) charSequence;
        } else {
            spannableStringBuilder = new android.text.SpannableStringBuilder(this.cueText);
        }
        int i4 = this.parentRight - this.parentLeft;
        int i5 = this.parentBottom - this.parentTop;
        this.textPaint.setTextSize(this.defaultTextSizePx);
        int i6 = (int) ((this.defaultTextSizePx * INNER_PADDING_RATIO) + 0.5f);
        int i7 = i6 * 2;
        int i8 = i4 - i7;
        float f = this.cueSize;
        if (f != -3.4028235E38f) {
            i8 = (int) (i8 * f);
        }
        int i9 = i8;
        if (i9 <= 0) {
            androidx.media3.common.util.Log.w(TAG, "Skipped drawing subtitle cue (insufficient space)");
            return;
        }
        if (this.cueTextSizePx > 0.0f) {
            spannableStringBuilder.setSpan(new android.text.style.AbsoluteSizeSpan((int) this.cueTextSizePx), 0, spannableStringBuilder.length(), 16711680);
        }
        android.text.SpannableStringBuilder spannableStringBuilder2 = new android.text.SpannableStringBuilder(spannableStringBuilder);
        if (this.edgeType == 1) {
            for (android.text.style.ForegroundColorSpan foregroundColorSpan : (android.text.style.ForegroundColorSpan[]) spannableStringBuilder2.getSpans(0, spannableStringBuilder2.length(), android.text.style.ForegroundColorSpan.class)) {
                spannableStringBuilder2.removeSpan(foregroundColorSpan);
            }
        }
        if (android.graphics.Color.alpha(this.backgroundColor) > 0) {
            int i10 = this.edgeType;
            if (i10 == 0 || i10 == 2) {
                spannableStringBuilder.setSpan(new android.text.style.BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder.length(), 16711680);
            } else {
                spannableStringBuilder2.setSpan(new android.text.style.BackgroundColorSpan(this.backgroundColor), 0, spannableStringBuilder2.length(), 16711680);
            }
        }
        android.text.Layout.Alignment alignment = this.cueTextAlignment;
        if (alignment == null) {
            alignment = android.text.Layout.Alignment.ALIGN_CENTER;
        }
        android.text.Layout.Alignment alignment2 = alignment;
        android.text.StaticLayout staticLayout = new android.text.StaticLayout(spannableStringBuilder, this.textPaint, i9, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLayout = staticLayout;
        int height = staticLayout.getHeight();
        int lineCount = this.textLayout.getLineCount();
        int iMax2 = 0;
        for (int i11 = 0; i11 < lineCount; i11++) {
            iMax2 = java.lang.Math.max((int) java.lang.Math.ceil(this.textLayout.getLineWidth(i11)), iMax2);
        }
        if (this.cueSize == -3.4028235E38f || iMax2 >= i9) {
            i9 = iMax2;
        }
        int i12 = i9 + i7;
        float f2 = this.cuePosition;
        if (f2 != -3.4028235E38f) {
            int iRound2 = java.lang.Math.round(i4 * f2);
            int i13 = this.parentLeft;
            int i14 = iRound2 + i13;
            int i15 = this.cuePositionAnchor;
            i = 1;
            if (i15 != 1) {
                i2 = 2;
                if (i15 == 2) {
                    i14 -= i12;
                }
            } else {
                i2 = 2;
                i14 = ((i14 * 2) - i12) / 2;
            }
            iMax = java.lang.Math.max(i14, i13);
            iMin = java.lang.Math.min(i12 + iMax, this.parentRight);
        } else {
            i = 1;
            i2 = 2;
            iMax = ((i4 - i12) / 2) + this.parentLeft;
            iMin = iMax + i12;
        }
        int i16 = iMin - iMax;
        if (i16 <= 0) {
            androidx.media3.common.util.Log.w(TAG, "Skipped drawing subtitle cue (invalid horizontal positioning)");
            return;
        }
        float f3 = this.cueLine;
        if (f3 != -3.4028235E38f) {
            if (this.cueLineType == 0) {
                iRound = java.lang.Math.round(i5 * f3) + this.parentTop;
                int i17 = this.cueLineAnchor;
                if (i17 == i2) {
                    iRound -= height;
                } else if (i17 == i) {
                    iRound = ((iRound * 2) - height) / i2;
                }
            } else {
                int lineBottom = this.textLayout.getLineBottom(0) - this.textLayout.getLineTop(0);
                float f4 = this.cueLine;
                if (f4 >= 0.0f) {
                    iRound = java.lang.Math.round(f4 * lineBottom) + this.parentTop;
                } else {
                    iRound = java.lang.Math.round((f4 + 1.0f) * lineBottom) + this.parentBottom;
                    iRound -= height;
                }
            }
            int i18 = iRound + height;
            int i19 = this.parentBottom;
            if (i18 <= i19) {
                int i20 = this.parentTop;
                if (iRound < i20) {
                    i3 = i20;
                }
                this.textLayout = new android.text.StaticLayout(spannableStringBuilder, this.textPaint, i16, alignment2, this.spacingMult, this.spacingAdd, true);
                this.edgeLayout = new android.text.StaticLayout(spannableStringBuilder2, this.textPaint, i16, alignment2, this.spacingMult, this.spacingAdd, true);
                this.textLeft = iMax;
                this.textTop = i3;
                this.textPaddingX = i6;
            }
            iRound = i19 - height;
        } else {
            iRound = (this.parentBottom - height) - ((int) (i5 * this.bottomPaddingFraction));
        }
        i3 = iRound;
        this.textLayout = new android.text.StaticLayout(spannableStringBuilder, this.textPaint, i16, alignment2, this.spacingMult, this.spacingAdd, true);
        this.edgeLayout = new android.text.StaticLayout(spannableStringBuilder2, this.textPaint, i16, alignment2, this.spacingMult, this.spacingAdd, true);
        this.textLeft = iMax;
        this.textTop = i3;
        this.textPaddingX = i6;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0056  */
    /* JADX WARN: Code duplicated, block: B:16:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x005b  */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueBitmap"})
    private void setupBitmapLayout() {
        int iRound;
        float f;
        int i;
        float f2;
        android.graphics.Bitmap bitmap = this.cueBitmap;
        int i2 = this.parentRight;
        int i3 = this.parentLeft;
        int i4 = this.parentBottom;
        int i5 = this.parentTop;
        float f3 = i2 - i3;
        float f4 = i3 + (this.cuePosition * f3);
        float f5 = i4 - i5;
        float f6 = i5 + (this.cueLine * f5);
        int iRound2 = java.lang.Math.round(f3 * this.cueSize);
        float f7 = this.cueBitmapHeight;
        if (f7 != -3.4028235E38f) {
            iRound = java.lang.Math.round(f5 * f7);
        } else {
            iRound = java.lang.Math.round(iRound2 * (bitmap.getHeight() / bitmap.getWidth()));
        }
        int i6 = this.cuePositionAnchor;
        if (i6 != 2) {
            if (i6 == 1) {
                f = iRound2 / 2;
            }
            int iRound3 = java.lang.Math.round(f4);
            i = this.cueLineAnchor;
            if (i == 2) {
                if (i == 1) {
                    f2 = iRound / 2;
                }
                int iRound4 = java.lang.Math.round(f6);
                this.bitmapRect = new android.graphics.Rect(iRound3, iRound4, iRound2 + iRound3, iRound + iRound4);
            }
            f2 = iRound;
            f6 -= f2;
            int iRound5 = java.lang.Math.round(f6);
            this.bitmapRect = new android.graphics.Rect(iRound3, iRound5, iRound2 + iRound3, iRound + iRound5);
        }
        f = iRound2;
        f4 -= f;
        int iRound6 = java.lang.Math.round(f4);
        i = this.cueLineAnchor;
        if (i == 2) {
            if (i == 1) {
                f2 = iRound / 2;
            }
            int iRound7 = java.lang.Math.round(f6);
            this.bitmapRect = new android.graphics.Rect(iRound6, iRound7, iRound2 + iRound6, iRound + iRound7);
        }
        f2 = iRound;
        f6 -= f2;
        int iRound8 = java.lang.Math.round(f6);
        this.bitmapRect = new android.graphics.Rect(iRound6, iRound8, iRound2 + iRound6, iRound + iRound8);
    }

    private void drawLayout(android.graphics.Canvas canvas, boolean z) {
        if (z) {
            drawTextLayout(canvas);
            return;
        }
        androidx.media3.common.util.Assertions.checkNotNull(this.bitmapRect);
        androidx.media3.common.util.Assertions.checkNotNull(this.cueBitmap);
        drawBitmapLayout(canvas);
    }

    private void drawTextLayout(android.graphics.Canvas canvas) {
        android.text.StaticLayout staticLayout = this.textLayout;
        android.text.StaticLayout staticLayout2 = this.edgeLayout;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.textLeft, this.textTop);
        if (android.graphics.Color.alpha(this.windowColor) > 0) {
            this.windowPaint.setColor(this.windowColor);
            canvas.drawRect(-this.textPaddingX, 0.0f, staticLayout.getWidth() + this.textPaddingX, staticLayout.getHeight(), this.windowPaint);
        }
        int i = this.edgeType;
        if (i == 1) {
            this.textPaint.setStrokeJoin(android.graphics.Paint.Join.ROUND);
            this.textPaint.setStrokeWidth(this.outlineWidth);
            this.textPaint.setColor(this.edgeColor);
            this.textPaint.setStyle(android.graphics.Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i == 2) {
            android.text.TextPaint textPaint = this.textPaint;
            float f = this.shadowRadius;
            float f2 = this.shadowOffset;
            textPaint.setShadowLayer(f, f2, f2, this.edgeColor);
        } else if (i == 3 || i == 4) {
            boolean z = i == 3;
            int i2 = z ? -1 : this.edgeColor;
            int i3 = z ? this.edgeColor : -1;
            float f3 = this.shadowRadius / 2.0f;
            this.textPaint.setColor(this.foregroundColor);
            this.textPaint.setStyle(android.graphics.Paint.Style.FILL);
            float f4 = -f3;
            this.textPaint.setShadowLayer(this.shadowRadius, f4, f4, i2);
            staticLayout2.draw(canvas);
            this.textPaint.setShadowLayer(this.shadowRadius, f3, f3, i3);
        }
        this.textPaint.setColor(this.foregroundColor);
        this.textPaint.setStyle(android.graphics.Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.textPaint.setShadowLayer(0.0f, 0.0f, 0.0f, 0);
        canvas.restoreToCount(iSave);
    }

    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"cueBitmap", "bitmapRect"})
    private void drawBitmapLayout(android.graphics.Canvas canvas) {
        canvas.drawBitmap(this.cueBitmap, (android.graphics.Rect) null, this.bitmapRect, this.bitmapPaint);
    }

    private static boolean areCharSequencesEqual(java.lang.CharSequence charSequence, java.lang.CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }
}
