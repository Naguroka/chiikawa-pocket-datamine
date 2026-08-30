package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
public class PlayerView extends android.widget.FrameLayout implements androidx.media3.common.AdViewProvider {
    public static final int ARTWORK_DISPLAY_MODE_FILL = 2;
    public static final int ARTWORK_DISPLAY_MODE_FIT = 1;
    public static final int ARTWORK_DISPLAY_MODE_OFF = 0;
    public static final int IMAGE_DISPLAY_MODE_FILL = 1;
    public static final int IMAGE_DISPLAY_MODE_FIT = 0;
    public static final int SHOW_BUFFERING_ALWAYS = 2;
    public static final int SHOW_BUFFERING_NEVER = 0;
    public static final int SHOW_BUFFERING_WHEN_PLAYING = 1;
    private static final int SURFACE_TYPE_NONE = 0;
    private static final int SURFACE_TYPE_SPHERICAL_GL_SURFACE_VIEW = 3;
    private static final int SURFACE_TYPE_SURFACE_VIEW = 1;
    private static final int SURFACE_TYPE_TEXTURE_VIEW = 2;
    private static final int SURFACE_TYPE_VIDEO_DECODER_GL_SURFACE_VIEW = 4;
    private final android.widget.FrameLayout adOverlayFrameLayout;
    private int artworkDisplayMode;
    private final android.widget.ImageView artworkView;
    private final android.view.View bufferingView;
    private final androidx.media3.ui.PlayerView.ComponentListener componentListener;
    private final androidx.media3.ui.AspectRatioFrameLayout contentFrame;
    private final androidx.media3.ui.PlayerControlView controller;
    private boolean controllerAutoShow;
    private boolean controllerHideDuringAds;
    private boolean controllerHideOnTouch;
    private int controllerShowTimeoutMs;
    private androidx.media3.ui.PlayerView.ControllerVisibilityListener controllerVisibilityListener;
    private java.lang.CharSequence customErrorMessage;
    private android.graphics.drawable.Drawable defaultArtwork;
    private androidx.media3.common.ErrorMessageProvider<? super androidx.media3.common.PlaybackException> errorMessageProvider;
    private final android.widget.TextView errorMessageView;
    private final java.lang.Class<?> exoPlayerClazz;
    private androidx.media3.ui.PlayerView.FullscreenButtonClickListener fullscreenButtonClickListener;
    private int imageDisplayMode;
    private final java.lang.Object imageOutput;
    private final android.widget.ImageView imageView;
    private boolean keepContentOnPlayerReset;
    private androidx.media3.ui.PlayerControlView.VisibilityListener legacyControllerVisibilityListener;
    private final android.os.Handler mainLooperHandler;
    private final android.widget.FrameLayout overlayFrameLayout;
    private androidx.media3.common.Player player;
    private final java.lang.reflect.Method setImageOutputMethod;
    private int showBuffering;
    private final android.view.View shutterView;
    private final androidx.media3.ui.SubtitleView subtitleView;
    private final androidx.media3.ui.PlayerView.SurfaceSyncGroupCompatV34 surfaceSyncGroupV34;
    private final android.view.View surfaceView;
    private final boolean surfaceViewIgnoresVideoAspectRatio;
    private int textureViewRotation;
    private boolean useController;

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ArtworkDisplayMode {
    }

    public interface ControllerVisibilityListener {
        void onVisibilityChanged(int i);
    }

    public interface FullscreenButtonClickListener {
        void onFullscreenButtonClick(boolean z);
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ImageDisplayMode {
    }

