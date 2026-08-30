package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public interface RenderersFactory {
    androidx.media3.exoplayer.Renderer[] createRenderers(android.os.Handler handler, androidx.media3.exoplayer.video.VideoRendererEventListener videoRendererEventListener, androidx.media3.exoplayer.audio.AudioRendererEventListener audioRendererEventListener, androidx.media3.exoplayer.text.TextOutput textOutput, androidx.media3.exoplayer.metadata.MetadataOutput metadataOutput);
}
