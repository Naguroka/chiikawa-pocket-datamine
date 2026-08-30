package com.json.mediationsdk;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\t\u0010\u0003\u001a\u00020\u0002HÆ\u0003J\t\u0010\u0004\u001a\u00020\u0002HÆ\u0003J\u001d\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001J\t\u0010\t\u001a\u00020\bHÖ\u0001J\t\u0010\n\u001a\u00020\u0002HÖ\u0001J\u0013\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/ironsource/mediationsdk/ISContainerParams;", "", "", "component1", "component2", "width", "height", "copy", "", "toString", "hashCode", "other", "", "equals", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "I", "getWidth", "()I", "b", "getHeight", "<init>", "(II)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class ISContainerParams {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final int height;

    public ISContainerParams(int i, int i2) {
        this.width = i;
        this.height = i2;
    }

    public static /* synthetic */ com.json.mediationsdk.ISContainerParams copy$default(com.json.mediationsdk.ISContainerParams iSContainerParams, int i, int i2, int i3, java.lang.Object obj) {
        if ((i3 & 1) != 0) {
            i = iSContainerParams.width;
        }
        if ((i3 & 2) != 0) {
            i2 = iSContainerParams.height;
        }
        return iSContainerParams.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final com.json.mediationsdk.ISContainerParams copy(int width, int height) {
        return new com.json.mediationsdk.ISContainerParams(width, height);
    }

    public boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.json.mediationsdk.ISContainerParams)) {
            return false;
        }
        com.json.mediationsdk.ISContainerParams iSContainerParams = (com.json.mediationsdk.ISContainerParams) other;
        return this.width == iSContainerParams.width && this.height == iSContainerParams.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.width) * 31) + java.lang.Integer.hashCode(this.height);
    }

    public java.lang.String toString() {
        return "ISContainerParams(width=" + this.width + ", height=" + this.height + ')';
    }
}
