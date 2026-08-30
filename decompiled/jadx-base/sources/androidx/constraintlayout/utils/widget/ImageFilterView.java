package androidx.constraintlayout.utils.widget;

/* JADX INFO: loaded from: classes.dex */
public class ImageFilterView extends androidx.appcompat.widget.AppCompatImageView {
    private android.graphics.drawable.Drawable mAltDrawable;
    private float mCrossfade;
    private android.graphics.drawable.Drawable mDrawable;
    private androidx.constraintlayout.utils.widget.ImageFilterView.ImageMatrix mImageMatrix;
    android.graphics.drawable.LayerDrawable mLayer;
    android.graphics.drawable.Drawable[] mLayers;
    private boolean mOverlay;
    float mPanX;
    float mPanY;
    private android.graphics.Path mPath;
    android.graphics.RectF mRect;
    float mRotate;
    private float mRound;
    private float mRoundPercent;
    android.view.ViewOutlineProvider mViewOutlineProvider;
    float mZoom;

    static class ImageMatrix {
        float[] m = new float[20];
        android.graphics.ColorMatrix mColorMatrix = new android.graphics.ColorMatrix();
        android.graphics.ColorMatrix mTmpColorMatrix = new android.graphics.ColorMatrix();
        float mBrightness = 1.0f;
        float mSaturation = 1.0f;
        float mContrast = 1.0f;
        float mWarmth = 1.0f;

        ImageMatrix() {
        }

        private void saturation(float saturationStrength) {
            float f = 1.0f - saturationStrength;
            float f2 = 0.2999f * f;
            float f3 = 0.587f * f;
            float f4 = f * 0.114f;
            float[] fArr = this.m;
            fArr[0] = f2 + saturationStrength;
            fArr[1] = f3;
            fArr[2] = f4;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = f2;
            fArr[6] = f3 + saturationStrength;
            fArr[7] = f4;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = f2;
            fArr[11] = f3;
            fArr[12] = f4 + saturationStrength;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void warmth(float warmth) {
            float fLog;
            float fPow;
            float fLog2;
            if (warmth <= 0.0f) {
                warmth = 0.01f;
            }
            float f = (5000.0f / warmth) / 100.0f;
            if (f > 66.0f) {
                double d = f - 60.0f;
                fPow = ((float) java.lang.Math.pow(d, -0.13320475816726685d)) * 329.69873f;
                fLog = ((float) java.lang.Math.pow(d, 0.07551484555006027d)) * 288.12216f;
            } else {
                fLog = (((float) java.lang.Math.log(f)) * 99.4708f) - 161.11957f;
                fPow = 255.0f;
            }
            if (f < 66.0f) {
                fLog2 = f > 19.0f ? (((float) java.lang.Math.log(f - 10.0f)) * 138.51773f) - 305.0448f : 0.0f;
            } else {
                fLog2 = 255.0f;
            }
            float fMin = java.lang.Math.min(255.0f, java.lang.Math.max(fPow, 0.0f));
            float fMin2 = java.lang.Math.min(255.0f, java.lang.Math.max(fLog, 0.0f));
            float fMin3 = java.lang.Math.min(255.0f, java.lang.Math.max(fLog2, 0.0f));
            float fLog3 = (((float) java.lang.Math.log(50.0f)) * 99.4708f) - 161.11957f;
            float fLog4 = (((float) java.lang.Math.log(40.0f)) * 138.51773f) - 305.0448f;
            float fMin4 = java.lang.Math.min(255.0f, java.lang.Math.max(255.0f, 0.0f));
            float fMin5 = java.lang.Math.min(255.0f, java.lang.Math.max(fLog3, 0.0f));
            float fMin6 = fMin3 / java.lang.Math.min(255.0f, java.lang.Math.max(fLog4, 0.0f));
            float[] fArr = this.m;
            fArr[0] = fMin / fMin4;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = fMin2 / fMin5;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = fMin6;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        private void brightness(float brightness) {
            float[] fArr = this.m;
            fArr[0] = brightness;
            fArr[1] = 0.0f;
            fArr[2] = 0.0f;
            fArr[3] = 0.0f;
            fArr[4] = 0.0f;
            fArr[5] = 0.0f;
            fArr[6] = brightness;
            fArr[7] = 0.0f;
            fArr[8] = 0.0f;
            fArr[9] = 0.0f;
            fArr[10] = 0.0f;
            fArr[11] = 0.0f;
            fArr[12] = brightness;
            fArr[13] = 0.0f;
            fArr[14] = 0.0f;
            fArr[15] = 0.0f;
            fArr[16] = 0.0f;
            fArr[17] = 0.0f;
            fArr[18] = 1.0f;
            fArr[19] = 0.0f;
        }

        void updateMatrix(android.widget.ImageView view) {
            boolean z;
            this.mColorMatrix.reset();
            float f = this.mSaturation;
            boolean z2 = true;
            if (f != 1.0f) {
                saturation(f);
                this.mColorMatrix.set(this.m);
                z = true;
            } else {
                z = false;
            }
            float f2 = this.mContrast;
            if (f2 != 1.0f) {
                this.mTmpColorMatrix.setScale(f2, f2, f2, 1.0f);
                this.mColorMatrix.postConcat(this.mTmpColorMatrix);
                z = true;
            }
            float f3 = this.mWarmth;
            if (f3 != 1.0f) {
                warmth(f3);
                this.mTmpColorMatrix.set(this.m);
                this.mColorMatrix.postConcat(this.mTmpColorMatrix);
                z = true;
            }
            float f4 = this.mBrightness;
            if (f4 != 1.0f) {
                brightness(f4);
                this.mTmpColorMatrix.set(this.m);
                this.mColorMatrix.postConcat(this.mTmpColorMatrix);
            } else {
                z2 = z;
            }
            if (z2) {
                view.setColorFilter(new android.graphics.ColorMatrixColorFilter(this.mColorMatrix));
            } else {
                view.clearColorFilter();
            }
        }
    }

    public float getImagePanX() {
        return this.mPanX;
    }

    public float getImagePanY() {
        return this.mPanY;
    }

    public float getImageZoom() {
        return this.mZoom;
    }

    public float getImageRotate() {
        return this.mRotate;
    }

    public void setImagePanX(float pan) {
        this.mPanX = pan;
        updateViewMatrix();
    }

    public void setImagePanY(float pan) {
        this.mPanY = pan;
        updateViewMatrix();
    }

    public void setImageZoom(float zoom) {
        this.mZoom = zoom;
        updateViewMatrix();
    }

    public void setImageRotate(float rotation) {
        this.mRotate = rotation;
        updateViewMatrix();
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(android.graphics.drawable.Drawable drawable) {
        if (this.mAltDrawable != null && drawable != null) {
            android.graphics.drawable.Drawable drawableMutate = drawable.mutate();
            this.mDrawable = drawableMutate;
            android.graphics.drawable.Drawable[] drawableArr = this.mLayers;
            drawableArr[0] = drawableMutate;
            drawableArr[1] = this.mAltDrawable;
            android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(this.mLayers);
            this.mLayer = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.mCrossfade);
            return;
        }
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int resId) {
        if (this.mAltDrawable != null) {
            android.graphics.drawable.Drawable drawableMutate = androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), resId).mutate();
            this.mDrawable = drawableMutate;
            android.graphics.drawable.Drawable[] drawableArr = this.mLayers;
            drawableArr[0] = drawableMutate;
            drawableArr[1] = this.mAltDrawable;
            android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(this.mLayers);
            this.mLayer = layerDrawable;
            super.setImageDrawable(layerDrawable);
            setCrossfade(this.mCrossfade);
            return;
        }
        super.setImageResource(resId);
    }

