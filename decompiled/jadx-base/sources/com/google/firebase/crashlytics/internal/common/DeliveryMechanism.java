package com.google.firebase.crashlytics.internal.common;

/* JADX INFO: loaded from: classes5.dex */
public enum DeliveryMechanism {
    DEVELOPER(1),
    USER_SIDELOAD(2),
    TEST_DISTRIBUTION(3),
    APP_STORE(4);

    private final int id;

    DeliveryMechanism(int i) {
        this.id = i;
    }

    public int getId() {
        return this.id;
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
        return java.lang.Integer.toString(this.id);
    }

    public static com.google.firebase.crashlytics.internal.common.DeliveryMechanism determineFrom(java.lang.String str) {
        return str != null ? APP_STORE : DEVELOPER;
    }
}
