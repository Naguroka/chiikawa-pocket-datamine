package androidx.activity;

/* JADX INFO: compiled from: ActivityViewModelLazy.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\n"}, d2 = {"viewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/activity/ComponentActivity;", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "activity-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class ActivityViewModelLazyKt {
    public static /* synthetic */ kotlin.Lazy viewModels$default(androidx.activity.ComponentActivity componentActivity, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        if (function0 == null) {
            function0 = new androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return new androidx.lifecycle.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class), new androidx.activity.ActivityViewModelLazyKt.AnonymousClass1(componentActivity), function0, new androidx.activity.ActivityViewModelLazyKt.AnonymousClass2(componentActivity));
    }

    @kotlin.Deprecated(level = kotlin.DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras")
    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> kotlin.Lazy<VM> viewModels(androidx.activity.ComponentActivity componentActivity, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        if (function0 == null) {
            function0 = new androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return new androidx.lifecycle.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class), new androidx.activity.ActivityViewModelLazyKt.AnonymousClass1(componentActivity), function0, new androidx.activity.ActivityViewModelLazyKt.AnonymousClass2(componentActivity));
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$1, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
    public static final class AnonymousClass1 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStore> {
        final /* synthetic */ androidx.activity.ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(androidx.activity.ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.ViewModelStore invoke() {
            androidx.lifecycle.ViewModelStore viewModelStore = this.$this_viewModels.getViewModelStore();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$2, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
    public static final class AnonymousClass2 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.CreationExtras> {
        final /* synthetic */ androidx.activity.ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(androidx.activity.ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.viewmodel.CreationExtras invoke() {
            androidx.lifecycle.viewmodel.CreationExtras defaultViewModelCreationExtras = this.$this_viewModels.getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }

    public static /* synthetic */ kotlin.Lazy viewModels$default(androidx.activity.ComponentActivity componentActivity, kotlin.jvm.functions.Function0 function0, kotlin.jvm.functions.Function0 function1, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            function0 = null;
        }
        if ((i & 2) != 0) {
            function1 = null;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        if (function1 == null) {
            function1 = new androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return new androidx.lifecycle.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class), new androidx.activity.ActivityViewModelLazyKt.AnonymousClass3(componentActivity), function1, new androidx.activity.ActivityViewModelLazyKt.AnonymousClass4(function0, componentActivity));
    }

    public static final /* synthetic */ <VM extends androidx.lifecycle.ViewModel> kotlin.Lazy<VM> viewModels(androidx.activity.ComponentActivity componentActivity, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.viewmodel.CreationExtras> function0, kotlin.jvm.functions.Function0<? extends androidx.lifecycle.ViewModelProvider.Factory> function1) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(componentActivity, "<this>");
        if (function1 == null) {
            function1 = new androidx.activity.ActivityViewModelLazyKt$viewModels$factoryPromise$2(componentActivity);
        }
        kotlin.jvm.internal.Intrinsics.reifiedOperationMarker(4, "VM");
        return new androidx.lifecycle.ViewModelLazy(kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(androidx.lifecycle.ViewModel.class), new androidx.activity.ActivityViewModelLazyKt.AnonymousClass3(componentActivity), function1, new androidx.activity.ActivityViewModelLazyKt.AnonymousClass4(function0, componentActivity));
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$3, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelStore;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
    public static final class AnonymousClass3 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.ViewModelStore> {
        final /* synthetic */ androidx.activity.ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(androidx.activity.ComponentActivity componentActivity) {
            super(0);
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.ViewModelStore invoke() {
            androidx.lifecycle.ViewModelStore viewModelStore = this.$this_viewModels.getViewModelStore();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            return viewModelStore;
        }
    }

    /* JADX INFO: renamed from: androidx.activity.ActivityViewModelLazyKt$viewModels$4, reason: invalid class name */
    /* JADX INFO: compiled from: ActivityViewModelLazy.kt */
    @kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/viewmodel/CreationExtras;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = org.objectweb.asm.Opcodes.ARETURN)
    public static final class AnonymousClass4 extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.CreationExtras> {
        final /* synthetic */ kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.CreationExtras> $extrasProducer;
        final /* synthetic */ androidx.activity.ComponentActivity $this_viewModels;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public AnonymousClass4(kotlin.jvm.functions.Function0<? extends androidx.lifecycle.viewmodel.CreationExtras> function0, androidx.activity.ComponentActivity componentActivity) {
            super(0);
            this.$extrasProducer = function0;
            this.$this_viewModels = componentActivity;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.lifecycle.viewmodel.CreationExtras invoke() {
            androidx.lifecycle.viewmodel.CreationExtras creationExtrasInvoke;
            kotlin.jvm.functions.Function0<androidx.lifecycle.viewmodel.CreationExtras> function0 = this.$extrasProducer;
            if (function0 != null && (creationExtrasInvoke = function0.invoke()) != null) {
                return creationExtrasInvoke;
            }
            androidx.lifecycle.viewmodel.CreationExtras defaultViewModelCreationExtras = this.$this_viewModels.getDefaultViewModelCreationExtras();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(defaultViewModelCreationExtras, "this.defaultViewModelCreationExtras");
            return defaultViewModelCreationExtras;
        }
    }
}
