package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H&J\u001e\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002H&J\u0012\u0010\n\u001a\f\u0012\u0004\u0012\u00020\u0002\u0012\u0002\b\u00030\tH&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000bÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/z9;", "", "", com.ironsource.y8.h.W, "value", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "defValue", "getString", "", "allData", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface z9 {
    static /* synthetic */ java.lang.String a(com.json.z9 z9Var, java.lang.String str, java.lang.String str2, int i, java.lang.Object obj) {
        if (obj != null) {
            throw new java.lang.UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getString");
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return z9Var.getString(str, str2);
    }

    void a(java.lang.String key);

    void a(java.lang.String key, java.lang.String value);

    java.util.Map<java.lang.String, ?> allData();

    java.lang.String getString(java.lang.String key, java.lang.String defValue);
}
