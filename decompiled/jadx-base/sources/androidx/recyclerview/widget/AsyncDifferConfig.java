package androidx.recyclerview.widget;

/* JADX INFO: loaded from: classes3.dex */
public final class AsyncDifferConfig<T> {
    private final java.util.concurrent.Executor mBackgroundThreadExecutor;
    private final androidx.recyclerview.widget.DiffUtil.ItemCallback<T> mDiffCallback;
    private final java.util.concurrent.Executor mMainThreadExecutor;

    AsyncDifferConfig(java.util.concurrent.Executor executor, java.util.concurrent.Executor executor2, androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback) {
        this.mMainThreadExecutor = executor;
        this.mBackgroundThreadExecutor = executor2;
        this.mDiffCallback = itemCallback;
    }

    public java.util.concurrent.Executor getMainThreadExecutor() {
        return this.mMainThreadExecutor;
    }

    public java.util.concurrent.Executor getBackgroundThreadExecutor() {
        return this.mBackgroundThreadExecutor;
    }

    public androidx.recyclerview.widget.DiffUtil.ItemCallback<T> getDiffCallback() {
        return this.mDiffCallback;
    }

    public static final class Builder<T> {
        private static java.util.concurrent.Executor sDiffExecutor;
        private static final java.lang.Object sExecutorLock = new java.lang.Object();
        private java.util.concurrent.Executor mBackgroundThreadExecutor;
        private final androidx.recyclerview.widget.DiffUtil.ItemCallback<T> mDiffCallback;
        private java.util.concurrent.Executor mMainThreadExecutor;

        public Builder(androidx.recyclerview.widget.DiffUtil.ItemCallback<T> itemCallback) {
            this.mDiffCallback = itemCallback;
        }

        public androidx.recyclerview.widget.AsyncDifferConfig.Builder<T> setMainThreadExecutor(java.util.concurrent.Executor executor) {
            this.mMainThreadExecutor = executor;
            return this;
        }

        public androidx.recyclerview.widget.AsyncDifferConfig.Builder<T> setBackgroundThreadExecutor(java.util.concurrent.Executor executor) {
            this.mBackgroundThreadExecutor = executor;
            return this;
        }

        public androidx.recyclerview.widget.AsyncDifferConfig<T> build() {
            if (this.mBackgroundThreadExecutor == null) {
                synchronized (sExecutorLock) {
                    if (sDiffExecutor == null) {
                        sDiffExecutor = java.util.concurrent.Executors.newFixedThreadPool(2);
                    }
                }
                this.mBackgroundThreadExecutor = sDiffExecutor;
            }
            return new androidx.recyclerview.widget.AsyncDifferConfig<>(this.mMainThreadExecutor, this.mBackgroundThreadExecutor, this.mDiffCallback);
        }
    }
}
