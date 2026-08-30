package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001\u0005B\u001f\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\u0006\u0010\u001e\u001a\u00020\u0018\u0012\u0006\u0010\u0013\u001a\u00020\u000f¢\u0006\u0004\b\u001f\u0010 J\b\u0010\u0003\u001a\u00020\u0002H\u0002J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002J\u0018\u0010\u0005\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\bJ\b\u0010\u0005\u001a\u00020\u000bH\u0014J\b\u0010\r\u001a\u00020\fH\u0016R\"\u0010\u0013\u001a\u0010\u0012\f\u0012\n \u0010*\u0004\u0018\u00010\u000f0\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u00060\u0014R\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u001b\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006!"}, d2 = {"Lcom/ironsource/i6;", "Lcom/ironsource/m1;", "Lcom/ironsource/mediationsdk/ISBannerSize;", com.json.zb.q, com.json.h6.u, androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/kv;", "viewBinder", "Lcom/ironsource/v1;", "displayListener", "", "Lcom/ironsource/b0;", "Lcom/ironsource/o1;", "b", "Ljava/lang/ref/WeakReference;", "Lcom/ironsource/l6;", "kotlin.jvm.PlatformType", "k", "Ljava/lang/ref/WeakReference;", com.google.android.gms.common.internal.ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/ironsource/i6$a;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/ironsource/i6$a;", "adInstanceListener", "Lcom/ironsource/j6;", "m", "Lcom/ironsource/j6;", "bannerAdUnitData", "Lcom/ironsource/l1;", "tools", "adUnitData", "<init>", "(Lcom/ironsource/l1;Lcom/ironsource/j6;Lcom/ironsource/l6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class i6 extends com.json.m1 {

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final java.lang.ref.WeakReference<com.json.l6> listener;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final com.ironsource.i6.a adInstanceListener;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final com.json.j6 bannerAdUnitData;

    @kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00060\u0001R\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\bH\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\bH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\bH\u0016¨\u0006\r"}, d2 = {"Lcom/ironsource/i6$a;", "Lcom/ironsource/m1$a;", "Lcom/ironsource/m1;", "Lcom/ironsource/w5;", "Lcom/ironsource/y;", com.json.j5.p, "", "b", "Lcom/ironsource/u5;", "c", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "(Lcom/ironsource/i6;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    private final class a extends com.ironsource.m1.a implements com.json.w5 {
        public a() {
            super();
        }

        @Override // com.json.w5
        public void a(com.json.u5 instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.i6.this.a(instance.getInstanceSignature()));
            com.json.l6 l6Var = (com.json.l6) com.json.i6.this.listener.get();
            if (l6Var != null) {
                l6Var.d();
            }
        }

        @Override // com.json.w5
        public void b(com.json.u5 instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.i6.this.a(instance.getInstanceSignature()));
            com.json.l6 l6Var = (com.json.l6) com.json.i6.this.listener.get();
            if (l6Var != null) {
                l6Var.g();
            }
        }

        @Override // com.ironsource.m1.a, com.json.c0
        public void b(com.json.y instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            super.b(instance);
            com.json.v1 displayListener = com.json.i6.this.getDisplayListener();
            if (displayListener != null) {
                displayListener.b();
            }
        }

        @Override // com.json.w5
        public void c(com.json.u5 instance) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instance, "instance");
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(com.json.i6.this.a(instance.getInstanceSignature()));
            com.json.l6 l6Var = (com.json.l6) com.json.i6.this.listener.get();
            if (l6Var != null) {
                l6Var.e();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(com.json.l1 tools, com.json.j6 adUnitData, com.json.l6 listener) {
        java.lang.String str;
        int iB;
        super(tools, adUnitData, listener, null, 8, null);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(tools, "tools");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adUnitData, "adUnitData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(listener, "listener");
        this.listener = new java.lang.ref.WeakReference<>(listener);
        this.adInstanceListener = new com.ironsource.i6.a();
        this.bannerAdUnitData = adUnitData;
        com.json.mediationsdk.model.Placement placementH = h();
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose("placement = " + placementH);
        if (placementH == null || android.text.TextUtils.isEmpty(placementH.getCom.ironsource.op.d java.lang.String())) {
            kotlin.jvm.internal.StringCompanionObject stringCompanionObject = kotlin.jvm.internal.StringCompanionObject.INSTANCE;
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = placementH == null ? "placement is null" : "placement name is empty";
            str = java.lang.String.format("can't load banner - %s", java.util.Arrays.copyOf(objArr, 1));
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(str, "format(format, *args)");
            iB = com.json.x1.b(adUnitData.getAdProperties().getAdFormat());
        } else {
            str = null;
            iB = 510;
        }
        if (str != null) {
            com.json.mediationsdk.logger.IronLog.API.error(a(str));
            a(iB, str);
        }
    }

    private final com.json.mediationsdk.ISBannerSize a(com.json.mediationsdk.ISBannerSize bannerSize) {
        if (bannerSize.isSmart()) {
            return com.json.mediationsdk.AdapterUtils.isLargeScreen(com.json.environment.ContextProvider.getInstance().getApplicationContext()) ? com.json.mediationsdk.l.a() : com.json.mediationsdk.ISBannerSize.BANNER;
        }
        return bannerSize;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final com.json.y a(com.json.i6 this$0, com.json.z instanceData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(this$0, "this$0");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(instanceData, "instanceData");
        return new com.json.u5(new com.json.t2(this$0.getAdUnitTools(), com.ironsource.b2.b.PROVIDER), instanceData, this$0.adInstanceListener);
    }

    private final com.json.mediationsdk.ISBannerSize n() {
        return getAdUnitTools().a(this.bannerAdUnitData.getAdProperties().getAdSize());
    }

    @Override // com.json.m1
    protected com.json.b0 a() {
        return new com.json.b0() { // from class: com.ironsource.i6$$ExternalSyntheticLambda0
            @Override // com.json.b0
            public final com.json.y a(com.json.z zVar) {
                return com.json.i6.a(this.f$0, zVar);
            }
        };
    }

    public final void a(com.json.kv viewBinder, com.json.v1 displayListener) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(displayListener, "displayListener");
        if (viewBinder != null) {
            a(new com.json.y5(viewBinder), displayListener);
        }
    }

    @Override // com.json.m1
    public com.json.o1 b() {
        return new com.json.p6(this.bannerAdUnitData.getAdProperties(), a(n()));
    }
}
