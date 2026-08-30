package com.applovin.mediation.nativeAds;

/* JADX INFO: loaded from: classes3.dex */
public class MaxNativeAdView extends android.widget.FrameLayout {
    public static final java.lang.String MEDIUM_TEMPLATE_1 = "medium_template_1";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final android.view.View f1593a;
    private final android.widget.TextView b;
    private final android.widget.TextView c;
    private final android.widget.TextView d;
    private final android.widget.Button f;
    private final android.widget.ImageView g;
    private final android.widget.FrameLayout h;
    private final android.view.ViewGroup i;
    private final android.widget.FrameLayout j;
    private final android.view.ViewGroup k;
    private final android.view.ViewGroup l;
    private final android.widget.FrameLayout m;
    private com.applovin.impl.mediation.ads.b n;

    class a implements android.view.ViewTreeObserver.OnPreDrawListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ java.lang.ref.WeakReference f1594a;
        final /* synthetic */ android.view.ViewGroup b;

        a(java.lang.ref.WeakReference weakReference, android.view.ViewGroup viewGroup) {
            this.f1594a = weakReference;
            this.b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            android.view.ViewTreeObserver viewTreeObserver = (android.view.ViewTreeObserver) this.f1594a.get();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                com.applovin.impl.sdk.j.u0.I();
                if (com.applovin.impl.sdk.n.a()) {
                    com.applovin.impl.sdk.j.u0.I().k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            } else {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f1594a.clear();
            android.widget.LinearLayout.LayoutParams layoutParams = (android.widget.LinearLayout.LayoutParams) this.b.getLayoutParams();
            layoutParams.height = ((android.view.View) this.b.getParent()).getWidth();
            this.b.setLayoutParams(layoutParams);
            return true;
        }
    }

    public MaxNativeAdView(com.applovin.mediation.nativeAds.MaxNativeAd maxNativeAd, android.app.Activity activity) {
        this(maxNativeAd, (java.lang.String) null, activity);
    }

