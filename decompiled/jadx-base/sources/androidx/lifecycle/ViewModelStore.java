package androidx.lifecycle;

/* JADX INFO: compiled from: ViewModelStore.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0007\u001a\u00020\bJ\u0013\u0010\t\u001a\u0004\u0018\u00010\u00062\u0006\u0010\n\u001a\u00020\u0005H\u0087\u0002J\u000e\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\fH\u0007J\u0018\u0010\r\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0006H\u0007R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/ViewModelStore;", "", "()V", "map", "", "", "Landroidx/lifecycle/ViewModel;", "clear", "", "get", com.ironsource.y8.h.W, com.google.firebase.crashlytics.internal.metadata.UserMetadata.KEYDATA_FILENAME, "", "put", "viewModel", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ViewModelStore {
    private final java.util.Map<java.lang.String, androidx.lifecycle.ViewModel> map = new java.util.LinkedHashMap();

    public final void put(java.lang.String key, androidx.lifecycle.ViewModel viewModel) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        androidx.lifecycle.ViewModel viewModelPut = this.map.put(key, viewModel);
        if (viewModelPut != null) {
            viewModelPut.onCleared();
        }
    }

    public final androidx.lifecycle.ViewModel get(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return this.map.get(key);
    }

    public final java.util.Set<java.lang.String> keys() {
        return new java.util.HashSet(this.map.keySet());
    }

    public final void clear() {
        java.util.Iterator<androidx.lifecycle.ViewModel> it = this.map.values().iterator();
        while (it.hasNext()) {
            it.next().clear();
        }
        this.map.clear();
    }
}
