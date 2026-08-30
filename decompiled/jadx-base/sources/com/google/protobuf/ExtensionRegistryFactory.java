package com.google.protobuf;

/* JADX INFO: loaded from: classes5.dex */
final class ExtensionRegistryFactory {
    static final java.lang.Class<?> EXTENSION_REGISTRY_CLASS = reflectExtensionRegistry();
    static final java.lang.String FULL_REGISTRY_CLASS_NAME = "com.google.protobuf.ExtensionRegistry";

    ExtensionRegistryFactory() {
    }

    static java.lang.Class<?> reflectExtensionRegistry() {
        try {
            return java.lang.Class.forName(FULL_REGISTRY_CLASS_NAME);
        } catch (java.lang.ClassNotFoundException unused) {
            return null;
        }
    }

    public static com.google.protobuf.ExtensionRegistryLite create() {
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLiteInvokeSubclassFactory = invokeSubclassFactory("newInstance");
        return extensionRegistryLiteInvokeSubclassFactory != null ? extensionRegistryLiteInvokeSubclassFactory : new com.google.protobuf.ExtensionRegistryLite();
    }

    public static com.google.protobuf.ExtensionRegistryLite createEmpty() {
        com.google.protobuf.ExtensionRegistryLite extensionRegistryLiteInvokeSubclassFactory = invokeSubclassFactory("getEmptyRegistry");
        return extensionRegistryLiteInvokeSubclassFactory != null ? extensionRegistryLiteInvokeSubclassFactory : com.google.protobuf.ExtensionRegistryLite.EMPTY_REGISTRY_LITE;
    }

    static boolean isFullRegistry(com.google.protobuf.ExtensionRegistryLite extensionRegistryLite) {
        java.lang.Class<?> cls = EXTENSION_REGISTRY_CLASS;
        return cls != null && cls.isAssignableFrom(extensionRegistryLite.getClass());
    }

    private static final com.google.protobuf.ExtensionRegistryLite invokeSubclassFactory(java.lang.String str) {
        java.lang.Class<?> cls = EXTENSION_REGISTRY_CLASS;
        if (cls == null) {
            return null;
        }
        try {
            return (com.google.protobuf.ExtensionRegistryLite) cls.getDeclaredMethod(str, new java.lang.Class[0]).invoke(null, new java.lang.Object[0]);
        } catch (java.lang.Exception unused) {
            return null;
        }
    }
}
