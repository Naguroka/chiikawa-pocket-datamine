package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0005¨\u0006\n"}, d2 = {"Lcom/ironsource/da;", "Lcom/ironsource/gs;", "", "b", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "encryptedResponse", "descriptionKey", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class da implements com.json.gs<java.lang.String> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String encryptedResponse;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final java.lang.String descriptionKey;

    public da(java.lang.String encryptedResponse, java.lang.String descriptionKey) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(encryptedResponse, "encryptedResponse");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(descriptionKey, "descriptionKey");
        this.encryptedResponse = encryptedResponse;
        this.descriptionKey = descriptionKey;
    }

    @Override // com.json.gs
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public java.lang.String a() {
        java.lang.String value = com.json.mediationsdk.utils.IronSourceAES.decode(this.descriptionKey, this.encryptedResponse);
        if (value == null || value.length() == 0) {
            throw new java.lang.IllegalArgumentException("Decryption failed");
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(value, "value");
        return value;
    }
}
