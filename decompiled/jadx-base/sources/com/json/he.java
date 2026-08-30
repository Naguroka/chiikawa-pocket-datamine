package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/ironsource/he;", "", "Lorg/json/JSONObject;", "metaDataJson", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/vj;", "Lcom/ironsource/vj;", "globalDataWriter", "<init>", "(Lcom/ironsource/vj;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class he {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.vj globalDataWriter;

    public he(com.json.vj globalDataWriter) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(globalDataWriter, "globalDataWriter");
        this.globalDataWriter = globalDataWriter;
    }

    public final void a(org.json.JSONObject metaDataJson) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metaDataJson, "metaDataJson");
        if (metaDataJson.has(com.json.mediationsdk.metadata.a.i)) {
            try {
                java.lang.Object objRemove = metaDataJson.remove(com.json.mediationsdk.metadata.a.i);
                kotlin.jvm.internal.Intrinsics.checkNotNull(objRemove, "null cannot be cast to non-null type java.util.ArrayList<*>{ kotlin.collections.TypeAliasesKt.ArrayList<*> }");
                java.util.ArrayList arrayList = (java.util.ArrayList) objRemove;
                if (!arrayList.isEmpty()) {
                    java.lang.Object obj = arrayList.get(0);
                    kotlin.jvm.internal.Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.String");
                    this.globalDataWriter.d((java.lang.String) obj);
                }
            } catch (java.lang.ClassCastException e) {
                com.json.l9.d().a(e);
                com.json.mediationsdk.logger.IronLog.INTERNAL.error("got the following error " + e.getMessage());
            }
        }
    }
}
