package androidx.media3.ui;

/* JADX INFO: loaded from: classes3.dex */
final class PlayerControlViewLayoutManager {
    private static final long ANIMATION_INTERVAL_MS = 2000;
    private static final long DURATION_FOR_HIDING_ANIMATION_MS = 250;
    private static final long DURATION_FOR_SHOWING_ANIMATION_MS = 250;
    private static final int UX_STATE_ALL_VISIBLE = 0;
    private static final int UX_STATE_ANIMATING_HIDE = 3;
    private static final int UX_STATE_ANIMATING_SHOW = 4;
    private static final int UX_STATE_NONE_VISIBLE = 2;
    private static final int UX_STATE_ONLY_PROGRESS_VISIBLE = 1;
    private final android.view.ViewGroup basicControls;
    private final android.view.ViewGroup bottomBar;
    private final android.view.ViewGroup centerControls;
    private final android.view.View controlsBackground;
    private final android.view.ViewGroup extraControls;
    private final android.view.ViewGroup extraControlsScrollView;
    private final android.animation.AnimatorSet hideAllBarsAnimator;
    private final android.animation.AnimatorSet hideMainBarAnimator;
    private final android.animation.AnimatorSet hideProgressBarAnimator;
    private boolean isMinimalMode;
    private final android.view.ViewGroup minimalControls;
    private boolean needToShowBars;
    private final android.animation.ValueAnimator overflowHideAnimator;
    private final android.animation.ValueAnimator overflowShowAnimator;
    private final android.view.View overflowShowButton;
    private final androidx.media3.ui.PlayerControlView playerControlView;
    private final android.animation.AnimatorSet showAllBarsAnimator;
    private final android.animation.AnimatorSet showMainBarAnimator;
    private final android.view.View timeBar;
    private final android.view.ViewGroup timeView;
    private final java.lang.Runnable showAllBarsRunnable = new java.lang.Runnable() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda5
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.showAllBars();
        }
    };
    private final java.lang.Runnable hideAllBarsRunnable = new java.lang.Runnable() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda8
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.hideAllBars();
        }
    };
    private final java.lang.Runnable hideProgressBarRunnable = new java.lang.Runnable() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda9
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.hideProgressBar();
        }
    };
    private final java.lang.Runnable hideMainBarRunnable = new java.lang.Runnable() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda10
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.hideMainBar();
        }
    };
    private final java.lang.Runnable hideControllerRunnable = new java.lang.Runnable() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda11
        @Override // java.lang.Runnable
        public final void run() {
            this.f$0.hideController();
        }
    };
    private final android.view.View.OnLayoutChangeListener onLayoutChangeListener = new android.view.View.OnLayoutChangeListener() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda12
        @Override // android.view.View.OnLayoutChangeListener
        public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            this.f$0.onLayoutChange(view, i, i2, i3, i4, i5, i6, i7, i8);
        }
    };
    private boolean animationEnabled = true;
    private int uxState = 0;
    private final java.util.List<android.view.View> shownButtons = new java.util.ArrayList();

    public PlayerControlViewLayoutManager(final androidx.media3.ui.PlayerControlView playerControlView) {
        this.playerControlView = playerControlView;
        this.controlsBackground = playerControlView.findViewById(androidx.media3.ui.R.id.exo_controls_background);
        this.centerControls = (android.view.ViewGroup) playerControlView.findViewById(androidx.media3.ui.R.id.exo_center_controls);
        this.minimalControls = (android.view.ViewGroup) playerControlView.findViewById(androidx.media3.ui.R.id.exo_minimal_controls);
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) playerControlView.findViewById(androidx.media3.ui.R.id.exo_bottom_bar);
        this.bottomBar = viewGroup;
        this.timeView = (android.view.ViewGroup) playerControlView.findViewById(androidx.media3.ui.R.id.exo_time);
        android.view.View viewFindViewById = playerControlView.findViewById(androidx.media3.ui.R.id.exo_progress);
        this.timeBar = viewFindViewById;
        this.basicControls = (android.view.ViewGroup) playerControlView.findViewById(androidx.media3.ui.R.id.exo_basic_controls);
        this.extraControls = (android.view.ViewGroup) playerControlView.findViewById(androidx.media3.ui.R.id.exo_extra_controls);
        this.extraControlsScrollView = (android.view.ViewGroup) playerControlView.findViewById(androidx.media3.ui.R.id.exo_extra_controls_scroll_view);
        android.view.View viewFindViewById2 = playerControlView.findViewById(androidx.media3.ui.R.id.exo_overflow_show);
        this.overflowShowButton = viewFindViewById2;
        android.view.View viewFindViewById3 = playerControlView.findViewById(androidx.media3.ui.R.id.exo_overflow_hide);
        if (viewFindViewById2 != null && viewFindViewById3 != null) {
            viewFindViewById2.setOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.f$0.onOverflowButtonClick(view);
                }
            });
            viewFindViewById3.setOnClickListener(new android.view.View.OnClickListener() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda1
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    this.f$0.onOverflowButtonClick(view);
                }
            });
        }
        android.animation.ValueAnimator valueAnimatorOfFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                this.f$0.m453lambda$new$0$androidxmedia3uiPlayerControlViewLayoutManager(valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                if (!(androidx.media3.ui.PlayerControlViewLayoutManager.this.timeBar instanceof androidx.media3.ui.DefaultTimeBar) || androidx.media3.ui.PlayerControlViewLayoutManager.this.isMinimalMode) {
                    return;
                }
                ((androidx.media3.ui.DefaultTimeBar) androidx.media3.ui.PlayerControlViewLayoutManager.this.timeBar).hideScrubber(250L);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.controlsBackground != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.controlsBackground.setVisibility(4);
                }
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.centerControls != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.centerControls.setVisibility(4);
                }
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.minimalControls != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.minimalControls.setVisibility(4);
                }
            }
        });
        android.animation.ValueAnimator valueAnimatorOfFloat2 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat2.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimatorOfFloat2.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda3
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                this.f$0.m454lambda$new$1$androidxmedia3uiPlayerControlViewLayoutManager(valueAnimator);
            }
        });
        valueAnimatorOfFloat2.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.controlsBackground != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.controlsBackground.setVisibility(0);
                }
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.centerControls != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.centerControls.setVisibility(0);
                }
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.minimalControls != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.minimalControls.setVisibility(androidx.media3.ui.PlayerControlViewLayoutManager.this.isMinimalMode ? 0 : 4);
                }
                if (!(androidx.media3.ui.PlayerControlViewLayoutManager.this.timeBar instanceof androidx.media3.ui.DefaultTimeBar) || androidx.media3.ui.PlayerControlViewLayoutManager.this.isMinimalMode) {
                    return;
                }
                ((androidx.media3.ui.DefaultTimeBar) androidx.media3.ui.PlayerControlViewLayoutManager.this.timeBar).showScrubber(250L);
            }
        });
        android.content.res.Resources resources = playerControlView.getResources();
        float dimension = resources.getDimension(androidx.media3.ui.R.dimen.exo_styled_bottom_bar_height) - resources.getDimension(androidx.media3.ui.R.dimen.exo_styled_progress_bar_height);
        float dimension2 = resources.getDimension(androidx.media3.ui.R.dimen.exo_styled_bottom_bar_height);
        android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
        this.hideMainBarAnimator = animatorSet;
        animatorSet.setDuration(250L);
        animatorSet.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.3
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(3);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(1);
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.needToShowBars) {
                    playerControlView.post(androidx.media3.ui.PlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }
        });
        animatorSet.play(valueAnimatorOfFloat).with(ofTranslationY(0.0f, dimension, viewFindViewById)).with(ofTranslationY(0.0f, dimension, viewGroup));
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        this.hideProgressBarAnimator = animatorSet2;
        animatorSet2.setDuration(250L);
        animatorSet2.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(3);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(2);
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.needToShowBars) {
                    playerControlView.post(androidx.media3.ui.PlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }
        });
        animatorSet2.play(ofTranslationY(dimension, dimension2, viewFindViewById)).with(ofTranslationY(dimension, dimension2, viewGroup));
        android.animation.AnimatorSet animatorSet3 = new android.animation.AnimatorSet();
        this.hideAllBarsAnimator = animatorSet3;
        animatorSet3.setDuration(250L);
        animatorSet3.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.5
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(3);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(2);
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.needToShowBars) {
                    playerControlView.post(androidx.media3.ui.PlayerControlViewLayoutManager.this.showAllBarsRunnable);
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.needToShowBars = false;
                }
            }
        });
        animatorSet3.play(valueAnimatorOfFloat).with(ofTranslationY(0.0f, dimension2, viewFindViewById)).with(ofTranslationY(0.0f, dimension2, viewGroup));
        android.animation.AnimatorSet animatorSet4 = new android.animation.AnimatorSet();
        this.showMainBarAnimator = animatorSet4;
        animatorSet4.setDuration(250L);
        animatorSet4.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.6
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(4);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(0);
            }
        });
        animatorSet4.play(valueAnimatorOfFloat2).with(ofTranslationY(dimension, 0.0f, viewFindViewById)).with(ofTranslationY(dimension, 0.0f, viewGroup));
        android.animation.AnimatorSet animatorSet5 = new android.animation.AnimatorSet();
        this.showAllBarsAnimator = animatorSet5;
        animatorSet5.setDuration(250L);
        animatorSet5.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.7
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(4);
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                androidx.media3.ui.PlayerControlViewLayoutManager.this.setUxState(0);
            }
        });
        animatorSet5.play(valueAnimatorOfFloat2).with(ofTranslationY(dimension2, 0.0f, viewFindViewById)).with(ofTranslationY(dimension2, 0.0f, viewGroup));
        android.animation.ValueAnimator valueAnimatorOfFloat3 = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
        this.overflowShowAnimator = valueAnimatorOfFloat3;
        valueAnimatorOfFloat3.setDuration(250L);
        valueAnimatorOfFloat3.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda6
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                this.f$0.m455lambda$new$2$androidxmedia3uiPlayerControlViewLayoutManager(valueAnimator);
            }
        });
        valueAnimatorOfFloat3.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.8
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.extraControlsScrollView != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.extraControlsScrollView.setVisibility(0);
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.extraControlsScrollView.setTranslationX(androidx.media3.ui.PlayerControlViewLayoutManager.this.extraControlsScrollView.getWidth());
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.extraControlsScrollView.scrollTo(androidx.media3.ui.PlayerControlViewLayoutManager.this.extraControlsScrollView.getWidth(), 0);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.basicControls != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.basicControls.setVisibility(4);
                }
            }
        });
        android.animation.ValueAnimator valueAnimatorOfFloat4 = android.animation.ValueAnimator.ofFloat(1.0f, 0.0f);
        this.overflowHideAnimator = valueAnimatorOfFloat4;
        valueAnimatorOfFloat4.setDuration(250L);
        valueAnimatorOfFloat4.addUpdateListener(new android.animation.ValueAnimator.AnimatorUpdateListener() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda7
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(android.animation.ValueAnimator valueAnimator) {
                this.f$0.m456lambda$new$3$androidxmedia3uiPlayerControlViewLayoutManager(valueAnimator);
            }
        });
        valueAnimatorOfFloat4.addListener(new android.animation.AnimatorListenerAdapter() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager.9
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(android.animation.Animator animator) {
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.basicControls != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.basicControls.setVisibility(0);
                }
            }

            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(android.animation.Animator animator) {
                if (androidx.media3.ui.PlayerControlViewLayoutManager.this.extraControlsScrollView != null) {
                    androidx.media3.ui.PlayerControlViewLayoutManager.this.extraControlsScrollView.setVisibility(4);
                }
            }
        });
    }

    /* JADX INFO: renamed from: lambda$new$0$androidx-media3-ui-PlayerControlViewLayoutManager, reason: not valid java name */
    /* synthetic */ void m453lambda$new$0$androidxmedia3uiPlayerControlViewLayoutManager(android.animation.ValueAnimator valueAnimator) {
        float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        android.view.View view = this.controlsBackground;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        android.view.ViewGroup viewGroup = this.centerControls;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        android.view.ViewGroup viewGroup2 = this.minimalControls;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: lambda$new$1$androidx-media3-ui-PlayerControlViewLayoutManager, reason: not valid java name */
    /* synthetic */ void m454lambda$new$1$androidxmedia3uiPlayerControlViewLayoutManager(android.animation.ValueAnimator valueAnimator) {
        float fFloatValue = ((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue();
        android.view.View view = this.controlsBackground;
        if (view != null) {
            view.setAlpha(fFloatValue);
        }
        android.view.ViewGroup viewGroup = this.centerControls;
        if (viewGroup != null) {
            viewGroup.setAlpha(fFloatValue);
        }
        android.view.ViewGroup viewGroup2 = this.minimalControls;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(fFloatValue);
        }
    }

    /* JADX INFO: renamed from: lambda$new$2$androidx-media3-ui-PlayerControlViewLayoutManager, reason: not valid java name */
    /* synthetic */ void m455lambda$new$2$androidxmedia3uiPlayerControlViewLayoutManager(android.animation.ValueAnimator valueAnimator) {
        animateOverflow(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: renamed from: lambda$new$3$androidx-media3-ui-PlayerControlViewLayoutManager, reason: not valid java name */
    /* synthetic */ void m456lambda$new$3$androidxmedia3uiPlayerControlViewLayoutManager(android.animation.ValueAnimator valueAnimator) {
        animateOverflow(((java.lang.Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    public void show() {
        if (!this.playerControlView.isVisible()) {
            this.playerControlView.setVisibility(0);
            this.playerControlView.updateAll();
            this.playerControlView.requestPlayPauseFocus();
        }
        showAllBars();
    }

    public void hide() {
        int i = this.uxState;
        if (i == 3 || i == 2) {
            return;
        }
        removeHideCallbacks();
        if (!this.animationEnabled) {
            hideController();
        } else if (this.uxState == 1) {
            hideProgressBar();
        } else {
            hideAllBars();
        }
    }

    public void hideImmediately() {
        int i = this.uxState;
        if (i == 3 || i == 2) {
            return;
        }
        removeHideCallbacks();
        hideController();
    }

    public void setAnimationEnabled(boolean z) {
        this.animationEnabled = z;
    }

    public boolean isAnimationEnabled() {
        return this.animationEnabled;
    }

    public void resetHideCallbacks() {
        if (this.uxState == 3) {
            return;
        }
        removeHideCallbacks();
        int showTimeoutMs = this.playerControlView.getShowTimeoutMs();
        if (showTimeoutMs > 0) {
            if (!this.animationEnabled) {
                postDelayedRunnable(this.hideControllerRunnable, showTimeoutMs);
            } else if (this.uxState == 1) {
                postDelayedRunnable(this.hideProgressBarRunnable, 2000L);
            } else {
                postDelayedRunnable(this.hideMainBarRunnable, showTimeoutMs);
            }
        }
    }

    public void removeHideCallbacks() {
        this.playerControlView.removeCallbacks(this.hideControllerRunnable);
        this.playerControlView.removeCallbacks(this.hideAllBarsRunnable);
        this.playerControlView.removeCallbacks(this.hideMainBarRunnable);
        this.playerControlView.removeCallbacks(this.hideProgressBarRunnable);
    }

    public void onAttachedToWindow() {
        this.playerControlView.addOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    public void onDetachedFromWindow() {
        this.playerControlView.removeOnLayoutChangeListener(this.onLayoutChangeListener);
    }

    public boolean isFullyVisible() {
        return this.uxState == 0 && this.playerControlView.isVisible();
    }

    public void setShowButton(android.view.View view, boolean z) {
        if (view == null) {
            return;
        }
        if (!z) {
            view.setVisibility(8);
            this.shownButtons.remove(view);
            return;
        }
        if (this.isMinimalMode && shouldHideInMinimalMode(view)) {
            view.setVisibility(4);
        } else {
            view.setVisibility(0);
        }
        this.shownButtons.add(view);
    }

    public boolean getShowButton(android.view.View view) {
        return view != null && this.shownButtons.contains(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUxState(int i) {
        int i2 = this.uxState;
        this.uxState = i;
        if (i == 2) {
            this.playerControlView.setVisibility(8);
        } else if (i2 == 2) {
            this.playerControlView.setVisibility(0);
        }
        if (i2 != i) {
            this.playerControlView.notifyOnVisibilityChange();
        }
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        android.view.View view = this.controlsBackground;
        if (view != null) {
            view.layout(0, 0, i3 - i, i4 - i2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        boolean zUseMinimalMode = useMinimalMode();
        if (this.isMinimalMode != zUseMinimalMode) {
            this.isMinimalMode = zUseMinimalMode;
            view.post(new java.lang.Runnable() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f$0.updateLayoutForSizeChange();
                }
            });
        }
        boolean z = i3 - i != i7 - i5;
        if (this.isMinimalMode || !z) {
            return;
        }
        view.post(new java.lang.Runnable() { // from class: androidx.media3.ui.PlayerControlViewLayoutManager$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.onLayoutWidthChanged();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onOverflowButtonClick(android.view.View view) {
        resetHideCallbacks();
        if (view.getId() == androidx.media3.ui.R.id.exo_overflow_show) {
            this.overflowShowAnimator.start();
        } else if (view.getId() == androidx.media3.ui.R.id.exo_overflow_hide) {
            this.overflowHideAnimator.start();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showAllBars() {
        if (!this.animationEnabled) {
            setUxState(0);
            resetHideCallbacks();
            return;
        }
        int i = this.uxState;
        if (i == 1) {
            this.showMainBarAnimator.start();
        } else if (i == 2) {
            this.showAllBarsAnimator.start();
        } else if (i == 3) {
            this.needToShowBars = true;
        } else if (i == 4) {
            return;
        }
        resetHideCallbacks();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideAllBars() {
        this.hideAllBarsAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideProgressBar() {
        this.hideProgressBarAnimator.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideMainBar() {
        this.hideMainBarAnimator.start();
        postDelayedRunnable(this.hideProgressBarRunnable, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void hideController() {
        setUxState(2);
    }

    private static android.animation.ObjectAnimator ofTranslationY(float f, float f2, android.view.View view) {
        return android.animation.ObjectAnimator.ofFloat(view, "translationY", f, f2);
    }

    private void postDelayedRunnable(java.lang.Runnable runnable, long j) {
        if (j >= 0) {
            this.playerControlView.postDelayed(runnable, j);
        }
    }

    private void animateOverflow(float f) {
        android.view.ViewGroup viewGroup = this.extraControlsScrollView;
        if (viewGroup != null) {
            this.extraControlsScrollView.setTranslationX((int) (viewGroup.getWidth() * (1.0f - f)));
        }
        android.view.ViewGroup viewGroup2 = this.timeView;
        if (viewGroup2 != null) {
            viewGroup2.setAlpha(1.0f - f);
        }
        android.view.ViewGroup viewGroup3 = this.basicControls;
        if (viewGroup3 != null) {
            viewGroup3.setAlpha(1.0f - f);
        }
    }

    private boolean useMinimalMode() {
        int width = (this.playerControlView.getWidth() - this.playerControlView.getPaddingLeft()) - this.playerControlView.getPaddingRight();
        int height = (this.playerControlView.getHeight() - this.playerControlView.getPaddingBottom()) - this.playerControlView.getPaddingTop();
        int widthWithMargins = getWidthWithMargins(this.centerControls);
        android.view.ViewGroup viewGroup = this.centerControls;
        int paddingLeft = widthWithMargins - (viewGroup != null ? viewGroup.getPaddingLeft() + this.centerControls.getPaddingRight() : 0);
        int heightWithMargins = getHeightWithMargins(this.centerControls);
        android.view.ViewGroup viewGroup2 = this.centerControls;
        return width <= java.lang.Math.max(paddingLeft, getWidthWithMargins(this.timeView) + getWidthWithMargins(this.overflowShowButton)) || height <= (heightWithMargins - (viewGroup2 != null ? viewGroup2.getPaddingTop() + this.centerControls.getPaddingBottom() : 0)) + (getHeightWithMargins(this.bottomBar) * 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateLayoutForSizeChange() {
        android.view.ViewGroup viewGroup = this.minimalControls;
        if (viewGroup != null) {
            viewGroup.setVisibility(this.isMinimalMode ? 0 : 4);
        }
        if (this.timeBar != null) {
            int dimensionPixelSize = this.playerControlView.getResources().getDimensionPixelSize(androidx.media3.ui.R.dimen.exo_styled_progress_margin_bottom);
            android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) this.timeBar.getLayoutParams();
            if (marginLayoutParams != null) {
                if (this.isMinimalMode) {
                    dimensionPixelSize = 0;
                }
                marginLayoutParams.bottomMargin = dimensionPixelSize;
                this.timeBar.setLayoutParams(marginLayoutParams);
            }
            android.view.View view = this.timeBar;
            if (view instanceof androidx.media3.ui.DefaultTimeBar) {
                androidx.media3.ui.DefaultTimeBar defaultTimeBar = (androidx.media3.ui.DefaultTimeBar) view;
                if (this.isMinimalMode) {
                    defaultTimeBar.hideScrubber(true);
                } else {
                    int i = this.uxState;
                    if (i == 1) {
                        defaultTimeBar.hideScrubber(false);
                    } else if (i != 3) {
                        defaultTimeBar.showScrubber();
                    }
                }
            }
        }
        for (android.view.View view2 : this.shownButtons) {
            view2.setVisibility((this.isMinimalMode && shouldHideInMinimalMode(view2)) ? 4 : 0);
        }
    }

    private boolean shouldHideInMinimalMode(android.view.View view) {
        int id = view.getId();
        return id == androidx.media3.ui.R.id.exo_bottom_bar || id == androidx.media3.ui.R.id.exo_prev || id == androidx.media3.ui.R.id.exo_next || id == androidx.media3.ui.R.id.exo_rew || id == androidx.media3.ui.R.id.exo_rew_with_amount || id == androidx.media3.ui.R.id.exo_ffwd || id == androidx.media3.ui.R.id.exo_ffwd_with_amount;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onLayoutWidthChanged() {
        int i;
        if (this.basicControls == null || this.extraControls == null) {
            return;
        }
        int width = (this.playerControlView.getWidth() - this.playerControlView.getPaddingLeft()) - this.playerControlView.getPaddingRight();
        while (true) {
            if (this.extraControls.getChildCount() <= 1) {
                break;
            }
            int childCount = this.extraControls.getChildCount() - 2;
            android.view.View childAt = this.extraControls.getChildAt(childCount);
            this.extraControls.removeViewAt(childCount);
            this.basicControls.addView(childAt, 0);
        }
        android.view.View view = this.overflowShowButton;
        if (view != null) {
            view.setVisibility(8);
        }
        int widthWithMargins = getWidthWithMargins(this.timeView);
        int childCount2 = this.basicControls.getChildCount() - 1;
        for (int i2 = 0; i2 < childCount2; i2++) {
            widthWithMargins += getWidthWithMargins(this.basicControls.getChildAt(i2));
        }
        if (widthWithMargins > width) {
            android.view.View view2 = this.overflowShowButton;
            if (view2 != null) {
                view2.setVisibility(0);
                widthWithMargins += getWidthWithMargins(this.overflowShowButton);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (int i3 = 0; i3 < childCount2; i3++) {
                android.view.View childAt2 = this.basicControls.getChildAt(i3);
                widthWithMargins -= getWidthWithMargins(childAt2);
                arrayList.add(childAt2);
                if (widthWithMargins <= width) {
                    break;
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            this.basicControls.removeViews(0, arrayList.size());
            for (i = 0; i < arrayList.size(); i++) {
                this.extraControls.addView((android.view.View) arrayList.get(i), this.extraControls.getChildCount() - 1);
            }
            return;
        }
        android.view.ViewGroup viewGroup = this.extraControlsScrollView;
        if (viewGroup == null || viewGroup.getVisibility() != 0 || this.overflowHideAnimator.isStarted()) {
            return;
        }
        this.overflowShowAnimator.cancel();
        this.overflowHideAnimator.start();
    }

    private static int getWidthWithMargins(android.view.View view) {
        if (view == null) {
            return 0;
        }
        int width = view.getWidth();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return width;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        return width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
    }

    private static int getHeightWithMargins(android.view.View view) {
        if (view == null) {
            return 0;
        }
        int height = view.getHeight();
        android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof android.view.ViewGroup.MarginLayoutParams)) {
            return height;
        }
        android.view.ViewGroup.MarginLayoutParams marginLayoutParams = (android.view.ViewGroup.MarginLayoutParams) layoutParams;
        return height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }
}
