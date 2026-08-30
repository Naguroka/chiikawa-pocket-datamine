package androidx.media3.exoplayer.source.ads;

/* JADX INFO: loaded from: classes.dex */
public interface AdsLoader {

    public interface EventListener {
        default void onAdClicked() {
        }

        default void onAdLoadError(androidx.media3.exoplayer.source.ads.AdsMediaSource.AdLoadException adLoadException, androidx.media3.datasource.DataSpec dataSpec) {
        }

        default void onAdPlaybackState(androidx.media3.common.AdPlaybackState adPlaybackState) {
        }

        default void onAdTapped() {
        }
    }

    public interface Provider {
        androidx.media3.exoplayer.source.ads.AdsLoader getAdsLoader(androidx.media3.common.MediaItem.AdsConfiguration adsConfiguration);
    }

    void handlePrepareComplete(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, int i, int i2);

    void handlePrepareError(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, int i, int i2, java.io.IOException iOException);

    void release();

    void setPlayer(androidx.media3.common.Player player);

    void setSupportedContentTypes(int... iArr);

    void start(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, androidx.media3.datasource.DataSpec dataSpec, java.lang.Object obj, androidx.media3.common.AdViewProvider adViewProvider, androidx.media3.exoplayer.source.ads.AdsLoader.EventListener eventListener);

    void stop(androidx.media3.exoplayer.source.ads.AdsMediaSource adsMediaSource, androidx.media3.exoplayer.source.ads.AdsLoader.EventListener eventListener);
}
