package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class WindowInsetsAnimationControllerCompat {
    private final androidx.core.view.WindowInsetsAnimationControllerCompat.Impl mImpl;

    WindowInsetsAnimationControllerCompat(android.view.WindowInsetsAnimationController windowInsetsAnimationController) {
        this.mImpl = new androidx.core.view.WindowInsetsAnimationControllerCompat.Impl30(windowInsetsAnimationController);
    }

    public androidx.core.graphics.Insets getHiddenStateInsets() {
        return this.mImpl.getHiddenStateInsets();
    }

    public androidx.core.graphics.Insets getShownStateInsets() {
        return this.mImpl.getShownStateInsets();
    }

    public androidx.core.graphics.Insets getCurrentInsets() {
        return this.mImpl.getCurrentInsets();
    }

    public float getCurrentFraction() {
        return this.mImpl.getCurrentFraction();
    }

    public float getCurrentAlpha() {
        return this.mImpl.getCurrentAlpha();
    }

    public int getTypes() {
        return this.mImpl.getTypes();
    }

    public void setInsetsAndAlpha(androidx.core.graphics.Insets insets, float f, float f2) {
        this.mImpl.setInsetsAndAlpha(insets, f, f2);
    }

    public void finish(boolean z) {
        this.mImpl.finish(z);
    }

    public boolean isReady() {
        return (isFinished() || isCancelled()) ? false : true;
    }

    public boolean isFinished() {
        return this.mImpl.isFinished();
    }

    public boolean isCancelled() {
        return this.mImpl.isCancelled();
    }

    private static class Impl {
        void finish(boolean z) {
        }

        public float getCurrentAlpha() {
            return 0.0f;
        }

        public float getCurrentFraction() {
            return 0.0f;
        }

        public int getTypes() {
            return 0;
        }

        boolean isCancelled() {
            return true;
        }

        boolean isFinished() {
            return false;
        }

        public void setInsetsAndAlpha(androidx.core.graphics.Insets insets, float f, float f2) {
        }

        Impl() {
        }

        public androidx.core.graphics.Insets getHiddenStateInsets() {
            return androidx.core.graphics.Insets.NONE;
        }

        public androidx.core.graphics.Insets getShownStateInsets() {
            return androidx.core.graphics.Insets.NONE;
        }

        public androidx.core.graphics.Insets getCurrentInsets() {
            return androidx.core.graphics.Insets.NONE;
        }
    }

    private static class Impl30 extends androidx.core.view.WindowInsetsAnimationControllerCompat.Impl {
        private final android.view.WindowInsetsAnimationController mController;

        Impl30(android.view.WindowInsetsAnimationController windowInsetsAnimationController) {
            this.mController = windowInsetsAnimationController;
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public androidx.core.graphics.Insets getHiddenStateInsets() {
            return androidx.core.graphics.Insets.toCompatInsets(this.mController.getHiddenStateInsets());
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public androidx.core.graphics.Insets getShownStateInsets() {
            return androidx.core.graphics.Insets.toCompatInsets(this.mController.getShownStateInsets());
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public androidx.core.graphics.Insets getCurrentInsets() {
            return androidx.core.graphics.Insets.toCompatInsets(this.mController.getCurrentInsets());
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public float getCurrentFraction() {
            return this.mController.getCurrentFraction();
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public float getCurrentAlpha() {
            return this.mController.getCurrentAlpha();
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public int getTypes() {
            return this.mController.getTypes();
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        public void setInsetsAndAlpha(androidx.core.graphics.Insets insets, float f, float f2) {
            this.mController.setInsetsAndAlpha(insets == null ? null : insets.toPlatformInsets(), f, f2);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        void finish(boolean z) {
            this.mController.finish(z);
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        boolean isFinished() {
            return this.mController.isFinished();
        }

        @Override // androidx.core.view.WindowInsetsAnimationControllerCompat.Impl
        boolean isCancelled() {
            return this.mController.isCancelled();
        }
    }
}
