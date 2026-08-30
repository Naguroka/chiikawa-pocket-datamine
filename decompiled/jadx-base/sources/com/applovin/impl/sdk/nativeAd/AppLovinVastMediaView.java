package com.applovin.impl.sdk.nativeAd;

/* JADX INFO: loaded from: classes3.dex */
public class AppLovinVastMediaView extends com.applovin.impl.sdk.nativeAd.AppLovinMediaView implements com.applovin.communicator.AppLovinCommunicatorSubscriber {
    private static final java.lang.String COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING = "PROGRESS_TRACKING";
    private static final long FADE_ANIMATION_DURATION_MILLIS = 250;
    private static final java.lang.String TAG = "AppLovinVastMediaView";
    private final java.util.concurrent.atomic.AtomicBoolean automaticPauseHandled;
    private final java.util.concurrent.atomic.AtomicBoolean automaticResumeHandled;
    private final android.os.Handler countdownHandler;
    private final com.applovin.impl.u4 countdownManager;
    private android.widget.ImageView industryIconImageView;
    private final java.util.concurrent.atomic.AtomicBoolean initialOnAttachedToWindowHandled;
    private boolean isVideoMuted;
    private boolean isVideoPausedByUser;
    private final boolean isVideoStream;
    private long lastVideoPositionFromPauseMillis;
    private final com.applovin.impl.p lifecycleCallbacksAdapter;
    private final java.util.concurrent.atomic.AtomicBoolean mediaErrorHandled;
    private final com.applovin.impl.ck mediaPlayer;
    private android.widget.ImageView muteButtonImageView;
    private android.widget.ImageView playPauseButtonImageView;
    private android.widget.FrameLayout replayIconContainer;
    private int savedVideoPercentViewed;
    private long startTimeMillis;
    private final com.applovin.impl.aq vastAd;
    private long videoDurationMillis;
    private final java.util.concurrent.atomic.AtomicBoolean videoEndListenerNotified;
    private final java.util.Set<com.applovin.impl.kq> videoProgressTrackers;
    private final com.applovin.exoplayer2.ui.e videoView;
    private boolean videoWasCompleted;
    private android.widget.LinearLayout videoWidgetLinearLayout;
    private android.app.Activity viewActivity;

    class a extends com.applovin.impl.p {
        a() {
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(android.app.Activity activity) {
            if (activity.equals(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.viewActivity)) {
                com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.maybeHandlePause();
            }
        }

        @Override // com.applovin.impl.p, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(android.app.Activity activity) {
            if (!activity.equals(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.viewActivity) || com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.isVideoPausedByUser) {
                return;
            }
            com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.maybeHandleResume();
        }
    }

    class b implements com.applovin.impl.u4.b {
        b() {
        }

        @Override // com.applovin.impl.u4.b
        public void a() {
            long seconds = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.videoDurationMillis - (com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.mediaPlayer.getDuration() - com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.mediaPlayer.getCurrentPosition()));
            int videoPercentViewed = com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.getVideoPercentViewed();
            java.util.HashSet hashSet = new java.util.HashSet();
            for (com.applovin.impl.kq kqVar : new java.util.HashSet(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.videoProgressTrackers)) {
                if (kqVar.a(seconds, videoPercentViewed)) {
                    hashSet.add(kqVar);
                    com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.videoProgressTrackers.remove(kqVar);
                }
            }
            com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.maybeFireTrackers(hashSet);
            if (videoPercentViewed >= 25 && videoPercentViewed < 50) {
                com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.vastAd.getAdEventTracker().x();
                return;
            }
            if (videoPercentViewed >= 50 && videoPercentViewed < 75) {
                com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.vastAd.getAdEventTracker().y();
            } else if (videoPercentViewed >= 75) {
                com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.vastAd.getAdEventTracker().C();
            }
        }

