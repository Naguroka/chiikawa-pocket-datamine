package com.unity3d.ads.core.data.model.exception;

/* JADX INFO: compiled from: LoadException.kt */
/* JADX INFO: loaded from: classes6.dex */
@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00060\u0001j\u0002`\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/unity3d/ads/core/data/model/exception/LoadException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_ERROR_CODE, "", com.bytedance.sdk.component.pglcrypt.PglCryptUtils.KEY_MESSAGE, "", "(ILjava/lang/String;)V", "getErrorCode", "()I", "unity-ads_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LoadException extends java.lang.Exception {
    private final int errorCode;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoadException(int i, java.lang.String message) {
        super(message);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(message, "message");
        this.errorCode = i;
    }

    public final int getErrorCode() {
        return this.errorCode;
    }
}
