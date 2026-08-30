package androidx.activity.result;

/* JADX INFO: compiled from: PickVisualMediaRequest.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¨\u0006\u0004"}, d2 = {"PickVisualMediaRequest", "Landroidx/activity/result/PickVisualMediaRequest;", "mediaType", "Landroidx/activity/result/contract/ActivityResultContracts$PickVisualMedia$VisualMediaType;", "activity_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class PickVisualMediaRequestKt {
    public static /* synthetic */ androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest$default(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType visualMediaType, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            visualMediaType = androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.ImageAndVideo.INSTANCE;
        }
        return PickVisualMediaRequest(visualMediaType);
    }

    public static final androidx.activity.result.PickVisualMediaRequest PickVisualMediaRequest(androidx.activity.result.contract.ActivityResultContracts.PickVisualMedia.VisualMediaType mediaType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        return new androidx.activity.result.PickVisualMediaRequest.Builder().setMediaType(mediaType).build();
    }
}
