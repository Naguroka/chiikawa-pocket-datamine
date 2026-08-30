package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
/* JADX INFO: loaded from: classes4.dex */
public final class ServiceSpecificExtraArgs {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public interface CastExtraArgs {
        public static final java.lang.String LISTENER = "listener";
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public interface GamesExtraArgs {
        public static final java.lang.String DESIRED_LOCALE = "com.google.android.gms.games.key.desiredLocale";
        public static final java.lang.String GAME_PACKAGE_NAME = "com.google.android.gms.games.key.gamePackageName";
        public static final java.lang.String SIGNIN_OPTIONS = "com.google.android.gms.games.key.signInOptions";
        public static final java.lang.String WINDOW_TOKEN = "com.google.android.gms.games.key.popupWindowToken";
    }

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.6.0 */
    public interface PlusExtraArgs {
        public static final java.lang.String PLUS_AUTH_PACKAGE = "auth_package";
    }

    private ServiceSpecificExtraArgs() {
    }
}
