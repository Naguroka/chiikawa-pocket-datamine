package androidx.media3.effect;

/* JADX INFO: loaded from: classes.dex */
public interface VideoCompositorSettings {
    public static final androidx.media3.effect.VideoCompositorSettings DEFAULT = new androidx.media3.effect.VideoCompositorSettings() { // from class: androidx.media3.effect.VideoCompositorSettings.1
        @Override // androidx.media3.effect.VideoCompositorSettings
        public androidx.media3.common.util.Size getOutputSize(java.util.List<androidx.media3.common.util.Size> list) {
            return list.get(0);
        }

        @Override // androidx.media3.effect.VideoCompositorSettings
        public androidx.media3.effect.OverlaySettings getOverlaySettings(int i, long j) {
            return new androidx.media3.effect.OverlaySettings.Builder().build();
        }
    };

    androidx.media3.common.util.Size getOutputSize(java.util.List<androidx.media3.common.util.Size> list);

    androidx.media3.effect.OverlaySettings getOverlaySettings(int i, long j);
}
