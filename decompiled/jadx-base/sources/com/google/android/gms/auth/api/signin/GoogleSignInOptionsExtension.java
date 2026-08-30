package com.google.android.gms.auth.api.signin;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
@java.lang.Deprecated
public interface GoogleSignInOptionsExtension {
    public static final int FITNESS = 3;
    public static final int GAMES = 1;

    int getExtensionType();

    java.util.List<com.google.android.gms.common.api.Scope> getImpliedScopes();

    android.os.Bundle toBundle();
}
