package androidx.media3.exoplayer;

/* JADX INFO: loaded from: classes.dex */
public final class DefaultRendererCapabilitiesList implements androidx.media3.exoplayer.RendererCapabilitiesList {
    private final androidx.media3.exoplayer.Renderer[] renderers;

    public static final class Factory implements androidx.media3.exoplayer.RendererCapabilitiesList.Factory {
        private final androidx.media3.exoplayer.RenderersFactory renderersFactory;

        static /* synthetic */ void lambda$createRendererCapabilitiesList$0(androidx.media3.common.text.CueGroup cueGroup) {
        }

        static /* synthetic */ void lambda$createRendererCapabilitiesList$1(androidx.media3.common.Metadata metadata) {
        }

        public Factory(android.content.Context context) {
            this.renderersFactory = new androidx.media3.exoplayer.DefaultRenderersFactory(context);
        }

        public Factory(androidx.media3.exoplayer.RenderersFactory renderersFactory) {
            this.renderersFactory = renderersFactory;
        }

        @Override // androidx.media3.exoplayer.RendererCapabilitiesList.Factory
        public androidx.media3.exoplayer.DefaultRendererCapabilitiesList createRendererCapabilitiesList() {
            return new androidx.media3.exoplayer.DefaultRendererCapabilitiesList(this.renderersFactory.createRenderers(androidx.media3.common.util.Util.createHandlerForCurrentOrMainLooper(), new androidx.media3.exoplayer.video.VideoRendererEventListener() { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.1
            }, new androidx.media3.exoplayer.audio.AudioRendererEventListener() { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.2
            }, new androidx.media3.exoplayer.text.TextOutput() { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList$Factory$$ExternalSyntheticLambda0
                @Override // androidx.media3.exoplayer.text.TextOutput
                public final void onCues(androidx.media3.common.text.CueGroup cueGroup) {
                    androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.lambda$createRendererCapabilitiesList$0(cueGroup);
                }
            }, new androidx.media3.exoplayer.metadata.MetadataOutput() { // from class: androidx.media3.exoplayer.DefaultRendererCapabilitiesList$Factory$$ExternalSyntheticLambda1
                @Override // androidx.media3.exoplayer.metadata.MetadataOutput
                public final void onMetadata(androidx.media3.common.Metadata metadata) {
                    androidx.media3.exoplayer.DefaultRendererCapabilitiesList.Factory.lambda$createRendererCapabilitiesList$1(metadata);
                }
            }));
        }
    }

    private DefaultRendererCapabilitiesList(androidx.media3.exoplayer.Renderer[] rendererArr) {
        this.renderers = (androidx.media3.exoplayer.Renderer[]) java.util.Arrays.copyOf(rendererArr, rendererArr.length);
        for (int i = 0; i < rendererArr.length; i++) {
            this.renderers[i].init(i, androidx.media3.exoplayer.analytics.PlayerId.UNSET, androidx.media3.common.util.SystemClock.DEFAULT);
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public androidx.media3.exoplayer.RendererCapabilities[] getRendererCapabilities() {
        androidx.media3.exoplayer.RendererCapabilities[] rendererCapabilitiesArr = new androidx.media3.exoplayer.RendererCapabilities[this.renderers.length];
        int i = 0;
        while (true) {
            androidx.media3.exoplayer.Renderer[] rendererArr = this.renderers;
            if (i >= rendererArr.length) {
                return rendererCapabilitiesArr;
            }
            rendererCapabilitiesArr[i] = rendererArr[i].getCapabilities();
            i++;
        }
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public int size() {
        return this.renderers.length;
    }

    @Override // androidx.media3.exoplayer.RendererCapabilitiesList
    public void release() {
        for (androidx.media3.exoplayer.Renderer renderer : this.renderers) {
            renderer.release();
        }
    }
}
