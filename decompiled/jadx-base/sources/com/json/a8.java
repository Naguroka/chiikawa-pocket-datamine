package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0005\u001a\u00020\u0002HÆ\u0003J'\u0010\u0003\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\u0002HÖ\u0001J\t\u0010\u000b\u001a\u00020\nHÖ\u0001J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0003\u0010\u0012R\"\u0010\u0007\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011\"\u0004\b\u0005\u0010\u0012R\"\u0010\b\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0004\u0010\u0012¨\u0006\u0017"}, d2 = {"Lcom/ironsource/a8;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "cachedAppKey", "cachedUserId", "cachedSettings", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "d", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "f", "e", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class a8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private java.lang.String cachedAppKey;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private java.lang.String cachedUserId;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private java.lang.String cachedSettings;

    public a8(java.lang.String cachedAppKey, java.lang.String cachedUserId, java.lang.String cachedSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        this.cachedAppKey = cachedAppKey;
        this.cachedUserId = cachedUserId;
        this.cachedSettings = cachedSettings;
    }

    public static /* synthetic */ com.json.a8 a(com.json.a8 a8Var, java.lang.String str, java.lang.String str2, java.lang.String str3, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = a8Var.cachedAppKey;
        }
        if ((i & 2) != 0) {
            str2 = a8Var.cachedUserId;
        }
        if ((i & 4) != 0) {
            str3 = a8Var.cachedSettings;
        }
        return a8Var.a(str, str2, str3);
    }

    public final com.json.a8 a(java.lang.String cachedAppKey, java.lang.String cachedUserId, java.lang.String cachedSettings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedAppKey, "cachedAppKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedUserId, "cachedUserId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cachedSettings, "cachedSettings");
        return new com.json.a8(cachedAppKey, cachedUserId, cachedSettings);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.String getCachedAppKey() {
        return this.cachedAppKey;
    }

    public final void a(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cachedAppKey = str;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getCachedUserId() {
        return this.cachedUserId;
    }

    public final void b(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cachedSettings = str;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final java.lang.String getCachedSettings() {
        return this.cachedSettings;
    }

    public final void c(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.cachedUserId = str;
    }

    public final java.lang.String d() {
        return this.cachedAppKey;
    }

    public final java.lang.String e() {
        return this.cachedSettings;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.a8)) {
            return false;
        }
        com.json.a8 a8Var = (com.json.a8) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cachedAppKey, a8Var.cachedAppKey) && kotlin.jvm.internal.Intrinsics.areEqual(this.cachedUserId, a8Var.cachedUserId) && kotlin.jvm.internal.Intrinsics.areEqual(this.cachedSettings, a8Var.cachedSettings);
    }

    public final java.lang.String f() {
        return this.cachedUserId;
    }

    public int hashCode() {
        return (((this.cachedAppKey.hashCode() * 31) + this.cachedUserId.hashCode()) * 31) + this.cachedSettings.hashCode();
    }

    public java.lang.String toString() {
        return "CachedResponse(cachedAppKey=" + this.cachedAppKey + ", cachedUserId=" + this.cachedUserId + ", cachedSettings=" + this.cachedSettings + ')';
    }
}
