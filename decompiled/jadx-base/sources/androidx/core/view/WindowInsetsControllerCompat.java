package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsControllerCompat {
    public static final int BEHAVIOR_SHOW_BARS_BY_SWIPE = 1;
    public static final int BEHAVIOR_SHOW_BARS_BY_TOUCH = 0;
    public static final int BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE = 2;
    private final androidx.core.view.WindowInsetsControllerCompat.Impl mImpl;

    public interface OnControllableInsetsChangedListener {
        void onControllableInsetsChanged(androidx.core.view.WindowInsetsControllerCompat windowInsetsControllerCompat, int i);
    }

    @java.lang.Deprecated
    private WindowInsetsControllerCompat(android.view.WindowInsetsController windowInsetsController) {
        this.mImpl = new androidx.core.view.WindowInsetsControllerCompat.Impl30(windowInsetsController, this);
    }

    public WindowInsetsControllerCompat(android.view.Window window, android.view.View view) {
        if (android.os.Build.VERSION.SDK_INT >= 30) {
            this.mImpl = new androidx.core.view.WindowInsetsControllerCompat.Impl30(window, this);
        } else if (android.os.Build.VERSION.SDK_INT >= 26) {
            this.mImpl = new androidx.core.view.WindowInsetsControllerCompat.Impl26(window, view);
        } else {
            this.mImpl = new androidx.core.view.WindowInsetsControllerCompat.Impl23(window, view);
        }
    }

    @java.lang.Deprecated
    public static androidx.core.view.WindowInsetsControllerCompat toWindowInsetsControllerCompat(android.view.WindowInsetsController windowInsetsController) {
        return new androidx.core.view.WindowInsetsControllerCompat(windowInsetsController);
    }

    public void show(int i) {
        this.mImpl.show(i);
    }

    public void hide(int i) {
        this.mImpl.hide(i);
    }

    public boolean isAppearanceLightStatusBars() {
        return this.mImpl.isAppearanceLightStatusBars();
    }

    public void setAppearanceLightStatusBars(boolean z) {
        this.mImpl.setAppearanceLightStatusBars(z);
    }

    public boolean isAppearanceLightNavigationBars() {
        return this.mImpl.isAppearanceLightNavigationBars();
    }

    public void setAppearanceLightNavigationBars(boolean z) {
        this.mImpl.setAppearanceLightNavigationBars(z);
    }

    public void controlWindowInsetsAnimation(int i, long j, android.view.animation.Interpolator interpolator, android.os.CancellationSignal cancellationSignal, androidx.core.view.WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        this.mImpl.controlWindowInsetsAnimation(i, j, interpolator, cancellationSignal, windowInsetsAnimationControlListenerCompat);
    }

    public void setSystemBarsBehavior(int i) {
        this.mImpl.setSystemBarsBehavior(i);
    }

    public int getSystemBarsBehavior() {
        return this.mImpl.getSystemBarsBehavior();
    }

    public void addOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.mImpl.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
    }

    public void removeOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        this.mImpl.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListener);
    }

    private static class Impl {
        void addOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        void controlWindowInsetsAnimation(int i, long j, android.view.animation.Interpolator interpolator, android.os.CancellationSignal cancellationSignal, androidx.core.view.WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        }

        int getSystemBarsBehavior() {
            return 0;
        }

        void hide(int i) {
        }

        public boolean isAppearanceLightNavigationBars() {
            return false;
        }

        public boolean isAppearanceLightStatusBars() {
            return false;
        }

        void removeOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        public void setAppearanceLightNavigationBars(boolean z) {
        }

        public void setAppearanceLightStatusBars(boolean z) {
        }

        void setSystemBarsBehavior(int i) {
        }

        void show(int i) {
        }

        Impl() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Impl20 extends androidx.core.view.WindowInsetsControllerCompat.Impl {
        private final android.view.View mView;
        protected final android.view.Window mWindow;

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void addOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void controlWindowInsetsAnimation(int i, long j, android.view.animation.Interpolator interpolator, android.os.CancellationSignal cancellationSignal, androidx.core.view.WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        int getSystemBarsBehavior() {
            return 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void removeOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
        }

        Impl20(android.view.Window window, android.view.View view) {
            this.mWindow = window;
            this.mView = view;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void show(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    showForType(i2);
                }
            }
        }

        private void showForType(int i) {
            if (i == 1) {
                unsetSystemUiFlag(4);
                unsetWindowFlag(1024);
                return;
            }
            if (i == 2) {
                unsetSystemUiFlag(2);
                return;
            }
            if (i != 8) {
                return;
            }
            final android.view.View viewFindViewById = this.mView;
            if (viewFindViewById.isInEditMode() || viewFindViewById.onCheckIsTextEditor()) {
                viewFindViewById.requestFocus();
            } else {
                viewFindViewById = this.mWindow.getCurrentFocus();
            }
            if (viewFindViewById == null) {
                viewFindViewById = this.mWindow.findViewById(android.R.id.content);
            }
            if (viewFindViewById == null || !viewFindViewById.hasWindowFocus()) {
                return;
            }
            viewFindViewById.post(new java.lang.Runnable() { // from class: androidx.core.view.WindowInsetsControllerCompat$Impl20$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    android.view.View view = viewFindViewById;
                    ((android.view.inputmethod.InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                }
            });
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void hide(int i) {
            for (int i2 = 1; i2 <= 256; i2 <<= 1) {
                if ((i & i2) != 0) {
                    hideForType(i2);
                }
            }
        }

        private void hideForType(int i) {
            if (i == 1) {
                setSystemUiFlag(4);
            } else if (i == 2) {
                setSystemUiFlag(2);
            } else {
                if (i != 8) {
                    return;
                }
                ((android.view.inputmethod.InputMethodManager) this.mWindow.getContext().getSystemService("input_method")).hideSoftInputFromWindow(this.mWindow.getDecorView().getWindowToken(), 0);
            }
        }

        protected void setSystemUiFlag(int i) {
            android.view.View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }

        protected void unsetSystemUiFlag(int i) {
            android.view.View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        protected void setWindowFlag(int i) {
            this.mWindow.addFlags(i);
        }

        protected void unsetWindowFlag(int i) {
            this.mWindow.clearFlags(i);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void setSystemBarsBehavior(int i) {
            if (i == 0) {
                unsetSystemUiFlag(6144);
                return;
            }
            if (i == 1) {
                unsetSystemUiFlag(4096);
                setSystemUiFlag(2048);
            } else {
                if (i != 2) {
                    return;
                }
                unsetSystemUiFlag(2048);
                setSystemUiFlag(4096);
            }
        }
    }

    private static class Impl23 extends androidx.core.view.WindowInsetsControllerCompat.Impl20 {
        Impl23(android.view.Window window, android.view.View view) {
            super(window, view);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
            return (this.mWindow.getDecorView().getSystemUiVisibility() & 8192) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean z) {
            if (z) {
                unsetWindowFlag(67108864);
                setWindowFlag(Integer.MIN_VALUE);
                setSystemUiFlag(8192);
                return;
            }
            unsetSystemUiFlag(8192);
        }
    }

    private static class Impl26 extends androidx.core.view.WindowInsetsControllerCompat.Impl23 {
        Impl26(android.view.Window window, android.view.View view) {
            super(window, view);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
            return (this.mWindow.getDecorView().getSystemUiVisibility() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean z) {
            if (z) {
                unsetWindowFlag(androidx.media3.common.C.BUFFER_FLAG_FIRST_SAMPLE);
                setWindowFlag(Integer.MIN_VALUE);
                setSystemUiFlag(16);
                return;
            }
            unsetSystemUiFlag(16);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class Impl30 extends androidx.core.view.WindowInsetsControllerCompat.Impl {
        final androidx.core.view.WindowInsetsControllerCompat mCompatController;
        final android.view.WindowInsetsController mInsetsController;
        private final androidx.collection.SimpleArrayMap<androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener, android.view.WindowInsetsController.OnControllableInsetsChangedListener> mListeners;
        protected android.view.Window mWindow;

        Impl30(android.view.Window window, androidx.core.view.WindowInsetsControllerCompat windowInsetsControllerCompat) {
            this(window.getInsetsController(), windowInsetsControllerCompat);
            this.mWindow = window;
        }

        Impl30(android.view.WindowInsetsController windowInsetsController, androidx.core.view.WindowInsetsControllerCompat windowInsetsControllerCompat) {
            this.mListeners = new androidx.collection.SimpleArrayMap<>();
            this.mInsetsController = windowInsetsController;
            this.mCompatController = windowInsetsControllerCompat;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void show(int i) {
            if (this.mWindow != null && (i & 8) != 0 && android.os.Build.VERSION.SDK_INT < 32) {
                ((android.view.inputmethod.InputMethodManager) this.mWindow.getContext().getSystemService("input_method")).isActive();
            }
            this.mInsetsController.show(i);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void hide(int i) {
            this.mInsetsController.hide(i);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightStatusBars() {
            return (this.mInsetsController.getSystemBarsAppearance() & 8) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightStatusBars(boolean z) {
            if (z) {
                if (this.mWindow != null) {
                    setSystemUiFlag(8192);
                }
                this.mInsetsController.setSystemBarsAppearance(8, 8);
            } else {
                if (this.mWindow != null) {
                    unsetSystemUiFlag(8192);
                }
                this.mInsetsController.setSystemBarsAppearance(0, 8);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public boolean isAppearanceLightNavigationBars() {
            return (this.mInsetsController.getSystemBarsAppearance() & 16) != 0;
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        public void setAppearanceLightNavigationBars(boolean z) {
            if (z) {
                if (this.mWindow != null) {
                    setSystemUiFlag(16);
                }
                this.mInsetsController.setSystemBarsAppearance(16, 16);
            } else {
                if (this.mWindow != null) {
                    unsetSystemUiFlag(16);
                }
                this.mInsetsController.setSystemBarsAppearance(0, 16);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void controlWindowInsetsAnimation(int i, long j, android.view.animation.Interpolator interpolator, android.os.CancellationSignal cancellationSignal, final androidx.core.view.WindowInsetsAnimationControlListenerCompat windowInsetsAnimationControlListenerCompat) {
            this.mInsetsController.controlWindowInsetsAnimation(i, j, interpolator, cancellationSignal, new android.view.WindowInsetsAnimationControlListener() { // from class: androidx.core.view.WindowInsetsControllerCompat.Impl30.1
                private androidx.core.view.WindowInsetsAnimationControllerCompat mCompatAnimController = null;

                @Override // android.view.WindowInsetsAnimationControlListener
                public void onReady(android.view.WindowInsetsAnimationController windowInsetsAnimationController, int i2) {
                    androidx.core.view.WindowInsetsAnimationControllerCompat windowInsetsAnimationControllerCompat = new androidx.core.view.WindowInsetsAnimationControllerCompat(windowInsetsAnimationController);
                    this.mCompatAnimController = windowInsetsAnimationControllerCompat;
                    windowInsetsAnimationControlListenerCompat.onReady(windowInsetsAnimationControllerCompat, i2);
                }

                @Override // android.view.WindowInsetsAnimationControlListener
                public void onFinished(android.view.WindowInsetsAnimationController windowInsetsAnimationController) {
                    windowInsetsAnimationControlListenerCompat.onFinished(this.mCompatAnimController);
                }

                @Override // android.view.WindowInsetsAnimationControlListener
                public void onCancelled(android.view.WindowInsetsAnimationController windowInsetsAnimationController) {
                    windowInsetsAnimationControlListenerCompat.onCancelled(windowInsetsAnimationController == null ? null : this.mCompatAnimController);
                }
            });
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void setSystemBarsBehavior(int i) {
            this.mInsetsController.setSystemBarsBehavior(i);
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        int getSystemBarsBehavior() {
            return this.mInsetsController.getSystemBarsBehavior();
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void addOnControllableInsetsChangedListener(final androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            if (this.mListeners.containsKey(onControllableInsetsChangedListener)) {
                return;
            }
            android.view.WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListener2 = new android.view.WindowInsetsController.OnControllableInsetsChangedListener() { // from class: androidx.core.view.WindowInsetsControllerCompat$Impl30$$ExternalSyntheticLambda0
                @Override // android.view.WindowInsetsController.OnControllableInsetsChangedListener
                public final void onControllableInsetsChanged(android.view.WindowInsetsController windowInsetsController, int i) {
                    this.f$0.m41xe96d8c51(onControllableInsetsChangedListener, windowInsetsController, i);
                }
            };
            this.mListeners.put(onControllableInsetsChangedListener, onControllableInsetsChangedListener2);
            this.mInsetsController.addOnControllableInsetsChangedListener(onControllableInsetsChangedListener2);
        }

        /* JADX INFO: renamed from: lambda$addOnControllableInsetsChangedListener$0$androidx-core-view-WindowInsetsControllerCompat$Impl30, reason: not valid java name */
        /* synthetic */ void m41xe96d8c51(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener, android.view.WindowInsetsController windowInsetsController, int i) {
            if (this.mInsetsController == windowInsetsController) {
                onControllableInsetsChangedListener.onControllableInsetsChanged(this.mCompatController, i);
            }
        }

        @Override // androidx.core.view.WindowInsetsControllerCompat.Impl
        void removeOnControllableInsetsChangedListener(androidx.core.view.WindowInsetsControllerCompat.OnControllableInsetsChangedListener onControllableInsetsChangedListener) {
            android.view.WindowInsetsController.OnControllableInsetsChangedListener onControllableInsetsChangedListenerRemove = this.mListeners.remove(onControllableInsetsChangedListener);
            if (onControllableInsetsChangedListenerRemove != null) {
                this.mInsetsController.removeOnControllableInsetsChangedListener(onControllableInsetsChangedListenerRemove);
            }
        }

        protected void unsetSystemUiFlag(int i) {
            android.view.View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility((~i) & decorView.getSystemUiVisibility());
        }

        protected void setSystemUiFlag(int i) {
            android.view.View decorView = this.mWindow.getDecorView();
            decorView.setSystemUiVisibility(i | decorView.getSystemUiVisibility());
        }
    }
}
