package androidx.appcompat.view;

/* JADX INFO: loaded from: classes.dex */
public class ViewPropertyAnimatorCompatSet {
    private android.view.animation.Interpolator mInterpolator;
    private boolean mIsStarted;
    androidx.core.view.ViewPropertyAnimatorListener mListener;
    private long mDuration = -1;
    private final androidx.core.view.ViewPropertyAnimatorListenerAdapter mProxyListener = new androidx.core.view.ViewPropertyAnimatorListenerAdapter() { // from class: androidx.appcompat.view.ViewPropertyAnimatorCompatSet.1
        private boolean mProxyStarted = false;
        private int mProxyEndCount = 0;

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationStart(android.view.View view) {
            if (this.mProxyStarted) {
                return;
            }
            this.mProxyStarted = true;
            if (androidx.appcompat.view.ViewPropertyAnimatorCompatSet.this.mListener != null) {
                androidx.appcompat.view.ViewPropertyAnimatorCompatSet.this.mListener.onAnimationStart(null);
            }
        }

        void onEnd() {
            this.mProxyEndCount = 0;
            this.mProxyStarted = false;
            androidx.appcompat.view.ViewPropertyAnimatorCompatSet.this.onAnimationsEnded();
        }

        @Override // androidx.core.view.ViewPropertyAnimatorListenerAdapter, androidx.core.view.ViewPropertyAnimatorListener
        public void onAnimationEnd(android.view.View view) {
            int i = this.mProxyEndCount + 1;
            this.mProxyEndCount = i;
            if (i == androidx.appcompat.view.ViewPropertyAnimatorCompatSet.this.mAnimators.size()) {
                if (androidx.appcompat.view.ViewPropertyAnimatorCompatSet.this.mListener != null) {
                    androidx.appcompat.view.ViewPropertyAnimatorCompatSet.this.mListener.onAnimationEnd(null);
                }
                onEnd();
            }
        }
    };
    final java.util.ArrayList<androidx.core.view.ViewPropertyAnimatorCompat> mAnimators = new java.util.ArrayList<>();

    public androidx.appcompat.view.ViewPropertyAnimatorCompatSet play(androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat) {
        if (!this.mIsStarted) {
            this.mAnimators.add(viewPropertyAnimatorCompat);
        }
        return this;
    }

    public androidx.appcompat.view.ViewPropertyAnimatorCompatSet playSequentially(androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat, androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat2) {
        this.mAnimators.add(viewPropertyAnimatorCompat);
        viewPropertyAnimatorCompat2.setStartDelay(viewPropertyAnimatorCompat.getDuration());
        this.mAnimators.add(viewPropertyAnimatorCompat2);
        return this;
    }

    public void start() {
        if (this.mIsStarted) {
            return;
        }
        for (androidx.core.view.ViewPropertyAnimatorCompat viewPropertyAnimatorCompat : this.mAnimators) {
            long j = this.mDuration;
            if (j >= 0) {
                viewPropertyAnimatorCompat.setDuration(j);
            }
            android.view.animation.Interpolator interpolator = this.mInterpolator;
            if (interpolator != null) {
                viewPropertyAnimatorCompat.setInterpolator(interpolator);
            }
            if (this.mListener != null) {
                viewPropertyAnimatorCompat.setListener(this.mProxyListener);
            }
            viewPropertyAnimatorCompat.start();
        }
        this.mIsStarted = true;
    }

    void onAnimationsEnded() {
        this.mIsStarted = false;
    }

    public void cancel() {
        if (this.mIsStarted) {
            java.util.Iterator<androidx.core.view.ViewPropertyAnimatorCompat> it = this.mAnimators.iterator();
            while (it.hasNext()) {
                it.next().cancel();
            }
            this.mIsStarted = false;
        }
    }

    public androidx.appcompat.view.ViewPropertyAnimatorCompatSet setDuration(long j) {
        if (!this.mIsStarted) {
            this.mDuration = j;
        }
        return this;
    }

    public androidx.appcompat.view.ViewPropertyAnimatorCompatSet setInterpolator(android.view.animation.Interpolator interpolator) {
        if (!this.mIsStarted) {
            this.mInterpolator = interpolator;
        }
        return this;
    }

    public androidx.appcompat.view.ViewPropertyAnimatorCompatSet setListener(androidx.core.view.ViewPropertyAnimatorListener viewPropertyAnimatorListener) {
        if (!this.mIsStarted) {
            this.mListener = viewPropertyAnimatorListener;
        }
        return this;
    }
}
