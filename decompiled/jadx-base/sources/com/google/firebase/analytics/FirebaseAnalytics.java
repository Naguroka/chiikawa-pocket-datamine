package com.google.firebase.analytics;

/* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class FirebaseAnalytics {
    private static volatile com.google.firebase.analytics.FirebaseAnalytics zza;
    private final com.google.android.gms.internal.measurement.zzff zzb;
    private java.util.concurrent.ExecutorService zzc;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
    public enum ConsentStatus {
        GRANTED,
        DENIED
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
    public enum ConsentType {
        AD_STORAGE,
        ANALYTICS_STORAGE,
        AD_USER_DATA,
        AD_PERSONALIZATION
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
    public static class Event {
        public static final java.lang.String ADD_PAYMENT_INFO = "add_payment_info";
        public static final java.lang.String ADD_SHIPPING_INFO = "add_shipping_info";
        public static final java.lang.String ADD_TO_CART = "add_to_cart";
        public static final java.lang.String ADD_TO_WISHLIST = "add_to_wishlist";
        public static final java.lang.String AD_IMPRESSION = "ad_impression";
        public static final java.lang.String APP_OPEN = "app_open";
        public static final java.lang.String BEGIN_CHECKOUT = "begin_checkout";
        public static final java.lang.String CAMPAIGN_DETAILS = "campaign_details";
        public static final java.lang.String EARN_VIRTUAL_CURRENCY = "earn_virtual_currency";
        public static final java.lang.String GENERATE_LEAD = "generate_lead";
        public static final java.lang.String JOIN_GROUP = "join_group";
        public static final java.lang.String LEVEL_END = "level_end";
        public static final java.lang.String LEVEL_START = "level_start";
        public static final java.lang.String LEVEL_UP = "level_up";
        public static final java.lang.String LOGIN = "login";
        public static final java.lang.String POST_SCORE = "post_score";
        public static final java.lang.String PURCHASE = "purchase";
        public static final java.lang.String REFUND = "refund";
        public static final java.lang.String REMOVE_FROM_CART = "remove_from_cart";
        public static final java.lang.String SCREEN_VIEW = "screen_view";
        public static final java.lang.String SEARCH = "search";
        public static final java.lang.String SELECT_CONTENT = "select_content";
        public static final java.lang.String SELECT_ITEM = "select_item";
        public static final java.lang.String SELECT_PROMOTION = "select_promotion";
        public static final java.lang.String SHARE = "share";
        public static final java.lang.String SIGN_UP = "sign_up";
        public static final java.lang.String SPEND_VIRTUAL_CURRENCY = "spend_virtual_currency";
        public static final java.lang.String TUTORIAL_BEGIN = "tutorial_begin";
        public static final java.lang.String TUTORIAL_COMPLETE = "tutorial_complete";
        public static final java.lang.String UNLOCK_ACHIEVEMENT = "unlock_achievement";
        public static final java.lang.String VIEW_CART = "view_cart";
        public static final java.lang.String VIEW_ITEM = "view_item";
        public static final java.lang.String VIEW_ITEM_LIST = "view_item_list";
        public static final java.lang.String VIEW_PROMOTION = "view_promotion";
        public static final java.lang.String VIEW_SEARCH_RESULTS = "view_search_results";

        protected Event() {
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
    public static class Param {
        public static final java.lang.String ACHIEVEMENT_ID = "achievement_id";
        public static final java.lang.String ACLID = "aclid";
        public static final java.lang.String AD_FORMAT = "ad_format";
        public static final java.lang.String AD_PLATFORM = "ad_platform";
        public static final java.lang.String AD_SOURCE = "ad_source";
        public static final java.lang.String AD_UNIT_NAME = "ad_unit_name";
        public static final java.lang.String AFFILIATION = "affiliation";
        public static final java.lang.String CAMPAIGN = "campaign";
        public static final java.lang.String CAMPAIGN_ID = "campaign_id";
        public static final java.lang.String CHARACTER = "character";
        public static final java.lang.String CONTENT = "content";
        public static final java.lang.String CONTENT_TYPE = "content_type";
        public static final java.lang.String COUPON = "coupon";
        public static final java.lang.String CP1 = "cp1";
        public static final java.lang.String CREATIVE_FORMAT = "creative_format";
        public static final java.lang.String CREATIVE_NAME = "creative_name";
        public static final java.lang.String CREATIVE_SLOT = "creative_slot";
        public static final java.lang.String CURRENCY = "currency";
        public static final java.lang.String DESTINATION = "destination";
        public static final java.lang.String DISCOUNT = "discount";
        public static final java.lang.String END_DATE = "end_date";
        public static final java.lang.String EXTEND_SESSION = "extend_session";
        public static final java.lang.String FLIGHT_NUMBER = "flight_number";
        public static final java.lang.String GROUP_ID = "group_id";
        public static final java.lang.String INDEX = "index";
        public static final java.lang.String ITEMS = "items";
        public static final java.lang.String ITEM_BRAND = "item_brand";
        public static final java.lang.String ITEM_CATEGORY = "item_category";
        public static final java.lang.String ITEM_CATEGORY2 = "item_category2";
        public static final java.lang.String ITEM_CATEGORY3 = "item_category3";
        public static final java.lang.String ITEM_CATEGORY4 = "item_category4";
        public static final java.lang.String ITEM_CATEGORY5 = "item_category5";
        public static final java.lang.String ITEM_ID = "item_id";
        public static final java.lang.String ITEM_LIST_ID = "item_list_id";
        public static final java.lang.String ITEM_LIST_NAME = "item_list_name";
        public static final java.lang.String ITEM_NAME = "item_name";
        public static final java.lang.String ITEM_VARIANT = "item_variant";
        public static final java.lang.String LEVEL = "level";
        public static final java.lang.String LEVEL_NAME = "level_name";
        public static final java.lang.String LOCATION = "location";
        public static final java.lang.String LOCATION_ID = "location_id";
        public static final java.lang.String MARKETING_TACTIC = "marketing_tactic";
        public static final java.lang.String MEDIUM = "medium";
        public static final java.lang.String METHOD = "method";
        public static final java.lang.String NUMBER_OF_NIGHTS = "number_of_nights";
        public static final java.lang.String NUMBER_OF_PASSENGERS = "number_of_passengers";
        public static final java.lang.String NUMBER_OF_ROOMS = "number_of_rooms";
        public static final java.lang.String ORIGIN = "origin";
        public static final java.lang.String PAYMENT_TYPE = "payment_type";
        public static final java.lang.String PRICE = "price";
        public static final java.lang.String PROMOTION_ID = "promotion_id";
        public static final java.lang.String PROMOTION_NAME = "promotion_name";
        public static final java.lang.String QUANTITY = "quantity";
        public static final java.lang.String SCORE = "score";
        public static final java.lang.String SCREEN_CLASS = "screen_class";
        public static final java.lang.String SCREEN_NAME = "screen_name";
        public static final java.lang.String SEARCH_TERM = "search_term";
        public static final java.lang.String SHIPPING = "shipping";
        public static final java.lang.String SHIPPING_TIER = "shipping_tier";
        public static final java.lang.String SOURCE = "source";
        public static final java.lang.String SOURCE_PLATFORM = "source_platform";
        public static final java.lang.String START_DATE = "start_date";
        public static final java.lang.String SUCCESS = "success";
        public static final java.lang.String TAX = "tax";
        public static final java.lang.String TERM = "term";
        public static final java.lang.String TRANSACTION_ID = "transaction_id";
        public static final java.lang.String TRAVEL_CLASS = "travel_class";
        public static final java.lang.String VALUE = "value";
        public static final java.lang.String VIRTUAL_CURRENCY_NAME = "virtual_currency_name";

        protected Param() {
        }
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-measurement-api@@22.4.0 */
    public static class UserProperty {
        public static final java.lang.String ALLOW_AD_PERSONALIZATION_SIGNALS = "allow_personalized_ads";
        public static final java.lang.String SIGN_UP_METHOD = "sign_up_method";

        protected UserProperty() {
        }
    }

    public FirebaseAnalytics(com.google.android.gms.internal.measurement.zzff zzffVar) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(zzffVar);
        this.zzb = zzffVar;
    }

    public static com.google.firebase.analytics.FirebaseAnalytics getInstance(android.content.Context context) {
        if (zza == null) {
            synchronized (com.google.firebase.analytics.FirebaseAnalytics.class) {
                if (zza == null) {
                    zza = new com.google.firebase.analytics.FirebaseAnalytics(com.google.android.gms.internal.measurement.zzff.zzg(context, null, null, null, null));
                }
            }
        }
        return zza;
    }

    public static com.google.android.gms.measurement.internal.zzlx getScionFrontendApiImplementation(android.content.Context context, android.os.Bundle bundle) {
        com.google.android.gms.internal.measurement.zzff zzffVarZzg = com.google.android.gms.internal.measurement.zzff.zzg(context, null, null, null, bundle);
        if (zzffVarZzg == null) {
            return null;
        }
        return new com.google.firebase.analytics.zzd(zzffVarZzg);
    }

    @org.checkerframework.checker.nullness.qual.EnsuresNonNull({"this.executor"})
    private final java.util.concurrent.ExecutorService zzb() {
        java.util.concurrent.ExecutorService executorService;
        synchronized (com.google.firebase.analytics.FirebaseAnalytics.class) {
            if (this.zzc == null) {
                this.zzc = new com.google.firebase.analytics.zza(this, 0, 1, 30L, java.util.concurrent.TimeUnit.SECONDS, new java.util.concurrent.ArrayBlockingQueue(100));
            }
            executorService = this.zzc;
        }
        return executorService;
    }

    public com.google.android.gms.tasks.Task<java.lang.String> getAppInstanceId() {
        try {
            return com.google.android.gms.tasks.Tasks.call(zzb(), new com.google.firebase.analytics.zzb(this));
        } catch (java.lang.RuntimeException e) {
            this.zzb.zzB(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return com.google.android.gms.tasks.Tasks.forException(e);
        }
    }

    public java.lang.String getFirebaseInstanceId() {
        try {
            return (java.lang.String) com.google.android.gms.tasks.Tasks.await(com.google.firebase.installations.FirebaseInstallations.getInstance().getId(), 30000L, java.util.concurrent.TimeUnit.MILLISECONDS);
        } catch (java.lang.InterruptedException e) {
            throw new java.lang.IllegalStateException(e);
        } catch (java.util.concurrent.ExecutionException e2) {
            throw new java.lang.IllegalStateException(e2.getCause());
        } catch (java.util.concurrent.TimeoutException unused) {
            throw new java.lang.IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    public com.google.android.gms.tasks.Task<java.lang.Long> getSessionId() {
        try {
            return com.google.android.gms.tasks.Tasks.call(zzb(), new com.google.firebase.analytics.zzc(this));
        } catch (java.lang.RuntimeException e) {
            this.zzb.zzB(5, "Failed to schedule task for getSessionId", null, null, null);
            return com.google.android.gms.tasks.Tasks.forException(e);
        }
    }

    public void logEvent(java.lang.String str, android.os.Bundle bundle) {
        this.zzb.zzy(str, bundle);
    }

    public void resetAnalyticsData() {
        this.zzb.zzD();
    }

    public void setAnalyticsCollectionEnabled(boolean z) {
        this.zzb.zzL(java.lang.Boolean.valueOf(z));
    }

    public void setConsent(java.util.Map<com.google.firebase.analytics.FirebaseAnalytics.ConsentType, com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus> map) {
        android.os.Bundle bundle = new android.os.Bundle();
        com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus consentStatus = map.get(com.google.firebase.analytics.FirebaseAnalytics.ConsentType.AD_STORAGE);
        if (consentStatus != null) {
            int iOrdinal = consentStatus.ordinal();
            if (iOrdinal == 0) {
                bundle.putString("ad_storage", "granted");
            } else if (iOrdinal == 1) {
                bundle.putString("ad_storage", "denied");
            }
        }
        com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus consentStatus2 = map.get(com.google.firebase.analytics.FirebaseAnalytics.ConsentType.ANALYTICS_STORAGE);
        if (consentStatus2 != null) {
            int iOrdinal2 = consentStatus2.ordinal();
            if (iOrdinal2 == 0) {
                bundle.putString("analytics_storage", "granted");
            } else if (iOrdinal2 == 1) {
                bundle.putString("analytics_storage", "denied");
            }
        }
        com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus consentStatus3 = map.get(com.google.firebase.analytics.FirebaseAnalytics.ConsentType.AD_USER_DATA);
        if (consentStatus3 != null) {
            int iOrdinal3 = consentStatus3.ordinal();
            if (iOrdinal3 == 0) {
                bundle.putString("ad_user_data", "granted");
            } else if (iOrdinal3 == 1) {
                bundle.putString("ad_user_data", "denied");
            }
        }
        com.google.firebase.analytics.FirebaseAnalytics.ConsentStatus consentStatus4 = map.get(com.google.firebase.analytics.FirebaseAnalytics.ConsentType.AD_PERSONALIZATION);
        if (consentStatus4 != null) {
            int iOrdinal4 = consentStatus4.ordinal();
            if (iOrdinal4 == 0) {
                bundle.putString("ad_personalization", "granted");
            } else if (iOrdinal4 == 1) {
                bundle.putString("ad_personalization", "denied");
            }
        }
        this.zzb.zzG(bundle);
    }

    @java.lang.Deprecated
    public void setCurrentScreen(android.app.Activity activity, java.lang.String str, java.lang.String str2) {
        this.zzb.zzH(com.google.android.gms.internal.measurement.zzdj.zza(activity), str, str2);
    }

    public void setDefaultEventParameters(android.os.Bundle bundle) {
        if (bundle != null) {
            bundle = new android.os.Bundle(bundle);
        }
        this.zzb.zzJ(bundle);
    }

    public void setSessionTimeoutDuration(long j) {
        this.zzb.zzM(j);
    }

    public void setUserId(java.lang.String str) {
        this.zzb.zzO(str);
    }

    public void setUserProperty(java.lang.String str, java.lang.String str2) {
        this.zzb.zzP(null, str, str2, false);
    }
}
