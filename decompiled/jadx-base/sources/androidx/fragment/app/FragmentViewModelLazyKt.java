package androidx.fragment.app;

/* JADX INFO: compiled from: FragmentViewModelLazy.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u001aJ\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u001aD\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u000e\b\n\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"activityViewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "createViewModelLazy", "viewModelClass", "Lkotlin/reflect/KClass;", "storeProducer", "Landroidx/lifecycle/ViewModelStore;", "viewModels", "ownerProducer", "Landroidx/lifecycle/ViewModelStoreOwner;", "fragment-ktx_release"}, k = 2, mv = {1, 4, 1})
public final class FragmentViewModelLazyKt {
    public static /* synthetic */ kotlin.Lazy viewModels$default(final androidx.fragment.app.Fragment viewModels, kotlin.jvm.functions.Function0 ownerProducer, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            ownerProducer = new kotlin.jvm.functions.Function0<androidx.fragment.app.Fragment>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt.viewModels.1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.fragment.app.Fragment invoke() {
                    return viewModels;
                }
            };
        }
        if ((i & 2) != 0) {
            function0 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModels, "$this$viewModels");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return createViewModelLazy(viewModels, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class), new androidx.fragment.app.FragmentViewModelLazyKt.C03042(ownerProducer), function0);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$viewModels$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class C03042 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStore> {
        final /* synthetic */ kotlin.jvm.functions.Function0 $ownerProducer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C03042(kotlin.jvm.functions.Function0 function0) {
            super(0);
            this.$ownerProducer = function0;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.ViewModelStore invoke() {
            androidx.lifecycle.ViewModelStore viewModelStore = ((androidx.lifecycle.ViewModelStoreOwner) this.$ownerProducer.invoke()).getViewModelStore();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewModelStore, "ownerProducer().viewModelStore");
            return viewModelStore;
        }
    }

    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> kotlin.Lazy<VM> viewModels(androidx.fragment.app.Fragment viewModels, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStoreOwner> ownerProducer, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModels, "$this$viewModels");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return createViewModelLazy(viewModels, kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class), new androidx.fragment.app.FragmentViewModelLazyKt.C03042(ownerProducer), function0);
    }

    public static /* synthetic */ kotlin.Lazy activityViewModels$default(androidx.fragment.app.Fragment activityViewModels, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityViewModels, "$this$activityViewModels");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.AnonymousClass1 anonymousClass1 = new androidx.fragment.app.FragmentViewModelLazyKt.AnonymousClass1(activityViewModels);
        if (function0 == null) {
            function0 = new androidx.fragment.app.FragmentViewModelLazyKt.AnonymousClass2(activityViewModels);
        }
        return createViewModelLazy(activityViewModels, orCreateKotlinClass, anonymousClass1, function0);
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$1, reason: invalid class name */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class AnonymousClass1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStore> {
        final /* synthetic */ androidx.fragment.app.Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(androidx.fragment.app.Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.ViewModelStore invoke() {
            androidx.fragment.app.FragmentActivity fragmentActivityRequireActivity = this.$this_activityViewModels.requireActivity();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            androidx.lifecycle.ViewModelStore viewModelStore = fragmentActivityRequireActivity.getViewModelStore();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewModelStore, "requireActivity().viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.fragment.app.FragmentViewModelLazyKt$activityViewModels$2, reason: invalid class name */
    /* JADX INFO: compiled from: FragmentViewModelLazy.kt */
    @kotlin.Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 4, 1})
    public static final class AnonymousClass2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory> {
        final /* synthetic */ androidx.fragment.app.Fragment $this_activityViewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(androidx.fragment.app.Fragment fragment) {
            super(0);
            this.$this_activityViewModels = fragment;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
            androidx.fragment.app.FragmentActivity fragmentActivityRequireActivity = this.$this_activityViewModels.requireActivity();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity()");
            return fragmentActivityRequireActivity.getDefaultViewModelProviderFactory();
        }
    }

    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> kotlin.Lazy<VM> activityViewModels(androidx.fragment.app.Fragment activityViewModels, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(activityViewModels, "$this$activityViewModels");
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        kotlin.reflect.KClass orCreateKotlinClass = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class);
        androidx.fragment.app.FragmentViewModelLazyKt.AnonymousClass1 anonymousClass1 = new androidx.fragment.app.FragmentViewModelLazyKt.AnonymousClass1(activityViewModels);
        if (function0 == null) {
            function0 = new androidx.fragment.app.FragmentViewModelLazyKt.AnonymousClass2(activityViewModels);
        }
        return createViewModelLazy(activityViewModels, orCreateKotlinClass, anonymousClass1, function0);
    }

    public static /* synthetic */ kotlin.Lazy createViewModelLazy$default(androidx.fragment.app.Fragment fragment, kotlin.reflect.KClass kClass, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function1, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            function1 = null;
        }
        return createViewModelLazy(fragment, kClass, function0, function1);
    }

    public static final <VM extends androidx.lifecycle.ViewModel> kotlin.Lazy<VM> createViewModelLazy(final androidx.fragment.app.Fragment createViewModelLazy, kotlin.reflect.KClass<VM> viewModelClass, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelStore> storeProducer, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(createViewModelLazy, "$this$createViewModelLazy");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        if (function0 == null) {
            function0 = new kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelProvider.Factory>() { // from class: androidx.fragment.app.FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final androidx.lifecycle.ViewModelProvider.Factory invoke() {
                    return createViewModelLazy.getDefaultViewModelProviderFactory();
                }
            };
        }
        return new androidx.lifecycle.ViewModelLazy(viewModelClass, storeProducer, function0);
    }
}
