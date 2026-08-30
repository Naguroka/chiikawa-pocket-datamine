package androidx.transition;

/* JADX INFO: loaded from: classes3.dex */
class WindowIdApi18 implements androidx.transition.WindowIdImpl {
    private final android.view.WindowId mWindowId;

    WindowIdApi18(android.view.View view) {
        this.mWindowId = view.getWindowId();
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof androidx.transition.WindowIdApi18) && ((androidx.transition.WindowIdApi18) obj).mWindowId.equals(this.mWindowId);
    }

    public int hashCode() {
        return this.mWindowId.hashCode();
    }
}
