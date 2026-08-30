package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes3.dex */
public class VectorDrawableCompat extends androidx.vectordrawable.graphics.drawable.VectorDrawableCommon {
    private static final boolean DBG_VECTOR_DRAWABLE = false;
    static final android.graphics.PorterDuff.Mode DEFAULT_TINT_MODE = android.graphics.PorterDuff.Mode.SRC_IN;
    private static final int LINECAP_BUTT = 0;
    private static final int LINECAP_ROUND = 1;
    private static final int LINECAP_SQUARE = 2;
    private static final int LINEJOIN_BEVEL = 2;
    private static final int LINEJOIN_MITER = 0;
    private static final int LINEJOIN_ROUND = 1;
    static final java.lang.String LOGTAG = "VectorDrawableCompat";
    private static final int MAX_CACHED_BITMAP_SIZE = 2048;
    private static final java.lang.String SHAPE_CLIP_PATH = "clip-path";
    private static final java.lang.String SHAPE_GROUP = "group";
    private static final java.lang.String SHAPE_PATH = "path";
    private static final java.lang.String SHAPE_VECTOR = "vector";
    private boolean mAllowCaching;
    private android.graphics.drawable.Drawable.ConstantState mCachedConstantStateDelegate;
    private android.graphics.ColorFilter mColorFilter;
    private boolean mMutated;
    private android.graphics.PorterDuffColorFilter mTintFilter;
    private final android.graphics.Rect mTmpBounds;
    private final float[] mTmpFloats;
    private final android.graphics.Matrix mTmpMatrix;
    private androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState mVectorState;

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(android.content.res.Resources.Theme theme) {
        super.applyTheme(theme);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.drawable.Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(android.graphics.Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ android.graphics.Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, android.graphics.PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    VectorDrawableCompat() {
        this.mAllowCaching = true;
        this.mTmpFloats = new float[9];
        this.mTmpMatrix = new android.graphics.Matrix();
        this.mTmpBounds = new android.graphics.Rect();
        this.mVectorState = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState();
    }

    VectorDrawableCompat(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState) {
        this.mAllowCaching = true;
        this.mTmpFloats = new float[9];
        this.mTmpMatrix = new android.graphics.Matrix();
        this.mTmpBounds = new android.graphics.Rect();
        this.mVectorState = vectorDrawableCompatState;
        this.mTintFilter = updateTintFilter(this.mTintFilter, vectorDrawableCompatState.mTint, vectorDrawableCompatState.mTintMode);
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.mutate();
            return this;
        }
        if (!this.mMutated && super.mutate() == this) {
            this.mVectorState = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState(this.mVectorState);
            this.mMutated = true;
        }
        return this;
    }

    java.lang.Object getTargetByName(java.lang.String str) {
        return this.mVectorState.mVPathRenderer.mVGTargetsMap.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        if (this.mDelegateDrawable != null) {
            return new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableDelegateState(this.mDelegateDrawable.getConstantState());
        }
        this.mVectorState.mChangingConfigurations = getChangingConfigurations();
        return this.mVectorState;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.draw(canvas);
            return;
        }
        copyBounds(this.mTmpBounds);
        if (this.mTmpBounds.width() <= 0 || this.mTmpBounds.height() <= 0) {
            return;
        }
        android.graphics.ColorFilter colorFilter = this.mColorFilter;
        if (colorFilter == null) {
            colorFilter = this.mTintFilter;
        }
        canvas.getMatrix(this.mTmpMatrix);
        this.mTmpMatrix.getValues(this.mTmpFloats);
        float fAbs = java.lang.Math.abs(this.mTmpFloats[0]);
        float fAbs2 = java.lang.Math.abs(this.mTmpFloats[4]);
        float fAbs3 = java.lang.Math.abs(this.mTmpFloats[1]);
        float fAbs4 = java.lang.Math.abs(this.mTmpFloats[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.mTmpBounds.width() * fAbs);
        int iHeight = (int) (this.mTmpBounds.height() * fAbs2);
        int iMin = java.lang.Math.min(2048, iWidth);
        int iMin2 = java.lang.Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        canvas.translate(this.mTmpBounds.left, this.mTmpBounds.top);
        if (needMirroring()) {
            canvas.translate(this.mTmpBounds.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.mTmpBounds.offsetTo(0, 0);
        this.mVectorState.createCachedBitmapIfNeeded(iMin, iMin2);
        if (!this.mAllowCaching) {
            this.mVectorState.updateCachedBitmap(iMin, iMin2);
        } else if (!this.mVectorState.canReuseCache()) {
            this.mVectorState.updateCachedBitmap(iMin, iMin2);
            this.mVectorState.updateCacheStates();
        }
        this.mVectorState.drawCachedBitmapWithRootAlpha(canvas, colorFilter, this.mTmpBounds);
        canvas.restoreToCount(iSave);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        if (this.mDelegateDrawable != null) {
            return androidx.core.graphics.drawable.DrawableCompat.getAlpha(this.mDelegateDrawable);
        }
        return this.mVectorState.mVPathRenderer.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.setAlpha(i);
        } else if (this.mVectorState.mVPathRenderer.getRootAlpha() != i) {
            this.mVectorState.mVPathRenderer.setRootAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.setColorFilter(colorFilter);
        } else {
            this.mColorFilter = colorFilter;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
        if (this.mDelegateDrawable != null) {
            return androidx.core.graphics.drawable.DrawableCompat.getColorFilter(this.mDelegateDrawable);
        }
        return this.mColorFilter;
    }

    android.graphics.PorterDuffColorFilter updateTintFilter(android.graphics.PorterDuffColorFilter porterDuffColorFilter, android.content.res.ColorStateList colorStateList, android.graphics.PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new android.graphics.PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        if (this.mDelegateDrawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTint(this.mDelegateDrawable, i);
        } else {
            setTintList(android.content.res.ColorStateList.valueOf(i));
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        if (this.mDelegateDrawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTintList(this.mDelegateDrawable, colorStateList);
            return;
        }
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        if (vectorDrawableCompatState.mTint != colorStateList) {
            vectorDrawableCompatState.mTint = colorStateList;
            this.mTintFilter = updateTintFilter(this.mTintFilter, colorStateList, vectorDrawableCompatState.mTintMode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.mDelegateDrawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(this.mDelegateDrawable, mode);
            return;
        }
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        if (vectorDrawableCompatState.mTintMode != mode) {
            vectorDrawableCompatState.mTintMode = mode;
            this.mTintFilter = updateTintFilter(this.mTintFilter, vectorDrawableCompatState.mTint, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState;
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.isStateful();
        }
        return super.isStateful() || ((vectorDrawableCompatState = this.mVectorState) != null && (vectorDrawableCompatState.isStateful() || (this.mVectorState.mTint != null && this.mVectorState.mTint.isStateful())));
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z;
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.setState(iArr);
        }
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        if (vectorDrawableCompatState.mTint == null || vectorDrawableCompatState.mTintMode == null) {
            z = false;
        } else {
            this.mTintFilter = updateTintFilter(this.mTintFilter, vectorDrawableCompatState.mTint, vectorDrawableCompatState.mTintMode);
            invalidateSelf();
            z = true;
        }
        if (!vectorDrawableCompatState.isStateful() || !vectorDrawableCompatState.onStateChanged(iArr)) {
            return z;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.getOpacity();
        }
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.getIntrinsicWidth();
        }
        return (int) this.mVectorState.mVPathRenderer.mBaseWidth;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.getIntrinsicHeight();
        }
        return (int) this.mVectorState.mVPathRenderer.mBaseHeight;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.mDelegateDrawable == null) {
            return false;
        }
        androidx.core.graphics.drawable.DrawableCompat.canApplyTheme(this.mDelegateDrawable);
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.mDelegateDrawable != null) {
            return androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(this.mDelegateDrawable);
        }
        return this.mVectorState.mAutoMirrored;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.mDelegateDrawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(this.mDelegateDrawable, z);
        } else {
            this.mVectorState.mAutoMirrored = z;
        }
    }

