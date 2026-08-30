package androidx.appcompat.graphics.drawable;

/* JADX INFO: loaded from: classes.dex */
public class AnimatedStateListDrawableCompat extends androidx.appcompat.graphics.drawable.StateListDrawableCompat implements androidx.core.graphics.drawable.TintAwareDrawable {
    private static final java.lang.String ELEMENT_ITEM = "item";
    private static final java.lang.String ELEMENT_TRANSITION = "transition";
    private static final java.lang.String ITEM_MISSING_DRAWABLE_ERROR = ": <item> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final java.lang.String LOGTAG = "AnimatedStateListDrawableCompat";
    private static final java.lang.String TRANSITION_MISSING_DRAWABLE_ERROR = ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable";
    private static final java.lang.String TRANSITION_MISSING_FROM_TO_ID = ": <transition> tag requires 'fromId' & 'toId' attributes";
    private boolean mMutated;
    private androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState mState;
    private androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition mTransition;
    private int mTransitionFromIndex;
    private int mTransitionToIndex;

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    public AnimatedStateListDrawableCompat() {
        this(null, null);
    }

    AnimatedStateListDrawableCompat(androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState animatedStateListState, android.content.res.Resources resources) {
        super(null);
        this.mTransitionToIndex = -1;
        this.mTransitionFromIndex = -1;
        setConstantState(new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState(animatedStateListState, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    public static androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat create(android.content.Context context, int i, android.content.res.Resources.Theme theme) {
        int next;
        try {
            android.content.res.Resources resources = context.getResources();
            android.content.res.XmlResourceParser xml = resources.getXml(i);
            android.util.AttributeSet attributeSetAsAttributeSet = android.util.Xml.asAttributeSet(xml);
            do {
                next = xml.next();
                if (next == 2) {
                    break;
                }
            } while (next != 1);
            if (next != 2) {
                throw new org.xmlpull.v1.XmlPullParserException("No start tag found");
            }
            return createFromXmlInner(context, resources, xml, attributeSetAsAttributeSet, theme);
        } catch (java.io.IOException e) {
            android.util.Log.e(LOGTAG, "parser error", e);
            return null;
        } catch (org.xmlpull.v1.XmlPullParserException e2) {
            android.util.Log.e(LOGTAG, "parser error", e2);
            return null;
        }
    }

    public static androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat createFromXmlInner(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        java.lang.String name = xmlPullParser.getName();
        if (!name.equals("animated-selector")) {
            throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
        }
        androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat animatedStateListDrawableCompat = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat();
        animatedStateListDrawableCompat.inflate(context, resources, xmlPullParser, attributeSet, theme);
        return animatedStateListDrawableCompat;
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat
    public void inflate(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        android.content.res.TypedArray typedArrayObtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat);
        setVisible(typedArrayObtainAttributes.getBoolean(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_visible, true), true);
        updateStateFromTypedArray(typedArrayObtainAttributes);
        updateDensity(resources);
        typedArrayObtainAttributes.recycle();
        inflateChildElements(context, resources, xmlPullParser, attributeSet, theme);
        init();
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition transition = this.mTransition;
        if (transition != null && (visible || z2)) {
            if (z) {
                transition.start();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    public void addState(int[] iArr, android.graphics.drawable.Drawable drawable, int i) {
        androidx.core.util.ObjectsCompat.requireNonNull(drawable);
        this.mState.addStateSet(iArr, drawable, i);
        onStateChange(getState());
    }

    public <T extends android.graphics.drawable.Drawable & android.graphics.drawable.Animatable> void addTransition(int i, int i2, T t, boolean z) {
        androidx.core.util.ObjectsCompat.requireNonNull(t);
        this.mState.addTransition(i, i2, t, z);
    }

    @Override // androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition transition = this.mTransition;
        if (transition != null) {
            transition.stop();
            this.mTransition = null;
            selectDrawable(this.mTransitionToIndex);
            this.mTransitionToIndex = -1;
            this.mTransitionFromIndex = -1;
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        int iIndexOfKeyframe = this.mState.indexOfKeyframe(iArr);
        boolean z = iIndexOfKeyframe != getCurrentIndex() && (selectTransition(iIndexOfKeyframe) || selectDrawable(iIndexOfKeyframe));
        android.graphics.drawable.Drawable current = getCurrent();
        return current != null ? z | current.setState(iArr) : z;
    }

    private boolean selectTransition(int i) {
        int currentIndex;
        int iIndexOfTransition;
        androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition animatableTransition;
        androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition transition = this.mTransition;
        if (transition != null) {
            if (i == this.mTransitionToIndex) {
                return true;
            }
            if (i == this.mTransitionFromIndex && transition.canReverse()) {
                transition.reverse();
                this.mTransitionToIndex = this.mTransitionFromIndex;
                this.mTransitionFromIndex = i;
                return true;
            }
            currentIndex = this.mTransitionToIndex;
            transition.stop();
        } else {
            currentIndex = getCurrentIndex();
        }
        this.mTransition = null;
        this.mTransitionFromIndex = -1;
        this.mTransitionToIndex = -1;
        androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState animatedStateListState = this.mState;
        int keyframeIdAt = animatedStateListState.getKeyframeIdAt(currentIndex);
        int keyframeIdAt2 = animatedStateListState.getKeyframeIdAt(i);
        if (keyframeIdAt2 == 0 || keyframeIdAt == 0 || (iIndexOfTransition = animatedStateListState.indexOfTransition(keyframeIdAt, keyframeIdAt2)) < 0) {
            return false;
        }
        boolean zTransitionHasReversibleFlag = animatedStateListState.transitionHasReversibleFlag(keyframeIdAt, keyframeIdAt2);
        selectDrawable(iIndexOfTransition);
        java.lang.Object current = getCurrent();
        if (current instanceof android.graphics.drawable.AnimationDrawable) {
            animatableTransition = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimationDrawableTransition((android.graphics.drawable.AnimationDrawable) current, animatedStateListState.isTransitionReversed(keyframeIdAt, keyframeIdAt2), zTransitionHasReversibleFlag);
        } else if (current instanceof androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat) {
            animatableTransition = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedVectorDrawableTransition((androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat) current);
        } else {
            if (current instanceof android.graphics.drawable.Animatable) {
                animatableTransition = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatableTransition((android.graphics.drawable.Animatable) current);
            }
            return false;
        }
        animatableTransition.start();
        this.mTransition = animatableTransition;
        this.mTransitionFromIndex = currentIndex;
        this.mTransitionToIndex = i;
        return true;
    }

    private static abstract class Transition {
        public boolean canReverse() {
            return false;
        }

        public void reverse() {
        }

        public abstract void start();

        public abstract void stop();

        private Transition() {
        }
    }

    private static class AnimatableTransition extends androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition {
        private final android.graphics.drawable.Animatable mA;

        AnimatableTransition(android.graphics.drawable.Animatable animatable) {
            super();
            this.mA = animatable;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
            this.mA.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
            this.mA.stop();
        }
    }

    private static class AnimationDrawableTransition extends androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition {
        private final android.animation.ObjectAnimator mAnim;
        private final boolean mHasReversibleFlag;

        AnimationDrawableTransition(android.graphics.drawable.AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            int i = z ? numberOfFrames - 1 : 0;
            int i2 = z ? 0 : numberOfFrames - 1;
            androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.FrameInterpolator frameInterpolator = new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.FrameInterpolator(animationDrawable, z);
            android.animation.ObjectAnimator objectAnimatorOfInt = android.animation.ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            androidx.appcompat.resources.Compatibility.Api18Impl.setAutoCancel(objectAnimatorOfInt, true);
            objectAnimatorOfInt.setDuration(frameInterpolator.getTotalDuration());
            objectAnimatorOfInt.setInterpolator(frameInterpolator);
            this.mHasReversibleFlag = z2;
            this.mAnim = objectAnimatorOfInt;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public boolean canReverse() {
            return this.mHasReversibleFlag;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
            this.mAnim.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void reverse() {
            this.mAnim.reverse();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
            this.mAnim.cancel();
        }
    }

    private static class AnimatedVectorDrawableTransition extends androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition {
        private final androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat mAvd;

        AnimatedVectorDrawableTransition(androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat) {
            super();
            this.mAvd = animatedVectorDrawableCompat;
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void start() {
            this.mAvd.start();
        }

        @Override // androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.Transition
        public void stop() {
            this.mAvd.stop();
        }
    }

    private void updateStateFromTypedArray(android.content.res.TypedArray typedArray) {
        androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState animatedStateListState = this.mState;
        animatedStateListState.mChangingConfigurations |= androidx.appcompat.resources.Compatibility.Api21Impl.getChangingConfigurations(typedArray);
        animatedStateListState.setVariablePadding(typedArray.getBoolean(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_variablePadding, animatedStateListState.mVariablePadding));
        animatedStateListState.setConstantSize(typedArray.getBoolean(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_constantSize, animatedStateListState.mConstantSize));
        animatedStateListState.setEnterFadeDuration(typedArray.getInt(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_enterFadeDuration, animatedStateListState.mEnterFadeDuration));
        animatedStateListState.setExitFadeDuration(typedArray.getInt(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_exitFadeDuration, animatedStateListState.mExitFadeDuration));
        setDither(typedArray.getBoolean(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableCompat_android_dither, animatedStateListState.mDither));
    }

    private void init() {
        onStateChange(getState());
    }

    private void inflateChildElements(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1) {
                return;
            }
            int depth2 = xmlPullParser.getDepth();
            if (depth2 < depth && next == 3) {
                return;
            }
            if (next == 2 && depth2 <= depth) {
                if (xmlPullParser.getName().equals(ELEMENT_ITEM)) {
                    parseItem(context, resources, xmlPullParser, attributeSet, theme);
                } else if (xmlPullParser.getName().equals(ELEMENT_TRANSITION)) {
                    parseTransition(context, resources, xmlPullParser, attributeSet, theme);
                }
            }
        }
    }

    private int parseTransition(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        android.content.res.TypedArray typedArrayObtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition);
        int resourceId = typedArrayObtainAttributes.getResourceId(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_fromId, -1);
        int resourceId2 = typedArrayObtainAttributes.getResourceId(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_toId, -1);
        int resourceId3 = typedArrayObtainAttributes.getResourceId(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_drawable, -1);
        android.graphics.drawable.Drawable drawable = resourceId3 > 0 ? androidx.appcompat.widget.ResourceManagerInternal.get().getDrawable(context, resourceId3) : null;
        boolean z = typedArrayObtainAttributes.getBoolean(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableTransition_android_reversible, false);
        typedArrayObtainAttributes.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + TRANSITION_MISSING_DRAWABLE_ERROR);
            }
            if (xmlPullParser.getName().equals("animated-vector")) {
                drawable = androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.createFromXmlInner(context, resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = androidx.appcompat.resources.Compatibility.Api21Impl.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable == null) {
            throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + TRANSITION_MISSING_DRAWABLE_ERROR);
        }
        if (resourceId == -1 || resourceId2 == -1) {
            throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + TRANSITION_MISSING_FROM_TO_ID);
        }
        return this.mState.addTransition(resourceId, resourceId2, drawable, z);
    }

    private int parseItem(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        int next;
        android.content.res.TypedArray typedArrayObtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableItem);
        int resourceId = typedArrayObtainAttributes.getResourceId(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableItem_android_id, 0);
        int resourceId2 = typedArrayObtainAttributes.getResourceId(androidx.appcompat.resources.R.styleable.AnimatedStateListDrawableItem_android_drawable, -1);
        android.graphics.drawable.Drawable drawable = resourceId2 > 0 ? androidx.appcompat.widget.ResourceManagerInternal.get().getDrawable(context, resourceId2) : null;
        typedArrayObtainAttributes.recycle();
        int[] iArrExtractStateSet = extractStateSet(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next != 2) {
                throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ITEM_MISSING_DRAWABLE_ERROR);
            }
            if (xmlPullParser.getName().equals("vector")) {
                drawable = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            } else {
                drawable = androidx.appcompat.resources.Compatibility.Api21Impl.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
            }
        }
        if (drawable == null) {
            throw new org.xmlpull.v1.XmlPullParserException(xmlPullParser.getPositionDescription() + ITEM_MISSING_DRAWABLE_ERROR);
        }
        return this.mState.addStateSet(iArrExtractStateSet, drawable, resourceId);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat, android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        if (!this.mMutated && super.mutate() == this) {
            this.mState.mutate();
            this.mMutated = true;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    public androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState cloneConstantState() {
        return new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState(this.mState, this, null);
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    void clearMutated() {
        super.clearMutated();
        this.mMutated = false;
    }

    static class AnimatedStateListState extends androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState {
        private static final long REVERSED_BIT = 4294967296L;
        private static final long REVERSIBLE_FLAG_BIT = 8589934592L;
        androidx.collection.SparseArrayCompat<java.lang.Integer> mStateIds;
        androidx.collection.LongSparseArray<java.lang.Long> mTransitions;

        private static long generateTransitionKey(int i, int i2) {
            return ((long) i2) | (((long) i) << 32);
        }

        AnimatedStateListState(androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState animatedStateListState, androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat animatedStateListDrawableCompat, android.content.res.Resources resources) {
            super(animatedStateListState, animatedStateListDrawableCompat, resources);
            if (animatedStateListState != null) {
                this.mTransitions = animatedStateListState.mTransitions;
                this.mStateIds = animatedStateListState.mStateIds;
            } else {
                this.mTransitions = new androidx.collection.LongSparseArray<>();
                this.mStateIds = new androidx.collection.SparseArrayCompat<>();
            }
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState
        void mutate() {
            this.mTransitions = this.mTransitions.m11clone();
            this.mStateIds = this.mStateIds.m12clone();
        }

        int addTransition(int i, int i2, android.graphics.drawable.Drawable drawable, boolean z) {
            int iAddChild = super.addChild(drawable);
            long jGenerateTransitionKey = generateTransitionKey(i, i2);
            long j = z ? REVERSIBLE_FLAG_BIT : 0L;
            long j2 = iAddChild;
            this.mTransitions.append(jGenerateTransitionKey, java.lang.Long.valueOf(j2 | j));
            if (z) {
                this.mTransitions.append(generateTransitionKey(i2, i), java.lang.Long.valueOf(REVERSED_BIT | j2 | j));
            }
            return iAddChild;
        }

        int addStateSet(int[] iArr, android.graphics.drawable.Drawable drawable, int i) {
            int iAddStateSet = super.addStateSet(iArr, drawable);
            this.mStateIds.put(iAddStateSet, java.lang.Integer.valueOf(i));
            return iAddStateSet;
        }

        int indexOfKeyframe(int[] iArr) {
            int iIndexOfStateSet = super.indexOfStateSet(iArr);
            return iIndexOfStateSet >= 0 ? iIndexOfStateSet : super.indexOfStateSet(android.util.StateSet.WILD_CARD);
        }

        int getKeyframeIdAt(int i) {
            if (i < 0) {
                return 0;
            }
            return this.mStateIds.get(i, 0).intValue();
        }

        int indexOfTransition(int i, int i2) {
            return (int) this.mTransitions.get(generateTransitionKey(i, i2), -1L).longValue();
        }

        boolean isTransitionReversed(int i, int i2) {
            return (this.mTransitions.get(generateTransitionKey(i, i2), -1L).longValue() & REVERSED_BIT) != 0;
        }

        boolean transitionHasReversibleFlag(int i, int i2) {
            return (this.mTransitions.get(generateTransitionKey(i, i2), -1L).longValue() & REVERSIBLE_FLAG_BIT) != 0;
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            return new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat(this, null);
        }

        @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState, android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            return new androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat(this, resources);
        }
    }

    @Override // androidx.appcompat.graphics.drawable.StateListDrawableCompat, androidx.appcompat.graphics.drawable.DrawableContainerCompat
    void setConstantState(androidx.appcompat.graphics.drawable.DrawableContainerCompat.DrawableContainerState drawableContainerState) {
        super.setConstantState(drawableContainerState);
        if (drawableContainerState instanceof androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState) {
            this.mState = (androidx.appcompat.graphics.drawable.AnimatedStateListDrawableCompat.AnimatedStateListState) drawableContainerState;
        }
    }

    private static class FrameInterpolator implements android.animation.TimeInterpolator {
        private int[] mFrameTimes;
        private int mFrames;
        private int mTotalDuration;

        FrameInterpolator(android.graphics.drawable.AnimationDrawable animationDrawable, boolean z) {
            updateFrames(animationDrawable, z);
        }

        int updateFrames(android.graphics.drawable.AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.mFrames = numberOfFrames;
            int[] iArr = this.mFrameTimes;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.mFrameTimes = new int[numberOfFrames];
            }
            int[] iArr2 = this.mFrameTimes;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.mTotalDuration = i;
            return i;
        }

        int getTotalDuration() {
            return this.mTotalDuration;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            int i = (int) ((f * this.mTotalDuration) + 0.5f);
            int i2 = this.mFrames;
            int[] iArr = this.mFrameTimes;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            return (i3 / i2) + (i3 < i2 ? i / this.mTotalDuration : 0.0f);
        }
    }
}
