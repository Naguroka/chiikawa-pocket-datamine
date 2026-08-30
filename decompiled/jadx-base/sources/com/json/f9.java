package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\tR\u0014\u0010\r\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000e¨\u0006\u0012"}, d2 = {"Lcom/ironsource/f9;", "Lcom/ironsource/gf;", "", "c", "b", "", "d", "Lcom/ironsource/ap;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "controllerUrl", "cacheFolder", "Z", "shouldUseVersionedFlow", "Lcom/ironsource/ap;", "rootFolder", "<init>", "(Ljava/lang/String;Ljava/lang/String;ZLcom/ironsource/ap;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class f9 implements com.json.gf {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String controllerUrl;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String cacheFolder;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final boolean shouldUseVersionedFlow;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final com.json.ap rootFolder;

    public f9() {
        this(null, null, false, null, 15, null);
    }

    public f9(java.lang.String controllerUrl, java.lang.String cacheFolder, boolean z, com.json.ap rootFolder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(controllerUrl, "controllerUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cacheFolder, "cacheFolder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rootFolder, "rootFolder");
        this.controllerUrl = controllerUrl;
        this.cacheFolder = cacheFolder;
        this.shouldUseVersionedFlow = z;
        this.rootFolder = rootFolder;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ f9(java.lang.String str, java.lang.String str2, boolean z, com.json.ap apVar, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        str = (i & 1) != 0 ? "" : str;
        this(str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? false : z, (i & 8) != 0 ? new com.json.ap(str) : apVar);
    }

    @Override // com.json.gf
    /* JADX INFO: renamed from: a, reason: from getter */
    public com.json.ap getRootFolder() {
        return this.rootFolder;
    }

    @Override // com.json.gf
    /* JADX INFO: renamed from: b, reason: from getter */
    public java.lang.String getCacheFolder() {
        return this.cacheFolder;
    }

    @Override // com.json.gf
    /* JADX INFO: renamed from: c, reason: from getter */
    public java.lang.String getControllerUrl() {
        return this.controllerUrl;
    }

    @Override // com.json.gf
    /* JADX INFO: renamed from: d, reason: from getter */
    public boolean getShouldUseVersionedFlow() {
        return this.shouldUseVersionedFlow;
    }
}
