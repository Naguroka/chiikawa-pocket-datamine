package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\b"}, d2 = {"Lcom/ironsource/za;", "", "Lcom/ironsource/mediationsdk/logger/IronSourceError;", "error", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class za {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final com.json.za f3610a = new com.json.za();

    private za() {
    }

    public final boolean a(com.json.mediationsdk.logger.IronSourceError error) {
        if (error == null) {
            return false;
        }
        int errorCode = error.getErrorCode();
        return errorCode == 524 || errorCode == 530;
    }
}
