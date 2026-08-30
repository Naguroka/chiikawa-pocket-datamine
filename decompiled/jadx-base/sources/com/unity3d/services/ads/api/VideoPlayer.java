package com.unity3d.services.ads.api;

/* JADX INFO: loaded from: classes6.dex */
public class VideoPlayer {
    private static com.unity3d.services.ads.video.VideoPlayerView _videoPlayerView;

    public static void setVideoPlayerView(com.unity3d.services.ads.video.VideoPlayerView videoPlayerView) {
        _videoPlayerView = videoPlayerView;
    }

    public static com.unity3d.services.ads.video.VideoPlayerView getVideoPlayerView() {
        return _videoPlayerView;
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setProgressEventInterval(final java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.VideoPlayer.1
            @Override // java.lang.Runnable
            public void run() {
                if (com.unity3d.services.ads.api.VideoPlayer.getVideoPlayerView() != null) {
                    com.unity3d.services.ads.api.VideoPlayer.getVideoPlayerView().setProgressEventInterval(num.intValue());
                }
            }
        });
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(new java.lang.Object[0]);
        } else {
            webViewCallback.error(com.unity3d.services.ads.video.VideoPlayerError.VIDEOVIEW_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getProgressEventInterval(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(java.lang.Integer.valueOf(getVideoPlayerView().getProgressEventInterval()));
        } else {
            webViewCallback.error(com.unity3d.services.ads.video.VideoPlayerError.VIDEOVIEW_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void prepare(java.lang.String str, java.lang.Double d, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        prepare(str, d, 0, webViewCallback);
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void prepare(final java.lang.String str, final java.lang.Double d, final java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.log.DeviceLog.debug("Preparing video for playback: " + str);
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.VideoPlayer.2
            @Override // java.lang.Runnable
            public void run() {
                if (com.unity3d.services.ads.api.VideoPlayer.getVideoPlayerView() != null) {
                    com.unity3d.services.ads.api.VideoPlayer.getVideoPlayerView().prepare(str, d.floatValue(), num.intValue());
                }
            }
        });
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(str);
        } else {
            webViewCallback.error(com.unity3d.services.ads.video.VideoPlayerError.VIDEOVIEW_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void play(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.log.DeviceLog.debug("Starting playback of prepared video");
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.VideoPlayer.3
            @Override // java.lang.Runnable
            public void run() {
                if (com.unity3d.services.ads.api.VideoPlayer.getVideoPlayerView() != null) {
                    com.unity3d.services.ads.api.VideoPlayer.getVideoPlayerView().play();
                }
            }
        });
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(new java.lang.Object[0]);
        } else {
            webViewCallback.error(com.unity3d.services.ads.video.VideoPlayerError.VIDEOVIEW_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void pause(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.log.DeviceLog.debug("Pausing current video");
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.VideoPlayer.4
            @Override // java.lang.Runnable
            public void run() {
                if (com.unity3d.services.ads.api.VideoPlayer.getVideoPlayerView() != null) {
                    com.unity3d.services.ads.api.VideoPlayer.getVideoPlayerView().pause();
                }
            }
        });
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(new java.lang.Object[0]);
        } else {
            webViewCallback.error(com.unity3d.services.ads.video.VideoPlayerError.VIDEOVIEW_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void stop(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.log.DeviceLog.debug("Stopping current video");
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.VideoPlayer.5
            @Override // java.lang.Runnable
            public void run() {
                if (com.unity3d.services.ads.api.VideoPlayer.getVideoPlayerView() != null) {
                    com.unity3d.services.ads.api.VideoPlayer.getVideoPlayerView().stop();
                }
            }
        });
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(new java.lang.Object[0]);
        } else {
            webViewCallback.error(com.unity3d.services.ads.video.VideoPlayerError.VIDEOVIEW_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void seekTo(final java.lang.Integer num, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.log.DeviceLog.debug("Seeking video to time: " + num);
        com.unity3d.services.core.misc.Utilities.runOnUiThread(new java.lang.Runnable() { // from class: com.unity3d.services.ads.api.VideoPlayer.6
            @Override // java.lang.Runnable
            public void run() {
                if (com.unity3d.services.ads.api.VideoPlayer.getVideoPlayerView() != null) {
                    com.unity3d.services.ads.api.VideoPlayer.getVideoPlayerView().seekTo(num.intValue());
                }
            }
        });
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(new java.lang.Object[0]);
        } else {
            webViewCallback.error(com.unity3d.services.ads.video.VideoPlayerError.VIDEOVIEW_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getCurrentPosition(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(java.lang.Integer.valueOf(getVideoPlayerView().getCurrentPosition()));
        } else {
            webViewCallback.error(com.unity3d.services.ads.video.VideoPlayerError.VIDEOVIEW_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getVolume(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (getVideoPlayerView() != null) {
            webViewCallback.invoke(java.lang.Float.valueOf(getVideoPlayerView().getVolume()));
        } else {
            webViewCallback.error(com.unity3d.services.ads.video.VideoPlayerError.VIDEOVIEW_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setVolume(java.lang.Double d, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.core.log.DeviceLog.debug("Setting video volume: " + d);
        if (getVideoPlayerView() != null) {
            getVideoPlayerView().setVolume(java.lang.Float.valueOf(d.floatValue()));
            webViewCallback.invoke(d);
        } else {
            webViewCallback.error(com.unity3d.services.ads.video.VideoPlayerError.VIDEOVIEW_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void setInfoListenerEnabled(boolean z, com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        if (getVideoPlayerView() != null) {
            getVideoPlayerView().setInfoListenerEnabled(z);
            webViewCallback.invoke(com.unity3d.services.core.webview.WebViewEventCategory.VIDEOPLAYER, com.unity3d.services.ads.video.VideoPlayerEvent.INFO, java.lang.Boolean.valueOf(z));
        } else {
            webViewCallback.error(com.unity3d.services.ads.video.VideoPlayerError.VIDEOVIEW_NULL, new java.lang.Object[0]);
        }
    }

    @com.unity3d.services.core.webview.bridge.WebViewExposed
    public static void getVideoViewRectangle(com.unity3d.services.core.webview.bridge.WebViewCallback webViewCallback) {
        com.unity3d.services.ads.video.VideoPlayerView videoPlayerView = getVideoPlayerView();
        if (videoPlayerView != null) {
            int[] videoViewRectangle = videoPlayerView.getVideoViewRectangle();
            webViewCallback.invoke(java.lang.Integer.valueOf(videoViewRectangle[0]), java.lang.Integer.valueOf(videoViewRectangle[1]), java.lang.Integer.valueOf(videoViewRectangle[2]), java.lang.Integer.valueOf(videoViewRectangle[3]));
        } else {
            webViewCallback.error(com.unity3d.services.ads.video.VideoPlayerError.VIDEOVIEW_NULL, new java.lang.Object[0]);
        }
    }
}
