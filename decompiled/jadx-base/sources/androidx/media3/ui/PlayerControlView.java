package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
public class PlayerControlView extends android.widget.FrameLayout {
    public static final int DEFAULT_REPEAT_TOGGLE_MODES = 0;
    public static final int DEFAULT_SHOW_TIMEOUT_MS = 5000;
    public static final int DEFAULT_TIME_BAR_MIN_UPDATE_INTERVAL_MS = 200;
    private static final int MAX_UPDATE_INTERVAL_MS = 1000;
    public static final int MAX_WINDOWS_FOR_MULTI_WINDOW_TIME_BAR = 100;
    private static final float[] PLAYBACK_SPEEDS;
    private static final int SETTINGS_AUDIO_TRACK_SELECTION_POSITION = 1;
    private static final int SETTINGS_PLAYBACK_SPEED_POSITION = 0;
    private long[] adGroupTimesMs;
    private final android.view.View audioTrackButton;
    private final androidx.media3.ui.PlayerControlView.AudioTrackSelectionAdapter audioTrackSelectionAdapter;
    private final float buttonAlphaDisabled;
    private final float buttonAlphaEnabled;
    private final androidx.media3.ui.PlayerControlView.ComponentListener componentListener;
    private final androidx.media3.ui.PlayerControlViewLayoutManager controlViewLayoutManager;
    private long currentWindowOffset;
    private final android.widget.TextView durationView;
    private long[] extraAdGroupTimesMs;
    private boolean[] extraPlayedAdGroups;
    private final android.view.View fastForwardButton;
    private final android.widget.TextView fastForwardButtonTextView;
    private final java.lang.StringBuilder formatBuilder;
    private final java.util.Formatter formatter;
    private final android.widget.ImageView fullScreenButton;
    private final java.lang.String fullScreenEnterContentDescription;
    private final android.graphics.drawable.Drawable fullScreenEnterDrawable;
    private final java.lang.String fullScreenExitContentDescription;
    private final android.graphics.drawable.Drawable fullScreenExitDrawable;
    private boolean isAttachedToWindow;
    private boolean isFullScreen;
    private final android.widget.ImageView minimalFullScreenButton;
    private boolean multiWindowTimeBar;
    private boolean needToHideBars;
    private final android.widget.ImageView nextButton;
    private androidx.media3.ui.PlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener;
    private final android.graphics.drawable.Drawable pauseButtonDrawable;
    private final androidx.media3.common.Timeline.Period period;
    private final android.graphics.drawable.Drawable playButtonDrawable;
    private final android.widget.ImageView playPauseButton;
    private final androidx.media3.ui.PlayerControlView.PlaybackSpeedAdapter playbackSpeedAdapter;
    private final android.view.View playbackSpeedButton;
    private boolean[] playedAdGroups;
    private androidx.media3.common.Player player;
    private final android.widget.TextView positionView;
    private final android.widget.ImageView previousButton;
    private androidx.media3.ui.PlayerControlView.ProgressUpdateListener progressUpdateListener;
    private final java.lang.String repeatAllButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatAllButtonDrawable;
    private final java.lang.String repeatOffButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatOffButtonDrawable;
    private final java.lang.String repeatOneButtonContentDescription;
    private final android.graphics.drawable.Drawable repeatOneButtonDrawable;
    private final android.widget.ImageView repeatToggleButton;
    private int repeatToggleModes;
    private final android.content.res.Resources resources;
    private final android.view.View rewindButton;
    private final android.widget.TextView rewindButtonTextView;
    private boolean scrubbing;
    private final androidx.media3.ui.PlayerControlView.SettingsAdapter settingsAdapter;
    private final android.view.View settingsButton;
    private final androidx.recyclerview.widget.RecyclerView settingsView;
    private final android.widget.PopupWindow settingsWindow;
    private final int settingsWindowMargin;
    private boolean showMultiWindowTimeBar;
    private boolean showPlayButtonIfSuppressed;
    private int showTimeoutMs;
    private final android.widget.ImageView shuffleButton;
    private final android.graphics.drawable.Drawable shuffleOffButtonDrawable;
    private final java.lang.String shuffleOffContentDescription;
    private final android.graphics.drawable.Drawable shuffleOnButtonDrawable;
    private final java.lang.String shuffleOnContentDescription;
    private final android.widget.ImageView subtitleButton;
    private final android.graphics.drawable.Drawable subtitleOffButtonDrawable;
    private final java.lang.String subtitleOffContentDescription;
    private final android.graphics.drawable.Drawable subtitleOnButtonDrawable;
    private final java.lang.String subtitleOnContentDescription;
    private final androidx.media3.ui.PlayerControlView.TextTrackSelectionAdapter textTrackSelectionAdapter;
    private final androidx.media3.ui.TimeBar timeBar;
    private int timeBarMinUpdateIntervalMs;
    private final androidx.media3.ui.TrackNameProvider trackNameProvider;
    private final java.lang.Runnable updateProgressAction;
    private final java.util.concurrent.CopyOnWriteArrayList<androidx.media3.ui.PlayerControlView.VisibilityListener> visibilityListeners;
    private final android.widget.ImageView vrButton;
    private final androidx.media3.common.Timeline.Window window;

    @java.lang.Deprecated
    public interface OnFullScreenModeChangedListener {
        void onFullScreenModeChanged(boolean z);
    }

    public interface ProgressUpdateListener {
        void onProgressUpdate(long j, long j2);
    }

    @java.lang.Deprecated
    public interface VisibilityListener {
        void onVisibilityChange(int i);
    }

    private static boolean isHandledMediaKey(int i) {
        return i == 90 || i == 89 || i == 85 || i == 79 || i == 126 || i == 127 || i == 87 || i == 88;
    }

