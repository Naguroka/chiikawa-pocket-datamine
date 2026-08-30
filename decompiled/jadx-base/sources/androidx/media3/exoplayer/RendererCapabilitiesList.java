package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public interface RendererCapabilitiesList {

    public interface Factory {
        androidx.media3.exoplayer.RendererCapabilitiesList createRendererCapabilitiesList();
    }

    androidx.media3.exoplayer.RendererCapabilities[] getRendererCapabilities();

    void release();

    int size();
}
