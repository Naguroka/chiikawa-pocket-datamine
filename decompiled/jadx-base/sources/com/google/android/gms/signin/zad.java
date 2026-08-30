package com.google.android.gms.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes5.dex */
public final class zad {
    public static final com.google.android.gms.common.api.Api.ClientKey zaa;
    public static final com.google.android.gms.common.api.Api.ClientKey zab;
    public static final com.google.android.gms.common.api.Api.AbstractClientBuilder zac;
    static final com.google.android.gms.common.api.Api.AbstractClientBuilder zad;
    public static final com.google.android.gms.common.api.Scope zae;
    public static final com.google.android.gms.common.api.Scope zaf;
    public static final com.google.android.gms.common.api.Api zag;
    public static final com.google.android.gms.common.api.Api zah;

    static {
        com.google.android.gms.common.api.Api.ClientKey clientKey = new com.google.android.gms.common.api.Api.ClientKey();
        zaa = clientKey;
        com.google.android.gms.common.api.Api.ClientKey clientKey2 = new com.google.android.gms.common.api.Api.ClientKey();
        zab = clientKey2;
        com.google.android.gms.signin.zaa zaaVar = new com.google.android.gms.signin.zaa();
        zac = zaaVar;
        com.google.android.gms.signin.zab zabVar = new com.google.android.gms.signin.zab();
        zad = zabVar;
        zae = new com.google.android.gms.common.api.Scope(com.google.android.gms.common.Scopes.PROFILE);
        zaf = new com.google.android.gms.common.api.Scope("email");
        zag = new com.google.android.gms.common.api.Api("SignIn.API", zaaVar, clientKey);
        zah = new com.google.android.gms.common.api.Api("SignIn.INTERNAL_API", zabVar, clientKey2);
    }
}
