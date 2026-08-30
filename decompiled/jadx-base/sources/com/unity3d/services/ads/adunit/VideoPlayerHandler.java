package com.unity3d.services.ads.adunit;

/* JADX INFO: loaded from: classes6.dex */
public class VideoPlayerHandler implements com.unity3d.services.ads.adunit.IAdUnitViewHandler {
    private android.widget.RelativeLayout _videoContainer;
    private com.unity3d.services.ads.video.VideoPlayerView _videoView;

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onDestroy(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onResume(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onStart(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onStop(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity) {
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public boolean create(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity) {
        com.unity3d.services.core.log.DeviceLog.entered();
        if (this._videoContainer == null) {
            this._videoContainer = new android.widget.RelativeLayout(iAdUnitActivity.getContext());
        }
        if (this._videoView != null) {
            return true;
        }
        this._videoView = new com.unity3d.services.ads.video.VideoPlayerView(iAdUnitActivity.getContext());
        android.widget.RelativeLayout.LayoutParams layoutParams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(13);
        this._videoView.setLayoutParams(layoutParams);
        this._videoContainer.addView(this._videoView);
        com.unity3d.services.ads.api.VideoPlayer.setVideoPlayerView(this._videoView);
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public boolean destroy() {
        com.unity3d.services.core.log.DeviceLog.entered();
        com.unity3d.services.ads.video.VideoPlayerView videoPlayerView = this._videoView;
        if (videoPlayerView != null) {
            videoPlayerView.stopVideoProgressTimer();
            this._videoView.stopPlayback();
            com.unity3d.services.core.misc.ViewUtilities.removeViewFromParent(this._videoView);
            if (this._videoView.equals(com.unity3d.services.ads.api.VideoPlayer.getVideoPlayerView())) {
                com.unity3d.services.ads.api.VideoPlayer.setVideoPlayerView(null);
            }
            this._videoView = null;
        }
        android.widget.RelativeLayout relativeLayout = this._videoContainer;
        if (relativeLayout == null) {
            return true;
        }
        com.unity3d.services.core.misc.ViewUtilities.removeViewFromParent(relativeLayout);
        this._videoContainer = null;
        return true;
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public android.view.View getView() {
        return this._videoContainer;
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onCreate(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity, android.os.Bundle bundle) {
        create(iAdUnitActivity);
    }

    @Override // com.unity3d.services.ads.adunit.IAdUnitViewHandler
    public void onPause(com.unity3d.services.ads.adunit.IAdUnitActivity iAdUnitActivity) {
        destroy();
    }
}
