package androidx.core.view;

/* JADX INFO: loaded from: classes.dex */
public final class OneShotPreDrawListener implements android.view.ViewTreeObserver.OnPreDrawListener, android.view.View.OnAttachStateChangeListener {
    private final java.lang.Runnable mRunnable;
    private final android.view.View mView;
    private android.view.ViewTreeObserver mViewTreeObserver;

    private OneShotPreDrawListener(android.view.View view, java.lang.Runnable runnable) {
        this.mView = view;
        this.mViewTreeObserver = view.getViewTreeObserver();
        this.mRunnable = runnable;
    }

    public static androidx.core.view.OneShotPreDrawListener add(android.view.View view, java.lang.Runnable runnable) {
        if (view == null) {
            throw new java.lang.NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new java.lang.NullPointerException("runnable == null");
        }
        androidx.core.view.OneShotPreDrawListener oneShotPreDrawListener = new androidx.core.view.OneShotPreDrawListener(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(oneShotPreDrawListener);
        view.addOnAttachStateChangeListener(oneShotPreDrawListener);
        return oneShotPreDrawListener;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        removeListener();
        this.mRunnable.run();
        return true;
    }

    public void removeListener() {
        if (this.mViewTreeObserver.isAlive()) {
            this.mViewTreeObserver.removeOnPreDrawListener(this);
        } else {
            this.mView.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.mView.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
        this.mViewTreeObserver = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        removeListener();
    }
}
