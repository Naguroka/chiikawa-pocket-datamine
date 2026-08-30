package androidx.core.os;

/* JADX INFO: loaded from: classes.dex */
public final class CancellationSignal {
    private boolean mCancelInProgress;
    private java.lang.Object mCancellationSignalObj;
    private boolean mIsCanceled;
    private androidx.core.os.CancellationSignal.OnCancelListener mOnCancelListener;

    public interface OnCancelListener {
        void onCancel();
    }

    public boolean isCanceled() {
        boolean z;
        synchronized (this) {
            z = this.mIsCanceled;
        }
        return z;
    }

    public void throwIfCanceled() {
        if (isCanceled()) {
            throw new androidx.core.os.OperationCanceledException();
        }
    }

    public void cancel() {
        synchronized (this) {
            if (this.mIsCanceled) {
                return;
            }
            this.mIsCanceled = true;
            this.mCancelInProgress = true;
            androidx.core.os.CancellationSignal.OnCancelListener onCancelListener = this.mOnCancelListener;
            java.lang.Object obj = this.mCancellationSignalObj;
            if (onCancelListener != null) {
                try {
                    onCancelListener.onCancel();
                } catch (java.lang.Throwable th) {
                    synchronized (this) {
                        this.mCancelInProgress = false;
                        notifyAll();
                        throw th;
                    }
                }
            }
            if (obj != null) {
                androidx.core.os.CancellationSignal.Api16Impl.cancel(obj);
            }
            synchronized (this) {
                this.mCancelInProgress = false;
                notifyAll();
            }
        }
    }

    public void setOnCancelListener(androidx.core.os.CancellationSignal.OnCancelListener onCancelListener) {
        synchronized (this) {
            waitForCancelFinishedLocked();
            if (this.mOnCancelListener == onCancelListener) {
                return;
            }
            this.mOnCancelListener = onCancelListener;
            if (this.mIsCanceled && onCancelListener != null) {
                onCancelListener.onCancel();
            }
        }
    }

    public java.lang.Object getCancellationSignalObject() {
        java.lang.Object obj;
        synchronized (this) {
            if (this.mCancellationSignalObj == null) {
                android.os.CancellationSignal cancellationSignalCreateCancellationSignal = androidx.core.os.CancellationSignal.Api16Impl.createCancellationSignal();
                this.mCancellationSignalObj = cancellationSignalCreateCancellationSignal;
                if (this.mIsCanceled) {
                    androidx.core.os.CancellationSignal.Api16Impl.cancel(cancellationSignalCreateCancellationSignal);
                }
            }
            obj = this.mCancellationSignalObj;
        }
        return obj;
    }

    private void waitForCancelFinishedLocked() {
        while (this.mCancelInProgress) {
            try {
                wait();
            } catch (java.lang.InterruptedException unused) {
            }
        }
    }

    static class Api16Impl {
        private Api16Impl() {
        }

        static void cancel(java.lang.Object obj) {
            ((android.os.CancellationSignal) obj).cancel();
        }

        static android.os.CancellationSignal createCancellationSignal() {
            return new android.os.CancellationSignal();
        }
    }
}
