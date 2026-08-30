package com.google.android.datatransport.runtime.backends;

/* JADX INFO: loaded from: classes4.dex */
@javax.inject.Singleton
class MetadataBackendRegistry implements com.google.android.datatransport.runtime.backends.BackendRegistry {
    private static final java.lang.String BACKEND_KEY_PREFIX = "backend:";
    private static final java.lang.String TAG = "BackendRegistry";
    private final com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.BackendFactoryProvider backendFactoryProvider;
    private final java.util.Map<java.lang.String, com.google.android.datatransport.runtime.backends.TransportBackend> backends;
    private final com.google.android.datatransport.runtime.backends.CreationContextFactory creationContextFactory;

    @javax.inject.Inject
    MetadataBackendRegistry(android.content.Context context, com.google.android.datatransport.runtime.backends.CreationContextFactory creationContextFactory) {
        this(new com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.BackendFactoryProvider(context), creationContextFactory);
    }

    MetadataBackendRegistry(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.BackendFactoryProvider backendFactoryProvider, com.google.android.datatransport.runtime.backends.CreationContextFactory creationContextFactory) {
        this.backends = new java.util.HashMap();
        this.backendFactoryProvider = backendFactoryProvider;
        this.creationContextFactory = creationContextFactory;
    }

    @Override // com.google.android.datatransport.runtime.backends.BackendRegistry
    public synchronized com.google.android.datatransport.runtime.backends.TransportBackend get(java.lang.String str) {
        if (this.backends.containsKey(str)) {
            return this.backends.get(str);
        }
        com.google.android.datatransport.runtime.backends.BackendFactory backendFactory = this.backendFactoryProvider.get(str);
        if (backendFactory == null) {
            return null;
        }
        com.google.android.datatransport.runtime.backends.TransportBackend transportBackendCreate = backendFactory.create(this.creationContextFactory.create(str));
        this.backends.put(str, transportBackendCreate);
        return transportBackendCreate;
    }

    static class BackendFactoryProvider {
        private final android.content.Context applicationContext;
        private java.util.Map<java.lang.String, java.lang.String> backendProviders = null;

        BackendFactoryProvider(android.content.Context context) {
            this.applicationContext = context;
        }

        com.google.android.datatransport.runtime.backends.BackendFactory get(java.lang.String str) {
            java.lang.String str2 = getBackendProviders().get(str);
            if (str2 == null) {
                return null;
            }
            try {
                return (com.google.android.datatransport.runtime.backends.BackendFactory) java.lang.Class.forName(str2).asSubclass(com.google.android.datatransport.runtime.backends.BackendFactory.class).getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            } catch (java.lang.ClassNotFoundException e) {
                android.util.Log.w(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.TAG, java.lang.String.format("Class %s is not found.", str2), e);
                return null;
            } catch (java.lang.IllegalAccessException e2) {
                android.util.Log.w(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.TAG, java.lang.String.format("Could not instantiate %s.", str2), e2);
                return null;
            } catch (java.lang.InstantiationException e3) {
                android.util.Log.w(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.TAG, java.lang.String.format("Could not instantiate %s.", str2), e3);
                return null;
            } catch (java.lang.NoSuchMethodException e4) {
                android.util.Log.w(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.TAG, java.lang.String.format("Could not instantiate %s", str2), e4);
                return null;
            } catch (java.lang.reflect.InvocationTargetException e5) {
                android.util.Log.w(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.TAG, java.lang.String.format("Could not instantiate %s", str2), e5);
                return null;
            }
        }

        private java.util.Map<java.lang.String, java.lang.String> getBackendProviders() {
            if (this.backendProviders == null) {
                this.backendProviders = discover(this.applicationContext);
            }
            return this.backendProviders;
        }

        private java.util.Map<java.lang.String, java.lang.String> discover(android.content.Context context) {
            android.os.Bundle metadata = getMetadata(context);
            if (metadata == null) {
                android.util.Log.w(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.TAG, "Could not retrieve metadata, returning empty list of transport backends.");
                return java.util.Collections.emptyMap();
            }
            java.util.HashMap map = new java.util.HashMap();
            for (java.lang.String str : metadata.keySet()) {
                java.lang.Object obj = metadata.get(str);
                if ((obj instanceof java.lang.String) && str.startsWith(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.BACKEND_KEY_PREFIX)) {
                    for (java.lang.String str2 : ((java.lang.String) obj).split(",", -1)) {
                        java.lang.String strTrim = str2.trim();
                        if (!strTrim.isEmpty()) {
                            map.put(strTrim, str.substring(8));
                        }
                    }
                }
            }
            return map;
        }

        private static android.os.Bundle getMetadata(android.content.Context context) {
            try {
                android.content.pm.PackageManager packageManager = context.getPackageManager();
                if (packageManager == null) {
                    android.util.Log.w(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.TAG, "Context has no PackageManager.");
                    return null;
                }
                android.content.pm.ServiceInfo serviceInfo = packageManager.getServiceInfo(new android.content.ComponentName(context, (java.lang.Class<?>) com.google.android.datatransport.runtime.backends.TransportBackendDiscovery.class), 128);
                if (serviceInfo == null) {
                    android.util.Log.w(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.TAG, "TransportBackendDiscovery has no service info.");
                    return null;
                }
                return serviceInfo.metaData;
            } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
                android.util.Log.w(com.google.android.datatransport.runtime.backends.MetadataBackendRegistry.TAG, "Application info not found.");
                return null;
            }
        }
    }
}
