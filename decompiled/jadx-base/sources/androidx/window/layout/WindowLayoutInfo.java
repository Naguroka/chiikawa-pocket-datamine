package androidx.window.layout;

/* JADX INFO: compiled from: WindowLayoutInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0015\b\u0017\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\fH\u0016J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, d2 = {"Landroidx/window/layout/WindowLayoutInfo;", "", "displayFeatures", "", "Landroidx/window/layout/DisplayFeature;", "(Ljava/util/List;)V", "getDisplayFeatures", "()Ljava/util/List;", "equals", "", "other", "hashCode", "", "toString", "", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class WindowLayoutInfo {
    private final java.util.List<androidx.window.layout.DisplayFeature> displayFeatures;

    public final java.util.List<androidx.window.layout.DisplayFeature> getDisplayFeatures() {
        return this.displayFeatures;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WindowLayoutInfo(java.util.List<? extends androidx.window.layout.DisplayFeature> displayFeatures) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayFeatures, "displayFeatures");
        this.displayFeatures = displayFeatures;
    }

    public java.lang.String toString() {
        return kotlin.collections.CollectionsKt.joinToString$default(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !kotlin.jvm.internal.Intrinsics.areEqual(getClass(), other.getClass())) {
            return false;
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(this.displayFeatures, ((androidx.window.layout.WindowLayoutInfo) other).displayFeatures);
    }

    public int hashCode() {
        return this.displayFeatures.hashCode();
    }
}
