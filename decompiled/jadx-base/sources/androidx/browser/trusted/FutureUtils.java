package androidx.browser.trusted;

/* JADX INFO: loaded from: classes.dex */
class FutureUtils {
    static <T> com.google.common.util.concurrent.ListenableFuture<T> immediateFailedFuture(java.lang.Throwable th) {
        androidx.concurrent.futures.ResolvableFuture resolvableFutureCreate = androidx.concurrent.futures.ResolvableFuture.create();
        resolvableFutureCreate.setException(th);
        return resolvableFutureCreate;
    }

    private FutureUtils() {
    }
}
