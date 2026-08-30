package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsAnimationCompat {
    private static final boolean DEBUG = false;
    private static final java.lang.String TAG = "WindowInsetsAnimCompat";
    private androidx.core.view.WindowInsetsAnimationCompat.Impl mImpl;

    public WindowInsetsAnimationCompat(int i, android.view.animation.Interpolator interpolator, long j) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new androidx.core.view.WindowInsetsAnimationCompat.Impl30(i, interpolator, j);
        } else {
            this.mImpl = new androidx.core.view.WindowInsetsAnimationCompat.Impl21(i, interpolator, j);
        }
    }

    private WindowInsetsAnimationCompat(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        this(0, null, 0L);
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new androidx.core.view.WindowInsetsAnimationCompat.Impl30(windowInsetsAnimation);
        }
    }

    public int getTypeMask() {
        return this.mImpl.getTypeMask();
    }

    public float getFraction() {
        return this.mImpl.getFraction();
    }

    public float getInterpolatedFraction() {
        return this.mImpl.getInterpolatedFraction();
    }

    public android.view.animation.Interpolator getInterpolator() {
        return this.mImpl.getInterpolator();
    }

    public long getDurationMillis() {
        return this.mImpl.getDurationMillis();
    }

    public void setFraction(float f) {
        this.mImpl.setFraction(f);
    }

    public float getAlpha() {
        return this.mImpl.getAlpha();
    }

    public void setAlpha(float f) {
        this.mImpl.setAlpha(f);
    }

    public static final class BoundsCompat {
        private final androidx.core.graphics.Insets mLowerBound;
        private final androidx.core.graphics.Insets mUpperBound;

        public BoundsCompat(androidx.core.graphics.Insets insets, androidx.core.graphics.Insets insets2) {
            this.mLowerBound = insets;
            this.mUpperBound = insets2;
        }

        private BoundsCompat(android.view.WindowInsetsAnimation.Bounds bounds) {
            this.mLowerBound = androidx.core.view.WindowInsetsAnimationCompat.Impl30.getLowerBounds(bounds);
            this.mUpperBound = androidx.core.view.WindowInsetsAnimationCompat.Impl30.getHigherBounds(bounds);
        }

        public androidx.core.graphics.Insets getLowerBound() {
            return this.mLowerBound;
        }

        public androidx.core.graphics.Insets getUpperBound() {
            return this.mUpperBound;
        }

        public androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat inset(androidx.core.graphics.Insets insets) {
            return new androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat(androidx.core.view.WindowInsetsCompat.insetInsets(this.mLowerBound, insets.left, insets.top, insets.right, insets.bottom), androidx.core.view.WindowInsetsCompat.insetInsets(this.mUpperBound, insets.left, insets.top, insets.right, insets.bottom));
        }

        public java.lang.String toString() {
            return "Bounds{lower=" + this.mLowerBound + " upper=" + this.mUpperBound + "}";
        }

        public android.view.WindowInsetsAnimation.Bounds toBounds() {
            return androidx.core.view.WindowInsetsAnimationCompat.Impl30.createPlatformBounds(this);
        }

        public static androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat toBoundsCompat(android.view.WindowInsetsAnimation.Bounds bounds) {
            return new androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat(bounds);
        }
    }

    static androidx.core.view.WindowInsetsAnimationCompat toWindowInsetsAnimationCompat(android.view.WindowInsetsAnimation windowInsetsAnimation) {
        return new androidx.core.view.WindowInsetsAnimationCompat(windowInsetsAnimation);
    }

    public static abstract class Callback {
        public static final int DISPATCH_MODE_CONTINUE_ON_SUBTREE = 1;
        public static final int DISPATCH_MODE_STOP = 0;
        android.view.WindowInsets mDispachedInsets;
        private final int mDispatchMode;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface DispatchMode {
        }

        public void onEnd(androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public void onPrepare(androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
        }

        public abstract androidx.core.view.WindowInsetsCompat onProgress(androidx.core.view.WindowInsetsCompat windowInsetsCompat, java.util.List<androidx.core.view.WindowInsetsAnimationCompat> list);

        public androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat onStart(androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat, androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
            return boundsCompat;
        }

        public Callback(int i) {
            this.mDispatchMode = i;
        }

        public final int getDispatchMode() {
            return this.mDispatchMode;
        }
    }

    static void setCallback(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat.Callback callback) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            androidx.core.view.WindowInsetsAnimationCompat.Impl30.setCallback(view, callback);
        } else {
            androidx.core.view.WindowInsetsAnimationCompat.Impl21.setCallback(view, callback);
        }
    }

    private static class Impl {
        private float mAlpha;
        private final long mDurationMillis;
        private float mFraction;
        private final android.view.animation.Interpolator mInterpolator;
        private final int mTypeMask;

        Impl(int i, android.view.animation.Interpolator interpolator, long j) {
            this.mTypeMask = i;
            this.mInterpolator = interpolator;
            this.mDurationMillis = j;
        }

        public int getTypeMask() {
            return this.mTypeMask;
        }

        public float getFraction() {
            return this.mFraction;
        }

        public float getInterpolatedFraction() {
            android.view.animation.Interpolator interpolator = this.mInterpolator;
            if (interpolator != null) {
                return interpolator.getInterpolation(this.mFraction);
            }
            return this.mFraction;
        }

        public android.view.animation.Interpolator getInterpolator() {
            return this.mInterpolator;
        }

        public long getDurationMillis() {
            return this.mDurationMillis;
        }

        public float getAlpha() {
            return this.mAlpha;
        }

        public void setFraction(float f) {
            this.mFraction = f;
        }

        public void setAlpha(float f) {
            this.mAlpha = f;
        }
    }

    private static class Impl21 extends androidx.core.view.WindowInsetsAnimationCompat.Impl {
        Impl21(int i, android.view.animation.Interpolator interpolator, long j) {
            super(i, interpolator, j);
        }

        static void setCallback(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat.Callback callback) {
            java.lang.Object tag = view.getTag(androidx.core.R.id.tag_on_apply_window_listener);
            if (callback == null) {
                view.setTag(androidx.core.R.id.tag_window_insets_animation_callback, null);
                if (tag == null) {
                    view.setOnApplyWindowInsetsListener(null);
                    return;
                }
                return;
            }
            android.view.View.OnApplyWindowInsetsListener onApplyWindowInsetsListenerCreateProxyListener = createProxyListener(view, callback);
            view.setTag(androidx.core.R.id.tag_window_insets_animation_callback, onApplyWindowInsetsListenerCreateProxyListener);
            if (tag == null) {
                view.setOnApplyWindowInsetsListener(onApplyWindowInsetsListenerCreateProxyListener);
            }
        }

        private static android.view.View.OnApplyWindowInsetsListener createProxyListener(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat.Callback callback) {
            return new androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener(view, callback);
        }

        static androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat computeAnimationBounds(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat windowInsetsCompat2, int i) {
            androidx.core.graphics.Insets insets = windowInsetsCompat.getInsets(i);
            androidx.core.graphics.Insets insets2 = windowInsetsCompat2.getInsets(i);
            return new androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat(androidx.core.graphics.Insets.of(java.lang.Math.min(insets.left, insets2.left), java.lang.Math.min(insets.top, insets2.top), java.lang.Math.min(insets.right, insets2.right), java.lang.Math.min(insets.bottom, insets2.bottom)), androidx.core.graphics.Insets.of(java.lang.Math.max(insets.left, insets2.left), java.lang.Math.max(insets.top, insets2.top), java.lang.Math.max(insets.right, insets2.right), java.lang.Math.max(insets.bottom, insets2.bottom)));
        }

        static int buildAnimationMask(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat windowInsetsCompat2) {
            int i = 0;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if (!windowInsetsCompat.getInsets(i2).equals(windowInsetsCompat2.getInsets(i2))) {
                    i |= i2;
                }
            }
            return i;
        }

        static androidx.core.view.WindowInsetsCompat interpolateInsets(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat windowInsetsCompat2, float f, int i) {
            androidx.core.view.WindowInsetsCompat.Builder builder = new androidx.core.view.WindowInsetsCompat.Builder(windowInsetsCompat);
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) == 0) {
                    builder.setInsets(i2, windowInsetsCompat.getInsets(i2));
                } else {
                    androidx.core.graphics.Insets insets = windowInsetsCompat.getInsets(i2);
                    androidx.core.graphics.Insets insets2 = windowInsetsCompat2.getInsets(i2);
                    float f2 = 1.0f - f;
                    builder.setInsets(i2, androidx.core.view.WindowInsetsCompat.insetInsets(insets, (int) (((double) ((insets.left - insets2.left) * f2)) + 0.5d), (int) (((double) ((insets.top - insets2.top) * f2)) + 0.5d), (int) (((double) ((insets.right - insets2.right) * f2)) + 0.5d), (int) (((double) ((insets.bottom - insets2.bottom) * f2)) + 0.5d)));
                }
            }
            return builder.build();
        }

        private static class Impl21OnApplyWindowInsetsListener implements android.view.View.OnApplyWindowInsetsListener {
            private static final int COMPAT_ANIMATION_DURATION = 160;
            final androidx.core.view.WindowInsetsAnimationCompat.Callback mCallback;
            private androidx.core.view.WindowInsetsCompat mLastInsets;

            Impl21OnApplyWindowInsetsListener(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat.Callback callback) {
                this.mCallback = callback;
                androidx.core.view.WindowInsetsCompat rootWindowInsets = androidx.core.view.ViewCompat.getRootWindowInsets(view);
                this.mLastInsets = rootWindowInsets != null ? new androidx.core.view.WindowInsetsCompat.Builder(rootWindowInsets).build() : null;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public android.view.WindowInsets onApplyWindowInsets(final android.view.View view, android.view.WindowInsets windowInsets) {
                if (!view.isLaidOut()) {
                    this.mLastInsets = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                    return androidx.core.view.WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(view, windowInsets);
                }
                final androidx.core.view.WindowInsetsCompat windowInsetsCompat = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(windowInsets, view);
                if (this.mLastInsets == null) {
                    this.mLastInsets = androidx.core.view.ViewCompat.getRootWindowInsets(view);
                }
                if (this.mLastInsets == null) {
                    this.mLastInsets = windowInsetsCompat;
                    return androidx.core.view.WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(view, windowInsets);
                }
                androidx.core.view.WindowInsetsAnimationCompat.Callback callback = androidx.core.view.WindowInsetsAnimationCompat.Impl21.getCallback(view);
                if (callback != null && java.util.Objects.equals(callback.mDispachedInsets, windowInsets)) {
                    return androidx.core.view.WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(view, windowInsets);
                }
                final int iBuildAnimationMask = androidx.core.view.WindowInsetsAnimationCompat.Impl21.buildAnimationMask(windowInsetsCompat, this.mLastInsets);
                if (iBuildAnimationMask == 0) {
                    return androidx.core.view.WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(view, windowInsets);
                }
                final androidx.core.view.WindowInsetsCompat windowInsetsCompat2 = this.mLastInsets;
                final androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat = new androidx.core.view.WindowInsetsAnimationCompat(iBuildAnimationMask, new android.view.animation.DecelerateInterpolator(), 160L);
                windowInsetsAnimationCompat.setFraction(0.0f);
                final android.animation.ValueAnimator duration = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(windowInsetsAnimationCompat.getDurationMillis());
                final androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat boundsCompatComputeAnimationBounds = androidx.core.view.WindowInsetsAnimationCompat.Impl21.computeAnimationBounds(windowInsetsCompat, windowInsetsCompat2, iBuildAnimationMask);
                androidx.core.view.WindowInsetsAnimationCompat.Impl21.dispatchOnPrepare(view, windowInsetsAnimationCompat, windowInsets, false);
                duration.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.1
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                        windowInsetsAnimationCompat.setFraction(valueAnimator.getAnimatedFraction());
                        androidx.core.view.WindowInsetsAnimationCompat.Impl21.dispatchOnProgress(view, androidx.core.view.WindowInsetsAnimationCompat.Impl21.interpolateInsets(windowInsetsCompat, windowInsetsCompat2, windowInsetsAnimationCompat.getInterpolatedFraction(), iBuildAnimationMask), java.util.Collections.singletonList(windowInsetsAnimationCompat));
                    }
                });
                duration.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.2
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public void onAnimationEnd(android.animation.Animator animator) {
                        windowInsetsAnimationCompat.setFraction(1.0f);
                        androidx.core.view.WindowInsetsAnimationCompat.Impl21.dispatchOnEnd(view, windowInsetsAnimationCompat);
                    }
                });
                androidx.core.view.OneShotPreDrawListener.add(view, new java.lang.Runnable() { // from class: androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener.3
                    @Override // java.lang.Runnable
                    public void run() {
                        androidx.core.view.WindowInsetsAnimationCompat.Impl21.dispatchOnStart(view, windowInsetsAnimationCompat, boundsCompatComputeAnimationBounds);
                        duration.start();
                    }
                });
                this.mLastInsets = windowInsetsCompat;
                return androidx.core.view.WindowInsetsAnimationCompat.Impl21.forwardToViewIfNeeded(view, windowInsets);
            }
        }

        static android.view.WindowInsets forwardToViewIfNeeded(android.view.View view, android.view.WindowInsets windowInsets) {
            return view.getTag(androidx.core.R.id.tag_on_apply_window_listener) != null ? windowInsets : view.onApplyWindowInsets(windowInsets);
        }

        static void dispatchOnPrepare(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat, android.view.WindowInsets windowInsets, boolean z) {
            androidx.core.view.WindowInsetsAnimationCompat.Callback callback = getCallback(view);
            if (callback != null) {
                callback.mDispachedInsets = windowInsets;
                if (!z) {
                    callback.onPrepare(windowInsetsAnimationCompat);
                    z = callback.getDispatchMode() == 0;
                }
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    dispatchOnPrepare(viewGroup.getChildAt(i), windowInsetsAnimationCompat, windowInsets, z);
                }
            }
        }

        static void dispatchOnStart(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat, androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
            androidx.core.view.WindowInsetsAnimationCompat.Callback callback = getCallback(view);
            if (callback != null) {
                callback.onStart(windowInsetsAnimationCompat, boundsCompat);
                if (callback.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    dispatchOnStart(viewGroup.getChildAt(i), windowInsetsAnimationCompat, boundsCompat);
                }
            }
        }

        static void dispatchOnProgress(android.view.View view, androidx.core.view.WindowInsetsCompat windowInsetsCompat, java.util.List<androidx.core.view.WindowInsetsAnimationCompat> list) {
            androidx.core.view.WindowInsetsAnimationCompat.Callback callback = getCallback(view);
            if (callback != null) {
                windowInsetsCompat = callback.onProgress(windowInsetsCompat, list);
                if (callback.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    dispatchOnProgress(viewGroup.getChildAt(i), windowInsetsCompat, list);
                }
            }
        }

        static void dispatchOnEnd(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat) {
            androidx.core.view.WindowInsetsAnimationCompat.Callback callback = getCallback(view);
            if (callback != null) {
                callback.onEnd(windowInsetsAnimationCompat);
                if (callback.getDispatchMode() == 0) {
                    return;
                }
            }
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    dispatchOnEnd(viewGroup.getChildAt(i), windowInsetsAnimationCompat);
                }
            }
        }

        static androidx.core.view.WindowInsetsAnimationCompat.Callback getCallback(android.view.View view) {
            java.lang.Object tag = view.getTag(androidx.core.R.id.tag_window_insets_animation_callback);
            if (tag instanceof androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener) {
                return ((androidx.core.view.WindowInsetsAnimationCompat.Impl21.Impl21OnApplyWindowInsetsListener) tag).mCallback;
            }
            return null;
        }
    }

    private static class Impl30 extends androidx.core.view.WindowInsetsAnimationCompat.Impl {
        private final android.view.WindowInsetsAnimation mWrapped;

        Impl30(android.view.WindowInsetsAnimation windowInsetsAnimation) {
            super(0, null, 0L);
            this.mWrapped = windowInsetsAnimation;
        }

        Impl30(int i, android.view.animation.Interpolator interpolator, long j) {
            this(new android.view.WindowInsetsAnimation(i, interpolator, j));
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public int getTypeMask() {
            return this.mWrapped.getTypeMask();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public android.view.animation.Interpolator getInterpolator() {
            return this.mWrapped.getInterpolator();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public long getDurationMillis() {
            return this.mWrapped.getDurationMillis();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getFraction() {
            return this.mWrapped.getFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public void setFraction(float f) {
            this.mWrapped.setFraction(f);
        }

        @Override // androidx.core.view.WindowInsetsAnimationCompat.Impl
        public float getInterpolatedFraction() {
            return this.mWrapped.getInterpolatedFraction();
        }

        private static class ProxyCallback extends android.view.WindowInsetsAnimation.Callback {
            private final java.util.HashMap<android.view.WindowInsetsAnimation, androidx.core.view.WindowInsetsAnimationCompat> mAnimations;
            private final androidx.core.view.WindowInsetsAnimationCompat.Callback mCompat;
            private java.util.List<androidx.core.view.WindowInsetsAnimationCompat> mRORunningAnimations;
            private java.util.ArrayList<androidx.core.view.WindowInsetsAnimationCompat> mTmpRunningAnimations;

            ProxyCallback(androidx.core.view.WindowInsetsAnimationCompat.Callback callback) {
                super(callback.getDispatchMode());
                this.mAnimations = new java.util.HashMap<>();
                this.mCompat = callback;
            }

            private androidx.core.view.WindowInsetsAnimationCompat getWindowInsetsAnimationCompat(android.view.WindowInsetsAnimation windowInsetsAnimation) {
                androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat = this.mAnimations.get(windowInsetsAnimation);
                if (windowInsetsAnimationCompat != null) {
                    return windowInsetsAnimationCompat;
                }
                androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat2 = androidx.core.view.WindowInsetsAnimationCompat.toWindowInsetsAnimationCompat(windowInsetsAnimation);
                this.mAnimations.put(windowInsetsAnimation, windowInsetsAnimationCompat2);
                return windowInsetsAnimationCompat2;
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onPrepare(android.view.WindowInsetsAnimation windowInsetsAnimation) {
                this.mCompat.onPrepare(getWindowInsetsAnimationCompat(windowInsetsAnimation));
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public android.view.WindowInsetsAnimation.Bounds onStart(android.view.WindowInsetsAnimation windowInsetsAnimation, android.view.WindowInsetsAnimation.Bounds bounds) {
                return this.mCompat.onStart(getWindowInsetsAnimationCompat(windowInsetsAnimation), androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat.toBoundsCompat(bounds)).toBounds();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public android.view.WindowInsets onProgress(android.view.WindowInsets windowInsets, java.util.List<android.view.WindowInsetsAnimation> list) {
                java.util.ArrayList<androidx.core.view.WindowInsetsAnimationCompat> arrayList = this.mTmpRunningAnimations;
                if (arrayList == null) {
                    java.util.ArrayList<androidx.core.view.WindowInsetsAnimationCompat> arrayList2 = new java.util.ArrayList<>(list.size());
                    this.mTmpRunningAnimations = arrayList2;
                    this.mRORunningAnimations = java.util.Collections.unmodifiableList(arrayList2);
                } else {
                    arrayList.clear();
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    android.view.WindowInsetsAnimation windowInsetsAnimation = list.get(size);
                    androidx.core.view.WindowInsetsAnimationCompat windowInsetsAnimationCompat = getWindowInsetsAnimationCompat(windowInsetsAnimation);
                    windowInsetsAnimationCompat.setFraction(windowInsetsAnimation.getFraction());
                    this.mTmpRunningAnimations.add(windowInsetsAnimationCompat);
                }
                return this.mCompat.onProgress(androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(windowInsets), this.mRORunningAnimations).toWindowInsets();
            }

            @Override // android.view.WindowInsetsAnimation.Callback
            public void onEnd(android.view.WindowInsetsAnimation windowInsetsAnimation) {
                this.mCompat.onEnd(getWindowInsetsAnimationCompat(windowInsetsAnimation));
                this.mAnimations.remove(windowInsetsAnimation);
            }
        }

        public static void setCallback(android.view.View view, androidx.core.view.WindowInsetsAnimationCompat.Callback callback) {
            view.setWindowInsetsAnimationCallback(callback != null ? new androidx.core.view.WindowInsetsAnimationCompat.Impl30.ProxyCallback(callback) : null);
        }

        public static android.view.WindowInsetsAnimation.Bounds createPlatformBounds(androidx.core.view.WindowInsetsAnimationCompat.BoundsCompat boundsCompat) {
            return new android.view.WindowInsetsAnimation.Bounds(boundsCompat.getLowerBound().toPlatformInsets(), boundsCompat.getUpperBound().toPlatformInsets());
        }

        public static androidx.core.graphics.Insets getLowerBounds(android.view.WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.Insets.toCompatInsets(bounds.getLowerBound());
        }

        public static androidx.core.graphics.Insets getHigherBounds(android.view.WindowInsetsAnimation.Bounds bounds) {
            return androidx.core.graphics.Insets.toCompatInsets(bounds.getUpperBound());
        }
    }
}