        @Override // com.applovin.impl.u4.b
        public boolean b() {
            return !com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.videoWasCompleted;
        }
    }

    private class c implements android.view.View.OnClickListener {
        private c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            android.net.Uri uriC;
            com.applovin.impl.gq gqVarR1 = com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.vastAd.r1();
            if (gqVarR1 == null || (uriC = gqVarR1.c()) == null) {
                return;
            }
            com.applovin.impl.sdk.n nVar = com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.logger.a(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.TAG, "Industry icon clicked, opening URL: " + uriC);
            }
            com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.maybeFireTrackers(com.applovin.impl.aq.d.INDUSTRY_ICON_CLICK);
            com.applovin.impl.tp.a(uriC, view.getContext(), com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.sdk);
        }

        /* synthetic */ c(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView appLovinVastMediaView, com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.a aVar) {
            this();
        }
    }

    private class d implements com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl f1312a;

        public d(com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImpl) {
            this.f1312a = appLovinNativeAdImpl;
        }

        @Override // com.applovin.impl.adview.AppLovinTouchToClickListener.OnClickListener
        public void onClick(android.view.View view, android.view.MotionEvent motionEvent) {
            android.net.Uri uriL0;
            com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.maybeFireTrackers(com.applovin.impl.aq.d.VIDEO_CLICK);
            com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.vastAd.getAdEventTracker().v();
            if (com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.vastAd.J0() && (uriL0 = com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.vastAd.l0()) != null) {
                com.applovin.impl.sdk.n nVar = com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.logger.a(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.TAG, "Clicking through video");
                }
                com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.sdk.j().maybeSubmitPersistentPostbacks(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.vastAd.a(motionEvent, false));
                this.f1312a.handleNativeAdClick(uriL0, null, motionEvent, (!((java.lang.Boolean) com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.sdk.a(com.applovin.impl.sj.B)).booleanValue() || com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.viewActivity == null) ? com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.getContext() : com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.viewActivity);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class e implements com.applovin.impl.qh.c, com.applovin.exoplayer2.ui.d.e {
        private e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void c() {
            com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.mediaPlayer.a(0L);
        }

        @Override // com.applovin.impl.qh.c
        public void b(int i) {
            com.applovin.impl.sdk.n nVar = com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.logger;
            if (com.applovin.impl.sdk.n.a()) {
                com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.logger.a(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.TAG, "Player state changed to state " + i + " and will play when ready: " + com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.mediaPlayer.l());
            }
            if (i == 3) {
                com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.mediaPlayer.a(!com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.isVideoMuted ? 1 : 0);
                com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView appLovinVastMediaView = com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this;
                appLovinVastMediaView.videoDurationMillis = appLovinVastMediaView.mediaPlayer.getDuration();
                com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.vastAd.getAdEventTracker().b(java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.videoDurationMillis), com.applovin.impl.yp.e(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.sdk));
                com.applovin.impl.sdk.n nVar2 = com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.logger.a(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.TAG, "MediaPlayer prepared: " + com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.mediaPlayer);
                }
                com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.countdownManager.b();
                return;
            }
            if (i == 4) {
                com.applovin.impl.sdk.n nVar3 = com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.logger;
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.logger.a(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.TAG, "Video completed");
                }
                com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.videoWasCompleted = true;
                com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.finishVideo();
                if (com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.replayIconContainer != null) {
                    com.applovin.impl.zq.a(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.replayIconContainer, com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new java.lang.Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$e$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.c();
                        }
                    });
                } else {
                    com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.showMediaImageView();
                }
            }
        }

        @Override // com.applovin.exoplayer2.ui.d.e
        public void d(int i) {
            if (i == 0) {
                com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.videoView.c();
            }
        }

        /* synthetic */ e(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView appLovinVastMediaView, com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.a aVar) {
            this();
        }

        @Override // com.applovin.impl.qh.c
        public void a(com.applovin.impl.nh nhVar) {
            com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.handleMediaError("Video view error (" + com.applovin.impl.yp.a(nhVar) + ")");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    class f implements android.view.View.OnClickListener {
        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void a() {
            com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.videoWasCompleted = false;
            com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.automaticResumeHandled.set(false);
            com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.sdk.e().a(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.lifecycleCallbacksAdapter);
            com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.maybeHandleResume();
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            if (view == com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.playPauseButtonImageView) {
                if (com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.mediaPlayer.isPlaying()) {
                    com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.isVideoPausedByUser = true;
                    com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.maybeHandlePause();
                    return;
                } else {
                    com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.isVideoPausedByUser = false;
                    com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.maybeHandleResume();
                    return;
                }
            }
            if (view != com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.muteButtonImageView) {
                if (view == com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.replayIconContainer) {
                    com.applovin.impl.zq.b(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.replayIconContainer, com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.FADE_ANIMATION_DURATION_MILLIS, new java.lang.Runnable() { // from class: com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView$f$$ExternalSyntheticLambda0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f$0.a();
                        }
                    });
                }
            } else {
                boolean z = com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.isVideoMuted;
                boolean z2 = !z;
                com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.isVideoMuted = z2;
                com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.mediaPlayer.a(z ? 1.0f : 0.0f);
                com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.this.populateMuteImage(z2);
            }
        }

        /* synthetic */ f(com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView appLovinVastMediaView, com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.a aVar) {
            this();
        }
    }

    public AppLovinVastMediaView(com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl appLovinNativeAdImpl, com.applovin.impl.sdk.j jVar, android.content.Context context) {
        int iDpToPx;
        super(appLovinNativeAdImpl, jVar, context);
        android.os.Handler handler = new android.os.Handler(android.os.Looper.getMainLooper());
        this.countdownHandler = handler;
        this.countdownManager = new com.applovin.impl.u4(handler, this.sdk);
        this.videoEndListenerNotified = new java.util.concurrent.atomic.AtomicBoolean();
        this.mediaErrorHandled = new java.util.concurrent.atomic.AtomicBoolean();
        this.initialOnAttachedToWindowHandled = new java.util.concurrent.atomic.AtomicBoolean();
        this.automaticPauseHandled = new java.util.concurrent.atomic.AtomicBoolean();
        this.automaticResumeHandled = new java.util.concurrent.atomic.AtomicBoolean();
        this.isVideoMuted = true;
        this.lastVideoPositionFromPauseMillis = -1L;
        java.util.HashSet hashSet = new java.util.HashSet();
        this.videoProgressTrackers = hashSet;
        this.lifecycleCallbacksAdapter = new com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.a();
        com.applovin.impl.aq vastAd = appLovinNativeAdImpl.getVastAd();
        this.vastAd = vastAd;
        boolean zK0 = vastAd.K0();
        this.isVideoStream = zK0;
        if (zK0) {
            com.applovin.communicator.AppLovinCommunicator.getInstance(context).subscribe(this, "video_caching_failed");
        }
        com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.a aVar = null;
        if (vastAd.x1()) {
            this.industryIconImageView = com.applovin.impl.gq.a(vastAd.r1().e(), context, jVar);
            int iDpToPx2 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(context, ((java.lang.Integer) jVar.a(com.applovin.impl.sj.M4)).intValue());
            this.industryIconImageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(iDpToPx2, iDpToPx2, ((java.lang.Integer) jVar.a(com.applovin.impl.sj.O4)).intValue()));
            this.industryIconImageView.setOnClickListener(new com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.c(this, aVar));
            addView(this.industryIconImageView);
        }
        if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.T4)).booleanValue()) {
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(context);
            this.videoWidgetLinearLayout = linearLayout;
            linearLayout.setOrientation(0);
            this.videoWidgetLinearLayout.setBackgroundResource(com.applovin.sdk.R.drawable.applovin_rounded_black_background);
            this.videoWidgetLinearLayout.setAlpha(((java.lang.Float) jVar.a(com.applovin.impl.sj.S4)).floatValue());
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            this.playPauseButtonImageView = imageView;
            imageView.setClickable(true);
            com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.f fVar = new com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.f(this, aVar);
            this.playPauseButtonImageView.setOnClickListener(fVar);
            int iDpToPx3 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(context, ((java.lang.Integer) jVar.a(com.applovin.impl.sj.Q4)).intValue());
            this.playPauseButtonImageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(iDpToPx3, iDpToPx3));
            populatePlayPauseImage(false);
            this.videoWidgetLinearLayout.addView(this.playPauseButtonImageView);
            this.muteButtonImageView = new android.widget.ImageView(context);
            if (populateMuteImage(this.isVideoMuted)) {
                iDpToPx = com.applovin.sdk.AppLovinSdkUtils.dpToPx(context, ((java.lang.Integer) jVar.a(com.applovin.impl.sj.P4)).intValue());
                this.muteButtonImageView.setClickable(true);
                this.muteButtonImageView.setOnClickListener(fVar);
                this.muteButtonImageView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(iDpToPx, iDpToPx));
                this.videoWidgetLinearLayout.addView(this.muteButtonImageView);
            } else {
                iDpToPx = 0;
            }
            int iDpToPx4 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(context, ((java.lang.Integer) jVar.a(com.applovin.impl.sj.R4)).intValue());
            this.videoWidgetLinearLayout.setPadding(iDpToPx4, iDpToPx4, iDpToPx4, iDpToPx4);
            int i = iDpToPx4 * 2;
            this.videoWidgetLinearLayout.setLayoutParams(new android.widget.FrameLayout.LayoutParams(iDpToPx3 + iDpToPx + i, java.lang.Math.max(iDpToPx3, iDpToPx) + i, 8388691));
            addView(this.videoWidgetLinearLayout);
        }
        if (((java.lang.Boolean) jVar.a(com.applovin.impl.sj.U4)).booleanValue()) {
            android.widget.FrameLayout frameLayout = new android.widget.FrameLayout(getContext());
            this.replayIconContainer = frameLayout;
            frameLayout.setBackgroundColor(androidx.core.view.ViewCompat.MEASURED_STATE_MASK);
            this.replayIconContainer.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            this.replayIconContainer.setVisibility(4);
            this.replayIconContainer.setOnClickListener(new com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.f(this, aVar));
            android.widget.ImageView imageView2 = new android.widget.ImageView(getContext());
            int iDpToPx5 = com.applovin.sdk.AppLovinSdkUtils.dpToPx(context, ((java.lang.Integer) jVar.a(com.applovin.impl.sj.V4)).intValue());
            imageView2.setLayoutParams(new android.widget.FrameLayout.LayoutParams(iDpToPx5, iDpToPx5, 17));
            imageView2.setImageResource(com.applovin.sdk.R.drawable.applovin_ic_replay_icon);
            imageView2.setAdjustViewBounds(true);
            imageView2.setMaxHeight(this.replayIconContainer.getHeight());
            imageView2.setMaxWidth(this.replayIconContainer.getWidth());
            this.replayIconContainer.addView(imageView2);
            addView(this.replayIconContainer);
        }
        com.applovin.impl.ck ckVarA = new com.applovin.impl.ck.b(getContext()).a();
        this.mediaPlayer = ckVarA;
        com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.e eVar = new com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.e(this, aVar);
        ckVarA.a((com.applovin.impl.qh.c) eVar);
        ckVarA.a(0);
        com.applovin.exoplayer2.ui.e eVar2 = new com.applovin.exoplayer2.ui.e(getContext());
        this.videoView = eVar2;
        eVar2.c();
        eVar2.setControllerVisibilityListener(eVar);
        eVar2.setPlayer(ckVarA);
        eVar2.setOnTouchListener(new com.applovin.impl.adview.AppLovinTouchToClickListener(jVar, com.applovin.impl.sj.k0, getContext(), new com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.d(appLovinNativeAdImpl)));
        addView(eVar2);
        bringChildToFront(this.industryIconImageView);
        bringChildToFront(this.videoWidgetLinearLayout);
        prepareMediaPlayer();
        appLovinNativeAdImpl.setVideoView(eVar2);
        hashSet.addAll(vastAd.a(com.applovin.impl.aq.d.VIDEO, com.applovin.impl.lq.f998a));
    }

    private void checkCachedAdResourcesImmediately(boolean z) {
        if (com.applovin.impl.yp.a(z, this.vastAd, this.sdk, getContext()).isEmpty()) {
            return;
        }
        handleUnavailableCachedResources();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finishVideo() {
        maybeFireTrackers(com.applovin.impl.aq.d.VIDEO, "close");
        maybeHandlePause();
        this.sdk.e().b(this.lifecycleCallbacksAdapter);
        if (this.videoWasCompleted) {
            maybeFireRemainingCompletionTrackers();
            this.vastAd.getAdEventTracker().w();
        }
        if (this.videoEndListenerNotified.compareAndSet(false, true)) {
            this.sdk.j().trackVideoEnd(this.vastAd, java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(android.os.SystemClock.elapsedRealtime() - this.startTimeMillis), getVideoPercentViewed(), this.isVideoStream);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int getVideoPercentViewed() {
        long currentPosition = this.mediaPlayer.getCurrentPosition();
        if (this.videoWasCompleted) {
            return 100;
        }
        return currentPosition > 0 ? (int) ((currentPosition / this.videoDurationMillis) * 100.0f) : this.savedVideoPercentViewed;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void handleMediaError(java.lang.String str) {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.b(TAG, str);
        }
        if (!com.applovin.impl.sdk.utils.StringUtils.containsAtLeastOneSubstring(str, this.sdk.c(com.applovin.impl.sj.X4))) {
            maybeFireTrackers(com.applovin.impl.aq.d.ERROR, com.applovin.impl.fq.MEDIA_FILE_ERROR);
            this.vastAd.getAdEventTracker().b(str);
        } else if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(TAG, "Not firing trackers for media error: " + str);
        }
        if (com.applovin.impl.sdk.utils.StringUtils.containsAtLeastOneSubstring(str, this.sdk.c(com.applovin.impl.sj.H2))) {
            if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(TAG, "Ignoring media error: " + str);
            }
        } else if (this.mediaErrorHandled.compareAndSet(false, true)) {
            this.sdk.D().a("handleVastVideoError", str, this.vastAd);
            finishVideo();
            showMediaImageView();
        }
    }

    private void handleUnavailableCachedResources() {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.b(TAG, "Video failed due to unavailable resources");
        }
        finishVideo();
        showMediaImageView();
    }

    private void maybeFireRemainingCompletionTrackers() {
        if (getVideoPercentViewed() < this.vastAd.o0() || this.videoProgressTrackers.isEmpty()) {
            return;
        }
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.k(TAG, "Firing " + this.videoProgressTrackers.size() + " un-fired video progress trackers when video was completed.");
        }
        maybeFireTrackers(this.videoProgressTrackers);
    }

    private void maybeHandleOnAttachedToWindow() {
        if (this.initialOnAttachedToWindowHandled.compareAndSet(false, true)) {
            if (this.industryIconImageView != null && this.vastAd.x1()) {
                maybeFireTrackers(com.applovin.impl.aq.d.INDUSTRY_ICON_IMPRESSION);
                this.industryIconImageView.setVisibility(0);
            }
            this.startTimeMillis = android.os.SystemClock.elapsedRealtime();
            maybeFireTrackers(com.applovin.impl.aq.d.IMPRESSION);
            maybeFireTrackers(com.applovin.impl.aq.d.VIDEO, "creativeView");
            this.vastAd.getAdEventTracker().g();
            this.vastAd.setHasShown(true);
            this.sdk.j().trackImpression(this.vastAd);
            this.viewActivity = com.applovin.impl.r.a(com.applovin.impl.zq.b(this));
            this.sdk.e().a(this.lifecycleCallbacksAdapter);
            this.mediaPlayer.a(true);
            this.countdownManager.a(COUNTDOWN_IDENTIFIER_PROGRESS_TRACKING, java.util.concurrent.TimeUnit.SECONDS.toMillis(1L), new com.applovin.impl.sdk.nativeAd.AppLovinVastMediaView.b());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandlePause() {
        if (this.automaticPauseHandled.compareAndSet(false, true)) {
            maybeFireTrackers(com.applovin.impl.aq.d.VIDEO, "pause");
            this.vastAd.getAdEventTracker().z();
            pauseVideo();
            populatePlayPauseImage(true);
            this.automaticResumeHandled.set(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeHandleResume() {
        if (this.automaticResumeHandled.compareAndSet(false, true)) {
            maybeFireTrackers(com.applovin.impl.aq.d.VIDEO, "resume");
            this.vastAd.getAdEventTracker().A();
            if (this.lastVideoPositionFromPauseMillis >= 0) {
                if (com.applovin.impl.sdk.n.a()) {
                    this.logger.a(TAG, "Resuming video at position " + this.lastVideoPositionFromPauseMillis);
                }
                this.mediaPlayer.a(true);
                this.countdownManager.b();
                this.lastVideoPositionFromPauseMillis = -1L;
            } else if (com.applovin.impl.sdk.n.a()) {
                this.logger.a(TAG, "Invalid last video position, isVideoPlaying=" + this.mediaPlayer.isPlaying());
            }
            populatePlayPauseImage(false);
            this.automaticPauseHandled.set(false);
        }
    }

    private void pauseVideo() {
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(TAG, "Pausing video");
        }
        this.savedVideoPercentViewed = getVideoPercentViewed();
        this.lastVideoPositionFromPauseMillis = this.mediaPlayer.getCurrentPosition();
        this.mediaPlayer.a(false);
        this.countdownManager.c();
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(TAG, "Paused video at position " + this.lastVideoPositionFromPauseMillis + " ms");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean populateMuteImage(boolean z) {
        if (this.muteButtonImageView == null) {
            return false;
        }
        if (com.applovin.impl.z3.f()) {
            android.graphics.drawable.AnimatedVectorDrawable animatedVectorDrawable = (android.graphics.drawable.AnimatedVectorDrawable) getContext().getDrawable(z ? com.applovin.sdk.R.drawable.applovin_ic_unmute_to_mute : com.applovin.sdk.R.drawable.applovin_ic_mute_to_unmute);
            if (animatedVectorDrawable != null) {
                this.muteButtonImageView.setImageDrawable(animatedVectorDrawable);
                animatedVectorDrawable.start();
                return true;
            }
        }
        android.net.Uri uriM = z ? this.vastAd.M() : this.vastAd.g0();
        if (uriM == null) {
            return false;
        }
        com.applovin.impl.sdk.utils.ImageViewUtils.setImageUri(this.muteButtonImageView, uriM, this.sdk);
        return true;
    }

    private void populatePlayPauseImage(boolean z) {
        android.widget.ImageView imageView = this.playPauseButtonImageView;
        if (imageView == null) {
            return;
        }
        imageView.setImageResource(z ? com.applovin.sdk.R.drawable.applovin_ic_play_icon : com.applovin.sdk.R.drawable.applovin_ic_pause_icon);
    }

    private void prepareMediaPlayer() {
        checkCachedAdResourcesImmediately(!this.isVideoStream);
        com.applovin.impl.bi biVarA = new com.applovin.impl.bi.b(new com.applovin.impl.v5(getContext(), com.applovin.impl.xp.a(getContext(), com.google.ads.mediation.applovin.AppLovinMediationAdapter.APPLOVIN_SDK_ERROR_DOMAIN))).a(com.applovin.impl.sd.a(this.vastAd.u0()));
        this.mediaPlayer.a(!this.isVideoMuted ? 1 : 0);
        this.mediaPlayer.a((com.applovin.impl.ae) biVarA);
        this.mediaPlayer.b();
        this.mediaPlayer.a(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showMediaImageView() {
        if (this.imageView.getDrawable() == null) {
            return;
        }
        this.imageView.setVisibility(0);
        this.videoView.setVisibility(8);
        android.widget.LinearLayout linearLayout = this.videoWidgetLinearLayout;
        if (linearLayout != null) {
            linearLayout.setVisibility(8);
        }
        android.widget.ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setVisibility(8);
        }
    }

    @Override // com.applovin.impl.sdk.nativeAd.AppLovinMediaView
    public void destroy() {
        finishVideo();
        android.widget.ImageView imageView = this.industryIconImageView;
        if (imageView != null) {
            imageView.setOnClickListener(null);
        }
        android.widget.ImageView imageView2 = this.playPauseButtonImageView;
        if (imageView2 != null) {
            imageView2.setOnClickListener(null);
        }
        android.widget.ImageView imageView3 = this.muteButtonImageView;
        if (imageView3 != null) {
            imageView3.setOnClickListener(null);
        }
        android.widget.FrameLayout frameLayout = this.replayIconContainer;
        if (frameLayout != null) {
            frameLayout.setOnClickListener(null);
        }
        this.videoView.setOnTouchListener(null);
        this.viewActivity = null;
        this.mediaPlayer.V();
        this.vastAd.getAdEventTracker().f();
        this.countdownManager.a();
        this.countdownHandler.removeCallbacksAndMessages(null);
        if (this.isVideoStream) {
            com.applovin.communicator.AppLovinCommunicator.getInstance(getContext()).unsubscribe(this, "video_caching_failed");
        }
        super.destroy();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorEntity
    public java.lang.String getCommunicatorId() {
        return TAG;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        maybeHandleOnAttachedToWindow();
        if (this.isVideoPausedByUser) {
            return;
        }
        maybeHandleResume();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        maybeHandlePause();
        super.onDetachedFromWindow();
    }

    @Override // com.applovin.communicator.AppLovinCommunicatorSubscriber
    public void onMessageReceived(com.applovin.communicator.AppLovinCommunicatorMessage appLovinCommunicatorMessage) {
        if ("video_caching_failed".equals(appLovinCommunicatorMessage.getTopic())) {
            android.os.Bundle messageData = appLovinCommunicatorMessage.getMessageData();
            if (messageData.getLong("ad_id") == this.vastAd.getAdIdNumber() && this.isVideoStream) {
                int i = messageData.getInt("load_response_code");
                java.lang.String string = messageData.getString("load_exception_message");
                if ((string == null && i >= 200 && i < 300) || this.videoWasCompleted || this.mediaPlayer.isPlaying()) {
                    return;
                }
                handleMediaError("Video cache error during stream. ResponseCode=" + i + ", exception=" + string);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(com.applovin.impl.aq.d dVar) {
        maybeFireTrackers(dVar, com.applovin.impl.fq.UNSPECIFIED);
    }

    private void maybeFireTrackers(com.applovin.impl.aq.d dVar, com.applovin.impl.fq fqVar) {
        maybeFireTrackers(dVar, "", fqVar);
    }

    private void maybeFireTrackers(com.applovin.impl.aq.d dVar, java.lang.String str) {
        maybeFireTrackers(dVar, str, com.applovin.impl.fq.UNSPECIFIED);
    }

    private void maybeFireTrackers(com.applovin.impl.aq.d dVar, java.lang.String str, com.applovin.impl.fq fqVar) {
        maybeFireTrackers((java.util.Set<com.applovin.impl.kq>) this.vastAd.a(dVar, str), fqVar);
    }

    private void maybeFireTrackers(java.util.Set<com.applovin.impl.kq> set, com.applovin.impl.fq fqVar) {
        if (set == null || set.isEmpty()) {
            return;
        }
        long seconds = java.util.concurrent.TimeUnit.MILLISECONDS.toSeconds(this.mediaPlayer.getCurrentPosition());
        com.applovin.impl.oq oqVarW1 = this.vastAd.w1();
        android.net.Uri uriD = oqVarW1 != null ? oqVarW1.d() : null;
        if (com.applovin.impl.sdk.n.a()) {
            this.logger.a(TAG, "Firing " + set.size() + " tracker(s): " + set);
        }
        com.applovin.impl.mq.a(set, seconds, uriD, fqVar, this.sdk);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void maybeFireTrackers(java.util.Set<com.applovin.impl.kq> set) {
        maybeFireTrackers(set, com.applovin.impl.fq.UNSPECIFIED);
    }
}
