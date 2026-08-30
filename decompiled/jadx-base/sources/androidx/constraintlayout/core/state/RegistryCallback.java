package androidx.constraintlayout.core.state;

/* JADX INFO: loaded from: classes.dex */
public interface RegistryCallback {
    java.lang.String currentLayoutInformation();

    java.lang.String currentMotionScene();

    long getLastModified();

    void onDimensions(int i, int i2);

    void onNewMotionScene(java.lang.String str);

    void onProgress(float f);

    void setDrawDebug(int i);

    void setLayoutInformationMode(int i);
}
