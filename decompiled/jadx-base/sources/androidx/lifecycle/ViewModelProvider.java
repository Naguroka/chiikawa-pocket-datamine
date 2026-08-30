package androidx.lifecycle;

/* JADX INFO: compiled from: ViewModelProvider.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001:\u0004\u0016\u0017\u0018\u0019B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B!\b\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ&\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0097\u0002¢\u0006\u0002\u0010\u0012J.\u0010\r\u001a\u0002H\u000e\"\b\b\u0000\u0010\u000e*\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u0011H\u0097\u0002¢\u0006\u0002\u0010\u0015R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/ViewModelProvider;", "", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "(Landroidx/lifecycle/ViewModelStoreOwner;)V", "factory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "(Landroidx/lifecycle/ViewModelStoreOwner;Landroidx/lifecycle/ViewModelProvider$Factory;)V", com.ironsource.y8.h.U, "Landroidx/lifecycle/ViewModelStore;", "defaultCreationExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Landroidx/lifecycle/ViewModelStore;Landroidx/lifecycle/ViewModelProvider$Factory;Landroidx/lifecycle/viewmodel/CreationExtras;)V", "get", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", com.ironsource.y8.h.W, "", "(Ljava/lang/String;Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "AndroidViewModelFactory", "Factory", "NewInstanceFactory", "OnRequeryFactory", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public class ViewModelProvider {
    private final androidx.lifecycle.viewmodel.CreationExtras defaultCreationExtras;
    private final androidx.lifecycle.ViewModelProvider.Factory factory;
    private final androidx.lifecycle.ViewModelStore store;

    /* JADX INFO: compiled from: ViewModelProvider.kt */
    @kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$OnRequeryFactory;", "", "()V", "onRequery", "", "viewModel", "Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class OnRequeryFactory {
        public void onRequery(androidx.lifecycle.ViewModel viewModel) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewModel, "viewModel");
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(androidx.lifecycle.ViewModelStore store, androidx.lifecycle.ViewModelProvider.Factory factory) {
        this(store, factory, null, 4, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(store, "store");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "factory");
    }

    public ViewModelProvider(androidx.lifecycle.ViewModelStore store, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.lifecycle.viewmodel.CreationExtras defaultCreationExtras) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(store, "store");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "factory");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(defaultCreationExtras, "defaultCreationExtras");
        this.store = store;
        this.factory = factory;
        this.defaultCreationExtras = defaultCreationExtras;
    }

    public /* synthetic */ ViewModelProvider(androidx.lifecycle.ViewModelStore viewModelStore, androidx.lifecycle.ViewModelProvider.Factory factory, androidx.lifecycle.viewmodel.CreationExtras.Empty empty, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(viewModelStore, factory, (i & 4) != 0 ? androidx.lifecycle.viewmodel.CreationExtras.Empty.INSTANCE : empty);
    }

    /* JADX INFO: compiled from: ViewModelProvider.kt */
    @kotlin.Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ%\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u0006H\u0016¢\u0006\u0002\u0010\u0007J-\u0010\u0002\u001a\u0002H\u0003\"\b\b\u0000\u0010\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00062\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory;", "", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public interface Factory {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.lifecycle.ViewModelProvider.Factory.Companion INSTANCE = androidx.lifecycle.ViewModelProvider.Factory.Companion.$$INSTANCE;

        @kotlin.jvm.JvmStatic
        static androidx.lifecycle.ViewModelProvider.Factory from(androidx.lifecycle.viewmodel.ViewModelInitializer<?>... viewModelInitializerArr) {
            return INSTANCE.from(viewModelInitializerArr);
        }

        default <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> modelClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            throw new java.lang.UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
        }

        default <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> modelClass, androidx.lifecycle.viewmodel.CreationExtras extras) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
            return (T) create(modelClass);
        }

        /* JADX INFO: compiled from: ViewModelProvider.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J)\u0010\u0003\u001a\u00020\u00042\u001a\u0010\u0005\u001a\u000e\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006\"\u0006\u0012\u0002\b\u00030\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$Factory$Companion;", "", "()V", "from", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initializers", "", "Landroidx/lifecycle/viewmodel/ViewModelInitializer;", "([Landroidx/lifecycle/viewmodel/ViewModelInitializer;)Landroidx/lifecycle/ViewModelProvider$Factory;", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            static final /* synthetic */ androidx.lifecycle.ViewModelProvider.Factory.Companion $$INSTANCE = new androidx.lifecycle.ViewModelProvider.Factory.Companion();

            private Companion() {
            }

            @kotlin.jvm.JvmStatic
            public final androidx.lifecycle.ViewModelProvider.Factory from(androidx.lifecycle.viewmodel.ViewModelInitializer<?>... initializers) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(initializers, "initializers");
                return new androidx.lifecycle.viewmodel.InitializerViewModelFactory((androidx.lifecycle.viewmodel.ViewModelInitializer[]) java.util.Arrays.copyOf(initializers, initializers.length));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(androidx.lifecycle.ViewModelStoreOwner owner) {
        this(owner.getViewModelStore(), androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.INSTANCE.defaultFactory$lifecycle_viewmodel_release(owner), androidx.lifecycle.ViewModelProviderGetKt.defaultCreationExtras(owner));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ViewModelProvider(androidx.lifecycle.ViewModelStoreOwner owner, androidx.lifecycle.ViewModelProvider.Factory factory) {
        this(owner.getViewModelStore(), factory, androidx.lifecycle.ViewModelProviderGetKt.defaultCreationExtras(owner));
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(factory, "factory");
    }

    public <T extends androidx.lifecycle.ViewModel> T get(java.lang.Class<T> modelClass) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        java.lang.String canonicalName = modelClass.getCanonicalName();
        if (canonicalName == null) {
            throw new java.lang.IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) get("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, modelClass);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public <T extends androidx.lifecycle.ViewModel> T get(java.lang.String key, java.lang.Class<T> modelClass) {
        T t;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        T t2 = (T) this.store.get(key);
        if (modelClass.isInstance(t2)) {
            java.lang.Object obj = this.factory;
            androidx.lifecycle.ViewModelProvider.OnRequeryFactory onRequeryFactory = obj instanceof androidx.lifecycle.ViewModelProvider.OnRequeryFactory ? (androidx.lifecycle.ViewModelProvider.OnRequeryFactory) obj : null;
            if (onRequeryFactory != null) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(t2);
                onRequeryFactory.onRequery(t2);
            }
            kotlin.jvm.internal.Intrinsics.checkNotNull(t2, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            return t2;
        }
        androidx.lifecycle.viewmodel.MutableCreationExtras mutableCreationExtras = new androidx.lifecycle.viewmodel.MutableCreationExtras(this.defaultCreationExtras);
        mutableCreationExtras.set(androidx.lifecycle.ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY, key);
        try {
            t = (T) this.factory.create(modelClass, mutableCreationExtras);
        } catch (java.lang.AbstractMethodError unused) {
            t = (T) this.factory.create(modelClass);
        }
        this.store.put(key, t);
        return t;
    }

    /* JADX INFO: compiled from: ViewModelProvider.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0005¢\u0006\u0002\u0010\u0002J%\u0010\u0003\u001a\u0002H\u0004\"\b\b\u0000\u0010\u0004*\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0007H\u0016¢\u0006\u0002\u0010\b¨\u0006\n"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "()V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class NewInstanceFactory implements androidx.lifecycle.ViewModelProvider.Factory {

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion INSTANCE = new androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion(null);
        public static final androidx.lifecycle.viewmodel.CreationExtras.Key<java.lang.String> VIEW_MODEL_KEY = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl.INSTANCE;
        private static androidx.lifecycle.ViewModelProvider.NewInstanceFactory sInstance;

        public static final androidx.lifecycle.ViewModelProvider.NewInstanceFactory getInstance() {
            return INSTANCE.getInstance();
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> modelClass) throws java.lang.reflect.InvocationTargetException {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            try {
                T tNewInstance = modelClass.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tNewInstance, "{\n                modelC…wInstance()\n            }");
                return tNewInstance;
            } catch (java.lang.IllegalAccessException e) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + modelClass, e);
            } catch (java.lang.InstantiationException e2) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + modelClass, e2);
            } catch (java.lang.NoSuchMethodException e3) {
                throw new java.lang.RuntimeException("Cannot create an instance of " + modelClass, e3);
            }
        }

        /* JADX INFO: compiled from: ViewModelProvider.kt */
        @kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u00078GX\u0087\u0004¢\u0006\f\u0012\u0004\b\b\u0010\u0002\u001a\u0004\b\t\u0010\nR\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion;", "", "()V", "VIEW_MODEL_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", com.json.j5.p, "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "getInstance$annotations", "getInstance", "()Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "sInstance", "ViewModelKeyImpl", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @kotlin.jvm.JvmStatic
            public static /* synthetic */ void getInstance$annotations() {
            }

            private Companion() {
            }

            public final androidx.lifecycle.ViewModelProvider.NewInstanceFactory getInstance() {
                if (androidx.lifecycle.ViewModelProvider.NewInstanceFactory.sInstance == null) {
                    androidx.lifecycle.ViewModelProvider.NewInstanceFactory.sInstance = new androidx.lifecycle.ViewModelProvider.NewInstanceFactory();
                }
                androidx.lifecycle.ViewModelProvider.NewInstanceFactory newInstanceFactory = androidx.lifecycle.ViewModelProvider.NewInstanceFactory.sInstance;
                kotlin.jvm.internal.Intrinsics.checkNotNull(newInstanceFactory);
                return newInstanceFactory;
            }

            /* JADX INFO: compiled from: ViewModelProvider.kt */
            @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory$Companion$ViewModelKeyImpl;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            private static final class ViewModelKeyImpl implements androidx.lifecycle.viewmodel.CreationExtras.Key<java.lang.String> {
                public static final androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl INSTANCE = new androidx.lifecycle.ViewModelProvider.NewInstanceFactory.Companion.ViewModelKeyImpl();

                private ViewModelKeyImpl() {
                }
            }
        }
    }

    /* JADX INFO: compiled from: ViewModelProvider.kt */
    @kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0019\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ%\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\rH\u0016¢\u0006\u0002\u0010\u000eJ-\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\u0006\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u0010J-\u0010\t\u001a\u0002H\n\"\b\b\u0000\u0010\n*\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\n0\r2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016¢\u0006\u0002\u0010\u0013R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "Landroidx/lifecycle/ViewModelProvider$NewInstanceFactory;", "()V", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "unused", "", "(Landroid/app/Application;I)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/ViewModel;", "extras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "(Ljava/lang/Class;Landroidx/lifecycle/viewmodel/CreationExtras;)Landroidx/lifecycle/ViewModel;", "Companion", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static class AndroidViewModelFactory extends androidx.lifecycle.ViewModelProvider.NewInstanceFactory {
        public static final java.lang.String DEFAULT_KEY = "androidx.lifecycle.ViewModelProvider.DefaultKey";
        private static androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory sInstance;
        private final android.app.Application application;

        /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
        public static final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion INSTANCE = new androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion(null);
        public static final androidx.lifecycle.viewmodel.CreationExtras.Key<android.app.Application> APPLICATION_KEY = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.ApplicationKeyImpl.INSTANCE;

        @kotlin.jvm.JvmStatic
        public static final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory getInstance(android.app.Application application) {
            return INSTANCE.getInstance(application);
        }

        private AndroidViewModelFactory(android.app.Application application, int i) {
            this.application = application;
        }

        public AndroidViewModelFactory() {
            this(null, 0);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public AndroidViewModelFactory(android.app.Application application) {
            this(application, 0);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "application");
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> modelClass, androidx.lifecycle.viewmodel.CreationExtras extras) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(extras, "extras");
            if (this.application != null) {
                return (T) create(modelClass);
            }
            android.app.Application application = (android.app.Application) extras.get(APPLICATION_KEY);
            if (application != null) {
                return (T) create(modelClass, application);
            }
            if (androidx.lifecycle.AndroidViewModel.class.isAssignableFrom(modelClass)) {
                throw new java.lang.IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.create(modelClass);
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> modelClass) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            android.app.Application application = this.application;
            if (application == null) {
                throw new java.lang.UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
            }
            return (T) create(modelClass, application);
        }

        private final <T extends androidx.lifecycle.ViewModel> T create(java.lang.Class<T> modelClass, android.app.Application app) {
            if (androidx.lifecycle.AndroidViewModel.class.isAssignableFrom(modelClass)) {
                try {
                    T tNewInstance = modelClass.getConstructor(android.app.Application.class).newInstance(app);
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(tNewInstance, "{\n                try {\n…          }\n            }");
                    return tNewInstance;
                } catch (java.lang.IllegalAccessException e) {
                    throw new java.lang.RuntimeException("Cannot create an instance of " + modelClass, e);
                } catch (java.lang.InstantiationException e2) {
                    throw new java.lang.RuntimeException("Cannot create an instance of " + modelClass, e2);
                } catch (java.lang.NoSuchMethodException e3) {
                    throw new java.lang.RuntimeException("Cannot create an instance of " + modelClass, e3);
                } catch (java.lang.reflect.InvocationTargetException e4) {
                    throw new java.lang.RuntimeException("Cannot create an instance of " + modelClass, e4);
                }
            }
            return (T) super.create(modelClass);
        }

        /* JADX INFO: compiled from: ViewModelProvider.kt */
        @kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0011B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0000¢\u0006\u0002\b\u000eJ\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0005H\u0007R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0080T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion;", "", "()V", "APPLICATION_KEY", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "DEFAULT_KEY", "", "sInstance", "Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory;", "defaultFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "owner", "Landroidx/lifecycle/ViewModelStoreOwner;", "defaultFactory$lifecycle_viewmodel_release", "getInstance", "application", "ApplicationKeyImpl", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final androidx.lifecycle.ViewModelProvider.Factory defaultFactory$lifecycle_viewmodel_release(androidx.lifecycle.ViewModelStoreOwner owner) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(owner, "owner");
                return owner instanceof androidx.lifecycle.HasDefaultViewModelProviderFactory ? ((androidx.lifecycle.HasDefaultViewModelProviderFactory) owner).getDefaultViewModelProviderFactory() : androidx.lifecycle.ViewModelProvider.NewInstanceFactory.INSTANCE.getInstance();
            }

            @kotlin.jvm.JvmStatic
            public final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory getInstance(android.app.Application application) {
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "application");
                if (androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.sInstance == null) {
                    androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.sInstance = new androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory(application);
                }
                androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory androidViewModelFactory = androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.sInstance;
                kotlin.jvm.internal.Intrinsics.checkNotNull(androidViewModelFactory);
                return androidViewModelFactory;
            }

            /* JADX INFO: compiled from: ViewModelProvider.kt */
            @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/ViewModelProvider$AndroidViewModelFactory$Companion$ApplicationKeyImpl;", "Landroidx/lifecycle/viewmodel/CreationExtras$Key;", "Landroid/app/Application;", "()V", "lifecycle-viewmodel_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            private static final class ApplicationKeyImpl implements androidx.lifecycle.viewmodel.CreationExtras.Key<android.app.Application> {
                public static final androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.ApplicationKeyImpl INSTANCE = new androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory.Companion.ApplicationKeyImpl();

                private ApplicationKeyImpl() {
                }
            }
        }
    }
}
