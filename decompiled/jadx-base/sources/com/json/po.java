package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\u000b\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u001f\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0007\u001a\u00020\u0002HÖ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\u0013\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0013"}, d2 = {"Lcom/ironsource/po;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "url", com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer.KEY_PACKAGE_NAME, "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "c", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class po {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String url;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String packageName;

    public po(java.lang.String url, java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.packageName = str;
    }

    public /* synthetic */ po(java.lang.String str, java.lang.String str2, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? "" : str2);
    }

    public static /* synthetic */ com.json.po a(com.json.po poVar, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = poVar.url;
        }
        if ((i & 2) != 0) {
            str2 = poVar.packageName;
        }
        return poVar.a(str, str2);
    }

    public final com.json.po a(java.lang.String url, java.lang.String packageName) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        return new com.json.po(url, packageName);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getPackageName() {
        return this.packageName;
    }

    public final java.lang.String c() {
        return this.packageName;
    }

    public final java.lang.String d() {
        return this.url;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.po)) {
            return false;
        }
        com.json.po poVar = (com.json.po) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.url, poVar.url) && kotlin.jvm.internal.Intrinsics.areEqual(this.packageName, poVar.packageName);
    }

    public int hashCode() {
        int iHashCode = this.url.hashCode() * 31;
        java.lang.String str = this.packageName;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public java.lang.String toString() {
        return "OpenUrl(url=" + this.url + ", packageName=" + this.packageName + ')';
    }
}
