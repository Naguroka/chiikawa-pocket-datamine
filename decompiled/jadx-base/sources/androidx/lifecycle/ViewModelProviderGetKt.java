package androidx.lifecycle;

/* JADX INFO: compiled from: ViewModelProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u001a\u001e\u0010\u0004\u001a\u0002H\u0005\"\n\b\u0000\u0010\u0005\u0018\u0001*\u00020\u0006*\u00020\u0007H\u0087\b¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"defaultCreationExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "get", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/ViewModelProvider;", "(Landroidx/lifecycle/ViewModelProvider;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ViewModelProviderGetKt {
    public static final androidx.lifecycle.viewmodel.CreationExtras defaultCreationExtras(androidx.lifecycle.ViewModelStoreOwner owner) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
        if (owner instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory) {
            return ((androidx.lifecycle.HasDefaultViewModelProviderFactory) owner).getDefaultViewModelCreationExtras();
        }
        return androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE;
    }

    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> VM get(androidx.lifecycle.ViewModelProvider viewModelProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelProvider, "<this>");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return (VM) viewModelProvider.get(androidx.lifecycle.ViewModel.class);
    }
}
