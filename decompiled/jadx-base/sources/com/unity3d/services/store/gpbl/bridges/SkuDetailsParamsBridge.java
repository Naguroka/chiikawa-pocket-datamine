package com.unity3d.services.store.gpbl.bridges;

/* JADX INFO: loaded from: classes6.dex */
public class SkuDetailsParamsBridge extends com.unity3d.services.core.reflection.GenericBridge {
    private static final java.lang.String newBuilderMethodName = "newBuilder";
    private static final java.util.Map<java.lang.String, java.lang.Class<?>[]> staticMethods = new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.1
        {
            put(com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.newBuilderMethodName, new java.lang.Class[0]);
        }
    };
    private final java.lang.Object _skuDetailsParamsInternalInstance;

    @Override // com.unity3d.services.core.reflection.GenericBridge
    protected java.lang.String getClassName() {
        return "com.android.billingclient.api.SkuDetailsParams";
    }

    public SkuDetailsParamsBridge(java.lang.Object obj) {
        super(new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.2
            {
                put(com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.newBuilderMethodName, new java.lang.Class[0]);
            }
        });
        this._skuDetailsParamsInternalInstance = obj;
    }

    public java.lang.Object getInternalInstance() {
        return this._skuDetailsParamsInternalInstance;
    }

    public static com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.BuilderBridge newBuilder() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        return new com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.BuilderBridge(callNonVoidStaticMethod(newBuilderMethodName, new java.lang.Object[0]));
    }

    public static java.lang.Object callNonVoidStaticMethod(java.lang.String str, java.lang.Object... objArr) throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
        return getClassForBridge().getMethod(str, staticMethods.get(str)).invoke(null, objArr);
    }

    public static java.lang.Class<?> getClassForBridge() throws java.lang.ClassNotFoundException {
        return java.lang.Class.forName("com.android.billingclient.api.SkuDetailsParams");
    }

    public static class BuilderBridge extends com.unity3d.services.core.reflection.GenericBridge {
        private static final java.lang.String buildMethodName = "build";
        private static final java.lang.String setSkusListMethodName = "setSkusList";
        private static final java.lang.String setTypeMethodName = "setType";
        private java.lang.Object _skuDetailsParamsBuilderInternalInstance;

        @Override // com.unity3d.services.core.reflection.GenericBridge
        protected java.lang.String getClassName() {
            return "com.android.billingclient.api.SkuDetailsParams$Builder";
        }

        public BuilderBridge(java.lang.Object obj) {
            super(new java.util.HashMap<java.lang.String, java.lang.Class<?>[]>() { // from class: com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.BuilderBridge.1
                {
                    put(com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.BuilderBridge.buildMethodName, new java.lang.Class[0]);
                    put(com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.BuilderBridge.setSkusListMethodName, new java.lang.Class[]{java.util.List.class});
                    put(com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.BuilderBridge.setTypeMethodName, new java.lang.Class[]{java.lang.String.class});
                }
            });
            this._skuDetailsParamsBuilderInternalInstance = obj;
        }

        public com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.BuilderBridge setSkuList(java.util.List<java.lang.String> list) {
            this._skuDetailsParamsBuilderInternalInstance = callNonVoidMethod(setSkusListMethodName, this._skuDetailsParamsBuilderInternalInstance, list);
            return this;
        }

        public com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge.BuilderBridge setType(java.lang.String str) {
            this._skuDetailsParamsBuilderInternalInstance = callNonVoidMethod(setTypeMethodName, this._skuDetailsParamsBuilderInternalInstance, str);
            return this;
        }

        public com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge build() throws java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException, java.lang.reflect.InvocationTargetException {
            return new com.unity3d.services.store.gpbl.bridges.SkuDetailsParamsBridge(callNonVoidMethod(buildMethodName, this._skuDetailsParamsBuilderInternalInstance, new java.lang.Object[0]));
        }
    }
}
