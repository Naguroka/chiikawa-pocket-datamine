package com.applovin.impl;

/* JADX INFO: loaded from: classes3.dex */
public enum fq {
    UNSPECIFIED(-1),
    RESOURCE_REJECTED(1),
    API_FRAMEWORK_OR_LANGUAGE_TYPE_NOT_SUPPORTED(2),
    FAILED_TO_LOAD_RESOURCE(3),
    XML_PARSING(100),
    GENERAL_WRAPPER_ERROR(com.google.android.gms.nearby.messages.Strategy.TTL_SECONDS_DEFAULT),
    TIMED_OUT(301),
    WRAPPER_LIMIT_REACHED(302),
    NO_WRAPPER_RESPONSE(303),
    GENERAL_LINEAR_ERROR(400),
    NO_MEDIA_FILE_PROVIDED(401),
    MEDIA_FILE_TIMEOUT(402),
    MEDIA_FILE_ERROR(405),
    GENERAL_COMPANION_AD_ERROR(600),
    UNABLE_TO_FETCH_COMPANION_AD_RESOURCE(603),
    CAN_NOT_FIND_COMPANION_AD_RESOURCE(604);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f798a;

    fq(int i) {
        this.f798a = i;
    }

    public int b() {
        return this.f798a;
    }
}
