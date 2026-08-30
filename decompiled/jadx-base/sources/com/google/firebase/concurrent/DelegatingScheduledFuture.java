package com.google.firebase.concurrent;

/* JADX INFO: loaded from: classes5.dex */
class DelegatingScheduledFuture<V> extends androidx.concurrent.futures.AbstractResolvableFuture<V> implements java.util.concurrent.ScheduledFuture<V> {
    private final java.util.concurrent.ScheduledFuture<?> upstreamFuture;

    interface Completer<T> {
        void set(T t);

        void setException(java.lang.Throwable th);
    }

    interface Resolver<T> {
        java.util.concurrent.ScheduledFuture<?> addCompleter(com.google.firebase.concurrent.DelegatingScheduledFuture.Completer<T> completer);
    }

    DelegatingScheduledFuture(com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver<V> resolver) {
        this.upstreamFuture = resolver.addCompleter(new com.google.firebase.concurrent.DelegatingScheduledFuture.Completer<V>() { // from class: com.google.firebase.concurrent.DelegatingScheduledFuture.1
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Completer
            public void set(V v) {
                com.google.firebase.concurrent.DelegatingScheduledFuture.this.set(v);
            }

            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Completer
            public void setException(java.lang.Throwable th) {
                com.google.firebase.concurrent.DelegatingScheduledFuture.this.setException(th);
            }
        });
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    protected void afterDone() {
        this.upstreamFuture.cancel(wasInterrupted());
    }

    @Override // java.util.concurrent.Delayed
    public long getDelay(java.util.concurrent.TimeUnit timeUnit) {
        return this.upstreamFuture.getDelay(timeUnit);
    }

    @Override // java.lang.Comparable
    public int compareTo(java.util.concurrent.Delayed delayed) {
        return this.upstreamFuture.compareTo(delayed);
    }
}
