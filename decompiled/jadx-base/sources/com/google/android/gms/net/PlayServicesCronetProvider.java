package com.google.android.gms.net;

/* JADX INFO: compiled from: com.google.android.gms:play-services-cronet@@17.0.1 */
/* JADX INFO: loaded from: classes5.dex */
public class PlayServicesCronetProvider extends org.chromium.net.CronetProvider {
    private static final java.lang.String NATIVE_CRONET_ENGINE_BUILDER_IMPL = "org.chromium.net.impl.NativeCronetEngineBuilderImpl";
    private static final java.lang.String TAG = "PlayServicesCronet";

    public PlayServicesCronetProvider(android.content.Context context) {
        super(context);
    }

    private void tryToInstallCronetProvider() {
        try {
            com.google.android.gms.net.CronetProviderInstaller.zzc(this.mContext);
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException unused) {
            if (android.util.Log.isLoggable(TAG, 4)) {
                android.util.Log.i(TAG, "Google-Play-Services-Cronet-Provider is unavailable.");
            }
        } catch (com.google.android.gms.common.GooglePlayServicesRepairableException unused2) {
            if (android.util.Log.isLoggable(TAG, 4)) {
                android.util.Log.i(TAG, "Google-Play-Services-Cronet-Provider is not installed yet.");
            }
        }
    }

    @Override // org.chromium.net.CronetProvider
    public org.chromium.net.CronetEngine.Builder createBuilder() {
        org.chromium.net.ExperimentalCronetEngine.Builder builder;
        try {
            com.google.android.gms.net.CronetProviderInstaller.zzc(this.mContext);
            java.lang.Throwable th = null;
            try {
                builder = new org.chromium.net.ExperimentalCronetEngine.Builder((org.chromium.net.ICronetEngineBuilder) ((java.lang.ClassLoader) com.google.android.gms.common.internal.Preconditions.checkNotNull(((com.google.android.gms.dynamite.DynamiteModule) com.google.android.gms.common.internal.Preconditions.checkNotNull(com.google.android.gms.net.CronetProviderInstaller.zza())).getModuleContext().getClassLoader())).loadClass(NATIVE_CRONET_ENGINE_BUILDER_IMPL).asSubclass(org.chromium.net.ICronetEngineBuilder.class).getConstructor(android.content.Context.class).newInstance(this.mContext));
            } catch (java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException | java.lang.NoSuchMethodException | java.lang.reflect.InvocationTargetException e) {
                builder = null;
                th = e;
            }
            if (th != null) {
                throw new java.lang.RuntimeException("Unable to construct the implementation of the Cronet Engine Builder: org.chromium.net.impl.NativeCronetEngineBuilderImpl", th);
            }
            com.google.android.gms.common.internal.Preconditions.checkNotNull(builder, "The value of the constructed builder should never be null");
            return builder;
        } catch (com.google.android.gms.common.GooglePlayServicesNotAvailableException e2) {
            throw new java.lang.IllegalStateException("Google Play Services Cronet provider is unavailable on this device.", e2);
        } catch (com.google.android.gms.common.GooglePlayServicesRepairableException e3) {
            throw new java.lang.IllegalStateException("Google Play Services Cronet provider is not enabled. Call com.google.android.gms.net.CronetProviderInstaller.installIfNeeded(Context) to enable it.", e3);
        }
    }

    public boolean equals(@javax.annotation.Nullable java.lang.Object obj) {
        if (obj != this) {
            return (obj instanceof com.google.android.gms.net.PlayServicesCronetProvider) && this.mContext.equals(((com.google.android.gms.net.PlayServicesCronetProvider) obj).mContext);
        }
        return true;
    }

    @Override // org.chromium.net.CronetProvider
    public java.lang.String getName() {
        return "Google-Play-Services-Cronet-Provider";
    }

    @Override // org.chromium.net.CronetProvider
    public java.lang.String getVersion() {
        tryToInstallCronetProvider();
        return com.google.android.gms.net.CronetProviderInstaller.zzb();
    }

    public int hashCode() {
        return java.util.Arrays.hashCode(new java.lang.Object[]{com.google.android.gms.net.PlayServicesCronetProvider.class, this.mContext});
    }

    @Override // org.chromium.net.CronetProvider
    public boolean isEnabled() {
        tryToInstallCronetProvider();
        return com.google.android.gms.net.CronetProviderInstaller.isInstalled();
    }
}
