package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001:\u0002\t\u000bB_\u0012\u0006\u0010\u0012\u001a\u00020\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0019\u001a\u00020\n¢\u0006\u0004\b5\u00106J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u000f\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\t\u001a\u00020\bHÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010\u0011\u001a\u00020\nHÆ\u0003Je\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0012\u001a\u00020\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u0019\u001a\u00020\nHÆ\u0001J\t\u0010\u001b\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001cHÖ\u0001J\u0013\u0010 \u001a\u00020\u001f2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0012\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010!\u001a\u0004\b\"\u0010#\"\u0004\b\t\u0010$R$\u0010\u0013\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010%\u001a\u0004\b&\u0010'\"\u0004\b\u0010\u0010(R$\u0010\u0014\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010%\u001a\u0004\b)\u0010'\"\u0004\b\t\u0010(R$\u0010\u0015\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\r\u0010%\u001a\u0004\b*\u0010'\"\u0004\b\r\u0010(R$\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010%\u001a\u0004\b+\u0010'\"\u0004\b\u000b\u0010(R$\u0010\u0017\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010%\u001a\u0004\b,\u0010'\"\u0004\b\u000e\u0010(R$\u0010\u0018\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010%\u001a\u0004\b-\u0010'\"\u0004\b\f\u0010(R\"\u0010\u0019\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010%\u001a\u0004\b.\u0010'\"\u0004\b\u000f\u0010(R$\u00104\u001a\u0004\u0018\u00010/8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u00100\u001a\u0004\b1\u00102\"\u0004\b\t\u00103¨\u00067"}, d2 = {"Lcom/ironsource/ph;", "", "", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "Lorg/json/JSONObject;", "t", "()Lorg/json/JSONObject;", "Lcom/ironsource/lh;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Landroid/view/View;", "b", "c", "d", "e", "f", "g", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "containerView", "titleView", "advertiserView", "iconView", "bodyView", "mediaView", "ctaView", "privacyIconView", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/ironsource/lh;", "k", "()Lcom/ironsource/lh;", "(Lcom/ironsource/lh;)V", "Landroid/view/View;", "q", "()Landroid/view/View;", "(Landroid/view/View;)V", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "m", "j", "o", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, "Lcom/ironsource/ph$a;", "Lcom/ironsource/ph$a;", com.json.zb.q, "()Lcom/ironsource/ph$a;", "(Lcom/ironsource/ph$a;)V", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "<init>", "(Lcom/ironsource/lh;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;Landroid/view/View;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ph {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private com.json.lh containerView;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private android.view.View titleView;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private android.view.View advertiserView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private android.view.View iconView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private android.view.View bodyView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private android.view.View mediaView;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private android.view.View ctaView;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private android.view.View privacyIconView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private com.ironsource.ph.a listener;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/ph$a;", "", "Lcom/ironsource/ph$b;", "viewName", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/mv;", "viewVisibilityParams", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public interface a {
        void a(com.json.mv viewVisibilityParams);

        void a(com.ironsource.ph.b viewName);
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0005j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/ironsource/ph$b;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "c", "d", "e", "f", "g", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public enum b {
        Title(com.ironsource.y8.h.D0),
        Advertiser(com.ironsource.y8.h.F0),
        Body("body"),
        Cta(com.ironsource.y8.h.G0),
        Icon(com.ironsource.y8.h.H0),
        Container(androidx.media3.extractor.text.ttml.TtmlNode.RUBY_CONTAINER),
        PrivacyIcon(com.ironsource.y8.h.J0);


        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final java.lang.String value;

        b(java.lang.String str) {
            this.value = str;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final java.lang.String getValue() {
            return this.value;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/ironsource/ph$c", "Lcom/ironsource/lh$a;", "Lcom/ironsource/mv;", "viewVisibilityParams", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements com.ironsource.lh.a {
        c() {
        }

        @Override // com.ironsource.lh.a
        public void a(com.json.mv viewVisibilityParams) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewVisibilityParams, "viewVisibilityParams");
            com.ironsource.ph.a listener = com.json.ph.this.getListener();
            if (listener != null) {
                listener.a(viewVisibilityParams);
            }
        }
    }

    public ph(com.json.lh containerView, android.view.View view, android.view.View view2, android.view.View view3, android.view.View view4, android.view.View view5, android.view.View view6, android.view.View privacyIconView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerView, "containerView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        this.containerView = containerView;
        this.titleView = view;
        this.advertiserView = view2;
        this.iconView = view3;
        this.bodyView = view4;
        this.mediaView = view5;
        this.ctaView = view6;
        this.privacyIconView = privacyIconView;
        r();
        s();
    }

    public /* synthetic */ ph(com.json.lh lhVar, android.view.View view, android.view.View view2, android.view.View view3, android.view.View view4, android.view.View view5, android.view.View view6, android.view.View view7, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(lhVar, (i & 2) != 0 ? null : view, (i & 4) != 0 ? null : view2, (i & 8) != 0 ? null : view3, (i & 16) != 0 ? null : view4, (i & 32) != 0 ? null : view5, (i & 64) != 0 ? null : view6, view7);
    }

    private static final void a(final com.json.ph phVar, android.view.View view, final com.ironsource.ph.b bVar) {
        if (view != null) {
            view.setOnClickListener(new android.view.View.OnClickListener() { // from class: com.ironsource.ph$$ExternalSyntheticLambda0
                @Override // android.view.View.OnClickListener
                public final void onClick(android.view.View view2) {
                    com.json.ph.a(this.f$0, bVar, view2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(com.json.ph this$0, com.ironsource.ph.b viewName, android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewName, "$viewName");
        com.ironsource.ph.a aVar = this$0.listener;
        if (aVar != null) {
            aVar.a(viewName);
        }
    }

    private final void r() {
        a(this, this.titleView, com.ironsource.ph.b.Title);
        a(this, this.advertiserView, com.ironsource.ph.b.Advertiser);
        a(this, this.bodyView, com.ironsource.ph.b.Body);
        a(this, this.ctaView, com.ironsource.ph.b.Cta);
        a(this, this.iconView, com.ironsource.ph.b.Icon);
        a(this, this.containerView, com.ironsource.ph.b.Container);
        a(this, this.privacyIconView, com.ironsource.ph.b.PrivacyIcon);
    }

    private final void s() {
        this.containerView.setListener$mediationsdk_release(new com.ironsource.ph.c());
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final com.json.lh getContainerView() {
        return this.containerView;
    }

    public final com.json.ph a(com.json.lh containerView, android.view.View titleView, android.view.View advertiserView, android.view.View iconView, android.view.View bodyView, android.view.View mediaView, android.view.View ctaView, android.view.View privacyIconView) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(containerView, "containerView");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(privacyIconView, "privacyIconView");
        return new com.json.ph(containerView, titleView, advertiserView, iconView, bodyView, mediaView, ctaView, privacyIconView);
    }

    public final void a(android.view.View view) {
        this.advertiserView = view;
    }

    public final void a(com.json.lh lhVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lhVar, "<set-?>");
        this.containerView = lhVar;
    }

    public final void a(com.ironsource.ph.a aVar) {
        this.listener = aVar;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final android.view.View getTitleView() {
        return this.titleView;
    }

    public final void b(android.view.View view) {
        this.bodyView = view;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final android.view.View getAdvertiserView() {
        return this.advertiserView;
    }

    public final void c(android.view.View view) {
        this.ctaView = view;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final android.view.View getIconView() {
        return this.iconView;
    }

    public final void d(android.view.View view) {
        this.iconView = view;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final android.view.View getBodyView() {
        return this.bodyView;
    }

    public final void e(android.view.View view) {
        this.mediaView = view;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.ph)) {
            return false;
        }
        com.json.ph phVar = (com.json.ph) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.containerView, phVar.containerView) && kotlin.jvm.internal.Intrinsics.areEqual(this.titleView, phVar.titleView) && kotlin.jvm.internal.Intrinsics.areEqual(this.advertiserView, phVar.advertiserView) && kotlin.jvm.internal.Intrinsics.areEqual(this.iconView, phVar.iconView) && kotlin.jvm.internal.Intrinsics.areEqual(this.bodyView, phVar.bodyView) && kotlin.jvm.internal.Intrinsics.areEqual(this.mediaView, phVar.mediaView) && kotlin.jvm.internal.Intrinsics.areEqual(this.ctaView, phVar.ctaView) && kotlin.jvm.internal.Intrinsics.areEqual(this.privacyIconView, phVar.privacyIconView);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final android.view.View getMediaView() {
        return this.mediaView;
    }

    public final void f(android.view.View view) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.privacyIconView = view;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final android.view.View getCtaView() {
        return this.ctaView;
    }

    public final void g(android.view.View view) {
        this.titleView = view;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final android.view.View getPrivacyIconView() {
        return this.privacyIconView;
    }

    public int hashCode() {
        int iHashCode = this.containerView.hashCode() * 31;
        android.view.View view = this.titleView;
        int iHashCode2 = (iHashCode + (view == null ? 0 : view.hashCode())) * 31;
        android.view.View view2 = this.advertiserView;
        int iHashCode3 = (iHashCode2 + (view2 == null ? 0 : view2.hashCode())) * 31;
        android.view.View view3 = this.iconView;
        int iHashCode4 = (iHashCode3 + (view3 == null ? 0 : view3.hashCode())) * 31;
        android.view.View view4 = this.bodyView;
        int iHashCode5 = (iHashCode4 + (view4 == null ? 0 : view4.hashCode())) * 31;
        android.view.View view5 = this.mediaView;
        int iHashCode6 = (iHashCode5 + (view5 == null ? 0 : view5.hashCode())) * 31;
        android.view.View view6 = this.ctaView;
        return ((iHashCode6 + (view6 != null ? view6.hashCode() : 0)) * 31) + this.privacyIconView.hashCode();
    }

    public final android.view.View i() {
        return this.advertiserView;
    }

    public final android.view.View j() {
        return this.bodyView;
    }

    public final com.json.lh k() {
        return this.containerView;
    }

    public final android.view.View l() {
        return this.ctaView;
    }

    public final android.view.View m() {
        return this.iconView;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final com.ironsource.ph.a getListener() {
        return this.listener;
    }

    public final android.view.View o() {
        return this.mediaView;
    }

    public final android.view.View p() {
        return this.privacyIconView;
    }

    public final android.view.View q() {
        return this.titleView;
    }

    public final org.json.JSONObject t() throws org.json.JSONException {
        org.json.JSONObject jSONObjectPut = new org.json.JSONObject().put(com.ironsource.y8.h.D0, this.titleView != null).put(com.ironsource.y8.h.F0, this.advertiserView != null).put("body", this.bodyView != null).put(com.ironsource.y8.h.G0, this.ctaView != null).put(com.ironsource.y8.h.I0, this.mediaView != null).put(com.ironsource.y8.h.H0, this.iconView != null);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n        .pu…\"icon\", iconView != null)");
        return jSONObjectPut;
    }

    public java.lang.String toString() {
        return "ISNNativeAdViewHolder(containerView=" + this.containerView + ", titleView=" + this.titleView + ", advertiserView=" + this.advertiserView + ", iconView=" + this.iconView + ", bodyView=" + this.bodyView + ", mediaView=" + this.mediaView + ", ctaView=" + this.ctaView + ", privacyIconView=" + this.privacyIconView + ')';
    }
}
