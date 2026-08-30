package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
public class LegacyPlayerControlView extends android.widget.FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private long[] adGroupTimesMs;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final androidx.media3.ui.LegacyPlayerControlView.ComponentListener componentListener;
    private long currentBufferedPosition;
    private long currentPosition;
    private long currentWindowOffset;
    private final android.widget.TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    private final android.view.View fastForwardButton;
    private final java.lang.StringBuilder formatBuilder;
    private final java.util.Formatter formatter;
    private final java.lang.Runnable hideAction;
    private long hideAtMs;
    private boolean isAttachedToWindow;
    private boolean multiWindowTimeBar;
    private final android.view.View nextButton;
    private final android.view.View pauseButton;
    private final androidx.media3.common.Timeline.Period period;
    private final android.view.View playButton;
    private boolean[] playedAdGroups;
    private androidx.media3.common.Player player;
    private final android.widget.TextView positionView;
    private final android.view.View previousButton;
    private androidx.media3.ui.LegacyPlayerControlView.ProgressUpdateListener progressUpdateListener;
    private final java.lang.String repeatAllButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatAllButtonDrawable;
    private final java.lang.String repeatOffButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatOffButtonDrawable;
    private final java.lang.String repeatOneButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatOneButtonDrawable;
    private final android.widget.ImageView repeatToggleButton;
    private int repeatToggleModes;
    private final android.view.View rewindButton;
    private boolean scrubbing;
    private boolean showFastForwardButton;
    private boolean showMultiWindowTimeBar;
    private boolean showNextButton;
    private boolean showPlayButtonIfSuppressed;
    private boolean showPreviousButton;
    private boolean showRewindButton;
    private boolean showShuffleButton;
    private int showTimeoutMs;
    private final android.widget.ImageView shuffleButton;
    private final android.graphics.drawable.Drawable shuffleOffButtonDrawable;
    private final java.lang.String shuffleOffContentDescription;
    private final android.graphics.drawable.Drawable shuffleOnButtonDrawable;
    private final java.lang.String shuffleOnContentDescription;
    private final androidx.media3.ui.TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final java.lang.Runnable updateProgressAction;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.media3.ui.LegacyPlayerControlView.VisibilityListener> visibilityListeners;
    private final android.view.View vrButton;
    private final androidx.media3.common.Timeline.Window window;

    public interface ProgressUpdateListener {
        void onProgressUpdate(long j, long j2);
    }

    public interface VisibilityListener {
        void onVisibilityChange(int i);
    }

    private static boolean isHandledMediaKey(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    static {
        androidx.media3.common.MediaLibraryInfo.registerModule("media3.ui");
    }

    public LegacyPlayerControlView(android.content.Context context) {
        this(context, null);
    }

    public LegacyPlayerControlView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LegacyPlayerControlView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public LegacyPlayerControlView(android.content.Context context, android.util.AttributeSet attributeSet, int i, android.util.AttributeSet attributeSet2) {
        super(context, attributeSet, i);
        int resourceId = androidx.media3.ui.R.layout.exo_legacy_player_control_view;
        this.showPlayButtonIfSuppressed = true;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        this.hideAtMs = androidx.media3.common.C.TIME_UNSET;
        this.showRewindButton = true;
        this.showFastForwardButton = true;
        this.showPreviousButton = true;
        this.showNextButton = true;
        this.showShuffleButton = false;
        if (attributeSet2 != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, androidx.media3.ui.R.styleable.LegacyPlayerControlView, i, 0);
            try {
                this.showTimeoutMs = typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.LegacyPlayerControlView_show_timeout, this.showTimeoutMs);
                resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.LegacyPlayerControlView_controller_layout_id, resourceId);
                this.repeatToggleModes = getRepeatToggleModes(typedArrayObtainStyledAttributes, this.repeatToggleModes);
                this.showRewindButton = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.LegacyPlayerControlView_show_rewind_button, this.showRewindButton);
                this.showFastForwardButton = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.LegacyPlayerControlView_show_fastforward_button, this.showFastForwardButton);
                this.showPreviousButton = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.LegacyPlayerControlView_show_previous_button, this.showPreviousButton);
                this.showNextButton = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.LegacyPlayerControlView_show_next_button, this.showNextButton);
                this.showShuffleButton = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.LegacyPlayerControlView_show_shuffle_button, this.showShuffleButton);
                setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.LegacyPlayerControlView_time_bar_min_update_interval, this.timeBarMinUpdateIntervalMs));
                typedArrayObtainStyledAttributes.recycle();
            } catch (java.lang.Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        }
        this.visibilityListeners = new java.util.concurrent.CopyOnWriteArrayList<>();
        this.period = new androidx.media3.common.Timeline.Period();
        this.window = new androidx.media3.common.Timeline.Window();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        this.formatBuilder = sb;
        this.formatter = new java.util.Formatter(sb, java.util.Locale.getDefault());
        this.adGroupTimesMs = new long[0];
        this.playedAdGroups = new boolean[0];
        this.extraAdGroupTimesMs = new long[0];
        this.extraPlayedAdGroups = new boolean[0];
        androidx.media3.ui.LegacyPlayerControlView.ComponentListener componentListener = new androidx.media3.ui.LegacyPlayerControlView.ComponentListener();
        this.componentListener = componentListener;
        this.updateProgressAction = new java.lang.Runnable() { // from class: androidx.media3.ui.LegacyPlayerControlView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.updateProgress();
            }
        };
        this.hideAction = new java.lang.Runnable() { // from class: androidx.media3.ui.LegacyPlayerControlView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.hide();
            }
        };
        android.view.LayoutInflater.from(context).inflate(resourceId, this);
        setDescendantFocusability(262144);
        androidx.media3.ui.TimeBar timeBar = (androidx.media3.ui.TimeBar) findViewById(androidx.media3.ui.R.id.exo_progress);
        android.view.View viewFindViewById = findViewById(androidx.media3.ui.R.id.exo_progress_placeholder);
        if (timeBar != null) {
            this.timeBar = timeBar;
        } else if (viewFindViewById != null) {
            androidx.media3.ui.DefaultTimeBar defaultTimeBar = new androidx.media3.ui.DefaultTimeBar(context, null, 0, attributeSet2);
            defaultTimeBar.setId(androidx.media3.ui.R.id.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById.getLayoutParams());
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
            viewGroup.removeView(viewFindViewById);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            this.timeBar = defaultTimeBar;
        } else {
            this.timeBar = null;
        }
        this.durationView = (android.widget.TextView) findViewById(androidx.media3.ui.R.id.exo_duration);
        this.positionView = (android.widget.TextView) findViewById(androidx.media3.ui.R.id.exo_position);
        androidx.media3.ui.TimeBar timeBar2 = this.timeBar;
        if (timeBar2 != null) {
            timeBar2.addListener(componentListener);
        }
        android.view.View viewFindViewById2 = findViewById(androidx.media3.ui.R.id.exo_play);
        this.playButton = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(componentListener);
        }
        android.view.View viewFindViewById3 = findViewById(androidx.media3.ui.R.id.exo_pause);
        this.pauseButton = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(componentListener);
        }
        android.view.View viewFindViewById4 = findViewById(androidx.media3.ui.R.id.exo_prev);
        this.previousButton = viewFindViewById4;
        if (viewFindViewById4 != null) {
            viewFindViewById4.setOnClickListener(componentListener);
        }
        android.view.View viewFindViewById5 = findViewById(androidx.media3.ui.R.id.exo_next);
        this.nextButton = viewFindViewById5;
        if (viewFindViewById5 != null) {
            viewFindViewById5.setOnClickListener(componentListener);
        }
        android.view.View viewFindViewById6 = findViewById(androidx.media3.ui.R.id.exo_rew);
        this.rewindButton = viewFindViewById6;
        if (viewFindViewById6 != null) {
            viewFindViewById6.setOnClickListener(componentListener);
        }
        android.view.View viewFindViewById7 = findViewById(androidx.media3.ui.R.id.exo_ffwd);
        this.fastForwardButton = viewFindViewById7;
        if (viewFindViewById7 != null) {
            viewFindViewById7.setOnClickListener(componentListener);
        }
        android.widget.ImageView imageView = (android.widget.ImageView) findViewById(androidx.media3.ui.R.id.exo_repeat_toggle);
        this.repeatToggleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) findViewById(androidx.media3.ui.R.id.exo_shuffle);
        this.shuffleButton = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(componentListener);
        }
        android.view.View viewFindViewById8 = findViewById(androidx.media3.ui.R.id.exo_vr);
        this.vrButton = viewFindViewById8;
        setShowVrButton(false);
        updateButton(false, false, viewFindViewById8);
        android.content.res.Resources resources = context.getResources();
        this.buttonAlphaEnabled = resources.getInteger(androidx.media3.ui.R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        this.buttonAlphaDisabled = resources.getInteger(androidx.media3.ui.R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        this.repeatOffButtonDrawable = androidx.media3.common.util.Util.getDrawable(context, resources, androidx.media3.ui.R.drawable.exo_legacy_controls_repeat_off);
        this.repeatOneButtonDrawable = androidx.media3.common.util.Util.getDrawable(context, resources, androidx.media3.ui.R.drawable.exo_legacy_controls_repeat_one);
        this.repeatAllButtonDrawable = androidx.media3.common.util.Util.getDrawable(context, resources, androidx.media3.ui.R.drawable.exo_legacy_controls_repeat_all);
        this.shuffleOnButtonDrawable = androidx.media3.common.util.Util.getDrawable(context, resources, androidx.media3.ui.R.drawable.exo_legacy_controls_shuffle_on);
        this.shuffleOffButtonDrawable = androidx.media3.common.util.Util.getDrawable(context, resources, androidx.media3.ui.R.drawable.exo_legacy_controls_shuffle_off);
        this.repeatOffButtonContentDescription = resources.getString(androidx.media3.ui.R.string.exo_controls_repeat_off_description);
        this.repeatOneButtonContentDescription = resources.getString(androidx.media3.ui.R.string.exo_controls_repeat_one_description);
        this.repeatAllButtonContentDescription = resources.getString(androidx.media3.ui.R.string.exo_controls_repeat_all_description);
        this.shuffleOnContentDescription = resources.getString(androidx.media3.ui.R.string.exo_controls_shuffle_on_description);
        this.shuffleOffContentDescription = resources.getString(androidx.media3.ui.R.string.exo_controls_shuffle_off_description);
        this.currentPosition = androidx.media3.common.C.TIME_UNSET;
        this.currentBufferedPosition = androidx.media3.common.C.TIME_UNSET;
    }

    public androidx.media3.common.Player getPlayer() {
        return this.player;
    }

    public void setPlayer(androidx.media3.common.Player player) {
        boolean z = true;
        androidx.media3.common.util.Assertions.checkState(android.os.Looper.myLooper() == android.os.Looper.getMainLooper());
        if (player != null && player.getApplicationLooper() != android.os.Looper.getMainLooper()) {
            z = false;
        }
        androidx.media3.common.util.Assertions.checkArgument(z);
        androidx.media3.common.Player player2 = this.player;
        if (player2 == player) {
            return;
        }
        if (player2 != null) {
            player2.removeListener(this.componentListener);
        }
        this.player = player;
        if (player != null) {
            player.addListener(this.componentListener);
        }
        updateAll();
    }

    @java.lang.Deprecated
    public void setShowMultiWindowTimeBar(boolean z) {
        this.showMultiWindowTimeBar = z;
        updateTimeline();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z) {
        this.showPlayButtonIfSuppressed = z;
        updatePlayPauseButton();
    }

    public void setExtraAdGroupMarkers(long[] jArr, boolean[] zArr) {
        if (jArr == null) {
            this.extraAdGroupTimesMs = new long[0];
            this.extraPlayedAdGroups = new boolean[0];
        } else {
            boolean[] zArr2 = (boolean[]) androidx.media3.common.util.Assertions.checkNotNull(zArr);
            androidx.media3.common.util.Assertions.checkArgument(jArr.length == zArr2.length);
            this.extraAdGroupTimesMs = jArr;
            this.extraPlayedAdGroups = zArr2;
        }
        updateTimeline();
    }

    public void addVisibilityListener(androidx.media3.ui.LegacyPlayerControlView.VisibilityListener visibilityListener) {
        androidx.media3.common.util.Assertions.checkNotNull(visibilityListener);
        this.visibilityListeners.add(visibilityListener);
    }

    public void removeVisibilityListener(androidx.media3.ui.LegacyPlayerControlView.VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    public void setProgressUpdateListener(androidx.media3.ui.LegacyPlayerControlView.ProgressUpdateListener progressUpdateListener) {
        this.progressUpdateListener = progressUpdateListener;
    }

    public void setShowRewindButton(boolean z) {
        this.showRewindButton = z;
        updateNavigation();
    }

    public void setShowFastForwardButton(boolean z) {
        this.showFastForwardButton = z;
        updateNavigation();
    }

    public void setShowPreviousButton(boolean z) {
        this.showPreviousButton = z;
        updateNavigation();
    }

    public void setShowNextButton(boolean z) {
        this.showNextButton = z;
        updateNavigation();
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isVisible()) {
            hideAfterTimeout();
        }
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public void setRepeatToggleModes(int i) {
        this.repeatToggleModes = i;
        androidx.media3.common.Player player = this.player;
        if (player != null) {
            int repeatMode = player.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.player.setRepeatMode(0);
            } else if (i == 1 && repeatMode == 2) {
                this.player.setRepeatMode(1);
            } else if (i == 2 && repeatMode == 1) {
                this.player.setRepeatMode(2);
            }
        }
        updateRepeatModeButton();
    }

    public boolean getShowShuffleButton() {
        return this.showShuffleButton;
    }

    public void setShowShuffleButton(boolean z) {
        this.showShuffleButton = z;
        updateShuffleButton();
    }

    public boolean getShowVrButton() {
        android.view.View view = this.vrButton;
        return view != null && view.getVisibility() == 0;
    }

    public void setShowVrButton(boolean z) {
        android.view.View view = this.vrButton;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void setVrButtonListener(android.view.View.OnClickListener onClickListener) {
        android.view.View view = this.vrButton;
        if (view != null) {
            view.setOnClickListener(onClickListener);
            updateButton(getShowVrButton(), onClickListener != null, this.vrButton);
        }
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.timeBarMinUpdateIntervalMs = androidx.media3.common.util.Util.constrainValue(i, 16, 1000);
    }

    public void show() {
        if (!isVisible()) {
            setVisibility(0);
            java.util.Iterator<androidx.media3.ui.LegacyPlayerControlView.VisibilityListener> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            updateAll();
            requestPlayPauseFocus();
            requestPlayPauseAccessibilityFocus();
        }
        hideAfterTimeout();
    }

    public void hide() {
        if (isVisible()) {
            setVisibility(8);
            java.util.Iterator<androidx.media3.ui.LegacyPlayerControlView.VisibilityListener> it = this.visibilityListeners.iterator();
            while (it.hasNext()) {
                it.next().onVisibilityChange(getVisibility());
            }
            removeCallbacks(this.updateProgressAction);
            removeCallbacks(this.hideAction);
            this.hideAtMs = androidx.media3.common.C.TIME_UNSET;
        }
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    private void hideAfterTimeout() {
        removeCallbacks(this.hideAction);
        if (this.showTimeoutMs > 0) {
            long jUptimeMillis = android.os.SystemClock.uptimeMillis();
            int i = this.showTimeoutMs;
            this.hideAtMs = jUptimeMillis + ((long) i);
            if (this.isAttachedToWindow) {
                postDelayed(this.hideAction, i);
                return;
            }
            return;
        }
        this.hideAtMs = androidx.media3.common.C.TIME_UNSET;
    }

    private void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTimeline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayPauseButton() {
        boolean z;
        boolean z2;
        boolean z3;
        if (isVisible() && this.isAttachedToWindow) {
            boolean zShouldShowPlayButton = androidx.media3.common.util.Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
            android.view.View view = this.playButton;
            boolean z4 = true;
            if (view != null) {
                z = (!zShouldShowPlayButton && view.isFocused()) | false;
                if (androidx.media3.common.util.Util.SDK_INT < 21) {
                    z3 = z;
                } else {
                    z3 = !zShouldShowPlayButton && androidx.media3.ui.LegacyPlayerControlView.Api21.isAccessibilityFocused(this.playButton);
                }
                z2 = z3 | false;
                this.playButton.setVisibility(zShouldShowPlayButton ? 0 : 8);
            } else {
                z = false;
                z2 = false;
            }
            android.view.View view2 = this.pauseButton;
            if (view2 != null) {
                z |= zShouldShowPlayButton && view2.isFocused();
                if (androidx.media3.common.util.Util.SDK_INT < 21) {
                    z4 = z;
                } else if (!zShouldShowPlayButton || !androidx.media3.ui.LegacyPlayerControlView.Api21.isAccessibilityFocused(this.pauseButton)) {
                    z4 = false;
                }
                z2 |= z4;
                this.pauseButton.setVisibility(zShouldShowPlayButton ? 8 : 0);
            }
            if (z) {
                requestPlayPauseFocus();
            }
            if (z2) {
                requestPlayPauseAccessibilityFocus();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateNavigation() {
        boolean zIsCommandAvailable;
        boolean zIsCommandAvailable2;
        boolean zIsCommandAvailable3;
        boolean zIsCommandAvailable4;
        boolean zIsCommandAvailable5;
        if (isVisible() && this.isAttachedToWindow) {
            androidx.media3.common.Player player = this.player;
            if (player != null) {
                zIsCommandAvailable = player.isCommandAvailable(5);
                zIsCommandAvailable3 = player.isCommandAvailable(7);
                zIsCommandAvailable4 = player.isCommandAvailable(11);
                zIsCommandAvailable5 = player.isCommandAvailable(12);
                zIsCommandAvailable2 = player.isCommandAvailable(9);
            } else {
                zIsCommandAvailable = false;
                zIsCommandAvailable2 = false;
                zIsCommandAvailable3 = false;
                zIsCommandAvailable4 = false;
                zIsCommandAvailable5 = false;
            }
            updateButton(this.showPreviousButton, zIsCommandAvailable3, this.previousButton);
            updateButton(this.showRewindButton, zIsCommandAvailable4, this.rewindButton);
            updateButton(this.showFastForwardButton, zIsCommandAvailable5, this.fastForwardButton);
            updateButton(this.showNextButton, zIsCommandAvailable2, this.nextButton);
            androidx.media3.ui.TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(zIsCommandAvailable);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRepeatModeButton() {
        android.widget.ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, false, imageView);
                return;
            }
            androidx.media3.common.Player player = this.player;
            if (player == null) {
                updateButton(true, false, imageView);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, true, imageView);
            int repeatMode = player.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
            } else if (repeatMode == 1) {
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
            } else if (repeatMode == 2) {
                this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
            }
            this.repeatToggleButton.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        android.widget.ImageView imageView;
        java.lang.String str;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            androidx.media3.common.Player player = this.player;
            if (!this.showShuffleButton) {
                updateButton(false, false, imageView);
                return;
            }
            if (player == null) {
                updateButton(true, false, imageView);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
                return;
            }
            updateButton(true, true, imageView);
            this.shuffleButton.setImageDrawable(player.getShuffleModeEnabled() ? this.shuffleOnButtonDrawable : this.shuffleOffButtonDrawable);
            android.widget.ImageView imageView2 = this.shuffleButton;
            if (player.getShuffleModeEnabled()) {
                str = this.shuffleOnContentDescription;
            } else {
                str = this.shuffleOffContentDescription;
            }
            imageView2.setContentDescription(str);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:40:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:42:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00dc A[SYNTHETIC] */
    public void updateTimeline() {
        long j;
        int i;
        long positionInWindowUs;
        long[] jArr;
        int length;
        androidx.media3.common.Player player = this.player;
        if (player == null) {
            return;
        }
        boolean z = true;
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player.getCurrentTimeline(), this.window);
        this.currentWindowOffset = 0L;
        androidx.media3.common.Timeline currentTimeline = player.getCurrentTimeline();
        if (currentTimeline.isEmpty()) {
            j = 0;
            i = 0;
        } else {
            int currentMediaItemIndex = player.getCurrentMediaItemIndex();
            boolean z2 = this.multiWindowTimeBar;
            int i2 = z2 ? 0 : currentMediaItemIndex;
            int windowCount = z2 ? currentTimeline.getWindowCount() - 1 : currentMediaItemIndex;
            long j2 = 0;
            i = 0;
            while (i2 <= windowCount) {
                if (i2 == currentMediaItemIndex) {
                    this.currentWindowOffset = androidx.media3.common.util.Util.usToMs(j2);
                }
                currentTimeline.getWindow(i2, this.window);
                if (this.window.durationUs == androidx.media3.common.C.TIME_UNSET) {
                    androidx.media3.common.util.Assertions.checkState(this.multiWindowTimeBar ^ z);
                    break;
                }
                for (int i3 = this.window.firstPeriodIndex; i3 <= this.window.lastPeriodIndex; i3++) {
                    currentTimeline.getPeriod(i3, this.period);
                    int adGroupCount = this.period.getAdGroupCount();
                    for (int removedAdGroupCount = this.period.getRemovedAdGroupCount(); removedAdGroupCount < adGroupCount; removedAdGroupCount++) {
                        long adGroupTimeUs = this.period.getAdGroupTimeUs(removedAdGroupCount);
                        if (adGroupTimeUs != Long.MIN_VALUE) {
                            positionInWindowUs = adGroupTimeUs + this.period.getPositionInWindowUs();
                            if (positionInWindowUs >= 0) {
                                jArr = this.adGroupTimesMs;
                                if (i == jArr.length) {
                                    if (jArr.length == 0) {
                                        length = 1;
                                    } else {
                                        length = jArr.length * 2;
                                    }
                                    this.adGroupTimesMs = java.util.Arrays.copyOf(jArr, length);
                                    this.playedAdGroups = java.util.Arrays.copyOf(this.playedAdGroups, length);
                                }
                                this.adGroupTimesMs[i] = androidx.media3.common.util.Util.usToMs(j2 + positionInWindowUs);
                                this.playedAdGroups[i] = this.period.hasPlayedAdGroup(removedAdGroupCount);
                                i++;
                            }
                        } else if (this.period.durationUs != androidx.media3.common.C.TIME_UNSET) {
                            adGroupTimeUs = this.period.durationUs;
                            positionInWindowUs = adGroupTimeUs + this.period.getPositionInWindowUs();
                            if (positionInWindowUs >= 0) {
                                jArr = this.adGroupTimesMs;
                                if (i == jArr.length) {
                                    if (jArr.length == 0) {
                                        length = 1;
                                    } else {
                                        length = jArr.length * 2;
                                    }
                                    this.adGroupTimesMs = java.util.Arrays.copyOf(jArr, length);
                                    this.playedAdGroups = java.util.Arrays.copyOf(this.playedAdGroups, length);
                                }
                                this.adGroupTimesMs[i] = androidx.media3.common.util.Util.usToMs(j2 + positionInWindowUs);
                                this.playedAdGroups[i] = this.period.hasPlayedAdGroup(removedAdGroupCount);
                                i++;
                            }
                        }
                    }
                }
                j2 += this.window.durationUs;
                i2++;
                z = true;
            }
            j = j2;
        }
        long jUsToMs = androidx.media3.common.util.Util.usToMs(j);
        android.widget.TextView textView = this.durationView;
        if (textView != null) {
            textView.setText(androidx.media3.common.util.Util.getStringForTime(this.formatBuilder, this.formatter, jUsToMs));
        }
        androidx.media3.ui.TimeBar timeBar = this.timeBar;
        if (timeBar != null) {
            timeBar.setDuration(jUsToMs);
            int length2 = this.extraAdGroupTimesMs.length;
            int i4 = i + length2;
            long[] jArr2 = this.adGroupTimesMs;
            if (i4 > jArr2.length) {
                this.adGroupTimesMs = java.util.Arrays.copyOf(jArr2, i4);
                this.playedAdGroups = java.util.Arrays.copyOf(this.playedAdGroups, i4);
            }
            java.lang.System.arraycopy(this.extraAdGroupTimesMs, 0, this.adGroupTimesMs, i, length2);
            java.lang.System.arraycopy(this.extraPlayedAdGroups, 0, this.playedAdGroups, i, length2);
            this.timeBar.setAdGroupTimesMs(this.adGroupTimesMs, this.playedAdGroups, i4);
        }
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateProgress() {
        long contentPosition;
        long contentBufferedPosition;
        if (isVisible() && this.isAttachedToWindow) {
            androidx.media3.common.Player player = this.player;
            if (player != null) {
                contentPosition = this.currentWindowOffset + player.getContentPosition();
                contentBufferedPosition = this.currentWindowOffset + player.getContentBufferedPosition();
            } else {
                contentPosition = 0;
                contentBufferedPosition = 0;
            }
            boolean z = contentPosition != this.currentPosition;
            boolean z2 = contentBufferedPosition != this.currentBufferedPosition;
            this.currentPosition = contentPosition;
            this.currentBufferedPosition = contentBufferedPosition;
            android.widget.TextView textView = this.positionView;
            if (textView != null && !this.scrubbing && z) {
                textView.setText(androidx.media3.common.util.Util.getStringForTime(this.formatBuilder, this.formatter, contentPosition));
            }
            androidx.media3.ui.TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(contentPosition);
                this.timeBar.setBufferedPosition(contentBufferedPosition);
            }
            androidx.media3.ui.LegacyPlayerControlView.ProgressUpdateListener progressUpdateListener = this.progressUpdateListener;
            if (progressUpdateListener != null && (z || z2)) {
                progressUpdateListener.onProgressUpdate(contentPosition, contentBufferedPosition);
            }
            removeCallbacks(this.updateProgressAction);
            int playbackState = player == null ? 1 : player.getPlaybackState();
            if (player == null || !player.isPlaying()) {
                if (playbackState == 4 || playbackState == 1) {
                    return;
                }
                postDelayed(this.updateProgressAction, 1000L);
                return;
            }
            androidx.media3.ui.TimeBar timeBar2 = this.timeBar;
            long jMin = java.lang.Math.min(timeBar2 != null ? timeBar2.getPreferredUpdateDelay() : 1000L, 1000 - (contentPosition % 1000));
            float f = player.getPlaybackParameters().speed;
            postDelayed(this.updateProgressAction, androidx.media3.common.util.Util.constrainValue(f > 0.0f ? (long) (jMin / f) : 1000L, this.timeBarMinUpdateIntervalMs, 1000L));
        }
    }

    private void requestPlayPauseFocus() {
        android.view.View view;
        android.view.View view2;
        boolean zShouldShowPlayButton = androidx.media3.common.util.Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
        if (zShouldShowPlayButton && (view2 = this.playButton) != null) {
            view2.requestFocus();
        } else {
            if (zShouldShowPlayButton || (view = this.pauseButton) == null) {
                return;
            }
            view.requestFocus();
        }
    }

    private void requestPlayPauseAccessibilityFocus() {
        android.view.View view;
        android.view.View view2;
        boolean zShouldShowPlayButton = androidx.media3.common.util.Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
        if (zShouldShowPlayButton && (view2 = this.playButton) != null) {
            view2.sendAccessibilityEvent(8);
        } else {
            if (zShouldShowPlayButton || (view = this.pauseButton) == null) {
                return;
            }
            view.sendAccessibilityEvent(8);
        }
    }

    private void updateButton(boolean z, boolean z2, android.view.View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z2);
        view.setAlpha(z2 ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
        view.setVisibility(z ? 0 : 8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToTimeBarPosition(androidx.media3.common.Player player, long j) {
        int currentMediaItemIndex;
        androidx.media3.common.Timeline currentTimeline = player.getCurrentTimeline();
        if (this.multiWindowTimeBar && !currentTimeline.isEmpty()) {
            int windowCount = currentTimeline.getWindowCount();
            currentMediaItemIndex = 0;
            while (true) {
                long durationMs = currentTimeline.getWindow(currentMediaItemIndex, this.window).getDurationMs();
                if (j < durationMs) {
                    break;
                }
                if (currentMediaItemIndex == windowCount - 1) {
                    j = durationMs;
                    break;
                } else {
                    j -= durationMs;
                    currentMediaItemIndex++;
                }
            }
        } else {
            currentMediaItemIndex = player.getCurrentMediaItemIndex();
        }
        seekTo(player, currentMediaItemIndex, j);
        updateProgress();
    }

    private void seekTo(androidx.media3.common.Player player, int i, long j) {
        player.seekTo(i, j);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.isAttachedToWindow = true;
        long j = this.hideAtMs;
        if (j != androidx.media3.common.C.TIME_UNSET) {
            long jUptimeMillis = j - android.os.SystemClock.uptimeMillis();
            if (jUptimeMillis <= 0) {
                hide();
            } else {
                postDelayed(this.hideAction, jUptimeMillis);
            }
        } else if (isVisible()) {
            hideAfterTimeout();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        removeCallbacks(this.hideAction);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            removeCallbacks(this.hideAction);
        } else if (motionEvent.getAction() == 1) {
            hideAfterTimeout();
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(android.view.KeyEvent keyEvent) {
        return dispatchMediaKeyEvent(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean dispatchMediaKeyEvent(android.view.KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        androidx.media3.common.Player player = this.player;
        if (player == null || !isHandledMediaKey(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (player.getPlaybackState() == 4) {
                return true;
            }
            player.seekForward();
            return true;
        }
        if (keyCode == 89) {
            player.seekBack();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            androidx.media3.common.util.Util.handlePlayPauseButtonAction(player, this.showPlayButtonIfSuppressed);
            return true;
        }
        if (keyCode == 87) {
            player.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            player.seekToPrevious();
            return true;
        }
        if (keyCode == 126) {
            androidx.media3.common.util.Util.handlePlayButtonAction(player);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        androidx.media3.common.util.Util.handlePauseButtonAction(player);
        return true;
    }

    private static boolean canShowMultiWindowTimeBar(androidx.media3.common.Timeline timeline, androidx.media3.common.Timeline.Window window) {
        if (timeline.getWindowCount() > 100) {
            return false;
        }
        int windowCount = timeline.getWindowCount();
        for (int i = 0; i < windowCount; i++) {
            if (timeline.getWindow(i, window).durationUs == androidx.media3.common.C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    private static int getRepeatToggleModes(android.content.res.TypedArray typedArray, int i) {
        return typedArray.getInt(androidx.media3.ui.R.styleable.LegacyPlayerControlView_repeat_toggle_modes, i);
    }

    private final class ComponentListener implements androidx.media3.common.Player.Listener, androidx.media3.ui.TimeBar.OnScrubListener, android.view.View.OnClickListener {
        private ComponentListener() {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(androidx.media3.common.Player player, androidx.media3.common.Player.Events events) {
            if (events.containsAny(4, 5)) {
                androidx.media3.ui.LegacyPlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(4, 5, 7)) {
                androidx.media3.ui.LegacyPlayerControlView.this.updateProgress();
            }
            if (events.contains(8)) {
                androidx.media3.ui.LegacyPlayerControlView.this.updateRepeatModeButton();
            }
            if (events.contains(9)) {
                androidx.media3.ui.LegacyPlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(8, 9, 11, 0, 13)) {
                androidx.media3.ui.LegacyPlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(11, 0)) {
                androidx.media3.ui.LegacyPlayerControlView.this.updateTimeline();
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStart(androidx.media3.ui.TimeBar timeBar, long j) {
            androidx.media3.ui.LegacyPlayerControlView.this.scrubbing = true;
            if (androidx.media3.ui.LegacyPlayerControlView.this.positionView != null) {
                androidx.media3.ui.LegacyPlayerControlView.this.positionView.setText(androidx.media3.common.util.Util.getStringForTime(androidx.media3.ui.LegacyPlayerControlView.this.formatBuilder, androidx.media3.ui.LegacyPlayerControlView.this.formatter, j));
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubMove(androidx.media3.ui.TimeBar timeBar, long j) {
            if (androidx.media3.ui.LegacyPlayerControlView.this.positionView != null) {
                androidx.media3.ui.LegacyPlayerControlView.this.positionView.setText(androidx.media3.common.util.Util.getStringForTime(androidx.media3.ui.LegacyPlayerControlView.this.formatBuilder, androidx.media3.ui.LegacyPlayerControlView.this.formatter, j));
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStop(androidx.media3.ui.TimeBar timeBar, long j, boolean z) {
            androidx.media3.ui.LegacyPlayerControlView.this.scrubbing = false;
            if (z || androidx.media3.ui.LegacyPlayerControlView.this.player == null) {
                return;
            }
            androidx.media3.ui.LegacyPlayerControlView legacyPlayerControlView = androidx.media3.ui.LegacyPlayerControlView.this;
            legacyPlayerControlView.seekToTimeBarPosition(legacyPlayerControlView.player, j);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            androidx.media3.common.Player player = androidx.media3.ui.LegacyPlayerControlView.this.player;
            if (player == null) {
                return;
            }
            if (androidx.media3.ui.LegacyPlayerControlView.this.nextButton != view) {
                if (androidx.media3.ui.LegacyPlayerControlView.this.previousButton != view) {
                    if (androidx.media3.ui.LegacyPlayerControlView.this.fastForwardButton != view) {
                        if (androidx.media3.ui.LegacyPlayerControlView.this.rewindButton != view) {
                            if (androidx.media3.ui.LegacyPlayerControlView.this.playButton != view) {
                                if (androidx.media3.ui.LegacyPlayerControlView.this.pauseButton != view) {
                                    if (androidx.media3.ui.LegacyPlayerControlView.this.repeatToggleButton != view) {
                                        if (androidx.media3.ui.LegacyPlayerControlView.this.shuffleButton == view) {
                                            player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
                                            return;
                                        }
                                        return;
                                    }
                                    player.setRepeatMode(androidx.media3.common.util.RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), androidx.media3.ui.LegacyPlayerControlView.this.repeatToggleModes));
                                    return;
                                }
                                androidx.media3.common.util.Util.handlePauseButtonAction(player);
                                return;
                            }
                            androidx.media3.common.util.Util.handlePlayButtonAction(player);
                            return;
                        }
                        player.seekBack();
                        return;
                    }
                    if (player.getPlaybackState() != 4) {
                        player.seekForward();
                        return;
                    }
                    return;
                }
                player.seekToPrevious();
                return;
            }
            player.seekToNext();
        }
    }

    private static final class Api21 {
        private Api21() {
        }

        public static boolean isAccessibilityFocused(android.view.View view) {
            return view.isAccessibilityFocused();
        }
    }
}