    public float getPixelSize() {
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        if (vectorDrawableCompatState == null || vectorDrawableCompatState.mVPathRenderer == null || this.mVectorState.mVPathRenderer.mBaseWidth == 0.0f || this.mVectorState.mVPathRenderer.mBaseHeight == 0.0f || this.mVectorState.mVPathRenderer.mViewportHeight == 0.0f || this.mVectorState.mVPathRenderer.mViewportWidth == 0.0f) {
            return 1.0f;
        }
        float f = this.mVectorState.mVPathRenderer.mBaseWidth;
        float f2 = this.mVectorState.mVPathRenderer.mBaseHeight;
        return java.lang.Math.min(this.mVectorState.mVPathRenderer.mViewportWidth / f, this.mVectorState.mVPathRenderer.mViewportHeight / f2);
    }

    public static androidx.vectordrawable.graphics.drawable.VectorDrawableCompat create(android.content.res.Resources resources, int i, android.content.res.Resources.Theme theme) {
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat vectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat();
        vectorDrawableCompat.mDelegateDrawable = androidx.core.content.res.ResourcesCompat.getDrawable(resources, i, theme);
        vectorDrawableCompat.mCachedConstantStateDelegate = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableDelegateState(vectorDrawableCompat.mDelegateDrawable.getConstantState());
        return vectorDrawableCompat;
    }

    public static androidx.vectordrawable.graphics.drawable.VectorDrawableCompat createFromXmlInner(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat vectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat();
        vectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return vectorDrawableCompat;
    }

