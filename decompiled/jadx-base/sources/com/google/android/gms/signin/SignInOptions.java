package com.google.android.gms.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class SignInOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    public static final com.google.android.gms.signin.SignInOptions zaa = new com.google.android.gms.signin.SignInOptions(false, false, null, false, null, null, false, null, null);
    private final boolean zab = false;
    private final boolean zac = false;
    private final java.lang.String zad = null;
    private final boolean zae = false;
    private final boolean zah = false;
    private final java.lang.String zaf = null;
    private final java.lang.String zag = null;
    private final java.lang.Long zai = null;
    private final java.lang.Long zaj = null;

    private SignInOptions(boolean z, boolean z2, java.lang.String str, boolean z3, java.lang.String str2, java.lang.String str3, boolean z4, java.lang.Long l, java.lang.Long l2) {
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.signin.SignInOptions)) {
            return false;
        }
        com.google.android.gms.signin.SignInOptions signInOptions = (com.google.android.gms.signin.SignInOptions) obj;
        boolean z = signInOptions.zab;
        boolean z2 = signInOptions.zac;
        java.lang.String str = signInOptions.zad;
        if (com.google.android.gms.common.internal.Objects.equal(null, null)) {
            boolean z3 = signInOptions.zae;
            boolean z4 = signInOptions.zah;
            java.lang.String str2 = signInOptions.zaf;
            if (com.google.android.gms.common.internal.Objects.equal(null, null)) {
                java.lang.String str3 = signInOptions.zag;
                if (com.google.android.gms.common.internal.Objects.equal(null, null)) {
                    java.lang.Long l = signInOptions.zai;
                    if (com.google.android.gms.common.internal.Objects.equal(null, null)) {
                        java.lang.Long l2 = signInOptions.zaj;
                        if (com.google.android.gms.common.internal.Objects.equal(null, null)) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(false, false, null, false, false, null, null, null, null);
    }
}
