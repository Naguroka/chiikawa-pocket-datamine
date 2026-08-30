package androidx.constraintlayout.core.state;

/* JADX INFO: loaded from: classes.dex */
public class Registry {
    private static final androidx.constraintlayout.core.state.Registry sRegistry = new androidx.constraintlayout.core.state.Registry();
    private java.util.HashMap<java.lang.String, androidx.constraintlayout.core.state.RegistryCallback> mCallbacks = new java.util.HashMap<>();

    public static androidx.constraintlayout.core.state.Registry getInstance() {
        return sRegistry;
    }

    public void register(java.lang.String str, androidx.constraintlayout.core.state.RegistryCallback registryCallback) {
        this.mCallbacks.put(str, registryCallback);
    }

    public void unregister(java.lang.String str, androidx.constraintlayout.core.state.RegistryCallback registryCallback) {
        this.mCallbacks.remove(str);
    }

    public void updateContent(java.lang.String str, java.lang.String str2) {
        androidx.constraintlayout.core.state.RegistryCallback registryCallback = this.mCallbacks.get(str);
        if (registryCallback != null) {
            registryCallback.onNewMotionScene(str2);
        }
    }

    public void updateProgress(java.lang.String str, float f) {
        androidx.constraintlayout.core.state.RegistryCallback registryCallback = this.mCallbacks.get(str);
        if (registryCallback != null) {
            registryCallback.onProgress(f);
        }
    }

    public java.lang.String currentContent(java.lang.String str) {
        androidx.constraintlayout.core.state.RegistryCallback registryCallback = this.mCallbacks.get(str);
        if (registryCallback != null) {
            return registryCallback.currentMotionScene();
        }
        return null;
    }

    public java.lang.String currentLayoutInformation(java.lang.String str) {
        androidx.constraintlayout.core.state.RegistryCallback registryCallback = this.mCallbacks.get(str);
        if (registryCallback != null) {
            return registryCallback.currentLayoutInformation();
        }
        return null;
    }

    public void setDrawDebug(java.lang.String str, int i) {
        androidx.constraintlayout.core.state.RegistryCallback registryCallback = this.mCallbacks.get(str);
        if (registryCallback != null) {
            registryCallback.setDrawDebug(i);
        }
    }

    public void setLayoutInformationMode(java.lang.String str, int i) {
        androidx.constraintlayout.core.state.RegistryCallback registryCallback = this.mCallbacks.get(str);
        if (registryCallback != null) {
            registryCallback.setLayoutInformationMode(i);
        }
    }

    public java.util.Set<java.lang.String> getLayoutList() {
        return this.mCallbacks.keySet();
    }

    public long getLastModified(java.lang.String str) {
        androidx.constraintlayout.core.state.RegistryCallback registryCallback = this.mCallbacks.get(str);
        if (registryCallback != null) {
            return registryCallback.getLastModified();
        }
        return Long.MAX_VALUE;
    }

    public void updateDimensions(java.lang.String str, int i, int i2) {
        androidx.constraintlayout.core.state.RegistryCallback registryCallback = this.mCallbacks.get(str);
        if (registryCallback != null) {
            registryCallback.onDimensions(i, i2);
        }
    }
}
