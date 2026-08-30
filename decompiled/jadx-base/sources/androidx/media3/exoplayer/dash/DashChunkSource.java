package androidx.media3.exoplayer.dash;

/* JADX INFO: loaded from: classes.dex */
public interface DashChunkSource extends androidx.media3.exoplayer.source.chunk.ChunkSource {

    public interface Factory {
        androidx.media3.exoplayer.dash.DashChunkSource createDashChunkSource(androidx.media3.exoplayer.upstream.LoaderErrorThrower loaderErrorThrower, androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest, androidx.media3.exoplayer.dash.BaseUrlExclusionList baseUrlExclusionList, int i, int[] iArr, androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection, int i2, long j, boolean z, java.util.List<androidx.media3.common.Format> list, androidx.media3.exoplayer.dash.PlayerEmsgHandler.PlayerTrackEmsgHandler playerTrackEmsgHandler, androidx.media3.datasource.TransferListener transferListener, androidx.media3.exoplayer.analytics.PlayerId playerId, androidx.media3.exoplayer.upstream.CmcdConfiguration cmcdConfiguration);

        default androidx.media3.exoplayer.dash.DashChunkSource.Factory experimentalParseSubtitlesDuringExtraction(boolean z) {
            return this;
        }

        default androidx.media3.common.Format getOutputTextFormat(androidx.media3.common.Format format) {
            return format;
        }

        default androidx.media3.exoplayer.dash.DashChunkSource.Factory setSubtitleParserFactory(androidx.media3.extractor.text.SubtitleParser.Factory factory) {
            return this;
        }
    }

    void updateManifest(androidx.media3.exoplayer.dash.manifest.DashManifest dashManifest, int i);

    void updateTrackSelection(androidx.media3.exoplayer.trackselection.ExoTrackSelection exoTrackSelection);
}
