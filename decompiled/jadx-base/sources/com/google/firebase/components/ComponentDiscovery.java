package com.google.firebase.components;

/* JADX INFO: loaded from: classes5.dex */
public final class ComponentDiscovery<T> {
    private static final java.lang.String COMPONENT_KEY_PREFIX = "com.google.firebase.components:";
    private static final java.lang.String COMPONENT_SENTINEL_VALUE = "com.google.firebase.components.ComponentRegistrar";
    static final java.lang.String TAG = "ComponentDiscovery";
    private final T context;
    private final com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever<T> retriever;

    interface RegistrarNameRetriever<T> {
        java.util.List<java.lang.String> retrieve(T t);
    }

    public static com.google.firebase.components.ComponentDiscovery<android.content.Context> forContext(android.content.Context context, java.lang.Class<? extends android.app.Service> cls) {
        return new com.google.firebase.components.ComponentDiscovery<>(context, new com.google.firebase.components.ComponentDiscovery.MetadataRegistrarNameRetriever(cls));
    }

    ComponentDiscovery(T t, com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever<T> registrarNameRetriever) {
        this.context = t;
        this.retriever = registrarNameRetriever;
    }

    @java.lang.Deprecated
    public java.util.List<com.google.firebase.components.ComponentRegistrar> discover() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator<java.lang.String> it = this.retriever.retrieve(this.context).iterator();
        while (it.hasNext()) {
            try {
                com.google.firebase.components.ComponentRegistrar componentRegistrarInstantiate = instantiate(it.next());
                if (componentRegistrarInstantiate != null) {
                    arrayList.add(componentRegistrarInstantiate);
                }
            } catch (com.google.firebase.components.InvalidRegistrarException e) {
                android.util.Log.w(TAG, "Invalid component registrar.", e);
            }
        }
        return arrayList;
    }

    public java.util.List<com.google.firebase.inject.Provider<com.google.firebase.components.ComponentRegistrar>> discoverLazy() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (final java.lang.String str : this.retriever.retrieve(this.context)) {
            arrayList.add(new com.google.firebase.inject.Provider() { // from class: com.google.firebase.components.ComponentDiscovery$$ExternalSyntheticLambda0
                @Override // com.google.firebase.inject.Provider
                public final java.lang.Object get() {
                    return com.google.firebase.components.ComponentDiscovery.instantiate(str);
                }
            });
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static com.google.firebase.components.ComponentRegistrar instantiate(java.lang.String str) {
        try {
            java.lang.Class<?> cls = java.lang.Class.forName(str);
            if (!com.google.firebase.components.ComponentRegistrar.class.isAssignableFrom(cls)) {
                throw new com.google.firebase.components.InvalidRegistrarException(java.lang.String.format("Class %s is not an instance of %s", str, COMPONENT_SENTINEL_VALUE));
            }
            return (com.google.firebase.components.ComponentRegistrar) cls.getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.ClassNotFoundException unused) {
            android.util.Log.w(TAG, java.lang.String.format("Class %s is not an found.", str));
            return null;
        } catch (java.lang.IllegalAccessException e) {
            throw new com.google.firebase.components.InvalidRegistrarException(java.lang.String.format("Could not instantiate %s.", str), e);
        } catch (java.lang.InstantiationException e2) {
            throw new com.google.firebase.components.InvalidRegistrarException(java.lang.String.format("Could not instantiate %s.", str), e2);
        } catch (java.lang.NoSuchMethodException e3) {
            throw new com.google.firebase.components.InvalidRegistrarException(java.lang.String.format("Could not instantiate %s", str), e3);
        } catch (java.lang.reflect.InvocationTargetException e4) {
            throw new com.google.firebase.components.InvalidRegistrarException(java.lang.String.format("Could not instantiate %s", str), e4);
        }
    }

    private static class MetadataRegistrarNameRetriever implements com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever<android.content.Context> {
        private final java.lang.Class<? extends android.app.Service> discoveryService;

        private MetadataRegistrarNameRetriever(java.lang.Class<? extends android.app.Service> cls) {
            this.discoveryService = cls;
        }

        @Override // com.google.firebase.components.ComponentDiscovery.RegistrarNameRetriever
        public java.util.List<java.lang.String> retrieve(android.content.Context context) {
            android.os.Bundle metadata = getMetadata(context);
            if (metadata == null) {
                android.util.Log.w(com.google.firebase.components.ComponentDiscovery.TAG, "Could not retrieve metadata, returning empty list of registrars.");
                return java.util.Collections.emptyList();
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.String str : metadata.keySet()) {
                if (com.google.firebase.components.ComponentDiscovery.COMPONENT_SENTINEL_VALUE.equals(metadata.get(str)) && str.startsWith(com.google.firebase.components.ComponentDiscovery.COMPONENT_KEY_PREFIX)) {
                    arrayList.add(str.substring(31));
                }
            }
            return arrayList;
        }

        private android.os.Bundle getMetadata(android.content.Context context) {
            try {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    android.util.Log.w(com.google.firebase.components.ComponentDiscovery.TAG, "Context has no PackageManager.");
                    return null;
                }
                android.content.pm.ServiceInfo serviceInfo = packageManager.getServiceInfo(new android.content.ComponentName(context, this.discoveryService), 128);
                if (serviceInfo == null) {
                    android.util.Log.w(com.google.firebase.components.ComponentDiscovery.TAG, this.discoveryService + " has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                android.util.Log.w(com.google.firebase.components.ComponentDiscovery.TAG, "Application info not found.");
                return null;
            }
        }
    }
}
