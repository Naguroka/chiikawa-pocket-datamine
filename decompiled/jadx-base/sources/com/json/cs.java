package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J \u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0006H\u0016J \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\fH\u0016J \u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\fH\u0016¨\u0006\u000f"}, d2 = {"Lcom/ironsource/cs;", "Lcom/ironsource/th;", "Landroid/content/Context;", "context", "", com.ironsource.y8.h.W, "", "value", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "defaultValue", "b", "", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class cs implements com.json.th {
    @Override // com.json.th
    public void a(android.content.Context context, java.lang.String key, int value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        com.json.mediationsdk.utils.IronSourceUtils.saveIntToSharedPrefs(context, key, value);
    }

    @Override // com.json.th
    public void a(android.content.Context context, java.lang.String key, long value) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        com.json.mediationsdk.utils.IronSourceUtils.saveLongToSharedPrefs(context, key, value);
    }

    @Override // com.json.th
    public int b(android.content.Context context, java.lang.String key, int defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return com.json.mediationsdk.utils.IronSourceUtils.getIntFromSharedPrefs(context, key, defaultValue);
    }

    @Override // com.json.th
    public long b(android.content.Context context, java.lang.String key, long defaultValue) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        return com.json.mediationsdk.utils.IronSourceUtils.getLongFromSharedPrefs(context, key, defaultValue);
    }
}
