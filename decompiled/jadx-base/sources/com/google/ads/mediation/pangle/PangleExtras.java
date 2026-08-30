package com.google.ads.mediation.pangle;

/* JADX INFO: loaded from: classes4.dex */
public class PangleExtras {

    static class Keys {
        static final java.lang.String USER_DATA = "user_data";

        Keys() {
        }
    }

    public static class Builder {
        private java.lang.String userData;

        public com.google.ads.mediation.pangle.PangleExtras.Builder setUserData(java.lang.String str) {
            this.userData = str;
            return this;
        }

        public android.os.Bundle build() {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("user_data", this.userData);
            return bundle;
        }
    }
}
