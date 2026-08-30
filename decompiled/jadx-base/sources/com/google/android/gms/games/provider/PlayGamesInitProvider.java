package com.google.android.gms.games.provider;

/* JADX INFO: compiled from: com.google.android.gms:play-services-games-v2@@17.0.0 */
/* JADX INFO: loaded from: classes4.dex */
public class PlayGamesInitProvider extends android.content.ContentProvider {
    @Override // android.content.ContentProvider
    public final void attachInfo(android.content.Context context, android.content.pm.ProviderInfo providerInfo) {
        com.google.android.gms.common.internal.Preconditions.checkNotNull(providerInfo, "PlayGamesSdkInitProvider ProviderInfo cannot be null.");
        if ("com.google.android.gms.games.playgamesinitprovider".equals(providerInfo.authority)) {
            throw new java.lang.IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final int delete(android.net.Uri uri, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public final java.lang.String getType(android.net.Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final android.net.Uri insert(android.net.Uri uri, android.content.ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        android.content.Context context = getContext();
        if (context == null) {
            com.google.android.gms.internal.games_v2.zzez.zzg("GamesInitProvider", "No Context available. Please manually invoke PlayGamesSdk.initialize().");
            return false;
        }
        com.google.android.gms.internal.games_v2.zzbr.zzc(context);
        return false;
    }

    @Override // android.content.ContentProvider
    public final android.database.Cursor query(android.net.Uri uri, java.lang.String[] strArr, java.lang.String str, java.lang.String[] strArr2, java.lang.String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(android.net.Uri uri, android.content.ContentValues contentValues, java.lang.String str, java.lang.String[] strArr) {
        return 0;
    }
}
