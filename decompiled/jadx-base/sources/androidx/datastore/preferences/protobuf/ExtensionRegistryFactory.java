package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes.dex */
final class ExtensionRegistryFactory {
    static final java.lang.Class<?> EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();
    static final java.lang.String FULL_REGISTRY_CLASS_NAME = "androidx.datastore.preferences.protobuf.ExtensionRegistry";

    ExtensionRegistryFactory() {
    }

    static java.lang.Class<?> reflectExtensionRegistry() {
        try {
            return java.lang.Class.forName(FULL_REGISTRY_CLASS_NAME);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    public static androidx.datastore.preferences.protobuf.ExtensionRegistryLite create() {
        androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLiteInvokeSubclassFactory = invokeSubclassFactory("newInstance");
        return extensionRegistryLiteInvokeSubclassFactory != null ? extensionRegistryLiteInvokeSubclassFactory : new androidx.datastore.preferences.protobuf.ExtensionRegistryLite();
    }

    public static androidx.datastore.preferences.protobuf.ExtensionRegistryLite createEmpty() {
        androidx.datastore.preferences.protobuf.ExtensionRegistryLite extensionRegistryLiteInvokeSubclassFactory = invokeSubclassFactory("getEmptyRegistry");
        return extensionRegistryLiteInvokeSubclassFactory != null ? extensionRegistryLiteInvokeSubclassFactory : androidx.datastore.preferences.protobuf.ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
    }

    static boolean isFullRegistry(androidx.datastore.preferences.protobuf.ExtensionRegistryLite registry) {
        java.lang.Class<?> cls;
        return (androidx.datastore.preferences.protobuf.Protobuf.assumeLiteRuntime || (cls = EXTENSION_REGISTRY_CLASS) == null || !cls.isAssignableFrom(registry.getClass())) ? false : true;
    }

    private static final androidx.datastore.preferences.protobuf.ExtensionRegistryLite invokeSubclassFactory(java.lang.String methodName) {
        java.lang.Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls == null) {
            return null;
        }
        try {
            return (androidx.datastore.preferences.protobuf.ExtensionRegistryLite) cls.getDeclaredMethod(methodName, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
