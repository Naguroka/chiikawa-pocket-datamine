package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\b\u0010\u0005\u001a\u00020\u0007H\u0002J\u001e\u0010\u0006\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bJ\u0006\u0010\f\u001a\u00020\u000bJ\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rJ\u000e\u0010\u0006\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fJ\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011J\u000e\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/ironsource/i1;", "Lcom/ironsource/rl;", "Lcom/unity3d/mediation/LevelPlayAdSize;", "size", "Lcom/ironsource/mediationsdk/ISBannerSize;", "c", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "suffix", "", "d", "", "b", "", "width", "Landroid/content/Context;", "context", "Lcom/ironsource/rt$b;", "Lcom/ironsource/rt$b;", "logFactory", "Lcom/ironsource/rh;", "Lcom/ironsource/rh;", "sdkConfigService", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class i1 extends com.json.rl {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final com.ironsource.rt.b logFactory;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final com.json.rh sdkConfigService;

    public i1() {
        com.ironsource.rt.b bVarA = com.json.rt.a(com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(bVarA, "createLogFactory(IronSource.AD_UNIT.BANNER)");
        this.logFactory = bVarA;
        this.sdkConfigService = com.json.im.INSTANCE.d().t();
    }

    private final com.json.mediationsdk.ISBannerSize a(com.unity3d.mediation.LevelPlayAdSize size) {
        com.unity3d.mediation.LevelPlayAdSize fallbackAdSize = size.getFallbackAdSize();
        if (fallbackAdSize == null) {
            fallbackAdSize = com.unity3d.mediation.LevelPlayAdSize.BANNER;
        }
        com.json.mediationsdk.ISBannerSize iSBannerSizeB = b(fallbackAdSize);
        iSBannerSizeB.setAdaptive(true);
        iSBannerSizeB.containerParams = new com.json.mediationsdk.ISContainerParams(size.getWidth(), size.getHeight());
        return iSBannerSizeB;
    }

    public static /* synthetic */ java.lang.String a(com.json.i1 i1Var, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return i1Var.a(str, str2);
    }

    private final float c() {
        com.json.al alVarA = this.sdkConfigService.a();
        if (alVarA != null) {
            return alVarA.i();
        }
        throw new java.lang.IllegalStateException("Error getting sdk configurations");
    }

    private final com.json.mediationsdk.ISBannerSize c(com.unity3d.mediation.LevelPlayAdSize size) {
        if (kotlin.jvm.internal.Intrinsics.areEqual(size, com.unity3d.mediation.LevelPlayAdSize.LARGE)) {
            return new com.json.mediationsdk.ISBannerSize(com.json.mediationsdk.l.b, size.getWidth(), size.getHeight());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(size, com.unity3d.mediation.LevelPlayAdSize.MEDIUM_RECTANGLE)) {
            return new com.json.mediationsdk.ISBannerSize(com.json.mediationsdk.l.c, size.getWidth(), size.getHeight());
        }
        if (kotlin.jvm.internal.Intrinsics.areEqual(size, com.unity3d.mediation.LevelPlayAdSize.LEADERBOARD)) {
            return new com.json.mediationsdk.ISBannerSize(com.json.mediationsdk.l.e, 0, 0);
        }
        return kotlin.jvm.internal.Intrinsics.areEqual(size, com.unity3d.mediation.LevelPlayAdSize.INSTANCE.createCustomSize(size.getWidth(), size.getHeight())) ? new com.json.mediationsdk.ISBannerSize(size.getWidth(), size.getHeight()) : new com.json.mediationsdk.ISBannerSize(com.json.mediationsdk.l.f2983a, size.getWidth(), size.getHeight());
    }

    public final int a(int width) {
        return com.json.mediationsdk.l.a(width);
    }

    public final java.lang.String a(java.lang.String message, java.lang.String suffix) {
        java.lang.String strA = this.logFactory.a(message, suffix);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strA, "logFactory.createLogMessage(message, suffix)");
        return strA;
    }

    public final int b(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        return kotlin.math.MathKt.roundToInt(c() * com.json.ya.f3585a.a(context));
    }

    public final com.json.mediationsdk.ISBannerSize b(com.unity3d.mediation.LevelPlayAdSize size) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(size, "size");
        boolean isAdaptive = size.getIsAdaptive();
        if (isAdaptive) {
            return a(size);
        }
        if (isAdaptive) {
            throw new kotlin.NoWhenBranchMatchedException();
        }
        return c(size);
    }

    public final java.util.List<com.unity3d.mediation.LevelPlayAdSize> b() {
        com.json.al alVarA = this.sdkConfigService.a();
        if (alVarA != null) {
            return alVarA.h();
        }
        throw new java.lang.IllegalStateException("Error getting sdk configurations");
    }

    public final boolean d() {
        return com.json.im.INSTANCE.d().t().c();
    }
}
