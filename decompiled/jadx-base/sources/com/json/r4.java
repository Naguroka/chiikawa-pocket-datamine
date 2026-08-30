package com.json;

/* JADX INFO: loaded from: classes5.dex */
@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u001c\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/ironsource/r4;", "Lcom/ironsource/a2;", "Lcom/ironsource/y1;", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "", "b", "", "", "", androidx.media3.exoplayer.upstream.CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Lcom/ironsource/g5;", "Lcom/ironsource/g5;", "auctionData", "<init>", "(Lcom/ironsource/g5;)V", "mediationsdk_release"}, k = 1, mv = {1, 8, 0})
public final class r4 implements com.json.a2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final com.json.g5 auctionData;

    @kotlin.Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3234a;

        static {
            int[] iArr = new int[com.json.y1.values().length];
            try {
                iArr[com.json.y1.LOAD_AD.ordinal()] = 1;
            } catch (java.lang.NoSuchFieldError unused) {
            }
            try {
                iArr[com.json.y1.LOAD_AD_SUCCESS.ordinal()] = 2;
            } catch (java.lang.NoSuchFieldError unused2) {
            }
            try {
                iArr[com.json.y1.LOAD_AD_FAILED.ordinal()] = 3;
            } catch (java.lang.NoSuchFieldError unused3) {
            }
            try {
                iArr[com.json.y1.LOAD_AD_FAILED_WITH_REASON.ordinal()] = 4;
            } catch (java.lang.NoSuchFieldError unused4) {
            }
            try {
                iArr[com.json.y1.AUCTION_SUCCESS.ordinal()] = 5;
            } catch (java.lang.NoSuchFieldError unused5) {
            }
            try {
                iArr[com.json.y1.AUCTION_FAILED.ordinal()] = 6;
            } catch (java.lang.NoSuchFieldError unused6) {
            }
            try {
                iArr[com.json.y1.AUCTION_FAILED_NO_CANDIDATES.ordinal()] = 7;
            } catch (java.lang.NoSuchFieldError unused7) {
            }
            try {
                iArr[com.json.y1.LOAD_AD_NO_FILL.ordinal()] = 8;
            } catch (java.lang.NoSuchFieldError unused8) {
            }
            try {
                iArr[com.json.y1.AD_OPENED.ordinal()] = 9;
            } catch (java.lang.NoSuchFieldError unused9) {
            }
            try {
                iArr[com.json.y1.AD_CLOSED.ordinal()] = 10;
            } catch (java.lang.NoSuchFieldError unused10) {
            }
            try {
                iArr[com.json.y1.SHOW_AD.ordinal()] = 11;
            } catch (java.lang.NoSuchFieldError unused11) {
            }
            try {
                iArr[com.json.y1.SHOW_AD_FAILED.ordinal()] = 12;
            } catch (java.lang.NoSuchFieldError unused12) {
            }
            try {
                iArr[com.json.y1.AD_CLICKED.ordinal()] = 13;
            } catch (java.lang.NoSuchFieldError unused13) {
            }
            try {
                iArr[com.json.y1.AD_REWARDED.ordinal()] = 14;
            } catch (java.lang.NoSuchFieldError unused14) {
            }
            try {
                iArr[com.json.y1.RELOAD_AD_FAILED_WITH_REASON.ordinal()] = 15;
            } catch (java.lang.NoSuchFieldError unused15) {
            }
            try {
                iArr[com.json.y1.RELOAD_AD_SUCCESS.ordinal()] = 16;
            } catch (java.lang.NoSuchFieldError unused16) {
            }
            try {
                iArr[com.json.y1.AD_LEFT_APPLICATION.ordinal()] = 17;
            } catch (java.lang.NoSuchFieldError unused17) {
            }
            f3234a = iArr;
        }
    }

    public r4(com.json.g5 auctionData) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(auctionData, "auctionData");
        this.auctionData = auctionData;
    }

    private final boolean b(com.json.y1 event) {
        switch (com.ironsource.r4.a.f3234a[event.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                return true;
            default:
                return false;
        }
    }

    @Override // com.json.a2
    public java.util.Map<java.lang.String, java.lang.Object> a(com.json.y1 event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        java.util.HashMap map = new java.util.HashMap();
        org.json.JSONObject jSONObjectH = this.auctionData.h();
        if (jSONObjectH.length() > 0) {
            map.put("genericParams", jSONObjectH);
        }
        if (b(event)) {
            map.put(com.json.mediationsdk.utils.IronSourceConstants.AUCTION_TRIALS, java.lang.Integer.valueOf(this.auctionData.i()));
            if (!android.text.TextUtils.isEmpty(this.auctionData.f())) {
                map.put(com.json.mediationsdk.utils.IronSourceConstants.AUCTION_FALLBACK, this.auctionData.f());
            }
        }
        if (!android.text.TextUtils.isEmpty(this.auctionData.g())) {
            map.put("auctionId", this.auctionData.g());
        }
        return map;
    }
}