    static {
        androidx.media3.common.MediaLibraryInfo.registerModule("media3.ui");
        PLAYBACK_SPEEDS = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public PlayerControlView(android.content.Context context) {
        this(context, null);
    }

    public PlayerControlView(android.content.Context context, android.util.AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PlayerControlView(android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, attributeSet);
    }

    public PlayerControlView(android.content.Context context, android.util.AttributeSet attributeSet, int i, android.util.AttributeSet attributeSet2) throws java.lang.Throwable {
        int i2;
        final androidx.media3.ui.PlayerControlView playerControlView;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        final androidx.media3.ui.PlayerControlView playerControlView2;
        int i19;
        boolean z9;
        boolean z10;
        super(context, attributeSet, i);
        int i20 = androidx.media3.ui.R.layout.exo_player_control_view;
        int i21 = androidx.media3.ui.R.drawable.exo_styled_controls_play;
        int i22 = androidx.media3.ui.R.drawable.exo_styled_controls_pause;
        int i23 = androidx.media3.ui.R.drawable.exo_styled_controls_next;
        int i24 = androidx.media3.ui.R.drawable.exo_styled_controls_simple_fastforward;
        int i25 = androidx.media3.ui.R.drawable.exo_styled_controls_previous;
        int i26 = androidx.media3.ui.R.drawable.exo_styled_controls_simple_rewind;
        int i27 = androidx.media3.ui.R.drawable.exo_styled_controls_fullscreen_exit;
        int i28 = androidx.media3.ui.R.drawable.exo_styled_controls_fullscreen_enter;
        int i29 = androidx.media3.ui.R.drawable.exo_styled_controls_repeat_off;
        int i30 = androidx.media3.ui.R.drawable.exo_styled_controls_repeat_one;
        int i31 = androidx.media3.ui.R.drawable.exo_styled_controls_repeat_all;
        int i32 = androidx.media3.ui.R.drawable.exo_styled_controls_shuffle_on;
        int i33 = androidx.media3.ui.R.drawable.exo_styled_controls_shuffle_off;
        int i34 = androidx.media3.ui.R.drawable.exo_styled_controls_subtitle_on;
        int i35 = androidx.media3.ui.R.drawable.exo_styled_controls_subtitle_off;
        int i36 = androidx.media3.ui.R.drawable.exo_styled_controls_vr;
        this.showPlayButtonIfSuppressed = true;
        this.showTimeoutMs = 5000;
        this.repeatToggleModes = 0;
        this.timeBarMinUpdateIntervalMs = 200;
        if (attributeSet2 != null) {
            android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, androidx.media3.ui.R.styleable.PlayerControlView, i, 0);
            try {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_controller_layout_id, i20);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_play_icon, i21);
                int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_pause_icon, i22);
                int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_next_icon, i23);
                int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_fastforward_icon, i24);
                int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_previous_icon, i25);
                int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_rewind_icon, i26);
                int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_fullscreen_exit_icon, i27);
                int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_fullscreen_enter_icon, i28);
                int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_repeat_off_icon, i29);
                int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_repeat_one_icon, i30);
                int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_repeat_all_icon, i31);
                int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_shuffle_on_icon, i32);
                int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_shuffle_off_icon, i33);
                int resourceId15 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_subtitle_on_icon, i34);
                int resourceId16 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_subtitle_off_icon, i35);
                int resourceId17 = typedArrayObtainStyledAttributes.getResourceId(androidx.media3.ui.R.styleable.PlayerControlView_vr_icon, i36);
                playerControlView = this;
                try {
                    playerControlView.showTimeoutMs = typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.PlayerControlView_show_timeout, playerControlView.showTimeoutMs);
                    playerControlView.repeatToggleModes = getRepeatToggleModes(typedArrayObtainStyledAttributes, playerControlView.repeatToggleModes);
                    boolean z11 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerControlView_show_rewind_button, true);
                    boolean z12 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerControlView_show_fastforward_button, true);
                    boolean z13 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerControlView_show_previous_button, true);
                    boolean z14 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerControlView_show_next_button, true);
                    boolean z15 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerControlView_show_shuffle_button, false);
                    boolean z16 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerControlView_show_subtitle_button, false);
                    boolean z17 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerControlView_show_vr_button, false);
                    playerControlView.setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(androidx.media3.ui.R.styleable.PlayerControlView_time_bar_min_update_interval, playerControlView.timeBarMinUpdateIntervalMs));
                    boolean z18 = typedArrayObtainStyledAttributes.getBoolean(androidx.media3.ui.R.styleable.PlayerControlView_animation_enabled, true);
                    typedArrayObtainStyledAttributes.recycle();
                    i18 = resourceId14;
                    i17 = resourceId;
                    z8 = z18;
                    i3 = resourceId6;
                    i4 = resourceId7;
                    i5 = resourceId8;
                    i6 = resourceId9;
                    i7 = resourceId10;
                    i8 = resourceId11;
                    i9 = resourceId12;
                    i10 = resourceId13;
                    i11 = resourceId15;
                    i12 = resourceId16;
                    i2 = resourceId17;
                    z = z11;
                    z2 = z12;
                    z3 = z13;
                    z4 = z14;
                    z5 = z15;
                    z6 = z16;
                    z7 = z17;
                    i13 = resourceId2;
                    i14 = resourceId3;
                    i15 = resourceId5;
                    i16 = resourceId4;
                } catch (java.lang.Throwable th) {
                    th = th;
                    typedArrayObtainStyledAttributes.recycle();
                    throw th;
                }
            } catch (java.lang.Throwable th2) {
                th = th2;
            }
        } else {
            i2 = i36;
            playerControlView = this;
            i3 = i25;
            i4 = i26;
            i5 = i27;
            i6 = i28;
            i7 = i29;
            i8 = i30;
            i9 = i31;
            i10 = i32;
            i11 = i34;
            i12 = i35;
            z = true;
            z2 = true;
            z3 = true;
            z4 = true;
            z5 = false;
            z6 = false;
            z7 = false;
            z8 = true;
            i13 = i21;
            i14 = i22;
            i15 = i24;
            i16 = i23;
            i17 = i20;
            i18 = i33;
        }
        android.view.LayoutInflater.from(context).inflate(i17, playerControlView);
        playerControlView.setDescendantFocusability(262144);
        androidx.media3.ui.PlayerControlView.ComponentListener componentListener = new androidx.media3.ui.PlayerControlView.ComponentListener();
        playerControlView.componentListener = componentListener;
        playerControlView.visibilityListeners = new java.util.concurrent.CopyOnWriteArrayList<>();
        playerControlView.period = new androidx.media3.common.Timeline.Period();
        playerControlView.window = new androidx.media3.common.Timeline.Window();
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        playerControlView.formatBuilder = sb;
        int i37 = i15;
        playerControlView.formatter = new java.util.Formatter(sb, java.util.Locale.getDefault());
        playerControlView.adGroupTimesMs = new long[0];
        playerControlView.playedAdGroups = new boolean[0];
        playerControlView.extraAdGroupTimesMs = new long[0];
        playerControlView.extraPlayedAdGroups = new boolean[0];
        playerControlView.updateProgressAction = new java.lang.Runnable() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.updateProgress();
            }
        };
        playerControlView.durationView = (android.widget.TextView) playerControlView.findViewById(androidx.media3.ui.R.id.exo_duration);
        playerControlView.positionView = (android.widget.TextView) playerControlView.findViewById(androidx.media3.ui.R.id.exo_position);
        android.widget.ImageView imageView = (android.widget.ImageView) playerControlView.findViewById(androidx.media3.ui.R.id.exo_subtitle);
        playerControlView.subtitleButton = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(componentListener);
        }
        android.widget.ImageView imageView2 = (android.widget.ImageView) playerControlView.findViewById(androidx.media3.ui.R.id.exo_fullscreen);
        playerControlView.fullScreenButton = imageView2;
        initializeFullScreenButton(imageView2, new android.view.View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.f$0.onFullScreenButtonClicked(view);
            }
        });
        android.widget.ImageView imageView3 = (android.widget.ImageView) playerControlView.findViewById(androidx.media3.ui.R.id.exo_minimal_fullscreen);
        playerControlView.minimalFullScreenButton = imageView3;
        initializeFullScreenButton(imageView3, new android.view.View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda1
            @Override // android.view.View.OnClickListener
            public final void onClick(android.view.View view) {
                this.f$0.onFullScreenButtonClicked(view);
            }
        });
        android.view.View viewFindViewById = playerControlView.findViewById(androidx.media3.ui.R.id.exo_settings);
        playerControlView.settingsButton = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(componentListener);
        }
        android.view.View viewFindViewById2 = playerControlView.findViewById(androidx.media3.ui.R.id.exo_playback_speed);
        playerControlView.playbackSpeedButton = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(componentListener);
        }
        android.view.View viewFindViewById3 = playerControlView.findViewById(androidx.media3.ui.R.id.exo_audio_track);
        playerControlView.audioTrackButton = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(componentListener);
        }
        androidx.media3.ui.TimeBar timeBar = (androidx.media3.ui.TimeBar) playerControlView.findViewById(androidx.media3.ui.R.id.exo_progress);
        android.view.View viewFindViewById4 = playerControlView.findViewById(androidx.media3.ui.R.id.exo_progress_placeholder);
        if (timeBar != null) {
            playerControlView.timeBar = timeBar;
            playerControlView2 = playerControlView;
            i19 = i37;
        } else if (viewFindViewById4 != null) {
            i19 = i37;
            androidx.media3.ui.DefaultTimeBar defaultTimeBar = new androidx.media3.ui.DefaultTimeBar(context, null, 0, attributeSet2, androidx.media3.ui.R.style.ExoStyledControls_TimeBar);
            defaultTimeBar.setId(androidx.media3.ui.R.id.exo_progress);
            defaultTimeBar.setLayoutParams(viewFindViewById4.getLayoutParams());
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(defaultTimeBar, iIndexOfChild);
            playerControlView2 = this;
            playerControlView2.timeBar = defaultTimeBar;
        } else {
            playerControlView2 = playerControlView;
            i19 = i37;
            playerControlView2.timeBar = null;
        }
        androidx.media3.ui.TimeBar timeBar2 = playerControlView2.timeBar;
        if (timeBar2 != null) {
            timeBar2.addListener(componentListener);
        }
        android.content.res.Resources resources = context.getResources();
        playerControlView2.resources = resources;
        android.widget.ImageView imageView4 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_play_pause);
        playerControlView2.playPauseButton = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(componentListener);
        }
        android.widget.ImageView imageView5 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_prev);
        playerControlView2.previousButton = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(androidx.media3.common.util.Util.getDrawable(context, resources, i3));
            imageView5.setOnClickListener(componentListener);
        }
        android.widget.ImageView imageView6 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_next);
        playerControlView2.nextButton = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(androidx.media3.common.util.Util.getDrawable(context, resources, i16));
            imageView6.setOnClickListener(componentListener);
        }
        android.graphics.Typeface font = androidx.core.content.res.ResourcesCompat.getFont(context, androidx.media3.ui.R.font.roboto_medium_numbers);
        android.widget.ImageView imageView7 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_rew);
        android.widget.TextView textView = (android.widget.TextView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_rew_with_amount);
        if (imageView7 != null) {
            z9 = z;
            imageView7.setImageDrawable(androidx.media3.common.util.Util.getDrawable(context, resources, i4));
            playerControlView2.rewindButton = imageView7;
            playerControlView2.rewindButtonTextView = null;
        } else {
            z9 = z;
            if (textView != null) {
                textView.setTypeface(font);
                playerControlView2.rewindButtonTextView = textView;
                playerControlView2.rewindButton = textView;
            } else {
                playerControlView2.rewindButtonTextView = null;
                playerControlView2.rewindButton = null;
            }
        }
        android.view.View view = playerControlView2.rewindButton;
        if (view != null) {
            view.setOnClickListener(componentListener);
        }
        android.widget.ImageView imageView8 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_ffwd);
        android.widget.TextView textView2 = (android.widget.TextView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_ffwd_with_amount);
        if (imageView8 != null) {
            imageView8.setImageDrawable(androidx.media3.common.util.Util.getDrawable(context, resources, i19));
            playerControlView2.fastForwardButton = imageView8;
            playerControlView2.fastForwardButtonTextView = null;
        } else if (textView2 != null) {
            textView2.setTypeface(font);
            playerControlView2.fastForwardButtonTextView = textView2;
            playerControlView2.fastForwardButton = textView2;
        } else {
            playerControlView2.fastForwardButtonTextView = null;
            playerControlView2.fastForwardButton = null;
        }
        android.view.View view2 = playerControlView2.fastForwardButton;
        if (view2 != null) {
            view2.setOnClickListener(componentListener);
        }
        android.widget.ImageView imageView9 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_repeat_toggle);
        playerControlView2.repeatToggleButton = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(componentListener);
        }
        android.widget.ImageView imageView10 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_shuffle);
        playerControlView2.shuffleButton = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(componentListener);
        }
        playerControlView2.buttonAlphaEnabled = resources.getInteger(androidx.media3.ui.R.integer.exo_media_button_opacity_percentage_enabled) / 100.0f;
        playerControlView2.buttonAlphaDisabled = resources.getInteger(androidx.media3.ui.R.integer.exo_media_button_opacity_percentage_disabled) / 100.0f;
        android.widget.ImageView imageView11 = (android.widget.ImageView) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_vr);
        playerControlView2.vrButton = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(androidx.media3.common.util.Util.getDrawable(context, resources, i2));
            playerControlView2.updateButton(false, imageView11);
        }
        androidx.media3.ui.PlayerControlViewLayoutManager playerControlViewLayoutManager = new androidx.media3.ui.PlayerControlViewLayoutManager(playerControlView2);
        playerControlView2.controlViewLayoutManager = playerControlViewLayoutManager;
        playerControlViewLayoutManager.setAnimationEnabled(z8);
        androidx.media3.ui.PlayerControlView.SettingsAdapter settingsAdapter = playerControlView2.new SettingsAdapter(new java.lang.String[]{resources.getString(androidx.media3.ui.R.string.exo_controls_playback_speed), resources.getString(androidx.media3.ui.R.string.exo_track_selection_title_audio)}, new android.graphics.drawable.Drawable[]{androidx.media3.common.util.Util.getDrawable(context, resources, androidx.media3.ui.R.drawable.exo_styled_controls_speed), androidx.media3.common.util.Util.getDrawable(context, resources, androidx.media3.ui.R.drawable.exo_styled_controls_audiotrack)});
        playerControlView2.settingsAdapter = settingsAdapter;
        playerControlView2.settingsWindowMargin = resources.getDimensionPixelSize(androidx.media3.ui.R.dimen.exo_settings_offset);
        androidx.recyclerview.widget.RecyclerView recyclerView = (androidx.recyclerview.widget.RecyclerView) android.view.LayoutInflater.from(context).inflate(androidx.media3.ui.R.layout.exo_styled_settings_list, (android.view.ViewGroup) null);
        playerControlView2.settingsView = recyclerView;
        recyclerView.setAdapter(settingsAdapter);
        recyclerView.setLayoutManager(new androidx.recyclerview.widget.LinearLayoutManager(getContext()));
        android.widget.PopupWindow popupWindow = new android.widget.PopupWindow((android.view.View) recyclerView, -2, -2, true);
        playerControlView2.settingsWindow = popupWindow;
        if (androidx.media3.common.util.Util.SDK_INT < 23) {
            z10 = false;
            popupWindow.setBackgroundDrawable(new android.graphics.drawable.ColorDrawable(0));
        } else {
            z10 = false;
        }
        popupWindow.setOnDismissListener(componentListener);
        playerControlView2.needToHideBars = true;
        playerControlView2.trackNameProvider = new androidx.media3.ui.DefaultTrackNameProvider(getResources());
        playerControlView2.subtitleOnButtonDrawable = androidx.media3.common.util.Util.getDrawable(context, resources, i11);
        playerControlView2.subtitleOffButtonDrawable = androidx.media3.common.util.Util.getDrawable(context, resources, i12);
        playerControlView2.subtitleOnContentDescription = resources.getString(androidx.media3.ui.R.string.exo_controls_cc_enabled_description);
        playerControlView2.subtitleOffContentDescription = resources.getString(androidx.media3.ui.R.string.exo_controls_cc_disabled_description);
        playerControlView2.textTrackSelectionAdapter = new androidx.media3.ui.PlayerControlView.TextTrackSelectionAdapter();
        playerControlView2.audioTrackSelectionAdapter = new androidx.media3.ui.PlayerControlView.AudioTrackSelectionAdapter();
        playerControlView2.playbackSpeedAdapter = playerControlView2.new PlaybackSpeedAdapter(resources.getStringArray(androidx.media3.ui.R.array.exo_controls_playback_speeds), PLAYBACK_SPEEDS);
        playerControlView2.playButtonDrawable = androidx.media3.common.util.Util.getDrawable(context, resources, i13);
        playerControlView2.pauseButtonDrawable = androidx.media3.common.util.Util.getDrawable(context, resources, i14);
        playerControlView2.fullScreenExitDrawable = androidx.media3.common.util.Util.getDrawable(context, resources, i5);
        playerControlView2.fullScreenEnterDrawable = androidx.media3.common.util.Util.getDrawable(context, resources, i6);
        playerControlView2.repeatOffButtonDrawable = androidx.media3.common.util.Util.getDrawable(context, resources, i7);
        playerControlView2.repeatOneButtonDrawable = androidx.media3.common.util.Util.getDrawable(context, resources, i8);
        playerControlView2.repeatAllButtonDrawable = androidx.media3.common.util.Util.getDrawable(context, resources, i9);
        playerControlView2.shuffleOnButtonDrawable = androidx.media3.common.util.Util.getDrawable(context, resources, i10);
        playerControlView2.shuffleOffButtonDrawable = androidx.media3.common.util.Util.getDrawable(context, resources, i18);
        playerControlView2.fullScreenExitContentDescription = resources.getString(androidx.media3.ui.R.string.exo_controls_fullscreen_exit_description);
        playerControlView2.fullScreenEnterContentDescription = resources.getString(androidx.media3.ui.R.string.exo_controls_fullscreen_enter_description);
        playerControlView2.repeatOffButtonContentDescription = resources.getString(androidx.media3.ui.R.string.exo_controls_repeat_off_description);
        playerControlView2.repeatOneButtonContentDescription = resources.getString(androidx.media3.ui.R.string.exo_controls_repeat_one_description);
        playerControlView2.repeatAllButtonContentDescription = resources.getString(androidx.media3.ui.R.string.exo_controls_repeat_all_description);
        playerControlView2.shuffleOnContentDescription = resources.getString(androidx.media3.ui.R.string.exo_controls_shuffle_on_description);
        playerControlView2.shuffleOffContentDescription = resources.getString(androidx.media3.ui.R.string.exo_controls_shuffle_off_description);
        playerControlViewLayoutManager.setShowButton((android.view.ViewGroup) playerControlView2.findViewById(androidx.media3.ui.R.id.exo_bottom_bar), true);
        playerControlViewLayoutManager.setShowButton(playerControlView2.fastForwardButton, z2);
        playerControlViewLayoutManager.setShowButton(playerControlView2.rewindButton, z9);
        playerControlViewLayoutManager.setShowButton(imageView5, z3);
        playerControlViewLayoutManager.setShowButton(imageView6, z4);
        playerControlViewLayoutManager.setShowButton(imageView10, z5);
        playerControlViewLayoutManager.setShowButton(imageView, z6);
        playerControlViewLayoutManager.setShowButton(imageView11, z7);
        playerControlViewLayoutManager.setShowButton(imageView9, playerControlView2.repeatToggleModes != 0 ? true : z10);
        playerControlView2.addOnLayoutChangeListener(new android.view.View.OnLayoutChangeListener() { // from class: androidx.media3.ui.PlayerControlView$$ExternalSyntheticLambda2
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(android.view.View view3, int i38, int i39, int i40, int i41, int i42, int i43, int i44, int i45) {
                this.f$0.onLayoutChange(view3, i38, i39, i40, i41, i42, i43, i44, i45);
            }
        });
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

    @java.lang.Deprecated
    public void addVisibilityListener(androidx.media3.ui.PlayerControlView.VisibilityListener visibilityListener) {
        androidx.media3.common.util.Assertions.checkNotNull(visibilityListener);
        this.visibilityListeners.add(visibilityListener);
    }

    @java.lang.Deprecated
    public void removeVisibilityListener(androidx.media3.ui.PlayerControlView.VisibilityListener visibilityListener) {
        this.visibilityListeners.remove(visibilityListener);
    }

    public void setProgressUpdateListener(androidx.media3.ui.PlayerControlView.ProgressUpdateListener progressUpdateListener) {
        this.progressUpdateListener = progressUpdateListener;
    }

    public void setShowRewindButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.rewindButton, z);
        updateNavigation();
    }

    public void setShowFastForwardButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.fastForwardButton, z);
        updateNavigation();
    }

    public void setShowPreviousButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.previousButton, z);
        updateNavigation();
    }

    public void setShowNextButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.nextButton, z);
        updateNavigation();
    }

    public int getShowTimeoutMs() {
        return this.showTimeoutMs;
    }

    public void setShowTimeoutMs(int i) {
        this.showTimeoutMs = i;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
    }

    public int getRepeatToggleModes() {
        return this.repeatToggleModes;
    }

    public void setRepeatToggleModes(int i) {
        this.repeatToggleModes = i;
        androidx.media3.common.Player player = this.player;
        if (player != null && player.isCommandAvailable(15)) {
            int repeatMode = this.player.getRepeatMode();
            if (i == 0 && repeatMode != 0) {
                this.player.setRepeatMode(0);
            } else if (i == 1 && repeatMode == 2) {
                this.player.setRepeatMode(1);
            } else if (i == 2 && repeatMode == 1) {
                this.player.setRepeatMode(2);
            }
        }
        this.controlViewLayoutManager.setShowButton(this.repeatToggleButton, i != 0);
        updateRepeatModeButton();
    }

    public boolean getShowShuffleButton() {
        return this.controlViewLayoutManager.getShowButton(this.shuffleButton);
    }

    public void setShowShuffleButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.shuffleButton, z);
        updateShuffleButton();
    }

    public boolean getShowSubtitleButton() {
        return this.controlViewLayoutManager.getShowButton(this.subtitleButton);
    }

    public void setShowSubtitleButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.subtitleButton, z);
    }

    public boolean getShowVrButton() {
        return this.controlViewLayoutManager.getShowButton(this.vrButton);
    }

    public void setShowVrButton(boolean z) {
        this.controlViewLayoutManager.setShowButton(this.vrButton, z);
    }

    public void setVrButtonListener(android.view.View.OnClickListener onClickListener) {
        android.widget.ImageView imageView = this.vrButton;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            updateButton(onClickListener != null, this.vrButton);
        }
    }

    public void setAnimationEnabled(boolean z) {
        this.controlViewLayoutManager.setAnimationEnabled(z);
    }

    public boolean isAnimationEnabled() {
        return this.controlViewLayoutManager.isAnimationEnabled();
    }

    public void setTimeBarMinUpdateInterval(int i) {
        this.timeBarMinUpdateIntervalMs = androidx.media3.common.util.Util.constrainValue(i, 16, 1000);
    }

    @java.lang.Deprecated
    public void setOnFullScreenModeChangedListener(androidx.media3.ui.PlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener) {
        this.onFullScreenModeChangedListener = onFullScreenModeChangedListener;
        updateFullScreenButtonVisibility(this.fullScreenButton, onFullScreenModeChangedListener != null);
        updateFullScreenButtonVisibility(this.minimalFullScreenButton, onFullScreenModeChangedListener != null);
    }

    public void show() {
        this.controlViewLayoutManager.show();
    }

    public void hide() {
        this.controlViewLayoutManager.hide();
    }

    public void hideImmediately() {
        this.controlViewLayoutManager.hideImmediately();
    }

    public boolean isFullyVisible() {
        return this.controlViewLayoutManager.isFullyVisible();
    }

    public boolean isVisible() {
        return getVisibility() == 0;
    }

    void notifyOnVisibilityChange() {
        java.util.Iterator<androidx.media3.ui.PlayerControlView.VisibilityListener> it = this.visibilityListeners.iterator();
        while (it.hasNext()) {
            it.next().onVisibilityChange(getVisibility());
        }
    }

    void updateAll() {
        updatePlayPauseButton();
        updateNavigation();
        updateRepeatModeButton();
        updateShuffleButton();
        updateTrackLists();
        updatePlaybackSpeedList();
        updateTimeline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlayPauseButton() {
        int i;
        if (isVisible() && this.isAttachedToWindow && this.playPauseButton != null) {
            boolean zShouldShowPlayButton = androidx.media3.common.util.Util.shouldShowPlayButton(this.player, this.showPlayButtonIfSuppressed);
            android.graphics.drawable.Drawable drawable = zShouldShowPlayButton ? this.playButtonDrawable : this.pauseButtonDrawable;
            if (zShouldShowPlayButton) {
                i = androidx.media3.ui.R.string.exo_controls_play_description;
            } else {
                i = androidx.media3.ui.R.string.exo_controls_pause_description;
            }
            this.playPauseButton.setImageDrawable(drawable);
            this.playPauseButton.setContentDescription(this.resources.getString(i));
            updateButton(shouldEnablePlayPauseButton(), this.playPauseButton);
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
                if (this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player, this.window)) {
                    zIsCommandAvailable = player.isCommandAvailable(10);
                } else {
                    zIsCommandAvailable = player.isCommandAvailable(5);
                }
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
            if (zIsCommandAvailable4) {
                updateRewindButton();
            }
            if (zIsCommandAvailable5) {
                updateFastForwardButton();
            }
            updateButton(zIsCommandAvailable3, this.previousButton);
            updateButton(zIsCommandAvailable4, this.rewindButton);
            updateButton(zIsCommandAvailable5, this.fastForwardButton);
            updateButton(zIsCommandAvailable2, this.nextButton);
            androidx.media3.ui.TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setEnabled(zIsCommandAvailable);
            }
        }
    }

    private void updateRewindButton() {
        androidx.media3.common.Player player = this.player;
        int seekBackIncrement = (int) ((player != null ? player.getSeekBackIncrement() : 5000L) / 1000);
        android.widget.TextView textView = this.rewindButtonTextView;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(seekBackIncrement));
        }
        android.view.View view = this.rewindButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(androidx.media3.ui.R.plurals.exo_controls_rewind_by_amount_description, seekBackIncrement, java.lang.Integer.valueOf(seekBackIncrement)));
        }
    }

    private void updateFastForwardButton() {
        androidx.media3.common.Player player = this.player;
        int seekForwardIncrement = (int) ((player != null ? player.getSeekForwardIncrement() : androidx.media3.common.C.DEFAULT_SEEK_FORWARD_INCREMENT_MS) / 1000);
        android.widget.TextView textView = this.fastForwardButtonTextView;
        if (textView != null) {
            textView.setText(java.lang.String.valueOf(seekForwardIncrement));
        }
        android.view.View view = this.fastForwardButton;
        if (view != null) {
            view.setContentDescription(this.resources.getQuantityString(androidx.media3.ui.R.plurals.exo_controls_fastforward_by_amount_description, seekForwardIncrement, java.lang.Integer.valueOf(seekForwardIncrement)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateRepeatModeButton() {
        android.widget.ImageView imageView;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.repeatToggleButton) != null) {
            if (this.repeatToggleModes == 0) {
                updateButton(false, imageView);
                return;
            }
            androidx.media3.common.Player player = this.player;
            if (player == null || !player.isCommandAvailable(15)) {
                updateButton(false, this.repeatToggleButton);
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
                return;
            }
            updateButton(true, this.repeatToggleButton);
            int repeatMode = player.getRepeatMode();
            if (repeatMode == 0) {
                this.repeatToggleButton.setImageDrawable(this.repeatOffButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOffButtonContentDescription);
            } else if (repeatMode == 1) {
                this.repeatToggleButton.setImageDrawable(this.repeatOneButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatOneButtonContentDescription);
            } else {
                if (repeatMode != 2) {
                    return;
                }
                this.repeatToggleButton.setImageDrawable(this.repeatAllButtonDrawable);
                this.repeatToggleButton.setContentDescription(this.repeatAllButtonContentDescription);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateShuffleButton() {
        android.widget.ImageView imageView;
        java.lang.String str;
        if (isVisible() && this.isAttachedToWindow && (imageView = this.shuffleButton) != null) {
            androidx.media3.common.Player player = this.player;
            if (!this.controlViewLayoutManager.getShowButton(imageView)) {
                updateButton(false, this.shuffleButton);
                return;
            }
            if (player == null || !player.isCommandAvailable(14)) {
                updateButton(false, this.shuffleButton);
                this.shuffleButton.setImageDrawable(this.shuffleOffButtonDrawable);
                this.shuffleButton.setContentDescription(this.shuffleOffContentDescription);
                return;
            }
            updateButton(true, this.shuffleButton);
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
    public void updateTrackLists() {
        initTrackSelectionAdapter();
        updateButton(this.textTrackSelectionAdapter.getItemCount() > 0, this.subtitleButton);
        updateSettingsButton();
    }

    private void initTrackSelectionAdapter() {
        this.textTrackSelectionAdapter.clear();
        this.audioTrackSelectionAdapter.clear();
        androidx.media3.common.Player player = this.player;
        if (player != null && player.isCommandAvailable(30) && this.player.isCommandAvailable(29)) {
            androidx.media3.common.Tracks currentTracks = this.player.getCurrentTracks();
            this.audioTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 1));
            if (this.controlViewLayoutManager.getShowButton(this.subtitleButton)) {
                this.textTrackSelectionAdapter.init(gatherSupportedTrackInfosOfType(currentTracks, 3));
            } else {
                this.textTrackSelectionAdapter.init(com.google.common.collect.ImmutableList.of());
            }
        }
    }

    private com.google.common.collect.ImmutableList<androidx.media3.ui.PlayerControlView.TrackInformation> gatherSupportedTrackInfosOfType(androidx.media3.common.Tracks tracks, int i) {
        com.google.common.collect.ImmutableList.Builder builder = new com.google.common.collect.ImmutableList.Builder();
        com.google.common.collect.ImmutableList<androidx.media3.common.Tracks.Group> groups = tracks.getGroups();
        for (int i2 = 0; i2 < groups.size(); i2++) {
            androidx.media3.common.Tracks.Group group = groups.get(i2);
            if (group.getType() == i) {
                for (int i3 = 0; i3 < group.length; i3++) {
                    if (group.isTrackSupported(i3)) {
                        androidx.media3.common.Format trackFormat = group.getTrackFormat(i3);
                        if ((trackFormat.selectionFlags & 2) == 0) {
                            builder.add(new androidx.media3.ui.PlayerControlView.TrackInformation(tracks, i2, i3, this.trackNameProvider.getTrackName(trackFormat)));
                        }
                    }
                }
            }
        }
        return builder.build();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:44:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:49:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:61:0x0111  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e3 A[SYNTHETIC] */
    public void updateTimeline() {
        androidx.media3.common.Timeline currentTimeline;
        long jMsToUs;
        int i;
        long positionInWindowUs;
        long[] jArr;
        int length;
        androidx.media3.common.Player player = this.player;
        if (player == null) {
            return;
        }
        boolean z = true;
        this.multiWindowTimeBar = this.showMultiWindowTimeBar && canShowMultiWindowTimeBar(player, this.window);
        this.currentWindowOffset = 0L;
        if (player.isCommandAvailable(17)) {
            currentTimeline = player.getCurrentTimeline();
        } else {
            currentTimeline = androidx.media3.common.Timeline.EMPTY;
        }
        if (!currentTimeline.isEmpty()) {
            int currentMediaItemIndex = player.getCurrentMediaItemIndex();
            boolean z2 = this.multiWindowTimeBar;
            int i2 = z2 ? 0 : currentMediaItemIndex;
            int windowCount = z2 ? currentTimeline.getWindowCount() - 1 : currentMediaItemIndex;
            long j = 0;
            i = 0;
            while (i2 <= windowCount) {
                if (i2 == currentMediaItemIndex) {
                    this.currentWindowOffset = androidx.media3.common.util.Util.usToMs(j);
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
                                this.adGroupTimesMs[i] = androidx.media3.common.util.Util.usToMs(j + positionInWindowUs);
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
                                this.adGroupTimesMs[i] = androidx.media3.common.util.Util.usToMs(j + positionInWindowUs);
                                this.playedAdGroups[i] = this.period.hasPlayedAdGroup(removedAdGroupCount);
                                i++;
                            }
                        }
                    }
                }
                j += this.window.durationUs;
                i2++;
                z = true;
            }
            jMsToUs = j;
        } else {
            if (player.isCommandAvailable(16)) {
                long contentDuration = player.getContentDuration();
                if (contentDuration != androidx.media3.common.C.TIME_UNSET) {
                    jMsToUs = androidx.media3.common.util.Util.msToUs(contentDuration);
                } else {
                    jMsToUs = 0;
                }
            } else {
                jMsToUs = 0;
            }
            i = 0;
        }
        long jUsToMs = androidx.media3.common.util.Util.usToMs(jMsToUs);
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
            if (player == null || !player.isCommandAvailable(16)) {
                contentPosition = 0;
                contentBufferedPosition = 0;
            } else {
                contentPosition = this.currentWindowOffset + player.getContentPosition();
                contentBufferedPosition = this.currentWindowOffset + player.getContentBufferedPosition();
            }
            android.widget.TextView textView = this.positionView;
            if (textView != null && !this.scrubbing) {
                textView.setText(androidx.media3.common.util.Util.getStringForTime(this.formatBuilder, this.formatter, contentPosition));
            }
            androidx.media3.ui.TimeBar timeBar = this.timeBar;
            if (timeBar != null) {
                timeBar.setPosition(contentPosition);
                this.timeBar.setBufferedPosition(contentBufferedPosition);
            }
            androidx.media3.ui.PlayerControlView.ProgressUpdateListener progressUpdateListener = this.progressUpdateListener;
            if (progressUpdateListener != null) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaybackSpeedList() {
        androidx.media3.common.Player player = this.player;
        if (player == null) {
            return;
        }
        this.playbackSpeedAdapter.updateSelectedIndex(player.getPlaybackParameters().speed);
        this.settingsAdapter.setSubTextAtPosition(0, this.playbackSpeedAdapter.getSelectedText());
        updateSettingsButton();
    }

    private void updateSettingsButton() {
        updateButton(this.settingsAdapter.hasSettingsToShow(), this.settingsButton);
    }

    private void updateSettingsWindowSize() {
        this.settingsView.measure(0, 0);
        this.settingsWindow.setWidth(java.lang.Math.min(this.settingsView.getMeasuredWidth(), getWidth() - (this.settingsWindowMargin * 2)));
        this.settingsWindow.setHeight(java.lang.Math.min(getHeight() - (this.settingsWindowMargin * 2), this.settingsView.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void displaySettingsWindow(androidx.recyclerview.widget.RecyclerView.Adapter<?> adapter, android.view.View view) {
        this.settingsView.setAdapter(adapter);
        updateSettingsWindowSize();
        this.needToHideBars = false;
        this.settingsWindow.dismiss();
        this.needToHideBars = true;
        this.settingsWindow.showAsDropDown(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f) {
        androidx.media3.common.Player player = this.player;
        if (player == null || !player.isCommandAvailable(13)) {
            return;
        }
        androidx.media3.common.Player player2 = this.player;
        player2.setPlaybackParameters(player2.getPlaybackParameters().withSpeed(f));
    }

    void requestPlayPauseFocus() {
        android.widget.ImageView imageView = this.playPauseButton;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    private void updateButton(boolean z, android.view.View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z);
        view.setAlpha(z ? this.buttonAlphaEnabled : this.buttonAlphaDisabled);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void seekToTimeBarPosition(androidx.media3.common.Player player, long j) {
        if (this.multiWindowTimeBar) {
            if (player.isCommandAvailable(17) && player.isCommandAvailable(10)) {
                androidx.media3.common.Timeline currentTimeline = player.getCurrentTimeline();
                int windowCount = currentTimeline.getWindowCount();
                int i = 0;
                while (true) {
                    long durationMs = currentTimeline.getWindow(i, this.window).getDurationMs();
                    if (j < durationMs) {
                        break;
                    }
                    if (i == windowCount - 1) {
                        j = durationMs;
                        break;
                    } else {
                        j -= durationMs;
                        i++;
                    }
                }
                player.seekTo(i, j);
            }
        } else if (player.isCommandAvailable(5)) {
            player.seekTo(j);
        }
        updateProgress();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onFullScreenButtonClicked(android.view.View view) {
        if (this.onFullScreenModeChangedListener == null) {
            return;
        }
        boolean z = !this.isFullScreen;
        this.isFullScreen = z;
        updateFullScreenButtonForState(this.fullScreenButton, z);
        updateFullScreenButtonForState(this.minimalFullScreenButton, this.isFullScreen);
        androidx.media3.ui.PlayerControlView.OnFullScreenModeChangedListener onFullScreenModeChangedListener = this.onFullScreenModeChangedListener;
        if (onFullScreenModeChangedListener != null) {
            onFullScreenModeChangedListener.onFullScreenModeChanged(this.isFullScreen);
        }
    }

    private void updateFullScreenButtonForState(android.widget.ImageView imageView, boolean z) {
        if (imageView == null) {
            return;
        }
        if (z) {
            imageView.setImageDrawable(this.fullScreenExitDrawable);
            imageView.setContentDescription(this.fullScreenExitContentDescription);
        } else {
            imageView.setImageDrawable(this.fullScreenEnterDrawable);
            imageView.setContentDescription(this.fullScreenEnterContentDescription);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onSettingViewClicked(int i) {
        if (i == 0) {
            displaySettingsWindow(this.playbackSpeedAdapter, (android.view.View) androidx.media3.common.util.Assertions.checkNotNull(this.settingsButton));
        } else if (i == 1) {
            displaySettingsWindow(this.audioTrackSelectionAdapter, (android.view.View) androidx.media3.common.util.Assertions.checkNotNull(this.settingsButton));
        } else {
            this.settingsWindow.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.controlViewLayoutManager.onAttachedToWindow();
        this.isAttachedToWindow = true;
        if (isFullyVisible()) {
            this.controlViewLayoutManager.resetHideCallbacks();
        }
        updateAll();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.controlViewLayoutManager.onDetachedFromWindow();
        this.isAttachedToWindow = false;
        removeCallbacks(this.updateProgressAction);
        this.controlViewLayoutManager.removeHideCallbacks();
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
            if (player.getPlaybackState() == 4 || !player.isCommandAvailable(12)) {
                return true;
            }
            player.seekForward();
            return true;
        }
        if (keyCode == 89 && player.isCommandAvailable(11)) {
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
            if (!player.isCommandAvailable(9)) {
                return true;
            }
            player.seekToNext();
            return true;
        }
        if (keyCode == 88) {
            if (!player.isCommandAvailable(7)) {
                return true;
            }
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

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.controlViewLayoutManager.onLayout(z, i, i2, i3, i4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i8 - i6;
        if (!(i3 - i == i7 - i5 && i9 == i10) && this.settingsWindow.isShowing()) {
            updateSettingsWindowSize();
            this.settingsWindow.update(view, (getWidth() - this.settingsWindow.getWidth()) - this.settingsWindowMargin, (-this.settingsWindow.getHeight()) - this.settingsWindowMargin, -1, -1);
        }
    }

    private boolean shouldEnablePlayPauseButton() {
        androidx.media3.common.Player player = this.player;
        return (player == null || !player.isCommandAvailable(1) || (this.player.isCommandAvailable(17) && this.player.getCurrentTimeline().isEmpty())) ? false : true;
    }

    private static boolean canShowMultiWindowTimeBar(androidx.media3.common.Player player, androidx.media3.common.Timeline.Window window) {
        androidx.media3.common.Timeline currentTimeline;
        int windowCount;
        if (!player.isCommandAvailable(17) || (windowCount = (currentTimeline = player.getCurrentTimeline()).getWindowCount()) <= 1 || windowCount > 100) {
            return false;
        }
        for (int i = 0; i < windowCount; i++) {
            if (currentTimeline.getWindow(i, window).durationUs == androidx.media3.common.C.TIME_UNSET) {
                return false;
            }
        }
        return true;
    }

    private static void initializeFullScreenButton(android.view.View view, android.view.View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    private static void updateFullScreenButtonVisibility(android.view.View view, boolean z) {
        if (view == null) {
            return;
        }
        if (z) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    private static int getRepeatToggleModes(android.content.res.TypedArray typedArray, int i) {
        return typedArray.getInt(androidx.media3.ui.R.styleable.PlayerControlView_repeat_toggle_modes, i);
    }

    private final class ComponentListener implements androidx.media3.common.Player.Listener, androidx.media3.ui.TimeBar.OnScrubListener, android.view.View.OnClickListener, android.widget.PopupWindow.OnDismissListener {
        private ComponentListener() {
        }

        @Override // androidx.media3.common.Player.Listener
        public void onEvents(androidx.media3.common.Player player, androidx.media3.common.Player.Events events) {
            if (events.containsAny(4, 5, 13)) {
                androidx.media3.ui.PlayerControlView.this.updatePlayPauseButton();
            }
            if (events.containsAny(4, 5, 7, 13)) {
                androidx.media3.ui.PlayerControlView.this.updateProgress();
            }
            if (events.containsAny(8, 13)) {
                androidx.media3.ui.PlayerControlView.this.updateRepeatModeButton();
            }
            if (events.containsAny(9, 13)) {
                androidx.media3.ui.PlayerControlView.this.updateShuffleButton();
            }
            if (events.containsAny(8, 9, 11, 0, 16, 17, 13)) {
                androidx.media3.ui.PlayerControlView.this.updateNavigation();
            }
            if (events.containsAny(11, 0, 13)) {
                androidx.media3.ui.PlayerControlView.this.updateTimeline();
            }
            if (events.containsAny(12, 13)) {
                androidx.media3.ui.PlayerControlView.this.updatePlaybackSpeedList();
            }
            if (events.containsAny(2, 13)) {
                androidx.media3.ui.PlayerControlView.this.updateTrackLists();
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStart(androidx.media3.ui.TimeBar timeBar, long j) {
            androidx.media3.ui.PlayerControlView.this.scrubbing = true;
            if (androidx.media3.ui.PlayerControlView.this.positionView != null) {
                androidx.media3.ui.PlayerControlView.this.positionView.setText(androidx.media3.common.util.Util.getStringForTime(androidx.media3.ui.PlayerControlView.this.formatBuilder, androidx.media3.ui.PlayerControlView.this.formatter, j));
            }
            androidx.media3.ui.PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubMove(androidx.media3.ui.TimeBar timeBar, long j) {
            if (androidx.media3.ui.PlayerControlView.this.positionView != null) {
                androidx.media3.ui.PlayerControlView.this.positionView.setText(androidx.media3.common.util.Util.getStringForTime(androidx.media3.ui.PlayerControlView.this.formatBuilder, androidx.media3.ui.PlayerControlView.this.formatter, j));
            }
        }

        @Override // androidx.media3.ui.TimeBar.OnScrubListener
        public void onScrubStop(androidx.media3.ui.TimeBar timeBar, long j, boolean z) {
            androidx.media3.ui.PlayerControlView.this.scrubbing = false;
            if (!z && androidx.media3.ui.PlayerControlView.this.player != null) {
                androidx.media3.ui.PlayerControlView playerControlView = androidx.media3.ui.PlayerControlView.this;
                playerControlView.seekToTimeBarPosition(playerControlView.player, j);
            }
            androidx.media3.ui.PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (androidx.media3.ui.PlayerControlView.this.needToHideBars) {
                androidx.media3.ui.PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View view) {
            androidx.media3.common.Player player = androidx.media3.ui.PlayerControlView.this.player;
            if (player == null) {
                return;
            }
            androidx.media3.ui.PlayerControlView.this.controlViewLayoutManager.resetHideCallbacks();
            if (androidx.media3.ui.PlayerControlView.this.nextButton != view) {
                if (androidx.media3.ui.PlayerControlView.this.previousButton != view) {
                    if (androidx.media3.ui.PlayerControlView.this.fastForwardButton != view) {
                        if (androidx.media3.ui.PlayerControlView.this.rewindButton != view) {
                            if (androidx.media3.ui.PlayerControlView.this.playPauseButton == view) {
                                androidx.media3.common.util.Util.handlePlayPauseButtonAction(player, androidx.media3.ui.PlayerControlView.this.showPlayButtonIfSuppressed);
                                return;
                            }
                            if (androidx.media3.ui.PlayerControlView.this.repeatToggleButton != view) {
                                if (androidx.media3.ui.PlayerControlView.this.shuffleButton != view) {
                                    if (androidx.media3.ui.PlayerControlView.this.settingsButton == view) {
                                        androidx.media3.ui.PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                                        androidx.media3.ui.PlayerControlView playerControlView = androidx.media3.ui.PlayerControlView.this;
                                        playerControlView.displaySettingsWindow(playerControlView.settingsAdapter, androidx.media3.ui.PlayerControlView.this.settingsButton);
                                        return;
                                    }
                                    if (androidx.media3.ui.PlayerControlView.this.playbackSpeedButton == view) {
                                        androidx.media3.ui.PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                                        androidx.media3.ui.PlayerControlView playerControlView2 = androidx.media3.ui.PlayerControlView.this;
                                        playerControlView2.displaySettingsWindow(playerControlView2.playbackSpeedAdapter, androidx.media3.ui.PlayerControlView.this.playbackSpeedButton);
                                        return;
                                    } else if (androidx.media3.ui.PlayerControlView.this.audioTrackButton == view) {
                                        androidx.media3.ui.PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                                        androidx.media3.ui.PlayerControlView playerControlView3 = androidx.media3.ui.PlayerControlView.this;
                                        playerControlView3.displaySettingsWindow(playerControlView3.audioTrackSelectionAdapter, androidx.media3.ui.PlayerControlView.this.audioTrackButton);
                                        return;
                                    } else {
                                        if (androidx.media3.ui.PlayerControlView.this.subtitleButton == view) {
                                            androidx.media3.ui.PlayerControlView.this.controlViewLayoutManager.removeHideCallbacks();
                                            androidx.media3.ui.PlayerControlView playerControlView4 = androidx.media3.ui.PlayerControlView.this;
                                            playerControlView4.displaySettingsWindow(playerControlView4.textTrackSelectionAdapter, androidx.media3.ui.PlayerControlView.this.subtitleButton);
                                            return;
                                        }
                                        return;
                                    }
                                }
                                if (player.isCommandAvailable(14)) {
                                    player.setShuffleModeEnabled(!player.getShuffleModeEnabled());
                                    return;
                                }
                                return;
                            }
                            if (player.isCommandAvailable(15)) {
                                player.setRepeatMode(androidx.media3.common.util.RepeatModeUtil.getNextRepeatMode(player.getRepeatMode(), androidx.media3.ui.PlayerControlView.this.repeatToggleModes));
                                return;
                            }
                            return;
                        }
                        if (player.isCommandAvailable(11)) {
                            player.seekBack();
                            return;
                        }
                        return;
                    }
                    if (player.getPlaybackState() == 4 || !player.isCommandAvailable(12)) {
                        return;
                    }
                    player.seekForward();
                    return;
                }
                if (player.isCommandAvailable(7)) {
                    player.seekToPrevious();
                    return;
                }
                return;
            }
            if (player.isCommandAvailable(9)) {
                player.seekToNext();
            }
        }
    }

    private class SettingsAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.media3.ui.PlayerControlView.SettingViewHolder> {
        private final android.graphics.drawable.Drawable[] iconIds;
        private final java.lang.String[] mainTexts;
        private final java.lang.String[] subTexts;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        public SettingsAdapter(java.lang.String[] strArr, android.graphics.drawable.Drawable[] drawableArr) {
            this.mainTexts = strArr;
            this.subTexts = new java.lang.String[strArr.length];
            this.iconIds = drawableArr;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public androidx.media3.ui.PlayerControlView.SettingViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
            return androidx.media3.ui.PlayerControlView.this.new SettingViewHolder(android.view.LayoutInflater.from(androidx.media3.ui.PlayerControlView.this.getContext()).inflate(androidx.media3.ui.R.layout.exo_styled_settings_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(androidx.media3.ui.PlayerControlView.SettingViewHolder settingViewHolder, int i) {
            if (shouldShowSetting(i)) {
                settingViewHolder.itemView.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(-1, -2));
            } else {
                settingViewHolder.itemView.setLayoutParams(new androidx.recyclerview.widget.RecyclerView.LayoutParams(0, 0));
            }
            settingViewHolder.mainTextView.setText(this.mainTexts[i]);
            if (this.subTexts[i] == null) {
                settingViewHolder.subTextView.setVisibility(8);
            } else {
                settingViewHolder.subTextView.setText(this.subTexts[i]);
            }
            if (this.iconIds[i] == null) {
                settingViewHolder.iconView.setVisibility(8);
            } else {
                settingViewHolder.iconView.setImageDrawable(this.iconIds[i]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.mainTexts.length;
        }

        public void setSubTextAtPosition(int i, java.lang.String str) {
            this.subTexts[i] = str;
        }

        public boolean hasSettingsToShow() {
            return shouldShowSetting(1) || shouldShowSetting(0);
        }

        private boolean shouldShowSetting(int i) {
            if (androidx.media3.ui.PlayerControlView.this.player == null) {
                return false;
            }
            if (i == 0) {
                return androidx.media3.ui.PlayerControlView.this.player.isCommandAvailable(13);
            }
            if (i != 1) {
                return true;
            }
            return androidx.media3.ui.PlayerControlView.this.player.isCommandAvailable(30) && androidx.media3.ui.PlayerControlView.this.player.isCommandAvailable(29);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class SettingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        private final android.widget.ImageView iconView;
        private final android.widget.TextView mainTextView;
        private final android.widget.TextView subTextView;

        public SettingViewHolder(android.view.View view) {
            super(view);
            if (androidx.media3.common.util.Util.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.mainTextView = (android.widget.TextView) view.findViewById(androidx.media3.ui.R.id.exo_main_text);
            this.subTextView = (android.widget.TextView) view.findViewById(androidx.media3.ui.R.id.exo_sub_text);
            this.iconView = (android.widget.ImageView) view.findViewById(androidx.media3.ui.R.id.exo_icon);
            view.setOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$SettingViewHolder$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    this.f$0.m447x7eeeb754(view2);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$new$0$androidx-media3-ui-PlayerControlView$SettingViewHolder, reason: not valid java name */
        /* synthetic */ void m447x7eeeb754(android.view.View view) {
            androidx.media3.ui.PlayerControlView.this.onSettingViewClicked(getBindingAdapterPosition());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class PlaybackSpeedAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.media3.ui.PlayerControlView.SubSettingViewHolder> {
        private final java.lang.String[] playbackSpeedTexts;
        private final float[] playbackSpeeds;
        private int selectedIndex;

        public PlaybackSpeedAdapter(java.lang.String[] strArr, float[] fArr) {
            this.playbackSpeedTexts = strArr;
            this.playbackSpeeds = fArr;
        }

        public void updateSelectedIndex(float f) {
            int i = 0;
            float f2 = Float.MAX_VALUE;
            int i2 = 0;
            while (true) {
                float[] fArr = this.playbackSpeeds;
                if (i < fArr.length) {
                    float fAbs = java.lang.Math.abs(f - fArr[i]);
                    if (fAbs < f2) {
                        i2 = i;
                        f2 = fAbs;
                    }
                    i++;
                } else {
                    this.selectedIndex = i2;
                    return;
                }
            }
        }

        public java.lang.String getSelectedText() {
            return this.playbackSpeedTexts[this.selectedIndex];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public androidx.media3.ui.PlayerControlView.SubSettingViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
            return new androidx.media3.ui.PlayerControlView.SubSettingViewHolder(android.view.LayoutInflater.from(androidx.media3.ui.PlayerControlView.this.getContext()).inflate(androidx.media3.ui.R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(androidx.media3.ui.PlayerControlView.SubSettingViewHolder subSettingViewHolder, final int i) {
            if (i < this.playbackSpeedTexts.length) {
                subSettingViewHolder.textView.setText(this.playbackSpeedTexts[i]);
            }
            if (i == this.selectedIndex) {
                subSettingViewHolder.itemView.setSelected(true);
                subSettingViewHolder.checkView.setVisibility(0);
            } else {
                subSettingViewHolder.itemView.setSelected(false);
                subSettingViewHolder.checkView.setVisibility(4);
            }
            subSettingViewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$PlaybackSpeedAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.f$0.m446x9de2ddb7(i, view);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onBindViewHolder$0$androidx-media3-ui-PlayerControlView$PlaybackSpeedAdapter, reason: not valid java name */
        /* synthetic */ void m446x9de2ddb7(int i, android.view.View view) {
            if (i != this.selectedIndex) {
                androidx.media3.ui.PlayerControlView.this.setPlaybackSpeed(this.playbackSpeeds[i]);
            }
            androidx.media3.ui.PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            return this.playbackSpeedTexts.length;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class TrackInformation {
        public final androidx.media3.common.Tracks.Group trackGroup;
        public final int trackIndex;
        public final java.lang.String trackName;

        public TrackInformation(androidx.media3.common.Tracks tracks, int i, int i2, java.lang.String str) {
            this.trackGroup = tracks.getGroups().get(i);
            this.trackIndex = i2;
            this.trackName = str;
        }

        public boolean isSelected() {
            return this.trackGroup.isTrackSelected(this.trackIndex);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class TextTrackSelectionAdapter extends androidx.media3.ui.PlayerControlView.TrackSelectionAdapter {
        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(java.lang.String str) {
        }

        private TextTrackSelectionAdapter() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void init(java.util.List<androidx.media3.ui.PlayerControlView.TrackInformation> list) {
            boolean z = false;
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).isSelected()) {
                    z = true;
                    break;
                }
            }
            if (androidx.media3.ui.PlayerControlView.this.subtitleButton != null) {
                android.widget.ImageView imageView = androidx.media3.ui.PlayerControlView.this.subtitleButton;
                androidx.media3.ui.PlayerControlView playerControlView = androidx.media3.ui.PlayerControlView.this;
                imageView.setImageDrawable(z ? playerControlView.subtitleOnButtonDrawable : playerControlView.subtitleOffButtonDrawable);
                androidx.media3.ui.PlayerControlView.this.subtitleButton.setContentDescription(z ? androidx.media3.ui.PlayerControlView.this.subtitleOnContentDescription : androidx.media3.ui.PlayerControlView.this.subtitleOffContentDescription);
            }
            this.tracks = list;
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(androidx.media3.ui.PlayerControlView.SubSettingViewHolder subSettingViewHolder) {
            boolean z;
            subSettingViewHolder.textView.setText(androidx.media3.ui.R.string.exo_track_selection_none);
            int i = 0;
            while (true) {
                if (i >= this.tracks.size()) {
                    z = true;
                    break;
                } else {
                    if (this.tracks.get(i).isSelected()) {
                        z = false;
                        break;
                    }
                    i++;
                }
            }
            subSettingViewHolder.checkView.setVisibility(z ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$TextTrackSelectionAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.f$0.m448x7bd5d809(view);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onBindViewHolderAtZeroPosition$0$androidx-media3-ui-PlayerControlView$TextTrackSelectionAdapter, reason: not valid java name */
        /* synthetic */ void m448x7bd5d809(android.view.View view) {
            if (androidx.media3.ui.PlayerControlView.this.player == null || !androidx.media3.ui.PlayerControlView.this.player.isCommandAvailable(29)) {
                return;
            }
            androidx.media3.ui.PlayerControlView.this.player.setTrackSelectionParameters(androidx.media3.ui.PlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(3).setIgnoredTextSelectionFlags(-3).build());
            androidx.media3.ui.PlayerControlView.this.settingsWindow.dismiss();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(androidx.media3.ui.PlayerControlView.SubSettingViewHolder subSettingViewHolder, int i) {
            super.onBindViewHolder(subSettingViewHolder, i);
            if (i > 0) {
                subSettingViewHolder.checkView.setVisibility(this.tracks.get(i + (-1)).isSelected() ? 0 : 4);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class AudioTrackSelectionAdapter extends androidx.media3.ui.PlayerControlView.TrackSelectionAdapter {
        private AudioTrackSelectionAdapter() {
            super();
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onBindViewHolderAtZeroPosition(androidx.media3.ui.PlayerControlView.SubSettingViewHolder subSettingViewHolder) {
            subSettingViewHolder.textView.setText(androidx.media3.ui.R.string.exo_track_selection_auto);
            subSettingViewHolder.checkView.setVisibility(hasSelectionOverride(((androidx.media3.common.Player) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.ui.PlayerControlView.this.player)).getTrackSelectionParameters()) ? 4 : 0);
            subSettingViewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$AudioTrackSelectionAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.f$0.m445xa84b12b0(view);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onBindViewHolderAtZeroPosition$0$androidx-media3-ui-PlayerControlView$AudioTrackSelectionAdapter, reason: not valid java name */
        /* synthetic */ void m445xa84b12b0(android.view.View view) {
            if (androidx.media3.ui.PlayerControlView.this.player == null || !androidx.media3.ui.PlayerControlView.this.player.isCommandAvailable(29)) {
                return;
            }
            ((androidx.media3.common.Player) androidx.media3.common.util.Util.castNonNull(androidx.media3.ui.PlayerControlView.this.player)).setTrackSelectionParameters(androidx.media3.ui.PlayerControlView.this.player.getTrackSelectionParameters().buildUpon().clearOverridesOfType(1).setTrackTypeDisabled(1, false).build());
            androidx.media3.ui.PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, androidx.media3.ui.PlayerControlView.this.getResources().getString(androidx.media3.ui.R.string.exo_track_selection_auto));
            androidx.media3.ui.PlayerControlView.this.settingsWindow.dismiss();
        }

        private boolean hasSelectionOverride(androidx.media3.common.TrackSelectionParameters trackSelectionParameters) {
            for (int i = 0; i < this.tracks.size(); i++) {
                if (trackSelectionParameters.overrides.containsKey(this.tracks.get(i).trackGroup.getMediaTrackGroup())) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void onTrackSelection(java.lang.String str) {
            androidx.media3.ui.PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, str);
        }

        @Override // androidx.media3.ui.PlayerControlView.TrackSelectionAdapter
        public void init(java.util.List<androidx.media3.ui.PlayerControlView.TrackInformation> list) {
            this.tracks = list;
            androidx.media3.common.TrackSelectionParameters trackSelectionParameters = ((androidx.media3.common.Player) androidx.media3.common.util.Assertions.checkNotNull(androidx.media3.ui.PlayerControlView.this.player)).getTrackSelectionParameters();
            if (list.isEmpty()) {
                androidx.media3.ui.PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, androidx.media3.ui.PlayerControlView.this.getResources().getString(androidx.media3.ui.R.string.exo_track_selection_none));
                return;
            }
            if (!hasSelectionOverride(trackSelectionParameters)) {
                androidx.media3.ui.PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, androidx.media3.ui.PlayerControlView.this.getResources().getString(androidx.media3.ui.R.string.exo_track_selection_auto));
                return;
            }
            for (int i = 0; i < list.size(); i++) {
                androidx.media3.ui.PlayerControlView.TrackInformation trackInformation = list.get(i);
                if (trackInformation.isSelected()) {
                    androidx.media3.ui.PlayerControlView.this.settingsAdapter.setSubTextAtPosition(1, trackInformation.trackName);
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    abstract class TrackSelectionAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<androidx.media3.ui.PlayerControlView.SubSettingViewHolder> {
        protected java.util.List<androidx.media3.ui.PlayerControlView.TrackInformation> tracks = new java.util.ArrayList();

        public abstract void init(java.util.List<androidx.media3.ui.PlayerControlView.TrackInformation> list);

        protected abstract void onBindViewHolderAtZeroPosition(androidx.media3.ui.PlayerControlView.SubSettingViewHolder subSettingViewHolder);

        protected abstract void onTrackSelection(java.lang.String str);

        protected TrackSelectionAdapter() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public androidx.media3.ui.PlayerControlView.SubSettingViewHolder onCreateViewHolder(android.view.ViewGroup viewGroup, int i) {
            return new androidx.media3.ui.PlayerControlView.SubSettingViewHolder(android.view.LayoutInflater.from(androidx.media3.ui.PlayerControlView.this.getContext()).inflate(androidx.media3.ui.R.layout.exo_styled_sub_settings_list_item, viewGroup, false));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public void onBindViewHolder(androidx.media3.ui.PlayerControlView.SubSettingViewHolder subSettingViewHolder, int i) {
            final androidx.media3.common.Player player = androidx.media3.ui.PlayerControlView.this.player;
            if (player == null) {
                return;
            }
            if (i == 0) {
                onBindViewHolderAtZeroPosition(subSettingViewHolder);
                return;
            }
            final androidx.media3.ui.PlayerControlView.TrackInformation trackInformation = this.tracks.get(i - 1);
            final androidx.media3.common.TrackGroup mediaTrackGroup = trackInformation.trackGroup.getMediaTrackGroup();
            boolean z = player.getTrackSelectionParameters().overrides.get(mediaTrackGroup) != null && trackInformation.isSelected();
            subSettingViewHolder.textView.setText(trackInformation.trackName);
            subSettingViewHolder.checkView.setVisibility(z ? 0 : 4);
            subSettingViewHolder.itemView.setOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlView$TrackSelectionAdapter$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.f$0.m449x45c3fb1a(player, mediaTrackGroup, trackInformation, view);
                }
            });
        }

        /* JADX INFO: renamed from: lambda$onBindViewHolder$0$androidx-media3-ui-PlayerControlView$TrackSelectionAdapter, reason: not valid java name */
        /* synthetic */ void m449x45c3fb1a(androidx.media3.common.Player player, androidx.media3.common.TrackGroup trackGroup, androidx.media3.ui.PlayerControlView.TrackInformation trackInformation, android.view.View view) {
            if (player.isCommandAvailable(29)) {
                player.setTrackSelectionParameters(player.getTrackSelectionParameters().buildUpon().setOverrideForType(new androidx.media3.common.TrackSelectionOverride(trackGroup, com.google.common.collect.ImmutableList.of(java.lang.Integer.valueOf(trackInformation.trackIndex)))).setTrackTypeDisabled(trackInformation.trackGroup.getType(), false).build());
                onTrackSelection(trackInformation.trackName);
                androidx.media3.ui.PlayerControlView.this.settingsWindow.dismiss();
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemCount() {
            if (this.tracks.isEmpty()) {
                return 0;
            }
            return this.tracks.size() + 1;
        }

        protected void clear() {
            this.tracks = java.util.Collections.emptyList();
        }
    }

    private static class SubSettingViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        public final android.view.View checkView;
        public final android.widget.TextView textView;

        public SubSettingViewHolder(android.view.View view) {
            super(view);
            if (androidx.media3.common.util.Util.SDK_INT < 26) {
                view.setFocusable(true);
            }
            this.textView = (android.widget.TextView) view.findViewById(androidx.media3.ui.R.id.exo_text);
            this.checkView = view.findViewById(androidx.media3.ui.R.id.exo_check);
        }
    }
}
