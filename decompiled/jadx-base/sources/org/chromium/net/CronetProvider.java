package org.chromium.net;

/* JADX INFO: loaded from: classes6.dex */
public abstract class CronetProvider {
    private static final java.lang.String GMS_CORE_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.GmsCoreCronetProvider";
    private static final java.lang.String JAVA_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.JavaCronetProvider";
    private static final java.lang.String NATIVE_CRONET_PROVIDER_CLASS = "org.chromium.net.impl.NativeCronetProvider";
    private static final java.lang.String PLAY_SERVICES_CRONET_PROVIDER_CLASS = "com.google.android.gms.net.PlayServicesCronetProvider";
    public static final java.lang.String PROVIDER_NAME_APP_PACKAGED = "App-Packaged-Cronet-Provider";
    public static final java.lang.String PROVIDER_NAME_FALLBACK = "Fallback-Cronet-Provider";
    private static final java.lang.String RES_KEY_CRONET_IMPL_CLASS = "CronetProviderClassName";
    private static final java.lang.String TAG = "CronetProvider";
    protected final android.content.Context mContext;

    public abstract org.chromium.net.CronetEngine.Builder createBuilder();

    public abstract java.lang.String getName();

    public abstract java.lang.String getVersion();

    public abstract boolean isEnabled();

    protected CronetProvider(android.content.Context context) {
        if (context == null) {
            throw new java.lang.IllegalArgumentException("Context must not be null");
        }
        this.mContext = context;
    }

    public java.lang.String toString() {
        return "[class=" + getClass().getName() + ", name=" + getName() + ", version=" + getVersion() + ", enabled=" + isEnabled() + com.ironsource.y8.i.e;
    }

    public static java.util.List<org.chromium.net.CronetProvider> getAllProviders(android.content.Context context) {
        java.util.LinkedHashSet linkedHashSet = new java.util.LinkedHashSet();
        addCronetProviderFromResourceFile(context, linkedHashSet);
        addCronetProviderImplByClassName(context, PLAY_SERVICES_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, GMS_CORE_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, NATIVE_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        addCronetProviderImplByClassName(context, JAVA_CRONET_PROVIDER_CLASS, linkedHashSet, false);
        return java.util.Collections.unmodifiableList(new java.util.ArrayList(linkedHashSet));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean addCronetProviderImplByClassName(android.content.Context context, java.lang.String str, java.util.Set<org.chromium.net.CronetProvider> set, boolean z) {
        try {
            set.add(context.getClassLoader().loadClass(str).asSubclass(org.chromium.net.CronetProvider.class).getConstructor(android.content.Context.class).newInstance(context));
            return true;
        } catch (java.lang.ClassNotFoundException e) {
            logReflectiveOperationException(str, z, e);
            return false;
        } catch (java.lang.IllegalAccessException e2) {
            logReflectiveOperationException(str, z, e2);
            return false;
        } catch (java.lang.InstantiationException e3) {
            logReflectiveOperationException(str, z, e3);
            return false;
        } catch (java.lang.NoSuchMethodException e4) {
            logReflectiveOperationException(str, z, e4);
            return false;
        } catch (java.lang.reflect.InvocationTargetException e5) {
            logReflectiveOperationException(str, z, e5);
            return false;
        }
    }

    private static void logReflectiveOperationException(java.lang.String str, boolean z, java.lang.Exception exc) {
        if (z) {
            android.util.Log.e(TAG, "Unable to load provider class: " + str, exc);
            return;
        }
        java.lang.String str2 = TAG;
        if (android.util.Log.isLoggable(str2, 3)) {
            android.util.Log.d(str2, "Tried to load " + str + " provider class but it wasn't included in the app classpath");
        }
    }

    private static boolean addCronetProviderFromResourceFile(android.content.Context context, java.util.Set<org.chromium.net.CronetProvider> set) {
        int identifier = context.getResources().getIdentifier(RES_KEY_CRONET_IMPL_CLASS, androidx.constraintlayout.core.motion.utils.TypedValues.Custom.S_STRING, context.getPackageName());
        boolean z = false;
        if (identifier == 0) {
            return false;
        }
        java.lang.String string = context.getResources().getString(identifier);
        if (string != null && !string.equals(PLAY_SERVICES_CRONET_PROVIDER_CLASS) && !string.equals(GMS_CORE_CRONET_PROVIDER_CLASS) && !string.equals(JAVA_CRONET_PROVIDER_CLASS) && !string.equals(NATIVE_CRONET_PROVIDER_CLASS)) {
            z = true;
            if (!addCronetProviderImplByClassName(context, string, set, true)) {
                android.util.Log.e(TAG, "Unable to instantiate Cronet implementation class " + string + " that is listed as in the app string resource file under CronetProviderClassName key");
            }
        }
        return z;
    }
}
