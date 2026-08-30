package kotlin.jvm.internal;

/* JADX INFO: loaded from: classes6.dex */
public class ReflectionFactory {
    private static final java.lang.String KOTLIN_JVM_FUNCTIONS = "kotlin.jvm.functions.";

    public kotlin.reflect.KFunction function(kotlin.jvm.internal.FunctionReference functionReference) {
        return functionReference;
    }

    public kotlin.reflect.KMutableProperty0 mutableProperty0(kotlin.jvm.internal.MutablePropertyReference0 mutablePropertyReference0) {
        return mutablePropertyReference0;
    }

    public kotlin.reflect.KMutableProperty1 mutableProperty1(kotlin.jvm.internal.MutablePropertyReference1 mutablePropertyReference1) {
        return mutablePropertyReference1;
    }

    public kotlin.reflect.KMutableProperty2 mutableProperty2(kotlin.jvm.internal.MutablePropertyReference2 mutablePropertyReference2) {
        return mutablePropertyReference2;
    }

    public kotlin.reflect.KProperty0 property0(kotlin.jvm.internal.PropertyReference0 propertyReference0) {
        return propertyReference0;
    }

    public kotlin.reflect.KProperty1 property1(kotlin.jvm.internal.PropertyReference1 propertyReference1) {
        return propertyReference1;
    }

    public kotlin.reflect.KProperty2 property2(kotlin.jvm.internal.PropertyReference2 propertyReference2) {
        return propertyReference2;
    }

    public kotlin.reflect.KClass createKotlinClass(java.lang.Class cls) {
        return new kotlin.jvm.internal.ClassReference(cls);
    }

    public kotlin.reflect.KClass createKotlinClass(java.lang.Class cls, java.lang.String str) {
        return new kotlin.jvm.internal.ClassReference(cls);
    }

    public kotlin.reflect.KDeclarationContainer getOrCreateKotlinPackage(java.lang.Class cls, java.lang.String str) {
        return new kotlin.jvm.internal.PackageReference(cls, str);
    }

    public kotlin.reflect.KClass getOrCreateKotlinClass(java.lang.Class cls) {
        return new kotlin.jvm.internal.ClassReference(cls);
    }

    public kotlin.reflect.KClass getOrCreateKotlinClass(java.lang.Class cls, java.lang.String str) {
        return new kotlin.jvm.internal.ClassReference(cls);
    }

    public java.lang.String renderLambdaToString(kotlin.jvm.internal.Lambda lambda) {
        return renderLambdaToString((kotlin.jvm.internal.FunctionBase) lambda);
    }

    public java.lang.String renderLambdaToString(kotlin.jvm.internal.FunctionBase functionBase) {
        java.lang.String string = functionBase.getClass().getGenericInterfaces()[0].toString();
        return string.startsWith(KOTLIN_JVM_FUNCTIONS) ? string.substring(21) : string;
    }

    public kotlin.reflect.KType typeOf(kotlin.reflect.KClassifier kClassifier, java.util.List<kotlin.reflect.KTypeProjection> list, boolean z) {
        return new kotlin.jvm.internal.TypeReference(kClassifier, list, z);
    }

    public kotlin.reflect.KTypeParameter typeParameter(java.lang.Object obj, java.lang.String str, kotlin.reflect.KVariance kVariance, boolean z) {
        return new kotlin.jvm.internal.TypeParameterReference(obj, str, kVariance, z);
    }

    public void setUpperBounds(kotlin.reflect.KTypeParameter kTypeParameter, java.util.List<kotlin.reflect.KType> list) {
        ((kotlin.jvm.internal.TypeParameterReference) kTypeParameter).setUpperBounds(list);
    }

    public kotlin.reflect.KType platformType(kotlin.reflect.KType kType, kotlin.reflect.KType kType2) {
        return new kotlin.jvm.internal.TypeReference(kType.getClassifier(), kType.getArguments(), kType2, ((kotlin.jvm.internal.TypeReference) kType).getFlags());
    }

    public kotlin.reflect.KType mutableCollectionType(kotlin.reflect.KType kType) {
        kotlin.jvm.internal.TypeReference typeReference = (kotlin.jvm.internal.TypeReference) kType;
        return new kotlin.jvm.internal.TypeReference(kType.getClassifier(), kType.getArguments(), typeReference.getPlatformTypeUpperBound(), typeReference.getFlags() | 2);
    }

    public kotlin.reflect.KType nothingType(kotlin.reflect.KType kType) {
        kotlin.jvm.internal.TypeReference typeReference = (kotlin.jvm.internal.TypeReference) kType;
        return new kotlin.jvm.internal.TypeReference(kType.getClassifier(), kType.getArguments(), typeReference.getPlatformTypeUpperBound(), typeReference.getFlags() | 4);
    }
}
