package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public class WindowInsetsCompat {
    public static final androidx.core.view.WindowInsetsCompat CONSUMED;
    private static final java.lang.String TAG = "WindowInsetsCompat";
    private final androidx.core.view.WindowInsetsCompat.Impl mImpl;

    static {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            CONSUMED = androidx.core.view.WindowInsetsCompat.Impl30.CONSUMED;
        } else {
            CONSUMED = androidx.core.view.WindowInsetsCompat.Impl.CONSUMED;
        }
    }

    private WindowInsetsCompat(android.view.WindowInsets windowInsets) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new androidx.core.view.WindowInsetsCompat.Impl30(this, windowInsets);
            return;
        }
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            this.mImpl = new androidx.core.view.WindowInsetsCompat.Impl29(this, windowInsets);
        } else if (android.os.Build.VERSION.SDK_INT >= 28) {
            this.mImpl = new androidx.core.view.WindowInsetsCompat.Impl28(this, windowInsets);
        } else {
            this.mImpl = new androidx.core.view.WindowInsetsCompat.Impl21(this, windowInsets);
        }
    }

    public WindowInsetsCompat(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        if (windowInsetsCompat != null) {
            androidx.core.view.WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
            if (android.os.Build.VERSION.SDK_INT >= 30 && (impl instanceof androidx.core.view.WindowInsetsCompat.Impl30)) {
                this.mImpl = new androidx.core.view.WindowInsetsCompat.Impl30(this, (androidx.core.view.WindowInsetsCompat.Impl30) impl);
            } else if (android.os.Build.VERSION.SDK_INT >= 29 && (impl instanceof androidx.core.view.WindowInsetsCompat.Impl29)) {
                this.mImpl = new androidx.core.view.WindowInsetsCompat.Impl29(this, (androidx.core.view.WindowInsetsCompat.Impl29) impl);
            } else if (android.os.Build.VERSION.SDK_INT >= 28 && (impl instanceof androidx.core.view.WindowInsetsCompat.Impl28)) {
                this.mImpl = new androidx.core.view.WindowInsetsCompat.Impl28(this, (androidx.core.view.WindowInsetsCompat.Impl28) impl);
            } else if (impl instanceof androidx.core.view.WindowInsetsCompat.Impl21) {
                this.mImpl = new androidx.core.view.WindowInsetsCompat.Impl21(this, (androidx.core.view.WindowInsetsCompat.Impl21) impl);
            } else if (impl instanceof androidx.core.view.WindowInsetsCompat.Impl20) {
                this.mImpl = new androidx.core.view.WindowInsetsCompat.Impl20(this, (androidx.core.view.WindowInsetsCompat.Impl20) impl);
            } else {
                this.mImpl = new androidx.core.view.WindowInsetsCompat.Impl(this);
            }
            impl.copyWindowDataInto(this);
            return;
        }
        this.mImpl = new androidx.core.view.WindowInsetsCompat.Impl(this);
    }

    public static androidx.core.view.WindowInsetsCompat toWindowInsetsCompat(android.view.WindowInsets windowInsets) {
        return toWindowInsetsCompat(windowInsets, null);
    }

    public static androidx.core.view.WindowInsetsCompat toWindowInsetsCompat(android.view.WindowInsets windowInsets, android.view.View view) {
        androidx.core.view.WindowInsetsCompat windowInsetsCompat = new androidx.core.view.WindowInsetsCompat((android.view.WindowInsets) androidx.core.util.Preconditions.checkNotNull(windowInsets));
        if (view != null && androidx.core.view.ViewCompat.isAttachedToWindow(view)) {
            windowInsetsCompat.setRootWindowInsets(androidx.core.view.ViewCompat.getRootWindowInsets(view));
            windowInsetsCompat.copyRootViewBounds(view.getRootView());
        }
        return windowInsetsCompat;
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetLeft() {
        return this.mImpl.getSystemWindowInsets().left;
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetTop() {
        return this.mImpl.getSystemWindowInsets().top;
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetRight() {
        return this.mImpl.getSystemWindowInsets().right;
    }

    @java.lang.Deprecated
    public int getSystemWindowInsetBottom() {
        return this.mImpl.getSystemWindowInsets().bottom;
    }

    @java.lang.Deprecated
    public boolean hasSystemWindowInsets() {
        return !this.mImpl.getSystemWindowInsets().equals(androidx.core.graphics.Insets.NONE);
    }

    public boolean hasInsets() {
        return (getInsets(androidx.core.view.WindowInsetsCompat.Type.all()).equals(androidx.core.graphics.Insets.NONE) && getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.Type.all() ^ androidx.core.view.WindowInsetsCompat.Type.ime()).equals(androidx.core.graphics.Insets.NONE) && getDisplayCutout() == null) ? false : true;
    }

    public boolean isConsumed() {
        return this.mImpl.isConsumed();
    }

    public boolean isRound() {
        return this.mImpl.isRound();
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat consumeSystemWindowInsets() {
        return this.mImpl.consumeSystemWindowInsets();
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat replaceSystemWindowInsets(int i, int i2, int i3, int i4) {
        return new androidx.core.view.WindowInsetsCompat.Builder(this).setSystemWindowInsets(androidx.core.graphics.Insets.of(i, i2, i3, i4)).build();
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat replaceSystemWindowInsets(android.graphics.Rect rect) {
        return new androidx.core.view.WindowInsetsCompat.Builder(this).setSystemWindowInsets(androidx.core.graphics.Insets.of(rect)).build();
    }

    @java.lang.Deprecated
    public int getStableInsetTop() {
        return this.mImpl.getStableInsets().top;
    }

    @java.lang.Deprecated
    public int getStableInsetLeft() {
        return this.mImpl.getStableInsets().left;
    }

    @java.lang.Deprecated
    public int getStableInsetRight() {
        return this.mImpl.getStableInsets().right;
    }

    @java.lang.Deprecated
    public int getStableInsetBottom() {
        return this.mImpl.getStableInsets().bottom;
    }

    @java.lang.Deprecated
    public boolean hasStableInsets() {
        return !this.mImpl.getStableInsets().equals(androidx.core.graphics.Insets.NONE);
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat consumeStableInsets() {
        return this.mImpl.consumeStableInsets();
    }

    public androidx.core.view.DisplayCutoutCompat getDisplayCutout() {
        return this.mImpl.getDisplayCutout();
    }

    @java.lang.Deprecated
    public androidx.core.view.WindowInsetsCompat consumeDisplayCutout() {
        return this.mImpl.consumeDisplayCutout();
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getSystemWindowInsets() {
        return this.mImpl.getSystemWindowInsets();
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getStableInsets() {
        return this.mImpl.getStableInsets();
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getMandatorySystemGestureInsets() {
        return this.mImpl.getMandatorySystemGestureInsets();
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getTappableElementInsets() {
        return this.mImpl.getTappableElementInsets();
    }

    @java.lang.Deprecated
    public androidx.core.graphics.Insets getSystemGestureInsets() {
        return this.mImpl.getSystemGestureInsets();
    }

    public androidx.core.view.WindowInsetsCompat inset(androidx.core.graphics.Insets insets) {
        return inset(insets.left, insets.top, insets.right, insets.bottom);
    }

    public androidx.core.view.WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
        return this.mImpl.inset(i, i2, i3, i4);
    }

    public androidx.core.graphics.Insets getInsets(int i) {
        return this.mImpl.getInsets(i);
    }

    public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int i) {
        return this.mImpl.getInsetsIgnoringVisibility(i);
    }

    public boolean isVisible(int i) {
        return this.mImpl.isVisible(i);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof androidx.core.view.WindowInsetsCompat) {
            return androidx.core.util.ObjectsCompat.equals(this.mImpl, ((androidx.core.view.WindowInsetsCompat) obj).mImpl);
        }
        return false;
    }

    public int hashCode() {
        androidx.core.view.WindowInsetsCompat.Impl impl = this.mImpl;
        if (impl == null) {
            return 0;
        }
        return impl.hashCode();
    }

    public android.view.WindowInsets toWindowInsets() {
        androidx.core.view.WindowInsetsCompat.Impl impl = this.mImpl;
        if (impl instanceof androidx.core.view.WindowInsetsCompat.Impl20) {
            return ((androidx.core.view.WindowInsetsCompat.Impl20) impl).mPlatformInsets;
        }
        return null;
    }

    private static class Impl {
        static final androidx.core.view.WindowInsetsCompat CONSUMED = new androidx.core.view.WindowInsetsCompat.Builder().build().consumeDisplayCutout().consumeStableInsets().consumeSystemWindowInsets();
        final androidx.core.view.WindowInsetsCompat mHost;

        void copyRootViewBounds(android.view.View view) {
        }

        void copyWindowDataInto(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        }

        androidx.core.view.DisplayCutoutCompat getDisplayCutout() {
            return null;
        }

        boolean isConsumed() {
            return false;
        }

        boolean isRound() {
            return false;
        }

        boolean isVisible(int i) {
            return true;
        }

        public void setOverriddenInsets(androidx.core.graphics.Insets[] insetsArr) {
        }

        void setRootViewData(androidx.core.graphics.Insets insets) {
        }

        void setRootWindowInsets(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        }

        public void setStableInsets(androidx.core.graphics.Insets insets) {
        }

        Impl(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            this.mHost = windowInsetsCompat;
        }

        androidx.core.view.WindowInsetsCompat consumeSystemWindowInsets() {
            return this.mHost;
        }

        androidx.core.view.WindowInsetsCompat consumeStableInsets() {
            return this.mHost;
        }

        androidx.core.view.WindowInsetsCompat consumeDisplayCutout() {
            return this.mHost;
        }

        androidx.core.graphics.Insets getSystemWindowInsets() {
            return androidx.core.graphics.Insets.NONE;
        }

        androidx.core.graphics.Insets getStableInsets() {
            return androidx.core.graphics.Insets.NONE;
        }

        androidx.core.graphics.Insets getSystemGestureInsets() {
            return getSystemWindowInsets();
        }

        androidx.core.graphics.Insets getMandatorySystemGestureInsets() {
            return getSystemWindowInsets();
        }

        androidx.core.graphics.Insets getTappableElementInsets() {
            return getSystemWindowInsets();
        }

        androidx.core.view.WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            return CONSUMED;
        }

        androidx.core.graphics.Insets getInsets(int i) {
            return androidx.core.graphics.Insets.NONE;
        }

        androidx.core.graphics.Insets getInsetsIgnoringVisibility(int i) {
            if ((i & 8) != 0) {
                throw new java.lang.IllegalArgumentException("Unable to query the maximum insets for IME");
            }
            return androidx.core.graphics.Insets.NONE;
        }

        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.core.view.WindowInsetsCompat.Impl)) {
                return false;
            }
            androidx.core.view.WindowInsetsCompat.Impl impl = (androidx.core.view.WindowInsetsCompat.Impl) obj;
            return isRound() == impl.isRound() && isConsumed() == impl.isConsumed() && androidx.core.util.ObjectsCompat.equals(getSystemWindowInsets(), impl.getSystemWindowInsets()) && androidx.core.util.ObjectsCompat.equals(getStableInsets(), impl.getStableInsets()) && androidx.core.util.ObjectsCompat.equals(getDisplayCutout(), impl.getDisplayCutout());
        }

        public int hashCode() {
            return androidx.core.util.ObjectsCompat.hash(java.lang.Boolean.valueOf(isRound()), java.lang.Boolean.valueOf(isConsumed()), getSystemWindowInsets(), getStableInsets(), getDisplayCutout());
        }
    }

    private static class Impl20 extends androidx.core.view.WindowInsetsCompat.Impl {
        private static java.lang.Class<?> sAttachInfoClass = null;
        private static java.lang.reflect.Field sAttachInfoField = null;
        private static java.lang.reflect.Method sGetViewRootImplMethod = null;
        private static java.lang.reflect.Field sVisibleInsetsField = null;
        private static boolean sVisibleRectReflectionFetched = false;
        private androidx.core.graphics.Insets[] mOverriddenInsets;
        final android.view.WindowInsets mPlatformInsets;
        androidx.core.graphics.Insets mRootViewVisibleInsets;
        private androidx.core.view.WindowInsetsCompat mRootWindowInsets;
        private androidx.core.graphics.Insets mSystemWindowInsets;

        Impl20(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.view.WindowInsets windowInsets) {
            super(windowInsetsCompat);
            this.mSystemWindowInsets = null;
            this.mPlatformInsets = windowInsets;
        }

        Impl20(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Impl20 impl20) {
            this(windowInsetsCompat, new android.view.WindowInsets(impl20.mPlatformInsets));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isRound() {
            return this.mPlatformInsets.isRound();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsets(int i) {
            return getInsets(i, false);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int i) {
            return getInsets(i, true);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isVisible(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0 && !isTypeVisible(i2)) {
                    return false;
                }
            }
            return true;
        }

        private androidx.core.graphics.Insets getInsets(int i, boolean z) {
            androidx.core.graphics.Insets insetsMax = androidx.core.graphics.Insets.NONE;
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    insetsMax = androidx.core.graphics.Insets.max(insetsMax, getInsetsForType(i2, z));
                }
            }
            return insetsMax;
        }

        protected androidx.core.graphics.Insets getInsetsForType(int i, boolean z) {
            androidx.core.graphics.Insets stableInsets;
            androidx.core.view.DisplayCutoutCompat displayCutout;
            if (i == 1) {
                if (z) {
                    return androidx.core.graphics.Insets.of(0, java.lang.Math.max(getRootStableInsets().top, getSystemWindowInsets().top), 0, 0);
                }
                return androidx.core.graphics.Insets.of(0, getSystemWindowInsets().top, 0, 0);
            }
            if (i == 2) {
                if (z) {
                    androidx.core.graphics.Insets rootStableInsets = getRootStableInsets();
                    androidx.core.graphics.Insets stableInsets2 = getStableInsets();
                    return androidx.core.graphics.Insets.of(java.lang.Math.max(rootStableInsets.left, stableInsets2.left), 0, java.lang.Math.max(rootStableInsets.right, stableInsets2.right), java.lang.Math.max(rootStableInsets.bottom, stableInsets2.bottom));
                }
                androidx.core.graphics.Insets systemWindowInsets = getSystemWindowInsets();
                androidx.core.view.WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
                stableInsets = windowInsetsCompat != null ? windowInsetsCompat.getStableInsets() : null;
                int iMin = systemWindowInsets.bottom;
                if (stableInsets != null) {
                    iMin = java.lang.Math.min(iMin, stableInsets.bottom);
                }
                return androidx.core.graphics.Insets.of(systemWindowInsets.left, 0, systemWindowInsets.right, iMin);
            }
            if (i == 8) {
                androidx.core.graphics.Insets[] insetsArr = this.mOverriddenInsets;
                stableInsets = insetsArr != null ? insetsArr[androidx.core.view.WindowInsetsCompat.Type.indexOf(8)] : null;
                if (stableInsets != null) {
                    return stableInsets;
                }
                androidx.core.graphics.Insets systemWindowInsets2 = getSystemWindowInsets();
                androidx.core.graphics.Insets rootStableInsets2 = getRootStableInsets();
                if (systemWindowInsets2.bottom > rootStableInsets2.bottom) {
                    return androidx.core.graphics.Insets.of(0, 0, 0, systemWindowInsets2.bottom);
                }
                androidx.core.graphics.Insets insets = this.mRootViewVisibleInsets;
                if (insets != null && !insets.equals(androidx.core.graphics.Insets.NONE) && this.mRootViewVisibleInsets.bottom > rootStableInsets2.bottom) {
                    return androidx.core.graphics.Insets.of(0, 0, 0, this.mRootViewVisibleInsets.bottom);
                }
                return androidx.core.graphics.Insets.NONE;
            }
            if (i == 16) {
                return getSystemGestureInsets();
            }
            if (i == 32) {
                return getMandatorySystemGestureInsets();
            }
            if (i == 64) {
                return getTappableElementInsets();
            }
            if (i == 128) {
                androidx.core.view.WindowInsetsCompat windowInsetsCompat2 = this.mRootWindowInsets;
                if (windowInsetsCompat2 != null) {
                    displayCutout = windowInsetsCompat2.getDisplayCutout();
                } else {
                    displayCutout = getDisplayCutout();
                }
                if (displayCutout != null) {
                    return androidx.core.graphics.Insets.of(displayCutout.getSafeInsetLeft(), displayCutout.getSafeInsetTop(), displayCutout.getSafeInsetRight(), displayCutout.getSafeInsetBottom());
                }
                return androidx.core.graphics.Insets.NONE;
            }
            return androidx.core.graphics.Insets.NONE;
        }

        protected boolean isTypeVisible(int i) {
            if (i != 1 && i != 2) {
                if (i == 4) {
                    return false;
                }
                if (i != 8 && i != 128) {
                    return true;
                }
            }
            return !getInsetsForType(i, false).equals(androidx.core.graphics.Insets.NONE);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final androidx.core.graphics.Insets getSystemWindowInsets() {
            if (this.mSystemWindowInsets == null) {
                this.mSystemWindowInsets = androidx.core.graphics.Insets.of(this.mPlatformInsets.getSystemWindowInsetLeft(), this.mPlatformInsets.getSystemWindowInsetTop(), this.mPlatformInsets.getSystemWindowInsetRight(), this.mPlatformInsets.getSystemWindowInsetBottom());
            }
            return this.mSystemWindowInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            androidx.core.view.WindowInsetsCompat.Builder builder = new androidx.core.view.WindowInsetsCompat.Builder(androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets));
            builder.setSystemWindowInsets(androidx.core.view.WindowInsetsCompat.insetInsets(getSystemWindowInsets(), i, i2, i3, i4));
            builder.setStableInsets(androidx.core.view.WindowInsetsCompat.insetInsets(getStableInsets(), i, i2, i3, i4));
            return builder.build();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyWindowDataInto(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            windowInsetsCompat.setRootWindowInsets(this.mRootWindowInsets);
            windowInsetsCompat.setRootViewData(this.mRootViewVisibleInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootWindowInsets(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            this.mRootWindowInsets = windowInsetsCompat;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void setRootViewData(androidx.core.graphics.Insets insets) {
            this.mRootViewVisibleInsets = insets;
        }

        private androidx.core.graphics.Insets getRootStableInsets() {
            androidx.core.view.WindowInsetsCompat windowInsetsCompat = this.mRootWindowInsets;
            if (windowInsetsCompat != null) {
                return windowInsetsCompat.getStableInsets();
            }
            return androidx.core.graphics.Insets.NONE;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        void copyRootViewBounds(android.view.View view) {
            androidx.core.graphics.Insets visibleInsets = getVisibleInsets(view);
            if (visibleInsets == null) {
                visibleInsets = androidx.core.graphics.Insets.NONE;
            }
            setRootViewData(visibleInsets);
        }

        private androidx.core.graphics.Insets getVisibleInsets(android.view.View view) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                throw new java.lang.UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!sVisibleRectReflectionFetched) {
                loadReflectionField();
            }
            java.lang.reflect.Method method = sGetViewRootImplMethod;
            if (method != null && sAttachInfoClass != null && sVisibleInsetsField != null) {
                try {
                    java.lang.Object objInvoke = method.invoke(view, new java.lang.Object[0]);
                    if (objInvoke == null) {
                        android.util.Log.w(androidx.core.view.WindowInsetsCompat.TAG, "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new java.lang.NullPointerException());
                        return null;
                    }
                    android.graphics.Rect rect = (android.graphics.Rect) sVisibleInsetsField.get(sAttachInfoField.get(objInvoke));
                    if (rect != null) {
                        return androidx.core.graphics.Insets.of(rect);
                    }
                    return null;
                } catch (java.lang.ReflectiveOperationException e) {
                    android.util.Log.e(androidx.core.view.WindowInsetsCompat.TAG, "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
                }
            }
            return null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setOverriddenInsets(androidx.core.graphics.Insets[] insetsArr) {
            this.mOverriddenInsets = insetsArr;
        }

        private static void loadReflectionField() {
            try {
                sGetViewRootImplMethod = android.view.View.class.getDeclaredMethod("getViewRootImpl", new java.lang.Class[0]);
                java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
                sAttachInfoClass = cls;
                sVisibleInsetsField = cls.getDeclaredField("mVisibleInsets");
                sAttachInfoField = java.lang.Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                sVisibleInsetsField.setAccessible(true);
                sAttachInfoField.setAccessible(true);
            } catch (java.lang.ReflectiveOperationException e) {
                android.util.Log.e(androidx.core.view.WindowInsetsCompat.TAG, "Failed to get visible insets. (Reflection error). " + e.getMessage(), e);
            }
            sVisibleRectReflectionFetched = true;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(java.lang.Object obj) {
            if (super.equals(obj)) {
                return java.util.Objects.equals(this.mRootViewVisibleInsets, ((androidx.core.view.WindowInsetsCompat.Impl20) obj).mRootViewVisibleInsets);
            }
            return false;
        }
    }

    private static class Impl21 extends androidx.core.view.WindowInsetsCompat.Impl20 {
        private androidx.core.graphics.Insets mStableInsets;

        Impl21(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.view.WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mStableInsets = null;
        }

        Impl21(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Impl21 impl21) {
            super(windowInsetsCompat, impl21);
            this.mStableInsets = null;
            this.mStableInsets = impl21.mStableInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        boolean isConsumed() {
            return this.mPlatformInsets.isConsumed();
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat consumeStableInsets() {
            return androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeStableInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat consumeSystemWindowInsets() {
            return androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeSystemWindowInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        final androidx.core.graphics.Insets getStableInsets() {
            if (this.mStableInsets == null) {
                this.mStableInsets = androidx.core.graphics.Insets.of(this.mPlatformInsets.getStableInsetLeft(), this.mPlatformInsets.getStableInsetTop(), this.mPlatformInsets.getStableInsetRight(), this.mPlatformInsets.getStableInsetBottom());
            }
            return this.mStableInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(androidx.core.graphics.Insets insets) {
            this.mStableInsets = insets;
        }
    }

    private static class Impl28 extends androidx.core.view.WindowInsetsCompat.Impl21 {
        Impl28(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.view.WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        Impl28(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Impl28 impl28) {
            super(windowInsetsCompat, impl28);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.DisplayCutoutCompat getDisplayCutout() {
            return androidx.core.view.DisplayCutoutCompat.wrap(this.mPlatformInsets.getDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat consumeDisplayCutout() {
            return androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.consumeDisplayCutout());
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean equals(java.lang.Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof androidx.core.view.WindowInsetsCompat.Impl28)) {
                return false;
            }
            androidx.core.view.WindowInsetsCompat.Impl28 impl28 = (androidx.core.view.WindowInsetsCompat.Impl28) obj;
            return java.util.Objects.equals(this.mPlatformInsets, impl28.mPlatformInsets) && java.util.Objects.equals(this.mRootViewVisibleInsets, impl28.mRootViewVisibleInsets);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        public int hashCode() {
            return this.mPlatformInsets.hashCode();
        }
    }

    private static class Impl29 extends androidx.core.view.WindowInsetsCompat.Impl28 {
        private androidx.core.graphics.Insets mMandatorySystemGestureInsets;
        private androidx.core.graphics.Insets mSystemGestureInsets;
        private androidx.core.graphics.Insets mTappableElementInsets;

        @Override // androidx.core.view.WindowInsetsCompat.Impl21, androidx.core.view.WindowInsetsCompat.Impl
        public void setStableInsets(androidx.core.graphics.Insets insets) {
        }

        Impl29(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.view.WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }

        Impl29(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Impl29 impl29) {
            super(windowInsetsCompat, impl29);
            this.mSystemGestureInsets = null;
            this.mMandatorySystemGestureInsets = null;
            this.mTappableElementInsets = null;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.graphics.Insets getSystemGestureInsets() {
            if (this.mSystemGestureInsets == null) {
                this.mSystemGestureInsets = androidx.core.graphics.Insets.toCompatInsets(this.mPlatformInsets.getSystemGestureInsets());
            }
            return this.mSystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.graphics.Insets getMandatorySystemGestureInsets() {
            if (this.mMandatorySystemGestureInsets == null) {
                this.mMandatorySystemGestureInsets = androidx.core.graphics.Insets.toCompatInsets(this.mPlatformInsets.getMandatorySystemGestureInsets());
            }
            return this.mMandatorySystemGestureInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.graphics.Insets getTappableElementInsets() {
            if (this.mTappableElementInsets == null) {
                this.mTappableElementInsets = androidx.core.graphics.Insets.toCompatInsets(this.mPlatformInsets.getTappableElementInsets());
            }
            return this.mTappableElementInsets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        androidx.core.view.WindowInsetsCompat inset(int i, int i2, int i3, int i4) {
            return androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets.inset(i, i2, i3, i4));
        }
    }

    static androidx.core.graphics.Insets insetInsets(androidx.core.graphics.Insets insets, int i, int i2, int i3, int i4) {
        int iMax = java.lang.Math.max(0, insets.left - i);
        int iMax2 = java.lang.Math.max(0, insets.top - i2);
        int iMax3 = java.lang.Math.max(0, insets.right - i3);
        int iMax4 = java.lang.Math.max(0, insets.bottom - i4);
        return (iMax == i && iMax2 == i2 && iMax3 == i3 && iMax4 == i4) ? insets : androidx.core.graphics.Insets.of(iMax, iMax2, iMax3, iMax4);
    }

    private static class Impl30 extends androidx.core.view.WindowInsetsCompat.Impl29 {
        static final androidx.core.view.WindowInsetsCompat CONSUMED = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(android.view.WindowInsets.CONSUMED);

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        final void copyRootViewBounds(android.view.View view) {
        }

        Impl30(androidx.core.view.WindowInsetsCompat windowInsetsCompat, android.view.WindowInsets windowInsets) {
            super(windowInsetsCompat, windowInsets);
        }

        Impl30(androidx.core.view.WindowInsetsCompat windowInsetsCompat, androidx.core.view.WindowInsetsCompat.Impl30 impl30) {
            super(windowInsetsCompat, impl30);
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsets(int i) {
            return androidx.core.graphics.Insets.toCompatInsets(this.mPlatformInsets.getInsets(androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public androidx.core.graphics.Insets getInsetsIgnoringVisibility(int i) {
            return androidx.core.graphics.Insets.toCompatInsets(this.mPlatformInsets.getInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(i)));
        }

        @Override // androidx.core.view.WindowInsetsCompat.Impl20, androidx.core.view.WindowInsetsCompat.Impl
        public boolean isVisible(int i) {
            return this.mPlatformInsets.isVisible(androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(i));
        }
    }

    public static final class Builder {
        private final androidx.core.view.WindowInsetsCompat.BuilderImpl mImpl;

        public Builder() {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                this.mImpl = new androidx.core.view.WindowInsetsCompat.BuilderImpl30();
            } else if (android.os.Build.VERSION.SDK_INT >= 29) {
                this.mImpl = new androidx.core.view.WindowInsetsCompat.BuilderImpl29();
            } else {
                this.mImpl = new androidx.core.view.WindowInsetsCompat.BuilderImpl20();
            }
        }

        public Builder(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                this.mImpl = new androidx.core.view.WindowInsetsCompat.BuilderImpl30(windowInsetsCompat);
            } else if (android.os.Build.VERSION.SDK_INT >= 29) {
                this.mImpl = new androidx.core.view.WindowInsetsCompat.BuilderImpl29(windowInsetsCompat);
            } else {
                this.mImpl = new androidx.core.view.WindowInsetsCompat.BuilderImpl20(windowInsetsCompat);
            }
        }

        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setSystemWindowInsets(androidx.core.graphics.Insets insets) {
            this.mImpl.setSystemWindowInsets(insets);
            return this;
        }

        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setSystemGestureInsets(androidx.core.graphics.Insets insets) {
            this.mImpl.setSystemGestureInsets(insets);
            return this;
        }

        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setMandatorySystemGestureInsets(androidx.core.graphics.Insets insets) {
            this.mImpl.setMandatorySystemGestureInsets(insets);
            return this;
        }

        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setTappableElementInsets(androidx.core.graphics.Insets insets) {
            this.mImpl.setTappableElementInsets(insets);
            return this;
        }

        public androidx.core.view.WindowInsetsCompat.Builder setInsets(int i, androidx.core.graphics.Insets insets) {
            this.mImpl.setInsets(i, insets);
            return this;
        }

        public androidx.core.view.WindowInsetsCompat.Builder setInsetsIgnoringVisibility(int i, androidx.core.graphics.Insets insets) {
            this.mImpl.setInsetsIgnoringVisibility(i, insets);
            return this;
        }

        public androidx.core.view.WindowInsetsCompat.Builder setVisible(int i, boolean z) {
            this.mImpl.setVisible(i, z);
            return this;
        }

        @java.lang.Deprecated
        public androidx.core.view.WindowInsetsCompat.Builder setStableInsets(androidx.core.graphics.Insets insets) {
            this.mImpl.setStableInsets(insets);
            return this;
        }

        public androidx.core.view.WindowInsetsCompat.Builder setDisplayCutout(androidx.core.view.DisplayCutoutCompat displayCutoutCompat) {
            this.mImpl.setDisplayCutout(displayCutoutCompat);
            return this;
        }

        public androidx.core.view.WindowInsetsCompat build() {
            return this.mImpl.build();
        }
    }

    private static class BuilderImpl {
        private final androidx.core.view.WindowInsetsCompat mInsets;
        androidx.core.graphics.Insets[] mInsetsTypeMask;

        void setDisplayCutout(androidx.core.view.DisplayCutoutCompat displayCutoutCompat) {
        }

        void setMandatorySystemGestureInsets(androidx.core.graphics.Insets insets) {
        }

        void setStableInsets(androidx.core.graphics.Insets insets) {
        }

        void setSystemGestureInsets(androidx.core.graphics.Insets insets) {
        }

        void setSystemWindowInsets(androidx.core.graphics.Insets insets) {
        }

        void setTappableElementInsets(androidx.core.graphics.Insets insets) {
        }

        void setVisible(int i, boolean z) {
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        BuilderImpl() {
            this(new androidx.core.view.WindowInsetsCompat((androidx.core.view.WindowInsetsCompat) null));
        }

        BuilderImpl(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            this.mInsets = windowInsetsCompat;
        }

        void setInsets(int i, androidx.core.graphics.Insets insets) {
            if (this.mInsetsTypeMask == null) {
                this.mInsetsTypeMask = new androidx.core.graphics.Insets[9];
            }
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    this.mInsetsTypeMask[androidx.core.view.WindowInsetsCompat.Type.indexOf(i2)] = insets;
                }
            }
        }

        void setInsetsIgnoringVisibility(int i, androidx.core.graphics.Insets insets) {
            if (i == 8) {
                throw new java.lang.IllegalArgumentException("Ignoring visibility inset not available for IME");
            }
        }

        protected final void applyInsetTypes() {
            androidx.core.graphics.Insets[] insetsArr = this.mInsetsTypeMask;
            if (insetsArr != null) {
                androidx.core.graphics.Insets insets = insetsArr[androidx.core.view.WindowInsetsCompat.Type.indexOf(1)];
                androidx.core.graphics.Insets insets2 = this.mInsetsTypeMask[androidx.core.view.WindowInsetsCompat.Type.indexOf(2)];
                if (insets2 == null) {
                    insets2 = this.mInsets.getInsets(2);
                }
                if (insets == null) {
                    insets = this.mInsets.getInsets(1);
                }
                setSystemWindowInsets(androidx.core.graphics.Insets.max(insets, insets2));
                androidx.core.graphics.Insets insets3 = this.mInsetsTypeMask[androidx.core.view.WindowInsetsCompat.Type.indexOf(16)];
                if (insets3 != null) {
                    setSystemGestureInsets(insets3);
                }
                androidx.core.graphics.Insets insets4 = this.mInsetsTypeMask[androidx.core.view.WindowInsetsCompat.Type.indexOf(32)];
                if (insets4 != null) {
                    setMandatorySystemGestureInsets(insets4);
                }
                androidx.core.graphics.Insets insets5 = this.mInsetsTypeMask[androidx.core.view.WindowInsetsCompat.Type.indexOf(64)];
                if (insets5 != null) {
                    setTappableElementInsets(insets5);
                }
            }
        }

        androidx.core.view.WindowInsetsCompat build() {
            applyInsetTypes();
            return this.mInsets;
        }
    }

    void setOverriddenInsets(androidx.core.graphics.Insets[] insetsArr) {
        this.mImpl.setOverriddenInsets(insetsArr);
    }

    private static class BuilderImpl20 extends androidx.core.view.WindowInsetsCompat.BuilderImpl {
        private static java.lang.reflect.Constructor<android.view.WindowInsets> sConstructor = null;
        private static boolean sConstructorFetched = false;
        private static java.lang.reflect.Field sConsumedField = null;
        private static boolean sConsumedFieldFetched = false;
        private android.view.WindowInsets mPlatformInsets;
        private androidx.core.graphics.Insets mStableInsets;

        BuilderImpl20() {
            this.mPlatformInsets = createWindowInsetsInstance();
        }

        BuilderImpl20(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
            this.mPlatformInsets = windowInsetsCompat.toWindowInsets();
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemWindowInsets(androidx.core.graphics.Insets insets) {
            android.view.WindowInsets windowInsets = this.mPlatformInsets;
            if (windowInsets != null) {
                this.mPlatformInsets = windowInsets.replaceSystemWindowInsets(insets.left, insets.top, insets.right, insets.bottom);
            }
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setStableInsets(androidx.core.graphics.Insets insets) {
            this.mStableInsets = insets;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        androidx.core.view.WindowInsetsCompat build() {
            applyInsetTypes();
            androidx.core.view.WindowInsetsCompat windowInsetsCompat = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(this.mPlatformInsets);
            windowInsetsCompat.setOverriddenInsets(this.mInsetsTypeMask);
            windowInsetsCompat.setStableInsets(this.mStableInsets);
            return windowInsetsCompat;
        }

        private static android.view.WindowInsets createWindowInsetsInstance() {
            if (!sConsumedFieldFetched) {
                try {
                    sConsumedField = android.view.WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (java.lang.ReflectiveOperationException e) {
                    android.util.Log.i(androidx.core.view.WindowInsetsCompat.TAG, "Could not retrieve WindowInsets.CONSUMED field", e);
                }
                sConsumedFieldFetched = true;
            }
            java.lang.reflect.Field field = sConsumedField;
            if (field != null) {
                try {
                    android.view.WindowInsets windowInsets = (android.view.WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new android.view.WindowInsets(windowInsets);
                    }
                } catch (java.lang.ReflectiveOperationException e2) {
                    android.util.Log.i(androidx.core.view.WindowInsetsCompat.TAG, "Could not get value from WindowInsets.CONSUMED field", e2);
                }
            }
            if (!sConstructorFetched) {
                try {
                    sConstructor = android.view.WindowInsets.class.getConstructor(android.graphics.Rect.class);
                } catch (java.lang.ReflectiveOperationException e3) {
                    android.util.Log.i(androidx.core.view.WindowInsetsCompat.TAG, "Could not retrieve WindowInsets(Rect) constructor", e3);
                }
                sConstructorFetched = true;
            }
            java.lang.reflect.Constructor<android.view.WindowInsets> constructor = sConstructor;
            if (constructor != null) {
                try {
                    return constructor.newInstance(new android.graphics.Rect());
                } catch (java.lang.ReflectiveOperationException e4) {
                    android.util.Log.i(androidx.core.view.WindowInsetsCompat.TAG, "Could not invoke WindowInsets(Rect) constructor", e4);
                }
            }
            return null;
        }
    }

    void setStableInsets(androidx.core.graphics.Insets insets) {
        this.mImpl.setStableInsets(insets);
    }

    private static class BuilderImpl29 extends androidx.core.view.WindowInsetsCompat.BuilderImpl {
        final android.view.WindowInsets.Builder mPlatBuilder;

        BuilderImpl29() {
            this.mPlatBuilder = new android.view.WindowInsets.Builder();
        }

        BuilderImpl29(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            android.view.WindowInsets.Builder builder;
            super(windowInsetsCompat);
            android.view.WindowInsets windowInsets = windowInsetsCompat.toWindowInsets();
            if (windowInsets != null) {
                builder = new android.view.WindowInsets.Builder(windowInsets);
            } else {
                builder = new android.view.WindowInsets.Builder();
            }
            this.mPlatBuilder = builder;
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemWindowInsets(androidx.core.graphics.Insets insets) {
            this.mPlatBuilder.setSystemWindowInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setSystemGestureInsets(androidx.core.graphics.Insets insets) {
            this.mPlatBuilder.setSystemGestureInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setMandatorySystemGestureInsets(androidx.core.graphics.Insets insets) {
            this.mPlatBuilder.setMandatorySystemGestureInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setTappableElementInsets(androidx.core.graphics.Insets insets) {
            this.mPlatBuilder.setTappableElementInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setStableInsets(androidx.core.graphics.Insets insets) {
            this.mPlatBuilder.setStableInsets(insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setDisplayCutout(androidx.core.view.DisplayCutoutCompat displayCutoutCompat) {
            this.mPlatBuilder.setDisplayCutout(displayCutoutCompat != null ? displayCutoutCompat.unwrap() : null);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        androidx.core.view.WindowInsetsCompat build() {
            applyInsetTypes();
            androidx.core.view.WindowInsetsCompat windowInsetsCompat = androidx.core.view.WindowInsetsCompat.toWindowInsetsCompat(this.mPlatBuilder.build());
            windowInsetsCompat.setOverriddenInsets(this.mInsetsTypeMask);
            return windowInsetsCompat;
        }
    }

    private static class BuilderImpl30 extends androidx.core.view.WindowInsetsCompat.BuilderImpl29 {
        BuilderImpl30() {
        }

        BuilderImpl30(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
            super(windowInsetsCompat);
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsets(int i, androidx.core.graphics.Insets insets) {
            this.mPlatBuilder.setInsets(androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(i), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setInsetsIgnoringVisibility(int i, androidx.core.graphics.Insets insets) {
            this.mPlatBuilder.setInsetsIgnoringVisibility(androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(i), insets.toPlatformInsets());
        }

        @Override // androidx.core.view.WindowInsetsCompat.BuilderImpl
        void setVisible(int i, boolean z) {
            this.mPlatBuilder.setVisible(androidx.core.view.WindowInsetsCompat.TypeImpl30.toPlatformType(i), z);
        }
    }

    public static final class Type {
        static final int CAPTION_BAR = 4;
        static final int DISPLAY_CUTOUT = 128;
        static final int FIRST = 1;
        static final int IME = 8;
        static final int LAST = 256;
        static final int MANDATORY_SYSTEM_GESTURES = 32;
        static final int NAVIGATION_BARS = 2;
        static final int SIZE = 9;
        static final int STATUS_BARS = 1;
        static final int SYSTEM_GESTURES = 16;
        static final int TAPPABLE_ELEMENT = 64;
        static final int WINDOW_DECOR = 256;

        @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
        public @interface InsetsType {
        }

        static int all() {
            return -1;
        }

        public static int captionBar() {
            return 4;
        }

        public static int displayCutout() {
            return 128;
        }

        public static int ime() {
            return 8;
        }

        public static int mandatorySystemGestures() {
            return 32;
        }

        public static int navigationBars() {
            return 2;
        }

        public static int statusBars() {
            return 1;
        }

        public static int systemBars() {
            return 7;
        }

        public static int systemGestures() {
            return 16;
        }

        public static int tappableElement() {
            return 64;
        }

        private Type() {
        }

        static int indexOf(int i) {
            if (i == 1) {
                return 0;
            }
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i == 8) {
                return 3;
            }
            if (i == 16) {
                return 4;
            }
            if (i == 32) {
                return 5;
            }
            if (i == 64) {
                return 6;
            }
            if (i == 128) {
                return 7;
            }
            if (i == 256) {
                return 8;
            }
            throw new java.lang.IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i);
        }
    }

    private static final class TypeImpl30 {
        private TypeImpl30() {
        }

        static int toPlatformType(int i) {
            int iStatusBars;
            int i2 = 0;
            for (int i3 = 1; i3 <= 256; i3 <<= 1) {
                if ((i & i3) != 0) {
                    if (i3 == 1) {
                        iStatusBars = android.view.WindowInsets.Type.statusBars();
                    } else if (i3 == 2) {
                        iStatusBars = android.view.WindowInsets.Type.navigationBars();
                    } else if (i3 == 4) {
                        iStatusBars = android.view.WindowInsets.Type.captionBar();
                    } else if (i3 == 8) {
                        iStatusBars = android.view.WindowInsets.Type.ime();
                    } else if (i3 == 16) {
                        iStatusBars = android.view.WindowInsets.Type.systemGestures();
                    } else if (i3 == 32) {
                        iStatusBars = android.view.WindowInsets.Type.mandatorySystemGestures();
                    } else if (i3 == 64) {
                        iStatusBars = android.view.WindowInsets.Type.tappableElement();
                    } else if (i3 == 128) {
                        iStatusBars = android.view.WindowInsets.Type.displayCutout();
                    }
                    i2 |= iStatusBars;
                }
            }
            return i2;
        }
    }

    void setRootWindowInsets(androidx.core.view.WindowInsetsCompat windowInsetsCompat) {
        this.mImpl.setRootWindowInsets(windowInsetsCompat);
    }

    void setRootViewData(androidx.core.graphics.Insets insets) {
        this.mImpl.setRootViewData(insets);
    }

    void copyRootViewBounds(android.view.View view) {
        this.mImpl.copyRootViewBounds(view);
    }

    static class Api21ReflectionHolder {
        private static java.lang.reflect.Field sContentInsets;
        private static boolean sReflectionSucceeded;
        private static java.lang.reflect.Field sStableInsets;
        private static java.lang.reflect.Field sViewAttachInfoField;

        private Api21ReflectionHolder() {
        }

        static {
            try {
                java.lang.reflect.Field declaredField = android.view.View.class.getDeclaredField("mAttachInfo");
                sViewAttachInfoField = declaredField;
                declaredField.setAccessible(true);
                java.lang.Class<?> cls = java.lang.Class.forName("android.view.View$AttachInfo");
                java.lang.reflect.Field declaredField2 = cls.getDeclaredField("mStableInsets");
                sStableInsets = declaredField2;
                declaredField2.setAccessible(true);
                java.lang.reflect.Field declaredField3 = cls.getDeclaredField("mContentInsets");
                sContentInsets = declaredField3;
                declaredField3.setAccessible(true);
                sReflectionSucceeded = true;
            } catch (java.lang.ReflectiveOperationException e) {
                android.util.Log.w(androidx.core.view.WindowInsetsCompat.TAG, "Failed to get visible insets from AttachInfo " + e.getMessage(), e);
            }
        }

        public static androidx.core.view.WindowInsetsCompat getRootWindowInsets(android.view.View view) {
            if (sReflectionSucceeded && view.isAttachedToWindow()) {
                try {
                    java.lang.Object obj = sViewAttachInfoField.get(view.getRootView());
                    if (obj != null) {
                        android.graphics.Rect rect = (android.graphics.Rect) sStableInsets.get(obj);
                        android.graphics.Rect rect2 = (android.graphics.Rect) sContentInsets.get(obj);
                        if (rect != null && rect2 != null) {
                            androidx.core.view.WindowInsetsCompat windowInsetsCompatBuild = new androidx.core.view.WindowInsetsCompat.Builder().setStableInsets(androidx.core.graphics.Insets.of(rect)).setSystemWindowInsets(androidx.core.graphics.Insets.of(rect2)).build();
                            windowInsetsCompatBuild.setRootWindowInsets(windowInsetsCompatBuild);
                            windowInsetsCompatBuild.copyRootViewBounds(view.getRootView());
                            return windowInsetsCompatBuild;
                        }
                    }
                } catch (java.lang.IllegalAccessException e) {
                    android.util.Log.w(androidx.core.view.WindowInsetsCompat.TAG, "Failed to get insets from AttachInfo. " + e.getMessage(), e);
                }
            }
            return null;
        }
    }
}
