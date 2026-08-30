package com.google.android.ads.nativetemplates;

/* JADX INFO: loaded from: classes4.dex */
public final class TemplateView extends android.widget.FrameLayout {
    private static final java.lang.String MEDIUM_TEMPLATE = "medium_template";
    private static final java.lang.String SMALL_TEMPLATE = "small_template";
    private androidx.constraintlayout.widget.ConstraintLayout background;
    private android.widget.Button callToActionView;
    private android.widget.ImageView iconView;
    private com.google.android.gms.ads.nativead.MediaView mediaView;
    private com.google.android.gms.ads.nativead.NativeAd nativeAd;
    private com.google.android.gms.ads.nativead.NativeAdView nativeAdView;
    private android.widget.TextView primaryView;
    private android.widget.RatingBar ratingBar;
    private android.widget.TextView secondaryView;
    private com.google.android.ads.nativetemplates.NativeTemplateStyle styles;
    private int templateType;
    private android.widget.TextView tertiaryView;

    public TemplateView(android.content.Context context) {
        super(context);
    }

    public TemplateView(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        initView(context, attrs);
    }

    public TemplateView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context, attrs);
    }

    public TemplateView(android.content.Context context, android.util.AttributeSet attrs, int defStyleAttr, int defStyleRes) {
        super(context, attrs, defStyleAttr, defStyleRes);
        initView(context, attrs);
    }

    public void setStyles(com.google.android.ads.nativetemplates.NativeTemplateStyle styles) {
        this.styles = styles;
        applyStyles();
    }

    public com.google.android.gms.ads.nativead.NativeAdView getNativeAdView() {
        return this.nativeAdView;
    }

    private void applyStyles() {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        android.widget.TextView textView3;
        android.widget.Button button;
        android.widget.TextView textView4;
        android.widget.TextView textView5;
        android.widget.TextView textView6;
        android.widget.Button button2;
        android.widget.Button button3;
        android.widget.TextView textView7;
        android.widget.TextView textView8;
        android.widget.TextView textView9;
        android.widget.Button button4;
        android.widget.TextView textView10;
        android.widget.TextView textView11;
        android.widget.TextView textView12;
        android.graphics.drawable.ColorDrawable mainBackgroundColor = this.styles.getMainBackgroundColor();
        if (mainBackgroundColor != null) {
            this.background.setBackground(mainBackgroundColor);
            android.widget.TextView textView13 = this.primaryView;
            if (textView13 != null) {
                textView13.setBackground(mainBackgroundColor);
            }
            android.widget.TextView textView14 = this.secondaryView;
            if (textView14 != null) {
                textView14.setBackground(mainBackgroundColor);
            }
            android.widget.TextView textView15 = this.tertiaryView;
            if (textView15 != null) {
                textView15.setBackground(mainBackgroundColor);
            }
        }
        android.graphics.Typeface primaryTextTypeface = this.styles.getPrimaryTextTypeface();
        if (primaryTextTypeface != null && (textView12 = this.primaryView) != null) {
            textView12.setTypeface(primaryTextTypeface);
        }
        android.graphics.Typeface secondaryTextTypeface = this.styles.getSecondaryTextTypeface();
        if (secondaryTextTypeface != null && (textView11 = this.secondaryView) != null) {
            textView11.setTypeface(secondaryTextTypeface);
        }
        android.graphics.Typeface tertiaryTextTypeface = this.styles.getTertiaryTextTypeface();
        if (tertiaryTextTypeface != null && (textView10 = this.tertiaryView) != null) {
            textView10.setTypeface(tertiaryTextTypeface);
        }
        android.graphics.Typeface callToActionTextTypeface = this.styles.getCallToActionTextTypeface();
        if (callToActionTextTypeface != null && (button4 = this.callToActionView) != null) {
            button4.setTypeface(callToActionTextTypeface);
        }
        if (this.styles.getPrimaryTextTypefaceColor() != null && (textView9 = this.primaryView) != null) {
            textView9.setTextColor(this.styles.getPrimaryTextTypefaceColor().intValue());
        }
        if (this.styles.getSecondaryTextTypefaceColor() != null && (textView8 = this.secondaryView) != null) {
            textView8.setTextColor(this.styles.getSecondaryTextTypefaceColor().intValue());
        }
        if (this.styles.getTertiaryTextTypefaceColor() != null && (textView7 = this.tertiaryView) != null) {
            textView7.setTextColor(this.styles.getTertiaryTextTypefaceColor().intValue());
        }
        if (this.styles.getCallToActionTypefaceColor() != null && (button3 = this.callToActionView) != null) {
            button3.setTextColor(this.styles.getCallToActionTypefaceColor().intValue());
        }
        float callToActionTextSize = this.styles.getCallToActionTextSize();
        if (callToActionTextSize > 0.0f && (button2 = this.callToActionView) != null) {
            button2.setTextSize(callToActionTextSize);
        }
        float primaryTextSize = this.styles.getPrimaryTextSize();
        if (primaryTextSize > 0.0f && (textView6 = this.primaryView) != null) {
            textView6.setTextSize(primaryTextSize);
        }
        float secondaryTextSize = this.styles.getSecondaryTextSize();
        if (secondaryTextSize > 0.0f && (textView5 = this.secondaryView) != null) {
            textView5.setTextSize(secondaryTextSize);
        }
        float tertiaryTextSize = this.styles.getTertiaryTextSize();
        if (tertiaryTextSize > 0.0f && (textView4 = this.tertiaryView) != null) {
            textView4.setTextSize(tertiaryTextSize);
        }
        android.graphics.drawable.ColorDrawable callToActionBackgroundColor = this.styles.getCallToActionBackgroundColor();
        if (callToActionBackgroundColor != null && (button = this.callToActionView) != null) {
            button.setBackground(callToActionBackgroundColor);
        }
        android.graphics.drawable.ColorDrawable primaryTextBackgroundColor = this.styles.getPrimaryTextBackgroundColor();
        if (primaryTextBackgroundColor != null && (textView3 = this.primaryView) != null) {
            textView3.setBackground(primaryTextBackgroundColor);
        }
        android.graphics.drawable.ColorDrawable secondaryTextBackgroundColor = this.styles.getSecondaryTextBackgroundColor();
        if (secondaryTextBackgroundColor != null && (textView2 = this.secondaryView) != null) {
            textView2.setBackground(secondaryTextBackgroundColor);
        }
        android.graphics.drawable.ColorDrawable tertiaryTextBackgroundColor = this.styles.getTertiaryTextBackgroundColor();
        if (tertiaryTextBackgroundColor != null && (textView = this.tertiaryView) != null) {
            textView.setBackground(tertiaryTextBackgroundColor);
        }
        invalidate();
        requestLayout();
    }

    private boolean adHasOnlyStore(com.google.android.gms.ads.nativead.NativeAd nativeAd) {
        return !android.text.TextUtils.isEmpty(nativeAd.getStore()) && android.text.TextUtils.isEmpty(nativeAd.getAdvertiser());
    }

    public void setNativeAd(com.google.android.gms.ads.nativead.NativeAd nativeAd) {
        this.nativeAd = nativeAd;
        java.lang.String store = nativeAd.getStore();
        java.lang.String advertiser = nativeAd.getAdvertiser();
        java.lang.String headline = nativeAd.getHeadline();
        java.lang.String body = nativeAd.getBody();
        java.lang.String callToAction = nativeAd.getCallToAction();
        java.lang.Double starRating = nativeAd.getStarRating();
        com.google.android.gms.ads.nativead.NativeAd.Image icon = nativeAd.getIcon();
        this.callToActionView.setText(callToAction);
        this.nativeAdView.setCallToActionView(this.callToActionView);
        this.nativeAdView.setHeadlineView(this.primaryView);
        this.nativeAdView.setMediaView(this.mediaView);
        this.secondaryView.setVisibility(0);
        if (adHasOnlyStore(nativeAd)) {
            this.nativeAdView.setStoreView(this.secondaryView);
        } else if (android.text.TextUtils.isEmpty(advertiser)) {
            store = "";
        } else {
            this.nativeAdView.setAdvertiserView(this.secondaryView);
            store = advertiser;
        }
        this.primaryView.setText(headline);
        if (starRating != null && starRating.doubleValue() > 0.0d) {
            this.secondaryView.setVisibility(8);
            this.ratingBar.setVisibility(0);
            this.ratingBar.setRating(starRating.floatValue());
            this.nativeAdView.setStarRatingView(this.ratingBar);
        } else {
            this.secondaryView.setText(store);
            this.secondaryView.setVisibility(0);
            this.ratingBar.setVisibility(8);
        }
        if (icon != null) {
            this.iconView.setVisibility(0);
            this.iconView.setImageDrawable(icon.getDrawable());
            this.nativeAdView.setIconView(this.iconView);
        } else {
            this.iconView.setVisibility(8);
        }
        android.widget.TextView textView = this.tertiaryView;
        if (textView != null) {
            textView.setText(body);
            this.nativeAdView.setBodyView(this.tertiaryView);
        }
        this.nativeAdView.setNativeAd(nativeAd);
    }

    public void destroyNativeAd() {
        this.nativeAd.destroy();
    }

    public java.lang.String getTemplateTypeName() {
        if (this.templateType == com.google.unity.ads.R.layout.gnt_medium_template_view) {
            return MEDIUM_TEMPLATE;
        }
        return this.templateType == com.google.unity.ads.R.layout.gnt_small_template_view ? SMALL_TEMPLATE : "";
    }

    private void initView(android.content.Context context, android.util.AttributeSet attributeSet) {
        android.content.res.TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, com.google.unity.ads.R.styleable.TemplateView, 0, 0);
        try {
            this.templateType = typedArrayObtainStyledAttributes.getResourceId(com.google.unity.ads.R.styleable.TemplateView_gnt_template_type, com.google.unity.ads.R.layout.gnt_medium_template_view);
            typedArrayObtainStyledAttributes.recycle();
            ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.templateType, this);
        } catch (java.lang.Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.nativeAdView = (com.google.android.gms.ads.nativead.NativeAdView) findViewById(com.google.unity.ads.R.id.native_ad_view);
        this.primaryView = (android.widget.TextView) findViewById(com.google.unity.ads.R.id.primary);
        this.secondaryView = (android.widget.TextView) findViewById(com.google.unity.ads.R.id.secondary);
        this.tertiaryView = (android.widget.TextView) findViewById(com.google.unity.ads.R.id.body);
        android.widget.RatingBar ratingBar = (android.widget.RatingBar) findViewById(com.google.unity.ads.R.id.rating_bar);
        this.ratingBar = ratingBar;
        ratingBar.setEnabled(false);
        this.callToActionView = (android.widget.Button) findViewById(com.google.unity.ads.R.id.cta);
        this.iconView = (android.widget.ImageView) findViewById(com.google.unity.ads.R.id.icon);
        this.mediaView = (com.google.android.gms.ads.nativead.MediaView) findViewById(com.google.unity.ads.R.id.media_view);
        this.background = (androidx.constraintlayout.widget.ConstraintLayout) findViewById(com.google.unity.ads.R.id.background);
    }
}
