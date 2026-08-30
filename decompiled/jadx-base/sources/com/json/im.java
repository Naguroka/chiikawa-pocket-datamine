package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000Ô\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u00102\u00020\u00012\u00020\u0002:\u0001\nB\u000b\b\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\b\u0010\b\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\tH\u0016J\b\u0010\f\u001a\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\b\u0010\u0010\u001a\u00020\u000fH\u0016J\b\u0010\u0012\u001a\u00020\u0011H\u0016J\b\u0010\u0014\u001a\u00020\u0013H\u0016J\b\u0010\u0016\u001a\u00020\u0015H\u0016J\b\u0010\u0018\u001a\u00020\u0017H\u0016J\b\u0010\u001a\u001a\u00020\u0019H\u0016J\b\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001e\u001a\u00020\u001dH\u0016J\b\u0010 \u001a\u00020\u001fH\u0016J\b\u0010\"\u001a\u00020!H\u0016J\b\u0010$\u001a\u00020#H\u0016J\b\u0010&\u001a\u00020%H\u0016J\b\u0010(\u001a\u00020'H\u0016J\b\u0010*\u001a\u00020)H\u0016J\b\u0010,\u001a\u00020+H\u0016J\b\u0010.\u001a\u00020-H\u0016J\b\u00100\u001a\u00020/H\u0016J\b\u00102\u001a\u000201H\u0016J\b\u00104\u001a\u000203H\u0016J\b\u00106\u001a\u000205H\u0016J\b\u00108\u001a\u000207H\u0016J\b\u0010:\u001a\u000209H\u0016J\b\u0010<\u001a\u00020;H\u0016J\b\u0010>\u001a\u00020=H\u0016J\b\u0010@\u001a\u00020?H\u0016J\b\u0010B\u001a\u00020AH\u0016R\u001b\u0010G\u001a\u00020C8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010D\u001a\u0004\bE\u0010FR\u001b\u0010K\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010D\u001a\u0004\bI\u0010JR\u001b\u0010O\u001a\u00020L8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u0010D\u001a\u0004\bM\u0010NR\u001b\u0010S\u001a\u00020P8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u0010D\u001a\u0004\bQ\u0010RR\u001b\u0010W\u001a\u00020T8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0006\u0010D\u001a\u0004\bU\u0010VR\u001b\u0010[\u001a\u00020X8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010D\u001a\u0004\bY\u0010ZR\u001b\u0010_\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010D\u001a\u0004\b]\u0010^R\u001b\u0010c\u001a\u00020`8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010D\u001a\u0004\ba\u0010bR\u001b\u0010g\u001a\u00020d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010D\u001a\u0004\be\u0010fR\u001b\u0010k\u001a\u00020h8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010D\u001a\u0004\bi\u0010jR\u001b\u0010o\u001a\u00020l8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0004\u0010D\u001a\u0004\bm\u0010nR\u001b\u0010s\u001a\u00020p8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b(\u0010D\u001a\u0004\bq\u0010rR\u001b\u0010w\u001a\u00020t8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010D\u001a\u0004\bu\u0010vR\u001b\u0010{\u001a\u00020x8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010D\u001a\u0004\by\u0010zR\u001b\u0010\u007f\u001a\u00020|8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010D\u001a\u0004\b}\u0010~R\u001f\u0010\u0083\u0001\u001a\u00030\u0080\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b \u0010D\u001a\u0006\b\u0081\u0001\u0010\u0082\u0001R\u001f\u0010\u0087\u0001\u001a\u00030\u0084\u00018BX\u0082\u0084\u0002¢\u0006\u000e\n\u0004\b:\u0010D\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001¨\u0006\u008a\u0001"}, d2 = {"Lcom/ironsource/im;", "Lcom/ironsource/sf;", "Lcom/ironsource/rf;", "Lcom/ironsource/vh;", "k", "Lcom/ironsource/vh$a;", "e", "Lcom/ironsource/if;", "f", "Lcom/ironsource/if$a;", "b", "Lcom/ironsource/uh;", "j", "Lcom/ironsource/uh$a;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "Lcom/ironsource/ve;", com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource.DIRECTORY_MODE_READ, "Lcom/ironsource/ve$a;", "C", "Lcom/ironsource/wf;", "B", "Lcom/ironsource/wf$a;", "m", "Lcom/ironsource/uf;", "y", "Lcom/ironsource/uf$a;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/bf;", "u", "Lcom/ironsource/bf$a;", "w", "Lcom/ironsource/zf;", androidx.media3.extractor.text.ttml.TtmlNode.TAG_P, "Lcom/ironsource/zf$a;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "Lcom/ironsource/xg;", "z", "Lcom/ironsource/xg$a;", com.json.zb.q, "Lcom/ironsource/wh;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE, "Lcom/ironsource/m0;", "F", "Lcom/ironsource/wh$a;", "g", "Lcom/ironsource/m0$a;", androidx.exifinterface.media.ExifInterface.LONGITUDE_EAST, "Lcom/ironsource/rh;", "t", "Lcom/ironsource/rh$a;", "D", "Lcom/ironsource/pf;", "c", "Lcom/ironsource/xe;", "v", "Lcom/ironsource/sh;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "Lcom/ironsource/sh$a;", "q", "Lcom/ironsource/kf;", "d", "Lcom/ironsource/kf$a;", "x", "Lcom/ironsource/ai;", "o", "Lcom/ironsource/ai$a;", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_SS, "Lcom/ironsource/ns;", "Lkotlin/Lazy;", "X", "()Lcom/ironsource/ns;", "sessionDepthManager", "Lcom/ironsource/xa;", "L", "()Lcom/ironsource/xa;", "deviceInfoService", "Lcom/ironsource/ms;", androidx.exifinterface.media.ExifInterface.LONGITUDE_WEST, "()Lcom/ironsource/ms;", "sessionCappingService", "Lcom/ironsource/r;", "H", "()Lcom/ironsource/r;", "adFormatCappingService", "Lcom/ironsource/kp;", "R", "()Lcom/ironsource/kp;", "placementCappingServiceLegacy", "Lcom/ironsource/g8;", "J", "()Lcom/ironsource/g8;", "adUnitCappingService", "Lcom/ironsource/ip;", "Q", "()Lcom/ironsource/ip;", "placementCappingService", "Lcom/ironsource/dq;", "T", "()Lcom/ironsource/dq;", "rewardService", "Lcom/ironsource/qs;", "Y", "()Lcom/ironsource/qs;", "sessionHistoryService", "Lcom/ironsource/o0;", "I", "()Lcom/ironsource/o0;", "adInternalInfoService", "Lcom/ironsource/yg;", "P", "()Lcom/ironsource/yg;", "ironSourceNetworkConfigurationsManager", "Lcom/ironsource/hr;", "U", "()Lcom/ironsource/hr;", "sdkConfigService", "Lcom/ironsource/pc;", "O", "()Lcom/ironsource/pc;", "featureAvailabilityService", "Lcom/ironsource/j4;", "K", "()Lcom/ironsource/j4;", "applicationLifecycleService", "Lcom/ironsource/yr;", androidx.exifinterface.media.ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "()Lcom/ironsource/yr;", "sdkSessionInfoService", "Lcom/ironsource/mb;", "N", "()Lcom/ironsource/mb;", "epService", "Lcom/ironsource/bu;", "Z", "()Lcom/ironsource/bu;", "testSuiteLoadConfigService", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class im implements com.json.sf, com.json.rf {

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public static final com.json.im.Companion INSTANCE = new com.json.im.Companion(null);
    private static final kotlin.Lazy<com.json.im> s = kotlin.LazyKt.lazy(com.ironsource.im.a.f2749a);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final kotlin.Lazy sessionDepthManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final kotlin.Lazy deviceInfoService;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final kotlin.Lazy sessionCappingService;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final kotlin.Lazy adFormatCappingService;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final kotlin.Lazy placementCappingServiceLegacy;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final kotlin.Lazy adUnitCappingService;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final kotlin.Lazy placementCappingService;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final kotlin.Lazy rewardService;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final kotlin.Lazy sessionHistoryService;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final kotlin.Lazy adInternalInfoService;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final kotlin.Lazy ironSourceNetworkConfigurationsManager;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final kotlin.Lazy sdkConfigService;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    private final kotlin.Lazy featureAvailabilityService;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    private final kotlin.Lazy applicationLifecycleService;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    private final kotlin.Lazy sdkSessionInfoService;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    private final kotlin.Lazy epService;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    private final kotlin.Lazy testSuiteLoadConfigService;

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/im;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/im;"}, k = 3, mv = {1, 8, 0})
    static final class a extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.im> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.im.a f2749a = new com.ironsource.im.a();

        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.im invoke() {
            return new com.json.im(null);
        }
    }

    /* JADX INFO: renamed from: com.ironsource.im$b, reason: from kotlin metadata */
    @kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\fR\u001b\u0010\u0007\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\r\u001a\u00020\b8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0012\u001a\u00020\u000e8FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\f\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/ironsource/im$b;", "", "Lcom/ironsource/im;", "instance$delegate", "Lkotlin/Lazy;", "c", "()Lcom/ironsource/im;", com.json.j5.p, "Lcom/ironsource/sf;", "d", "()Lcom/ironsource/sf;", "getProvider$annotations", "()V", com.json.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Lcom/ironsource/rf;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/rf;", "getEditor$annotations", "editor", "<init>", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @kotlin.jvm.JvmStatic
        public static /* synthetic */ void b() {
        }

        @kotlin.jvm.JvmStatic
        public static /* synthetic */ void e() {
        }

        public final com.json.rf a() {
            return c();
        }

        public final com.json.im c() {
            return (com.json.im) com.json.im.s.getValue();
        }

        public final com.json.sf d() {
            return c();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/r;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/r;"}, k = 3, mv = {1, 8, 0})
    static final class c extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.r> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.im.c f2750a = new com.ironsource.im.c();

        c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.r invoke() {
            return new com.json.r();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/o0;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/o0;"}, k = 3, mv = {1, 8, 0})
    static final class d extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.o0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.im.d f2751a = new com.ironsource.im.d();

        d() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.o0 invoke() {
            return new com.json.o0(null, 1, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/g8;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/g8;"}, k = 3, mv = {1, 8, 0})
    static final class e extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.g8> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.im.e f2752a = new com.ironsource.im.e();

        e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.g8 invoke() {
            return new com.json.g8(null, null, null, 7, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/j4;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/j4;"}, k = 3, mv = {1, 8, 0})
    static final class f extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.j4> {
        f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.j4 invoke() {
            return new com.json.j4(com.json.im.this.O());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/xa;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/xa;"}, k = 3, mv = {1, 8, 0})
    static final class g extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.xa> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.im.g f2754a = new com.ironsource.im.g();

        g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.xa invoke() {
            return new com.json.xa();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/mb;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/mb;"}, k = 3, mv = {1, 8, 0})
    static final class h extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.mb> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.im.h f2755a = new com.ironsource.im.h();

        h() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.mb invoke() {
            return new com.json.mb();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/pc;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/pc;"}, k = 3, mv = {1, 8, 0})
    static final class i extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.pc> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.im.i f2756a = new com.ironsource.im.i();

        i() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.pc invoke() {
            return new com.json.pc();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/yg;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/yg;"}, k = 3, mv = {1, 8, 0})
    static final class j extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.yg> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.im.j f2757a = new com.ironsource.im.j();

        j() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.yg invoke() {
            return new com.json.yg();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/ip;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/ip;"}, k = 3, mv = {1, 8, 0})
    static final class k extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.ip> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.im.k f2758a = new com.ironsource.im.k();

        k() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.ip invoke() {
            return new com.json.ip(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/kp;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/kp;"}, k = 3, mv = {1, 8, 0})
    static final class l extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.kp> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.im.l f2759a = new com.ironsource.im.l();

        l() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.kp invoke() {
            return new com.json.kp();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/dq;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/dq;"}, k = 3, mv = {1, 8, 0})
    static final class m extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.dq> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.im.m f2760a = new com.ironsource.im.m();

        m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.dq invoke() {
            return new com.json.dq();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/hr;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/hr;"}, k = 3, mv = {1, 8, 0})
    static final class n extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.hr> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.im.n f2761a = new com.ironsource.im.n();

        n() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.hr invoke() {
            return new com.json.hr();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/yr;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/yr;"}, k = 3, mv = {1, 8, 0})
    static final class o extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.yr> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.im.o f2762a = new com.ironsource.im.o();

        o() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.yr invoke() {
            return new com.json.yr(new com.json.as(null, 1, 0 == true ? 1 : 0), null, null, 6, null);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/ms;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/ms;"}, k = 3, mv = {1, 8, 0})
    static final class p extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.ms> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.im.p f2763a = new com.ironsource.im.p();

        p() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.ms invoke() {
            return new com.json.ms();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/ns;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/ns;"}, k = 3, mv = {1, 8, 0})
    static final class q extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.ns> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.im.q f2764a = new com.ironsource.im.q();

        q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.ns invoke() {
            return new com.json.ns();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/qs;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/qs;"}, k = 3, mv = {1, 8, 0})
    static final class r extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.qs> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.im.r f2765a = new com.ironsource.im.r();

        r() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.qs invoke() {
            return new com.json.qs();
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/ironsource/bu;", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "()Lcom/ironsource/bu;"}, k = 3, mv = {1, 8, 0})
    static final class s extends kotlin.jvm.internal.Lambda implements kotlin.jvm.functions.Function0<com.json.bu> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.im.s f2766a = new com.ironsource.im.s();

        s() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final com.json.bu invoke() {
            return new com.json.bu();
        }
    }

    private im() {
        this.sessionDepthManager = kotlin.LazyKt.lazy(com.ironsource.im.q.f2764a);
        this.deviceInfoService = kotlin.LazyKt.lazy(com.ironsource.im.g.f2754a);
        this.sessionCappingService = kotlin.LazyKt.lazy(com.ironsource.im.p.f2763a);
        this.adFormatCappingService = kotlin.LazyKt.lazy(com.ironsource.im.c.f2750a);
        this.placementCappingServiceLegacy = kotlin.LazyKt.lazy(com.ironsource.im.l.f2759a);
        this.adUnitCappingService = kotlin.LazyKt.lazy(com.ironsource.im.e.f2752a);
        this.placementCappingService = kotlin.LazyKt.lazy(com.ironsource.im.k.f2758a);
        this.rewardService = kotlin.LazyKt.lazy(com.ironsource.im.m.f2760a);
        this.sessionHistoryService = kotlin.LazyKt.lazy(com.ironsource.im.r.f2765a);
        this.adInternalInfoService = kotlin.LazyKt.lazy(com.ironsource.im.d.f2751a);
        this.ironSourceNetworkConfigurationsManager = kotlin.LazyKt.lazy(com.ironsource.im.j.f2757a);
        this.sdkConfigService = kotlin.LazyKt.lazy(com.ironsource.im.n.f2761a);
        this.featureAvailabilityService = kotlin.LazyKt.lazy(com.ironsource.im.i.f2756a);
        this.applicationLifecycleService = kotlin.LazyKt.lazy(new com.ironsource.im.f());
        this.sdkSessionInfoService = kotlin.LazyKt.lazy(com.ironsource.im.o.f2762a);
        this.epService = kotlin.LazyKt.lazy(com.ironsource.im.h.f2755a);
        this.testSuiteLoadConfigService = kotlin.LazyKt.lazy(com.ironsource.im.s.f2766a);
    }

    public /* synthetic */ im(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final com.json.r H() {
        return (com.json.r) this.adFormatCappingService.getValue();
    }

    private final com.json.o0 I() {
        return (com.json.o0) this.adInternalInfoService.getValue();
    }

    private final com.json.g8 J() {
        return (com.json.g8) this.adUnitCappingService.getValue();
    }

    private final com.json.j4 K() {
        return (com.json.j4) this.applicationLifecycleService.getValue();
    }

    private final com.json.xa L() {
        return (com.json.xa) this.deviceInfoService.getValue();
    }

    public static final com.json.rf M() {
        return INSTANCE.a();
    }

    private final com.json.mb N() {
        return (com.json.mb) this.epService.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.json.pc O() {
        return (com.json.pc) this.featureAvailabilityService.getValue();
    }

    private final com.json.yg P() {
        return (com.json.yg) this.ironSourceNetworkConfigurationsManager.getValue();
    }

    private final com.json.ip Q() {
        return (com.json.ip) this.placementCappingService.getValue();
    }

    private final com.json.kp R() {
        return (com.json.kp) this.placementCappingServiceLegacy.getValue();
    }

    public static final com.json.sf S() {
        return INSTANCE.d();
    }

    private final com.json.dq T() {
        return (com.json.dq) this.rewardService.getValue();
    }

    private final com.json.hr U() {
        return (com.json.hr) this.sdkConfigService.getValue();
    }

    private final com.json.yr V() {
        return (com.json.yr) this.sdkSessionInfoService.getValue();
    }

    private final com.json.ms W() {
        return (com.json.ms) this.sessionCappingService.getValue();
    }

    private final com.json.ns X() {
        return (com.json.ns) this.sessionDepthManager.getValue();
    }

    private final com.json.qs Y() {
        return (com.json.qs) this.sessionHistoryService.getValue();
    }

    private final com.json.bu Z() {
        return (com.json.bu) this.testSuiteLoadConfigService.getValue();
    }

    @Override // com.json.rf
    public com.ironsource.zf.a A() {
        return T();
    }

    @Override // com.json.sf
    public com.json.wf B() {
        return R();
    }

    @Override // com.json.rf
    public com.ironsource.ve.a C() {
        return H();
    }

    @Override // com.json.rf
    public com.ironsource.rh.a D() {
        return U();
    }

    @Override // com.json.rf
    public com.ironsource.m0.a E() {
        return I();
    }

    @Override // com.json.sf
    public com.json.m0 F() {
        return I();
    }

    @Override // com.json.rf
    public com.ironsource.uf.a a() {
        return Q();
    }

    @Override // com.json.rf
    public com.json.Cif.a b() {
        return L();
    }

    @Override // com.json.sf
    public com.json.pf c() {
        return O();
    }

    @Override // com.json.sf
    public com.json.kf d() {
        return N();
    }

    @Override // com.json.rf
    public com.ironsource.vh.a e() {
        return X();
    }

    @Override // com.json.sf
    public com.json.Cif f() {
        return L();
    }

    @Override // com.json.rf
    public com.ironsource.wh.a g() {
        return Y();
    }

    @Override // com.json.sf
    public com.json.sh h() {
        return V();
    }

    @Override // com.json.rf
    public com.ironsource.uh.a i() {
        return W();
    }

    @Override // com.json.sf
    public com.json.uh j() {
        return W();
    }

    @Override // com.json.sf
    public com.json.vh k() {
        return X();
    }

    @Override // com.json.sf
    public com.json.wh l() {
        return Y();
    }

    @Override // com.json.rf
    public com.ironsource.wf.a m() {
        return R();
    }

    @Override // com.json.rf
    public com.ironsource.xg.a n() {
        return P();
    }

    @Override // com.json.sf
    public com.json.ai o() {
        return Z();
    }

    @Override // com.json.sf
    public com.json.zf p() {
        return T();
    }

    @Override // com.json.rf
    public com.ironsource.sh.a q() {
        return V();
    }

    @Override // com.json.sf
    public com.json.ve r() {
        return H();
    }

    @Override // com.json.rf
    public com.ironsource.ai.a s() {
        return Z();
    }

    @Override // com.json.sf
    public com.json.rh t() {
        return U();
    }

    @Override // com.json.sf
    public com.json.bf u() {
        return J();
    }

    @Override // com.json.sf
    public com.json.xe v() {
        return K();
    }

    @Override // com.json.rf
    public com.ironsource.bf.a w() {
        return J();
    }

    @Override // com.json.rf
    public com.ironsource.kf.a x() {
        return N();
    }

    @Override // com.json.sf
    public com.json.uf y() {
        return Q();
    }

    @Override // com.json.sf
    public com.json.xg z() {
        return P();
    }
}