    private void b() {
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) findViewById(com.applovin.sdk.R.id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        android.view.ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new com.applovin.mediation.nativeAds.MaxNativeAdView.a(new java.lang.ref.WeakReference(viewTreeObserver), viewGroup));
        }
    }

    public com.applovin.impl.mediation.ads.b getAdViewTracker() {
        return this.n;
    }

    public android.widget.TextView getAdvertiserTextView() {
        return this.c;
    }

    public android.widget.TextView getBodyTextView() {
        return this.d;
    }

    public android.widget.Button getCallToActionButton() {
        return this.f;
    }

    public java.util.List<android.view.View> getClickableViews() {
        java.util.ArrayList arrayList = new java.util.ArrayList(5);
        android.widget.TextView textView = this.b;
        if (textView != null) {
            arrayList.add(textView);
        }
        android.widget.TextView textView2 = this.c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        android.widget.TextView textView3 = this.d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        android.widget.Button button = this.f;
        if (button != null) {
            arrayList.add(button);
        }
        android.widget.ImageView imageView = this.g;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @java.lang.Deprecated
    public android.widget.FrameLayout getIconContentView() {
        return this.h;
    }

    public android.widget.ImageView getIconImageView() {
        return this.g;
    }

    public android.view.View getMainView() {
        return this.f1593a;
    }

    @java.lang.Deprecated
    public android.widget.FrameLayout getMediaContentView() {
        return this.m;
    }

    public android.view.ViewGroup getMediaContentViewGroup() {
        android.view.ViewGroup viewGroup = this.l;
        return viewGroup != null ? viewGroup : this.m;
    }

    @java.lang.Deprecated
    public android.widget.FrameLayout getOptionsContentView() {
        return this.j;
    }

    public android.view.ViewGroup getOptionsContentViewGroup() {
        android.view.ViewGroup viewGroup = this.i;
        return viewGroup != null ? viewGroup : this.j;
    }

    public android.view.ViewGroup getStarRatingContentViewGroup() {
        return this.k;
    }

    public android.widget.TextView getTitleTextView() {
        return this.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.applovin.impl.mediation.ads.b bVar = this.n;
        if (bVar != null) {
            bVar.c();
        }
        if (isHardwareAccelerated()) {
            return;
        }
        com.applovin.impl.sdk.n.j("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }

    public void recycle() {
        setOnClickListener(null);
        com.applovin.impl.mediation.ads.b bVar = this.n;
        if (bVar != null) {
            bVar.a();
            this.n = null;
        }
        android.view.View view = this.f1593a;
        if (view == null || view.getParent() == this) {
            return;
        }
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) this.f1593a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f1593a);
    }

    public void renderCustomNativeAdView(com.applovin.mediation.nativeAds.MaxNativeAd maxNativeAd) {
        android.widget.TextView textView = this.b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        android.widget.TextView textView2 = this.d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        android.widget.TextView textView3 = this.c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        android.widget.Button button = this.f;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        com.applovin.mediation.nativeAds.MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        android.widget.ImageView imageView = this.g;
        if (imageView != null) {
            if (icon == null) {
                imageView.setImageDrawable(null);
            } else if (icon.getDrawable() != null) {
                this.g.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null) {
                com.applovin.impl.sdk.utils.ImageViewUtils.setAndDownscaleImageUri(this.g, icon.getUri());
            } else {
                this.g.setImageDrawable(null);
            }
        }
        android.view.View mediaView = maxNativeAd.getMediaView();
        android.view.ViewGroup viewGroup = this.l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                android.view.ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((android.view.ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                this.l.addView(mediaView);
            }
        }
        android.view.View optionsView = maxNativeAd.getOptionsView();
        android.view.ViewGroup viewGroup2 = this.i;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                android.view.ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((android.view.ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                this.i.addView(optionsView);
                this.i.bringToFront();
            }
        }
        android.view.ViewGroup viewGroup3 = this.k;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            java.lang.Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView appLovinStarRatingView = new com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                this.k.addView(appLovinStarRatingView);
            }
        }
    }

    public MaxNativeAdView(java.lang.String str, android.content.Context context) {
        this((com.applovin.mediation.nativeAds.MaxNativeAd) null, str, context);
    }

    private int a(java.lang.String str, com.applovin.mediation.MaxAdFormat maxAdFormat) {
        if (maxAdFormat == com.applovin.mediation.MaxAdFormat.NATIVE) {
            if ("small_template_1".equalsIgnoreCase(str)) {
                return com.applovin.sdk.R.layout.max_native_ad_small_template_1;
            }
            if (MEDIUM_TEMPLATE_1.equalsIgnoreCase(str)) {
                return com.applovin.sdk.R.layout.max_native_ad_medium_template_1;
            }
            throw new java.lang.IllegalArgumentException("Attempting to render MAX native ad with invalid format: " + str);
        }
        if (maxAdFormat != com.applovin.mediation.MaxAdFormat.BANNER) {
            if (maxAdFormat == com.applovin.mediation.MaxAdFormat.LEADER) {
                return "vertical_leader_template".equals(str) ? com.applovin.sdk.R.layout.max_native_ad_vertical_leader_view : com.applovin.sdk.R.layout.max_native_ad_leader_view;
            }
            if (maxAdFormat == com.applovin.mediation.MaxAdFormat.MREC) {
                return com.applovin.sdk.R.layout.max_native_ad_mrec_view;
            }
            throw new java.lang.IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
        }
        if ("vertical_banner_template".equals(str)) {
            return com.applovin.sdk.R.layout.max_native_ad_vertical_banner_view;
        }
        if ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) {
            return com.applovin.sdk.R.layout.max_native_ad_media_banner_view;
        }
        return "vertical_media_banner_template".equals(str) ? com.applovin.sdk.R.layout.max_native_ad_vertical_media_banner_view : com.applovin.sdk.R.layout.max_native_ad_banner_view;
    }

    @java.lang.Deprecated
    public MaxNativeAdView(com.applovin.mediation.nativeAds.MaxNativeAd maxNativeAd, java.lang.String str, android.app.Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    public MaxNativeAdView(com.applovin.mediation.nativeAds.MaxNativeAd maxNativeAd, java.lang.String str, android.content.Context context) {
        this(maxNativeAd, new com.applovin.mediation.nativeAds.MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(com.applovin.sdk.R.id.applovin_native_title_text_view).setAdvertiserTextViewId(com.applovin.sdk.R.id.applovin_native_advertiser_text_view).setBodyTextViewId(com.applovin.sdk.R.id.applovin_native_body_text_view).setCallToActionButtonId(com.applovin.sdk.R.id.applovin_native_cta_button).setIconImageViewId(com.applovin.sdk.R.id.applovin_native_icon_image_view).setIconContentViewId(com.applovin.sdk.R.id.applovin_native_icon_view).setOptionsContentViewGroupId(com.applovin.sdk.R.id.applovin_native_options_view).setOptionsContentFrameLayoutId(com.applovin.sdk.R.id.applovin_native_options_view).setStarRatingContentViewGroupId(com.applovin.sdk.R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(com.applovin.sdk.R.id.applovin_native_media_content_view).setMediaContentFrameLayoutId(com.applovin.sdk.R.id.applovin_native_media_content_view).build(), context);
    }

    public MaxNativeAdView(com.applovin.mediation.nativeAds.MaxNativeAdViewBinder maxNativeAdViewBinder, android.content.Context context) {
        this((com.applovin.mediation.nativeAds.MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(com.applovin.mediation.nativeAds.MaxNativeAd maxNativeAd, com.applovin.mediation.nativeAds.MaxNativeAdViewBinder maxNativeAdViewBinder, android.content.Context context) {
        int iA;
        super(context);
        boolean z = maxNativeAdViewBinder.templateType != null;
        com.applovin.mediation.MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : com.applovin.mediation.MaxAdFormat.NATIVE;
        android.view.View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f1593a = view;
        } else {
            if (z) {
                iA = a(maxNativeAdViewBinder.templateType, format);
            } else {
                iA = maxNativeAdViewBinder.layoutResourceId;
            }
            this.f1593a = android.view.LayoutInflater.from(context).inflate(iA, (android.view.ViewGroup) this, false);
        }
        addView(this.f1593a);
        this.b = (android.widget.TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.c = (android.widget.TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.d = (android.widget.TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f = (android.widget.Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        this.g = (android.widget.ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.h = (android.widget.FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.i = (android.view.ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.j = (android.widget.FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.k = (android.view.ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.l = (android.view.ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.m = (android.widget.FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        if (maxNativeAd != null) {
            a(maxNativeAd);
        }
    }

    private void a(com.applovin.mediation.nativeAds.MaxNativeAd maxNativeAd) {
        if (this.b == null) {
            com.applovin.impl.sdk.n.j("MaxNativeAdView", "Rendering template ad view without title text view");
        } else if (com.applovin.impl.sdk.utils.StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.b.setText(maxNativeAd.getTitle());
        } else {
            this.b.setVisibility(8);
        }
        if (this.c != null) {
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.c.setVisibility(8);
            }
        }
        if (this.d != null) {
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(maxNativeAd.getBody())) {
                this.d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() != com.applovin.mediation.MaxAdFormat.NATIVE && maxNativeAd.getFormat() != com.applovin.mediation.MaxAdFormat.MREC) {
                this.d.setVisibility(4);
            } else {
                this.d.setVisibility(8);
            }
        }
        if (this.f != null) {
            if (com.applovin.impl.sdk.utils.StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() != com.applovin.mediation.MaxAdFormat.NATIVE && maxNativeAd.getFormat() != com.applovin.mediation.MaxAdFormat.MREC) {
                this.f.setVisibility(4);
            } else {
                this.f.setVisibility(8);
            }
        }
        com.applovin.mediation.nativeAds.MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        android.view.View iconView = maxNativeAd.getIconView();
        android.widget.FrameLayout frameLayout = this.h;
        if (frameLayout != null) {
            if (icon == null || this.g == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                    this.h.removeAllViews();
                    this.h.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.g.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null && com.applovin.impl.sdk.utils.StringUtils.isValidString(icon.getUri().toString())) {
                com.applovin.impl.sdk.utils.ImageViewUtils.setAndDownscaleImageUri(this.g, icon.getUri());
            } else {
                this.h.setVisibility(8);
            }
        }
        android.view.View optionsView = maxNativeAd.getOptionsView();
        android.widget.FrameLayout frameLayout2 = this.j;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
            this.j.addView(optionsView);
            this.j.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        android.view.View mediaView = maxNativeAd.getMediaView();
        if (this.m != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                this.m.addView(mediaView);
            } else if (maxNativeAd.getFormat() == com.applovin.mediation.MaxAdFormat.LEADER) {
                this.m.setVisibility(8);
            }
        }
        if (this.k != null) {
            java.lang.Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.k.removeAllViews();
                com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView appLovinStarRatingView = new com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
                this.k.addView(appLovinStarRatingView);
            } else {
                this.k.setVisibility(8);
            }
        }
        b();
        postDelayed(new java.lang.Runnable() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.a();
            }
        }, 2000L);
    }

    public void render(com.applovin.impl.ie ieVar, com.applovin.impl.mediation.ads.a.InterfaceC0040a interfaceC0040a, com.applovin.impl.sdk.j jVar) {
        recycle();
        if (!ieVar.s0().get() || !ieVar.q0().get()) {
            this.n = new com.applovin.impl.mediation.ads.b(ieVar, this, interfaceC0040a, jVar);
        }
        final com.applovin.mediation.nativeAds.MaxNativeAd nativeAd = ieVar.getNativeAd();
        if (ieVar.t0() && nativeAd.isContainerClickable()) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new android.view.View.OnClickListener() { // from class: com.applovin.mediation.nativeAds.MaxNativeAdView$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view) {
                    nativeAd.performClick();
                }
            });
        }
        if (com.applovin.impl.sdk.utils.StringUtils.isValidString(ieVar.r0())) {
            jVar.I();
            if (com.applovin.impl.sdk.n.a()) {
                jVar.I().a("MaxNativeAdView", "Rendering template ad view");
            }
            a(nativeAd);
            return;
        }
        jVar.I();
        if (com.applovin.impl.sdk.n.a()) {
            jVar.I().a("MaxNativeAdView", "Rendering custom ad view");
        }
        renderCustomNativeAdView(nativeAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        setSelected(true);
    }
}
