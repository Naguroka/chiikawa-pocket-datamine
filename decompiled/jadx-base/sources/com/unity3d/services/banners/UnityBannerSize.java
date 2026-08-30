package com.unity3d.services.banners;

/* JADX INFO: compiled from: UnityBannerSize.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/unity3d/services/banners/UnityBannerSize;", "", "width", "", "height", "(II)V", "getHeight", "()I", "getWidth", "Companion", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UnityBannerSize {
    private final int height;
    private final int width;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.unity3d.services.banners.UnityBannerSize.Companion INSTANCE = new com.unity3d.services.banners.UnityBannerSize.Companion(null);
    private static final com.unity3d.services.banners.UnityBannerSize leaderboard = new com.unity3d.services.banners.UnityBannerSize(728, 90);
    private static final com.unity3d.services.banners.UnityBannerSize iabStandard = new com.unity3d.services.banners.UnityBannerSize(468, 60);
    private static final com.unity3d.services.banners.UnityBannerSize standard = new com.unity3d.services.banners.UnityBannerSize(320, 50);

    @kotlin.jvm.JvmStatic
    public static final com.unity3d.services.banners.UnityBannerSize getDynamicSize(android.content.Context context) {
        return INSTANCE.getDynamicSize(context);
    }

    /* JADX INFO: compiled from: UnityBannerSize.kt */
    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\rH\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000e"}, d2 = {"Lcom/unity3d/services/banners/UnityBannerSize$Companion;", "", "()V", "iabStandard", "Lcom/unity3d/services/banners/UnityBannerSize;", "getIabStandard", "()Lcom/unity3d/services/banners/UnityBannerSize;", "leaderboard", "getLeaderboard", "standard", "getStandard", "getDynamicSize", "context", "Landroid/content/Context;", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final com.unity3d.services.banners.UnityBannerSize getLeaderboard() {
            return com.unity3d.services.banners.UnityBannerSize.leaderboard;
        }

        public final com.unity3d.services.banners.UnityBannerSize getIabStandard() {
            return com.unity3d.services.banners.UnityBannerSize.iabStandard;
        }

        public final com.unity3d.services.banners.UnityBannerSize getStandard() {
            return com.unity3d.services.banners.UnityBannerSize.standard;
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.services.banners.UnityBannerSize getDynamicSize(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            int iRoundToInt = kotlin.math.MathKt.roundToInt(com.unity3d.services.core.misc.ViewUtilities.dpFromPx(context, context.getResources().getDisplayMetrics().widthPixels));
            if (iRoundToInt >= getLeaderboard().getWidth()) {
                return getLeaderboard();
            }
            return iRoundToInt >= getIabStandard().getWidth() ? getIabStandard() : getStandard();
        }
    }

    public UnityBannerSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }
}
