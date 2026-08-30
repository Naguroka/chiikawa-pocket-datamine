package com.json;

/* JADX INFO: loaded from: classes5.dex */
public class x1 {
    public static int a(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) {
            return com.json.mediationsdk.logger.IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL) {
            return com.json.mediationsdk.logger.IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED;
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        return 510;
    }

    public static int b(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) {
            return 1021;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL) {
            return 1020;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER) {
            return 1019;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD) {
            return 1018;
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        return 510;
    }

    public static int c(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) {
            return com.json.mediationsdk.logger.IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL) {
            return com.json.mediationsdk.logger.IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER) {
            return 612;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD) {
            return com.json.mediationsdk.logger.IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION;
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        return 510;
    }

    public static int d(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) {
            return 1027;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL) {
            return com.json.mediationsdk.logger.IronSourceError.ERROR_IS_LOAD_DURING_SHOW;
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        return 510;
    }

    public static int e(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) {
            return 1024;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL) {
            return com.json.mediationsdk.logger.IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER) {
            return com.json.mediationsdk.logger.IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD) {
            return com.json.mediationsdk.logger.IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES;
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        return 510;
    }

    public static int f(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL || ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) {
            return com.json.mediationsdk.logger.IronSourceError.ERROR_PLACEMENT_CAPPED;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.BANNER) {
            return 604;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.NATIVE_AD) {
            return 704;
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        return 510;
    }

    public static int g(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) {
            return 1022;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL) {
            return com.json.mediationsdk.logger.IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW;
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        return 510;
    }

    public static int h(com.ironsource.mediationsdk.IronSource.AD_UNIT ad_unit) {
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.REWARDED_VIDEO) {
            return com.json.mediationsdk.logger.IronSourceError.ERROR_RV_SHOW_EXCEPTION;
        }
        if (ad_unit == com.ironsource.mediationsdk.IronSource.AD_UNIT.INTERSTITIAL) {
            return com.json.mediationsdk.logger.IronSourceError.ERROR_IS_SHOW_EXCEPTION;
        }
        com.json.mediationsdk.logger.IronLog.INTERNAL.warning("ad unit not supported - " + ad_unit);
        return 510;
    }
}
