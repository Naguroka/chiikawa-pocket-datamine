package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes6.dex */
public class Reflection {
    private static final kotlin.reflect.KClass[] EMPTY_K_CLASS_ARRAY;
    static final java.lang.String REFLECTION_NOT_AVAILABLE = " (Kotlin reflection is not available)";
    private static final kotlin.jvm.internal.ReflectionFactory factory;

    static {
        kotlin.jvm.internal.ReflectionFactory reflectionFactory = null;
        try {
            reflectionFactory = (kotlin.jvm.internal.ReflectionFactory) java.lang.Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (java.lang.ClassCastException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
        }
        if (reflectionFactory == null) {
            reflectionFactory = new kotlin.jvm.internal.ReflectionFactory();
        }
        factory = reflectionFactory;
        EMPTY_K_CLASS_ARRAY = new kotlin.reflect.KClass[0];
    }

    public static kotlin.reflect.KClass createKotlinClass(java.lang.Class cls) {
        return factory.createKotlinClass(cls);
    }

    public static kotlin.reflect.KClass createKotlinClass(java.lang.Class cls, java.lang.String str) {
        return factory.createKotlinClass(cls, str);
    }

    public static kotlin.reflect.KDeclarationContainer getOrCreateKotlinPackage(java.lang.Class cls) {
        return factory.getOrCreateKotlinPackage(cls, "");
    }

    public static kotlin.reflect.KDeclarationContainer getOrCreateKotlinPackage(java.lang.Class cls, java.lang.String str) {
        return factory.getOrCreateKotlinPackage(cls, str);
    }

    public static kotlin.reflect.KClass getOrCreateKotlinClass(java.lang.Class cls) {
        return factory.getOrCreateKotlinClass(cls);
    }

    public static kotlin.reflect.KClass getOrCreateKotlinClass(java.lang.Class cls, java.lang.String str) {
        return factory.getOrCreateKotlinClass(cls, str);
    }

    public static kotlin.reflect.KClass[] getOrCreateKotlinClasses(java.lang.Class[] clsArr) {
        int length = clsArr.length;
        if (length == 0) {
            return EMPTY_K_CLASS_ARRAY;
        }
        kotlin.reflect.KClass[] kClassArr = new kotlin.reflect.KClass[length];
        for (int i = 0; i < length; i++) {
            kClassArr[i] = getOrCreateKotlinClass(clsArr[i]);
        }
        return kClassArr;
    }

    public static java.lang.String renderLambdaToString(kotlin.jvm.internal.Lambda lambda) {
        return factory.renderLambdaToString(lambda);
    }

    public static java.lang.String renderLambdaToString(kotlin.jvm.internal.FunctionBase functionBase) {
        return factory.renderLambdaToString(functionBase);
    }

    public static kotlin.reflect.KFunction function(kotlin.jvm.internal.FunctionReference functionReference) {
        return factory.function(functionReference);
    }

    public static kotlin.reflect.KProperty0 property0(kotlin.jvm.internal.PropertyReference0 propertyReference0) {
        return factory.property0(propertyReference0);
    }

    public static kotlin.reflect.KMutableProperty0 mutableProperty0(kotlin.jvm.internal.MutablePropertyReference0 mutablePropertyReference0) {
        return factory.mutableProperty0(mutablePropertyReference0);
    }

    public static kotlin.reflect.KProperty1 property1(kotlin.jvm.internal.PropertyReference1 propertyReference1) {
        return factory.property1(propertyReference1);
    }

    public static kotlin.reflect.KMutableProperty1 mutableProperty1(kotlin.jvm.internal.MutablePropertyReference1 mutablePropertyReference1) {
        return factory.mutableProperty1(mutablePropertyReference1);
    }

    public static kotlin.reflect.KProperty2 property2(kotlin.jvm.internal.PropertyReference2 propertyReference2) {
        return factory.property2(propertyReference2);
    }

    public static kotlin.reflect.KMutableProperty2 mutableProperty2(kotlin.jvm.internal.MutablePropertyReference2 mutablePropertyReference2) {
        return factory.mutableProperty2(mutablePropertyReference2);
    }

    public static kotlin.reflect.KType typeOf(kotlin.reflect.KClassifier kClassifier) {
        return factory.typeOf(kClassifier, java.util.Collections.emptyList(), false);
    }

    public static kotlin.reflect.KType typeOf(java.lang.Class cls) {
        return factory.typeOf(getOrCreateKotlinClass(cls), java.util.Collections.emptyList(), false);
    }

    public static kotlin.reflect.KType typeOf(java.lang.Class cls, kotlin.reflect.KTypeProjection kTypeProjection) {
        return factory.typeOf(getOrCreateKotlinClass(cls), java.util.Collections.singletonList(kTypeProjection), false);
    }

    public static kotlin.reflect.KType typeOf(java.lang.Class cls, kotlin.reflect.KTypeProjection kTypeProjection, kotlin.reflect.KTypeProjection kTypeProjection2) {
        return factory.typeOf(getOrCreateKotlinClass(cls), java.util.Arrays.asList(kTypeProjection, kTypeProjection2), false);
    }

    public static kotlin.reflect.KType typeOf(java.lang.Class cls, kotlin.reflect.KTypeProjection... kTypeProjectionArr) {
        return factory.typeOf(getOrCreateKotlinClass(cls), kotlin.collections.ArraysKt.toList(kTypeProjectionArr), false);
    }

    public static kotlin.reflect.KType nullableTypeOf(kotlin.reflect.KClassifier kClassifier) {
        return factory.typeOf(kClassifier, java.util.Collections.emptyList(), true);
    }

    public static kotlin.reflect.KType nullableTypeOf(java.lang.Class cls) {
        return factory.typeOf(getOrCreateKotlinClass(cls), java.util.Collections.emptyList(), true);
    }

    public static kotlin.reflect.KType nullableTypeOf(java.lang.Class cls, kotlin.reflect.KTypeProjection kTypeProjection) {
        return factory.typeOf(getOrCreateKotlinClass(cls), java.util.Collections.singletonList(kTypeProjection), true);
    }

    public static kotlin.reflect.KType nullableTypeOf(java.lang.Class cls, kotlin.reflect.KTypeProjection kTypeProjection, kotlin.reflect.KTypeProjection kTypeProjection2) {
        return factory.typeOf(getOrCreateKotlinClass(cls), java.util.Arrays.asList(kTypeProjection, kTypeProjection2), true);
    }

    public static kotlin.reflect.KType nullableTypeOf(java.lang.Class cls, kotlin.reflect.KTypeProjection... kTypeProjectionArr) {
        return factory.typeOf(getOrCreateKotlinClass(cls), kotlin.collections.ArraysKt.toList(kTypeProjectionArr), true);
    }

    public static kotlin.reflect.KTypeParameter typeParameter(java.lang.Object obj, java.lang.String str, kotlin.reflect.KVariance kVariance, boolean z) {
        return factory.typeParameter(obj, str, kVariance, z);
    }

    public static void setUpperBounds(kotlin.reflect.KTypeParameter kTypeParameter, kotlin.reflect.KType kType) {
        factory.setUpperBounds(kTypeParameter, java.util.Collections.singletonList(kType));
    }

    public static void setUpperBounds(kotlin.reflect.KTypeParameter kTypeParameter, kotlin.reflect.KType... kTypeArr) {
        factory.setUpperBounds(kTypeParameter, kotlin.collections.ArraysKt.toList(kTypeArr));
    }

    public static kotlin.reflect.KType platformType(kotlin.reflect.KType kType, kotlin.reflect.KType kType2) {
        return factory.platformType(kType, kType2);
    }

    public static kotlin.reflect.KType mutableCollectionType(kotlin.reflect.KType kType) {
        return factory.mutableCollectionType(kType);
    }

    public static kotlin.reflect.KType nothingType(kotlin.reflect.KType kType) {
        return factory.nothingType(kType);
    }
}
