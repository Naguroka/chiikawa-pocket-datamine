package com.unity3d.ads.core.data.model;

/* JADX INFO: compiled from: WebViewConfiguration.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0080\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/data/model/WebViewConfiguration;", "", "version", "", "entryPoint", "", "additionalFiles", "", "(ILjava/lang/String;Ljava/util/List;)V", "getAdditionalFiles", "()Ljava/util/List;", "getEntryPoint", "()Ljava/lang/String;", com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge.versionMethodName, "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class WebViewConfiguration {
    private final java.util.List<java.lang.String> additionalFiles;
    private final java.lang.String entryPoint;
    private final int version;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.unity3d.ads.core.data.model.WebViewConfiguration copy$default(com.unity3d.ads.core.data.model.WebViewConfiguration webViewConfiguration, int i, java.lang.String str, java.util.List list, int i2, java.lang.Object obj) {
        if ((i2 & 1) != 0) {
            i = webViewConfiguration.version;
        }
        if ((i2 & 2) != 0) {
            str = webViewConfiguration.entryPoint;
        }
        if ((i2 & 4) != 0) {
            list = webViewConfiguration.additionalFiles;
        }
        return webViewConfiguration.copy(i, str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getVersion() {
        return this.version;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final java.lang.String getEntryPoint() {
        return this.entryPoint;
    }

    public final java.util.List<java.lang.String> component3() {
        return this.additionalFiles;
    }

    public final com.unity3d.ads.core.data.model.WebViewConfiguration copy(int version, java.lang.String entryPoint, java.util.List<java.lang.String> additionalFiles) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalFiles, "additionalFiles");
        return new com.unity3d.ads.core.data.model.WebViewConfiguration(version, entryPoint, additionalFiles);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.unity3d.ads.core.data.model.WebViewConfiguration)) {
            return false;
        }
        com.unity3d.ads.core.data.model.WebViewConfiguration webViewConfiguration = (com.unity3d.ads.core.data.model.WebViewConfiguration) other;
        return this.version == webViewConfiguration.version && kotlin.jvm.internal.Intrinsics.areEqual(this.entryPoint, webViewConfiguration.entryPoint) && kotlin.jvm.internal.Intrinsics.areEqual(this.additionalFiles, webViewConfiguration.additionalFiles);
    }

    public int hashCode() {
        return (((java.lang.Integer.hashCode(this.version) * 31) + this.entryPoint.hashCode()) * 31) + this.additionalFiles.hashCode();
    }

    public java.lang.String toString() {
        return "WebViewConfiguration(version=" + this.version + ", entryPoint=" + this.entryPoint + ", additionalFiles=" + this.additionalFiles + ')';
    }

    public WebViewConfiguration(int i, java.lang.String entryPoint, java.util.List<java.lang.String> additionalFiles) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(entryPoint, "entryPoint");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(additionalFiles, "additionalFiles");
        this.version = i;
        this.entryPoint = entryPoint;
        this.additionalFiles = additionalFiles;
    }

    public final int getVersion() {
        return this.version;
    }

    public final java.lang.String getEntryPoint() {
        return this.entryPoint;
    }

    public final java.util.List<java.lang.String> getAdditionalFiles() {
        return this.additionalFiles;
    }
}
