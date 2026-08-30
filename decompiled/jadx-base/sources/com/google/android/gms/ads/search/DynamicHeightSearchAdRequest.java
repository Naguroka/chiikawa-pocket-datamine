package com.google.android.gms.ads.search;

/* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class DynamicHeightSearchAdRequest {
    private final com.google.android.gms.ads.search.SearchAdRequest zza;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-ads-lite@@23.6.0 */
    public static final class Builder {
        private final com.google.android.gms.ads.search.zzb zza = new com.google.android.gms.ads.search.zzb();
        private final android.os.Bundle zzb = new android.os.Bundle();

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder addCustomEventExtrasBundle(java.lang.Class<? extends com.google.android.gms.ads.mediation.customevent.CustomEvent> cls, android.os.Bundle bundle) {
            this.zza.zzb(cls, bundle);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder addNetworkExtras(com.google.android.gms.ads.mediation.NetworkExtras networkExtras) {
            this.zza.zzc(networkExtras);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder addNetworkExtrasBundle(java.lang.Class<? extends com.google.android.gms.ads.mediation.MediationAdapter> cls, android.os.Bundle bundle) {
            this.zza.zzd(cls, bundle);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest build() {
            this.zza.zzd(com.google.ads.mediation.admob.AdMobAdapter.class, this.zzb);
            return new com.google.android.gms.ads.search.DynamicHeightSearchAdRequest(this, null);
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setAdBorderSelectors(java.lang.String str) {
            this.zzb.putString("csa_adBorderSelectors", str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setAdTest(boolean z) {
            this.zzb.putString("csa_adtest", true != z ? kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_OFF : kotlinx.coroutines.DebugKt.DEBUG_PROPERTY_VALUE_ON);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setAdjustableLineHeight(int i) {
            this.zzb.putString("csa_adjustableLineHeight", java.lang.Integer.toString(i));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setAdvancedOptionValue(java.lang.String str, java.lang.String str2) {
            this.zzb.putString(str, str2);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setAttributionSpacingBelow(int i) {
            this.zzb.putString("csa_attributionSpacingBelow", java.lang.Integer.toString(i));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setBorderSelections(java.lang.String str) {
            this.zzb.putString("csa_borderSelections", str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setChannel(java.lang.String str) {
            this.zzb.putString("csa_channel", str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorAdBorder(java.lang.String str) {
            this.zzb.putString("csa_colorAdBorder", str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorAdSeparator(java.lang.String str) {
            this.zzb.putString("csa_colorAdSeparator", str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorAnnotation(java.lang.String str) {
            this.zzb.putString("csa_colorAnnotation", str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorAttribution(java.lang.String str) {
            this.zzb.putString("csa_colorAttribution", str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorBackground(java.lang.String str) {
            this.zzb.putString("csa_colorBackground", str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorBorder(java.lang.String str) {
            this.zzb.putString("csa_colorBorder", str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorDomainLink(java.lang.String str) {
            this.zzb.putString("csa_colorDomainLink", str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorText(java.lang.String str) {
            this.zzb.putString("csa_colorText", str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setColorTitleLink(java.lang.String str) {
            this.zzb.putString("csa_colorTitleLink", str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setCssWidth(int i) {
            this.zzb.putString("csa_width", java.lang.Integer.toString(i));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setDetailedAttribution(boolean z) {
            this.zzb.putString("csa_detailedAttribution", java.lang.Boolean.toString(z));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setFontFamily(java.lang.String str) {
            this.zzb.putString("csa_fontFamily", str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setFontFamilyAttribution(java.lang.String str) {
            this.zzb.putString("csa_fontFamilyAttribution", str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setFontSizeAnnotation(int i) {
            this.zzb.putString("csa_fontSizeAnnotation", java.lang.Integer.toString(i));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setFontSizeAttribution(int i) {
            this.zzb.putString("csa_fontSizeAttribution", java.lang.Integer.toString(i));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setFontSizeDescription(int i) {
            this.zzb.putString("csa_fontSizeDescription", java.lang.Integer.toString(i));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setFontSizeDomainLink(int i) {
            this.zzb.putString("csa_fontSizeDomainLink", java.lang.Integer.toString(i));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setFontSizeTitle(int i) {
            this.zzb.putString("csa_fontSizeTitle", java.lang.Integer.toString(i));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setHostLanguage(java.lang.String str) {
            this.zzb.putString("csa_hl", str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setIsClickToCallEnabled(boolean z) {
            this.zzb.putString("csa_clickToCall", java.lang.Boolean.toString(z));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setIsLocationEnabled(boolean z) {
            this.zzb.putString("csa_location", java.lang.Boolean.toString(z));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setIsPlusOnesEnabled(boolean z) {
            this.zzb.putString("csa_plusOnes", java.lang.Boolean.toString(z));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setIsSellerRatingsEnabled(boolean z) {
            this.zzb.putString("csa_sellerRatings", java.lang.Boolean.toString(z));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setIsSiteLinksEnabled(boolean z) {
            this.zzb.putString("csa_siteLinks", java.lang.Boolean.toString(z));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setIsTitleBold(boolean z) {
            this.zzb.putString("csa_titleBold", java.lang.Boolean.toString(z));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setIsTitleUnderlined(boolean z) {
            this.zzb.putString("csa_noTitleUnderline", java.lang.Boolean.toString(!z));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setLocationColor(java.lang.String str) {
            this.zzb.putString("csa_colorLocation", str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setLocationFontSize(int i) {
            this.zzb.putString("csa_fontSizeLocation", java.lang.Integer.toString(i));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setLongerHeadlines(boolean z) {
            this.zzb.putString("csa_longerHeadlines", java.lang.Boolean.toString(z));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setNumber(int i) {
            this.zzb.putString("csa_number", java.lang.Integer.toString(i));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setPage(int i) {
            this.zzb.putString("csa_adPage", java.lang.Integer.toString(i));
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setQuery(java.lang.String str) {
            this.zza.zze(str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setStyleId(java.lang.String str) {
            this.zzb.putString("csa_styleId", str);
            return this;
        }

        public com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder setVerticalSpacing(int i) {
            this.zzb.putString("csa_verticalSpacing", java.lang.Integer.toString(i));
            return this;
        }
    }

    /* synthetic */ DynamicHeightSearchAdRequest(com.google.android.gms.ads.search.DynamicHeightSearchAdRequest.Builder builder, com.google.android.gms.ads.search.zza zzaVar) {
        this.zza = new com.google.android.gms.ads.search.SearchAdRequest(builder.zza, null);
    }

    public <T extends com.google.android.gms.ads.mediation.customevent.CustomEvent> android.os.Bundle getCustomEventExtrasBundle(java.lang.Class<T> cls) {
        return this.zza.getCustomEventExtrasBundle(cls);
    }

    public <T extends com.google.android.gms.ads.mediation.MediationAdapter> android.os.Bundle getNetworkExtrasBundle(java.lang.Class<T> cls) {
        return this.zza.getNetworkExtrasBundle(cls);
    }

    public java.lang.String getQuery() {
        return this.zza.getQuery();
    }

    public boolean isTestDevice(android.content.Context context) {
        return this.zza.isTestDevice(context);
    }

    final com.google.android.gms.ads.internal.client.zzei zza() {
        return this.zza.zza();
    }
}
