package androidx.window.layout;

/* JADX INFO: compiled from: SafeWindowLayoutComponentProvider.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u0010\u001a\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0003J\u0010\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0017\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u0019H\u0002J \u0010\u001a\u001a\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u001b\u001a\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J \u0010\u001c\u001a\u0012\u0012\u0002\b\u0003 \u0012*\b\u0012\u0002\b\u0003\u0018\u00010\u00110\u00112\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u0018\u0010\u001d\u001a\u00020\n*\u00020\u000b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u0011H\u0002J\u0018\u0010\u001d\u001a\u00020\n*\u00020\u000b2\n\u0010\u001e\u001a\u0006\u0012\u0002\b\u00030\u001fH\u0002R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u00020\n*\u00020\u000b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\f¨\u0006 "}, d2 = {"Landroidx/window/layout/SafeWindowLayoutComponentProvider;", "", "()V", "windowLayoutComponent", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "getWindowLayoutComponent", "()Landroidx/window/extensions/layout/WindowLayoutComponent;", "windowLayoutComponent$delegate", "Lkotlin/Lazy;", "isPublic", "", "Ljava/lang/reflect/Method;", "(Ljava/lang/reflect/Method;)Z", "canUseWindowLayoutComponent", "classLoader", "Ljava/lang/ClassLoader;", "foldingFeatureClass", "Ljava/lang/Class;", "kotlin.jvm.PlatformType", "isFoldingFeatureValid", "isWindowExtensionsValid", "isWindowLayoutComponentValid", "isWindowLayoutProviderValid", "validate", "block", "Lkotlin/Function0;", "windowExtensionsClass", "windowExtensionsProviderClass", "windowLayoutComponentClass", "doesReturn", "clazz", "Lkotlin/reflect/KClass;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class SafeWindowLayoutComponentProvider {
    public static final androidx.window.layout.SafeWindowLayoutComponentProvider INSTANCE = new androidx.window.layout.SafeWindowLayoutComponentProvider();

    /* JADX INFO: renamed from: windowLayoutComponent$delegate, reason: from kotlin metadata */
    private static final kotlin.Lazy windowLayoutComponent = kotlin.LazyKt.lazy(new kotlin.jvm.functions.Function0<androidx.window.extensions.layout.WindowLayoutComponent>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider$windowLayoutComponent$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final androidx.window.extensions.layout.WindowLayoutComponent invoke() {
            java.lang.ClassLoader classLoader = androidx.window.layout.SafeWindowLayoutComponentProvider.class.getClassLoader();
            if (classLoader != null && androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE.canUseWindowLayoutComponent(classLoader)) {
                try {
                    return androidx.window.extensions.WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
                } catch (java.lang.UnsupportedOperationException unused) {
                    return null;
                }
            }
            return null;
        }
    });

    private SafeWindowLayoutComponentProvider() {
    }

    public final androidx.window.extensions.layout.WindowLayoutComponent getWindowLayoutComponent() {
        return (androidx.window.extensions.layout.WindowLayoutComponent) windowLayoutComponent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean canUseWindowLayoutComponent(java.lang.ClassLoader classLoader) {
        return isWindowLayoutProviderValid(classLoader) && isWindowExtensionsValid(classLoader) && isWindowLayoutComponentValid(classLoader) && isFoldingFeatureValid(classLoader);
    }

    private final boolean isWindowLayoutProviderValid(final java.lang.ClassLoader classLoader) {
        return validate(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider.isWindowLayoutProviderValid.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException {
                boolean z = false;
                java.lang.reflect.Method getWindowExtensionsMethod = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE.windowExtensionsProviderClass(classLoader).getDeclaredMethod("getWindowExtensions", new java.lang.Class[0]);
                java.lang.Class windowExtensionsClass = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE.windowExtensionsClass(classLoader);
                androidx.window.layout.SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getWindowExtensionsMethod, "getWindowExtensionsMethod");
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(windowExtensionsClass, "windowExtensionsClass");
                if (safeWindowLayoutComponentProvider.doesReturn(getWindowExtensionsMethod, (java.lang.Class<?>) windowExtensionsClass) && androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE.isPublic(getWindowExtensionsMethod)) {
                    z = true;
                }
                return java.lang.Boolean.valueOf(z);
            }
        });
    }

    private final boolean isWindowExtensionsValid(final java.lang.ClassLoader classLoader) {
        return validate(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider.isWindowExtensionsValid.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException {
                boolean z = false;
                java.lang.reflect.Method getWindowLayoutComponentMethod = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE.windowExtensionsClass(classLoader).getMethod("getWindowLayoutComponent", new java.lang.Class[0]);
                java.lang.Class windowLayoutComponentClass = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE.windowLayoutComponentClass(classLoader);
                androidx.window.layout.SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
                if (safeWindowLayoutComponentProvider.isPublic(getWindowLayoutComponentMethod)) {
                    androidx.window.layout.SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider2 = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(windowLayoutComponentClass, "windowLayoutComponentClass");
                    if (safeWindowLayoutComponentProvider2.doesReturn(getWindowLayoutComponentMethod, (java.lang.Class<?>) windowLayoutComponentClass)) {
                        z = true;
                    }
                }
                return java.lang.Boolean.valueOf(z);
            }
        });
    }

    private final boolean isFoldingFeatureValid(final java.lang.ClassLoader classLoader) {
        return validate(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider.isFoldingFeatureValid.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException {
                java.lang.Class clsFoldingFeatureClass = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE.foldingFeatureClass(classLoader);
                boolean z = false;
                java.lang.reflect.Method getBoundsMethod = clsFoldingFeatureClass.getMethod("getBounds", new java.lang.Class[0]);
                java.lang.reflect.Method getTypeMethod = clsFoldingFeatureClass.getMethod("getType", new java.lang.Class[0]);
                java.lang.reflect.Method getStateMethod = clsFoldingFeatureClass.getMethod("getState", new java.lang.Class[0]);
                androidx.window.layout.SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getBoundsMethod, "getBoundsMethod");
                if (safeWindowLayoutComponentProvider.doesReturn(getBoundsMethod, (kotlin.reflect.KClass<?>) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(android.graphics.Rect.class)) && androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE.isPublic(getBoundsMethod)) {
                    androidx.window.layout.SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider2 = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getTypeMethod, "getTypeMethod");
                    if (safeWindowLayoutComponentProvider2.doesReturn(getTypeMethod, (kotlin.reflect.KClass<?>) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.TYPE)) && androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE.isPublic(getTypeMethod)) {
                        androidx.window.layout.SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider3 = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE;
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(getStateMethod, "getStateMethod");
                        if (safeWindowLayoutComponentProvider3.doesReturn(getStateMethod, (kotlin.reflect.KClass<?>) kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(java.lang.Integer.TYPE)) && androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE.isPublic(getStateMethod)) {
                            z = true;
                        }
                    }
                }
                return java.lang.Boolean.valueOf(z);
            }
        });
    }

    private final boolean isWindowLayoutComponentValid(final java.lang.ClassLoader classLoader) {
        return validate(new kotlin.jvm.functions.Function0<java.lang.Boolean>() { // from class: androidx.window.layout.SafeWindowLayoutComponentProvider.isWindowLayoutComponentValid.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            public final java.lang.Boolean invoke() throws java.lang.NoSuchMethodException {
                java.lang.Class clsWindowLayoutComponentClass = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE.windowLayoutComponentClass(classLoader);
                boolean z = false;
                java.lang.reflect.Method addListenerMethod = clsWindowLayoutComponentClass.getMethod("addWindowLayoutInfoListener", android.app.Activity.class, java.util.function.Consumer.class);
                java.lang.reflect.Method removeListenerMethod = clsWindowLayoutComponentClass.getMethod("removeWindowLayoutInfoListener", java.util.function.Consumer.class);
                androidx.window.layout.SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE;
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(addListenerMethod, "addListenerMethod");
                if (safeWindowLayoutComponentProvider.isPublic(addListenerMethod)) {
                    androidx.window.layout.SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider2 = androidx.window.layout.SafeWindowLayoutComponentProvider.INSTANCE;
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(removeListenerMethod, "removeListenerMethod");
                    if (safeWindowLayoutComponentProvider2.isPublic(removeListenerMethod)) {
                        z = true;
                    }
                }
                return java.lang.Boolean.valueOf(z);
            }
        });
    }

    private final boolean validate(kotlin.jvm.functions.Function0<java.lang.Boolean> block) {
        try {
            return block.invoke().booleanValue();
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isPublic(java.lang.reflect.Method method) {
        return java.lang.reflect.Modifier.isPublic(method.getModifiers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doesReturn(java.lang.reflect.Method method, kotlin.reflect.KClass<?> kClass) {
        return doesReturn(method, kotlin.jvm.JvmClassMappingKt.getJavaClass((kotlin.reflect.KClass) kClass));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean doesReturn(java.lang.reflect.Method method, java.lang.Class<?> cls) {
        return method.getReturnType().equals(cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Class<?> windowExtensionsProviderClass(java.lang.ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensionsProvider");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Class<?> windowExtensionsClass(java.lang.ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.WindowExtensions");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Class<?> foldingFeatureClass(java.lang.ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.FoldingFeature");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final java.lang.Class<?> windowLayoutComponentClass(java.lang.ClassLoader classLoader) {
        return classLoader.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
    }
}
