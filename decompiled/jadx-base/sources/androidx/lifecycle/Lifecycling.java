package androidx.lifecycle;

/* JADX INFO: compiled from: Lifecycling.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\r\u001a\u00020\f2\u000e\u0010\u000e\u001a\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002J\u001e\u0010\u0010\u001a\f\u0012\u0006\b\u0001\u0012\u00020\f\u0018\u00010\u000b2\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0013H\u0007J\u0014\u0010\u0015\u001a\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002J\u0016\u0010\u0016\u001a\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\bH\u0002J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u0001H\u0007J\u0014\u0010\u001a\u001a\u00020\u00042\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\bH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0004\u0012\u00020\u00040\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R,\u0010\t\u001a \u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\f0\u000b0\n0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/lifecycle/Lifecycling;", "", "()V", "GENERATED_CALLBACK", "", "REFLECTIVE_CALLBACK", "callbackCache", "", "Ljava/lang/Class;", "classToAdapters", "", "Ljava/lang/reflect/Constructor;", "Landroidx/lifecycle/GeneratedAdapter;", "createGeneratedAdapter", "constructor", "object", "generatedConstructor", "klass", "getAdapterName", "", "className", "getObserverConstructorType", "isLifecycleParent", "", "lifecycleEventObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "resolveObserverCallbackType", "lifecycle-common"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class Lifecycling {
    private static final int GENERATED_CALLBACK = 2;
    private static final int REFLECTIVE_CALLBACK = 1;
    public static final androidx.lifecycle.Lifecycling INSTANCE = new androidx.lifecycle.Lifecycling();
    private static final java.util.Map<java.lang.Class<?>, java.lang.Integer> callbackCache = new java.util.HashMap();
    private static final java.util.Map<java.lang.Class<?>, java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>>> classToAdapters = new java.util.HashMap();

    private Lifecycling() {
    }

    @kotlin.jvm.JvmStatic
    public static final androidx.lifecycle.LifecycleEventObserver lifecycleEventObserver(java.lang.Object object) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(object, "object");
        boolean z = object instanceof androidx.lifecycle.LifecycleEventObserver;
        boolean z2 = object instanceof androidx.lifecycle.DefaultLifecycleObserver;
        if (z && z2) {
            return new androidx.lifecycle.DefaultLifecycleObserverAdapter((androidx.lifecycle.DefaultLifecycleObserver) object, (androidx.lifecycle.LifecycleEventObserver) object);
        }
        if (z2) {
            return new androidx.lifecycle.DefaultLifecycleObserverAdapter((androidx.lifecycle.DefaultLifecycleObserver) object, null);
        }
        if (z) {
            return (androidx.lifecycle.LifecycleEventObserver) object;
        }
        java.lang.Class<?> cls = object.getClass();
        androidx.lifecycle.Lifecycling lifecycling = INSTANCE;
        if (lifecycling.getObserverConstructorType(cls) == 2) {
            java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>> list = classToAdapters.get(cls);
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>> list2 = list;
            if (list2.size() == 1) {
                return new androidx.lifecycle.SingleGeneratedAdapterObserver(lifecycling.createGeneratedAdapter(list2.get(0), object));
            }
            int size = list2.size();
            androidx.lifecycle.GeneratedAdapter[] generatedAdapterArr = new androidx.lifecycle.GeneratedAdapter[size];
            for (int i = 0; i < size; i++) {
                generatedAdapterArr[i] = INSTANCE.createGeneratedAdapter(list2.get(i), object);
            }
            return new androidx.lifecycle.CompositeGeneratedAdaptersObserver(generatedAdapterArr);
        }
        return new androidx.lifecycle.ReflectiveGenericLifecycleObserver(object);
    }

    private final androidx.lifecycle.GeneratedAdapter createGeneratedAdapter(java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> constructor, java.lang.Object object) {
        try {
            androidx.lifecycle.GeneratedAdapter generatedAdapterNewInstance = constructor.newInstance(object);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(generatedAdapterNewInstance, "{\n            constructo…tance(`object`)\n        }");
            return generatedAdapterNewInstance;
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException(e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException(e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException(e3);
        }
    }

    private final java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> generatedConstructor(java.lang.Class<?> klass) {
        try {
            java.lang.Package r0 = klass.getPackage();
            java.lang.String name = klass.getCanonicalName();
            java.lang.String fullPackage = r0 != null ? r0.getName() : "";
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(fullPackage, "fullPackage");
            if (!(fullPackage.length() == 0)) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "name");
                name = name.substring(fullPackage.length() + 1);
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "this as java.lang.String).substring(startIndex)");
            }
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(name, "if (fullPackage.isEmpty(…g(fullPackage.length + 1)");
            java.lang.String adapterName = getAdapterName(name);
            if (!(fullPackage.length() == 0)) {
                adapterName = fullPackage + '.' + adapterName;
            }
            java.lang.Class<?> cls = java.lang.Class.forName(adapterName);
            kotlin.jvm.internal.Intrinsics.checkNotNull(cls, "null cannot be cast to non-null type java.lang.Class<out androidx.lifecycle.GeneratedAdapter>");
            java.lang.reflect.Constructor declaredConstructor = cls.getDeclaredConstructor(klass);
            if (declaredConstructor.isAccessible()) {
                return declaredConstructor;
            }
            declaredConstructor.setAccessible(true);
            return declaredConstructor;
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        } catch (java.lang.NoSuchMethodException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private final int getObserverConstructorType(java.lang.Class<?> klass) {
        java.util.Map<java.lang.Class<?>, java.lang.Integer> map = callbackCache;
        java.lang.Integer num = map.get(klass);
        if (num != null) {
            return num.intValue();
        }
        int iResolveObserverCallbackType = resolveObserverCallbackType(klass);
        map.put(klass, java.lang.Integer.valueOf(iResolveObserverCallbackType));
        return iResolveObserverCallbackType;
    }

    private final int resolveObserverCallbackType(java.lang.Class<?> klass) {
        java.util.ArrayList arrayList;
        if (klass.getCanonicalName() == null) {
            return 1;
        }
        java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter> constructorGeneratedConstructor = generatedConstructor(klass);
        if (constructorGeneratedConstructor != null) {
            classToAdapters.put(klass, kotlin.collections.CollectionsKt.listOf(constructorGeneratedConstructor));
            return 2;
        }
        if (androidx.lifecycle.ClassesInfoCache.sInstance.hasLifecycleMethods(klass)) {
            return 1;
        }
        java.lang.Class<? super java.lang.Object> superclass = klass.getSuperclass();
        if (isLifecycleParent(superclass)) {
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(superclass, "superclass");
            if (getObserverConstructorType(superclass) == 1) {
                return 1;
            }
            java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>> list = classToAdapters.get(superclass);
            kotlin.jvm.internal.Intrinsics.checkNotNull(list);
            arrayList = new java.util.ArrayList(list);
        } else {
            arrayList = null;
        }
        java.lang.Class<?>[] interfaces = klass.getInterfaces();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(interfaces, "klass.interfaces");
        for (java.lang.Class<?> intrface : interfaces) {
            if (isLifecycleParent(intrface)) {
                kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(intrface, "intrface");
                if (getObserverConstructorType(intrface) == 1) {
                    return 1;
                }
                if (arrayList == null) {
                    arrayList = new java.util.ArrayList();
                }
                java.util.List<java.lang.reflect.Constructor<? extends androidx.lifecycle.GeneratedAdapter>> list2 = classToAdapters.get(intrface);
                kotlin.jvm.internal.Intrinsics.checkNotNull(list2);
                arrayList.addAll(list2);
            }
        }
        if (arrayList == null) {
            return 1;
        }
        classToAdapters.put(klass, arrayList);
        return 2;
    }

    private final boolean isLifecycleParent(java.lang.Class<?> klass) {
        return klass != null && androidx.lifecycle.LifecycleObserver.class.isAssignableFrom(klass);
    }

    @kotlin.jvm.JvmStatic
    public static final java.lang.String getAdapterName(java.lang.String className) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(className, "className");
        return kotlin.text.StringsKt.replace$default(className, ".", "_", false, 4, (java.lang.Object) null) + "_LifecycleAdapter";
    }
}
