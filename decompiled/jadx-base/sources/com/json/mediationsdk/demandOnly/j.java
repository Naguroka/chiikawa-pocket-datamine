package com.json.mediationsdk.demandOnly;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0005À\u0006\u0001"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/j;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface j {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0018\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004¨\u0006\u001a"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/j$a;", "", "", "b", "I", "LOAD_ALREADY_IN_PROGRESS", "c", "LOAD_TIMED_OUT", "d", "LOAD_NO_FILL", "e", "INSTANCE_LOAD_EMPTY_SERVER_DATA", "f", "CODE_MISSING_CONFIGURATION", "g", "SHOW_DURING_SHOW", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "SHOW_DURING_LOAD", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "SHOW_NO_AVAILABLE_ADS", "j", "INSTANCE_LOAD_AUCTION_FAILED", "k", "LOAD_ERROR", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.mediationsdk.demandOnly.j.a f2962a = new com.ironsource.mediationsdk.demandOnly.j.a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int LOAD_ALREADY_IN_PROGRESS = 1053;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final int LOAD_TIMED_OUT = 1055;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final int LOAD_NO_FILL = 1058;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_EMPTY_SERVER_DATA = 1062;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public static final int CODE_MISSING_CONFIGURATION = 1063;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public static final int SHOW_DURING_SHOW = 1067;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public static final int SHOW_DURING_LOAD = 1068;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public static final int SHOW_NO_AVAILABLE_ADS = 1069;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_AUCTION_FAILED = 1070;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public static final int LOAD_ERROR = 1071;

        private a() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b$\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010!\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0004R\u0014\u0010#\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u0004¨\u0006&"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/j$b;", "", "", "b", "I", "LOAD", "c", "LOAD_SUCCESS", "d", "OPENED", "e", "CLICKED", "f", "REWARDED", "g", "LOAD_FAILED", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "SHOW", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "SHOW_FAILED", "j", "CLOSED", "k", "VISIBLE", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "LOAD_NO_FILL", "m", "READY_TRUE", com.json.zb.q, "READY_FALSE", "o", "NOT_FOUND_IN_AVAILABILITY_CHECK", androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, "NOT_FOUND_IN_LOAD", "q", "NOT_FOUND_IN_SHOW", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.mediationsdk.demandOnly.j.b f2963a = new com.ironsource.mediationsdk.demandOnly.j.b();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int LOAD = 1001;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final int LOAD_SUCCESS = 1002;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final int OPENED = 1005;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public static final int CLICKED = 1006;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public static final int REWARDED = 1010;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public static final int LOAD_FAILED = 1200;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public static final int SHOW = 1201;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public static final int SHOW_FAILED = 1202;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public static final int CLOSED = 1203;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        public static final int VISIBLE = 1206;

        /* JADX INFO: renamed from: l, reason: from kotlin metadata */
        public static final int LOAD_NO_FILL = 1213;

        /* JADX INFO: renamed from: m, reason: from kotlin metadata */
        public static final int READY_TRUE = 1210;

        /* JADX INFO: renamed from: n, reason: from kotlin metadata */
        public static final int READY_FALSE = 1211;

        /* JADX INFO: renamed from: o, reason: from kotlin metadata */
        public static final int NOT_FOUND_IN_AVAILABILITY_CHECK = 1500;

        /* JADX INFO: renamed from: p, reason: from kotlin metadata */
        public static final int NOT_FOUND_IN_LOAD = 1503;

        /* JADX INFO: renamed from: q, reason: from kotlin metadata */
        public static final int NOT_FOUND_IN_SHOW = 1507;

        private b() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/ironsource/mediationsdk/demandOnly/j$c;", "", "", "b", "I", "INSTANCE_LOAD_WITH_ADM", "c", "INSTANCE_LOAD_SUCCESS", "d", "INSTANCE_LOAD_FAILED", "e", "INSTANCE_AUCTION_FAILED", "f", "INSTANCE_AUCTION_SUCCESS", "g", "INSTANCE_AUCTION_RESPONSE_WATERFALL", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "INSTANCE_AUCTION_REQUEST", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "INSTANCE_AUCTION_REQUEST_WATERFALL", "j", "AUCTION_SUCCESSFUL_RECOVERY_ERROR", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.mediationsdk.demandOnly.j.c f2964a = new com.ironsource.mediationsdk.demandOnly.j.c();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_WITH_ADM = 81002;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_SUCCESS = 81003;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_FAILED = 81110;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_FAILED = 81300;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_SUCCESS = 81301;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_RESPONSE_WATERFALL = 81302;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_REQUEST = 81500;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_REQUEST_WATERFALL = 81510;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public static final int AUCTION_SUCCESSFUL_RECOVERY_ERROR = 88002;

        private c() {
        }
    }
}
