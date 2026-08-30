package com.json.mediationsdk.demandOnly;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/e;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface e {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/e$a;", "", "", "b", "I", "ERROR_LOAD_ALREADY_IN_PROGRESS", "c", "ERROR_LOAD_TIMED_OUT", "d", "ERROR_CODE_MISSING_CONFIGURATION", "e", "ERROR_SHOW_DURING_SHOW", "f", "ERROR_SHOW_DURING_LOAD", "g", "ERROR_SHOW_NO_AVAILABLE_ADS", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "ERROR_LOAD_NO_FILL", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "ERROR_INSTANCE_LOAD_EMPTY_SERVER_DATA", "j", "ERROR_INSTANCE_LOAD_AUCTION_FAILED", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.mediationsdk.demandOnly.e.a f2954a = new com.ironsource.mediationsdk.demandOnly.e.a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int ERROR_LOAD_ALREADY_IN_PROGRESS = 1050;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final int ERROR_LOAD_TIMED_OUT = 1052;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final int ERROR_CODE_MISSING_CONFIGURATION = 1063;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public static final int ERROR_SHOW_DURING_SHOW = 1064;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public static final int ERROR_SHOW_DURING_LOAD = 1065;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public static final int ERROR_SHOW_NO_AVAILABLE_ADS = 1066;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public static final int ERROR_LOAD_NO_FILL = 1158;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public static final int ERROR_INSTANCE_LOAD_EMPTY_SERVER_DATA = 1162;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public static final int ERROR_INSTANCE_LOAD_AUCTION_FAILED = 1164;

        private a() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b&\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004R\u0014\u0010%\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u0004¨\u0006("}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/e$b;", "", "", "b", "I", "INSTANCE_LOAD", "c", "INSTANCE_LOAD_SUCCESS", "d", "INSTANCE_OPENED", "e", "INSTANCE_CLICKED", "f", "INSTANCE_LOAD_FAILED", "g", "INSTANCE_SHOW", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "INSTANCE_SHOW_SUCCESS", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "INSTANCE_SHOW_FAILED", "j", "INSTANCE_CLOSED", "k", "INSTANCE_VISIBLE", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "INSTANCE_READY_TRUE", "m", "INSTANCE_READY_FALSE", com.json.zb.q, "INSTANCE_LOAD_NO_FILL", "o", "INSTANCE_LOAD_ERROR", androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, "INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK", "q", "INSTANCE_NOT_FOUND_IN_LOAD", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "INSTANCE_NOT_FOUND_IN_SHOW", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.mediationsdk.demandOnly.e.b f2955a = new com.ironsource.mediationsdk.demandOnly.e.b();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD = 2002;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_SUCCESS = 2003;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final int INSTANCE_OPENED = 2005;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public static final int INSTANCE_CLICKED = 2006;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_FAILED = 2200;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public static final int INSTANCE_SHOW = 2201;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public static final int INSTANCE_SHOW_SUCCESS = 2202;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public static final int INSTANCE_SHOW_FAILED = 2203;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public static final int INSTANCE_CLOSED = 2204;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public static final int INSTANCE_VISIBLE = 2210;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        public static final int INSTANCE_READY_TRUE = 2211;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public static final int INSTANCE_READY_FALSE = 2212;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_NO_FILL = 2213;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_ERROR = 2303;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        public static final int INSTANCE_NOT_FOUND_IN_AVAILABILITY_CHECK = 2500;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        public static final int INSTANCE_NOT_FOUND_IN_LOAD = 2503;

        /* JADX INFO: renamed from: r, reason: from kotlin metadata */
        public static final int INSTANCE_NOT_FOUND_IN_SHOW = 2507;

        private b() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/e$c;", "", "", "b", "I", "TROUBLESHOOTING_INSTANCE_LOAD_WITH_ADM", "c", "TROUBLESHOOTING_INSTANCE_LOAD_SUCCESS", "d", "TROUBLESHOOTING_INSTANCE_LOAD_FAILED", "e", "TROUBLESHOOTING_INSTANCE_AUCTION_FAILED", "f", "TROUBLESHOOTING_INSTANCE_AUCTION_SUCCESS", "g", "TROUBLESHOOTING_INSTANCE_AUCTION_RESPONSE_WATERFALL", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST_WATERFALL", "j", "TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.mediationsdk.demandOnly.e.c f2956a = new com.ironsource.mediationsdk.demandOnly.e.c();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_LOAD_WITH_ADM = 82002;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_LOAD_SUCCESS = 82003;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_LOAD_FAILED = 82110;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_FAILED = 82300;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_SUCCESS = 82301;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_RESPONSE_WATERFALL = 82302;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST = 82500;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_INSTANCE_AUCTION_REQUEST_WATERFALL = 82510;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public static final int TROUBLESHOOTING_AUCTION_SUCCESSFUL_RECOVERY_ERROR = 88002;

        private c() {
        }
    }
}
