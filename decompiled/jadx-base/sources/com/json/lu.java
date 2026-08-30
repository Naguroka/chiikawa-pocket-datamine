package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000b\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003J\u0015\u0010\u0003\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002HÆ\u0001J\t\u0010\u0005\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\f\u0010\u000e¨\u0006\u0010"}, d2 = {"Lcom/ironsource/lu;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "controllerUrl", "toString", "", "hashCode", "other", "", "equals", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "(Ljava/lang/String;)V", "<init>", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class lu {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private java.lang.String controllerUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public lu() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public lu(java.lang.String str) {
        this.controllerUrl = str;
    }

    public /* synthetic */ lu(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }

    public static /* synthetic */ com.json.lu a(com.json.lu luVar, java.lang.String str, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = luVar.controllerUrl;
        }
        return luVar.a(str);
    }

    public final com.json.lu a(java.lang.String controllerUrl) {
        return new com.json.lu(controllerUrl);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.String getControllerUrl() {
        return this.controllerUrl;
    }

    public final java.lang.String b() {
        return this.controllerUrl;
    }

    public final void b(java.lang.String str) {
        this.controllerUrl = str;
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof com.json.lu) && kotlin.jvm.internal.Intrinsics.areEqual(this.controllerUrl, ((com.json.lu) other).controllerUrl);
    }

    public int hashCode() {
        java.lang.String str = this.controllerUrl;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "TestSuiteSettings(controllerUrl=" + this.controllerUrl + ')';
    }
}