    static int applyAlpha(int i, float f) {
        return (i & androidx.core.view.ViewCompat.MEASURED_SIZE_MASK) | (((int) (android.graphics.Color.alpha(i) * f)) << 24);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        if (this.mDelegateDrawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.inflate(this.mDelegateDrawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        vectorDrawableCompatState.mVPathRenderer = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer();
        android.content.res.TypedArray typedArrayObtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_VECTOR_DRAWABLE_TYPE_ARRAY);
        updateStateFromTypedArray(typedArrayObtainAttributes, xmlPullParser, theme);
        typedArrayObtainAttributes.recycle();
        vectorDrawableCompatState.mChangingConfigurations = getChangingConfigurations();
        vectorDrawableCompatState.mCacheDirty = true;
        inflateInternal(resources, xmlPullParser, attributeSet, theme);
        this.mTintFilter = updateTintFilter(this.mTintFilter, vectorDrawableCompatState.mTint, vectorDrawableCompatState.mTintMode);
    }

    private static android.graphics.PorterDuff.Mode parseTintModeCompat(int i, android.graphics.PorterDuff.Mode mode) {
        if (i == 3) {
            return android.graphics.PorterDuff.Mode.SRC_OVER;
        }
        if (i == 5) {
            return android.graphics.PorterDuff.Mode.SRC_IN;
        }
        if (i == 9) {
            return android.graphics.PorterDuff.Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return android.graphics.PorterDuff.Mode.MULTIPLY;
            case 15:
                return android.graphics.PorterDuff.Mode.SCREEN;
            case 16:
                return android.graphics.PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void updateStateFromTypedArray(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException {
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer vPathRenderer = vectorDrawableCompatState.mVPathRenderer;
        vectorDrawableCompatState.mTintMode = parseTintModeCompat(androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "tintMode", 6, -1), android.graphics.PorterDuff.Mode.SRC_IN);
        android.content.res.ColorStateList namedColorStateList = androidx.core.content.res.TypedArrayUtils.getNamedColorStateList(typedArray, xmlPullParser, theme, "tint", 1);
        if (namedColorStateList != null) {
            vectorDrawableCompatState.mTint = namedColorStateList;
        }
        vectorDrawableCompatState.mAutoMirrored = androidx.core.content.res.TypedArrayUtils.getNamedBoolean(typedArray, xmlPullParser, "autoMirrored", 5, vectorDrawableCompatState.mAutoMirrored);
        vPathRenderer.mViewportWidth = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "viewportWidth", 7, vPathRenderer.mViewportWidth);
        vPathRenderer.mViewportHeight = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "viewportHeight", 8, vPathRenderer.mViewportHeight);
        if (vPathRenderer.mViewportWidth <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (vPathRenderer.mViewportHeight <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        vPathRenderer.mBaseWidth = typedArray.getDimension(3, vPathRenderer.mBaseWidth);
        vPathRenderer.mBaseHeight = typedArray.getDimension(2, vPathRenderer.mBaseHeight);
        if (vPathRenderer.mBaseWidth <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (vPathRenderer.mBaseHeight <= 0.0f) {
            throw new org.xmlpull.v1.XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        vPathRenderer.setAlpha(androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "alpha", 4, vPathRenderer.getAlpha()));
        java.lang.String string = typedArray.getString(0);
        if (string != null) {
            vPathRenderer.mRootName = string;
            vPathRenderer.mVGTargetsMap.put(string, vPathRenderer);
        }
    }

    private void inflateInternal(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState = this.mVectorState;
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer vPathRenderer = vectorDrawableCompatState.mVPathRenderer;
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        arrayDeque.push(vPathRenderer.mRootGroup);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                java.lang.String name = xmlPullParser.getName();
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup vGroup = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) arrayDeque.peek();
                if ("path".equals(name)) {
                    androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath vFullPath = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath();
                    vFullPath.inflate(resources, attributeSet, theme, xmlPullParser);
                    vGroup.mChildren.add(vFullPath);
                    if (vFullPath.getPathName() != null) {
                        vPathRenderer.mVGTargetsMap.put(vFullPath.getPathName(), vFullPath);
                    }
                    vectorDrawableCompatState.mChangingConfigurations = vFullPath.mChangingConfigurations | vectorDrawableCompatState.mChangingConfigurations;
                    z = false;
                } else if (SHAPE_CLIP_PATH.equals(name)) {
                    androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath vClipPath = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath();
                    vClipPath.inflate(resources, attributeSet, theme, xmlPullParser);
                    vGroup.mChildren.add(vClipPath);
                    if (vClipPath.getPathName() != null) {
                        vPathRenderer.mVGTargetsMap.put(vClipPath.getPathName(), vClipPath);
                    }
                    vectorDrawableCompatState.mChangingConfigurations = vClipPath.mChangingConfigurations | vectorDrawableCompatState.mChangingConfigurations;
                } else if (SHAPE_GROUP.equals(name)) {
                    androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup vGroup2 = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup();
                    vGroup2.inflate(resources, attributeSet, theme, xmlPullParser);
                    vGroup.mChildren.add(vGroup2);
                    arrayDeque.push(vGroup2);
                    if (vGroup2.getGroupName() != null) {
                        vPathRenderer.mVGTargetsMap.put(vGroup2.getGroupName(), vGroup2);
                    }
                    vectorDrawableCompatState.mChangingConfigurations = vGroup2.mChangingConfigurations | vectorDrawableCompatState.mChangingConfigurations;
                }
            } else if (eventType == 3 && SHAPE_GROUP.equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z) {
            throw new org.xmlpull.v1.XmlPullParserException("no path defined");
        }
    }

    private void printGroupTree(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup vGroup, int i) {
        java.lang.String str = "";
        for (int i2 = 0; i2 < i; i2++) {
            str = str + "    ";
        }
        android.util.Log.v(LOGTAG, str + "current group is :" + vGroup.getGroupName() + " rotation is " + vGroup.mRotate);
        android.util.Log.v(LOGTAG, str + "matrix is :" + vGroup.getLocalMatrix().toString());
        for (int i3 = 0; i3 < vGroup.mChildren.size(); i3++) {
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject vObject = vGroup.mChildren.get(i3);
            if (vObject instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) {
                printGroupTree((androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) vObject, i + 1);
            } else {
                ((androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath) vObject).printVPath(i + 1);
            }
        }
    }

    void setAllowCaching(boolean z) {
        this.mAllowCaching = z;
    }

    private boolean needMirroring() {
        return isAutoMirrored() && androidx.core.graphics.drawable.DrawableCompat.getLayoutDirection(this) == 1;
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.mVectorState.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(java.lang.Runnable runnable, long j) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.scheduleSelf(runnable, j);
        } else {
            super.scheduleSelf(runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(java.lang.Runnable runnable) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    private static class VectorDrawableDelegateState extends android.graphics.drawable.Drawable.ConstantState {
        private final android.graphics.drawable.Drawable.ConstantState mDelegateState;

        public VectorDrawableDelegateState(android.graphics.drawable.Drawable.ConstantState constantState) {
            this.mDelegateState = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat vectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat();
            vectorDrawableCompat.mDelegateDrawable = (android.graphics.drawable.VectorDrawable) this.mDelegateState.newDrawable();
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat vectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat();
            vectorDrawableCompat.mDelegateDrawable = (android.graphics.drawable.VectorDrawable) this.mDelegateState.newDrawable(resources);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat vectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat();
            vectorDrawableCompat.mDelegateDrawable = (android.graphics.drawable.VectorDrawable) this.mDelegateState.newDrawable(resources, theme);
            return vectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.mDelegateState.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.mDelegateState.getChangingConfigurations();
        }
    }

    private static class VectorDrawableCompatState extends android.graphics.drawable.Drawable.ConstantState {
        boolean mAutoMirrored;
        boolean mCacheDirty;
        boolean mCachedAutoMirrored;
        android.graphics.Bitmap mCachedBitmap;
        int mCachedRootAlpha;
        int[] mCachedThemeAttrs;
        android.content.res.ColorStateList mCachedTint;
        android.graphics.PorterDuff.Mode mCachedTintMode;
        int mChangingConfigurations;
        android.graphics.Paint mTempPaint;
        android.content.res.ColorStateList mTint;
        android.graphics.PorterDuff.Mode mTintMode;
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer mVPathRenderer;

        public VectorDrawableCompatState(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VectorDrawableCompatState vectorDrawableCompatState) {
            this.mTint = null;
            this.mTintMode = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.DEFAULT_TINT_MODE;
            if (vectorDrawableCompatState != null) {
                this.mChangingConfigurations = vectorDrawableCompatState.mChangingConfigurations;
                this.mVPathRenderer = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer(vectorDrawableCompatState.mVPathRenderer);
                if (vectorDrawableCompatState.mVPathRenderer.mFillPaint != null) {
                    this.mVPathRenderer.mFillPaint = new android.graphics.Paint(vectorDrawableCompatState.mVPathRenderer.mFillPaint);
                }
                if (vectorDrawableCompatState.mVPathRenderer.mStrokePaint != null) {
                    this.mVPathRenderer.mStrokePaint = new android.graphics.Paint(vectorDrawableCompatState.mVPathRenderer.mStrokePaint);
                }
                this.mTint = vectorDrawableCompatState.mTint;
                this.mTintMode = vectorDrawableCompatState.mTintMode;
                this.mAutoMirrored = vectorDrawableCompatState.mAutoMirrored;
            }
        }

        public void drawCachedBitmapWithRootAlpha(android.graphics.Canvas canvas, android.graphics.ColorFilter colorFilter, android.graphics.Rect rect) {
            canvas.drawBitmap(this.mCachedBitmap, (android.graphics.Rect) null, rect, getPaint(colorFilter));
        }

        public boolean hasTranslucentRoot() {
            return this.mVPathRenderer.getRootAlpha() < 255;
        }

        public android.graphics.Paint getPaint(android.graphics.ColorFilter colorFilter) {
            if (!hasTranslucentRoot() && colorFilter == null) {
                return null;
            }
            if (this.mTempPaint == null) {
                android.graphics.Paint paint = new android.graphics.Paint();
                this.mTempPaint = paint;
                paint.setFilterBitmap(true);
            }
            this.mTempPaint.setAlpha(this.mVPathRenderer.getRootAlpha());
            this.mTempPaint.setColorFilter(colorFilter);
            return this.mTempPaint;
        }

        public void updateCachedBitmap(int i, int i2) {
            this.mCachedBitmap.eraseColor(0);
            this.mVPathRenderer.draw(new android.graphics.Canvas(this.mCachedBitmap), i, i2, null);
        }

        public void createCachedBitmapIfNeeded(int i, int i2) {
            if (this.mCachedBitmap == null || !canReuseBitmap(i, i2)) {
                this.mCachedBitmap = android.graphics.Bitmap.createBitmap(i, i2, android.graphics.Bitmap.Config.ARGB_8888);
                this.mCacheDirty = true;
            }
        }

        public boolean canReuseBitmap(int i, int i2) {
            return i == this.mCachedBitmap.getWidth() && i2 == this.mCachedBitmap.getHeight();
        }

        public boolean canReuseCache() {
            return !this.mCacheDirty && this.mCachedTint == this.mTint && this.mCachedTintMode == this.mTintMode && this.mCachedAutoMirrored == this.mAutoMirrored && this.mCachedRootAlpha == this.mVPathRenderer.getRootAlpha();
        }

        public void updateCacheStates() {
            this.mCachedTint = this.mTint;
            this.mCachedTintMode = this.mTintMode;
            this.mCachedRootAlpha = this.mVPathRenderer.getRootAlpha();
            this.mCachedAutoMirrored = this.mAutoMirrored;
            this.mCacheDirty = false;
        }

        public VectorDrawableCompatState() {
            this.mTint = null;
            this.mTintMode = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.DEFAULT_TINT_MODE;
            this.mVPathRenderer = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            return new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            return new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.mChangingConfigurations;
        }

        public boolean isStateful() {
            return this.mVPathRenderer.isStateful();
        }

        public boolean onStateChanged(int[] iArr) {
            boolean zOnStateChanged = this.mVPathRenderer.onStateChanged(iArr);
            this.mCacheDirty |= zOnStateChanged;
            return zOnStateChanged;
        }
    }

    private static class VPathRenderer {
        private static final android.graphics.Matrix IDENTITY_MATRIX = new android.graphics.Matrix();
        float mBaseHeight;
        float mBaseWidth;
        private int mChangingConfigurations;
        android.graphics.Paint mFillPaint;
        private final android.graphics.Matrix mFinalPathMatrix;
        java.lang.Boolean mIsStateful;
        private final android.graphics.Path mPath;
        private android.graphics.PathMeasure mPathMeasure;
        private final android.graphics.Path mRenderPath;
        int mRootAlpha;
        final androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup mRootGroup;
        java.lang.String mRootName;
        android.graphics.Paint mStrokePaint;
        final androidx.collection.ArrayMap<java.lang.String, java.lang.Object> mVGTargetsMap;
        float mViewportHeight;
        float mViewportWidth;

        private static float cross(float f, float f2, float f3, float f4) {
            return (f * f4) - (f2 * f3);
        }

        public VPathRenderer() {
            this.mFinalPathMatrix = new android.graphics.Matrix();
            this.mBaseWidth = 0.0f;
            this.mBaseHeight = 0.0f;
            this.mViewportWidth = 0.0f;
            this.mViewportHeight = 0.0f;
            this.mRootAlpha = 255;
            this.mRootName = null;
            this.mIsStateful = null;
            this.mVGTargetsMap = new androidx.collection.ArrayMap<>();
            this.mRootGroup = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup();
            this.mPath = new android.graphics.Path();
            this.mRenderPath = new android.graphics.Path();
        }

        public void setRootAlpha(int i) {
            this.mRootAlpha = i;
        }

        public int getRootAlpha() {
            return this.mRootAlpha;
        }

        public void setAlpha(float f) {
            setRootAlpha((int) (f * 255.0f));
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public VPathRenderer(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPathRenderer vPathRenderer) {
            this.mFinalPathMatrix = new android.graphics.Matrix();
            this.mBaseWidth = 0.0f;
            this.mBaseHeight = 0.0f;
            this.mViewportWidth = 0.0f;
            this.mViewportHeight = 0.0f;
            this.mRootAlpha = 255;
            this.mRootName = null;
            this.mIsStateful = null;
            androidx.collection.ArrayMap<java.lang.String, java.lang.Object> arrayMap = new androidx.collection.ArrayMap<>();
            this.mVGTargetsMap = arrayMap;
            this.mRootGroup = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup(vPathRenderer.mRootGroup, arrayMap);
            this.mPath = new android.graphics.Path(vPathRenderer.mPath);
            this.mRenderPath = new android.graphics.Path(vPathRenderer.mRenderPath);
            this.mBaseWidth = vPathRenderer.mBaseWidth;
            this.mBaseHeight = vPathRenderer.mBaseHeight;
            this.mViewportWidth = vPathRenderer.mViewportWidth;
            this.mViewportHeight = vPathRenderer.mViewportHeight;
            this.mChangingConfigurations = vPathRenderer.mChangingConfigurations;
            this.mRootAlpha = vPathRenderer.mRootAlpha;
            this.mRootName = vPathRenderer.mRootName;
            java.lang.String str = vPathRenderer.mRootName;
            if (str != null) {
                arrayMap.put(str, this);
            }
            this.mIsStateful = vPathRenderer.mIsStateful;
        }

        private void drawGroupTree(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup vGroup, android.graphics.Matrix matrix, android.graphics.Canvas canvas, int i, int i2, android.graphics.ColorFilter colorFilter) {
            vGroup.mStackedMatrix.set(matrix);
            vGroup.mStackedMatrix.preConcat(vGroup.mLocalMatrix);
            canvas.save();
            for (int i3 = 0; i3 < vGroup.mChildren.size(); i3++) {
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject vObject = vGroup.mChildren.get(i3);
                if (vObject instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) {
                    drawGroupTree((androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) vObject, vGroup.mStackedMatrix, canvas, i, i2, colorFilter);
                } else if (vObject instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath) {
                    drawPath(vGroup, (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath) vObject, canvas, i, i2, colorFilter);
                }
            }
            canvas.restore();
        }

        public void draw(android.graphics.Canvas canvas, int i, int i2, android.graphics.ColorFilter colorFilter) {
            drawGroupTree(this.mRootGroup, IDENTITY_MATRIX, canvas, i, i2, colorFilter);
        }

        private void drawPath(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup vGroup, androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath vPath, android.graphics.Canvas canvas, int i, int i2, android.graphics.ColorFilter colorFilter) {
            float f = i / this.mViewportWidth;
            float f2 = i2 / this.mViewportHeight;
            float fMin = java.lang.Math.min(f, f2);
            android.graphics.Matrix matrix = vGroup.mStackedMatrix;
            this.mFinalPathMatrix.set(matrix);
            this.mFinalPathMatrix.postScale(f, f2);
            float matrixScale = getMatrixScale(matrix);
            if (matrixScale == 0.0f) {
                return;
            }
            vPath.toPath(this.mPath);
            android.graphics.Path path = this.mPath;
            this.mRenderPath.reset();
            if (vPath.isClipPath()) {
                this.mRenderPath.setFillType(vPath.mFillRule == 0 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                this.mRenderPath.addPath(path, this.mFinalPathMatrix);
                canvas.clipPath(this.mRenderPath);
                return;
            }
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath vFullPath = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath) vPath;
            if (vFullPath.mTrimPathStart != 0.0f || vFullPath.mTrimPathEnd != 1.0f) {
                float f3 = (vFullPath.mTrimPathStart + vFullPath.mTrimPathOffset) % 1.0f;
                float f4 = (vFullPath.mTrimPathEnd + vFullPath.mTrimPathOffset) % 1.0f;
                if (this.mPathMeasure == null) {
                    this.mPathMeasure = new android.graphics.PathMeasure();
                }
                this.mPathMeasure.setPath(this.mPath, false);
                float length = this.mPathMeasure.getLength();
                float f5 = f3 * length;
                float f6 = f4 * length;
                path.reset();
                if (f5 > f6) {
                    this.mPathMeasure.getSegment(f5, length, path, true);
                    this.mPathMeasure.getSegment(0.0f, f6, path, true);
                } else {
                    this.mPathMeasure.getSegment(f5, f6, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.mRenderPath.addPath(path, this.mFinalPathMatrix);
            if (vFullPath.mFillColor.willDraw()) {
                androidx.core.content.res.ComplexColorCompat complexColorCompat = vFullPath.mFillColor;
                if (this.mFillPaint == null) {
                    android.graphics.Paint paint = new android.graphics.Paint(1);
                    this.mFillPaint = paint;
                    paint.setStyle(android.graphics.Paint.Style.FILL);
                }
                android.graphics.Paint paint2 = this.mFillPaint;
                if (complexColorCompat.isGradient()) {
                    android.graphics.Shader shader = complexColorCompat.getShader();
                    shader.setLocalMatrix(this.mFinalPathMatrix);
                    paint2.setShader(shader);
                    paint2.setAlpha(java.lang.Math.round(vFullPath.mFillAlpha * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(255);
                    paint2.setColor(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.applyAlpha(complexColorCompat.getColor(), vFullPath.mFillAlpha));
                }
                paint2.setColorFilter(colorFilter);
                this.mRenderPath.setFillType(vFullPath.mFillRule == 0 ? android.graphics.Path.FillType.WINDING : android.graphics.Path.FillType.EVEN_ODD);
                canvas.drawPath(this.mRenderPath, paint2);
            }
            if (vFullPath.mStrokeColor.willDraw()) {
                androidx.core.content.res.ComplexColorCompat complexColorCompat2 = vFullPath.mStrokeColor;
                if (this.mStrokePaint == null) {
                    android.graphics.Paint paint3 = new android.graphics.Paint(1);
                    this.mStrokePaint = paint3;
                    paint3.setStyle(android.graphics.Paint.Style.STROKE);
                }
                android.graphics.Paint paint4 = this.mStrokePaint;
                if (vFullPath.mStrokeLineJoin != null) {
                    paint4.setStrokeJoin(vFullPath.mStrokeLineJoin);
                }
                if (vFullPath.mStrokeLineCap != null) {
                    paint4.setStrokeCap(vFullPath.mStrokeLineCap);
                }
                paint4.setStrokeMiter(vFullPath.mStrokeMiterlimit);
                if (complexColorCompat2.isGradient()) {
                    android.graphics.Shader shader2 = complexColorCompat2.getShader();
                    shader2.setLocalMatrix(this.mFinalPathMatrix);
                    paint4.setShader(shader2);
                    paint4.setAlpha(java.lang.Math.round(vFullPath.mStrokeAlpha * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(255);
                    paint4.setColor(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.applyAlpha(complexColorCompat2.getColor(), vFullPath.mStrokeAlpha));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(vFullPath.mStrokeWidth * fMin * matrixScale);
                canvas.drawPath(this.mRenderPath, paint4);
            }
        }

        private float getMatrixScale(android.graphics.Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) java.lang.Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) java.lang.Math.hypot(fArr[2], fArr[3]);
            float fCross = cross(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = java.lang.Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return java.lang.Math.abs(fCross) / fMax;
            }
            return 0.0f;
        }

        public boolean isStateful() {
            if (this.mIsStateful == null) {
                this.mIsStateful = java.lang.Boolean.valueOf(this.mRootGroup.isStateful());
            }
            return this.mIsStateful.booleanValue();
        }

        public boolean onStateChanged(int[] iArr) {
            return this.mRootGroup.onStateChanged(iArr);
        }
    }

    private static abstract class VObject {
        public boolean isStateful() {
            return false;
        }

        public boolean onStateChanged(int[] iArr) {
            return false;
        }

        private VObject() {
        }
    }

    private static class VGroup extends androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject {
        int mChangingConfigurations;
        final java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject> mChildren;
        private java.lang.String mGroupName;
        final android.graphics.Matrix mLocalMatrix;
        private float mPivotX;
        private float mPivotY;
        float mRotate;
        private float mScaleX;
        private float mScaleY;
        final android.graphics.Matrix mStackedMatrix;
        private int[] mThemeAttrs;
        private float mTranslateX;
        private float mTranslateY;

        public VGroup(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup vGroup, androidx.collection.ArrayMap<java.lang.String, java.lang.Object> arrayMap) {
            androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath vClipPath;
            super();
            this.mStackedMatrix = new android.graphics.Matrix();
            this.mChildren = new java.util.ArrayList<>();
            this.mRotate = 0.0f;
            this.mPivotX = 0.0f;
            this.mPivotY = 0.0f;
            this.mScaleX = 1.0f;
            this.mScaleY = 1.0f;
            this.mTranslateX = 0.0f;
            this.mTranslateY = 0.0f;
            android.graphics.Matrix matrix = new android.graphics.Matrix();
            this.mLocalMatrix = matrix;
            this.mGroupName = null;
            this.mRotate = vGroup.mRotate;
            this.mPivotX = vGroup.mPivotX;
            this.mPivotY = vGroup.mPivotY;
            this.mScaleX = vGroup.mScaleX;
            this.mScaleY = vGroup.mScaleY;
            this.mTranslateX = vGroup.mTranslateX;
            this.mTranslateY = vGroup.mTranslateY;
            this.mThemeAttrs = vGroup.mThemeAttrs;
            java.lang.String str = vGroup.mGroupName;
            this.mGroupName = str;
            this.mChangingConfigurations = vGroup.mChangingConfigurations;
            if (str != null) {
                arrayMap.put(str, this);
            }
            matrix.set(vGroup.mLocalMatrix);
            java.util.ArrayList<androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject> arrayList = vGroup.mChildren;
            for (int i = 0; i < arrayList.size(); i++) {
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject vObject = arrayList.get(i);
                if (vObject instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) {
                    this.mChildren.add(new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup((androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VGroup) vObject, arrayMap));
                } else {
                    if (vObject instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath) {
                        vClipPath = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath((androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath) vObject);
                    } else if (vObject instanceof androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath) {
                        vClipPath = new androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath((androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath) vObject);
                    } else {
                        throw new java.lang.IllegalStateException("Unknown object in the tree!");
                    }
                    this.mChildren.add(vClipPath);
                    if (vClipPath.mPathName != null) {
                        arrayMap.put(vClipPath.mPathName, vClipPath);
                    }
                }
            }
        }

        public VGroup() {
            super();
            this.mStackedMatrix = new android.graphics.Matrix();
            this.mChildren = new java.util.ArrayList<>();
            this.mRotate = 0.0f;
            this.mPivotX = 0.0f;
            this.mPivotY = 0.0f;
            this.mScaleX = 1.0f;
            this.mScaleY = 1.0f;
            this.mTranslateX = 0.0f;
            this.mTranslateY = 0.0f;
            this.mLocalMatrix = new android.graphics.Matrix();
            this.mGroupName = null;
        }

        public java.lang.String getGroupName() {
            return this.mGroupName;
        }

        public android.graphics.Matrix getLocalMatrix() {
            return this.mLocalMatrix;
        }

        public void inflate(android.content.res.Resources resources, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            android.content.res.TypedArray typedArrayObtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_VECTOR_DRAWABLE_GROUP);
            updateStateFromTypedArray(typedArrayObtainAttributes, xmlPullParser);
            typedArrayObtainAttributes.recycle();
        }

        private void updateStateFromTypedArray(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            this.mThemeAttrs = null;
            this.mRotate = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, androidx.constraintlayout.motion.widget.Key.ROTATION, 5, this.mRotate);
            this.mPivotX = typedArray.getFloat(1, this.mPivotX);
            this.mPivotY = typedArray.getFloat(2, this.mPivotY);
            this.mScaleX = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "scaleX", 3, this.mScaleX);
            this.mScaleY = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "scaleY", 4, this.mScaleY);
            this.mTranslateX = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "translateX", 6, this.mTranslateX);
            this.mTranslateY = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "translateY", 7, this.mTranslateY);
            java.lang.String string = typedArray.getString(0);
            if (string != null) {
                this.mGroupName = string;
            }
            updateLocalMatrix();
        }

        private void updateLocalMatrix() {
            this.mLocalMatrix.reset();
            this.mLocalMatrix.postTranslate(-this.mPivotX, -this.mPivotY);
            this.mLocalMatrix.postScale(this.mScaleX, this.mScaleY);
            this.mLocalMatrix.postRotate(this.mRotate, 0.0f, 0.0f);
            this.mLocalMatrix.postTranslate(this.mTranslateX + this.mPivotX, this.mTranslateY + this.mPivotY);
        }

        public float getRotation() {
            return this.mRotate;
        }

        public void setRotation(float f) {
            if (f != this.mRotate) {
                this.mRotate = f;
                updateLocalMatrix();
            }
        }

        public float getPivotX() {
            return this.mPivotX;
        }

        public void setPivotX(float f) {
            if (f != this.mPivotX) {
                this.mPivotX = f;
                updateLocalMatrix();
            }
        }

        public float getPivotY() {
            return this.mPivotY;
        }

        public void setPivotY(float f) {
            if (f != this.mPivotY) {
                this.mPivotY = f;
                updateLocalMatrix();
            }
        }

        public float getScaleX() {
            return this.mScaleX;
        }

        public void setScaleX(float f) {
            if (f != this.mScaleX) {
                this.mScaleX = f;
                updateLocalMatrix();
            }
        }

        public float getScaleY() {
            return this.mScaleY;
        }

        public void setScaleY(float f) {
            if (f != this.mScaleY) {
                this.mScaleY = f;
                updateLocalMatrix();
            }
        }

        public float getTranslateX() {
            return this.mTranslateX;
        }

        public void setTranslateX(float f) {
            if (f != this.mTranslateX) {
                this.mTranslateX = f;
                updateLocalMatrix();
            }
        }

        public float getTranslateY() {
            return this.mTranslateY;
        }

        public void setTranslateY(float f) {
            if (f != this.mTranslateY) {
                this.mTranslateY = f;
                updateLocalMatrix();
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean isStateful() {
            for (int i = 0; i < this.mChildren.size(); i++) {
                if (this.mChildren.get(i).isStateful()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean onStateChanged(int[] iArr) {
            boolean zOnStateChanged = false;
            for (int i = 0; i < this.mChildren.size(); i++) {
                zOnStateChanged |= this.mChildren.get(i).onStateChanged(iArr);
            }
            return zOnStateChanged;
        }
    }

    private static abstract class VPath extends androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject {
        protected static final int FILL_TYPE_WINDING = 0;
        int mChangingConfigurations;
        int mFillRule;
        protected androidx.core.graphics.PathParser.PathDataNode[] mNodes;
        java.lang.String mPathName;

        public void applyTheme(android.content.res.Resources.Theme theme) {
        }

        public boolean canApplyTheme() {
            return false;
        }

        public boolean isClipPath() {
            return false;
        }

        public VPath() {
            super();
            this.mNodes = null;
            this.mFillRule = 0;
        }

        public void printVPath(int i) {
            java.lang.String str = "";
            for (int i2 = 0; i2 < i; i2++) {
                str = str + "    ";
            }
            android.util.Log.v(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.LOGTAG, str + "current path is :" + this.mPathName + " pathData is " + nodesToString(this.mNodes));
        }

        public java.lang.String nodesToString(androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr) {
            java.lang.String str = " ";
            for (int i = 0; i < pathDataNodeArr.length; i++) {
                str = str + pathDataNodeArr[i].mType + ":";
                for (float f : pathDataNodeArr[i].mParams) {
                    str = str + f + ",";
                }
            }
            return str;
        }

        public VPath(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath vPath) {
            super();
            this.mNodes = null;
            this.mFillRule = 0;
            this.mPathName = vPath.mPathName;
            this.mChangingConfigurations = vPath.mChangingConfigurations;
            this.mNodes = androidx.core.graphics.PathParser.deepCopyNodes(vPath.mNodes);
        }

        public void toPath(android.graphics.Path path) {
            path.reset();
            androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr = this.mNodes;
            if (pathDataNodeArr != null) {
                androidx.core.graphics.PathParser.PathDataNode.nodesToPath(pathDataNodeArr, path);
            }
        }

        public java.lang.String getPathName() {
            return this.mPathName;
        }

        public androidx.core.graphics.PathParser.PathDataNode[] getPathData() {
            return this.mNodes;
        }

        public void setPathData(androidx.core.graphics.PathParser.PathDataNode[] pathDataNodeArr) {
            if (!androidx.core.graphics.PathParser.canMorph(this.mNodes, pathDataNodeArr)) {
                this.mNodes = androidx.core.graphics.PathParser.deepCopyNodes(pathDataNodeArr);
            } else {
                androidx.core.graphics.PathParser.updateNodes(this.mNodes, pathDataNodeArr);
            }
        }
    }

    private static class VClipPath extends androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath {
        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath
        public boolean isClipPath() {
            return true;
        }

        VClipPath() {
        }

        VClipPath(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VClipPath vClipPath) {
            super(vClipPath);
        }

        public void inflate(android.content.res.Resources resources, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            if (androidx.core.content.res.TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                android.content.res.TypedArray typedArrayObtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_VECTOR_DRAWABLE_CLIP_PATH);
                updateStateFromTypedArray(typedArrayObtainAttributes, xmlPullParser);
                typedArrayObtainAttributes.recycle();
            }
        }

        private void updateStateFromTypedArray(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            java.lang.String string = typedArray.getString(0);
            if (string != null) {
                this.mPathName = string;
            }
            java.lang.String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.mNodes = androidx.core.graphics.PathParser.createNodesFromPathData(string2);
            }
            this.mFillRule = androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "fillType", 2, 0);
        }
    }

    private static class VFullPath extends androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath {
        float mFillAlpha;
        androidx.core.content.res.ComplexColorCompat mFillColor;
        float mStrokeAlpha;
        androidx.core.content.res.ComplexColorCompat mStrokeColor;
        android.graphics.Paint.Cap mStrokeLineCap;
        android.graphics.Paint.Join mStrokeLineJoin;
        float mStrokeMiterlimit;
        float mStrokeWidth;
        private int[] mThemeAttrs;
        float mTrimPathEnd;
        float mTrimPathOffset;
        float mTrimPathStart;

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath
        public void applyTheme(android.content.res.Resources.Theme theme) {
        }

        VFullPath() {
            this.mStrokeWidth = 0.0f;
            this.mStrokeAlpha = 1.0f;
            this.mFillAlpha = 1.0f;
            this.mTrimPathStart = 0.0f;
            this.mTrimPathEnd = 1.0f;
            this.mTrimPathOffset = 0.0f;
            this.mStrokeLineCap = android.graphics.Paint.Cap.BUTT;
            this.mStrokeLineJoin = android.graphics.Paint.Join.MITER;
            this.mStrokeMiterlimit = 4.0f;
        }

        VFullPath(androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VFullPath vFullPath) {
            super(vFullPath);
            this.mStrokeWidth = 0.0f;
            this.mStrokeAlpha = 1.0f;
            this.mFillAlpha = 1.0f;
            this.mTrimPathStart = 0.0f;
            this.mTrimPathEnd = 1.0f;
            this.mTrimPathOffset = 0.0f;
            this.mStrokeLineCap = android.graphics.Paint.Cap.BUTT;
            this.mStrokeLineJoin = android.graphics.Paint.Join.MITER;
            this.mStrokeMiterlimit = 4.0f;
            this.mThemeAttrs = vFullPath.mThemeAttrs;
            this.mStrokeColor = vFullPath.mStrokeColor;
            this.mStrokeWidth = vFullPath.mStrokeWidth;
            this.mStrokeAlpha = vFullPath.mStrokeAlpha;
            this.mFillColor = vFullPath.mFillColor;
            this.mFillRule = vFullPath.mFillRule;
            this.mFillAlpha = vFullPath.mFillAlpha;
            this.mTrimPathStart = vFullPath.mTrimPathStart;
            this.mTrimPathEnd = vFullPath.mTrimPathEnd;
            this.mTrimPathOffset = vFullPath.mTrimPathOffset;
            this.mStrokeLineCap = vFullPath.mStrokeLineCap;
            this.mStrokeLineJoin = vFullPath.mStrokeLineJoin;
            this.mStrokeMiterlimit = vFullPath.mStrokeMiterlimit;
        }

        private android.graphics.Paint.Cap getStrokeLineCap(int i, android.graphics.Paint.Cap cap) {
            if (i == 0) {
                return android.graphics.Paint.Cap.BUTT;
            }
            if (i != 1) {
                return i != 2 ? cap : android.graphics.Paint.Cap.SQUARE;
            }
            return android.graphics.Paint.Cap.ROUND;
        }

        private android.graphics.Paint.Join getStrokeLineJoin(int i, android.graphics.Paint.Join join) {
            if (i == 0) {
                return android.graphics.Paint.Join.MITER;
            }
            if (i != 1) {
                return i != 2 ? join : android.graphics.Paint.Join.BEVEL;
            }
            return android.graphics.Paint.Join.ROUND;
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VPath
        public boolean canApplyTheme() {
            return this.mThemeAttrs != null;
        }

        public void inflate(android.content.res.Resources resources, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme, org.xmlpull.v1.XmlPullParser xmlPullParser) {
            android.content.res.TypedArray typedArrayObtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_VECTOR_DRAWABLE_PATH);
            updateStateFromTypedArray(typedArrayObtainAttributes, xmlPullParser, theme);
            typedArrayObtainAttributes.recycle();
        }

        private void updateStateFromTypedArray(android.content.res.TypedArray typedArray, org.xmlpull.v1.XmlPullParser xmlPullParser, android.content.res.Resources.Theme theme) {
            this.mThemeAttrs = null;
            if (androidx.core.content.res.TypedArrayUtils.hasAttribute(xmlPullParser, "pathData")) {
                java.lang.String string = typedArray.getString(0);
                if (string != null) {
                    this.mPathName = string;
                }
                java.lang.String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.mNodes = androidx.core.graphics.PathParser.createNodesFromPathData(string2);
                }
                this.mFillColor = androidx.core.content.res.TypedArrayUtils.getNamedComplexColor(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.mFillAlpha = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "fillAlpha", 12, this.mFillAlpha);
                this.mStrokeLineCap = getStrokeLineCap(androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.mStrokeLineCap);
                this.mStrokeLineJoin = getStrokeLineJoin(androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.mStrokeLineJoin);
                this.mStrokeMiterlimit = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.mStrokeMiterlimit);
                this.mStrokeColor = androidx.core.content.res.TypedArrayUtils.getNamedComplexColor(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.mStrokeAlpha = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeAlpha", 11, this.mStrokeAlpha);
                this.mStrokeWidth = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "strokeWidth", 4, this.mStrokeWidth);
                this.mTrimPathEnd = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathEnd", 6, this.mTrimPathEnd);
                this.mTrimPathOffset = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathOffset", 7, this.mTrimPathOffset);
                this.mTrimPathStart = androidx.core.content.res.TypedArrayUtils.getNamedFloat(typedArray, xmlPullParser, "trimPathStart", 5, this.mTrimPathStart);
                this.mFillRule = androidx.core.content.res.TypedArrayUtils.getNamedInt(typedArray, xmlPullParser, "fillType", 13, this.mFillRule);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean isStateful() {
            return this.mFillColor.isStateful() || this.mStrokeColor.isStateful();
        }

        @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.VObject
        public boolean onStateChanged(int[] iArr) {
            return this.mStrokeColor.onStateChanged(iArr) | this.mFillColor.onStateChanged(iArr);
        }

        int getStrokeColor() {
            return this.mStrokeColor.getColor();
        }

        void setStrokeColor(int i) {
            this.mStrokeColor.setColor(i);
        }

        float getStrokeWidth() {
            return this.mStrokeWidth;
        }

        void setStrokeWidth(float f) {
            this.mStrokeWidth = f;
        }

        float getStrokeAlpha() {
            return this.mStrokeAlpha;
        }

        void setStrokeAlpha(float f) {
            this.mStrokeAlpha = f;
        }

        int getFillColor() {
            return this.mFillColor.getColor();
        }

        void setFillColor(int i) {
            this.mFillColor.setColor(i);
        }

        float getFillAlpha() {
            return this.mFillAlpha;
        }

        void setFillAlpha(float f) {
            this.mFillAlpha = f;
        }

        float getTrimPathStart() {
            return this.mTrimPathStart;
        }

        void setTrimPathStart(float f) {
            this.mTrimPathStart = f;
        }

        float getTrimPathEnd() {
            return this.mTrimPathEnd;
        }

        void setTrimPathEnd(float f) {
            this.mTrimPathEnd = f;
        }

        float getTrimPathOffset() {
            return this.mTrimPathOffset;
        }

        void setTrimPathOffset(float f) {
            this.mTrimPathOffset = f;
        }
    }
}
