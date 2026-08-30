package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001:\u0004\u0003\u0004\u0005\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/ironsource/u6;", "Lcom/ironsource/hm;", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "d", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public interface u6 extends com.json.hm<java.lang.Integer, java.lang.Integer> {

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\b\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/ironsource/u6$a;", "", "", "b", "I", "INSTANCE_VISIBLE", "c", "INSTANCE_CLICKED", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.u6.a f3461a = new com.ironsource.u6.a();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int INSTANCE_VISIBLE = 3009;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final int INSTANCE_CLICKED = 3008;

        private a() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/ironsource/u6$b;", "", "", "b", "I", "INSTANCE_LOAD", "c", "INSTANCE_LOAD_SUCCESS", "d", "INSTANCE_LOAD_FAILED", "e", "INSTANCE_NOT_FOUND_IN_LOAD", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.u6.b f3462a = new com.ironsource.u6.b();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD = 3002;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_SUCCESS = 3005;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_FAILED = 3300;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public static final int INSTANCE_NOT_FOUND_IN_LOAD = 3503;

        private b() {
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/ironsource/u6$c;", "Lcom/ironsource/u6;", "", "input", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "(I)Ljava/lang/Integer;", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class c implements com.json.u6 {
        public java.lang.Integer a(int input) throws java.lang.IllegalArgumentException {
            int i;
            if (input == 206) {
                i = 3503;
            } else if (input == 405) {
                i = 3009;
            } else if (input != 406) {
                switch (input) {
                    case 101:
                        i = 83500;
                        break;
                    case 102:
                        i = 83510;
                        break;
                    case 103:
                        i = com.ironsource.u6.d.INSTANCE_AUCTION_RESPONSE_SUCCESS;
                        break;
                    case 104:
                        i = 83300;
                        break;
                    default:
                        switch (input) {
                            case 109:
                                i = 88002;
                                break;
                            case 110:
                                i = 83004;
                                break;
                            case 111:
                                break;
                            case 112:
                                i = 3305;
                                break;
                            default:
                                switch (input) {
                                    case com.ironsource.g3.c.b.b /* 201 */:
                                        i = 3002;
                                        break;
                                    case com.ironsource.g3.c.b.c /* 202 */:
                                        i = 3005;
                                        break;
                                    case com.ironsource.g3.c.b.d /* 203 */:
                                        i = 3300;
                                        break;
                                    default:
                                        throw new java.lang.IllegalArgumentException("Unknown event code: " + input);
                                }
                                break;
                        }
                    case 105:
                        i = 83302;
                        break;
                }
            } else {
                i = 3008;
            }
            return java.lang.Integer.valueOf(i);
        }

        @Override // com.json.hm
        public /* bridge */ /* synthetic */ java.lang.Integer a(java.lang.Integer num) {
            return a(num.intValue());
        }
    }

    @kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0016\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/ironsource/u6$d;", "", "", "b", "I", "INSTANCE_AUCTION_REQUEST", "c", "INSTANCE_AUCTION_REQUEST_WATERFALL", "d", "INSTANCE_AUCTION_FAILED", "e", "INSTANCE_LOAD_WITH_ADM", "f", "INSTANCE_LOAD_FAILED_INIT_IN_PROGRESS", "g", "INSTANCE_SUCCESSFUL_RECOVERY_ERROR", androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, "INSTANCE_AUCTION_RESPONSE_SUCCESS", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_INIT_SEGMENT, "INSTANCE_AUCTION_RESPONSE_WATERFALL", "j", "INSTANCE_DESTROYED", "<init>", "()V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final com.ironsource.u6.d f3463a = new com.ironsource.u6.d();

        /* JADX INFO: renamed from: b, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_REQUEST = 83500;

        /* JADX INFO: renamed from: c, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_REQUEST_WATERFALL = 83510;

        /* JADX INFO: renamed from: d, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_FAILED = 83300;

        /* JADX INFO: renamed from: e, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_WITH_ADM = 83302;

        /* JADX INFO: renamed from: f, reason: from kotlin metadata */
        public static final int INSTANCE_LOAD_FAILED_INIT_IN_PROGRESS = 83004;

        /* JADX INFO: renamed from: g, reason: from kotlin metadata */
        public static final int INSTANCE_SUCCESSFUL_RECOVERY_ERROR = 88002;

        /* JADX INFO: renamed from: h, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_RESPONSE_SUCCESS = 83301;

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public static final int INSTANCE_AUCTION_RESPONSE_WATERFALL = 83302;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public static final int INSTANCE_DESTROYED = 3305;

        private d() {
        }
    }
}
