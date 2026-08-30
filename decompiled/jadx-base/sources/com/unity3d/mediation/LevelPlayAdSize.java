package com.unity3d.mediation;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0017\u0018\u0000 \u001f2\u00020\u0001:\u0001\u001fB9\b\u0000\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0016\u001a\u00020\t\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0005J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006 "}, d2 = {"Lcom/unity3d/mediation/LevelPlayAdSize;", "", "", "getWidth", "getHeight", "", "getDescription", "toString", "other", "", "equals", "hashCode", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "width", "b", "height", "c", "Ljava/lang/String;", "adLabel", "d", "Z", "isAdaptive", "()Z", "e", "Lcom/unity3d/mediation/LevelPlayAdSize;", "getFallbackAdSize$mediationsdk_release", "()Lcom/unity3d/mediation/LevelPlayAdSize;", "fallbackAdSize", "<init>", "(IILjava/lang/String;ZLcom/unity3d/mediation/LevelPlayAdSize;)V", "Companion", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class LevelPlayAdSize {
    private static final int f = 320;
    private static final int g = 50;
    private static final int h = 320;
    private static final int i = 90;
    private static final int j = 300;
    private static final int k = 250;
    private static final int m = 90;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private int height;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final java.lang.String adLabel;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final boolean isAdaptive;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final com.unity3d.mediation.LevelPlayAdSize fallbackAdSize;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.unity3d.mediation.LevelPlayAdSize.Companion INSTANCE = new com.unity3d.mediation.LevelPlayAdSize.Companion(null);
    public static final com.unity3d.mediation.LevelPlayAdSize BANNER = new com.unity3d.mediation.LevelPlayAdSize(320, 50, com.json.mediationsdk.l.f2983a, false, null, 16, null);
    public static final com.unity3d.mediation.LevelPlayAdSize MEDIUM_RECTANGLE = new com.unity3d.mediation.LevelPlayAdSize(300, 250, com.json.mediationsdk.l.g, false, null, 16, null);
    private static final int l = 728;
    public static final com.unity3d.mediation.LevelPlayAdSize LEADERBOARD = new com.unity3d.mediation.LevelPlayAdSize(l, 90, com.json.mediationsdk.l.d, false, null, 16, null);
    public static final com.unity3d.mediation.LevelPlayAdSize LARGE = new com.unity3d.mediation.LevelPlayAdSize(320, 90, com.json.mediationsdk.l.b, false, null, 16, null);

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0013H\u0001¢\u0006\u0002\b\u0014J#\u0010\u0015\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0016\u001a\u00020\u00172\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0002\u0010\u0019J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0007J\u0018\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u0006H\u0007R\u0010\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00048\u0000X\u0081\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/unity3d/mediation/LevelPlayAdSize$Companion;", "", "()V", com.json.mediationsdk.l.f2983a, "Lcom/unity3d/mediation/LevelPlayAdSize;", "BANNER_HEIGHT", "", "BANNER_WIDTH", com.json.mediationsdk.l.b, "LARGE_HEIGHT", "LARGE_WIDTH", com.json.mediationsdk.l.d, "LEADERBOARD_HEIGHT", "LEADERBOARD_WIDTH", com.json.mediationsdk.l.g, "RECTANGLE_HEIGHT", "RECTANGLE_WIDTH", "createAdSize", com.ironsource.y8.h.O, "", "createAdSize$mediationsdk_release", "createAdaptiveAdSize", "context", "Landroid/content/Context;", "width", "(Landroid/content/Context;Ljava/lang/Integer;)Lcom/unity3d/mediation/LevelPlayAdSize;", "createCustomBanner", "height", "createCustomSize", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ com.unity3d.mediation.LevelPlayAdSize createAdaptiveAdSize$default(com.unity3d.mediation.LevelPlayAdSize.Companion companion, android.content.Context context, java.lang.Integer num, int i, java.lang.Object obj) {
            if ((i & 2) != 0) {
                num = null;
            }
            return companion.createAdaptiveAdSize(context, num);
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.mediation.LevelPlayAdSize createAdSize$mediationsdk_release(java.lang.String adSize) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adSize, "adSize");
            int iHashCode = adSize.hashCode();
            if (iHashCode != -96588539) {
                if (iHashCode != 72205083) {
                    if (iHashCode != 446888797) {
                        if (iHashCode == 1951953708 && adSize.equals(com.json.mediationsdk.l.f2983a)) {
                            return com.unity3d.mediation.LevelPlayAdSize.BANNER;
                        }
                    } else if (adSize.equals(com.json.mediationsdk.l.d)) {
                        return com.unity3d.mediation.LevelPlayAdSize.LEADERBOARD;
                    }
                } else if (adSize.equals(com.json.mediationsdk.l.b)) {
                    return com.unity3d.mediation.LevelPlayAdSize.LARGE;
                }
            } else if (adSize.equals(com.json.mediationsdk.l.g)) {
                return com.unity3d.mediation.LevelPlayAdSize.MEDIUM_RECTANGLE;
            }
            throw new java.lang.IllegalArgumentException("Wrong Ad Size");
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.mediation.LevelPlayAdSize createAdaptiveAdSize(android.content.Context context) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return createAdaptiveAdSize$default(this, context, null, 2, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.mediation.LevelPlayAdSize createAdaptiveAdSize(android.content.Context context, java.lang.Integer width) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
            return new com.json.c3(new com.json.i1()).a(context, width);
        }

        @kotlin.Deprecated(message = "Use createCustomSize instead", replaceWith = @kotlin.ReplaceWith(expression = "createCustomSize(width, height)", imports = {}))
        @kotlin.jvm.JvmStatic
        public final com.unity3d.mediation.LevelPlayAdSize createCustomBanner(int width, int height) {
            return createCustomSize(width, height);
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.mediation.LevelPlayAdSize createCustomSize(int width, int height) {
            return new com.unity3d.mediation.LevelPlayAdSize(width, height, "CUSTOM", false, null, 16, null);
        }
    }

    public LevelPlayAdSize(int i2, int i3, java.lang.String str, boolean z, com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize) {
        this.width = i2;
        this.height = i3;
        this.adLabel = str;
        this.isAdaptive = z;
        this.fallbackAdSize = levelPlayAdSize;
    }

    public /* synthetic */ LevelPlayAdSize(int i2, int i3, java.lang.String str, boolean z, com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize, int i4, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i2, i3, (i4 & 4) != 0 ? null : str, z, (i4 & 16) != 0 ? null : levelPlayAdSize);
    }

    @kotlin.jvm.JvmStatic
    public static final com.unity3d.mediation.LevelPlayAdSize createAdaptiveAdSize(android.content.Context context) {
        return INSTANCE.createAdaptiveAdSize(context);
    }

    @kotlin.jvm.JvmStatic
    public static final com.unity3d.mediation.LevelPlayAdSize createAdaptiveAdSize(android.content.Context context, java.lang.Integer num) {
        return INSTANCE.createAdaptiveAdSize(context, num);
    }

    @kotlin.Deprecated(message = "Use createCustomSize instead", replaceWith = @kotlin.ReplaceWith(expression = "createCustomSize(width, height)", imports = {}))
    @kotlin.jvm.JvmStatic
    public static final com.unity3d.mediation.LevelPlayAdSize createCustomBanner(int i2, int i3) {
        return INSTANCE.createCustomBanner(i2, i3);
    }

    @kotlin.jvm.JvmStatic
    public static final com.unity3d.mediation.LevelPlayAdSize createCustomSize(int i2, int i3) {
        return INSTANCE.createCustomSize(i2, i3);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!kotlin.jvm.internal.Intrinsics.areEqual(com.unity3d.mediation.LevelPlayAdSize.class, other != null ? other.getClass() : null)) {
            return false;
        }
        kotlin.jvm.internal.Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.unity3d.mediation.LevelPlayAdSize");
        com.unity3d.mediation.LevelPlayAdSize levelPlayAdSize = (com.unity3d.mediation.LevelPlayAdSize) other;
        return this.width == levelPlayAdSize.width && this.height == levelPlayAdSize.height && kotlin.jvm.internal.Intrinsics.areEqual(this.adLabel, levelPlayAdSize.adLabel);
    }

    public final java.lang.String getDescription() {
        return java.lang.String.valueOf(this.adLabel);
    }

    /* JADX INFO: renamed from: getFallbackAdSize$mediationsdk_release, reason: from getter */
    public final com.unity3d.mediation.LevelPlayAdSize getFallbackAdSize() {
        return this.fallbackAdSize;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        int i2 = ((this.width * 31) + this.height) * 31;
        java.lang.String str = this.adLabel;
        return i2 + (str != null ? str.hashCode() : 0);
    }

    /* JADX INFO: renamed from: isAdaptive, reason: from getter */
    public final boolean getIsAdaptive() {
        return this.isAdaptive;
    }

    public java.lang.String toString() {
        return this.adLabel + ' ' + this.width + 'x' + this.height;
    }
}
