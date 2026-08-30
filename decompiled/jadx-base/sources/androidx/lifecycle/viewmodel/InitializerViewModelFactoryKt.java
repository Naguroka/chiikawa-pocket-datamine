package androidx.lifecycle.viewmodel;

/* JADX INFO: compiled from: InitializerViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a%\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u001a7\u0010\u0007\u001a\u00020\u0005\"\n\b\u0000\u0010\b\u0018\u0001*\u00020\t*\u00020\u00042\u0019\b\b\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u0002H\b0\u0003¢\u0006\u0002\b\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000b"}, d2 = {"viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "builder", "Lkotlin/Function1;", "Landroidx/lifecycle/viewmodel/InitializerViewModelFactoryBuilder;", "", "Lkotlin/ExtensionFunctionType;", "initializer", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/lifecycle/viewmodel/CreationExtras;", "lifecycle-viewmodel_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class InitializerViewModelFactoryKt {
    public static final androidx.lifecycle.ViewModelProvider.Factory viewModelFactory(kotlin.jvm.functions.Function1<? super androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder, kotlin.Unit> builder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(builder, "builder");
        androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder();
        builder.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }

    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> void initializer(androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, kotlin.jvm.functions.Function1<? super androidx.lifecycle.viewmodel.CreationExtras, ? extends VM> initializer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializerViewModelFactoryBuilder, "<this>");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializer, "initializer");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class), initializer);
    }
}
