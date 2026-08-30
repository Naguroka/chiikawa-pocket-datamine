package com.google.android.gms.common.moduleinstall;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ModuleInstallStatusCodes extends com.google.android.gms.common.api.CommonStatusCodes {
    public static final int INSUFFICIENT_STORAGE = 46003;
    public static final int MODULE_NOT_FOUND = 46002;
    public static final int NOT_ALLOWED_MODULE = 46001;
    public static final int SUCCESS = 0;
    public static final int UNKNOWN_MODULE = 46000;

    private ModuleInstallStatusCodes() {
    }

    public static java.lang.String getStatusCodeString(int i) {
        switch (i) {
            case UNKNOWN_MODULE /* 46000 */:
                return "UNKNOWN_MODULE";
            case NOT_ALLOWED_MODULE /* 46001 */:
                return "NOT_ALLOWED_MODULE";
            case MODULE_NOT_FOUND /* 46002 */:
                return "MODULE_NOT_FOUND";
            case INSUFFICIENT_STORAGE /* 46003 */:
                return "INSUFFICIENT_STORAGE";
            default:
                return com.google.android.gms.common.api.CommonStatusCodes.getStatusCodeString(i);
        }
    }
}
