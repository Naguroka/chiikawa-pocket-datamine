package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\nR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\r¨\u0006\u0011"}, d2 = {"Lcom/ironsource/j4;", "Lcom/ironsource/xe;", "Lcom/ironsource/h4;", "settings", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/ik;", "observer", "b", "Lcom/ironsource/pf;", "Lcom/ironsource/pf;", "featureAvailabilityService", "Lcom/ironsource/k4;", "Lcom/ironsource/k4;", "handler", "<init>", "(Lcom/ironsource/pf;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public class j4 implements com.json.xe {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.pf featureAvailabilityService;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private com.json.k4 handler;

    @kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004¨\u0006\n"}, d2 = {"Lcom/ironsource/j4$a;", "", "Lcom/ironsource/h4;", "settings", "Lcom/ironsource/pf;", "featureAvailabilityService", "Lcom/ironsource/k4;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {
        public final com.json.k4 a(com.json.h4 settings, com.json.pf featureAvailabilityService) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
            com.json.mediationsdk.logger.IronLog ironLog = com.json.mediationsdk.logger.IronLog.INTERNAL;
            ironLog.verbose("isAndroidxApplicationLifecycleAvailable: " + featureAvailabilityService.a());
            ironLog.verbose("isAndroidxApplicationLifecycleEnabled: " + (settings != null ? java.lang.Boolean.valueOf(settings.getIsAndroidxApplicationLifecycleEnabled()) : null));
            boolean z = false;
            if (featureAvailabilityService.a()) {
                com.json.wq.i().a(new com.json.wb(com.json.mediationsdk.utils.IronSourceConstants.TROUBLESHOOTING_ANDROIDX_PROCESS_LIFECYCLE_OWNER_AVAILABLE, com.json.mediationsdk.utils.IronSourceUtils.getMediationAdditionalData(false)));
            }
            if ((settings != null ? settings.getIsAndroidxApplicationLifecycleEnabled() : false) && featureAvailabilityService.a()) {
                z = true;
            }
            ironLog.verbose("isAndroidxEnabled: " + z);
            return z ? new com.json.s3() : new com.json.eg();
        }
    }

    public j4(com.json.pf featureAvailabilityService) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(featureAvailabilityService, "featureAvailabilityService");
        this.featureAvailabilityService = featureAvailabilityService;
    }

    @Override // com.json.xe
    public void a(com.json.h4 settings) {
        if (this.handler == null) {
            this.handler = new com.ironsource.j4.a().a(settings, this.featureAvailabilityService);
        }
    }

    @Override // com.json.k4
    public void a(com.json.ik observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
        com.json.k4 k4Var = this.handler;
        if (k4Var != null) {
            k4Var.a(observer);
        }
    }

    @Override // com.json.k4
    public void b(com.json.ik observer) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(observer, "observer");
        com.json.k4 k4Var = this.handler;
        if (k4Var != null) {
            k4Var.b(observer);
        }
    }
}
