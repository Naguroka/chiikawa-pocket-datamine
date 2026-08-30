package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H&J\u001e\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/ironsource/hv;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "", "value", "Lkotlin/Function0;", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "lazyError", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface hv {
    void a() throws com.json.kr;

    default void a(boolean value, kotlin.jvm.functions.Function0<? extends com.json.mediationsdk.logger.IronSourceError> lazyError) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(lazyError, "lazyError");
        if (!value) {
            throw new com.json.kr(lazyError.invoke());
        }
    }
}
