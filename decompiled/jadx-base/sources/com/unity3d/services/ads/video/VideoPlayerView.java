package com.unity3d.services.ads.video;

/* JADX INFO: loaded from: classes6.dex */
public class VideoPlayerView extends android.widget.VideoView {
    private android.media.AudioManager _audioManager;
    private final com.unity3d.services.core.webview.bridge.IEventSender _eventSender;
    private boolean _infoListenerEnabled;
    private android.media.MediaPlayer _mediaPlayer;
    private java.util.Timer _prepareTimer;
    private int _progressEventInterval;
    private java.util.Timer _videoTimer;
    private java.lang.String _videoUrl;
    private java.lang.Float _volume;

    public VideoPlayerView(android.content.Context context) {
        this(context, com.unity3d.services.core.webview.bridge.SharedInstances.INSTANCE.getWebViewEventSender());
    }

    public VideoPlayerView(android.content.Context context, com.unity3d.services.core.webview.bridge.IEventSender iEventSender) {
        super(context);
        this._progressEventInterval = 500;
        this._mediaPlayer = null;
        this._volume = null;
        this._infoListenerEnabled = true;
        this._audioManager = null;
        this._eventSender = iEventSender;
    }

    private void startVideoProgressTimer() {
        java.util.Timer timer = new java.util.Timer();
        this._videoTimer = timer;
        java.util.TimerTask timerTask = new java.util.TimerTask() { // from class: com.unity3d.services.ads.video.VideoPlayerView.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                boolean zIsPlaying;
                try {
                    zIsPlaying = com.unity3d.services.ads.video.VideoPlayerView.this.isPlaying();
                    try {
                        com.unity3d.services.ads.video.VideoPlayerView.this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.VIDEOPLAYER, com.unity3d.services.ads.video.VideoPlayerEvent.PROGRESS, java.lang.Integer.valueOf(com.unity3d.services.ads.video.VideoPlayerView.this.getCurrentPosition()));
                    } catch (java.lang.IllegalStateException e) {
                        e = e;
                        com.unity3d.services.core.log.DeviceLog.exception("Exception while sending current position to webapp", e);
                        com.unity3d.services.ads.video.VideoPlayerView.this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.VIDEOPLAYER, com.unity3d.services.ads.video.VideoPlayerEvent.ILLEGAL_STATE, com.unity3d.services.ads.video.VideoPlayerEvent.PROGRESS, com.unity3d.services.ads.video.VideoPlayerView.this._videoUrl, java.lang.Boolean.valueOf(zIsPlaying));
                    }
                } catch (java.lang.IllegalStateException e2) {
                    e = e2;
                    zIsPlaying = false;
                }
            }
        };
        int i = this._progressEventInterval;
        timer.scheduleAtFixedRate(timerTask, i, i);
    }

    public void stopVideoProgressTimer() {
        java.util.Timer timer = this._videoTimer;
        if (timer != null) {
            timer.cancel();
            this._videoTimer.purge();
            this._videoTimer = null;
        }
    }

    private void startPrepareTimer(long j) {
        java.util.Timer timer = new java.util.Timer();
        this._prepareTimer = timer;
        timer.schedule(new java.util.TimerTask() { // from class: com.unity3d.services.ads.video.VideoPlayerView.2
            @Override // java.util.TimerTask, java.lang.Runnable
            public void run() {
                boolean zIsPlaying;
                try {
                    zIsPlaying = com.unity3d.services.ads.video.VideoPlayerView.this.isPlaying();
                    if (zIsPlaying) {
                        return;
                    }
                    try {
                        com.unity3d.services.ads.video.VideoPlayerView.this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.VIDEOPLAYER, com.unity3d.services.ads.video.VideoPlayerEvent.PREPARE_TIMEOUT, com.unity3d.services.ads.video.VideoPlayerView.this._videoUrl);
                        com.unity3d.services.core.log.DeviceLog.error("Video player prepare timeout: " + com.unity3d.services.ads.video.VideoPlayerView.this._videoUrl);
                    } catch (java.lang.IllegalStateException e) {
                        e = e;
                        com.unity3d.services.core.log.DeviceLog.exception("Exception while preparing timer", e);
                        com.unity3d.services.ads.video.VideoPlayerView.this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.VIDEOPLAYER, com.unity3d.services.ads.video.VideoPlayerEvent.ILLEGAL_STATE, com.unity3d.services.ads.video.VideoPlayerEvent.PREPARE_TIMEOUT, com.unity3d.services.ads.video.VideoPlayerView.this._videoUrl, java.lang.Boolean.valueOf(zIsPlaying));
                    }
                } catch (java.lang.IllegalStateException e2) {
                    e = e2;
                    zIsPlaying = false;
                }
            }
        }, j);
    }

    public void stopPrepareTimer() {
        java.util.Timer timer = this._prepareTimer;
        if (timer != null) {
            timer.cancel();
            this._prepareTimer.purge();
            this._prepareTimer = null;
        }
    }

    public boolean prepare(java.lang.String str, final float f, int i) {
        com.unity3d.services.core.log.DeviceLog.entered();
        this._videoUrl = str;
        setOnPreparedListener(new android.media.MediaPlayer.OnPreparedListener() { // from class: com.unity3d.services.ads.video.VideoPlayerView.3
            @Override // android.media.MediaPlayer.OnPreparedListener
            public void onPrepared(android.media.MediaPlayer mediaPlayer) {
                com.unity3d.services.ads.video.VideoPlayerView.this.stopPrepareTimer();
                if (mediaPlayer != null) {
                    com.unity3d.services.ads.video.VideoPlayerView.this._mediaPlayer = mediaPlayer;
                }
                com.unity3d.services.ads.video.VideoPlayerView.this.setVolume(java.lang.Float.valueOf(f));
                com.unity3d.services.ads.video.VideoPlayerView.this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.VIDEOPLAYER, com.unity3d.services.ads.video.VideoPlayerEvent.PREPARED, com.unity3d.services.ads.video.VideoPlayerView.this._videoUrl, java.lang.Integer.valueOf(mediaPlayer.getDuration()), java.lang.Integer.valueOf(mediaPlayer.getVideoWidth()), java.lang.Integer.valueOf(mediaPlayer.getVideoHeight()));
            }
        });
        setOnErrorListener(new android.media.MediaPlayer.OnErrorListener() { // from class: com.unity3d.services.ads.video.VideoPlayerView.4
            @Override // android.media.MediaPlayer.OnErrorListener
            public boolean onError(android.media.MediaPlayer mediaPlayer, int i2, int i3) {
                com.unity3d.services.ads.video.VideoPlayerView.this.stopPrepareTimer();
                if (mediaPlayer != null) {
                    com.unity3d.services.ads.video.VideoPlayerView.this._mediaPlayer = mediaPlayer;
                }
                com.unity3d.services.ads.video.VideoPlayerView.this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.VIDEOPLAYER, com.unity3d.services.ads.video.VideoPlayerEvent.GENERIC_ERROR, com.unity3d.services.ads.video.VideoPlayerView.this._videoUrl, java.lang.Integer.valueOf(i2), java.lang.Integer.valueOf(i3));
                com.unity3d.services.ads.video.VideoPlayerView.this.stopVideoProgressTimer();
                return true;
            }
        });
        setInfoListenerEnabled(this._infoListenerEnabled);
        if (i > 0) {
            startPrepareTimer(i);
        }
        try {
            if (android.os.Build.VERSION.SDK_INT < 26) {
                android.media.AudioManager audioManager = (android.media.AudioManager) getContext().getSystemService("audio");
                this._audioManager = audioManager;
                if (audioManager != null) {
                    audioManager.requestAudioFocus(null, 3, 2);
                }
            } else {
                setAudioFocusRequest(2);
            }
            setVideoPath(this._videoUrl);
            return true;
        } catch (java.lang.Exception e) {
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.VIDEOPLAYER, com.unity3d.services.ads.video.VideoPlayerEvent.PREPARE_ERROR, this._videoUrl);
            com.unity3d.services.core.log.DeviceLog.exception("Error preparing video: " + this._videoUrl, e);
            return false;
        }
    }

    public void play() {
        com.unity3d.services.core.log.DeviceLog.entered();
        setOnCompletionListener(new android.media.MediaPlayer.OnCompletionListener() { // from class: com.unity3d.services.ads.video.VideoPlayerView.5
            @Override // android.media.MediaPlayer.OnCompletionListener
            public void onCompletion(android.media.MediaPlayer mediaPlayer) {
                if (mediaPlayer != null) {
                    com.unity3d.services.ads.video.VideoPlayerView.this._mediaPlayer = mediaPlayer;
                }
                com.unity3d.services.ads.video.VideoPlayerView.this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.VIDEOPLAYER, com.unity3d.services.ads.video.VideoPlayerEvent.COMPLETED, com.unity3d.services.ads.video.VideoPlayerView.this._videoUrl);
                com.unity3d.services.ads.video.VideoPlayerView.this.stopVideoProgressTimer();
            }
        });
        try {
            start();
            stopVideoProgressTimer();
            startVideoProgressTimer();
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.VIDEOPLAYER, com.unity3d.services.ads.video.VideoPlayerEvent.PLAY, this._videoUrl);
        } catch (java.lang.IllegalStateException unused) {
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.VIDEOPLAYER, com.unity3d.services.ads.video.VideoPlayerEvent.ILLEGAL_STATE, this._videoUrl, false);
        }
    }

    public void setInfoListenerEnabled(boolean z) {
        this._infoListenerEnabled = z;
        if (this._infoListenerEnabled) {
            setOnInfoListener(new android.media.MediaPlayer.OnInfoListener() { // from class: com.unity3d.services.ads.video.VideoPlayerView.6
                @Override // android.media.MediaPlayer.OnInfoListener
                public boolean onInfo(android.media.MediaPlayer mediaPlayer, int i, int i2) {
                    com.unity3d.services.ads.video.VideoPlayerView.this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.VIDEOPLAYER, com.unity3d.services.ads.video.VideoPlayerEvent.INFO, com.unity3d.services.ads.video.VideoPlayerView.this._videoUrl, java.lang.Integer.valueOf(i), java.lang.Integer.valueOf(i2));
                    return true;
                }
            });
        } else {
            setOnInfoListener(null);
        }
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public void pause() {
        try {
            super.pause();
            if (android.os.Build.VERSION.SDK_INT < 26) {
                android.media.AudioManager audioManager = this._audioManager;
                if (audioManager != null) {
                    audioManager.abandonAudioFocus(null);
                }
            } else {
                setAudioFocusRequest(0);
            }
            stopVideoProgressTimer();
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.VIDEOPLAYER, com.unity3d.services.ads.video.VideoPlayerEvent.PAUSE, this._videoUrl);
        } catch (java.lang.Exception e) {
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.VIDEOPLAYER, com.unity3d.services.ads.video.VideoPlayerEvent.PAUSE_ERROR, this._videoUrl);
            com.unity3d.services.core.log.DeviceLog.exception("Error pausing video", e);
        }
    }

    @Override // android.widget.VideoView, android.widget.MediaController.MediaPlayerControl
    public void seekTo(int i) {
        try {
            super.seekTo(i);
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.VIDEOPLAYER, com.unity3d.services.ads.video.VideoPlayerEvent.SEEKTO, this._videoUrl);
        } catch (java.lang.Exception e) {
            this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.VIDEOPLAYER, com.unity3d.services.ads.video.VideoPlayerEvent.SEEKTO_ERROR, this._videoUrl);
            com.unity3d.services.core.log.DeviceLog.exception("Error seeking video", e);
        }
    }

    public void stop() {
        stopPlayback();
        stopVideoProgressTimer();
        if (android.os.Build.VERSION.SDK_INT < 26) {
            android.media.AudioManager audioManager = this._audioManager;
            if (audioManager != null) {
                audioManager.abandonAudioFocus(null);
            }
        } else {
            setAudioFocusRequest(0);
        }
        this._eventSender.sendEvent(com.unity3d.services.core.webview.WebViewEventCategory.VIDEOPLAYER, com.unity3d.services.ads.video.VideoPlayerEvent.STOP, this._videoUrl);
    }

    public float getVolume() {
        return this._volume.floatValue();
    }

    public void setVolume(java.lang.Float f) {
        try {
            this._mediaPlayer.setVolume(f.floatValue(), f.floatValue());
            this._volume = f;
        } catch (java.lang.Exception e) {
            com.unity3d.services.core.log.DeviceLog.exception("MediaPlayer generic error", e);
        }
    }

    public void setProgressEventInterval(int i) {
        this._progressEventInterval = i;
        if (this._videoTimer != null) {
            stopVideoProgressTimer();
            startVideoProgressTimer();
        }
    }

    public int getProgressEventInterval() {
        return this._progressEventInterval;
    }

    public int[] getVideoViewRectangle() {
        int[] iArr = new int[2];
        getLocationInWindow(iArr);
        return new int[]{iArr[0], iArr[1], getMeasuredWidth(), getMeasuredHeight()};
    }
}
