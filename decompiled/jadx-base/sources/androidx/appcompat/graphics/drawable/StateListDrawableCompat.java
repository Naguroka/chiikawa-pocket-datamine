package androidx.appcompat.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class StateListDrawableCompat extends androidx.appcompat.graphics.drawable.DrawableContainerCompat {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "StateListDrawableCompat";
    private boolean mMutated;
    private androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState mStateListState;

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    public StateListDrawableCompat() {
        this(null, null);
    }

    public void addState(int[] iArr, android.graphics.drawable.Drawable drawable) {
        if (drawable != null) {
            this.mStateListState.addStateSet(iArr, drawable);
            onStateChange(getState());
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean zOnStateChange = super.onStateChange(iArr);
        int iIndexOfStateSet = this.mStateListState.indexOfStateSet(iArr);
        if (iIndexOfStateSet < 0) {
            iIndexOfStateSet = this.mStateListState.indexOfStateSet(android.util.StateSet.WILD_CARD);
        }
        return selectDrawable(iIndexOfStateSet) || zOnStateChange;
    }

    public void inflate(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.content.res.TypedArray typedArrayObtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.appcompat.resources.R.styleable.StateListDrawable);
        setVisible(typedArrayObtainAttributes.getBoolean(androidx.appcompat.resources.R.styleable.StateListDrawable_android_visible, true), true);
        updateStateFromTypedArray(typedArrayObtainAttributes);
        updateDensity(resources);
        typedArrayObtainAttributes.recycle();
        inflateChildElements(context, resources, xmlPullParser, attributeSet, theme);
        onStateChange(getState());
    }

    private void updateStateFromTypedArray(android.content.res.TypedArray typedArray) {
        androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState stateListState = this.mStateListState;
        stateListState.mChangingConfigurations |= androidx.appcompat.resources.Compatibility.Api21Impl.getChangingConfigurations(typedArray);
        stateListState.mVariablePadding = typedArray.getBoolean(androidx.appcompat.resources.R.styleable.StateListDrawable_android_variablePadding, stateListState.mVariablePadding);
        stateListState.mConstantSize = typedArray.getBoolean(androidx.appcompat.resources.R.styleable.StateListDrawable_android_constantSize, stateListState.mConstantSize);
        stateListState.mEnterFadeDuration = typedArray.getInt(androidx.appcompat.resources.R.styleable.StateListDrawable_android_enterFadeDuration, stateListState.mEnterFadeDuration);
        stateListState.mExitFadeDuration = typedArray.getInt(androidx.appcompat.resources.R.styleable.StateListDrawable_android_exitFadeDuration, stateListState.mExitFadeDuration);
        stateListState.mDither = typedArray.getBoolean(androidx.appcompat.resources.R.styleable.StateListDrawable_android_dither, stateListState.mDither);
    }

    private void inflateChildElements(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState stateListState = this.mStateListState;
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next2 = xmlPullParser.next();
            if (next2 == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next2 == 3) {
                return;
            }
            if (next2 == 2 && depth2 <= depth && xmlPullParser.getName().equals("item")) {
                android.content.res.TypedArray typedArrayObtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.appcompat.resources.R.styleable.StateListDrawableItem);
                int resourceId = typedArrayObtainAttributes.getResourceId(androidx.appcompat.resources.R.styleable.StateListDrawableItem_android_drawable, -1);
                android.graphics.drawable.Drawable drawable = resourceId > 0 ? androidx.appcompat.widget.ResourceManagerInternal.get().getDrawable(context, resourceId) : null;
                typedArrayObtainAttributes.recycle();
                int[] iArrExtractStateSet = extractStateSet(attributeSet);
                if (drawable == null) {
                    do {
                        next = xmlPullParser.next();
                    } while (next == 4);
                    if (next != 2) {
                        throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
                    }
                    drawable = androidx.appcompat.resources.Compatibility.Api21Impl.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
                }
                stateListState.addStateSet(iArrExtractStateSet, drawable);
            }
        }
    }

    int[] extractStateSet(android.util.AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return android.util.StateSet.trimStateSet(iArr, i);
    }

    androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState getStateListState() {
        return this.mStateListState;
    }

    int getStateCount() {
        return this.mStateListState.getChildCount();
    }

    int[] getStateSet(int i) {
        return this.mStateListState.mStateSets[i];
    }

    android.graphics.drawable.Drawable getStateDrawable(int i) {
        return this.mStateListState.getChild(i);
    }

    int getStateDrawableIndex(int[] iArr) {
        return this.mStateListState.indexOfStateSet(iArr);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        if (!this.mMutated && super.mutate() == this) {
            this.mStateListState.mutate();
            this.mMutated = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState cloneConstantState() {
        return new androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState(this.mStateListState, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    void clearMutated() {
        super.clearMutated();
        this.mMutated = false;
    }

    static class StateListState extends androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState {
        int[][] mStateSets;

        StateListState(androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState stateListState, androidx.appcompat.graphics.drawable.StateListDrawableCompat stateListDrawableCompat, android.content.res.Resources resources) {
            super(stateListState, stateListDrawableCompat, resources);
            if (stateListState != null) {
                this.mStateSets = stateListState.mStateSets;
            } else {
                this.mStateSets = new int[getCapacity()][];
            }
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        void mutate() {
            int[][] iArr = this.mStateSets;
            int[][] iArr2 = new int[iArr.length][];
            for (int length = iArr.length - 1; length >= 0; length--) {
                int[] iArr3 = this.mStateSets[length];
                iArr2[length] = iArr3 != null ? (int[]) iArr3.clone() : null;
            }
            this.mStateSets = iArr2;
        }

        int addStateSet(int[] iArr, android.graphics.drawable.Drawable drawable) {
            int iAddChild = addChild(drawable);
            this.mStateSets[iAddChild] = iArr;
            return iAddChild;
        }

        int indexOfStateSet(int[] iArr) {
            int[][] iArr2 = this.mStateSets;
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                if (android.util.StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            return new androidx.appcompat.graphics.drawable.StateListDrawableCompat(this, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            return new androidx.appcompat.graphics.drawable.StateListDrawableCompat(this, resources);
        }

        @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        public void growArray(int i, int i2) {
            super.growArray(i, i2);
            int[][] iArr = new int[i2][];
            java.lang.System.arraycopy(this.mStateSets, 0, iArr, 0, i);
            this.mStateSets = iArr;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat
    void setConstantState(androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.setConstantState(drawableContainerState);
        if (drawableContainerState instanceof androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState) {
            this.mStateListState = (androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState) drawableContainerState;
        }
    }

    StateListDrawableCompat(androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState stateListState, android.content.res.Resources resources) {
        setConstantState(new androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState(stateListState, this, resources));
        onStateChange(getState());
    }

    StateListDrawableCompat(androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState stateListState) {
        if (stateListState != null) {
            setConstantState(stateListState);
        }
    }
}
