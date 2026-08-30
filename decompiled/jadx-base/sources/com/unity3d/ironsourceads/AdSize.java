package com.unity3d.ironsourceads;

/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B!\b\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0004\u001a\u0004\b\t\u0010\u0006R\u0017\u0010\u0010\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ironsourceads/AdSize;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "getWidth", "()I", "width", "b", "getHeight", "height", "", "c", "Ljava/lang/String;", "getSizeDescription", "()Ljava/lang/String;", "sizeDescription", "<init>", "(IILjava/lang/String;)V", "Companion", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class AdSize {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final com.unity3d.ironsourceads.AdSize.Companion INSTANCE = new com.unity3d.ironsourceads.AdSize.Companion(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int height;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final java.lang.String sizeDescription;

    @kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0007J\b\u0010\u0005\u001a\u00020\u0004H\u0007J\b\u0010\u0006\u001a\u00020\u0004H\u0007J\b\u0010\u0007\u001a\u00020\u0004H\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ironsourceads/AdSize$Companion;", "", "()V", "banner", "Lcom/unity3d/ironsourceads/AdSize;", com.adjust.sdk.Constants.LARGE, "leaderboard", "mediumRectangle", "mediationsdk_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.ironsourceads.AdSize banner() {
            return new com.unity3d.ironsourceads.AdSize(320, 50, com.json.mediationsdk.l.f2983a, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.ironsourceads.AdSize large() {
            return new com.unity3d.ironsourceads.AdSize(320, 90, com.json.mediationsdk.l.b, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.ironsourceads.AdSize leaderboard() {
            return new com.unity3d.ironsourceads.AdSize(728, 90, com.json.mediationsdk.l.d, null);
        }

        @kotlin.jvm.JvmStatic
        public final com.unity3d.ironsourceads.AdSize mediumRectangle() {
            return new com.unity3d.ironsourceads.AdSize(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT, 250, com.json.mediationsdk.l.g, null);
        }
    }

    private AdSize(int i, int i2, java.lang.String str) {
        this.width = i;
        this.height = i2;
        this.sizeDescription = str;
    }

    public /* synthetic */ AdSize(int i, int i2, java.lang.String str, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, str);
    }

    @kotlin.jvm.JvmStatic
    public static final com.unity3d.ironsourceads.AdSize banner() {
        return INSTANCE.banner();
    }

    @kotlin.jvm.JvmStatic
    public static final com.unity3d.ironsourceads.AdSize large() {
        return INSTANCE.large();
    }

    @kotlin.jvm.JvmStatic
    public static final com.unity3d.ironsourceads.AdSize leaderboard() {
        return INSTANCE.leaderboard();
    }

    @kotlin.jvm.JvmStatic
    public static final com.unity3d.ironsourceads.AdSize mediumRectangle() {
        return INSTANCE.mediumRectangle();
    }

    public final int getHeight() {
        return this.height;
    }

    public final java.lang.String getSizeDescription() {
        return this.sizeDescription;
    }

    public final int getWidth() {
        return this.width;
    }
}