    public void setAltImageResource(int resId) {
        android.graphics.drawable.Drawable drawableMutate = androidx.appcompat.content.res.AppCompatResources.getDrawable(getContext(), resId).mutate();
        this.mAltDrawable = drawableMutate;
        android.graphics.drawable.Drawable[] drawableArr = this.mLayers;
        drawableArr[0] = this.mDrawable;
        drawableArr[1] = drawableMutate;
        android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(this.mLayers);
        this.mLayer = layerDrawable;
        super.setImageDrawable(layerDrawable);
        setCrossfade(this.mCrossfade);
    }

    private void updateViewMatrix() {
        if (java.lang.Float.isNaN(this.mPanX) && java.lang.Float.isNaN(this.mPanY) && java.lang.Float.isNaN(this.mZoom) && java.lang.Float.isNaN(this.mRotate)) {
            setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        } else {
            setMatrix();
        }
    }

    private void setMatrix() {
        if (java.lang.Float.isNaN(this.mPanX) && java.lang.Float.isNaN(this.mPanY) && java.lang.Float.isNaN(this.mZoom) && java.lang.Float.isNaN(this.mRotate)) {
            return;
        }
        float f = java.lang.Float.isNaN(this.mPanX) ? 0.0f : this.mPanX;
        float f2 = java.lang.Float.isNaN(this.mPanY) ? 0.0f : this.mPanY;
        float f3 = java.lang.Float.isNaN(this.mZoom) ? 1.0f : this.mZoom;
        float f4 = java.lang.Float.isNaN(this.mRotate) ? 0.0f : this.mRotate;
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        matrix.reset();
        float intrinsicWidth = getDrawable().getIntrinsicWidth();
        float intrinsicHeight = getDrawable().getIntrinsicHeight();
        float width = getWidth();
        float height = getHeight();
        float f5 = f3 * (intrinsicWidth * height < intrinsicHeight * width ? width / intrinsicWidth : height / intrinsicHeight);
        matrix.postScale(f5, f5);
        float f6 = intrinsicWidth * f5;
        float f7 = f5 * intrinsicHeight;
        matrix.postTranslate((((f * (width - f6)) + width) - f6) * 0.5f, (((f2 * (height - f7)) + height) - f7) * 0.5f);
        matrix.postRotate(f4, width / 2.0f, height / 2.0f);
        setImageMatrix(matrix);
        setScaleType(android.widget.ImageView.ScaleType.MATRIX);
    }

