package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/ironsource/d;", "Lcom/ironsource/uc;", "", "value", "Lcom/ironsource/ap;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/ap;", "folderRootUrl", "<init>", "(Lcom/ironsource/ap;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class d implements com.json.uc {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.ap folderRootUrl;

    public d(com.json.ap folderRootUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(folderRootUrl, "folderRootUrl");
        this.folderRootUrl = folderRootUrl;
    }

    @Override // com.json.uc
    public java.lang.String value() {
        return this.folderRootUrl.a() + "/abTestMap.json";
    }
}
