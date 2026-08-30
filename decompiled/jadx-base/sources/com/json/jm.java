package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nJ&\u0010\b\u001a\u00020\u00072\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u0005¨\u0006\u000b"}, d2 = {"Lcom/ironsource/jm;", "", "", "", "mediationTypes", "", "isDemandOnlyInit", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class jm {
    public final void a(java.util.Map<java.lang.String, java.lang.String> mediationTypes, boolean isDemandOnlyInit) {
        if (isDemandOnlyInit && android.text.TextUtils.isEmpty(com.json.mediationsdk.p.m().q())) {
            if (mediationTypes == null || mediationTypes.isEmpty()) {
                return;
            }
            for (java.lang.String str : mediationTypes.keySet()) {
                if (com.json.mediationsdk.utils.IronSourceUtils.doesClassExist(str)) {
                    java.lang.String str2 = mediationTypes.get(str);
                    if (!android.text.TextUtils.isEmpty(str2)) {
                        str = str2;
                    }
                    com.json.mediationsdk.p.m().h(str);
                    return;
                }
            }
        }
    }
}