    public ImageFilterView(android.content.Context context) {
        super(context);
        this.mImageMatrix = new androidx.constraintlayout.utils.widget.ImageFilterView.ImageMatrix();
        this.mOverlay = true;
        this.mAltDrawable = null;
        this.mDrawable = null;
        this.mCrossfade = 0.0f;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mLayers = new android.graphics.drawable.Drawable[2];
        this.mPanX = Float.NaN;
        this.mPanY = Float.NaN;
        this.mZoom = Float.NaN;
        this.mRotate = Float.NaN;
        init(context, null);
    }

    public ImageFilterView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        this.mImageMatrix = new androidx.constraintlayout.utils.widget.ImageFilterView.ImageMatrix();
        this.mOverlay = true;
        this.mAltDrawable = null;
        this.mDrawable = null;
        this.mCrossfade = 0.0f;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mLayers = new android.graphics.drawable.Drawable[2];
        this.mPanX = Float.NaN;
        this.mPanY = Float.NaN;
        this.mZoom = Float.NaN;
        this.mRotate = Float.NaN;
        init(context, attrs);
    }

    public ImageFilterView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        this.mImageMatrix = new androidx.constraintlayout.utils.widget.ImageFilterView.ImageMatrix();
        this.mOverlay = true;
        this.mAltDrawable = null;
        this.mDrawable = null;
        this.mCrossfade = 0.0f;
        this.mRoundPercent = 0.0f;
        this.mRound = Float.NaN;
        this.mLayers = new android.graphics.drawable.Drawable[2];
        this.mPanX = Float.NaN;
        this.mPanY = Float.NaN;
        this.mZoom = Float.NaN;
        this.mRotate = Float.NaN;
        init(context, attrs);
    }

    private void init(android.content.Context context, android.util.AttributeSet attrs) {
        if (attrs != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attrs, androidx.constraintlayout.widget.R.styleable.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            this.mAltDrawable = typedArrayObtainStyledAttributes.getDrawable(androidx.constraintlayout.widget.R.styleable.ImageFilterView_altSrc);
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_crossfade) {
                    this.mCrossfade = typedArrayObtainStyledAttributes.getFloat(index, 0.0f);
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_warmth) {
                    setWarmth(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_saturation) {
                    setSaturation(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_contrast) {
                    setContrast(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_brightness) {
                    setBrightness(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, 0.0f));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_overlay) {
                    setOverlay(typedArrayObtainStyledAttributes.getBoolean(index, this.mOverlay));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_imagePanX) {
                    setImagePanX(typedArrayObtainStyledAttributes.getFloat(index, this.mPanX));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_imagePanY) {
                    setImagePanY(typedArrayObtainStyledAttributes.getFloat(index, this.mPanY));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_imageRotate) {
                    setImageRotate(typedArrayObtainStyledAttributes.getFloat(index, this.mRotate));
                } else if (index == androidx.constraintlayout.widget.R.styleable.ImageFilterView_imageZoom) {
                    setImageZoom(typedArrayObtainStyledAttributes.getFloat(index, this.mZoom));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            android.graphics.drawable.Drawable drawable = getDrawable();
            this.mDrawable = drawable;
            if (this.mAltDrawable != null && drawable != null) {
                android.graphics.drawable.Drawable[] drawableArr = this.mLayers;
                android.graphics.drawable.Drawable drawableMutate = getDrawable().mutate();
                this.mDrawable = drawableMutate;
                drawableArr[0] = drawableMutate;
                this.mLayers[1] = this.mAltDrawable.mutate();
                android.graphics.drawable.LayerDrawable layerDrawable = new android.graphics.drawable.LayerDrawable(this.mLayers);
                this.mLayer = layerDrawable;
                layerDrawable.getDrawable(1).setAlpha((int) (this.mCrossfade * 255.0f));
                if (!this.mOverlay) {
                    this.mLayer.getDrawable(0).setAlpha((int) ((1.0f - this.mCrossfade) * 255.0f));
                }
                super.setImageDrawable(this.mLayer);
                return;
            }
            android.graphics.drawable.Drawable drawable2 = getDrawable();
            this.mDrawable = drawable2;
            if (drawable2 != null) {
                android.graphics.drawable.Drawable[] drawableArr2 = this.mLayers;
                android.graphics.drawable.Drawable drawableMutate2 = drawable2.mutate();
                this.mDrawable = drawableMutate2;
                drawableArr2[0] = drawableMutate2;
            }
        }
    }

    private void setOverlay(boolean overlay) {
        this.mOverlay = overlay;
    }

    public void setSaturation(float saturation) {
        this.mImageMatrix.mSaturation = saturation;
        this.mImageMatrix.updateMatrix(this);
    }

    public float getSaturation() {
        return this.mImageMatrix.mSaturation;
    }

    public void setContrast(float contrast) {
        this.mImageMatrix.mContrast = contrast;
        this.mImageMatrix.updateMatrix(this);
    }

    public float getContrast() {
        return this.mImageMatrix.mContrast;
    }

    public void setWarmth(float warmth) {
        this.mImageMatrix.mWarmth = warmth;
        this.mImageMatrix.updateMatrix(this);
    }

    public float getWarmth() {
        return this.mImageMatrix.mWarmth;
    }

    public void setCrossfade(float crossfade) {
        this.mCrossfade = crossfade;
        if (this.mLayers != null) {
            if (!this.mOverlay) {
                this.mLayer.getDrawable(0).setAlpha((int) ((1.0f - this.mCrossfade) * 255.0f));
            }
            this.mLayer.getDrawable(1).setAlpha((int) (this.mCrossfade * 255.0f));
            super.setImageDrawable(this.mLayer);
        }
    }

    public float getCrossfade() {
        return this.mCrossfade;
    }

    public void setBrightness(float brightness) {
        this.mImageMatrix.mBrightness = brightness;
        this.mImageMatrix.updateMatrix(this);
    }

    public float getBrightness() {
        return this.mImageMatrix.mBrightness;
    }

    public void setRoundPercent(float round) {
        boolean z = this.mRoundPercent != round;
        this.mRoundPercent = round;
        if (round != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new android.graphics.Path();
            }
            if (this.mRect == null) {
                this.mRect = new android.graphics.RectF();
            }
            if (this.mViewOutlineProvider == null) {
                android.view.ViewOutlineProvider viewOutlineProvider = new android.view.ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterView.1
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(android.view.View view, android.graphics.Outline outline) {
                        int width = androidx.constraintlayout.utils.widget.ImageFilterView.this.getWidth();
                        int height = androidx.constraintlayout.utils.widget.ImageFilterView.this.getHeight();
                        outline.setRoundRect(0, 0, width, height, (java.lang.Math.min(width, height) * androidx.constraintlayout.utils.widget.ImageFilterView.this.mRoundPercent) / 2.0f);
                    }
                };
                this.mViewOutlineProvider = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (java.lang.Math.min(width, height) * this.mRoundPercent) / 2.0f;
            this.mRect.set(0.0f, 0.0f, width, height);
            this.mPath.reset();
            this.mPath.addRoundRect(this.mRect, fMin, fMin, android.graphics.Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRound(float round) {
        if (java.lang.Float.isNaN(round)) {
            this.mRound = round;
            float f = this.mRoundPercent;
            this.mRoundPercent = -1.0f;
            setRoundPercent(f);
            return;
        }
        boolean z = this.mRound != round;
        this.mRound = round;
        if (round != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new android.graphics.Path();
            }
            if (this.mRect == null) {
                this.mRect = new android.graphics.RectF();
            }
            if (this.mViewOutlineProvider == null) {
                android.view.ViewOutlineProvider viewOutlineProvider = new android.view.ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.ImageFilterView.2
                    @Override // android.view.ViewOutlineProvider
                    public void getOutline(android.view.View view, android.graphics.Outline outline) {
                        outline.setRoundRect(0, 0, androidx.constraintlayout.utils.widget.ImageFilterView.this.getWidth(), androidx.constraintlayout.utils.widget.ImageFilterView.this.getHeight(), androidx.constraintlayout.utils.widget.ImageFilterView.this.mRound);
                    }
                };
                this.mViewOutlineProvider = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.mRect.set(0.0f, 0.0f, getWidth(), getHeight());
            this.mPath.reset();
            android.graphics.Path path = this.mPath;
            android.graphics.RectF rectF = this.mRect;
            float f2 = this.mRound;
            path.addRoundRect(rectF, f2, f2, android.graphics.Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public float getRoundPercent() {
        return this.mRoundPercent;
    }

    public float getRound() {
        return this.mRound;
    }

    @Override // android.view.View
    public void draw(android.graphics.Canvas canvas) {
        super.draw(canvas);
    }

    @Override // android.view.View
    public void layout(int l, int t, int r, int b) {
        super.layout(l, t, r, b);
        setMatrix();
    }
}
