package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class CallbackToFutureAdapter {

    public interface Resolver<T> {
        java.lang.Object attachCompleter(androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T> completer) throws java.lang.Exception;
    }

    private CallbackToFutureAdapter() {
    }

    public static <T> com.google.common.util.concurrent.ListenableFuture<T> getFuture(androidx.concurrent.futures.CallbackToFutureAdapter.Resolver<T> resolver) {
        androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T> completer = new androidx.concurrent.futures.CallbackToFutureAdapter.Completer<>();
        androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture<T> safeFuture = new androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture<>(completer);
        completer.future = safeFuture;
        completer.tag = resolver.getClass();
        try {
            java.lang.Object objAttachCompleter = resolver.attachCompleter(completer);
            if (objAttachCompleter != null) {
                completer.tag = objAttachCompleter;
            }
        } catch (java.lang.Exception e) {
            safeFuture.setException(e);
        }
        return safeFuture;
    }

    private static final class SafeFuture<T> implements com.google.common.util.concurrent.ListenableFuture<T> {
        final java.lang.ref.WeakReference<androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T>> completerWeakReference;
        private final androidx.concurrent.futures.AbstractResolvableFuture<T> delegate = new androidx.concurrent.futures.AbstractResolvableFuture<T>() { // from class: androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture.1
            @Override // androidx.concurrent.futures.AbstractResolvableFuture
            protected java.lang.String pendingToString() {
                androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T> completer = androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture.this.completerWeakReference.get();
                return completer == null ? "Completer object has been garbage collected, future will fail soon" : "tag=[" + completer.tag + com.ironsource.y8.i.e;
            }
        };

        SafeFuture(androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T> completer) {
            this.completerWeakReference = new java.lang.ref.WeakReference<>(completer);
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z) {
            androidx.concurrent.futures.CallbackToFutureAdapter.Completer<T> completer = this.completerWeakReference.get();
            boolean zCancel = this.delegate.cancel(z);
            if (zCancel && completer != null) {
                completer.fireCancellationListeners();
            }
            return zCancel;
        }

        boolean cancelWithoutNotifyingCompleter(boolean z) {
            return this.delegate.cancel(z);
        }

        boolean set(T t) {
            return this.delegate.set(t);
        }

        boolean setException(java.lang.Throwable th) {
            return this.delegate.setException(th);
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return this.delegate.isCancelled();
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return this.delegate.isDone();
        }

        @Override // java.util.concurrent.Future
        public T get() throws java.util.concurrent.ExecutionException, java.lang.InterruptedException {
            return this.delegate.get();
        }

        @Override // java.util.concurrent.Future
        public T get(long j, java.util.concurrent.TimeUnit timeUnit) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
            return this.delegate.get(j, timeUnit);
        }

        @Override // com.google.common.util.concurrent.ListenableFuture
        public void addListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            this.delegate.addListener(runnable, executor);
        }

        public java.lang.String toString() {
            return this.delegate.toString();
        }
    }

    public static final class Completer<T> {
        private boolean attemptedSetting;
        private androidx.concurrent.futures.ResolvableFuture<java.lang.Void> cancellationFuture = androidx.concurrent.futures.ResolvableFuture.create();
        androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture<T> future;
        java.lang.Object tag;

        Completer() {
        }

        public boolean set(T t) {
            this.attemptedSetting = true;
            androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture<T> safeFuture = this.future;
            boolean z = safeFuture != null && safeFuture.set(t);
            if (z) {
                setCompletedNormally();
            }
            return z;
        }

        public boolean setException(java.lang.Throwable th) {
            this.attemptedSetting = true;
            androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture<T> safeFuture = this.future;
            boolean z = safeFuture != null && safeFuture.setException(th);
            if (z) {
                setCompletedNormally();
            }
            return z;
        }

        public boolean setCancelled() {
            this.attemptedSetting = true;
            androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture<T> safeFuture = this.future;
            boolean z = safeFuture != null && safeFuture.cancelWithoutNotifyingCompleter(true);
            if (z) {
                setCompletedNormally();
            }
            return z;
        }

        public void addCancellationListener(java.lang.Runnable runnable, java.util.concurrent.Executor executor) {
            androidx.concurrent.futures.ResolvableFuture<java.lang.Void> resolvableFuture = this.cancellationFuture;
            if (resolvableFuture != null) {
                resolvableFuture.addListener(runnable, executor);
            }
        }

        void fireCancellationListeners() {
            this.tag = null;
            this.future = null;
            this.cancellationFuture.set(null);
        }

        private void setCompletedNormally() {
            this.tag = null;
            this.future = null;
            this.cancellationFuture = null;
        }

        protected void finalize() {
            androidx.concurrent.futures.ResolvableFuture<java.lang.Void> resolvableFuture;
            androidx.concurrent.futures.CallbackToFutureAdapter.SafeFuture<T> safeFuture = this.future;
            if (safeFuture != null && !safeFuture.isDone()) {
                safeFuture.setException(new androidx.concurrent.futures.CallbackToFutureAdapter.FutureGarbageCollectedException("The completer object was garbage collected - this future would otherwise never complete. The tag was: " + this.tag));
            }
            if (this.attemptedSetting || (resolvableFuture = this.cancellationFuture) == null) {
                return;
            }
            resolvableFuture.set(null);
        }
    }

    static final class FutureGarbageCollectedException extends java.lang.Throwable {
        FutureGarbageCollectedException(java.lang.String str) {
            super(str);
        }

        @Override // java.lang.Throwable
        public synchronized java.lang.Throwable fillInStackTrace() {
            return this;
        }
    }
}
