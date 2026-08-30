package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\u0005\u0010\t\u001a\u0004\b\u0003\u0010\n¨\u0006\u0012"}, d2 = {"Lcom/ironsource/cq;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "b", "()Ljava/lang/String;", "name", "", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "amount", "Lorg/json/JSONObject;", "features", "nameKey", "amountKey", "<init>", "(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class cq {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String name;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.Integer amount;

    public cq(org.json.JSONObject features, java.lang.String nameKey, java.lang.String amountKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(features, "features");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nameKey, "nameKey");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(amountKey, "amountKey");
        this.name = features.has(nameKey) ? features.getString(nameKey) : null;
        this.amount = features.has(amountKey) ? java.lang.Integer.valueOf(features.getInt(amountKey)) : null;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final java.lang.Integer getAmount() {
        return this.amount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final java.lang.String getName() {
        return this.name;
    }
}
