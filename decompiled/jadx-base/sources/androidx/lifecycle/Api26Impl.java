package androidx.lifecycle;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/Api26Impl;", "", "()V", "toMillis", "", "timeout", "Ljava/time/Duration;", "lifecycle-livedata_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Api26Impl {
    public static final androidx.lifecycle.Api26Impl INSTANCE = new androidx.lifecycle.Api26Impl();

    private Api26Impl() {
    }

    public final long toMillis(java.time.Duration timeout) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeout, "timeout");
        return timeout.toMillis();
    }
}
