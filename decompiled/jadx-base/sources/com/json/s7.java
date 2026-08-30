package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\b\u0000\u0018\u0000*\f\b\u0000\u0010\u0002*\u0006\u0012\u0002\b\u00030\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B/\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010\t\u001a\u00020\bH\u0016R\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/ironsource/s7;", "Lcom/ironsource/n7;", "Smash", "Lcom/ironsource/dw;", "smash", "", "c", "(Lcom/ironsource/n7;)V", "", "e", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "Z", "isBidderReached", "", "maxSmashesToLoad", com.json.mediationsdk.d.z, "", com.json.mediationsdk.d.h, "<init>", "(IZLjava/util/List;Z)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class s7<Smash extends com.json.n7<?>> extends com.json.dw<Smash> {

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private boolean isBidderReached;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s7(int i, boolean z, java.util.List<? extends Smash> waterfall, boolean z2) {
        super(i, z, waterfall);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(waterfall, "waterfall");
        this.isBidderReached = z2;
    }

    public /* synthetic */ s7(int i, boolean z, java.util.List list, boolean z2, int i2, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(i, z, list, (i2 & 8) != 0 ? false : z2);
    }

    @Override // com.json.dw
    public void c(Smash smash) {
        java.lang.String str;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(smash, "smash");
        if (!smash.w()) {
            com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(smash.g().name() + " - Smash " + smash.c() + " (non-bidder) is ready to load");
            smash.a(true);
            c().add(smash);
            return;
        }
        this.isBidderReached = true;
        if (d() == 0) {
            str = "Advanced Loading: Starting to load bidder " + smash.c() + ". No other instances will be loaded at the same time.";
            smash.a(true);
            c().add(smash);
        } else {
            str = "Advanced Loading: Won't start loading bidder " + smash.c() + " as a non bidder is being loaded";
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.verbose(smash.g().name() + " - " + str);
        com.json.mediationsdk.utils.IronSourceUtils.sendAutomationLog(str);
    }

    @Override // com.json.dw
    public boolean e() {
        return super.e() || this.isBidderReached;
    }
}