    @java.lang.annotation.Target({java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface ShowBuffering {
    }

    private boolean isDpadKey(int i) {
        return i == 19 || i == 270 || i == 22 || i == 271 || i == 20 || i == 269 || i == 21 || i == 268 || i == 23;
    }

    public PlayerView(android.content.Context context) {
        this(context, null);
    }

    public PlayerView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        int i2;
        int i3;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        int i9;
        boolean z4;
        int i10;
        boolean z5;
        boolean z6;
        androidx.media3.ui.PlayerView.AnonymousClass1 anonymousClass1;
        boolean z7;
        java.lang.Class<?> cls;
        java.lang.Object objNewProxyInstance;
        java.lang.reflect.Method method;
        int i11;
        super(context, attributeSet, i);
        androidx.media3.ui.PlayerView.ComponentListener componentListener = new androidx.media3.ui.PlayerView.ComponentListener();
        this.componentListener = componentListener;
        this.mainLooperHandler = new android.os.Handler(android.os.Looper.getMainLooper());
        if (isInEditMode()) {
            this.contentFrame = null;
            this.shutterView = null;
            this.surfaceView = null;
            this.surfaceViewIgnoresVideoAspectRatio = false;
            this.surfaceSyncGroupV34 = null;
            this.imageView = null;
            this.artworkView = null;
            this.subtitleView = null;
            this.bufferingView = null;
            this.errorMessageView = null;
            this.controller = null;
            this.adOverlayFrameLayout = null;
            this.overlayFrameLayout = null;
            this.exoPlayerClazz = null;
            this.setImageOutputMethod = null;
            this.imageOutput = null;
            android.widget.ImageView imageView = new android.widget.ImageView(context);
            if (androidx.media3.common.util.Util.SDK_INT >= 23) {
                configureEditModeLogoV23(context, getResources(), imageView);
            } else {
                configureEditModeLogo(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i12 = androidx.media3.ui.R.layout.exo_player_view;
        if (attributeSet != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, androidx.media3.ui.R.styleable.PlayerView, i, 0);
            try {
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(androidx.media3.ui.R.styleable.PlayerView_shutter_background_color);
                int color = typedArrayObtainStyledAttributes.getColor(androidx.media3.ui.R.styleable.PlayerView_shutter_background_color, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerView_player_layout_id, i12);
                boolean z8 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerView_use_artwork, true);
                int i13 = typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.PlayerView_artwork_display_mode, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerView_default_artwork, 0);
                int i14 = typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.PlayerView_image_display_mode, 0);
                boolean z9 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerView_use_controller, true);
                int i15 = typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.PlayerView_surface_type, 1);
                int i16 = typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.PlayerView_resize_mode, 0);
                i2 = typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.PlayerView_show_timeout, 5000);
                boolean z10 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerView_hide_on_touch, true);
                z6 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerView_auto_show, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(androidx.media3.ui.R.styleable.PlayerView_show_buffering, 0);
                this.keepContentOnPlayerReset = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerView_keep_content_on_player_reset, this.keepContentOnPlayerReset);
                boolean z11 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerView_hide_during_ads, true);
                typedArrayObtainStyledAttributes.recycle();
                i6 = resourceId2;
                z2 = z10;
                z5 = z11;
                z4 = z8;
                i3 = resourceId;
                z = z9;
                z3 = zHasValue;
                i7 = i16;
                i4 = i14;
                i10 = i13;
                i9 = color;
                i8 = i15;
                i5 = integer;
            } catch (java.lang.Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i2 = 5000;
            i3 = i12;
            z = true;
            z2 = true;
            i4 = 0;
            i5 = 0;
            i6 = 0;
            i7 = 0;
            i8 = 1;
            z3 = false;
            i9 = 0;
            z4 = true;
            i10 = 1;
            z5 = true;
            z6 = true;
        }
        android.view.LayoutInflater.from(context).inflate(i3, this);
        setDescendantFocusability(262144);
        androidx.media3.ui.AspectRatioFrameLayout aspectRatioFrameLayout = (androidx.media3.ui.AspectRatioFrameLayout) findViewById(androidx.media3.ui.R.id.exo_content_frame);
        this.contentFrame = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            setResizeModeRaw(aspectRatioFrameLayout, i7);
        }
        android.view.View viewFindViewById = findViewById(androidx.media3.ui.R.id.exo_shutter);
        this.shutterView = viewFindViewById;
        if (viewFindViewById != null && z3) {
            viewFindViewById.setBackgroundColor(i9);
        }
        if (aspectRatioFrameLayout != null && i8 != 0) {
            android.view.ViewGroup.LayoutParams layoutParams = new android.view.ViewGroup.LayoutParams(-1, -1);
            if (i8 == 2) {
                this.surfaceView = new android.view.TextureView(context);
            } else {
                if (i8 == 3) {
                    try {
                        this.surfaceView = (android.view.View) java.lang.Class.forName("androidx.media3.exoplayer.video.spherical.SphericalGLSurfaceView").getConstructor(android.content.Context.class).newInstance(context);
                        z7 = true;
                    } catch (java.lang.Exception e) {
                        throw new java.lang.IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e);
                    }
                } else if (i8 == 4) {
                    try {
                        this.surfaceView = (android.view.View) java.lang.Class.forName("androidx.media3.exoplayer.video.VideoDecoderGLSurfaceView").getConstructor(android.content.Context.class).newInstance(context);
                    } catch (java.lang.Exception e2) {
                        throw new java.lang.IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e2);
                    }
                } else {
                    android.view.SurfaceView surfaceView = new android.view.SurfaceView(context);
                    if (androidx.media3.common.util.Util.SDK_INT >= 34) {
                        androidx.media3.ui.PlayerView.Api34.setSurfaceLifecycleToFollowsAttachment(surfaceView);
                    }
                    this.surfaceView = surfaceView;
                }
                this.surfaceView.setLayoutParams(layoutParams);
                this.surfaceView.setOnClickListener(componentListener);
                this.surfaceView.setClickable(false);
                aspectRatioFrameLayout.addView(this.surfaceView, 0);
                anonymousClass1 = null;
            }
            z7 = false;
            this.surfaceView.setLayoutParams(layoutParams);
            this.surfaceView.setOnClickListener(componentListener);
            this.surfaceView.setClickable(false);
            aspectRatioFrameLayout.addView(this.surfaceView, 0);
            anonymousClass1 = null;
        } else {
            anonymousClass1 = null;
            this.surfaceView = null;
            z7 = false;
        }
        this.surfaceViewIgnoresVideoAspectRatio = z7;
        this.surfaceSyncGroupV34 = androidx.media3.common.util.Util.SDK_INT == 34 ? new androidx.media3.ui.PlayerView.SurfaceSyncGroupCompatV34() : null;
        this.adOverlayFrameLayout = (android.widget.FrameLayout) findViewById(androidx.media3.ui.R.id.exo_ad_overlay);
        this.overlayFrameLayout = (android.widget.FrameLayout) findViewById(androidx.media3.ui.R.id.exo_overlay);
        this.imageView = (android.widget.ImageView) findViewById(androidx.media3.ui.R.id.exo_image);
        this.imageDisplayMode = i4;
        try {
            cls = java.lang.Class.forName("androidx.media3.exoplayer.ExoPlayer");
            java.lang.Class<?> cls2 = java.lang.Class.forName("androidx.media3.exoplayer.image.ImageOutput");
            method = cls.getMethod("setImageOutput", cls2);
            objNewProxyInstance = java.lang.reflect.Proxy.newProxyInstance(cls2.getClassLoader(), new java.lang.Class[]{cls2}, new java.lang.reflect.InvocationHandler() { // from class: androidx.media3.ui.PlayerView$$ExternalSyntheticLambda0
                @Override // java.lang.reflect.InvocationHandler
                public final java.lang.Object invoke(java.lang.Object obj, java.lang.reflect.Method method2, java.lang.Object[] objArr) {
                    return this.f$0.m458lambda$new$0$androidxmedia3uiPlayerView(obj, method2, objArr);
                }
            });
        } catch (java.lang.ClassNotFoundException | java.lang.NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.exoPlayerClazz = cls;
        this.setImageOutputMethod = method;
        this.imageOutput = objNewProxyInstance;
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(androidx.media3.ui.R.id.exo_artwork);
        this.artworkView = imageView2;
        this.artworkDisplayMode = z4 && i10 != 0 && imageView2 != null ? i10 : 0;
        if (i6 != 0) {
            this.defaultArtwork = androidx.core.content.ContextCompat.getDrawable(getContext(), i6);
        }
        androidx.media3.ui.SubtitleView subtitleView = (androidx.media3.ui.SubtitleView) findViewById(androidx.media3.ui.R.id.exo_subtitles);
        this.subtitleView = subtitleView;
        if (subtitleView != null) {
            subtitleView.setUserDefaultStyle();
            subtitleView.setUserDefaultTextSize();
        }
        android.view.View viewFindViewById2 = findViewById(androidx.media3.ui.R.id.exo_buffering);
        this.bufferingView = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.showBuffering = i5;
        android.widget.TextView textView = (android.widget.TextView) findViewById(androidx.media3.ui.R.id.exo_error_message);
        this.errorMessageView = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        androidx.media3.ui.PlayerControlView playerControlView = (androidx.media3.ui.PlayerControlView) findViewById(androidx.media3.ui.R.id.exo_controller);
        android.view.View viewFindViewById3 = findViewById(androidx.media3.ui.R.id.exo_controller_placeholder);
        if (playerControlView != null) {
            this.controller = playerControlView;
            i11 = 0;
        } else if (viewFindViewById3 != null) {
            i11 = 0;
            androidx.media3.ui.PlayerControlView playerControlView2 = new androidx.media3.ui.PlayerControlView(context, null, 0, attributeSet);
            this.controller = playerControlView2;
            playerControlView2.setId(androidx.media3.ui.R.id.exo_controller);
            playerControlView2.setLayoutParams(viewFindViewById3.getLayoutParams());
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(playerControlView2, iIndexOfChild);
        } else {
            i11 = 0;
            this.controller = null;
        }
        androidx.media3.ui.PlayerControlView playerControlView3 = this.controller;
        this.controllerShowTimeoutMs = playerControlView3 != null ? i2 : i11;
        this.controllerHideOnTouch = z2;
        this.controllerAutoShow = z6;
        this.controllerHideDuringAds = z5;
        this.useController = (!z || playerControlView3 == null) ? i11 : 1;
        if (playerControlView3 != null) {
            playerControlView3.hideImmediately();
            this.controller.addVisibilityListener(this.componentListener);
        }
        if (z) {
            setClickable(true);
        }
        updateContentDescription();
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-media3-ui-PlayerView, reason: not valid java name */
    /* synthetic */ java.lang.Object m458lambda$new$0$androidxmedia3uiPlayerView(java.lang.Object obj, java.lang.reflect.Method method, java.lang.Object[] objArr) throws java.lang.Throwable {
        if (!method.getName().equals("onImageAvailable")) {
            return null;
        }
        onImageAvailable((android.graphics.Bitmap) objArr[1]);
        return null;
    }

    public static void switchTargetView(androidx.media3.common.Player player, androidx.media3.ui.PlayerView playerView, androidx.media3.ui.PlayerView playerView2) {
        if (playerView == playerView2) {
            return;
        }
        if (playerView2 != null) {
            playerView2.setPlayer(player);
        }
        if (playerView != null) {
            playerView.setPlayer(null);
        }
    }

    public androidx.media3.common.Player getPlayer() {
        return this.player;
    }

    public void setPlayer(androidx.media3.common.Player player) {
        androidx.media3.common.util.Assertions.checkState(android.os.Looper.myLooper() == android.os.Looper.getMainLooper());
        androidx.media3.common.util.Assertions.checkArgument(player == null || player.getApplicationLooper() == android.os.Looper.getMainLooper());
        androidx.media3.common.Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.componentListener);
            if (player2.isCommandAvailable(27)) {
                android.view.View view = this.surfaceView;
                if (view instanceof android.view.TextureView) {
                    player2.clearVideoTextureView((android.view.TextureView) view);
                } else if (view instanceof android.view.SurfaceView) {
                    player2.clearVideoSurfaceView((android.view.SurfaceView) view);
                }
            }
            clearImageOutput(player2);
        }
        androidx.media3.ui.SubtitleView subtitleView = this.subtitleView;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.player = player;
        if (useController()) {
            this.controller.setPlayer(player);
        }
        updateBuffering();
        updateErrorMessage();
        updateForCurrentTrackSelections(true);
        if (player != null) {
            if (player.isCommandAvailable(27)) {
                android.view.View view2 = this.surfaceView;
                if (view2 instanceof android.view.TextureView) {
                    player.setVideoTextureView((android.view.TextureView) view2);
                } else if (view2 instanceof android.view.SurfaceView) {
                    player.setVideoSurfaceView((android.view.SurfaceView) view2);
                }
                if (!player.isCommandAvailable(30) || player.getCurrentTracks().isTypeSupported(2)) {
                    updateAspectRatio();
                }
            }
            if (this.subtitleView != null && player.isCommandAvailable(28)) {
                this.subtitleView.setCues(player.getCurrentCues().cues);
            }
            player.addListener(this.componentListener);
            setImageOutput(player);
            maybeShowController(false);
            return;
        }
        hideController();
    }

    private void setImageOutput(androidx.media3.common.Player player) {
        java.lang.Class<?> cls = this.exoPlayerClazz;
        if (cls == null || !cls.isAssignableFrom(player.getClass())) {
            return;
        }
        try {
            ((java.lang.reflect.Method) androidx.media3.common.util.Assertions.checkNotNull(this.setImageOutputMethod)).invoke(player, androidx.media3.common.util.Assertions.checkNotNull(this.imageOutput));
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    private void clearImageOutput(androidx.media3.common.Player player) {
        java.lang.Class<?> cls = this.exoPlayerClazz;
        if (cls == null || !cls.isAssignableFrom(player.getClass())) {
            return;
        }
        try {
            ((java.lang.reflect.Method) androidx.media3.common.util.Assertions.checkNotNull(this.setImageOutputMethod)).invoke(player, null);
        } catch (java.lang.IllegalAccessException | java.lang.reflect.InvocationTargetException e) {
            throw new java.lang.RuntimeException(e);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        android.view.View view = this.surfaceView;
        if (view instanceof android.view.SurfaceView) {
            view.setVisibility(i);
        }
    }

    public void setResizeMode(int i) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.contentFrame);
        this.contentFrame.setResizeMode(i);
    }

    public int getResizeMode() {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.contentFrame);
        return this.contentFrame.getResizeMode();
    }

    @java.lang.Deprecated
    public boolean getUseArtwork() {
        return this.artworkDisplayMode != 0;
    }

    @java.lang.Deprecated
    public void setUseArtwork(boolean z) {
        setArtworkDisplayMode(!z ? 1 : 0);
    }

    public void setArtworkDisplayMode(int i) {
        androidx.media3.common.util.Assertions.checkState(i == 0 || this.artworkView != null);
        if (this.artworkDisplayMode != i) {
            this.artworkDisplayMode = i;
            updateForCurrentTrackSelections(false);
        }
    }

    public int getArtworkDisplayMode() {
        return this.artworkDisplayMode;
    }

    public android.graphics.drawable.Drawable getDefaultArtwork() {
        return this.defaultArtwork;
    }

    public void setDefaultArtwork(android.graphics.drawable.Drawable drawable) {
        if (this.defaultArtwork != drawable) {
            this.defaultArtwork = drawable;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setImageDisplayMode(int i) {
        androidx.media3.common.util.Assertions.checkState(this.imageView != null);
        if (this.imageDisplayMode != i) {
            this.imageDisplayMode = i;
            updateImageViewAspectRatio();
        }
    }

    public int getImageDisplayMode() {
        return this.imageDisplayMode;
    }

    public boolean getUseController() {
        return this.useController;
    }

    public void setUseController(boolean z) {
        androidx.media3.common.util.Assertions.checkState((z && this.controller == null) ? false : true);
        setClickable(z || hasOnClickListeners());
        if (this.useController == z) {
            return;
        }
        this.useController = z;
        if (useController()) {
            this.controller.setPlayer(this.player);
        } else {
            androidx.media3.ui.PlayerControlView playerControlView = this.controller;
            if (playerControlView != null) {
                playerControlView.hide();
                this.controller.setPlayer(null);
            }
        }
        updateContentDescription();
    }

    public void setShutterBackgroundColor(int i) {
        android.view.View view = this.shutterView;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setKeepContentOnPlayerReset(boolean z) {
        if (this.keepContentOnPlayerReset != z) {
            this.keepContentOnPlayerReset = z;
            updateForCurrentTrackSelections(false);
        }
    }

    public void setShowBuffering(int i) {
        if (this.showBuffering != i) {
            this.showBuffering = i;
            updateBuffering();
        }
    }

    public void setErrorMessageProvider(androidx.media3.common.ErrorMessageProvider<? super androidx.media3.common.PlaybackException> errorMessageProvider) {
        if (this.errorMessageProvider != errorMessageProvider) {
            this.errorMessageProvider = errorMessageProvider;
            updateErrorMessage();
        }
    }

    public void setCustomErrorMessage(java.lang.CharSequence charSequence) {
        androidx.media3.common.util.Assertions.checkState(this.errorMessageView != null);
        this.customErrorMessage = charSequence;
        updateErrorMessage();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        androidx.media3.common.Player player = this.player;
        if (player != null && player.isCommandAvailable(16) && this.player.isPlayingAd()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zIsDpadKey = isDpadKey(keyEvent.getKeyCode());
        if (zIsDpadKey && useController() && !this.controller.isFullyVisible()) {
            maybeShowController(true);
            return true;
        }
        if (dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            maybeShowController(true);
            return true;
        }
        if (zIsDpadKey && useController()) {
            maybeShowController(true);
        }
        return false;
    }

    public boolean dispatchMediaKeyEvent(android.view.KeyEvent keyEvent) {
        return useController() && this.controller.dispatchMediaKeyEvent(keyEvent);
    }

    public boolean isControllerFullyVisible() {
        androidx.media3.ui.PlayerControlView playerControlView = this.controller;
        return playerControlView != null && playerControlView.isFullyVisible();
    }

    public void showController() {
        showController(shouldShowControllerIndefinitely());
    }

    public void hideController() {
        androidx.media3.ui.PlayerControlView playerControlView = this.controller;
        if (playerControlView != null) {
            playerControlView.hide();
        }
    }

    public int getControllerShowTimeoutMs() {
        return this.controllerShowTimeoutMs;
    }

    public void setControllerShowTimeoutMs(int i) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        this.controllerShowTimeoutMs = i;
        if (this.controller.isFullyVisible()) {
            showController();
        }
    }

    public boolean getControllerHideOnTouch() {
        return this.controllerHideOnTouch;
    }

    public void setControllerHideOnTouch(boolean z) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        this.controllerHideOnTouch = z;
        updateContentDescription();
    }

    public boolean getControllerAutoShow() {
        return this.controllerAutoShow;
    }

    public void setControllerAutoShow(boolean z) {
        this.controllerAutoShow = z;
    }

    public void setControllerHideDuringAds(boolean z) {
        this.controllerHideDuringAds = z;
    }

    public void setControllerVisibilityListener(androidx.media3.ui.PlayerView.ControllerVisibilityListener controllerVisibilityListener) {
        this.controllerVisibilityListener = controllerVisibilityListener;
        if (controllerVisibilityListener != null) {
            setControllerVisibilityListener((androidx.media3.ui.PlayerControlView.VisibilityListener) null);
        }
    }

    public void setControllerAnimationEnabled(boolean z) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setAnimationEnabled(z);
    }

    @java.lang.Deprecated
    public void setControllerVisibilityListener(androidx.media3.ui.PlayerControlView.VisibilityListener visibilityListener) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        androidx.media3.ui.PlayerControlView.VisibilityListener visibilityListener2 = this.legacyControllerVisibilityListener;
        if (visibilityListener2 == visibilityListener) {
            return;
        }
        if (visibilityListener2 != null) {
            this.controller.removeVisibilityListener(visibilityListener2);
        }
        this.legacyControllerVisibilityListener = visibilityListener;
        if (visibilityListener != null) {
            this.controller.addVisibilityListener(visibilityListener);
            setControllerVisibilityListener((androidx.media3.ui.PlayerView.ControllerVisibilityListener) null);
        }
    }

    public void setFullscreenButtonClickListener(androidx.media3.ui.PlayerView.FullscreenButtonClickListener fullscreenButtonClickListener) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        this.fullscreenButtonClickListener = fullscreenButtonClickListener;
        this.controller.setOnFullScreenModeChangedListener(this.componentListener);
    }

    @java.lang.Deprecated
    public void setControllerOnFullScreenModeChangedListener(androidx.media3.ui.PlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        this.fullscreenButtonClickListener = null;
        this.controller.setOnFullScreenModeChangedListener(onFullScreenModeChangedListener);
    }

    public void setShowRewindButton(boolean z) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setShowRewindButton(z);
    }

    public void setShowFastForwardButton(boolean z) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setShowFastForwardButton(z);
    }

    public void setShowPreviousButton(boolean z) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setShowPreviousButton(z);
    }

    public void setShowNextButton(boolean z) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setShowNextButton(z);
    }

    public void setRepeatToggleModes(int i) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setRepeatToggleModes(i);
    }

    public void setShowShuffleButton(boolean z) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setShowShuffleButton(z);
    }

    public void setShowSubtitleButton(boolean z) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setShowSubtitleButton(z);
    }

    public void setShowVrButton(boolean z) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setShowVrButton(z);
    }

    @java.lang.Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setShowMultiWindowTimeBar(z);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setShowPlayButtonIfPlaybackIsSuppressed(z);
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        this.controller.setExtraAdGroupMarkers(jArr, zArr);
    }

    public void setAspectRatioListener(androidx.media3.ui.AspectRatioFrameLayout.AspectRatioListener aspectRatioListener) {
        androidx.media3.common.util.Assertions.checkStateNotNull(this.contentFrame);
        this.contentFrame.setAspectRatioListener(aspectRatioListener);
    }

    public android.view.View getVideoSurfaceView() {
        return this.surfaceView;
    }

    public android.widget.FrameLayout getOverlayFrameLayout() {
        return this.overlayFrameLayout;
    }

    public androidx.media3.ui.SubtitleView getSubtitleView() {
        return this.subtitleView;
    }

    @Override // android.view.View
    public boolean performClick() {
        toggleControllerVisibility();
        return super.performClick();
    }

    @Override // android.view.View
    public boolean onTrackballEvent(android.view.MotionEvent motionEvent) {
        if (!useController() || this.player == null) {
            return false;
        }
        maybeShowController(true);
        return true;
    }

    public void onResume() {
        android.view.View view = this.surfaceView;
        if (view instanceof android.opengl.GLSurfaceView) {
            ((android.opengl.GLSurfaceView) view).onResume();
        }
    }

    public void onPause() {
        android.view.View view = this.surfaceView;
        if (view instanceof android.opengl.GLSurfaceView) {
            ((android.opengl.GLSurfaceView) view).onPause();
        }
    }

    protected void onContentAspectRatioChanged(androidx.media3.ui.AspectRatioFrameLayout aspectRatioFrameLayout, float f) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f);
        }
    }

    @Override // androidx.media3.common.AdViewProvider
    public android.view.ViewGroup getAdViewGroup() {
        return (android.view.ViewGroup) androidx.media3.common.util.Assertions.checkStateNotNull(this.adOverlayFrameLayout, "exo_ad_overlay must be present for ad playback");
    }

    @Override // androidx.media3.common.AdViewProvider
    public java.util.List<androidx.media3.common.AdOverlayInfo> getAdOverlayInfos() {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (this.overlayFrameLayout != null) {
            arrayList.add(new androidx.media3.common.AdOverlayInfo.Builder(this.overlayFrameLayout, 4).setDetailedReason("Transparent overlay does not impact viewability").build());
        }
        if (this.controller != null) {
            arrayList.add(new androidx.media3.common.AdOverlayInfo.Builder(this.controller, 1).build());
        }
        return com.google.common.collect.ImmutableList.copyOf((java.util.Collection) arrayList);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNullIf(expression = {"controller"}, result = true)
    private boolean useController() {
        if (!this.useController) {
            return false;
        }
        androidx.media3.common.util.Assertions.checkStateNotNull(this.controller);
        return true;
    }

    private boolean useArtwork() {
        if (this.artworkDisplayMode == 0) {
            return false;
        }
        androidx.media3.common.util.Assertions.checkStateNotNull(this.artworkView);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void toggleControllerVisibility() {
        if (!useController() || this.player == null) {
            return;
        }
        if (!this.controller.isFullyVisible()) {
            maybeShowController(true);
        } else if (this.controllerHideOnTouch) {
            this.controller.hide();
        }
    }

    private void maybeShowController(boolean z) {
        if (!(isPlayingAd() && this.controllerHideDuringAds) && useController()) {
            boolean z2 = this.controller.isFullyVisible() && this.controller.getShowTimeoutMs() <= 0;
            boolean zShouldShowControllerIndefinitely = shouldShowControllerIndefinitely();
            if (z || z2 || zShouldShowControllerIndefinitely) {
                showController(zShouldShowControllerIndefinitely);
            }
        }
    }

    private boolean shouldShowControllerIndefinitely() {
        androidx.media3.common.Player player = this.player;
        if (player == null) {
            return true;
        }
        int playbackState = player.getPlaybackState();
        return this.controllerAutoShow && !(this.player.isCommandAvailable(17) && this.player.getCurrentTimeline().isEmpty()) && (playbackState == 1 || playbackState == 4 || !((androidx.media3.common.Player) androidx.media3.common.util.Assertions.checkNotNull(this.player)).getPlayWhenReady());
    }

    private void showController(boolean z) {
        if (useController()) {
            this.controller.setShowTimeoutMs(z ? 0 : this.controllerShowTimeoutMs);
            this.controller.show();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isPlayingAd() {
        androidx.media3.common.Player player = this.player;
        return player != null && player.isCommandAvailable(16) && this.player.isPlayingAd() && this.player.getPlayWhenReady();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateForCurrentTrackSelections(boolean z) {
        androidx.media3.common.Player player = this.player;
        boolean z2 = (player == null || !player.isCommandAvailable(30) || player.getCurrentTracks().isEmpty()) ? false : true;
        if (!this.keepContentOnPlayerReset && (!z2 || z)) {
            hideArtwork();
            closeShutter();
            hideAndClearImage();
        }
        if (z2) {
            boolean zHasSelectedVideoTrack = hasSelectedVideoTrack();
            boolean zHasSelectedImageTrack = hasSelectedImageTrack();
            if (!zHasSelectedVideoTrack && !zHasSelectedImageTrack) {
                closeShutter();
                hideAndClearImage();
            }
            android.view.View view = this.shutterView;
            boolean z3 = view != null && view.getVisibility() == 4 && isImageSet();
            if (zHasSelectedImageTrack && !zHasSelectedVideoTrack && z3) {
                closeShutter();
                showImage();
            } else if (zHasSelectedVideoTrack && !zHasSelectedImageTrack && z3) {
                hideAndClearImage();
            }
            if (((zHasSelectedVideoTrack || zHasSelectedImageTrack || !useArtwork()) ? false : true) && (setArtworkFromMediaMetadata(player) || setDrawableArtwork(this.defaultArtwork))) {
                return;
            }
            hideArtwork();
        }
    }

    private boolean setArtworkFromMediaMetadata(androidx.media3.common.Player player) {
        if (player == null || !player.isCommandAvailable(18)) {
            return false;
        }
        androidx.media3.common.MediaMetadata mediaMetadata = player.getMediaMetadata();
        if (mediaMetadata.artworkData == null) {
            return false;
        }
        return setDrawableArtwork(new android.graphics.drawable.BitmapDrawable(getResources(), android.graphics.BitmapFactory.decodeByteArray(mediaMetadata.artworkData, 0, mediaMetadata.artworkData.length)));
    }

    private boolean setDrawableArtwork(android.graphics.drawable.Drawable drawable) {
        if (this.artworkView != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                android.widget.ImageView.ScaleType scaleType = android.widget.ImageView.ScaleType.FIT_XY;
                if (this.artworkDisplayMode == 2) {
                    width = getWidth() / getHeight();
                    scaleType = android.widget.ImageView.ScaleType.CENTER_CROP;
                }
                onContentAspectRatioChanged(this.contentFrame, width);
                this.artworkView.setScaleType(scaleType);
                this.artworkView.setImageDrawable(drawable);
                this.artworkView.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private void hideArtwork() {
        android.widget.ImageView imageView = this.artworkView;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
            this.artworkView.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean hasSelectedImageTrack() {
        androidx.media3.common.Player player = this.player;
        return player != null && this.imageOutput != null && player.isCommandAvailable(30) && player.getCurrentTracks().isTypeSelected(4);
    }

    private boolean hasSelectedVideoTrack() {
        androidx.media3.common.Player player = this.player;
        return player != null && player.isCommandAvailable(30) && player.getCurrentTracks().isTypeSelected(2);
    }

    private boolean isImageSet() {
        android.graphics.drawable.Drawable drawable;
        android.widget.ImageView imageView = this.imageView;
        return (imageView == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
    }

    private void setImage(android.graphics.drawable.Drawable drawable) {
        android.widget.ImageView imageView = this.imageView;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        updateImageViewAspectRatio();
    }

    private void updateImageViewAspectRatio() {
        android.graphics.drawable.Drawable drawable;
        android.widget.ImageView imageView = this.imageView;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        android.widget.ImageView.ScaleType scaleType = android.widget.ImageView.ScaleType.FIT_XY;
        if (this.imageDisplayMode == 1) {
            width = getWidth() / getHeight();
            scaleType = android.widget.ImageView.ScaleType.CENTER_CROP;
        }
        if (this.imageView.getVisibility() == 0) {
            onContentAspectRatioChanged(this.contentFrame, width);
        }
        this.imageView.setScaleType(scaleType);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideAndClearImage() {
        hideImage();
        android.widget.ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setImageResource(android.R.color.transparent);
        }
    }

    private void showImage() {
        android.widget.ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setVisibility(0);
            updateImageViewAspectRatio();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideImage() {
        android.widget.ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    private void onImageAvailable(final android.graphics.Bitmap bitmap) {
        this.mainLooperHandler.post(new java.lang.Runnable() { // from class: androidx.media3.ui.PlayerView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m459lambda$onImageAvailable$1$androidxmedia3uiPlayerView(bitmap);
            }
        });
    }

    /* JADX INFO: renamed from: lambda$onImageAvailable$1$androidx-media3-ui-PlayerView, reason: not valid java name */
    /* synthetic */ void m459lambda$onImageAvailable$1$androidxmedia3uiPlayerView(android.graphics.Bitmap bitmap) {
        setImage(new android.graphics.drawable.BitmapDrawable(getResources(), bitmap));
        if (hasSelectedVideoTrack()) {
            return;
        }
        showImage();
        closeShutter();
    }

    private void closeShutter() {
        android.view.View view = this.shutterView;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x0020  */
    public void updateBuffering() {
        boolean z;
        if (this.bufferingView != null) {
            androidx.media3.common.Player player = this.player;
            if (player == null || player.getPlaybackState() != 2) {
                z = false;
            } else {
                int i = this.showBuffering;
                z = true;
                if (i != 2 && (i != 1 || !this.player.getPlayWhenReady())) {
                    z = false;
                }
            }
            this.bufferingView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateErrorMessage() {
        androidx.media3.common.ErrorMessageProvider<? super androidx.media3.common.PlaybackException> errorMessageProvider;
        android.widget.TextView textView = this.errorMessageView;
        if (textView != null) {
            java.lang.CharSequence charSequence = this.customErrorMessage;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.errorMessageView.setVisibility(0);
                return;
            }
            androidx.media3.common.Player player = this.player;
            androidx.media3.common.PlaybackException playerError = player != null ? player.getPlayerError() : null;
            if (playerError != null && (errorMessageProvider = this.errorMessageProvider) != null) {
                this.errorMessageView.setText((java.lang.CharSequence) errorMessageProvider.getErrorMessage(playerError).second);
                this.errorMessageView.setVisibility(0);
            } else {
                this.errorMessageView.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateContentDescription() {
        androidx.media3.ui.PlayerControlView playerControlView = this.controller;
        if (playerControlView == null || !this.useController) {
            setContentDescription(null);
        } else if (playerControlView.isFullyVisible()) {
            setContentDescription(this.controllerHideOnTouch ? getResources().getString(androidx.media3.ui.R.string.exo_controls_hide) : null);
        } else {
            setContentDescription(getResources().getString(androidx.media3.ui.R.string.exo_controls_show));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateControllerVisibility() {
        if (isPlayingAd() && this.controllerHideDuringAds) {
            hideController();
        } else {
            maybeShowController(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateAspectRatio() {
        androidx.media3.common.Player player = this.player;
        androidx.media3.common.VideoSize videoSize = player != null ? player.getVideoSize() : androidx.media3.common.VideoSize.UNKNOWN;
        int i = videoSize.width;
        int i2 = videoSize.height;
        int i3 = videoSize.unappliedRotationDegrees;
        float f = (i2 == 0 || i == 0) ? 0.0f : (i * videoSize.pixelWidthHeightRatio) / i2;
        android.view.View view = this.surfaceView;
        if (view instanceof android.view.TextureView) {
            if (f > 0.0f && (i3 == 90 || i3 == 270)) {
                f = 1.0f / f;
            }
            if (this.textureViewRotation != 0) {
                view.removeOnLayoutChangeListener(this.componentListener);
            }
            this.textureViewRotation = i3;
            if (i3 != 0) {
                this.surfaceView.addOnLayoutChangeListener(this.componentListener);
            }
            applyTextureViewRotation((android.view.TextureView) this.surfaceView, this.textureViewRotation);
        }
        onContentAspectRatioChanged(this.contentFrame, this.surfaceViewIgnoresVideoAspectRatio ? 0.0f : f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(android.graphics.Canvas canvas) {
        androidx.media3.ui.PlayerView.SurfaceSyncGroupCompatV34 surfaceSyncGroupCompatV34;
        super.dispatchDraw(canvas);
        if (androidx.media3.common.util.Util.SDK_INT != 34 || (surfaceSyncGroupCompatV34 = this.surfaceSyncGroupV34) == null) {
            return;
        }
        surfaceSyncGroupCompatV34.maybeMarkSyncReadyAndClear();
    }

    private static void configureEditModeLogoV23(android.content.Context context, android.content.res.Resources resources, android.widget.ImageView imageView) {
        imageView.setImageDrawable(androidx.media3.common.util.Util.getDrawable(context, resources, androidx.media3.ui.R.drawable.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(androidx.media3.ui.R.color.exo_edit_mode_background_color, null));
    }

    private static void configureEditModeLogo(android.content.Context context, android.content.res.Resources resources, android.widget.ImageView imageView) {
        imageView.setImageDrawable(androidx.media3.common.util.Util.getDrawable(context, resources, androidx.media3.ui.R.drawable.exo_edit_mode_logo));
        imageView.setBackgroundColor(resources.getColor(androidx.media3.ui.R.color.exo_edit_mode_background_color));
    }

    private static void setResizeModeRaw(androidx.media3.ui.AspectRatioFrameLayout aspectRatioFrameLayout, int i) {
        aspectRatioFrameLayout.setResizeMode(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void applyTextureViewRotation(android.view.TextureView textureView, int i) {
        android.graphics.Matrix matrix = new android.graphics.Matrix();
        float width = textureView.getWidth();
        float height = textureView.getHeight();
        if (width != 0.0f && height != 0.0f && i != 0) {
            float f = width / 2.0f;
            float f2 = height / 2.0f;
            matrix.postRotate(i, f, f2);
            android.graphics.RectF rectF = new android.graphics.RectF(0.0f, 0.0f, width, height);
            android.graphics.RectF rectF2 = new android.graphics.RectF();
            matrix.mapRect(rectF2, rectF);
            matrix.postScale(width / rectF2.width(), height / rectF2.height(), f, f2);
        }
        textureView.setTransform(matrix);
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class ComponentListener implements androidx.media3.common.Player.Listener, android.view.View.OnLayoutChangeListener, android.view.View.OnClickListener, androidx.media3.ui.PlayerControlView.VisibilityListener, androidx.media3.ui.PlayerControlView.OnFullScreenModeChangedListener {
        private java.lang.Object lastPeriodUidWithTracks;
        private final androidx.media3.common.Timeline.Period period = new androidx.media3.common.Timeline.Period();

        public ComponentListener() {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onCues(androidx.media3.common.text.CueGroup cueGroup) {
            if (androidx.media3.ui.PlayerView.this.subtitleView != null) {
                androidx.media3.ui.PlayerView.this.subtitleView.setCues(cueGroup.cues);
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onVideoSizeChanged(androidx.media3.common.VideoSize videoSize) {
            if (videoSize.equals(androidx.media3.common.VideoSize.UNKNOWN) || androidx.media3.ui.PlayerView.this.player == null || androidx.media3.ui.PlayerView.this.player.getPlaybackState() == 1) {
                return;
            }
            androidx.media3.ui.PlayerView.this.updateAspectRatio();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onSurfaceSizeChanged(int i, int i2) {
            if (androidx.media3.common.util.Util.SDK_INT == 34 && (androidx.media3.ui.PlayerView.this.surfaceView instanceof android.view.SurfaceView)) {
                androidx.media3.ui.PlayerView.SurfaceSyncGroupCompatV34 surfaceSyncGroupCompatV34 = (androidx.media3.ui.PlayerView.SurfaceSyncGroupCompatV34) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.ui.PlayerView.this.surfaceSyncGroupV34);
                android.os.Handler handler = androidx.media3.ui.PlayerView.this.mainLooperHandler;
                android.view.SurfaceView surfaceView = (android.view.SurfaceView) androidx.media3.ui.PlayerView.this.surfaceView;
                final androidx.media3.ui.PlayerView playerView = androidx.media3.ui.PlayerView.this;
                surfaceSyncGroupCompatV34.postRegister(handler, surfaceView, new java.lang.Runnable() { // from class: androidx.media3.ui.PlayerView$ComponentListener$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        playerView.invalidate();
                    }
                });
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onRenderedFirstFrame() {
            if (androidx.media3.ui.PlayerView.this.shutterView != null) {
                androidx.media3.ui.PlayerView.this.shutterView.setVisibility(4);
                if (androidx.media3.ui.PlayerView.this.hasSelectedImageTrack()) {
                    androidx.media3.ui.PlayerView.this.hideImage();
                } else {
                    androidx.media3.ui.PlayerView.this.hideAndClearImage();
                }
            }
        }

        @Override // androidx.media3.common.Player.Listener
        public void onTracksChanged(androidx.media3.common.Tracks tracks) {
            androidx.media3.common.Timeline currentTimeline;
            androidx.media3.common.Player player = (androidx.media3.common.Player) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.ui.PlayerView.this.player);
            if (player.isCommandAvailable(17)) {
                currentTimeline = player.getCurrentTimeline();
            } else {
                currentTimeline = androidx.media3.common.Timeline.EMPTY;
            }
            if (currentTimeline.isEmpty()) {
                this.lastPeriodUidWithTracks = null;
            } else if (player.isCommandAvailable(30) && !player.getCurrentTracks().isEmpty()) {
                this.lastPeriodUidWithTracks = currentTimeline.getPeriod(player.getCurrentPeriodIndex(), this.period, true).uid;
            } else {
                java.lang.Object obj = this.lastPeriodUidWithTracks;
                if (obj != null) {
                    int indexOfPeriod = currentTimeline.getIndexOfPeriod(obj);
                    if (indexOfPeriod != -1) {
                        if (player.getCurrentMediaItemIndex() == currentTimeline.getPeriod(indexOfPeriod, this.period).windowIndex) {
                            return;
                        }
                    }
                    this.lastPeriodUidWithTracks = null;
                }
            }
            androidx.media3.ui.PlayerView.this.updateForCurrentTrackSelections(false);
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlaybackStateChanged(int i) {
            androidx.media3.ui.PlayerView.this.updateBuffering();
            androidx.media3.ui.PlayerView.this.updateErrorMessage();
            androidx.media3.ui.PlayerView.this.updateControllerVisibility();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPlayWhenReadyChanged(boolean z, int i) {
            androidx.media3.ui.PlayerView.this.updateBuffering();
            androidx.media3.ui.PlayerView.this.updateControllerVisibility();
        }

        @Override // androidx.media3.common.Player.Listener
        public void onPositionDiscontinuity(androidx.media3.common.Player.PositionInfo positionInfo, androidx.media3.common.Player.PositionInfo positionInfo2, int i) {
            if (androidx.media3.ui.PlayerView.this.isPlayingAd() && androidx.media3.ui.PlayerView.this.controllerHideDuringAds) {
                androidx.media3.ui.PlayerView.this.hideController();
            }
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            androidx.media3.ui.PlayerView.applyTextureViewRotation((android.view.TextureView) view, androidx.media3.ui.PlayerView.this.textureViewRotation);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            androidx.media3.ui.PlayerView.this.toggleControllerVisibility();
        }

        @Override // androidx.media3.ui.PlayerControlView.VisibilityListener
        public void onVisibilityChange(int i) {
            androidx.media3.ui.PlayerView.this.updateContentDescription();
            if (androidx.media3.ui.PlayerView.this.controllerVisibilityListener != null) {
                androidx.media3.ui.PlayerView.this.controllerVisibilityListener.onVisibilityChanged(i);
            }
        }

        @Override // androidx.media3.ui.PlayerControlView.OnFullScreenModeChangedListener
        public void onFullScreenModeChanged(boolean z) {
            if (androidx.media3.ui.PlayerView.this.fullscreenButtonClickListener != null) {
                androidx.media3.ui.PlayerView.this.fullscreenButtonClickListener.onFullscreenButtonClick(z);
            }
        }
    }

    private static class Api34 {
        private Api34() {
        }

        public static void setSurfaceLifecycleToFollowsAttachment(android.view.SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class SurfaceSyncGroupCompatV34 {
        android.window.SurfaceSyncGroup surfaceSyncGroup;

        static /* synthetic */ void lambda$postRegister$0() {
        }

        private SurfaceSyncGroupCompatV34() {
        }

        public void postRegister(android.os.Handler handler, final android.view.SurfaceView surfaceView, final java.lang.Runnable runnable) {
            handler.post(new java.lang.Runnable() { // from class: androidx.media3.ui.PlayerView$SurfaceSyncGroupCompatV34$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.m461xd2b35cc8(surfaceView, runnable);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$postRegister$1$androidx-media3-ui-PlayerView$SurfaceSyncGroupCompatV34, reason: not valid java name */
        /* synthetic */ void m461xd2b35cc8(android.view.SurfaceView surfaceView, java.lang.Runnable runnable) {
            android.view.AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            android.window.SurfaceSyncGroup surfaceSyncGroup = new android.window.SurfaceSyncGroup("exo-sync-b-334901521");
            this.surfaceSyncGroup = surfaceSyncGroup;
            androidx.media3.common.util.Assertions.checkState(surfaceSyncGroup.add(rootSurfaceControl, new java.lang.Runnable() { // from class: androidx.media3.ui.PlayerView$SurfaceSyncGroupCompatV34$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.media3.ui.PlayerView.SurfaceSyncGroupCompatV34.lambda$postRegister$0();
                }
            }));
            runnable.run();
            rootSurfaceControl.applyTransactionOnDraw(new android.view.SurfaceControl.Transaction());
        }

        public void maybeMarkSyncReadyAndClear() {
            android.window.SurfaceSyncGroup surfaceSyncGroup = this.surfaceSyncGroup;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.surfaceSyncGroup = null;
            }
        }
    }
}
