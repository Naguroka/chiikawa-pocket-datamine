package androidx.lifecycle;

/* JADX INFO: compiled from: SavedStateViewModelFactory.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a6\u0010\u0004\u001a\n\u0012\u0004\u0012\u0002H\u0006\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00022\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001H\u0000\u001aI\u0010\t\u001a\u0002H\u0006\"\n\b\u0000\u0010\u0006*\u0004\u0018\u00010\n2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00060\u00052\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\r\"\u00020\u000eH\u0000¢\u0006\u0002\u0010\u000f\"\u0018\u0010\u0000\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0018\u0010\u0003\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"ANDROID_VIEWMODEL_SIGNATURE", "", "Ljava/lang/Class;", "VIEWMODEL_SIGNATURE", "findMatchingConstructor", "Ljava/lang/reflect/Constructor;", "T", "modelClass", com.unity3d.ads.metadata.InAppPurchaseMetaData.KEY_SIGNATURE, "newInstance", "Landroidx/lifecycle/ViewModel;", "constructor", "params", "", "", "(Ljava/lang/Class;Ljava/lang/reflect/Constructor;[Ljava/lang/Object;)Landroidx/lifecycle/ViewModel;", "lifecycle-viewmodel-savedstate_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class SavedStateViewModelFactoryKt {
    private static final java.util.List<java.lang.Class<?>> ANDROID_VIEWMODEL_SIGNATURE = kotlin.collections.CollectionsKt.listOf((java.lang.Object[]) new java.lang.Class[]{android.app.Application.class, androidx.lifecycle.SavedStateHandle.class});
    private static final java.util.List<java.lang.Class<?>> VIEWMODEL_SIGNATURE = kotlin.collections.CollectionsKt.listOf(androidx.lifecycle.SavedStateHandle.class);

    public static final <T extends androidx.lifecycle.ViewModel> T newInstance(java.lang.Class<T> modelClass, java.lang.reflect.Constructor<T> constructor, java.lang.Object... params) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(constructor, "constructor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(params, "params");
        try {
            return constructor.newInstance(java.util.Arrays.copyOf(params, params.length));
        } catch (java.lang.IllegalAccessException e) {
            throw new java.lang.RuntimeException("Failed to access " + modelClass, e);
        } catch (java.lang.InstantiationException e2) {
            throw new java.lang.RuntimeException("A " + modelClass + " cannot be instantiated.", e2);
        } catch (java.lang.reflect.InvocationTargetException e3) {
            throw new java.lang.RuntimeException("An exception happened in constructor of " + modelClass, e3.getCause());
        }
    }

    public static final <T> java.lang.reflect.Constructor<T> findMatchingConstructor(java.lang.Class<T> modelClass, java.util.List<? extends java.lang.Class<?>> signature) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(signature, "signature");
        java.lang.Object[] constructors = modelClass.getConstructors();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(constructors, "modelClass.constructors");
        for (java.lang.Object obj : constructors) {
            java.lang.reflect.Constructor<T> constructor = (java.lang.reflect.Constructor<T>) obj;
            java.lang.Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(parameterTypes, "constructor.parameterTypes");
            java.util.List list = kotlin.collections.ArraysKt.toList(parameterTypes);
            if (kotlin.jvm.internal.Intrinsics.areEqual(signature, list)) {
                kotlin.jvm.internal.Intrinsics.checkNotNull(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == list.size() && list.containsAll(signature)) {
                throw new java.lang.UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }
}
