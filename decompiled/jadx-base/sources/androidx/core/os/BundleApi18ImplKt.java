package androidx.core.os;

/* JADX INFO: compiled from: Bundle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u000b"}, d2 = {"Landroidx/core/os/BundleApi18ImplKt;", "", "()V", "putBinder", "", "bundle", "Landroid/os/Bundle;", com.ironsource.y8.h.W, "", "value", "Landroid/os/IBinder;", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class BundleApi18ImplKt {
    public static final androidx.core.os.BundleApi18ImplKt INSTANCE = new androidx.core.os.BundleApi18ImplKt();

    private BundleApi18ImplKt() {
    }

    @kotlin.jvm.JvmStatic
    public static final void putBinder(android.os.Bundle bundle, java.lang.String key, android.os.IBinder value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bundle, "bundle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        bundle.putBinder(key, value);
    }
}
