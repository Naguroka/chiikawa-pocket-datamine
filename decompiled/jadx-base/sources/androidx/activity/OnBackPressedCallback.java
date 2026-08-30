package androidx.activity;

/* JADX INFO: compiled from: OnBackPressedCallback.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0007H\u0001J\b\u0010\u0015\u001a\u00020\nH'J\b\u0010\u0016\u001a\u00020\nH\u0007J\u0010\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0007H\u0001R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00038G@GX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0004¨\u0006\u0018"}, d2 = {"Landroidx/activity/OnBackPressedCallback;", "", "enabled", "", "(Z)V", "cancellables", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/activity/Cancellable;", "enabledChangedCallback", "Lkotlin/Function0;", "", "getEnabledChangedCallback$activity_release", "()Lkotlin/jvm/functions/Function0;", "setEnabledChangedCallback$activity_release", "(Lkotlin/jvm/functions/Function0;)V", "value", "isEnabled", "()Z", "setEnabled", "addCancellable", "cancellable", "handleOnBackPressed", "remove", "removeCancellable", "activity_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class OnBackPressedCallback {
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.activity.Cancellable> cancellables = new java.util.concurrent.CopyOnWriteArrayList<>();
    private kotlin.jvm.functions.Function0<kotlin.Unit> enabledChangedCallback;
    private boolean isEnabled;

    public abstract void handleOnBackPressed();

    public OnBackPressedCallback(boolean z) {
        this.isEnabled = z;
    }

    /* JADX INFO: renamed from: isEnabled, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final void setEnabled(boolean z) {
        this.isEnabled = z;
        kotlin.jvm.functions.Function0<kotlin.Unit> function0 = this.enabledChangedCallback;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final kotlin.jvm.functions.Function0<kotlin.Unit> getEnabledChangedCallback$activity_release() {
        return this.enabledChangedCallback;
    }

    public final void setEnabledChangedCallback$activity_release(kotlin.jvm.functions.Function0<kotlin.Unit> function0) {
        this.enabledChangedCallback = function0;
    }

    public final void remove() {
        java.util.Iterator<T> it = this.cancellables.iterator();
        while (it.hasNext()) {
            ((androidx.activity.Cancellable) it.next()).cancel();
        }
    }

    public final void addCancellable(androidx.activity.Cancellable cancellable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.add(cancellable);
    }

    public final void removeCancellable(androidx.activity.Cancellable cancellable) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cancellable, "cancellable");
        this.cancellables.remove(cancellable);
    }
}
