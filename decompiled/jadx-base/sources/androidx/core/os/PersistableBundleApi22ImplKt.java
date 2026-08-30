package androidx.core.os;

/* JADX INFO: compiled from: PersistableBundle.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0018\n\u0000\bÃ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\"\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\fH\u0007¨\u0006\r"}, d2 = {"Landroidx/core/os/PersistableBundleApi22ImplKt;", "", "()V", "putBoolean", "", "persistableBundle", "Landroid/os/PersistableBundle;", com.ironsource.y8.h.W, "", "value", "", "putBooleanArray", "", "core-ktx_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
final class PersistableBundleApi22ImplKt {
    public static final androidx.core.os.PersistableBundleApi22ImplKt INSTANCE = new androidx.core.os.PersistableBundleApi22ImplKt();

    private PersistableBundleApi22ImplKt() {
    }

    @kotlin.jvm.JvmStatic
    public static final void putBoolean(android.os.PersistableBundle persistableBundle, java.lang.String key, boolean value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistableBundle, "persistableBundle");
        persistableBundle.putBoolean(key, value);
    }

    @kotlin.jvm.JvmStatic
    public static final void putBooleanArray(android.os.PersistableBundle persistableBundle, java.lang.String key, boolean[] value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(persistableBundle, "persistableBundle");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(value, "value");
        persistableBundle.putBooleanArray(key, value);
    }
}
