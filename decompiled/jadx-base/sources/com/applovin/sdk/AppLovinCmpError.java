package com.applovin.sdk;

/* JADX INFO: loaded from: classes3.dex */
public interface AppLovinCmpError {

    public enum Code {
        UNSPECIFIED(-1),
        INTEGRATION_ERROR(1),
        FORM_UNAVAILABLE(2),
        FORM_NOT_REQUIRED(3);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f1605a;

        Code(int i) {
            this.f1605a = i;
        }

        public int getValue() {
            return this.f1605a;
        }
    }

    int getCmpCode();

    java.lang.String getCmpMessage();

    com.applovin.sdk.AppLovinCmpError.Code getCode();

    java.lang.String getMessage();
}
