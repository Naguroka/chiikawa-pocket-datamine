package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0006\u001a\u00020\u0002HÆ\u0003J1\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u0002HÆ\u0001J\t\u0010\u000b\u001a\u00020\u0002HÖ\u0001J\t\u0010\r\u001a\u00020\fHÖ\u0001J\u0013\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/ironsource/o9;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "d", "customNetworkAdapterName", "customRewardedVideoAdapterName", "customInterstitialAdapterName", "customBannerAdapterName", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "g", "()Ljava/lang/String;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "f", "e", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class o9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String customNetworkAdapterName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String customRewardedVideoAdapterName;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final java.lang.String customInterstitialAdapterName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final java.lang.String customBannerAdapterName;

    public o9() {
        this(null, null, null, null, 15, null);
    }

    public o9(java.lang.String customNetworkAdapterName, java.lang.String customRewardedVideoAdapterName, java.lang.String customInterstitialAdapterName, java.lang.String customBannerAdapterName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        this.customNetworkAdapterName = customNetworkAdapterName;
        this.customRewardedVideoAdapterName = customRewardedVideoAdapterName;
        this.customInterstitialAdapterName = customInterstitialAdapterName;
        this.customBannerAdapterName = customBannerAdapterName;
    }

    public /* synthetic */ o9(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
    }

    public static /* synthetic */ com.json.o9 a(com.json.o9 o9Var, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = o9Var.customNetworkAdapterName;
        }
        if ((i & 2) != 0) {
            str2 = o9Var.customRewardedVideoAdapterName;
        }
        if ((i & 4) != 0) {
            str3 = o9Var.customInterstitialAdapterName;
        }
        if ((i & 8) != 0) {
            str4 = o9Var.customBannerAdapterName;
        }
        return o9Var.a(str, str2, str3, str4);
    }

    public final com.json.o9 a(java.lang.String customNetworkAdapterName, java.lang.String customRewardedVideoAdapterName, java.lang.String customInterstitialAdapterName, java.lang.String customBannerAdapterName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customNetworkAdapterName, "customNetworkAdapterName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customRewardedVideoAdapterName, "customRewardedVideoAdapterName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customInterstitialAdapterName, "customInterstitialAdapterName");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customBannerAdapterName, "customBannerAdapterName");
        return new com.json.o9(customNetworkAdapterName, customRewardedVideoAdapterName, customInterstitialAdapterName, customBannerAdapterName);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.String getCustomNetworkAdapterName() {
        return this.customNetworkAdapterName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getCustomRewardedVideoAdapterName() {
        return this.customRewardedVideoAdapterName;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final java.lang.String getCustomInterstitialAdapterName() {
        return this.customInterstitialAdapterName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final java.lang.String getCustomBannerAdapterName() {
        return this.customBannerAdapterName;
    }

    public final java.lang.String e() {
        return this.customBannerAdapterName;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.o9)) {
            return false;
        }
        com.json.o9 o9Var = (com.json.o9) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.customNetworkAdapterName, o9Var.customNetworkAdapterName) && kotlin.jvm.internal.Intrinsics.areEqual(this.customRewardedVideoAdapterName, o9Var.customRewardedVideoAdapterName) && kotlin.jvm.internal.Intrinsics.areEqual(this.customInterstitialAdapterName, o9Var.customInterstitialAdapterName) && kotlin.jvm.internal.Intrinsics.areEqual(this.customBannerAdapterName, o9Var.customBannerAdapterName);
    }

    public final java.lang.String f() {
        return this.customInterstitialAdapterName;
    }

    public final java.lang.String g() {
        return this.customNetworkAdapterName;
    }

    public final java.lang.String h() {
        return this.customRewardedVideoAdapterName;
    }

    public int hashCode() {
        return (((((this.customNetworkAdapterName.hashCode() * 31) + this.customRewardedVideoAdapterName.hashCode()) * 31) + this.customInterstitialAdapterName.hashCode()) * 31) + this.customBannerAdapterName.hashCode();
    }

    public java.lang.String toString() {
        return "CustomAdapterSettings(customNetworkAdapterName=" + this.customNetworkAdapterName + ", customRewardedVideoAdapterName=" + this.customRewardedVideoAdapterName + ", customInterstitialAdapterName=" + this.customInterstitialAdapterName + ", customBannerAdapterName=" + this.customBannerAdapterName + ')';
    }
}
