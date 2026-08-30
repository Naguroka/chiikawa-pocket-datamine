package androidx.vectordrawable.graphics.drawable;

/* JADX INFO: loaded from: classes3.dex */
public class AnimatedVectorDrawableCompat extends androidx.vectordrawable.graphics.drawable.VectorDrawableCommon implements androidx.vectordrawable.graphics.drawable.Animatable2Compat {
    private static final java.lang.String ANIMATED_VECTOR = "animated-vector";
    private static final boolean DBG_ANIMATION_VECTOR_DRAWABLE = false;
    private static final java.lang.String LOGTAG = "AnimatedVDCompat";
    private static final java.lang.String TARGET = "target";
    private androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableCompatState mAnimatedVectorState;
    java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> mAnimationCallbacks;
    private android.animation.Animator.AnimatorListener mAnimatorListener;
    private android.animation.ArgbEvaluator mArgbEvaluator;
    androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableDelegateState mCachedConstantStateDelegate;
    final android.graphics.drawable.Drawable.Callback mCallback;
    private android.content.Context mContext;

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

    AnimatedVectorDrawableCompat() {
        this(null, null, null);
    }

    private AnimatedVectorDrawableCompat(android.content.Context context) {
        this(context, null, null);
    }

    private AnimatedVectorDrawableCompat(android.content.Context context, androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState, android.content.res.Resources resources) {
        this.mArgbEvaluator = null;
        this.mAnimatorListener = null;
        this.mAnimationCallbacks = null;
        android.graphics.drawable.Drawable.Callback callback = new android.graphics.drawable.Drawable.Callback() { // from class: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.1
            @Override // android.graphics.drawable.Drawable.Callback
            public void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.this.invalidateSelf();
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void scheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable, long j) {
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.this.scheduleSelf(runnable, j);
            }

            @Override // android.graphics.drawable.Drawable.Callback
            public void unscheduleDrawable(android.graphics.drawable.Drawable drawable, java.lang.Runnable runnable) {
                androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.this.unscheduleSelf(runnable);
            }
        };
        this.mCallback = callback;
        this.mContext = context;
        if (animatedVectorDrawableCompatState != null) {
            this.mAnimatedVectorState = animatedVectorDrawableCompatState;
        } else {
            this.mAnimatedVectorState = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableCompatState(context, animatedVectorDrawableCompatState, callback, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable mutate() {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.mutate();
        }
        return this;
    }

    public static androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat create(android.content.Context context, int i) {
        androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat(context);
        animatedVectorDrawableCompat.mDelegateDrawable = androidx.core.content.res.ResourcesCompat.getDrawable(context.getResources(), i, context.getTheme());
        animatedVectorDrawableCompat.mDelegateDrawable.setCallback(animatedVectorDrawableCompat.mCallback);
        animatedVectorDrawableCompat.mCachedConstantStateDelegate = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableDelegateState(animatedVectorDrawableCompat.mDelegateDrawable.getConstantState());
        return animatedVectorDrawableCompat;
    }

    public static androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat createFromXmlInner(android.content.Context context, android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat(context);
        animatedVectorDrawableCompat.inflate(resources, xmlPullParser, attributeSet, theme);
        return animatedVectorDrawableCompat;
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.drawable.Drawable.ConstantState getConstantState() {
        if (this.mDelegateDrawable != null) {
            return new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableDelegateState(this.mDelegateDrawable.getConstantState());
        }
        return null;
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.mAnimatedVectorState.mChangingConfigurations;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(android.graphics.Canvas canvas) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.draw(canvas);
            return;
        }
        this.mAnimatedVectorState.mVectorDrawable.draw(canvas);
        if (this.mAnimatedVectorState.mAnimatorSet.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    protected void onBoundsChange(android.graphics.Rect rect) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.setBounds(rect);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.setState(iArr);
        }
        return this.mAnimatedVectorState.mVectorDrawable.setState(iArr);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.setLevel(i);
        }
        return this.mAnimatedVectorState.mVectorDrawable.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        if (this.mDelegateDrawable != null) {
            return androidx.core.graphics.drawable.DrawableCompat.getAlpha(this.mDelegateDrawable);
        }
        return this.mAnimatedVectorState.mVectorDrawable.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.setAlpha(i);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(android.graphics.ColorFilter colorFilter) {
        if (this.mDelegateDrawable != null) {
            this.mDelegateDrawable.setColorFilter(colorFilter);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setColorFilter(colorFilter);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public android.graphics.ColorFilter getColorFilter() {
        if (this.mDelegateDrawable != null) {
            return androidx.core.graphics.drawable.DrawableCompat.getColorFilter(this.mDelegateDrawable);
        }
        return this.mAnimatedVectorState.mVectorDrawable.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(int i) {
        if (this.mDelegateDrawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTint(this.mDelegateDrawable, i);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(android.content.res.ColorStateList colorStateList) {
        if (this.mDelegateDrawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTintList(this.mDelegateDrawable, colorStateList);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(android.graphics.PorterDuff.Mode mode) {
        if (this.mDelegateDrawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.setTintMode(this.mDelegateDrawable, mode);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.setVisible(z, z2);
        }
        this.mAnimatedVectorState.mVectorDrawable.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.isStateful();
        }
        return this.mAnimatedVectorState.mVectorDrawable.isStateful();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.getOpacity();
        }
        return this.mAnimatedVectorState.mVectorDrawable.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.getIntrinsicWidth();
        }
        return this.mAnimatedVectorState.mVectorDrawable.getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        if (this.mDelegateDrawable != null) {
            return this.mDelegateDrawable.getIntrinsicHeight();
        }
        return this.mAnimatedVectorState.mVectorDrawable.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        if (this.mDelegateDrawable != null) {
            return androidx.core.graphics.drawable.DrawableCompat.isAutoMirrored(this.mDelegateDrawable);
        }
        return this.mAnimatedVectorState.mVectorDrawable.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        if (this.mDelegateDrawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.setAutoMirrored(this.mDelegateDrawable, z);
        } else {
            this.mAnimatedVectorState.mVectorDrawable.setAutoMirrored(z);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet, android.content.res.Resources.Theme theme) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        if (this.mDelegateDrawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.inflate(this.mDelegateDrawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                java.lang.String name = xmlPullParser.getName();
                if (ANIMATED_VECTOR.equals(name)) {
                    android.content.res.TypedArray typedArrayObtainAttributes = androidx.core.content.res.TypedArrayUtils.obtainAttributes(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE);
                    int resourceId = typedArrayObtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat vectorDrawableCompatCreate = androidx.vectordrawable.graphics.drawable.VectorDrawableCompat.create(resources, resourceId, theme);
                        vectorDrawableCompatCreate.setAllowCaching(false);
                        vectorDrawableCompatCreate.setCallback(this.mCallback);
                        if (this.mAnimatedVectorState.mVectorDrawable != null) {
                            this.mAnimatedVectorState.mVectorDrawable.setCallback(null);
                        }
                        this.mAnimatedVectorState.mVectorDrawable = vectorDrawableCompatCreate;
                    }
                    typedArrayObtainAttributes.recycle();
                } else if ("target".equals(name)) {
                    android.content.res.TypedArray typedArrayObtainAttributes2 = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.AndroidResources.STYLEABLE_ANIMATED_VECTOR_DRAWABLE_TARGET);
                    java.lang.String string = typedArrayObtainAttributes2.getString(0);
                    int resourceId2 = typedArrayObtainAttributes2.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        android.content.Context context = this.mContext;
                        if (context != null) {
                            setupAnimatorsForTarget(string, androidx.vectordrawable.graphics.drawable.AnimatorInflaterCompat.loadAnimator(context, resourceId2));
                        } else {
                            typedArrayObtainAttributes2.recycle();
                            throw new java.lang.IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    typedArrayObtainAttributes2.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.mAnimatedVectorState.setupAnimatorSet();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(android.content.res.Resources resources, org.xmlpull.v1.XmlPullParser xmlPullParser, android.util.AttributeSet attributeSet) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }

    @Override // androidx.vectordrawable.graphics.drawable.VectorDrawableCommon, android.graphics.drawable.Drawable
    public void applyTheme(android.content.res.Resources.Theme theme) {
        if (this.mDelegateDrawable != null) {
            androidx.core.graphics.drawable.DrawableCompat.applyTheme(this.mDelegateDrawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        if (this.mDelegateDrawable != null) {
            return androidx.core.graphics.drawable.DrawableCompat.canApplyTheme(this.mDelegateDrawable);
        }
        return false;
    }

    private static class AnimatedVectorDrawableDelegateState extends android.graphics.drawable.Drawable.ConstantState {
        private final android.graphics.drawable.Drawable.ConstantState mDelegateState;

        public AnimatedVectorDrawableDelegateState(android.graphics.drawable.Drawable.ConstantState constantState) {
            this.mDelegateState = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat();
            animatedVectorDrawableCompat.mDelegateDrawable = this.mDelegateState.newDrawable();
            animatedVectorDrawableCompat.mDelegateDrawable.setCallback(animatedVectorDrawableCompat.mCallback);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat();
            animatedVectorDrawableCompat.mDelegateDrawable = this.mDelegateState.newDrawable(resources);
            animatedVectorDrawableCompat.mDelegateDrawable.setCallback(animatedVectorDrawableCompat.mCallback);
            return animatedVectorDrawableCompat;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources, android.content.res.Resources.Theme theme) {
            androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat animatedVectorDrawableCompat = new androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat();
            animatedVectorDrawableCompat.mDelegateDrawable = this.mDelegateState.newDrawable(resources, theme);
            animatedVectorDrawableCompat.mDelegateDrawable.setCallback(animatedVectorDrawableCompat.mCallback);
            return animatedVectorDrawableCompat;
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

    private static class AnimatedVectorDrawableCompatState extends android.graphics.drawable.Drawable.ConstantState {
        android.animation.AnimatorSet mAnimatorSet;
        java.util.ArrayList<android.animation.Animator> mAnimators;
        int mChangingConfigurations;
        androidx.collection.ArrayMap<android.animation.Animator, java.lang.String> mTargetNameMap;
        androidx.vectordrawable.graphics.drawable.VectorDrawableCompat mVectorDrawable;

        public AnimatedVectorDrawableCompatState(android.content.Context context, androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.AnimatedVectorDrawableCompatState animatedVectorDrawableCompatState, android.graphics.drawable.Drawable.Callback callback, android.content.res.Resources resources) {
            if (animatedVectorDrawableCompatState != null) {
                this.mChangingConfigurations = animatedVectorDrawableCompatState.mChangingConfigurations;
                androidx.vectordrawable.graphics.drawable.VectorDrawableCompat vectorDrawableCompat = animatedVectorDrawableCompatState.mVectorDrawable;
                if (vectorDrawableCompat != null) {
                    android.graphics.drawable.Drawable.ConstantState constantState = vectorDrawableCompat.getConstantState();
                    if (resources != null) {
                        this.mVectorDrawable = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat) constantState.newDrawable(resources);
                    } else {
                        this.mVectorDrawable = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat) constantState.newDrawable();
                    }
                    androidx.vectordrawable.graphics.drawable.VectorDrawableCompat vectorDrawableCompat2 = (androidx.vectordrawable.graphics.drawable.VectorDrawableCompat) this.mVectorDrawable.mutate();
                    this.mVectorDrawable = vectorDrawableCompat2;
                    vectorDrawableCompat2.setCallback(callback);
                    this.mVectorDrawable.setBounds(animatedVectorDrawableCompatState.mVectorDrawable.getBounds());
                    this.mVectorDrawable.setAllowCaching(false);
                }
                java.util.ArrayList<android.animation.Animator> arrayList = animatedVectorDrawableCompatState.mAnimators;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.mAnimators = new java.util.ArrayList<>(size);
                    this.mTargetNameMap = new androidx.collection.ArrayMap<>(size);
                    for (int i = 0; i < size; i++) {
                        android.animation.Animator animator = animatedVectorDrawableCompatState.mAnimators.get(i);
                        android.animation.Animator animatorClone = animator.clone();
                        java.lang.String str = animatedVectorDrawableCompatState.mTargetNameMap.get(animator);
                        animatorClone.setTarget(this.mVectorDrawable.getTargetByName(str));
                        this.mAnimators.add(animatorClone);
                        this.mTargetNameMap.put(animatorClone, str);
                    }
                    setupAnimatorSet();
                }
            }
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable() {
            throw new java.lang.IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public android.graphics.drawable.Drawable newDrawable(android.content.res.Resources resources) {
            throw new java.lang.IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.mChangingConfigurations;
        }

        public void setupAnimatorSet() {
            if (this.mAnimatorSet == null) {
                this.mAnimatorSet = new android.animation.AnimatorSet();
            }
            this.mAnimatorSet.playTogether(this.mAnimators);
        }
    }

    private void setupColorAnimator(android.animation.Animator animator) {
        java.util.ArrayList<android.animation.Animator> childAnimations;
        if ((animator instanceof android.animation.AnimatorSet) && (childAnimations = ((android.animation.AnimatorSet) animator).getChildAnimations()) != null) {
            for (int i = 0; i < childAnimations.size(); i++) {
                setupColorAnimator(childAnimations.get(i));
            }
        }
        if (animator instanceof android.animation.ObjectAnimator) {
            android.animation.ObjectAnimator objectAnimator = (android.animation.ObjectAnimator) animator;
            java.lang.String propertyName = objectAnimator.getPropertyName();
            if ("fillColor".equals(propertyName) || "strokeColor".equals(propertyName)) {
                if (this.mArgbEvaluator == null) {
                    this.mArgbEvaluator = new android.animation.ArgbEvaluator();
                }
                objectAnimator.setEvaluator(this.mArgbEvaluator);
            }
        }
    }

    private void setupAnimatorsForTarget(java.lang.String str, android.animation.Animator animator) {
        animator.setTarget(this.mAnimatedVectorState.mVectorDrawable.getTargetByName(str));
        if (this.mAnimatedVectorState.mAnimators == null) {
            this.mAnimatedVectorState.mAnimators = new java.util.ArrayList<>();
            this.mAnimatedVectorState.mTargetNameMap = new androidx.collection.ArrayMap<>();
        }
        this.mAnimatedVectorState.mAnimators.add(animator);
        this.mAnimatedVectorState.mTargetNameMap.put(animator, str);
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        if (this.mDelegateDrawable != null) {
            return ((android.graphics.drawable.AnimatedVectorDrawable) this.mDelegateDrawable).isRunning();
        }
        return this.mAnimatedVectorState.mAnimatorSet.isRunning();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        if (this.mDelegateDrawable != null) {
            ((android.graphics.drawable.AnimatedVectorDrawable) this.mDelegateDrawable).start();
        } else {
            if (this.mAnimatedVectorState.mAnimatorSet.isStarted()) {
                return;
            }
            this.mAnimatedVectorState.mAnimatorSet.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        if (this.mDelegateDrawable != null) {
            ((android.graphics.drawable.AnimatedVectorDrawable) this.mDelegateDrawable).stop();
        } else {
            this.mAnimatedVectorState.mAnimatorSet.end();
        }
    }

    private static boolean unregisterPlatformCallback(android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        return animatedVectorDrawable.unregisterAnimationCallback(animationCallback.getPlatformCallback());
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        if (this.mDelegateDrawable != null) {
            registerPlatformCallback((android.graphics.drawable.AnimatedVectorDrawable) this.mDelegateDrawable, animationCallback);
            return;
        }
        if (animationCallback == null) {
            return;
        }
        if (this.mAnimationCallbacks == null) {
            this.mAnimationCallbacks = new java.util.ArrayList<>();
        }
        if (this.mAnimationCallbacks.contains(animationCallback)) {
            return;
        }
        this.mAnimationCallbacks.add(animationCallback);
        if (this.mAnimatorListener == null) {
            this.mAnimatorListener = new android.animation.AnimatorListenerAdapter() { // from class: androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.2
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationStart(android.animation.Animator animator) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.this.mAnimationCallbacks);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback) arrayList.get(i)).onAnimationStart(androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.this);
                    }
                }

                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public void onAnimationEnd(android.animation.Animator animator) {
                    java.util.ArrayList arrayList = new java.util.ArrayList(androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.this.mAnimationCallbacks);
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        ((androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback) arrayList.get(i)).onAnimationEnd(androidx.vectordrawable.graphics.drawable.AnimatedVectorDrawableCompat.this);
                    }
                }
            };
        }
        this.mAnimatedVectorState.mAnimatorSet.addListener(this.mAnimatorListener);
    }

    private static void registerPlatformCallback(android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        animatedVectorDrawable.registerAnimationCallback(animationCallback.getPlatformCallback());
    }

    private void removeAnimatorSetListener() {
        if (this.mAnimatorListener != null) {
            this.mAnimatedVectorState.mAnimatorSet.removeListener(this.mAnimatorListener);
            this.mAnimatorListener = null;
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        if (this.mDelegateDrawable != null) {
            unregisterPlatformCallback((android.graphics.drawable.AnimatedVectorDrawable) this.mDelegateDrawable, animationCallback);
        }
        java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> arrayList = this.mAnimationCallbacks;
        if (arrayList == null || animationCallback == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(animationCallback);
        if (this.mAnimationCallbacks.size() == 0) {
            removeAnimatorSetListener();
        }
        return zRemove;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        if (this.mDelegateDrawable != null) {
            ((android.graphics.drawable.AnimatedVectorDrawable) this.mDelegateDrawable).clearAnimationCallbacks();
            return;
        }
        removeAnimatorSetListener();
        java.util.ArrayList<androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback> arrayList = this.mAnimationCallbacks;
        if (arrayList == null) {
            return;
        }
        arrayList.clear();
    }

    public static void registerAnimationCallback(android.graphics.drawable.Drawable drawable, androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        if (drawable == null || animationCallback == null || !(drawable instanceof android.graphics.drawable.Animatable)) {
            return;
        }
        registerPlatformCallback((android.graphics.drawable.AnimatedVectorDrawable) drawable, animationCallback);
    }

    public static boolean unregisterAnimationCallback(android.graphics.drawable.Drawable drawable, androidx.vectordrawable.graphics.drawable.Animatable2Compat.AnimationCallback animationCallback) {
        if (drawable == null || animationCallback == null || !(drawable instanceof android.graphics.drawable.Animatable)) {
            return false;
        }
        return unregisterPlatformCallback((android.graphics.drawable.AnimatedVectorDrawable) drawable, animationCallback);
    }

    public static void clearAnimationCallbacks(android.graphics.drawable.Drawable drawable) {
        if (drawable instanceof android.graphics.drawable.Animatable) {
            ((android.graphics.drawable.AnimatedVectorDrawable) drawable).clearAnimationCallbacks();
        }
    }
}
