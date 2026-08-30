package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/ironsource/ap;", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/lang/String;", "baseControllerUrl", "<init>", "(Ljava/lang/String;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class ap {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final java.lang.String baseControllerUrl;

    public ap(java.lang.String baseControllerUrl) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(baseControllerUrl, "baseControllerUrl");
        this.baseControllerUrl = baseControllerUrl;
    }

    public final java.lang.String a() {
        java.lang.String str = this.baseControllerUrl;
        java.lang.String strSubstring = str.substring(0, kotlin.text.StringsKt.lastIndexOf$default((java.lang.CharSequence) str, "/", 0, false, 6, (java.lang.Object) null));
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        return strSubstring;
    }
}
