package androidx.window.core;

/* JADX INFO: compiled from: SpecificationComputer.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¨\u0006\b"}, d2 = {"Landroidx/window/core/AndroidLogger;", "Landroidx/window/core/Logger;", "()V", "debug", "", "tag", "", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class AndroidLogger implements androidx.window.core.Logger {
    public static final androidx.window.core.AndroidLogger INSTANCE = new androidx.window.core.AndroidLogger();

    private AndroidLogger() {
    }

    @Override // androidx.window.core.Logger
    public void debug(java.lang.String tag, java.lang.String message) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tag, "tag");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        android.util.Log.d(tag, message);
    }
}
