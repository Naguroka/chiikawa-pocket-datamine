package com.json.mediationsdk.demandOnly;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/b;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface b {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0012\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0014"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/b$a;", "", "", "b", "I", "ERROR_LOAD_NO_FILL", "c", "ERROR_INSTANCE_LOAD_TIMEOUT", "d", "ERROR_INSTANCE_LOAD_EMPTY_BANNER", "e", "ERROR_INSTANCE_LOAD_EMPTY_SERVER_DATA", "f", "ERROR_LOAD_ALREADY_IN_PROGRESS", "g", "ERROR_INSTANCE_LOAD_AUCTION_FAILED", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "ERROR_CODE_MISSING_CONFIGURATION", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.mediationsdk.demandOnly.b.a f2948a = new com.ironsource.mediationsdk.demandOnly.b.a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int ERROR_LOAD_NO_FILL = 606;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final int ERROR_INSTANCE_LOAD_TIMEOUT = 608;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final int ERROR_INSTANCE_LOAD_EMPTY_BANNER = 610;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public static final int ERROR_INSTANCE_LOAD_EMPTY_SERVER_DATA = 618;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public static final int ERROR_LOAD_ALREADY_IN_PROGRESS = 619;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public static final int ERROR_INSTANCE_LOAD_AUCTION_FAILED = 621;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public static final int ERROR_CODE_MISSING_CONFIGURATION = 1063;

        private a() {
        }
    }

    /* JADX INFO: renamed from: com.ironsource.mediationsdk.demandOnly.b$b, reason: collision with other inner class name */
    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004¨\u0006\u0016"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/b$b;", "", "", "b", "I", "INSTANCE_LOAD", "c", "INSTANCE_LOAD_SUCCESS", "d", "INSTANCE_CLICK", "e", "INSTANCE_SHOW", "f", "INSTANCE_LOAD_ERROR", "g", "INSTANCE_LEAVE_APP", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "INSTANCE_DESTROY", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "INSTANCE_LOAD_NO_FILL", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class C0239b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.json.mediationsdk.demandOnly.b.C0239b f2949a = new com.json.mediationsdk.demandOnly.b.C0239b();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD = 3002;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_SUCCESS = 3005;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final int INSTANCE_CLICK = 3008;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public static final int INSTANCE_SHOW = 3009;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_ERROR = 3300;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public static final int INSTANCE_LEAVE_APP = 3304;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public static final int INSTANCE_DESTROY = 3305;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_NO_FILL = 3306;

        private C0239b() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004¨\u0006\u001a"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/b$c;", "", "", "b", "I", "TROUBLESHOOTING_INSTANCE_LOAD_FAILED", "c", "TROUBLESHOOTING_INSTANCE_LOAD_WITH_ADM", "d", "TROUBLESHOOTING_INSTANCE_LOAD_SUCCESS", "e", "TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING", "f", "TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST", "g", "TROUBLESHOOTING_INSTANCE_AUCTION_FAILED", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "TROUBLESHOOTING_INSTANCE_AUCTION_SUCCESS", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST_WATERFALL", "j", "TROUBLESHOOTING_INSTANCE_AUCTION_RESPONSE_WATERFALL", "k", "TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.mediationsdk.demandOnly.b.c f2950a = new com.ironsource.mediationsdk.demandOnly.b.c();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_LOAD_FAILED = 83300;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_LOAD_WITH_ADM = 83302;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_LOAD_SUCCESS = 83305;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_UNABLE_TO_START_LOADING = 83309;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST = 83500;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_FAILED = 83501;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_SUCCESS = 83502;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST_WATERFALL = 83510;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_RESPONSE_WATERFALL = 83511;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR = 88002;

        private c() {
        }
    }
}
