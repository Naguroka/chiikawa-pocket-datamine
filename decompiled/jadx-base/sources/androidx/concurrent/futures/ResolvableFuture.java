package androidx.concurrent.futures;

/* JADX INFO: loaded from: classes.dex */
public final class ResolvableFuture<V> extends androidx.concurrent.futures.AbstractResolvableFuture<V> {
    public static <V> androidx.concurrent.futures.ResolvableFuture<V> create() {
        return new androidx.concurrent.futures.ResolvableFuture<>();
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean set(V v) {
        return super.set(v);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setException(java.lang.Throwable th) {
        return super.setException(th);
    }

    @Override // androidx.concurrent.futures.AbstractResolvableFuture
    public boolean setFuture(com.google.common.util.concurrent.ListenableFuture<? extends V> listenableFuture) {
        return super.setFuture(listenableFuture);
    }

    private ResolvableFuture() {
    }
}
